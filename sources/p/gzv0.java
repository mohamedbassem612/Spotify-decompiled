package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gzv0 extends hzv0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final Integer j;
    public final c380 k;
    public final c380 l;
    public final int m;
    public final String n;

    public gzv0(String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, String str6, Integer num, c380 c380Var, c380 c380Var2, int i2, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = str6;
        this.j = num;
        this.k = c380Var;
        this.l = c380Var2;
        this.m = i2;
        this.n = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzv0)) {
            return false;
        }
        gzv0 gzv0Var = (gzv0) obj;
        return u890.j(this.a, gzv0Var.a) && u890.j(this.b, gzv0Var.b) && u890.j(this.c, gzv0Var.c) && this.d.equals(gzv0Var.d) && this.e.equals(gzv0Var.e) && this.f == gzv0Var.f && this.g == gzv0Var.g && this.h == gzv0Var.h && u890.j(this.i, gzv0Var.i) && u890.j(this.j, gzv0Var.j) && u890.j(this.k, gzv0Var.k) && u890.j(this.l, gzv0Var.l) && this.m == gzv0Var.m && u890.j(this.n, gzv0Var.n);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(kaa0.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.j;
        return this.n.hashCode() + kaa0.f(this.m, kk0.f(this.l, kk0.f(this.k, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31);
    }
}
