package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fdj1 {
    public final ji0 a;
    public final o2u0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public fdj1(ji0 ji0Var, o2u0 o2u0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = ji0Var;
        this.b = o2u0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public static fdj1 a(fdj1 fdj1Var, ji0 ji0Var, o2u0 o2u0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            ji0Var = fdj1Var.a;
        }
        ji0 ji0Var2 = ji0Var;
        if ((i & 2) != 0) {
            o2u0Var = fdj1Var.b;
        }
        o2u0 o2u0Var2 = o2u0Var;
        if ((i & 4) != 0) {
            z = fdj1Var.c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z2 = fdj1Var.d;
        }
        boolean z7 = z2;
        if ((i & 16) != 0) {
            z3 = fdj1Var.e;
        }
        boolean z8 = z3;
        if ((i & 32) != 0) {
            z4 = fdj1Var.f;
        }
        boolean z9 = z4;
        if ((i & 64) != 0) {
            z5 = fdj1Var.g;
        }
        return new fdj1(ji0Var2, o2u0Var2, z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdj1)) {
            return false;
        }
        fdj1 fdj1Var = (fdj1) obj;
        return u890.j(this.a, fdj1Var.a) && this.b.equals(fdj1Var.b) && this.c == fdj1Var.c && this.d == fdj1Var.d && this.e == fdj1Var.e && this.f == fdj1Var.f && this.g == fdj1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }
}
