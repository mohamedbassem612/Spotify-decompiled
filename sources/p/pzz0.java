package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pzz0 implements qzz0 {
    public final long a;

    public pzz0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzz0) && this.a == ((pzz0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
