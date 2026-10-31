package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class el6 {
    public final c9 a;
    public final long b;
    public final cl6 c;
    public final vzq0 d;

    public el6(c9 c9Var, long j, cl6 cl6Var, vzq0 vzq0Var) {
        this.a = c9Var;
        this.b = j;
        this.c = cl6Var;
        this.d = vzq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el6)) {
            return false;
        }
        el6 el6Var = (el6) obj;
        if (!u890.j(this.a, el6Var.a)) {
            return false;
        }
        long j = el6Var.b;
        int i = u7h.l;
        return z4h1.b(this.b, j) && u890.j(this.c, el6Var.c) && u890.j(this.d, el6Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = u7h.l;
        return this.d.hashCode() + ((this.c.hashCode() + cy30.f(iHashCode, this.b, 31)) * 31);
    }
}
