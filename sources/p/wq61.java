package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wq61 {
    public final rs61 a;
    public final hux b;
    public final ryn1 c;
    public final xt61 d;
    public final Object e;

    public wq61(rs61 rs61Var, hux huxVar, ryn1 ryn1Var, xt61 xt61Var, Object obj) {
        this.a = rs61Var;
        this.b = huxVar;
        this.c = ryn1Var;
        this.d = xt61Var;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq61)) {
            return false;
        }
        wq61 wq61Var = (wq61) obj;
        return this.a.equals(wq61Var.a) && u890.j(this.b, wq61Var.b) && u890.j(this.c, wq61Var.c) && this.d.equals(wq61Var.d) && u890.j(this.e, wq61Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + eqq.k(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        Object obj = this.e;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }
}
