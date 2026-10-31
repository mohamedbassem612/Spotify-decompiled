package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hap0 implements iap0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hap0) {
            return this.a == ((hap0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "StopFailed(errorCode=", ")");
    }
}
