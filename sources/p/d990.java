package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d990 implements g990 {
    public final qan a;
    public final x990 b;
    public final y990 c;
    public final frr0 d;
    public final tob1 e;

    public d990(qan qanVar, x990 x990Var, y990 y990Var, frr0 frr0Var, ven0 ven0Var) {
        this.a = qanVar;
        this.b = x990Var;
        this.c = y990Var;
        this.d = frr0Var;
        this.e = ven0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d990) {
            d990 d990Var = (d990) obj;
            if (u890.j(this.a, d990Var.a) && this.b == d990Var.b && this.c == d990Var.c && this.d == d990Var.d && u890.j(this.e, d990Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        tob1 tob1Var = this.e;
        return iHashCode + (tob1Var == null ? 0 : tob1Var.hashCode());
    }
}
