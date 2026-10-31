package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b5f implements d5f {
    public final w4i1 a;

    public b5f(w4i1 w4i1Var) {
        this.a = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5f) && u890.j(this.a, ((b5f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
