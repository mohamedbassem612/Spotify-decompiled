package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h1w0 {
    public final c1w0 a;
    public final f1w0 b;
    public final g1w0 c;
    public final e1w0 d;
    public final b1w0 e;
    public final a1w0 f;
    public final d1w0 g;

    public h1w0(c1w0 c1w0Var, f1w0 f1w0Var, g1w0 g1w0Var, e1w0 e1w0Var, b1w0 b1w0Var, a1w0 a1w0Var, d1w0 d1w0Var) {
        this.a = c1w0Var;
        this.b = f1w0Var;
        this.c = g1w0Var;
        this.d = e1w0Var;
        this.e = b1w0Var;
        this.f = a1w0Var;
        this.g = d1w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1w0)) {
            return false;
        }
        h1w0 h1w0Var = (h1w0) obj;
        return this.a.equals(h1w0Var.a) && this.b.equals(h1w0Var.b) && this.c.equals(h1w0Var.c) && this.d.equals(h1w0Var.d) && this.e.equals(h1w0Var.e) && this.f.equals(h1w0Var.f) && u890.j(this.g, h1w0Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        d1w0 d1w0Var = this.g;
        return iHashCode + (d1w0Var == null ? 0 : d1w0Var.hashCode());
    }
}
