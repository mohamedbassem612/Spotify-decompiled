package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tmy {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;

    public tmy(hll hllVar, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmy)) {
            return false;
        }
        tmy tmyVar = (tmy) obj;
        return this.a.equals(tmyVar.a) && u890.j(this.b, tmyVar.b) && u890.j(this.c, tmyVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        int iHashCode2 = (iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        hll hllVar = this.c;
        return iHashCode2 + (hllVar != null ? hllVar.hashCode() : 0);
    }
}
