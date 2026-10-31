package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ffo {
    public final long a;

    public ffo(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffo) && this.a == ((ffo) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
