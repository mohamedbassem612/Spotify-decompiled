package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nu1 {
    public final tu1 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public nu1(tu1 tu1Var, boolean z, boolean z2, boolean z3) {
        this.a = tu1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static nu1 a(nu1 nu1Var, tu1 tu1Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            tu1Var = nu1Var.a;
        }
        if ((i & 2) != 0) {
            z = nu1Var.b;
        }
        if ((i & 4) != 0) {
            z2 = nu1Var.c;
        }
        return new nu1(tu1Var, z, z2, (i & 8) != 0 ? nu1Var.d : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        return this.a.equals(nu1Var.a) && this.b == nu1Var.b && this.c == nu1Var.c && this.d == nu1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
