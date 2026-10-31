package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bbl extends fsa {
    public final kbl a;

    public bbl(kbl kblVar) {
        this.a = kblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbl) && this.a.equals(((bbl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
