package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i4 implements k4 {
    public final wkt a;

    public i4(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4) && this.a.equals(((i4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
