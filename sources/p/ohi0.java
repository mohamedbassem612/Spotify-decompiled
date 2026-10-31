package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ohi0 {
    public final har0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ohi0(har0 har0Var, boolean z, boolean z2, int i) {
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        boolean z5 = (i & 32) != 0;
        z = (i & 128) != 0 ? false : z;
        z2 = (i & 256) != 0 ? false : z2;
        this.a = har0Var;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohi0)) {
            return false;
        }
        ohi0 ohi0Var = (ohi0) obj;
        return this.a.equals(ohi0Var.a) && this.b == ohi0Var.b && this.c == ohi0Var.c && this.d == ohi0Var.d && this.e == ohi0Var.e && this.f == ohi0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.a.a, Boolean.hashCode(true) * 31, 31), 31, this.b), 31, this.c), 31, true), 31, this.d), 31, false), 31, this.e);
    }
}
