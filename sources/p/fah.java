package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fah {
    public final afx a;
    public final afx b;
    public final afx c;
    public final u7h d;

    public fah(afx afxVar, afx afxVar2, afx afxVar3, u7h u7hVar) {
        this.a = afxVar;
        this.b = afxVar2;
        this.c = afxVar3;
        this.d = u7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fah)) {
            return false;
        }
        fah fahVar = (fah) obj;
        return u890.j(this.a, fahVar.a) && u890.j(this.b, fahVar.b) && u890.j(this.c, fahVar.c) && u890.j(this.d, fahVar.d);
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
