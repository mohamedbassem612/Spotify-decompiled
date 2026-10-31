package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ztk1 implements auk1 {
    public final long a;

    public ztk1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztk1) && this.a == ((ztk1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
