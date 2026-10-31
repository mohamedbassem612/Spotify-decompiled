package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lte1 {
    public final String a;
    public final uqe1 b;
    public final jte1 c;
    public final kte1 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public lte1(String str, uqe1 uqe1Var, jte1 jte1Var, kte1 kte1Var, boolean z, boolean z2, boolean z3, int i) {
        uqe1Var = (i & 2) != 0 ? null : uqe1Var;
        jte1Var = (i & 4) != 0 ? null : jte1Var;
        kte1Var = (i & 8) != 0 ? null : kte1Var;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        z3 = (i & 64) != 0 ? true : z3;
        this.a = str;
        this.b = uqe1Var;
        this.c = jte1Var;
        this.d = kte1Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lte1)) {
            return false;
        }
        lte1 lte1Var = (lte1) obj;
        return u890.j(this.a, lte1Var.a) && u890.j(this.b, lte1Var.b) && u890.j(this.c, lte1Var.c) && u890.j(this.d, lte1Var.d) && this.e == lte1Var.e && this.f == lte1Var.f && this.g == lte1Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uqe1 uqe1Var = this.b;
        int iHashCode2 = (iHashCode + (uqe1Var == null ? 0 : uqe1Var.hashCode())) * 31;
        jte1 jte1Var = this.c;
        int iHashCode3 = (iHashCode2 + (jte1Var == null ? 0 : jte1Var.a.hashCode())) * 31;
        kte1 kte1Var = this.d;
        return xcg1.g(xcg1.g(xcg1.g((iHashCode3 + (kte1Var != null ? kte1Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }
}
