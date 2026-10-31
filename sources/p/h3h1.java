package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h3h1 extends x2s {
    public final iu30 b;

    public h3h1(iu30 iu30Var) {
        super(a2x0.V0);
        this.b = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3h1) && u890.j(this.b, ((h3h1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
