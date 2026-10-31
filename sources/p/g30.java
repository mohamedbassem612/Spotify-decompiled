package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g30 implements qq60 {
    public final String a;
    public final op80 b;
    public final k30 c;

    public g30(String str, op80 op80Var, k30 k30Var) {
        this.a = str;
        this.b = op80Var;
        this.c = k30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g30)) {
            return false;
        }
        g30 g30Var = (g30) obj;
        return this.a.equals(g30Var.a) && this.b.equals(g30Var.b) && this.c.equals(g30Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
