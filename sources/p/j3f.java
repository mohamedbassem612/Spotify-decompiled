package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j3f implements q3f {
    public final h5f a;

    public j3f(h5f h5fVar) {
        this.a = h5fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3f) && this.a == ((j3f) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
