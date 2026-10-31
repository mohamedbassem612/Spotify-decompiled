package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xaw0 {
    public final zkm a;
    public final hwt b;
    public final i091 c;
    public final boolean d;

    public xaw0(zkm zkmVar, hwt hwtVar, i091 i091Var, boolean z) {
        this.a = zkmVar;
        this.b = hwtVar;
        this.c = i091Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaw0)) {
            return false;
        }
        xaw0 xaw0Var = (xaw0) obj;
        return u890.j(this.a, xaw0Var.a) && u890.j(this.b, xaw0Var.b) && u890.j(this.c, xaw0Var.c) && this.d == xaw0Var.d;
    }

    public final int hashCode() {
        zkm zkmVar = this.a;
        int iHashCode = (zkmVar == null ? 0 : zkmVar.hashCode()) * 31;
        hwt hwtVar = this.b;
        int iHashCode2 = (iHashCode + (hwtVar == null ? 0 : hwtVar.hashCode())) * 31;
        i091 i091Var = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (i091Var != null ? i091Var.hashCode() : 0)) * 31);
    }
}
