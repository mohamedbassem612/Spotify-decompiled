package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tax0 extends yax0 {
    public final j8x0 a;

    public tax0(j8x0 j8x0Var) {
        this.a = j8x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tax0) && u890.j(this.a, ((tax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
