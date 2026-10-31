package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s2g0 implements v2g0 {
    public final gfq0 a;

    public s2g0(gfq0 gfq0Var) {
        this.a = gfq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2g0) && this.a.equals(((s2g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
