package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oqa1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;

    public oqa1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqa1)) {
            return false;
        }
        oqa1 oqa1Var = (oqa1) obj;
        return this.a == oqa1Var.a && this.b == oqa1Var.b && this.c == oqa1Var.c && this.d == oqa1Var.d && this.e == oqa1Var.e && this.f == oqa1Var.f && this.g == oqa1Var.g && this.h == oqa1Var.h && this.i == oqa1Var.i;
    }

    public final int hashCode() {
        return l1d.C(this.i) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
