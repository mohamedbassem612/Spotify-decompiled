package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fh50 implements ih50 {
    public final Throwable a;

    public fh50(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh50) && this.a.equals(((fh50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
