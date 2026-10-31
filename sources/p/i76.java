package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i76 implements m86 {
    public final long a;

    public i76(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i76) && this.a == ((i76) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
