package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kgn0 {
    public final jgn0 a;

    public kgn0(jgn0 jgn0Var) {
        this.a = jgn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgn0) && this.a == ((kgn0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
