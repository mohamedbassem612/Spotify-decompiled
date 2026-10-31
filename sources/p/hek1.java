package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hek1 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final nmu0 h;

    public hek1(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, nmu0 nmu0Var) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hek1)) {
            return false;
        }
        hek1 hek1Var = (hek1) obj;
        return this.a == hek1Var.a && this.b == hek1Var.b && this.c.equals(hek1Var.c) && this.d == hek1Var.d && this.e == hek1Var.e && this.f == hek1Var.f && this.g == hek1Var.g && this.h == hek1Var.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
