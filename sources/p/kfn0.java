package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kfn0 implements lfn0 {
    public final long a;

    public kfn0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kfn0) && this.a == ((kfn0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
