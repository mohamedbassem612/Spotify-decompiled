package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwa1 {
    public final h2v a;
    public final hll b;
    public final ro7 c;
    public final qtt0 d;
    public final qxc0 e;
    public final cmj1 f;

    public wwa1(h2v h2vVar, hll hllVar, ro7 ro7Var, qtt0 qtt0Var, qxc0 qxc0Var, cmj1 cmj1Var) {
        this.a = h2vVar;
        this.b = hllVar;
        this.c = ro7Var;
        this.d = qtt0Var;
        this.e = qxc0Var;
        this.f = cmj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwa1)) {
            return false;
        }
        wwa1 wwa1Var = (wwa1) obj;
        return u890.j(this.a, wwa1Var.a) && u890.j(this.b, wwa1Var.b) && u890.j(this.c, wwa1Var.c) && this.d == wwa1Var.d && u890.j(this.e, wwa1Var.e) && this.f == wwa1Var.f;
    }

    public final int hashCode() {
        h2v h2vVar = this.a;
        int iHashCode = (h2vVar == null ? 0 : h2vVar.hashCode()) * 31;
        hll hllVar = this.b;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        ro7 ro7Var = this.c;
        int iHashCode3 = (iHashCode2 + (ro7Var == null ? 0 : ro7Var.hashCode())) * 31;
        qtt0 qtt0Var = this.d;
        int iHashCode4 = (iHashCode3 + (qtt0Var == null ? 0 : qtt0Var.hashCode())) * 31;
        qxc0 qxc0Var = this.e;
        return this.f.hashCode() + ((iHashCode4 + (qxc0Var != null ? qxc0Var.hashCode() : 0)) * 31);
    }
}
