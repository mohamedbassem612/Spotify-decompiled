package p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jgn1 implements tap1 {
    public static final byte[] f = new byte[0];
    public static final byte[] g = {0};
    public final RSAPublicKey a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final Provider e;

    public jgn1(RSAPublicKey rSAPublicKey, gdn1 gdn1Var, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!boo1.D(2)) {
            k220.r("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        q1o1.x(rSAPublicKey.getModulus().bitLength());
        q1o1.y(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = b(gdn1Var);
        this.c = bArr;
        this.d = bArr2;
        this.e = provider;
    }

    public static String b(gdn1 gdn1Var) {
        if (gdn1Var == gdn1.b) {
            return "SHA256withRSA";
        }
        if (gdn1Var == gdn1.c) {
            return "SHA384withRSA";
        }
        if (gdn1Var == gdn1.d) {
            return "SHA512withRSA";
        }
        k220.r("unknown hash type");
        return null;
    }

    public static jgn1 c(pdn1 pdn1Var, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = pdn1Var.e;
        idn1 idn1Var = pdn1Var.d;
        return new jgn1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, idn1Var.b)), idn1Var.d, pdn1Var.f.b(), idn1Var.c != hdn1.e ? f : g, provider);
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        byte[] bArr3 = this.c;
        if (!xgp1.a(bArr3, bArr)) {
            k220.r("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.e);
        signature.initVerify(this.a);
        signature.update(bArr2);
        byte[] bArr4 = this.d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        k220.r("Invalid signature");
    }
}
