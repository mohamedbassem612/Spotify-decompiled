package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t910 {
    public final ioj0 a;
    public final rc81 b;
    public final ijo c;
    public final Boolean d;
    public final Boolean e;
    public final zau0 f;
    public final int g;
    public final pjw0 h;
    public final nbw0 i;
    public final hwt j;
    public final boolean k;

    public t910(ioj0 ioj0Var, rc81 rc81Var, ijo ijoVar, Boolean bool, Boolean bool2, zau0 zau0Var, int i, pjw0 pjw0Var, nbw0 nbw0Var, hwt hwtVar, boolean z) {
        this.a = ioj0Var;
        this.b = rc81Var;
        this.c = ijoVar;
        this.d = bool;
        this.e = bool2;
        this.f = zau0Var;
        this.g = i;
        this.h = pjw0Var;
        this.i = nbw0Var;
        this.j = hwtVar;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t910)) {
            return false;
        }
        t910 t910Var = (t910) obj;
        return this.a.equals(t910Var.a) && u890.j(this.b, t910Var.b) && u890.j(this.c, t910Var.c) && u890.j(this.d, t910Var.d) && u890.j(this.e, t910Var.e) && u890.j(this.f, t910Var.f) && this.g == t910Var.g && u890.j(this.h, t910Var.h) && u890.j(this.i, t910Var.i) && u890.j(this.j, t910Var.j) && this.k == t910Var.k;
    }

    public final int hashCode() {
        int iHashCode = this.a.a.hashCode() * 31;
        rc81 rc81Var = this.b;
        int iHashCode2 = (iHashCode + (rc81Var == null ? 0 : rc81Var.hashCode())) * 31;
        ijo ijoVar = this.c;
        int iHashCode3 = (iHashCode2 + (ijoVar == null ? 0 : ijoVar.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        zau0 zau0Var = this.f;
        int iK = ab80.k(this.g, (iHashCode5 + (zau0Var == null ? 0 : zau0Var.hashCode())) * 31, 31);
        pjw0 pjw0Var = this.h;
        int iHashCode6 = (iK + (pjw0Var == null ? 0 : pjw0Var.hashCode())) * 31;
        nbw0 nbw0Var = this.i;
        int iHashCode7 = (iHashCode6 + (nbw0Var == null ? 0 : nbw0Var.hashCode())) * 31;
        hwt hwtVar = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode7 + (hwtVar != null ? hwtVar.hashCode() : 0)) * 31);
    }
}
