package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class et7 extends eso1 {
    public final u771 b;
    public final long c;
    public final vve1 d;

    public et7(u771 u771Var, long j, vve1 vve1Var) {
        this.b = u771Var;
        this.c = j;
        this.d = vve1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et7)) {
            return false;
        }
        et7 et7Var = (et7) obj;
        return u890.j(this.b, et7Var.b) && vve1.a(this.c, et7Var.c) && u890.j(this.d, et7Var.d);
    }

    public final int hashCode() {
        int iF = cy30.f(this.b.hashCode() * 31, this.c, 31);
        vve1 vve1Var = this.d;
        return iF + (vve1Var == null ? 0 : Long.hashCode(vve1Var.a));
    }
}
