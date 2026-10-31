package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y5l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final Float h;
    public final ljj1 i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    public y5l1(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, Float f, ljj1 ljj1Var, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = f;
        this.i = ljj1Var;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5l1)) {
            return false;
        }
        y5l1 y5l1Var = (y5l1) obj;
        return this.a.equals(y5l1Var.a) && u890.j(this.b, y5l1Var.b) && u890.j(this.c, y5l1Var.c) && this.d.equals(y5l1Var.d) && this.e.equals(y5l1Var.e) && this.f == y5l1Var.f && this.g == y5l1Var.g && u890.j(this.h, y5l1Var.h) && u890.j(this.i, y5l1Var.i) && this.j.equals(y5l1Var.j) && this.k.equals(y5l1Var.k) && this.l.equals(y5l1Var.l) && this.m.equals(y5l1Var.m);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iG = xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, false);
        Float f = this.h;
        int iHashCode3 = (iG + (f == null ? 0 : f.hashCode())) * 31;
        ljj1 ljj1Var = this.i;
        return this.m.hashCode() + cy30.d(cy30.d(cy30.d(xcg1.g((((iHashCode3 + (ljj1Var != null ? ljj1Var.hashCode() : 0)) * 31) + 1545820101) * 31, 31, true), 31, this.j), 31, this.k), 31, this.l);
    }
}
