package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b5o1 extends n5o1 {
    public final byte[] c;
    public final int d;
    public final int e;

    public b5o1(byte[] bArr, int i, int i2) {
        n5o1.l(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // p.n5o1
    public final byte b(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.c[this.d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(f4i1.c(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(cy30.i(i, "Index > length: ", i2, ", "));
    }

    @Override // p.n5o1
    public final byte c(int i) {
        return this.c[this.d + i];
    }

    @Override // p.n5o1
    public final int d(int i, int i2) {
        return wbo1.a(i, this.c, this.d, i2);
    }

    @Override // p.n5o1
    public final int e() {
        return this.e;
    }

    @Override // p.n5o1
    public final n5o1 f(int i, int i2) {
        int iL = n5o1.l(i, i2, this.e);
        if (iL == 0) {
            return n5o1.b;
        }
        return new b5o1(this.c, this.d + i, iL);
    }

    @Override // p.n5o1
    public final void i(x6o1 x6o1Var) {
        x6o1Var.b(this.c, this.d, this.e);
    }

    @Override // p.n5o1
    public final boolean k(n5o1 n5o1Var) {
        boolean z = n5o1Var instanceof r5o1;
        if (!z && !(n5o1Var instanceof b5o1)) {
            return n5o1Var.k(this);
        }
        int iE = n5o1Var.e();
        int i = this.e;
        if (i > iE) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > n5o1Var.e()) {
            hhg1.n(cy30.i(i, "Ran off end of other: 0, ", n5o1Var.e(), ", "));
            return false;
        }
        byte[] bArr = this.c;
        int i2 = this.d;
        if (z) {
            return n5o1.n(i2, 0, i, bArr, ((r5o1) n5o1Var).c);
        }
        if (!(n5o1Var instanceof b5o1)) {
            return n5o1Var.f(0, i).equals(f(i2, i + i2));
        }
        b5o1 b5o1Var = (b5o1) n5o1Var;
        return n5o1.n(i2, b5o1Var.d, i, bArr, b5o1Var.c);
    }
}
