package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i1f implements q3f {
    public final goe a;

    public i1f(goe goeVar) {
        this.a = goeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1f) && u890.j(this.a, ((i1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
