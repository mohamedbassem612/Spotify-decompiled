package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ozz0 implements qzz0 {
    public final long a;

    public ozz0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ozz0) && this.a == ((ozz0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
