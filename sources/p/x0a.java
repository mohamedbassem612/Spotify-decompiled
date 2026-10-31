package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x0a implements g1a {
    public final o1v a;

    public x0a(o1v o1vVar) {
        this.a = o1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0a) && this.a == ((x0a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
