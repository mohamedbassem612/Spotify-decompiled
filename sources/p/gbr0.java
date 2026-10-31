package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbr0 {
    public final rs61 a;
    public final hux b;
    public final ryn1 c;
    public final xt61 d;
    public final sq61 e;

    public gbr0(rs61 rs61Var, hux huxVar, ryn1 ryn1Var, xt61 xt61Var, sq61 sq61Var) {
        this.a = rs61Var;
        this.b = huxVar;
        this.c = ryn1Var;
        this.d = xt61Var;
        this.e = sq61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbr0)) {
            return false;
        }
        gbr0 gbr0Var = (gbr0) obj;
        return this.a.equals(gbr0Var.a) && u890.j(this.b, gbr0Var.b) && u890.j(this.c, gbr0Var.c) && this.d.equals(gbr0Var.d) && u890.j(this.e, gbr0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + eqq.k(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }
}
