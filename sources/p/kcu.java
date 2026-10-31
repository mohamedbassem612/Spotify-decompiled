package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kcu implements ncu {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof kcu) {
            return this.a == ((kcu) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "StartFailed(errorCode=", ")");
    }
}
