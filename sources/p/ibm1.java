package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ibm1 implements z0i {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final xz7 e;
    public final f08 f;
    public final g08 g;

    public ibm1(String str, boolean z, boolean z2, boolean z3, xz7 xz7Var, f08 f08Var, g08 g08Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = xz7Var;
        this.f = f08Var;
        this.g = g08Var;
    }

    public static ibm1 c(ibm1 ibm1Var, String str, xz7 xz7Var, f08 f08Var, g08 g08Var, int i) {
        if ((i & 1) != 0) {
            str = ibm1Var.a;
        }
        String str2 = str;
        boolean z = ibm1Var.b;
        boolean z2 = ibm1Var.c;
        boolean z3 = ibm1Var.d;
        if ((i & 16) != 0) {
            xz7Var = ibm1Var.e;
        }
        xz7 xz7Var2 = xz7Var;
        if ((i & 32) != 0) {
            f08Var = ibm1Var.f;
        }
        f08 f08Var2 = f08Var;
        if ((i & 64) != 0) {
            g08Var = ibm1Var.g;
        }
        ibm1Var.getClass();
        return new ibm1(str2, z, z2, z3, xz7Var2, f08Var2, g08Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibm1)) {
            return false;
        }
        ibm1 ibm1Var = (ibm1) obj;
        return u890.j(this.a, ibm1Var.a) && this.b == ibm1Var.b && this.c == ibm1Var.c && this.d == ibm1Var.d && u890.j(this.e, ibm1Var.e) && u890.j(this.f, ibm1Var.f) && u890.j(this.g, ibm1Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        xz7 xz7Var = this.e;
        int iHashCode = (iG + (xz7Var == null ? 0 : xz7Var.hashCode())) * 31;
        f08 f08Var = this.f;
        int iHashCode2 = (iHashCode + (f08Var == null ? 0 : f08Var.hashCode())) * 31;
        g08 g08Var = this.g;
        return iHashCode2 + (g08Var != null ? g08Var.hashCode() : 0);
    }
}
