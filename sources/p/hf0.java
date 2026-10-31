package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hf0 {
    public final long a;

    public hf0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf0) && this.a == ((hf0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
