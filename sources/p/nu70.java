package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nu70 {
    public final gw81 a;
    public final w281 b;
    public final jo70 c;
    public final xkk1 d;
    public final l98 e;
    public final m1b1 f;
    public final hzy g;

    public nu70(gw81 gw81Var, w281 w281Var, jo70 jo70Var, xkk1 xkk1Var, l98 l98Var, m1b1 m1b1Var, hzy hzyVar) {
        this.a = gw81Var;
        this.b = w281Var;
        this.c = jo70Var;
        this.d = xkk1Var;
        this.e = l98Var;
        this.f = m1b1Var;
        this.g = hzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu70)) {
            return false;
        }
        nu70 nu70Var = (nu70) obj;
        return this.a.equals(nu70Var.a) && u890.j(this.b, nu70Var.b) && u890.j(this.c, nu70Var.c) && u890.j(this.d, nu70Var.d) && u890.j(this.e, nu70Var.e) && u890.j(this.f, nu70Var.f) && u890.j(this.g, nu70Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        w281 w281Var = this.b;
        int iHashCode2 = (iHashCode + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        jo70 jo70Var = this.c;
        int iHashCode3 = (iHashCode2 + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.d;
        int iHashCode4 = (iHashCode3 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        l98 l98Var = this.e;
        int iHashCode5 = (iHashCode4 + (l98Var == null ? 0 : l98Var.a.hashCode())) * 31;
        m1b1 m1b1Var = this.f;
        int iHashCode6 = (iHashCode5 + (m1b1Var == null ? 0 : m1b1Var.hashCode())) * 31;
        hzy hzyVar = this.g;
        return iHashCode6 + (hzyVar != null ? l1d.C(hzyVar.a) : 0);
    }
}
