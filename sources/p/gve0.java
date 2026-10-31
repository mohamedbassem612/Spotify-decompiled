package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gve0 extends xa4 {
    public final long e;

    public gve0(long j) {
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gve0) && this.e == ((gve0) obj).e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }
}
