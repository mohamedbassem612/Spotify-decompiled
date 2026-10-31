package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xro {
    public static final xro c = new xro(null, null);
    public final tro a;
    public final tro b;

    public xro(tro troVar, tro troVar2) {
        this.a = troVar;
        this.b = troVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xro)) {
            return false;
        }
        xro xroVar = (xro) obj;
        return u890.j(this.a, xroVar.a) && u890.j(this.b, xroVar.b);
    }

    public final int hashCode() {
        tro troVar = this.a;
        int iHashCode = (troVar == null ? 0 : troVar.hashCode()) * 31;
        tro troVar2 = this.b;
        return iHashCode + (troVar2 != null ? troVar2.hashCode() : 0);
    }
}
