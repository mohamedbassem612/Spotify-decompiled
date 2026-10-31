package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s2c1 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final c380 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final String k;
    public final c380 l;
    public final boolean m;
    public final String n;

    public s2c1(String str, String str2, int i, String str3, c380 c380Var, boolean z, boolean z2, boolean z3, String str4, String str5, String str6, c380 c380Var2, boolean z4, String str7, int i2) {
        i = (i2 & 4) != 0 ? 7 : i;
        z2 = (i2 & 128) != 0 ? false : z2;
        boolean z5 = (i2 & 8192) == 0 ? z4 : false;
        String str8 = (i2 & 16384) != 0 ? "" : str7;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = c380Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = c380Var2;
        this.m = z5;
        this.n = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2c1)) {
            return false;
        }
        s2c1 s2c1Var = (s2c1) obj;
        return this.a.equals(s2c1Var.a) && this.b.equals(s2c1Var.b) && this.c == s2c1Var.c && this.d.equals(s2c1Var.d) && u890.j(this.e, s2c1Var.e) && this.f == s2c1Var.f && this.g == s2c1Var.g && this.h == s2c1Var.h && this.i.equals(s2c1Var.i) && u890.j(this.j, s2c1Var.j) && u890.j(this.k, s2c1Var.k) && u890.j(this.l, s2c1Var.l) && this.m == s2c1Var.m && this.n.equals(s2c1Var.n);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(xcg1.g(xcg1.g(kk0.f(this.e, cy30.d(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 961), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c380 c380Var = this.l;
        return this.n.hashCode() + xcg1.g((iHashCode2 + (c380Var != null ? c380Var.hashCode() : 0)) * 31, 31, this.m);
    }
}
