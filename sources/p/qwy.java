package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qwy extends swy {
    public final wkt a;

    public qwy(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qwy) && this.a.equals(((qwy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
