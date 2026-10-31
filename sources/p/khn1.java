package p;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class khn1 implements tap1 {
    public final RSAPublicKey a;
    public final ahn1 b;
    public final ahn1 c;
    public final int d;
    public final byte[] e;
    public final byte[] f;

    public /* synthetic */ khn1(RSAPublicKey rSAPublicKey, ahn1 ahn1Var, ahn1 ahn1Var2, int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (nbp1.a()) {
            k220.r("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        q1o1.w(ahn1Var);
        if (!ahn1Var.equals(ahn1Var2)) {
            k220.r("sigHash and mgf1Hash must be the same");
            throw null;
        }
        q1o1.x(rSAPublicKey.getModulus().bitLength());
        q1o1.y(rSAPublicKey.getPublicExponent());
        this.a = rSAPublicKey;
        this.b = ahn1Var;
        this.c = ahn1Var2;
        this.d = i;
        this.e = bArr;
        this.f = bArr2;
    }

    @Override // p.tap1
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.e;
        int length = bArr3.length;
        if (length == 0) {
            b(bArr, bArr2);
        } else if (xgp1.a(bArr3, bArr)) {
            b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        } else {
            k220.r("Invalid signature (output prefix mismatch)");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            k220.r("invalid signature's length");
            return;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            k220.r("signature out of range");
            return;
        }
        byte[] bArrY = yoi1.Y(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        ahn1 ahn1Var = this.b;
        q1o1.w(ahn1Var);
        ygn1 ygn1Var = ygn1.c;
        MessageDigest messageDigest = (MessageDigest) ygn1Var.a.zza(k1o1.z(ahn1Var));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrY.length;
        int i = this.d;
        if (length < digestLength + i + 2) {
            k220.r("inconsistent");
            return;
        }
        if (bArrY[length - 1] != -68) {
            k220.r("inconsistent");
            return;
        }
        int i2 = length - digestLength;
        int i3 = i2 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrY, i3);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrY, length2, length2 + digestLength);
        int i4 = 0;
        while (true) {
            long j = (((long) length) * 8) - ((long) iBitLength3);
            if (i4 < j) {
                if (((bArrCopyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) != 0) {
                    k220.r("inconsistent");
                    return;
                }
                i4++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) ygn1Var.a.zza(k1o1.z(this.c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i3];
                int i5 = 0;
                int i6 = 0;
                while (i5 <= (i2 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    messageDigest2.update(yoi1.Y(BigInteger.valueOf(i5), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i6, Math.min(length3, i3 - i6));
                    i6 += length3;
                    i5++;
                    messageDigest2 = messageDigest2;
                }
                byte[] bArr5 = new byte[i3];
                for (int i7 = 0; i7 < i3; i7++) {
                    bArr5[i7] = (byte) (bArr4[i7] ^ bArrCopyOf[i7]);
                }
                for (int i8 = 0; i8 <= j; i8++) {
                    int i9 = i8 / 8;
                    bArr5[i9] = (byte) ((~(1 << (7 - (i8 % 8)))) & bArr5[i9]);
                }
                int i10 = 0;
                while (true) {
                    int i11 = (i2 - i) - 2;
                    if (i10 >= i11) {
                        if (bArr5[i11] != 1) {
                            k220.r("inconsistent");
                            return;
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i3 - i, i3);
                        int i12 = digestLength + 8;
                        byte[] bArr6 = new byte[i + i12];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i12, bArrCopyOfRange2.length);
                        if (MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            return;
                        }
                        k220.r("inconsistent");
                        return;
                    }
                    if (bArr5[i10] != 0) {
                        k220.r("inconsistent");
                        return;
                    }
                    i10++;
                }
            }
        }
    }
}
