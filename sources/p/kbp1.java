package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kbp1 {
    public final String a;

    public kbp1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof kbp1) && this.a.equals(((kbp1) obj).a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return l1d.n(this.a, ", enableFirelog=true, firelogEventType=1}", new StringBuilder("MLKitLoggingOptions{libraryName="));
    }
}
