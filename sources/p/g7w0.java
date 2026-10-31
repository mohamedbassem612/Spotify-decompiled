package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g7w0 {
    public final t7w0 a;
    public final iu30 b;
    public final iu30 c;

    public g7w0(t7w0 t7w0Var, iu30 iu30Var, iu30 iu30Var2) {
        this.a = t7w0Var;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7w0)) {
            return false;
        }
        g7w0 g7w0Var = (g7w0) obj;
        return u890.j(this.a, g7w0Var.a) && u890.j(this.b, g7w0Var.b) && u890.j(this.c, g7w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
