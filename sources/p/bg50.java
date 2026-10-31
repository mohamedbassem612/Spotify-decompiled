package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bg50 {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof bg50) {
            return this.a == ((bg50) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return gvg.f(this.a, "GridItemSpan(packedValue=", ")");
    }
}
