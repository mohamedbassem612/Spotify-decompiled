package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h5l implements i5l {
    public final l0l a;

    public h5l(l0l l0lVar) {
        this.a = l0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h5l) && u890.j(this.a, ((h5l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
