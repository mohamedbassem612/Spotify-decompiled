package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class daf {
    public final xpw a;
    public final gaf b;

    public daf(xpw xpwVar, gaf gafVar) {
        this.a = xpwVar;
        this.b = gafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daf)) {
            return false;
        }
        daf dafVar = (daf) obj;
        return this.a.equals(dafVar.a) && this.b.equals(dafVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
