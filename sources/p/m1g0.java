package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1g0 {
    public final s6a a;
    public final ehc0 b;
    public final b7p0 c;
    public final ehc0 d;
    public final t1g0 e;

    public m1g0(s6a s6aVar, ehc0 ehc0Var, b7p0 b7p0Var, ehc0 ehc0Var2, t1g0 t1g0Var) {
        this.a = s6aVar;
        this.b = ehc0Var;
        this.c = b7p0Var;
        this.d = ehc0Var2;
        this.e = t1g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1g0) {
            m1g0 m1g0Var = (m1g0) obj;
            if (this.a == m1g0Var.a && this.b == m1g0Var.b && this.c == m1g0Var.c && this.d == m1g0Var.d && u890.j(this.e, m1g0Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
