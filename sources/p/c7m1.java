package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c7m1 {
    public final String a;
    public final String b;
    public final cj31 c;
    public final cj31 d;
    public final cj31 e;
    public final cj31 f;
    public final cj31 g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;
    public final boolean o;

    public c7m1(String str, String str2, cj31 cj31Var, cj31 cj31Var2, cj31 cj31Var3, cj31 cj31Var4, cj31 cj31Var5, String str3, int i, int i2, String str4, String str5, int i3, int i4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = cj31Var;
        this.d = cj31Var2;
        this.e = cj31Var3;
        this.f = cj31Var4;
        this.g = cj31Var5;
        this.h = str3;
        this.i = i;
        this.j = i2;
        this.k = str4;
        this.l = str5;
        this.m = i3;
        this.n = i4;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7m1)) {
            return false;
        }
        c7m1 c7m1Var = (c7m1) obj;
        return this.a.equals(c7m1Var.a) && this.b.equals(c7m1Var.b) && u890.j(this.c, c7m1Var.c) && u890.j(this.d, c7m1Var.d) && u890.j(this.e, c7m1Var.e) && u890.j(this.f, c7m1Var.f) && u890.j(this.g, c7m1Var.g) && u890.j(this.h, c7m1Var.h) && this.i == c7m1Var.i && this.j == c7m1Var.j && this.k.equals(c7m1Var.k) && this.l.equals(c7m1Var.l) && this.m == c7m1Var.m && this.n == c7m1Var.n && this.o == c7m1Var.o;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31;
        cj31 cj31Var = this.f;
        int iHashCode2 = (iHashCode + (cj31Var == null ? 0 : cj31Var.hashCode())) * 31;
        cj31 cj31Var2 = this.g;
        int iHashCode3 = (iHashCode2 + (cj31Var2 == null ? 0 : cj31Var2.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.o) + kaa0.f(this.n, kaa0.f(this.m, cy30.d(cy30.d(kaa0.f(this.j, kaa0.f(this.i, (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31), 31), 31, this.k), 31, this.l), 31), 31);
    }
}
