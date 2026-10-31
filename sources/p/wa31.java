package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wa31 implements ab31 {
    public final ega1 a;
    public final km90 b;

    public wa31(ega1 ega1Var, km90 km90Var) {
        this.a = ega1Var;
        this.b = km90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa31)) {
            return false;
        }
        wa31 wa31Var = (wa31) obj;
        return u890.j(this.a, wa31Var.a) && u890.j(this.b, wa31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
