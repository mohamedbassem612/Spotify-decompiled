package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujc extends t3k1 {
    public final long b;

    public ujc(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ujc) && this.b == ((ujc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }
}
