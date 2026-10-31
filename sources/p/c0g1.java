package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c0g1 extends e0g1 {
    public final long a;

    public c0g1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0g1) && this.a == ((c0g1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
