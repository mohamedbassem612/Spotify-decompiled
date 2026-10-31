package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ant0 {
    public final ont0 a;
    public final zkm b;
    public final hwt c;

    public ant0(ont0 ont0Var, zkm zkmVar, hwt hwtVar) {
        this.a = ont0Var;
        this.b = zkmVar;
        this.c = hwtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ant0)) {
            return false;
        }
        ant0 ant0Var = (ant0) obj;
        return u890.j(this.a, ant0Var.a) && u890.j(this.b, ant0Var.b) && u890.j(this.c, ant0Var.c);
    }

    public final int hashCode() {
        ont0 ont0Var = this.a;
        int iHashCode = (ont0Var == null ? 0 : ont0Var.hashCode()) * 31;
        zkm zkmVar = this.b;
        int iHashCode2 = (iHashCode + (zkmVar == null ? 0 : zkmVar.hashCode())) * 31;
        hwt hwtVar = this.c;
        return iHashCode2 + (hwtVar != null ? hwtVar.hashCode() : 0);
    }

    public /* synthetic */ ant0() {
        this(null, null, null);
    }
}
