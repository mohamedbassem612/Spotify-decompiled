package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dfk {
    public final long a;

    public dfk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dfk) && this.a == ((dfk) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
