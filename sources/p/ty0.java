package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ty0 implements vy0 {
    public final long a;

    public ty0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty0) && this.a == ((ty0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
