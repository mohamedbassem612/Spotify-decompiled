package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class agn1 implements tap1 {
    public static final byte[] f = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};
    public final /* synthetic */ byte a = 1;
    public final byte[] b;
    public final byte[] c;
    public final PublicKey d;
    public final Serializable e;

    public agn1(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) {
        if (!boo1.D(1)) {
            k220.r("Can not use Ed25519 in FIPS-mode.");
            throw null;
        }
        if (bArr.length != 32) {
            hhg1.n("Given public key's length is not 32.");
            throw null;
        }
        this.d = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(z0o1.x(new byte[][]{f, bArr})));
        this.b = bArr2;
        this.c = bArr3;
        this.e = provider;
    }

    public static agn1 b(kcn1 kcn1Var) throws NoSuchProviderException {
        Provider providerL = ila0.L();
        if (providerL == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (boo1.D(1)) {
            return new agn1(kcn1Var.e.b(), kcn1Var.f.b(), kcn1Var.d.a != acn1.e ? new byte[0] : new byte[]{0}, providerL);
        }
        k220.r("Can not use Ed25519 in FIPS-mode.");
        return null;
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte b = this.a;
        byte[] bArr3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int length = bArr3.length;
                if (bArr.length != length + 64) {
                    k220.r("Invalid signature length: 64");
                } else if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                } else {
                    Signature signature = Signature.getInstance("Ed25519", (Provider) this.e);
                    signature.initVerify(this.d);
                    signature.update(bArr2);
                    signature.update(this.c);
                    try {
                        if (signature.verify(bArr, length, 64)) {
                        }
                    } catch (RuntimeException unused) {
                    }
                    k220.r("Signature check failed.");
                }
                break;
            default:
                int length2 = bArr3.length;
                if (length2 == 0) {
                    c(bArr, bArr2);
                } else if (!xgp1.a(bArr3, bArr)) {
                    k220.r("Invalid signature (output prefix mismatch)");
                } else {
                    c(Arrays.copyOfRange(bArr, length2, bArr.length), bArr2);
                }
                break;
        }
    }

    public void c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrJ;
        int i;
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.d;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            k220.r("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            k220.r("signature out of range");
            return;
        }
        byte[] bArrY = yoi1.Y(bigInteger.modPow(publicExponent, modulus), iBitLength);
        ahn1 ahn1Var = (ahn1) this.e;
        q1o1.w(ahn1Var);
        MessageDigest messageDigest = (MessageDigest) ygn1.c.a.zza(k1o1.z(ahn1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.c;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = ahn1Var.ordinal();
        int i2 = 2;
        if (iOrdinal == 2) {
            bArrJ = i1o1.J("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrJ = i1o1.J("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(ahn1Var.toString()));
            }
            bArrJ = i1o1.J("3051300d060960864801650304020305000440");
        }
        int length = bArrDigest.length;
        int i3 = length + 19;
        if (iBitLength < length + 30) {
            k220.r("intended encoded message length too short");
            return;
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i4 = 0;
        while (true) {
            i = i2 + 1;
            if (i4 >= (iBitLength - i3) - 3) {
                break;
            }
            bArr4[i2] = -1;
            i4++;
            i2 = i;
        }
        bArr4[i2] = 0;
        System.arraycopy(bArrJ, 0, bArr4, i, 19);
        System.arraycopy(bArrDigest, 0, bArr4, i2 + 20, bArrDigest.length);
        if (MessageDigest.isEqual(bArrY, bArr4)) {
            return;
        }
        k220.r("invalid signature");
    }

    public /* synthetic */ agn1(RSAPublicKey rSAPublicKey, ahn1 ahn1Var, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!nbp1.a()) {
            q1o1.w(ahn1Var);
            q1o1.x(rSAPublicKey.getModulus().bitLength());
            q1o1.y(rSAPublicKey.getPublicExponent());
            this.d = rSAPublicKey;
            this.e = ahn1Var;
            this.b = bArr;
            this.c = bArr2;
            return;
        }
        k220.r("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        throw null;
    }
}
