package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y4f implements z4f {
    public final w4i1 a;

    public y4f(w4i1 w4i1Var) {
        this.a = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4f) && this.a.equals(((y4f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
