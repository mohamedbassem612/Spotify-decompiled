package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k2u {
    public final g281 a;
    public final w281 b;
    public final v740 c;
    public final i1z d;

    public k2u(g281 g281Var, w281 w281Var, v740 v740Var, i1z i1zVar) {
        this.a = g281Var;
        this.b = w281Var;
        this.c = v740Var;
        this.d = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2u)) {
            return false;
        }
        k2u k2uVar = (k2u) obj;
        return u890.j(this.a, k2uVar.a) && this.b.equals(k2uVar.b) && u890.j(this.c, k2uVar.c) && u890.j(this.d, k2uVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        v740 v740Var = this.c;
        int iHashCode2 = (iHashCode + (v740Var == null ? 0 : v740Var.a.hashCode())) * 31;
        i1z i1zVar = this.d;
        return iHashCode2 + (i1zVar != null ? i1zVar.hashCode() : 0);
    }
}
