package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iu7 {
    public final long a;

    public iu7(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu7) && this.a == ((iu7) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a) + (Long.hashCode(0L) * 31);
    }
}
