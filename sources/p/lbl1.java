package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lbl1 implements w8l1 {
    public final String a;
    public final String b;
    public final String c;
    public final vpl d;
    public final ibl1 e;
    public final String f;
    public final c9 g;
    public final kbl1 h;
    public final r160 i;

    public lbl1(String str, String str2, String str3, vpl vplVar, ibl1 ibl1Var, String str4, c9 c9Var, kbl1 kbl1Var, r160 r160Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vplVar;
        this.e = ibl1Var;
        this.f = str4;
        this.g = c9Var;
        this.h = kbl1Var;
        this.i = r160Var;
    }

    @Override // p.w8l1
    public final vpl a() {
        return this.d;
    }

    @Override // p.w8l1
    public final r160 b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbl1)) {
            return false;
        }
        lbl1 lbl1Var = (lbl1) obj;
        return this.a.equals(lbl1Var.a) && this.b.equals(lbl1Var.b) && this.c.equals(lbl1Var.c) && u890.j(this.d, lbl1Var.d) && this.e.equals(lbl1Var.e) && this.f.equals(lbl1Var.f) && u890.j(this.g, lbl1Var.g) && u890.j(this.h, lbl1Var.h) && u890.j(this.i, lbl1Var.i);
    }

    @Override // p.w8l1
    public final String getItemId() {
        return this.a;
    }

    @Override // p.w8l1
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        vpl vplVar = this.d;
        int iHashCode = (this.g.hashCode() + cy30.d((this.e.hashCode() + ((iD + (vplVar == null ? 0 : vplVar.hashCode())) * 31)) * 31, 31, this.f)) * 31;
        kbl1 kbl1Var = this.h;
        int iHashCode2 = (iHashCode + (kbl1Var == null ? 0 : kbl1Var.hashCode())) * 961;
        r160 r160Var = this.i;
        return iHashCode2 + (r160Var != null ? r160Var.hashCode() : 0);
    }
}
