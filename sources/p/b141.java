package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b141 implements d141 {
    public final ai8 a;
    public final gg8 b;
    public final g1f0 c;

    public b141(ai8 ai8Var, gg8 gg8Var, g1f0 g1f0Var) {
        this.a = ai8Var;
        this.b = gg8Var;
        this.c = g1f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b141)) {
            return false;
        }
        b141 b141Var = (b141) obj;
        return u890.j(this.a, b141Var.a) && u890.j(this.b, b141Var.b) && u890.j(this.c, b141Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
