package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b7n0 extends c7n0 {
    public final wkt a;

    public b7n0(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7n0) && this.a.equals(((b7n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
