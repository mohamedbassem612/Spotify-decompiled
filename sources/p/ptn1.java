package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ptn1 extends xtn1 {
    public final byte[] c;
    public final int d;
    public final int e;

    public ptn1(byte[] bArr, int i, int i2) {
        gun1.n(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    public final byte b(int i) {
        return this.c[this.d + i];
    }

    public final int c() {
        return this.e;
    }

    public final xtn1 d(int i, int i2) {
        int iN = gun1.n(i, i2, this.e);
        if (iN == 0) {
            return gun1.b;
        }
        return new ptn1(this.c, this.d + i, iN);
    }

    public final void e(byte[] bArr, int i) {
        System.arraycopy(this.c, this.d, bArr, 0, i);
    }

    public final void f(vun1 vun1Var) {
        vun1Var.p(this.d, this.c, this.e);
    }

    public final boolean i(gun1 gun1Var) {
        boolean z = gun1Var instanceof cun1;
        if (!z && !(gun1Var instanceof ptn1)) {
            return gun1Var.i(this);
        }
        int iC = gun1Var.c();
        int i = this.e;
        if (i > iC) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > gun1Var.c()) {
            int iC2 = gun1Var.c();
            x4n1.h(String.valueOf(i).length() + 27 + String.valueOf(iC2).length(), "Ran off end of other: 0, ", i, ", ", iC2);
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return gun1.o(i2, 0, i, bArr, ((cun1) gun1Var).c);
        }
        if (!(gun1Var instanceof ptn1)) {
            return gun1Var.d(0, i).equals(d(i2, i + i2));
        }
        ptn1 ptn1Var = (ptn1) gun1Var;
        return gun1.o(i2, ptn1Var.d, i, bArr, ptn1Var.c);
    }

    public final int k(int i, int i2) {
        return h0o1.b(i, this.c, this.d, i2);
    }
}
