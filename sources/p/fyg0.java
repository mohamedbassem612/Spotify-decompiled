package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fyg0 {
    public final iu30 a;
    public final float b;
    public final iu30 c;

    public fyg0(iu30 iu30Var, float f, iu30 iu30Var2) {
        this.a = iu30Var;
        this.b = f;
        this.c = iu30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyg0)) {
            return false;
        }
        fyg0 fyg0Var = (fyg0) obj;
        return u890.j(this.a, fyg0Var.a) && p3v.c(this.b, fyg0Var.b) && u890.j(this.c, fyg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(this.a.hashCode() * 31, 31, this.b);
    }
}
