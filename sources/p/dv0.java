package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dv0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final Exception e;

    public dv0(boolean z, boolean z2, boolean z3, int i, Exception exc) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = exc;
    }

    public static dv0 a(dv0 dv0Var, boolean z, boolean z2, int i, Exception exc, int i2) {
        if ((i2 & 1) != 0) {
            z = dv0Var.a;
        }
        boolean z3 = z;
        boolean z4 = (i2 & 2) != 0 ? dv0Var.b : false;
        if ((i2 & 4) != 0) {
            z2 = dv0Var.c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            i = dv0Var.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            exc = dv0Var.e;
        }
        return new dv0(z3, z4, z5, i3, exc);
    }

    public final boolean b() {
        return (this.b || this.d == 0 || this.e == null) ? false : true;
    }

    public final boolean c() {
        return this.b && !this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv0)) {
            return false;
        }
        dv0 dv0Var = (dv0) obj;
        return this.a == dv0Var.a && this.b == dv0Var.b && this.c == dv0Var.c && this.d == dv0Var.d && u890.j(this.e, dv0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = this.d;
        int iC = (iG + (i == 0 ? 0 : l1d.C(i))) * 31;
        Exception exc = this.e;
        return iC + (exc != null ? exc.hashCode() : 0);
    }
}
