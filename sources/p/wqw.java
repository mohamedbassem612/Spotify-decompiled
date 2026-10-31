package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wqw implements yqw {
    public final xzq a;

    public wqw(xzq xzqVar) {
        this.a = xzqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqw) && this.a == ((wqw) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
