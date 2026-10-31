package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o781 implements q781 {
    public final String a;
    public final jo70 b;
    public final xkk1 c;
    public final iam d;
    public final hll e;
    public final w281 f;
    public final va81 g;
    public final cd8 h;
    public final c98 i;
    public final n781 j;
    public final m781 k;
    public final xwp0 l;

    public o781(String str, jo70 jo70Var, xkk1 xkk1Var, iam iamVar, hll hllVar, w281 w281Var, va81 va81Var, cd8 cd8Var, c98 c98Var, n781 n781Var, m781 m781Var, xwp0 xwp0Var) {
        this.a = str;
        this.b = jo70Var;
        this.c = xkk1Var;
        this.d = iamVar;
        this.e = hllVar;
        this.f = w281Var;
        this.g = va81Var;
        this.h = cd8Var;
        this.i = c98Var;
        this.j = n781Var;
        this.k = m781Var;
        this.l = xwp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o781)) {
            return false;
        }
        o781 o781Var = (o781) obj;
        return u890.j(this.a, o781Var.a) && u890.j(this.b, o781Var.b) && u890.j(this.c, o781Var.c) && u890.j(this.d, o781Var.d) && u890.j(this.e, o781Var.e) && u890.j(this.f, o781Var.f) && u890.j(this.g, o781Var.g) && u890.j(this.h, o781Var.h) && u890.j(this.i, o781Var.i) && this.j.equals(o781Var.j) && this.k.equals(o781Var.k) && this.l.equals(o781Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        iam iamVar = this.d;
        int iC = (iHashCode3 + (iamVar == null ? 0 : l1d.C(iamVar.a))) * 31;
        hll hllVar = this.e;
        int iHashCode4 = (iC + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        w281 w281Var = this.f;
        int iHashCode5 = (iHashCode4 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        va81 va81Var = this.g;
        int iHashCode6 = (iHashCode5 + (va81Var == null ? 0 : va81Var.hashCode())) * 31;
        cd8 cd8Var = this.h;
        int iHashCode7 = (iHashCode6 + (cd8Var == null ? 0 : cd8Var.a.hashCode())) * 31;
        c98 c98Var = this.i;
        return this.l.hashCode() + xcg1.g((this.j.hashCode() + ((iHashCode7 + (c98Var != null ? c98Var.a.hashCode() : 0)) * 31)) * 31, 31, this.k.a);
    }
}
