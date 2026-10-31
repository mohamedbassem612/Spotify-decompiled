package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c6k1 implements i6k1 {
    public final long a;

    public c6k1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6k1) && this.a == ((c6k1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
