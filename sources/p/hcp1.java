package p;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hcp1 {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final qbp1[][] d;
    public static final qbp1[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        frl1 frl1Var = new frl1((byte) 24);
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        frl1Var.c = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        frl1Var.b = bigIntegerModPow2;
        a = zqo1.B(b(bigIntegerMod));
        b = zqo1.B(b(bigIntegerMod2));
        c = zqo1.B(b(bigIntegerModPow));
        d = (qbp1[][]) Array.newInstance((Class<?>) qbp1.class, 32, 8);
        frl1 frl1VarA = frl1Var;
        for (int i = 0; i < 32; i++) {
            frl1 frl1VarA2 = frl1VarA;
            for (int i2 = 0; i2 < 8; i2++) {
                d[i][i2] = c(frl1VarA2);
                frl1VarA2 = a(frl1VarA2, frl1VarA);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                frl1VarA = a(frl1VarA, frl1VarA);
            }
        }
        frl1 frl1VarA3 = a(frl1Var, frl1Var);
        e = new qbp1[8];
        for (int i4 = 0; i4 < 8; i4++) {
            e[i4] = c(frl1Var);
            frl1Var = a(frl1Var, frl1VarA3);
        }
    }

    public static frl1 a(frl1 frl1Var, frl1 frl1Var2) {
        frl1 frl1Var3 = new frl1((byte) 24);
        BigInteger bigIntegerMultiply = g.multiply(((BigInteger) frl1Var.b).multiply((BigInteger) frl1Var2.b).multiply((BigInteger) frl1Var.c).multiply((BigInteger) frl1Var2.c));
        BigInteger bigInteger = f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = ((BigInteger) frl1Var.b).multiply((BigInteger) frl1Var2.c).add(((BigInteger) frl1Var2.b).multiply((BigInteger) frl1Var.c));
        BigInteger bigInteger2 = BigInteger.ONE;
        frl1Var3.b = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        frl1Var3.c = ((BigInteger) frl1Var.c).multiply((BigInteger) frl1Var2.c).add(((BigInteger) frl1Var.b).multiply((BigInteger) frl1Var2.b)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return frl1Var3;
    }

    public static byte[] b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b2 = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static qbp1 c(frl1 frl1Var) {
        BigInteger bigIntegerAdd = ((BigInteger) frl1Var.c).add((BigInteger) frl1Var.b);
        BigInteger bigInteger = f;
        return new qbp1(zqo1.B(b(bigIntegerAdd.mod(bigInteger))), zqo1.B(b(((BigInteger) frl1Var.c).subtract((BigInteger) frl1Var.b).mod(bigInteger))), zqo1.B(b(h.multiply((BigInteger) frl1Var.b).multiply((BigInteger) frl1Var.c).mod(bigInteger))));
    }
}
