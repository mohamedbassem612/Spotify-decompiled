package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x481 {
    public final iam a;
    public final w481 b;
    public final jo70 c;
    public final ma8 d;
    public final att0 e;
    public final hll f;
    public final zc8 g;
    public final w281 h;
    public final r9v0 i;
    public final xkk1 j;
    public final xlw0 k;

    public x481(iam iamVar, w481 w481Var, jo70 jo70Var, ma8 ma8Var, att0 att0Var, hll hllVar, zc8 zc8Var, w281 w281Var, r9v0 r9v0Var, xkk1 xkk1Var, xlw0 xlw0Var) {
        this.a = iamVar;
        this.b = w481Var;
        this.c = jo70Var;
        this.d = ma8Var;
        this.e = att0Var;
        this.f = hllVar;
        this.g = zc8Var;
        this.h = w281Var;
        this.i = r9v0Var;
        this.j = xkk1Var;
        this.k = xlw0Var;
    }

    public final va81 a() {
        w481 w481Var = this.b;
        if (w481Var instanceof v481) {
            return ((v481) w481Var).b();
        }
        if (w481Var instanceof s481) {
            return ((s481) w481Var).b;
        }
        eg.o();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x481)) {
            return false;
        }
        x481 x481Var = (x481) obj;
        return this.a.equals(x481Var.a) && this.b.equals(x481Var.b) && u890.j(this.c, x481Var.c) && u890.j(this.d, x481Var.d) && u890.j(this.e, x481Var.e) && u890.j(this.f, x481Var.f) && u890.j(this.g, x481Var.g) && u890.j(this.h, x481Var.h) && u890.j(this.i, x481Var.i) && u890.j(this.j, x481Var.j) && u890.j(this.k, x481Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (l1d.C(this.a.a) * 31)) * 31;
        jo70 jo70Var = this.c;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        ma8 ma8Var = this.d;
        int iHashCode3 = (iHashCode2 + (ma8Var == null ? 0 : ma8Var.hashCode())) * 31;
        att0 att0Var = this.e;
        int iHashCode4 = (iHashCode3 + (att0Var == null ? 0 : att0Var.hashCode())) * 31;
        hll hllVar = this.f;
        int iHashCode5 = (iHashCode4 + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        zc8 zc8Var = this.g;
        int iHashCode6 = (iHashCode5 + (zc8Var == null ? 0 : zc8Var.hashCode())) * 31;
        w281 w281Var = this.h;
        int iHashCode7 = (iHashCode6 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        r9v0 r9v0Var = this.i;
        int iHashCode8 = (iHashCode7 + (r9v0Var == null ? 0 : r9v0Var.a.hashCode())) * 31;
        xkk1 xkk1Var = this.j;
        int iHashCode9 = (iHashCode8 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        xlw0 xlw0Var = this.k;
        return iHashCode9 + (xlw0Var != null ? xlw0Var.a.hashCode() : 0);
    }
}
