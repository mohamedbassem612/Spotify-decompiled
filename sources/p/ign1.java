package p;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ign1 implements qap1 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public static final byte[] i = {1, 2, 3};
    public final RSAPrivateCrtKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final tap1 e;
    public final Provider f;

    public ign1(RSAPrivateCrtKey rSAPrivateCrtKey, gdn1 gdn1Var, byte[] bArr, byte[] bArr2, tap1 tap1Var, Provider provider) throws GeneralSecurityException {
        if (!boo1.D(2)) {
            k220.r("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (gdn1Var != gdn1.b && gdn1Var != gdn1.c && gdn1Var != gdn1.d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(gdn1Var)));
        }
        q1o1.x(rSAPrivateCrtKey.getModulus().bitLength());
        q1o1.y(rSAPrivateCrtKey.getPublicExponent());
        this.a = rSAPrivateCrtKey;
        this.b = jgn1.b(gdn1Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = tap1Var;
        this.f = provider;
    }

    public static ign1 a(odn1 odn1Var) throws SignatureException, InvalidKeyException {
        int i2 = xgp1.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
        }
        Provider providerL = ila0.L();
        KeyFactory keyFactory = providerL != null ? KeyFactory.getInstance("RSA", providerL) : (KeyFactory) ygn1.d.a.zza("RSA");
        pdn1 pdn1Var = odn1Var.d;
        ign1 ign1Var = new ign1((RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(pdn1Var.e, pdn1Var.d.b, (BigInteger) odn1Var.e.b, (BigInteger) odn1Var.f.b, (BigInteger) odn1Var.g.b, (BigInteger) odn1Var.h.b, (BigInteger) odn1Var.i.b, (BigInteger) odn1Var.j.b)), pdn1Var.d.d, pdn1Var.f.b(), pdn1Var.d.c != hdn1.e ? g : h, providerL != null ? jgn1.c(pdn1Var, providerL) : ihn1.b(pdn1Var), providerL);
        Provider provider = ign1Var.f;
        String str = ign1Var.b;
        Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) ygn1.b.a.zza(str);
        signature.initSign(ign1Var.a);
        byte[] bArr = i;
        signature.update(bArr);
        byte[] bArr2 = ign1Var.d;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] bArrSign = signature.sign();
        byte[] bArr3 = ign1Var.c;
        if (bArr3.length > 0) {
            bArrSign = z0o1.x(new byte[][]{bArr3, bArrSign});
        }
        try {
            ign1Var.e.a(bArrSign, bArr);
            return ign1Var;
        } catch (GeneralSecurityException e) {
            k220.p("RSA signature computation error", e);
            return null;
        }
    }
}
