package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pbu implements rbu {
    public final long a;

    public pbu(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pbu) && this.a == ((pbu) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
