package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ol6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final q8b h;
    public final String i;
    public final d8r0 j;
    public final int k;
    public final hl6 l;
    public final il6 m;
    public final Integer n;
    public final String o;

    public ol6(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, q8b q8bVar, String str5, d8r0 d8r0Var, int i, hl6 hl6Var, il6 il6Var, Integer num, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = q8bVar;
        this.i = str5;
        this.j = d8r0Var;
        this.k = i;
        this.l = hl6Var;
        this.m = il6Var;
        this.n = num;
        this.o = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol6)) {
            return false;
        }
        ol6 ol6Var = (ol6) obj;
        return u890.j(this.a, ol6Var.a) && u890.j(this.b, ol6Var.b) && u890.j(this.c, ol6Var.c) && u890.j(this.d, ol6Var.d) && this.e == ol6Var.e && this.f == ol6Var.f && this.g == ol6Var.g && this.h.equals(ol6Var.h) && u890.j(this.i, ol6Var.i) && this.j.equals(ol6Var.j) && this.k == ol6Var.k && u890.j(this.l, ol6Var.l) && u890.j(this.m, ol6Var.m) && u890.j(this.n, ol6Var.n) && u890.j(this.o, ol6Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = kaa0.f(this.k, hrt.i(this.j, cy30.d((this.h.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31), 31);
        hl6 hl6Var = this.l;
        int iHashCode = (iF + (hl6Var == null ? 0 : hl6Var.hashCode())) * 31;
        il6 il6Var = this.m;
        int iHashCode2 = (iHashCode + (il6Var == null ? 0 : il6Var.hashCode())) * 31;
        Integer num = this.n;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.o;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
