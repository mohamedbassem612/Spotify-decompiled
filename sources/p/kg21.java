package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kg21 {
    public final x4i1 a;

    public kg21(x4i1 x4i1Var) {
        this.a = x4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kg21) && u890.j(this.a, ((kg21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
