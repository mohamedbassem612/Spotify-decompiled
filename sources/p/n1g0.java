package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n1g0 {
    public final r1g0 a;
    public final bbr0 b;
    public final eq80 c;

    public n1g0(r1g0 r1g0Var, bbr0 bbr0Var, eq80 eq80Var) {
        this.a = r1g0Var;
        this.b = bbr0Var;
        this.c = eq80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n1g0) {
            n1g0 n1g0Var = (n1g0) obj;
            if (this.a == n1g0Var.a && u890.j(this.b, n1g0Var.b) && this.c.equals(n1g0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.b.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
