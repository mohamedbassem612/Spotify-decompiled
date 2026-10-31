package p;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y92 implements s82 {
    public static final i92 b = new i92((byte) 4);
    public final SecretKeySpec a;

    public y92(byte[] bArr) {
        gsi1.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr, int i) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (oqo1.m()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            k220.r("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            k220.r("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = eqz0.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA, bArrA.length);
        i92 i92Var = b;
        ((Cipher) i92Var.get()).init(1, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) i92Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) i92Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(gvg.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length < 28) {
            k220.r("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArr, 12);
        i92 i92Var = b;
        ((Cipher) i92Var.get()).init(2, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) i92Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) i92Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
