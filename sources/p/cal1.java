package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cal1 implements eal1 {
    public final long a;

    public cal1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cal1) && this.a == ((cal1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
