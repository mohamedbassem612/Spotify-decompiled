package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fa10 {
    public final pnx0 a;
    public final w281 b;
    public final alm c;
    public final ijo d;
    public final hzy e;
    public final jo70 f;
    public final String g;

    public fa10(pnx0 pnx0Var, w281 w281Var, alm almVar, ijo ijoVar, hzy hzyVar, jo70 jo70Var, String str) {
        this.a = pnx0Var;
        this.b = w281Var;
        this.c = almVar;
        this.d = ijoVar;
        this.e = hzyVar;
        this.f = jo70Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa10)) {
            return false;
        }
        fa10 fa10Var = (fa10) obj;
        return this.a.equals(fa10Var.a) && u890.j(this.b, fa10Var.b) && this.c.equals(fa10Var.c) && u890.j(this.d, fa10Var.d) && u890.j(this.e, fa10Var.e) && u890.j(this.f, fa10Var.f) && u890.j(this.g, fa10Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        w281 w281Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (w281Var == null ? 0 : w281Var.hashCode())) * 31)) * 31;
        ijo ijoVar = this.d;
        int iHashCode3 = (iHashCode2 + (ijoVar == null ? 0 : ijoVar.hashCode())) * 31;
        hzy hzyVar = this.e;
        int iC = (iHashCode3 + (hzyVar == null ? 0 : l1d.C(hzyVar.a))) * 31;
        jo70 jo70Var = this.f;
        int iHashCode4 = (iC + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        String str = this.g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
