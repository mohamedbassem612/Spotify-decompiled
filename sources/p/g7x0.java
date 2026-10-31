package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g7x0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final int c;
    public final jdx0 d;

    public g7x0(String str, d8r0 d8r0Var, int i, jdx0 jdx0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = i;
        this.d = jdx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7x0)) {
            return false;
        }
        g7x0 g7x0Var = (g7x0) obj;
        return this.a.equals(g7x0Var.a) && this.b.equals(g7x0Var.b) && this.c == g7x0Var.c && this.d.equals(g7x0Var.d);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + kaa0.f(this.c, hrt.i(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
