package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u1k0 implements k4k0 {
    public final r920 a;
    public final r920 b;
    public final ha20 c;

    public u1k0(r920 r920Var, r920 r920Var2, ha20 ha20Var) {
        this.a = r920Var;
        this.b = r920Var2;
        this.c = ha20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1k0)) {
            return false;
        }
        u1k0 u1k0Var = (u1k0) obj;
        return u890.j(this.a, u1k0Var.a) && u890.j(this.b, u1k0Var.b) && this.c == u1k0Var.c;
    }

    public final int hashCode() {
        r920 r920Var = this.a;
        int iHashCode = (r920Var == null ? 0 : r920Var.hashCode()) * 31;
        r920 r920Var2 = this.b;
        int iHashCode2 = (iHashCode + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31;
        ha20 ha20Var = this.c;
        return iHashCode2 + (ha20Var != null ? ha20Var.hashCode() : 0);
    }

    public final String toString() {
        r920 r920Var = this.a;
        String strB = r920Var != null ? r920Var.b() : null;
        r920 r920Var2 = this.b;
        StringBuilder sbN = gvg.n("OnApplyCustomFilterCurves(out=", strB, ", in=", r920Var2 != null ? r920Var2.b() : null, ", baseStyleId=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
