package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fdk {
    public final xkk1 a;
    public final xkk1 b;
    public final m6k c;
    public final ydk d;
    public final eek e;
    public final jek f;

    public fdk(xkk1 xkk1Var, xkk1 xkk1Var2, m6k m6kVar, ydk ydkVar, eek eekVar, jek jekVar) {
        this.a = xkk1Var;
        this.b = xkk1Var2;
        this.c = m6kVar;
        this.d = ydkVar;
        this.e = eekVar;
        this.f = jekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdk)) {
            return false;
        }
        fdk fdkVar = (fdk) obj;
        return u890.j(this.a, fdkVar.a) && u890.j(this.b, fdkVar.b) && this.c.equals(fdkVar.c) && u890.j(this.d, fdkVar.d) && this.e.equals(fdkVar.e) && u890.j(this.f, fdkVar.f);
    }

    public final int hashCode() {
        xkk1 xkk1Var = this.a;
        int iHashCode = (xkk1Var == null ? 0 : xkk1Var.hashCode()) * 31;
        xkk1 xkk1Var2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (xkk1Var2 == null ? 0 : xkk1Var2.hashCode())) * 31)) * 31;
        ydk ydkVar = this.d;
        int iF = p3d1.f(this.e.a, (iHashCode2 + (ydkVar == null ? 0 : ydkVar.hashCode())) * 31, 31);
        jek jekVar = this.f;
        return iF + (jekVar != null ? jekVar.hashCode() : 0);
    }
}
