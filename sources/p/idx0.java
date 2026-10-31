package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class idx0 {
    public final long a;

    public idx0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof idx0) && this.a == ((idx0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
