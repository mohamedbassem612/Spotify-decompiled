package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l6h extends n6h {
    public final wkt a;

    public l6h(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6h) && this.a.equals(((l6h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
