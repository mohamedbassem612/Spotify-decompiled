package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tum implements uum {
    public final long a;

    public tum(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tum) && this.a == ((tum) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
