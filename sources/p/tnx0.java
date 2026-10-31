package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tnx0 implements qq60 {
    public final String a;
    public final op80 b;
    public final xnx0 c;

    public tnx0(String str, op80 op80Var, xnx0 xnx0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = xnx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnx0)) {
            return false;
        }
        tnx0 tnx0Var = (tnx0) obj;
        return this.a.equals(tnx0Var.a) && this.b.equals(tnx0Var.b) && this.c.equals(tnx0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
