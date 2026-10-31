package p;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vhn1 extends uhn1 {
    public final byte[] c;

    public vhn1(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // p.uhn1
    public final boolean B(ain1 ain1Var, int i, int i2) {
        int iF = ain1Var.f();
        byte[] bArr = this.c;
        if (i2 > iF) {
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            x4n1.d(length + 18 + String.valueOf(length2).length(), i2, length2);
            return false;
        }
        int i3 = i + i2;
        if (i3 <= ain1Var.f()) {
            if (ain1Var instanceof vhn1) {
                return ain1.d(0, i, i2, bArr, ((vhn1) ain1Var).c);
            }
            if (!(ain1Var instanceof thn1)) {
                return ain1Var.k(i, i3).equals(k(0, i2));
            }
            thn1 thn1Var = (thn1) ain1Var;
            return ain1.d(0, thn1Var.d + i, i2, bArr, thn1Var.c);
        }
        int iF2 = ain1Var.f();
        int length3 = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(iF2).length());
        c13.n(i, i2, "Ran off end of other: ", ", ", sb);
        hhg1.n(gvg.l(sb, ", ", iF2));
        return false;
    }

    @Override // p.ain1
    public final byte e(int i) {
        return this.c[i];
    }

    @Override // p.ain1
    public final int f() {
        return this.c.length;
    }

    @Override // p.ain1
    public final ain1 i(int i, int i2) {
        byte[] bArr = this.c;
        int iC = ain1.c(i, i2, bArr.length);
        return iC == 0 ? ain1.b : new thn1(bArr, i, iC);
    }

    @Override // p.ain1
    public final ain1 k(int i, int i2) {
        byte[] bArr = this.c;
        int iC = ain1.c(i, i2, bArr.length);
        return iC == 0 ? ain1.b : new thn1(bArr, i, iC);
    }

    @Override // p.ain1
    public final void l(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.c, i, bArr, i2, i3);
    }

    @Override // p.ain1
    public final ByteBuffer m() {
        return ByteBuffer.wrap(this.c).asReadOnlyBuffer();
    }

    @Override // p.ain1
    public final void n(w4c0 w4c0Var) {
        byte[] bArr = this.c;
        w4c0Var.o0(0, bArr, bArr.length);
    }

    @Override // p.ain1
    public final String o() {
        return new String(this.c, StandardCharsets.UTF_8);
    }

    @Override // p.ain1
    public final boolean p(ain1 ain1Var) {
        boolean z = ain1Var instanceof vhn1;
        byte[] bArr = this.c;
        if (z) {
            return Arrays.equals(bArr, ((vhn1) ain1Var).c);
        }
        return ain1Var instanceof thn1 ? B(ain1Var, 0, bArr.length) : ain1Var.p(this);
    }

    @Override // p.ain1
    public final int r(int i, int i2, int i3) {
        return xin1.b(i, this.c, i2, i3);
    }

    @Override // p.ain1
    public final din1 s() {
        byte[] bArr = this.c;
        return din1.c(0, bArr, bArr.length);
    }
}
