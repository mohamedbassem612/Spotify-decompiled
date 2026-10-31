package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mmj0 {
    public final boolean a;
    public final hy50 b;
    public final afv0 c;
    public final boolean d;
    public final boolean e;

    public mmj0(boolean z, hy50 hy50Var, afv0 afv0Var, boolean z2, boolean z3) {
        this.a = z;
        this.b = hy50Var;
        this.c = afv0Var;
        this.d = z2;
        this.e = z3;
    }

    public static mmj0 a(mmj0 mmj0Var, boolean z, hy50 hy50Var, afv0 afv0Var, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = mmj0Var.a;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            hy50Var = mmj0Var.b;
        }
        hy50 hy50Var2 = hy50Var;
        if ((i & 8) != 0) {
            afv0Var = mmj0Var.c;
        }
        afv0 afv0Var2 = afv0Var;
        if ((i & 16) != 0) {
            z2 = mmj0Var.d;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = mmj0Var.e;
        }
        return new mmj0(z4, hy50Var2, afv0Var2, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmj0)) {
            return false;
        }
        mmj0 mmj0Var = (mmj0) obj;
        return this.a == mmj0Var.a && this.b.equals(mmj0Var.b) && u890.j(this.c, mmj0Var.c) && this.d == mmj0Var.d && this.e == mmj0Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 961)) * 31;
        afv0 afv0Var = this.c;
        return Boolean.hashCode(this.e) + xcg1.g((iHashCode + (afv0Var == null ? 0 : afv0Var.hashCode())) * 31, 31, this.d);
    }
}
