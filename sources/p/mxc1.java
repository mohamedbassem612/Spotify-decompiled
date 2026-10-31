package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mxc1 {
    public final List a;
    public final hyc1 b;
    public final long c;
    public final long d;
    public final iu30 e;
    public final boolean f;

    public mxc1(List list, hyc1 hyc1Var, long j, long j2, iu30 iu30Var, boolean z) {
        this.a = list;
        this.b = hyc1Var;
        this.c = j;
        this.d = j2;
        this.e = iu30Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxc1)) {
            return false;
        }
        mxc1 mxc1Var = (mxc1) obj;
        if (!u890.j(this.a, mxc1Var.a) || !u890.j(this.b, mxc1Var.b)) {
            return false;
        }
        long j = mxc1Var.c;
        int i = u7h.l;
        return z4h1.b(this.c, j) && z4h1.b(this.d, mxc1Var.d) && u890.j(this.e, mxc1Var.e) && this.f == mxc1Var.f;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, false);
        hyc1 hyc1Var = this.b;
        int iHashCode = (iG + (hyc1Var == null ? 0 : hyc1Var.hashCode())) * 31;
        int i = u7h.l;
        int iF = cy30.f(cy30.f(iHashCode, this.c, 31), this.d, 31);
        iu30 iu30Var = this.e;
        return Boolean.hashCode(this.f) + ((iF + (iu30Var != null ? iu30Var.hashCode() : 0)) * 31);
    }
}
