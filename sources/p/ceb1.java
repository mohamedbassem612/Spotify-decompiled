package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ceb1 {
    public final xkk1 a;
    public final qfd b;
    public final hll c;
    public final cmj1 d;
    public final boolean e;

    public ceb1(xkk1 xkk1Var, qfd qfdVar, hll hllVar, cmj1 cmj1Var, boolean z) {
        this.a = xkk1Var;
        this.b = qfdVar;
        this.c = hllVar;
        this.d = cmj1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceb1)) {
            return false;
        }
        ceb1 ceb1Var = (ceb1) obj;
        return u890.j(this.a, ceb1Var.a) && u890.j(this.b, ceb1Var.b) && u890.j(this.c, ceb1Var.c) && this.d == ceb1Var.d && this.e == ceb1Var.e;
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iHashCode = (xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31;
        qfd qfdVar = this.b;
        int iHashCode2 = (iHashCode + (qfdVar == null ? 0 : qfdVar.hashCode())) * 31;
        hll hllVar = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (hllVar != null ? hllVar.hashCode() : 0)) * 31)) * 31);
    }
}
