package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nj41 implements pj41 {
    public final long a;

    public nj41(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nj41) && this.a == ((nj41) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
