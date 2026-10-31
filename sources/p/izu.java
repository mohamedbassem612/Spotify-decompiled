package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class izu {
    public final Float a;
    public final hzu b;

    public izu(Float f, hzu hzuVar) {
        this.a = f;
        this.b = hzuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izu)) {
            return false;
        }
        izu izuVar = (izu) obj;
        return u890.j(this.a, izuVar.a) && u890.j(this.b, izuVar.b);
    }

    public final int hashCode() {
        Float f = this.a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        hzu hzuVar = this.b;
        return iHashCode + (hzuVar != null ? hzuVar.hashCode() : 0);
    }
}
