package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o3f implements q3f {
    public final v2v a;

    public o3f(v2v v2vVar) {
        this.a = v2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3f) && u890.j(this.a, ((o3f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
