package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qb61 {
    public final vb61 a;
    public final boolean b;
    public final iu30 c;

    public qb61(vb61 vb61Var, boolean z, iu30 iu30Var) {
        this.a = vb61Var;
        this.b = z;
        this.c = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb61)) {
            return false;
        }
        qb61 qb61Var = (qb61) obj;
        return u890.j(this.a, qb61Var.a) && this.b == qb61Var.b && u890.j(this.c, qb61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
