package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class as51 {
    public final long a;

    public as51(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as51) && this.a == ((as51) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
