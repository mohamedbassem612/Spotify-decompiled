package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tba {
    public final n6r0 a;
    public final qir0 b;
    public final y6r0 c;
    public final u8h1 d;

    public tba(n6r0 n6r0Var, qir0 qir0Var, y6r0 y6r0Var, u8h1 u8h1Var) {
        this.a = n6r0Var;
        this.b = qir0Var;
        this.c = y6r0Var;
        this.d = u8h1Var;
    }

    public static tba a(tba tbaVar, awz0 awz0Var, y6r0 y6r0Var, u8h1 u8h1Var, int i) {
        if ((i & 1) != 0) {
            awz0Var = tbaVar.a;
        }
        qir0 qir0Var = tbaVar.b;
        if ((i & 4) != 0) {
            y6r0Var = tbaVar.c;
        }
        if ((i & 8) != 0) {
            u8h1Var = tbaVar.d;
        }
        tbaVar.getClass();
        return new tba(awz0Var, qir0Var, y6r0Var, u8h1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tba)) {
            return false;
        }
        tba tbaVar = (tba) obj;
        return u890.j(this.a, tbaVar.a) && u890.j(this.b, tbaVar.b) && this.c.equals(tbaVar.c) && u890.j(this.d, tbaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qir0 qir0Var = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (qir0Var == null ? 0 : qir0Var.a.hashCode())) * 31, 31, this.c.a);
    }
}
