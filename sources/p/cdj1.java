package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cdj1 implements adj1 {
    public final taj1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public cdj1(taj1 taj1Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = taj1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i;
    }

    public static cdj1 h(cdj1 cdj1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        boolean z5 = z;
        taj1 taj1Var = cdj1Var.a;
        if ((i2 & 2) != 0) {
            z5 = cdj1Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = cdj1Var.c;
        }
        if ((i2 & 8) != 0) {
            z3 = cdj1Var.d;
        }
        cdj1Var.getClass();
        if ((i2 & 32) != 0) {
            z4 = cdj1Var.e;
        }
        if ((i2 & 64) != 0) {
            i = cdj1Var.f;
        }
        int i3 = i;
        cdj1Var.getClass();
        boolean z6 = z4;
        boolean z7 = z3;
        return new cdj1(taj1Var, z5, z2, z7, z6, i3);
    }

    public final taj1 a() {
        return this.a;
    }

    public final int b() {
        return this.f;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdj1)) {
            return false;
        }
        cdj1 cdj1Var = (cdj1) obj;
        return u890.j(this.a, cdj1Var.a) && this.b == cdj1Var.b && this.c == cdj1Var.c && this.d == cdj1Var.d && this.e == cdj1Var.e && this.f == cdj1Var.f;
    }

    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, this.e);
    }

    public final boolean isVisible() {
        return this.c;
    }

    public /* synthetic */ cdj1(taj1 taj1Var, boolean z, int i) {
        this(taj1Var, z, true, true, false, i);
    }
}
