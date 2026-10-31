package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wij1 implements cjj1 {
    public final long a;

    public wij1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wij1) && this.a == ((wij1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
