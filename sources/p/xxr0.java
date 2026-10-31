package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xxr0 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final boolean m;
    public final String n;
    public final int o;

    public xxr0(String str, int i, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, String str6, int i3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = i2;
        this.m = z6;
        this.n = str6;
        this.o = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxr0)) {
            return false;
        }
        xxr0 xxr0Var = (xxr0) obj;
        return u890.j(this.a, xxr0Var.a) && this.b == xxr0Var.b && this.c.equals(xxr0Var.c) && this.d.equals(xxr0Var.d) && u890.j(this.e, xxr0Var.e) && u890.j(this.f, xxr0Var.f) && this.g == xxr0Var.g && this.h == xxr0Var.h && this.i == xxr0Var.i && this.j == xxr0Var.j && this.k == xxr0Var.k && this.l == xxr0Var.l && this.m == xxr0Var.m && u890.j(this.n, xxr0Var.n) && this.o == xxr0Var.o;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iG = xcg1.g(ab80.k(this.l, xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m);
        String str3 = this.n;
        return l1d.C(this.o) + ((iG + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
