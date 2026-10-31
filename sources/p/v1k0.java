package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v1k0 implements k4k0 {
    public final ox30 a;
    public final ox30 b;
    public final rx30 c;

    public v1k0(ox30 ox30Var, ox30 ox30Var2, rx30 rx30Var) {
        this.a = ox30Var;
        this.b = ox30Var2;
        this.c = rx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1k0)) {
            return false;
        }
        v1k0 v1k0Var = (v1k0) obj;
        return u890.j(this.a, v1k0Var.a) && u890.j(this.b, v1k0Var.b) && this.c == v1k0Var.c;
    }

    public final int hashCode() {
        ox30 ox30Var = this.a;
        int iHashCode = (ox30Var == null ? 0 : ox30Var.hashCode()) * 31;
        ox30 ox30Var2 = this.b;
        int iHashCode2 = (iHashCode + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31;
        rx30 rx30Var = this.c;
        return iHashCode2 + (rx30Var != null ? rx30Var.hashCode() : 0);
    }

    public final String toString() {
        ox30 ox30Var = this.a;
        String strB = ox30Var != null ? ox30Var.b() : null;
        ox30 ox30Var2 = this.b;
        StringBuilder sbN = gvg.n("OnApplyCustomFxCurves(out=", strB, ", in=", ox30Var2 != null ? ox30Var2.b() : null, ", baseStyleId=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
