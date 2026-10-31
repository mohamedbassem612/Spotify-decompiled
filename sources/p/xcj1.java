package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xcj1 implements adj1 {
    public final taj1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public /* synthetic */ xcj1(taj1 taj1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this(taj1Var, z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, false, (i2 & 64) != 0 ? 0 : i);
    }

    public static xcj1 h(xcj1 xcj1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        taj1 taj1Var = xcj1Var.a;
        if ((i2 & 2) != 0) {
            z = xcj1Var.b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = xcj1Var.c;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = xcj1Var.d;
        }
        boolean z7 = z3;
        boolean z8 = xcj1Var.e;
        if ((i2 & 32) != 0) {
            z4 = xcj1Var.f;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            i = xcj1Var.g;
        }
        xcj1Var.getClass();
        return new xcj1(taj1Var, z5, z6, z7, z8, z9, i);
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
        if (!(obj instanceof xcj1)) {
            return false;
        }
        xcj1 xcj1Var = (xcj1) obj;
        return u890.j(this.a, xcj1Var.a) && this.b == xcj1Var.b && this.c == xcj1Var.c && this.d == xcj1Var.d && this.e == xcj1Var.e && this.f == xcj1Var.f && this.g == xcj1Var.g;
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

    public xcj1(taj1 taj1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = taj1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i;
    }
}
