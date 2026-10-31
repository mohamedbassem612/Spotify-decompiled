package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fhe {
    public final mtl a;
    public final Boolean b;

    public fhe(mtl mtlVar, Boolean bool) {
        this.a = mtlVar;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhe)) {
            return false;
        }
        fhe fheVar = (fhe) obj;
        return u890.j(this.a, fheVar.a) && u890.j(this.b, fheVar.b);
    }

    public final int hashCode() {
        mtl mtlVar = this.a;
        int iHashCode = (mtlVar == null ? 0 : mtlVar.a.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
