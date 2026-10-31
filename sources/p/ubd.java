package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ubd implements vbd {
    public final goe a;

    public ubd(goe goeVar) {
        this.a = goeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ubd) && u890.j(this.a, ((ubd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
