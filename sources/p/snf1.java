package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class snf1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final cet0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final vnf1 m;

    public snf1(String str, String str2, String str3, String str4, String str5, String str6, cet0 cet0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vnf1 vnf1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = cet0Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = vnf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snf1)) {
            return false;
        }
        snf1 snf1Var = (snf1) obj;
        return this.a.equals(snf1Var.a) && this.b.equals(snf1Var.b) && this.c.equals(snf1Var.c) && this.d.equals(snf1Var.d) && this.e.equals(snf1Var.e) && u890.j(this.f, snf1Var.f) && this.g.equals(snf1Var.g) && this.h == snf1Var.h && this.i == snf1Var.i && this.j == snf1Var.j && this.k == snf1Var.k && this.l == snf1Var.l && u890.j(this.m, snf1Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.g.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, true), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        vnf1 vnf1Var = this.m;
        return iG + (vnf1Var != null ? vnf1Var.hashCode() : 0);
    }
}
