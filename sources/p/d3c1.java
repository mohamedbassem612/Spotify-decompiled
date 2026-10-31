package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class d3c1 extends f3c1 {
    public final long a;

    public d3c1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3c1) && this.a == ((d3c1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
