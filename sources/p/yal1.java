package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yal1 {
    public final afx a;
    public final afx b;
    public final afx c;
    public final u7h d;

    public yal1(afx afxVar, afx afxVar2, afx afxVar3, u7h u7hVar) {
        this.a = afxVar;
        this.b = afxVar2;
        this.c = afxVar3;
        this.d = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yal1)) {
            return false;
        }
        yal1 yal1Var = (yal1) obj;
        return u890.j(this.a, yal1Var.a) && u890.j(this.b, yal1Var.b) && u890.j(this.c, yal1Var.c) && u890.j(this.d, yal1Var.d);
    }

    public final int hashCode() {
        afx afxVar = this.a;
        int iHashCode = (afxVar == null ? 0 : afxVar.hashCode()) * 31;
        afx afxVar2 = this.b;
        int iHashCode2 = (iHashCode + (afxVar2 == null ? 0 : afxVar2.hashCode())) * 31;
        afx afxVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (afxVar3 == null ? 0 : afxVar3.hashCode())) * 31;
        u7h u7hVar = this.d;
        return iHashCode3 + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0);
    }
}
