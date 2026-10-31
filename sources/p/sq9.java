package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sq9 {
    public final long a;

    public sq9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sq9) && this.a == ((sq9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
