package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g0h0 implements k0h0 {
    public final long a;

    public g0h0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0h0) && this.a == ((g0h0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
