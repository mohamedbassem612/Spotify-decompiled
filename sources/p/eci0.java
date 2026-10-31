package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eci0 {
    public final boolean a;
    public final har0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public eci0(boolean z, har0 har0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.a = z;
        this.b = har0Var;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eci0)) {
            return false;
        }
        eci0 eci0Var = (eci0) obj;
        return this.a == eci0Var.a && this.b.equals(eci0Var.b) && this.c == eci0Var.c && this.d == eci0Var.d && this.e == eci0Var.e && this.f == eci0Var.f && this.g == eci0Var.g && this.h == eci0Var.h && this.i == eci0Var.i && this.j == eci0Var.j && this.k == eci0Var.k && this.l == eci0Var.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.b.a, Boolean.hashCode(this.a) * 31, 31), 31, true), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}
