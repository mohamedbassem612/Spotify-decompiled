package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qe60 {
    public final gw81 a;
    public final xkk1 b;

    public qe60(gw81 gw81Var, xkk1 xkk1Var) {
        this.a = gw81Var;
        this.b = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe60)) {
            return false;
        }
        qe60 qe60Var = (qe60) obj;
        return this.a.equals(qe60Var.a) && u890.j(this.b, qe60Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xkk1 xkk1Var = this.b;
        return iHashCode + (xkk1Var == null ? 0 : xkk1Var.hashCode());
    }
}
