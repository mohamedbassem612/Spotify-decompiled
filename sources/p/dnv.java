package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dnv implements fnv {
    public final long a;

    public dnv(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnv) && this.a == ((dnv) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
