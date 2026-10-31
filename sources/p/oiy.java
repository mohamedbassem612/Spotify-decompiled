package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oiy {
    public final niy a;
    public final Boolean b;

    public oiy(niy niyVar, int i) {
        Boolean bool = (i & 4) != 0 ? null : Boolean.TRUE;
        this.a = niyVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiy)) {
            return false;
        }
        oiy oiyVar = (oiy) obj;
        return this.a.equals(oiyVar.a) && u890.j(this.b, oiyVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }
}
