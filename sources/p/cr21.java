package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cr21 {
    public final xkk1 a;
    public final ydk b;
    public final m6k c;
    public final jo70 d;

    public cr21(xkk1 xkk1Var, ydk ydkVar, m6k m6kVar, jo70 jo70Var) {
        this.a = xkk1Var;
        this.b = ydkVar;
        this.c = m6kVar;
        this.d = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr21)) {
            return false;
        }
        cr21 cr21Var = (cr21) obj;
        return u890.j(this.a, cr21Var.a) && u890.j(this.b, cr21Var.b) && u890.j(this.c, cr21Var.c) && u890.j(this.d, cr21Var.d);
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iHashCode = (xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31;
        ydk ydkVar = this.b;
        int iHashCode2 = (iHashCode + (ydkVar == null ? 0 : ydkVar.hashCode())) * 31;
        m6k m6kVar = this.c;
        int iHashCode3 = (iHashCode2 + (m6kVar == null ? 0 : m6kVar.hashCode())) * 31;
        jo70 jo70Var = this.d;
        return iHashCode3 + (jo70Var != null ? jo70Var.hashCode() : 0);
    }
}
