package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a5k1 implements b5k1 {
    public final u771 a;
    public final long b;
    public final vve1 c;

    public a5k1(u771 u771Var, long j, vve1 vve1Var) {
        this.a = u771Var;
        this.b = j;
        this.c = vve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5k1)) {
            return false;
        }
        a5k1 a5k1Var = (a5k1) obj;
        return u890.j(this.a, a5k1Var.a) && vve1.a(this.b, a5k1Var.b) && u890.j(this.c, a5k1Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        vve1 vve1Var = this.c;
        return iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a));
    }
}
