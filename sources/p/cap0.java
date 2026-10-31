package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cap0 implements iap0 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof cap0) {
            return this.a == ((cap0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return gvg.e(this.a, "FailedToResolveService(errorCode=", ")");
    }
}
