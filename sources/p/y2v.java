package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y2v {
    public final Throwable a;

    public y2v(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2v) && this.a.equals(((y2v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
