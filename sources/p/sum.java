package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sum implements uum {
    public final long a;

    public sum(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sum) && this.a == ((sum) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
