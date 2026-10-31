package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nky extends bs51 {
    public final oiy b;
    public final oiy c;
    public final int d = 1;

    public nky(oiy oiyVar, oiy oiyVar2) {
        this.b = oiyVar;
        this.c = oiyVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nky)) {
            return false;
        }
        nky nkyVar = (nky) obj;
        return this.b.equals(nkyVar.b) && this.c.equals(nkyVar.c) && this.d == nkyVar.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }
}
