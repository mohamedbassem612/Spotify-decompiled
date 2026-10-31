package p;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lgn1 implements tap1 {
    public static final byte[] g = new byte[0];
    public static final byte[] h = {0};
    public final RSAPublicKey a;
    public final String b;
    public final PSSParameterSpec c;
    public final byte[] d;
    public final byte[] e;
    public final Provider f;

    public lgn1(RSAPublicKey rSAPublicKey, udn1 udn1Var, udn1 udn1Var2, int i, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!boo1.D(2)) {
            k220.r("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        if (!udn1Var.equals(udn1Var2)) {
            k220.r("sigHash and mgf1Hash must be the same");
            throw null;
        }
        q1o1.x(rSAPublicKey.getModulus().bitLength());
        q1o1.y(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = b(udn1Var);
        this.c = c(udn1Var, udn1Var2, i);
        this.d = bArr;
        this.e = bArr2;
        this.f = provider;
    }

    public static String b(udn1 udn1Var) {
        if (udn1Var == udn1.b) {
            return "SHA256withRSA/PSS";
        }
        if (udn1Var == udn1.c) {
            return "SHA384withRSA/PSS";
        }
        if (udn1Var == udn1.d) {
            return "SHA512withRSA/PSS";
        }
        hhg1.n("Unsupported hash: ".concat(String.valueOf(udn1Var)));
        return null;
    }

    public static PSSParameterSpec c(udn1 udn1Var, udn1 udn1Var2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        udn1 udn1Var3 = udn1.d;
        udn1 udn1Var4 = udn1.c;
        udn1 udn1Var5 = udn1.b;
        if (udn1Var == udn1Var5) {
            str = "SHA-256";
        } else if (udn1Var == udn1Var4) {
            str = "SHA-384";
        } else {
            if (udn1Var != udn1Var3) {
                hhg1.n("Unsupported MD hash: ".concat(String.valueOf(udn1Var)));
                return null;
            }
            str = "SHA-512";
        }
        if (udn1Var2 == udn1Var5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (udn1Var2 == udn1Var4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (udn1Var2 != udn1Var3) {
                hhg1.n("Unsupported MGF1 hash: ".concat(String.valueOf(udn1Var2)));
                return null;
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    public static lgn1 d(ydn1 ydn1Var) throws NoSuchAlgorithmException, NoSuchProviderException {
        int i = xgp1.a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
        }
        Provider providerL = ila0.L();
        if (providerL == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerL);
        BigInteger bigInteger = ydn1Var.e;
        wdn1 wdn1Var = ydn1Var.d;
        return new lgn1((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, wdn1Var.b)), wdn1Var.d, wdn1Var.e, wdn1Var.f, ydn1Var.f.b(), wdn1Var.c != vdn1.e ? g : h, providerL);
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr3 = this.d;
        if (!xgp1.a(bArr3, bArr)) {
            k220.r("Invalid signature (output prefix mismatch)");
            return;
        }
        Signature signature = Signature.getInstance(this.b, this.f);
        signature.initVerify(this.a);
        signature.setParameter(this.c);
        signature.update(bArr2);
        byte[] bArr4 = this.e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (signature.verify(bArr, length2, length - length2)) {
            return;
        }
        k220.r("signature verification failed");
    }
}
