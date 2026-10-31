package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a2x {
    public final long a;

    public a2x(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2x) && this.a == ((a2x) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
