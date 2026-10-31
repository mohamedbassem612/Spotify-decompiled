package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sfm1 {
    public final wkt a;

    public sfm1(wkt wktVar) {
        this.a = wktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sfm1) && this.a.equals(((sfm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
