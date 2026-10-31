package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b0g1 extends e0g1 {
    public final long a;

    public b0g1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0g1) && this.a == ((b0g1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
