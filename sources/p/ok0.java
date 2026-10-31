package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ok0 {
    public final jt61 a;
    public final jt61 b;
    public final lax c;

    public ok0(jt61 jt61Var, jt61 jt61Var2, lax laxVar) {
        this.a = jt61Var;
        this.b = jt61Var2;
        this.c = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok0)) {
            return false;
        }
        ok0 ok0Var = (ok0) obj;
        return u890.j(this.a, ok0Var.a) && u890.j(this.b, ok0Var.b) && u890.j(this.c, ok0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
