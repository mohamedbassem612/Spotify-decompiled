package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iyl {
    public final String a;
    public final jo70 b;
    public final iam c;
    public final xkk1 d;
    public final zoy0 e;
    public final hll f;
    public final xlw0 g;
    public final w281 h;
    public final zc8 i;

    public iyl(String str, jo70 jo70Var, iam iamVar, xkk1 xkk1Var, zoy0 zoy0Var, hll hllVar, xlw0 xlw0Var, w281 w281Var, zc8 zc8Var) {
        this.a = str;
        this.b = jo70Var;
        this.c = iamVar;
        this.d = xkk1Var;
        this.e = zoy0Var;
        this.f = hllVar;
        this.g = xlw0Var;
        this.h = w281Var;
        this.i = zc8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyl)) {
            return false;
        }
        iyl iylVar = (iyl) obj;
        return u890.j(this.a, iylVar.a) && u890.j(this.b, iylVar.b) && this.c.equals(iylVar.c) && u890.j(this.d, iylVar.d) && u890.j(this.e, iylVar.e) && u890.j(this.f, iylVar.f) && u890.j(this.g, iylVar.g) && u890.j(this.h, iylVar.h) && u890.j(this.i, iylVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        jo70 jo70Var = this.b;
        int iK = ab80.k(this.c.a, (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31, 31);
        xkk1 xkk1Var = this.d;
        int iHashCode2 = (iK + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        zoy0 zoy0Var = this.e;
        int iHashCode3 = (iHashCode2 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        hll hllVar = this.f;
        int iHashCode4 = (iHashCode3 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        xlw0 xlw0Var = this.g;
        int iHashCode5 = (iHashCode4 + (xlw0Var == null ? 0 : xlw0Var.a.hashCode())) * 31;
        w281 w281Var = this.h;
        int iHashCode6 = (iHashCode5 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        zc8 zc8Var = this.i;
        return iHashCode6 + (zc8Var != null ? zc8Var.hashCode() : 0);
    }
}
