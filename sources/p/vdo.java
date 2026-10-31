package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdo extends dm5 {
    public final pwo1 k;
    public final u7h l;
    public final u7h m;

    public vdo(pwo1 pwo1Var, u7h u7hVar, u7h u7hVar2) {
        this.k = pwo1Var;
        this.l = u7hVar;
        this.m = u7hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdo)) {
            return false;
        }
        vdo vdoVar = (vdo) obj;
        return this.k.equals(vdoVar.k) && u890.j(this.l, vdoVar.l) && u890.j(this.m, vdoVar.m);
    }

    public final int hashCode() {
        int iHashCode = this.k.hashCode() * 31;
        u7h u7hVar = this.l;
        int iHashCode2 = (iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        u7h u7hVar2 = this.m;
        return iHashCode2 + (u7hVar2 != null ? Long.hashCode(u7hVar2.a) : 0);
    }
}
