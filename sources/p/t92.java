package p;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t92 implements s82 {
    public static final i92 b = new i92((byte) 3);
    public final SecretKeySpec a;

    public t92(byte[] bArr) throws InvalidAlgorithmParameterException {
        gsi1.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    @Override // p.s82
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            k220.r("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = eqz0.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        int length = bArrA.length;
        AlgorithmParameterSpec gCMParameterSpec = (!oqo1.m() || oqo1.h() > 19) ? new GCMParameterSpec(128, bArrA, 0, length) : new IvParameterSpec(bArrA, 0, length);
        i92 i92Var = b;
        ((Cipher) i92Var.get()).init(1, this.a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) i92Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) i92Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(gvg.e(iDoFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
    }

    @Override // p.s82
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            k220.r("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec gCMParameterSpec = (!oqo1.m() || oqo1.h() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
        i92 i92Var = b;
        ((Cipher) i92Var.get()).init(2, this.a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) i92Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) i92Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
