package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w9n {
    public final long a;

    public w9n(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9n) && this.a == ((w9n) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
