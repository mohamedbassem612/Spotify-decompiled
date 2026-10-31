package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oky extends bs51 {
    public final oiy b;
    public final int c;

    public oky(oiy oiyVar, int i) {
        this.b = oiyVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oky)) {
            return false;
        }
        oky okyVar = (oky) obj;
        return this.b.equals(okyVar.b) && this.c == okyVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + (this.b.hashCode() * 31);
    }
}
