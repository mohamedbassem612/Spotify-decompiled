package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rg60 {
    public final ehy a;

    public rg60(ehy ehyVar) {
        this.a = ehyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg60) && u890.j(this.a, ((rg60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
