package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k4w {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public k4w(af5 af5Var, long j) {
        this.a = (byte) 0;
        String str = af5Var.b;
        w4c0 w4c0Var = new w4c0((byte) 4);
        w4c0Var.d = str;
        w4c0Var.b = -1;
        w4c0Var.c = -1;
        this.f = w4c0Var;
        this.b = nbe1.g(j);
        this.c = nbe1.f(j);
        this.d = -1;
        this.e = -1;
        int iG = nbe1.g(j);
        int iF = nbe1.f(j);
        if (iG < 0 || iG > str.length()) {
            eg.g(cy30.i(iG, "start (", str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iF < 0 || iF > str.length()) {
            eg.g(cy30.i(iF, "end (", str.length(), ") offset is outside of text region "));
            throw null;
        }
        if (iG <= iF) {
            return;
        }
        hhg1.n(cy30.i(iG, "Do not set reversed range: ", iF, " > "));
        throw null;
    }

    public void A(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.d) {
                a();
                return;
            } else if (y(i2)) {
                this.d++;
                i2 += 2;
            }
        }
    }

    public void a() {
        int i;
        int i2 = this.d;
        dm5.y(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0)));
    }

    public boolean b(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.b) {
                break;
            }
            if (y(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean c() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.b && !o()) {
            i3++;
        }
        boolean z = this.d == this.b;
        this.d = i;
        this.e = i2;
        return !z && b((i3 * 2) + 1);
    }

    public void d() {
        this.d = -1;
        this.e = -1;
    }

    public void e(int i, int i2) {
        long jE = e6p1.e(i, i2);
        ((w4c0) this.f).G(i, i2, "");
        long jF = u890.F(e6p1.e(this.b, this.c), jE);
        x(nbe1.g(jF));
        w(nbe1.f(jF));
        if (n()) {
            long jF2 = u890.F(e6p1.e(this.d, this.e), jE);
            if (nbe1.d(jF2)) {
                d();
            } else {
                this.d = nbe1.g(jF2);
                this.e = nbe1.f(jF2);
            }
        }
    }

    public char f(int i) {
        w4c0 w4c0Var = (w4c0) this.f;
        t340 t340Var = (t340) w4c0Var.e;
        if (t340Var == null) {
            return ((String) w4c0Var.d).charAt(i);
        }
        if (i < w4c0Var.b) {
            return ((String) w4c0Var.d).charAt(i);
        }
        int iA = t340Var.b - t340Var.a();
        int i2 = w4c0Var.b;
        if (i >= iA + i2) {
            return ((String) w4c0Var.d).charAt(i - ((iA - w4c0Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = t340Var.d;
        char[] cArr = t340Var.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + t340Var.e];
    }

    public nbe1 g() {
        if (n()) {
            return new nbe1(e6p1.e(this.d, this.e));
        }
        return null;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.d;
    }

    public int j() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public int k() {
        return ((w4c0) this.f).p();
    }

    public int l() {
        return this.c;
    }

    public int m() {
        return this.b;
    }

    public boolean n() {
        return this.d != -1;
    }

    public boolean o() {
        boolean z = (((byte[]) this.f)[this.d] & (SemanticState.Focused >> this.e)) != 0;
        z();
        return z;
    }

    public int p(int i) {
        int i2;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            byte[] bArr = (byte[]) this.f;
            int i6 = this.d;
            i3 |= (bArr[i6] & 255) << i5;
            if (!y(i6 + 1)) {
                i4 = 1;
            }
            this.d = i6 + i4;
        }
        byte[] bArr2 = (byte[]) this.f;
        int i7 = this.d;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            this.d = i7 + (y(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public int q() {
        int i = 0;
        while (!o()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? p(i) : 0);
    }

    public int r() {
        int iQ = q();
        return ((iQ + 1) / 2) * (iQ % 2 == 0 ? -1 : 1);
    }

    public void s(int i, int i2, String str) {
        w4c0 w4c0Var = (w4c0) this.f;
        if (i < 0 || i > w4c0Var.p()) {
            eg.g(cy30.i(i, "start (", w4c0Var.p(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > w4c0Var.p()) {
            eg.g(cy30.i(i2, "end (", w4c0Var.p(), ") offset is outside of text region "));
            return;
        }
        if (i > i2) {
            hhg1.n(cy30.i(i, "Do not set reversed range: ", i2, " > "));
            return;
        }
        w4c0Var.G(i, i2, str);
        x(str.length() + i);
        w(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public void t(int i, int i2) {
        w4c0 w4c0Var = (w4c0) this.f;
        if (i < 0 || i > w4c0Var.p()) {
            eg.g(cy30.i(i, "start (", w4c0Var.p(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > w4c0Var.p()) {
            eg.g(cy30.i(i2, "end (", w4c0Var.p(), ") offset is outside of text region "));
        } else if (i >= i2) {
            hhg1.n(cy30.i(i, "Do not set reversed or empty range: ", i2, " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((w4c0) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        v(i, i);
    }

    public void v(int i, int i2) {
        w4c0 w4c0Var = (w4c0) this.f;
        if (i < 0 || i > w4c0Var.p()) {
            eg.g(cy30.i(i, "start (", w4c0Var.p(), ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > w4c0Var.p()) {
            eg.g(cy30.i(i2, "end (", w4c0Var.p(), ") offset is outside of text region "));
        } else if (i > i2) {
            hhg1.n(cy30.i(i, "Do not set reversed range: ", i2, " > "));
        } else {
            x(i);
            w(i2);
        }
    }

    public void w(int i) {
        if (!(i >= 0)) {
            rf80.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public void x(int i) {
        if (!(i >= 0)) {
            rf80.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public boolean y(int i) {
        int i2 = i - 2;
        if (this.c > i2 || i >= this.b) {
            return false;
        }
        byte[] bArr = (byte[]) this.f;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public void z() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (y(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public k4w(byte[] bArr, int i, int i2) {
        this.a = (byte) 1;
        this.f = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        this.e = 0;
        a();
    }
}
