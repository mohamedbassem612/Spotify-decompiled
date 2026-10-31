package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bbl1 implements ez00 {
    public final String a;
    public final String b;
    public final zal1 c;
    public final abl1 d;
    public final zal1 e;
    public final Double f;
    public final String g;
    public final zal1 h;
    public final yal1 i;
    public final String j;

    public bbl1(String str, String str2, zal1 zal1Var, abl1 abl1Var, zal1 zal1Var2, Double d, String str3, zal1 zal1Var3, yal1 yal1Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = zal1Var;
        this.d = abl1Var;
        this.e = zal1Var2;
        this.f = d;
        this.g = str3;
        this.h = zal1Var3;
        this.i = yal1Var;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbl1)) {
            return false;
        }
        bbl1 bbl1Var = (bbl1) obj;
        return this.a.equals(bbl1Var.a) && this.b.equals(bbl1Var.b) && u890.j(this.c, bbl1Var.c) && u890.j(this.d, bbl1Var.d) && u890.j(this.e, bbl1Var.e) && u890.j(this.f, bbl1Var.f) && this.g.equals(bbl1Var.g) && u890.j(this.h, bbl1Var.h) && u890.j(this.i, bbl1Var.i) && this.j.equals(bbl1Var.j);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        zal1 zal1Var = this.c;
        int iHashCode = (iD + (zal1Var == null ? 0 : zal1Var.hashCode())) * 31;
        abl1 abl1Var = this.d;
        int iHashCode2 = (iHashCode + (abl1Var == null ? 0 : abl1Var.hashCode())) * 31;
        zal1 zal1Var2 = this.e;
        int iHashCode3 = (iHashCode2 + (zal1Var2 == null ? 0 : zal1Var2.hashCode())) * 31;
        Double d = this.f;
        int iD2 = cy30.d((iHashCode3 + (d == null ? 0 : d.hashCode())) * 31, 31, this.g);
        zal1 zal1Var3 = this.h;
        int iHashCode4 = (iD2 + (zal1Var3 == null ? 0 : zal1Var3.hashCode())) * 31;
        yal1 yal1Var = this.i;
        return this.j.hashCode() + ((iHashCode4 + (yal1Var != null ? yal1Var.hashCode() : 0)) * 31);
    }
}
