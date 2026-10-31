package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lsf1 {
    public final qaa1 a;
    public final hll b;
    public final ixa1 c;
    public final ro7 d;
    public final boolean e;

    public lsf1(qaa1 qaa1Var, hll hllVar, ixa1 ixa1Var, ro7 ro7Var, boolean z) {
        this.a = qaa1Var;
        this.b = hllVar;
        this.c = ixa1Var;
        this.d = ro7Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf1)) {
            return false;
        }
        lsf1 lsf1Var = (lsf1) obj;
        return u890.j(this.a, lsf1Var.a) && u890.j(this.b, lsf1Var.b) && u890.j(this.c, lsf1Var.c) && u890.j(this.d, lsf1Var.d) && this.e == lsf1Var.e;
    }

    public final int hashCode() {
        qaa1 qaa1Var = this.a;
        int iHashCode = (qaa1Var == null ? 0 : Boolean.hashCode(qaa1Var.a)) * 31;
        hll hllVar = this.b;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        ixa1 ixa1Var = this.c;
        int iHashCode3 = (iHashCode2 + (ixa1Var == null ? 0 : Boolean.hashCode(ixa1Var.a))) * 31;
        ro7 ro7Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (ro7Var != null ? ro7Var.hashCode() : 0)) * 31);
    }
}
