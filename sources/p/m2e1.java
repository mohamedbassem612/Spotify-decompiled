package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m2e1 extends l2p1 {
    public final u771 c;
    public final long d;
    public final vve1 e;

    public m2e1(u771 u771Var, long j, vve1 vve1Var) {
        this.c = u771Var;
        this.d = j;
        this.e = vve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2e1)) {
            return false;
        }
        m2e1 m2e1Var = (m2e1) obj;
        return u890.j(this.c, m2e1Var.c) && vve1.a(this.d, m2e1Var.d) && u890.j(this.e, m2e1Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f(this.c.hashCode() * 31, this.d, 31);
        vve1 vve1Var = this.e;
        return iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a));
    }
}
