package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbi0 {
    public final nbw0 a;
    public final pjw0 b;
    public final w281 c;
    public final e2k1 d;

    public sbi0(nbw0 nbw0Var, pjw0 pjw0Var, w281 w281Var, e2k1 e2k1Var) {
        this.a = nbw0Var;
        this.b = pjw0Var;
        this.c = w281Var;
        this.d = e2k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbi0)) {
            return false;
        }
        sbi0 sbi0Var = (sbi0) obj;
        return this.a.equals(sbi0Var.a) && u890.j(this.b, sbi0Var.b) && u890.j(this.c, sbi0Var.c) && u890.j(this.d, sbi0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pjw0 pjw0Var = this.b;
        int iHashCode2 = (iHashCode + (pjw0Var == null ? 0 : pjw0Var.hashCode())) * 31;
        w281 w281Var = this.c;
        int iHashCode3 = (iHashCode2 + (w281Var == null ? 0 : w281Var.hashCode())) * 961;
        e2k1 e2k1Var = this.d;
        return iHashCode3 + (e2k1Var != null ? Long.hashCode(e2k1Var.a) : 0);
    }
}
