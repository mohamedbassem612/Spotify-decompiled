package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x0k0 implements k1k0 {
    public final lhg1 a;
    public final w0k0 b;
    public final lhg1 c;
    public final lhg1 d;

    public x0k0(lhg1 lhg1Var, w0k0 w0k0Var, lhg1 lhg1Var2, lhg1 lhg1Var3) {
        this.a = lhg1Var;
        this.b = w0k0Var;
        this.c = lhg1Var2;
        this.d = lhg1Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0k0)) {
            return false;
        }
        x0k0 x0k0Var = (x0k0) obj;
        return u890.j(this.a, x0k0Var.a) && this.b.equals(x0k0Var.b) && u890.j(this.c, x0k0Var.c) && u890.j(this.d, x0k0Var.d);
    }

    public final int hashCode() {
        lhg1 lhg1Var = this.a;
        int iHashCode = (this.b.hashCode() + ((lhg1Var == null ? 0 : lhg1Var.hashCode()) * 31)) * 31;
        lhg1 lhg1Var2 = this.c;
        return this.d.hashCode() + ((iHashCode + (lhg1Var2 != null ? lhg1Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        lhg1 lhg1Var = this.a;
        String strB = lhg1Var != null ? lhg1Var.b() : null;
        lhg1 lhg1Var2 = this.c;
        String strB2 = lhg1Var2 != null ? lhg1Var2.b() : null;
        String strB3 = this.d.b();
        StringBuilder sbN = gvg.n("SaveTransition(transition=", strB, ", storedTransition=", strB2, ", autoTransition=");
        sbN.append(strB3);
        sbN.append(", destination=");
        sbN.append(this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
