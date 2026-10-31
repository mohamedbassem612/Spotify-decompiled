package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vwl {
    public final boolean a;
    public final jno b;
    public final dlb c;

    public vwl(boolean z, jno jnoVar, dlb dlbVar) {
        this.a = z;
        this.b = jnoVar;
        this.c = dlbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwl)) {
            return false;
        }
        vwl vwlVar = (vwl) obj;
        return this.a == vwlVar.a && u890.j(this.b, vwlVar.b) && u890.j(this.c, vwlVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        dlb dlbVar = this.c;
        return iHashCode + (dlbVar == null ? 0 : dlbVar.hashCode());
    }
}
