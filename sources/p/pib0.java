package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pib0 {
    public final String a;
    public final jo70 b;
    public final xkk1 c;

    public pib0(String str, jo70 jo70Var, xkk1 xkk1Var) {
        this.a = str;
        this.b = jo70Var;
        this.c = xkk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pib0)) {
            return false;
        }
        pib0 pib0Var = (pib0) obj;
        return this.a.equals(pib0Var.a) && u890.j(this.b, pib0Var.b) && u890.j(this.c, pib0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        return iHashCode2 + (xkk1Var != null ? xkk1Var.hashCode() : 0);
    }
}
