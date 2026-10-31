package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cun1 extends xtn1 {
    public final byte[] c;

    public cun1(byte[] bArr) {
        this.c = bArr;
    }

    public final byte b(int i) {
        return this.c[i];
    }

    public final int c() {
        return this.c.length;
    }

    public final xtn1 d(int i, int i2) {
        byte[] bArr = this.c;
        int iN = gun1.n(0, i2, bArr.length);
        return iN == 0 ? gun1.b : new ptn1(bArr, 0, iN);
    }

    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.c, 0, bArr, 0, i);
    }

    public final void f(vun1 vun1Var) {
        byte[] bArr = this.c;
        vun1Var.p(0, bArr, bArr.length);
    }

    public final boolean i(gun1 gun1Var) {
        boolean z = gun1Var instanceof cun1;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((cun1) gun1Var).c);
        }
        boolean z2 = gun1Var instanceof ptn1;
        if (!z2) {
            return gun1Var.i(this);
        }
        ptn1 ptn1Var = (ptn1) gun1Var;
        int i = ptn1Var.e;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length > i) {
            x4n1.h(String.valueOf(length).length() + 27 + String.valueOf(i).length(), "Ran off end of other: 0, ", length, ", ", i);
            return false;
        }
        if (z) {
            return gun1.o(0, 0, length, bArr, ((cun1) gun1Var).c);
        }
        if (!z2) {
            return gun1Var.d(0, length).equals(d(0, length));
        }
        return gun1.o(0, ptn1Var.d, length, bArr, ptn1Var.c);
    }

    public final int k(int i, int i2) {
        return h0o1.b(i, this.c, 0, i2);
    }
}
