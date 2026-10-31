package p;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ca2 implements tot {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final dzp0 a;
    public final byte[] b;

    public ca2(byte[] bArr) throws InvalidKeyException {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(gvg.j(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new dzp0(bArrCopyOfRange);
    }

    @Override // p.tot
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            k220.r("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) k8y.e.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return ila0.n(new byte[][]{bArrC, cipher.doFinal(bArr)});
    }

    @Override // p.tot
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            k220.r("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) k8y.e.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && oqo1.m()) {
            bArrDoFinal = new byte[0];
        }
        if (ila0.q(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArrJ;
        int length = bArr.length;
        dzp0 dzp0Var = this.a;
        if (length == 0) {
            return dzp0Var.a(e, 16);
        }
        byte[] bArrA = dzp0Var.a(d, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = ila0.J(cwl1.t(bArrA), dzp0Var.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                hhg1.n("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrA.length;
            bArrJ = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrA.length; i2++) {
                int i3 = length2 + i2;
                bArrJ[i3] = (byte) (bArrJ[i3] ^ bArrA[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                hhg1.n("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrJ = ila0.J(bArrCopyOf, cwl1.t(bArrA));
        }
        return dzp0Var.a(bArrJ, 16);
    }
}
