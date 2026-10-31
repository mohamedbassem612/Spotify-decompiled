package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hec {
    public final fec a;
    public final fec b;
    public final mr20 c;
    public final dec d;

    public hec(fec fecVar, fec fecVar2, mr20 mr20Var, dec decVar) {
        this.a = fecVar;
        this.b = fecVar2;
        this.c = mr20Var;
        this.d = decVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hec)) {
            return false;
        }
        hec hecVar = (hec) obj;
        return this.a.equals(hecVar.a) && this.b.equals(hecVar.b) && this.c.equals(hecVar.c) && this.d.equals(hecVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
