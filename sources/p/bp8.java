package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bp8 implements cp8 {
    public final long a;

    public bp8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bp8) && this.a == ((bp8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
