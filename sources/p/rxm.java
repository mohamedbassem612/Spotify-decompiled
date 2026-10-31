package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rxm {
    public final jo70 a;
    public final k1r b;
    public final f7a1 c;
    public final xkk1 d;

    public rxm(jo70 jo70Var, k1r k1rVar, f7a1 f7a1Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = k1rVar;
        this.c = f7a1Var;
        this.d = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rxm)) {
            return false;
        }
        rxm rxmVar = (rxm) obj;
        return u890.j(this.a, rxmVar.a) && this.b.equals(rxmVar.b) && u890.j(this.c, rxmVar.c) && u890.j(this.d, rxmVar.d);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (this.b.hashCode() + ((jo70Var == null ? 0 : jo70Var.hashCode()) * 31)) * 31;
        f7a1 f7a1Var = this.c;
        int iHashCode2 = (iHashCode + (f7a1Var == null ? 0 : f7a1Var.a.hashCode())) * 31;
        xkk1 xkk1Var = this.d;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
