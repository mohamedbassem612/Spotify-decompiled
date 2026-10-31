package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wlt0 implements xlt0 {
    public final ruz a;

    public wlt0(ruz ruzVar) {
        this.a = ruzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlt0) && this.a == ((wlt0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
