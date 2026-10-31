package p;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class thn1 extends uhn1 {
    public final byte[] c;
    public final int d;
    public final int e;

    public thn1(byte[] bArr, int i, int i2) {
        ain1.c(i, i + i2, bArr.length);
        this.c = bArr;
        this.d = i;
        this.e = i2;
    }

    @Override // p.uhn1
    public final boolean B(ain1 ain1Var, int i, int i2) {
        if (i2 > ain1Var.f()) {
            int length = String.valueOf(i2).length();
            int i3 = this.e;
            x4n1.d(length + 18 + String.valueOf(i3).length(), i2, i3);
            return false;
        }
        int i4 = i + i2;
        if (i4 > ain1Var.f()) {
            int iF = ain1Var.f();
            int length2 = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length2 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iF).length());
            c13.n(i, i2, "Ran off end of other: ", ", ", sb);
            hhg1.n(gvg.l(sb, ", ", iF));
            return false;
        }
        boolean z = ain1Var instanceof vhn1;
        byte[] bArr = this.c;
        int i5 = this.d;
        if (z) {
            return ain1.d(i5, i, i2, bArr, ((vhn1) ain1Var).c);
        }
        if (!(ain1Var instanceof thn1)) {
            return ain1Var.k(i, i4).equals(k(i5, i2 + i5));
        }
        thn1 thn1Var = (thn1) ain1Var;
        return ain1.d(i5, thn1Var.d + i, i2, bArr, thn1Var.c);
    }

    @Override // p.ain1
    public final byte e(int i) {
        return this.c[this.d + i];
    }

    @Override // p.ain1
    public final int f() {
        return this.e;
    }

    @Override // p.ain1
    public final ain1 i(int i, int i2) {
        int iC = ain1.c(i, i2, this.e);
        if (iC == 0) {
            return ain1.b;
        }
        return new thn1(this.c, this.d + i, iC);
    }

    @Override // p.ain1
    public final ain1 k(int i, int i2) {
        int iC = ain1.c(i, i2, this.e);
        if (iC == 0) {
            return ain1.b;
        }
        return new thn1(this.c, this.d + i, iC);
    }

    @Override // p.ain1
    public final void l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, this.d + i, bArr, i2, i3);
    }

    @Override // p.ain1
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.c, this.d, this.e).asReadOnlyBuffer();
    }

    @Override // p.ain1
    public final void n(w4c0 w4c0Var) {
        w4c0Var.o0(this.d, this.c, this.e);
    }

    @Override // p.ain1
    public final String o() {
        Charset charset = StandardCharsets.UTF_8;
        return new String(this.c, this.d, this.e, charset);
    }

    @Override // p.ain1
    public final boolean p(ain1 ain1Var) {
        return ((ain1Var instanceof vhn1) || (ain1Var instanceof thn1)) ? B(ain1Var, 0, this.e) : ain1Var.p(this);
    }

    @Override // p.ain1
    public final int r(int i, int i2, int i3) {
        return xin1.b(i, this.c, this.d + i2, i3);
    }

    @Override // p.ain1
    public final din1 s() {
        return din1.c(this.d, this.c, this.e);
    }
}
