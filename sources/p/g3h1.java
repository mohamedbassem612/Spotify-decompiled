package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g3h1 extends x2s {
    public final n8h1 b;

    public g3h1(n8h1 n8h1Var) {
        super(y1x0.U0);
        this.b = n8h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3h1) && u890.j(this.b, ((g3h1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
