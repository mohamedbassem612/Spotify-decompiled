package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r5o1 extends n5o1 {
    public final byte[] c;

    public r5o1(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // p.n5o1
    public final byte b(int i) {
        return this.c[i];
    }

    @Override // p.n5o1
    public final byte c(int i) {
        return this.c[i];
    }

    @Override // p.n5o1
    public final int d(int i, int i2) {
        return wbo1.a(i, this.c, 0, i2);
    }

    @Override // p.n5o1
    public final int e() {
        return this.c.length;
    }

    @Override // p.n5o1
    public final n5o1 f(int i, int i2) {
        byte[] bArr = this.c;
        int iL = n5o1.l(0, i2, bArr.length);
        return iL == 0 ? n5o1.b : new b5o1(bArr, 0, iL);
    }

    @Override // p.n5o1
    public final void i(x6o1 x6o1Var) {
        byte[] bArr = this.c;
        x6o1Var.b(bArr, 0, bArr.length);
    }

    @Override // p.n5o1
    public final boolean k(n5o1 n5o1Var) {
        boolean z = n5o1Var instanceof r5o1;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((r5o1) n5o1Var).c);
        }
        boolean z2 = n5o1Var instanceof b5o1;
        if (!z2) {
            return n5o1Var.k(this);
        }
        b5o1 b5o1Var = (b5o1) n5o1Var;
        int i = b5o1Var.e;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            hhg1.n(cy30.i(length, "Ran off end of other: 0, ", i, ", "));
            return false;
        }
        if (z) {
            return n5o1.n(0, 0, length, bArr, ((r5o1) n5o1Var).c);
        }
        if (!z2) {
            return n5o1Var.f(0, length).equals(f(0, length));
        }
        return n5o1.n(0, b5o1Var.d, length, bArr, b5o1Var.c);
    }
}
