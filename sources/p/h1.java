package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h1 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final tn30 g;
    public final Long h;
    public final String i;
    public final Integer j;
    public final String k;
    public final boolean l;
    public final String m;
    public final y0 n;
    public final b1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b1 f10p;

    public h1(String str, String str2, int i, String str3, String str4, int i2, tn30 tn30Var, Long l, String str5, Integer num, String str6, boolean z, String str7, y0 y0Var, b1 b1Var, b1 b1Var2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = tn30Var;
        this.h = l;
        this.i = str5;
        this.j = num;
        this.k = str6;
        this.l = z;
        this.m = str7;
        this.n = y0Var;
        this.o = b1Var;
        this.f10p = b1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return u890.j(this.a, h1Var.a) && u890.j(this.b, h1Var.b) && this.c == h1Var.c && this.d.equals(h1Var.d) && u890.j(this.e, h1Var.e) && this.f == h1Var.f && u890.j(this.g, h1Var.g) && u890.j(this.h, h1Var.h) && u890.j(this.i, h1Var.i) && u890.j(this.j, h1Var.j) && u890.j(this.k, h1Var.k) && this.l == h1Var.l && u890.j(this.m, h1Var.m) && this.n.equals(h1Var.n) && u890.j(this.o, h1Var.o) && u890.j(this.f10p, h1Var.f10p);
    }

    public final int hashCode() {
        int iD = cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.f;
        int iC = (iHashCode + (i == 0 ? 0 : l1d.C(i))) * 31;
        tn30 tn30Var = this.g;
        int iHashCode2 = (iC + (tn30Var == null ? 0 : tn30Var.hashCode())) * 31;
        Long l = this.h;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.j;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.k;
        return this.f10p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + cy30.d(xcg1.g((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.l), 31, this.m)) * 31)) * 31);
    }
}
