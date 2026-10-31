package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xyi1 extends yyi1 {
    public final long a;

    public xyi1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xyi1) && this.a == ((xyi1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
