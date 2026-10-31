package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pdb1 {
    public final h2v a;
    public final hll b;
    public final qxc0 c;
    public final cmj1 d;
    public final boolean e;

    public pdb1(h2v h2vVar, hll hllVar, qxc0 qxc0Var, cmj1 cmj1Var, boolean z) {
        this.a = h2vVar;
        this.b = hllVar;
        this.c = qxc0Var;
        this.d = cmj1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdb1)) {
            return false;
        }
        pdb1 pdb1Var = (pdb1) obj;
        return u890.j(this.a, pdb1Var.a) && u890.j(this.b, pdb1Var.b) && u890.j(this.c, pdb1Var.c) && this.d == pdb1Var.d && this.e == pdb1Var.e;
    }

    public final int hashCode() {
        h2v h2vVar = this.a;
        int iHashCode = (h2vVar == null ? 0 : h2vVar.hashCode()) * 31;
        hll hllVar = this.b;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        qxc0 qxc0Var = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (qxc0Var != null ? qxc0Var.hashCode() : 0)) * 31)) * 31);
    }
}
