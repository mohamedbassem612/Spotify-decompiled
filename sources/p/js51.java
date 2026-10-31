package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class js51 implements ns51 {
    public final long a;

    public js51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof js51) && this.a == ((js51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
