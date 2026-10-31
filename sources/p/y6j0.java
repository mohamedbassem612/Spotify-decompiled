package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y6j0 extends a7j0 {
    public final e7j0 a;

    public y6j0(e7j0 e7j0Var) {
        this.a = e7j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6j0) && this.a.equals(((y6j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
