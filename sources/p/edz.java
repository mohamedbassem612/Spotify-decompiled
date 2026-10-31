package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class edz {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof edz) {
            return u890.j(this.a, ((edz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f4i1.f("EpisodeUri(uri=", this.a, ")");
    }
}
