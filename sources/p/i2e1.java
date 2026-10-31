package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i2e1 extends l2p1 {
    public final String c;
    public final u771 d;
    public final long e;
    public final vve1 f;
    public final String g;

    public i2e1(String str, u771 u771Var, long j, vve1 vve1Var, String str2) {
        this.c = str;
        this.d = u771Var;
        this.e = j;
        this.f = vve1Var;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2e1)) {
            return false;
        }
        i2e1 i2e1Var = (i2e1) obj;
        return u890.j(this.c, i2e1Var.c) && u890.j(this.d, i2e1Var.d) && vve1.a(this.e, i2e1Var.e) && u890.j(this.f, i2e1Var.f) && u890.j(this.g, i2e1Var.g);
    }

    public final int hashCode() {
        int iF = cy30.f(cfm0.g(this.d, this.c.hashCode() * 31, 31), this.e, 31);
        vve1 vve1Var = this.f;
        int iHashCode = (iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a))) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
