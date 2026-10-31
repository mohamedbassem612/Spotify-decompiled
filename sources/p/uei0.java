package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uei0 {
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
    public final boolean m;

    public /* synthetic */ uei0(boolean z, har0 har0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        this((i & 1) != 0 ? false : z, har0Var, (i & 4) != 0 ? false : z2, (i & 8) == 0, (i & 16) == 0, (i & 32) != 0 ? false : z3, (i & 64) == 0, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) == 0, (i & 2048) != 0 ? false : z7, (i & 4096) != 0 ? false : z8);
    }

    public static uei0 a(uei0 uei0Var, har0 har0Var) {
        return new uei0(uei0Var.a, har0Var, uei0Var.c, uei0Var.d, uei0Var.e, uei0Var.f, uei0Var.g, uei0Var.h, uei0Var.i, uei0Var.j, uei0Var.k, uei0Var.l, uei0Var.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uei0)) {
            return false;
        }
        uei0 uei0Var = (uei0) obj;
        return this.a == uei0Var.a && u890.j(this.b, uei0Var.b) && this.c == uei0Var.c && this.d == uei0Var.d && this.e == uei0Var.e && this.f == uei0Var.f && this.g == uei0Var.g && this.h == uei0Var.h && this.i == uei0Var.i && this.j == uei0Var.j && this.k == uei0Var.k && this.l == uei0Var.l && this.m == uei0Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(kaa0.f(this.b.a, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public uei0(boolean z, har0 har0Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
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
        this.m = z12;
    }
}
