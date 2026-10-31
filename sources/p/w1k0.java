package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w1k0 implements k4k0 {
    public final s69 a;
    public final s69 b;
    public final duk1 c;

    public w1k0(s69 s69Var, s69 s69Var2, duk1 duk1Var) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = duk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1k0)) {
            return false;
        }
        w1k0 w1k0Var = (w1k0) obj;
        return u890.j(this.a, w1k0Var.a) && u890.j(this.b, w1k0Var.b) && this.c == w1k0Var.c;
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iHashCode2 = (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        duk1 duk1Var = this.c;
        return iHashCode2 + (duk1Var != null ? duk1Var.hashCode() : 0);
    }

    public final String toString() {
        s69 s69Var = this.a;
        String strA = s69Var != null ? s69Var.a() : null;
        s69 s69Var2 = this.b;
        StringBuilder sbN = gvg.n("OnApplyCustomVolumeCurves(out=", strA, ", in=", s69Var2 != null ? s69Var2.a() : null, ", baseStyleId=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
