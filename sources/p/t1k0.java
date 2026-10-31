package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t1k0 implements k4k0 {
    public final gez a;
    public final gez b;
    public final jez c;

    public t1k0(gez gezVar, gez gezVar2, jez jezVar) {
        this.a = gezVar;
        this.b = gezVar2;
        this.c = jezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1k0)) {
            return false;
        }
        t1k0 t1k0Var = (t1k0) obj;
        return u890.j(this.a, t1k0Var.a) && u890.j(this.b, t1k0Var.b) && this.c == t1k0Var.c;
    }

    public final int hashCode() {
        gez gezVar = this.a;
        int iHashCode = (gezVar == null ? 0 : gezVar.hashCode()) * 31;
        gez gezVar2 = this.b;
        int iHashCode2 = (iHashCode + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31;
        jez jezVar = this.c;
        return iHashCode2 + (jezVar != null ? jezVar.hashCode() : 0);
    }

    public final String toString() {
        gez gezVar = this.a;
        String strA = gezVar != null ? gezVar.a() : null;
        gez gezVar2 = this.b;
        StringBuilder sbN = gvg.n("OnApplyCustomEqCurves(out=", strA, ", in=", gezVar2 != null ? gezVar2.a() : null, ", baseStyleId=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
