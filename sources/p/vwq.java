package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vwq {
    public final uho a;
    public final vnb1 b;

    public vwq(uho uhoVar, vnb1 vnb1Var) {
        this.a = uhoVar;
        this.b = vnb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwq)) {
            return false;
        }
        vwq vwqVar = (vwq) obj;
        return this.a.equals(vwqVar.a) && u890.j(this.b, vwqVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vnb1 vnb1Var = this.b;
        return iHashCode + (vnb1Var == null ? 0 : vnb1Var.hashCode());
    }
}
