package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ykd {
    public final long a;

    public ykd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykd) && this.a == ((ykd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
