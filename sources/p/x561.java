package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x561 {
    public final zen0 a;
    public final zen0 b;

    public x561(zen0 zen0Var, zen0 zen0Var2) {
        this.a = zen0Var;
        this.b = zen0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x561)) {
            return false;
        }
        x561 x561Var = (x561) obj;
        return u890.j(this.a, x561Var.a) && u890.j(this.b, x561Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
