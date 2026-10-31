package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g590 {
    public final yly a;
    public final dcx b;
    public final jny c;
    public final vxy d;
    public final b590 e;
    public final f590 f;
    public final bdy g;
    public final ecy h;
    public final svx i;
    public final cjy j;
    public final nhy k;

    public g590(yly ylyVar, dcx dcxVar, jny jnyVar, vxy vxyVar, b590 b590Var, f590 f590Var, bdy bdyVar, ecy ecyVar, svx svxVar, cjy cjyVar, nhy nhyVar) {
        this.a = ylyVar;
        this.b = dcxVar;
        this.c = jnyVar;
        this.d = vxyVar;
        this.e = b590Var;
        this.f = f590Var;
        this.g = bdyVar;
        this.h = ecyVar;
        this.i = svxVar;
        this.j = cjyVar;
        this.k = nhyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g590)) {
            return false;
        }
        g590 g590Var = (g590) obj;
        return u890.j(this.a, g590Var.a) && this.b.equals(g590Var.b) && u890.j(this.c, g590Var.c) && this.d.equals(g590Var.d) && u890.j(this.e, g590Var.e) && u890.j(this.f, g590Var.f) && u890.j(this.g, g590Var.g) && u890.j(this.h, g590Var.h) && this.i == g590Var.i && u890.j(this.j, g590Var.j) && u890.j(this.k, g590Var.k);
    }

    public final int hashCode() {
        yly ylyVar = this.a;
        int iHashCode = (this.b.hashCode() + ((ylyVar == null ? 0 : ylyVar.hashCode()) * 31)) * 31;
        jny jnyVar = this.c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (jnyVar == null ? 0 : jnyVar.hashCode())) * 31)) * 31;
        b590 b590Var = this.e;
        int iHashCode3 = (iHashCode2 + (b590Var == null ? 0 : b590Var.hashCode())) * 31;
        f590 f590Var = this.f;
        int iHashCode4 = (iHashCode3 + (f590Var == null ? 0 : f590Var.hashCode())) * 31;
        bdy bdyVar = this.g;
        int iHashCode5 = (iHashCode4 + (bdyVar == null ? 0 : bdyVar.hashCode())) * 31;
        ecy ecyVar = this.h;
        int iHashCode6 = (this.j.hashCode() + ((this.i.hashCode() + ((iHashCode5 + (ecyVar == null ? 0 : ecyVar.hashCode())) * 31)) * 31)) * 31;
        nhy nhyVar = this.k;
        return iHashCode6 + (nhyVar != null ? nhyVar.hashCode() : 0);
    }
}
