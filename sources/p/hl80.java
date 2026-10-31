package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hl80 {
    public final xk80 a;
    public final iu30 b;
    public final iu30 c;

    public hl80(xk80 xk80Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = xk80Var;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl80)) {
            return false;
        }
        hl80 hl80Var = (hl80) obj;
        return this.a.equals(hl80Var.a) && u890.j(this.b, hl80Var.b) && u890.j(this.c, hl80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
