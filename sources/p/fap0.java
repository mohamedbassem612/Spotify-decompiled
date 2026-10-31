package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fap0 implements iap0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof fap0) {
            return this.a == ((fap0) obj).a;
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
