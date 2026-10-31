package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uhs0 {
    public final y6r0 a;
    public final n6r0 b;
    public final qir0 c;
    public final long d;
    public final u8h1 e;

    public uhs0(y6r0 y6r0Var, n6r0 n6r0Var, qir0 qir0Var, long j, u8h1 u8h1Var) {
        this.a = y6r0Var;
        this.b = n6r0Var;
        this.c = qir0Var;
        this.d = j;
        this.e = u8h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhs0)) {
            return false;
        }
        uhs0 uhs0Var = (uhs0) obj;
        return this.a.equals(uhs0Var.a) && u890.j(this.b, uhs0Var.b) && u890.j(this.c, uhs0Var.c) && this.d == uhs0Var.d && u890.j(this.e, uhs0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        qir0 qir0Var = this.c;
        return this.e.hashCode() + cy30.f((iHashCode + (qir0Var == null ? 0 : qir0Var.a.hashCode())) * 31, this.d, 31);
    }
}
