package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dj40 {
    public final long a;

    public dj40(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj40) && this.a == ((dj40) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
