package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bdj1 implements adj1 {
    public final taj1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public bdj1(taj1 taj1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = taj1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
    }

    public static bdj1 h(bdj1 bdj1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        boolean z6 = z;
        taj1 taj1Var = bdj1Var.a;
        if ((i2 & 2) != 0) {
            z6 = bdj1Var.b;
        }
        if ((i2 & 4) != 0) {
            z2 = bdj1Var.c;
        }
        if ((i2 & 8) != 0) {
            z3 = bdj1Var.d;
        }
        if ((i2 & 16) != 0) {
            z4 = bdj1Var.e;
        }
        if ((i2 & 32) != 0) {
            z5 = bdj1Var.f;
        }
        if ((i2 & 64) != 0) {
            i = bdj1Var.g;
        }
        int i3 = i;
        bdj1Var.getClass();
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        return new bdj1(taj1Var, z6, z2, z9, z8, z7, i3);
    }

    public final taj1 a() {
        return this.a;
    }

    public final int b() {
        return this.g;
    }

    public final boolean c() {
        return this.f;
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
        if (!(obj instanceof bdj1)) {
            return false;
        }
        bdj1 bdj1Var = (bdj1) obj;
        return u890.j(this.a, bdj1Var.a) && this.b == bdj1Var.b && this.c == bdj1Var.c && this.d == bdj1Var.d && this.e == bdj1Var.e && this.f == bdj1Var.f && this.g == bdj1Var.g;
    }

    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final boolean isVisible() {
        return this.c;
    }
}
