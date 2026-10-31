package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p590 {
    public final long a;

    public /* synthetic */ p590() {
        this(0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p590) && this.a == ((p590) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public p590(long j) {
        this.a = j;
    }
}
