package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n6r {
    public final long a;

    public n6r(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n6r) && this.a == ((n6r) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
