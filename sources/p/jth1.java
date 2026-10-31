package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jth1 {
    public final c380 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ith1 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final String k;

    public jth1(c380 c380Var, String str, String str2, String str3, String str4, ith1 ith1Var, boolean z, boolean z2, boolean z3, String str5, String str6) {
        this.a = c380Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = ith1Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str5;
        this.k = str6;
    }

    public static jth1 a(jth1 jth1Var, c380 c380Var, String str, boolean z, boolean z2, String str2, String str3, int i) {
        return new jth1((i & 1) != 0 ? jth1Var.a : c380Var, (i & 2) != 0 ? jth1Var.b : str, jth1Var.c, jth1Var.d, jth1Var.e, jth1Var.f, (i & 64) != 0 ? jth1Var.g : z, (i & 128) != 0 ? jth1Var.h : true, (i & 256) != 0 ? jth1Var.i : z2, (i & 512) != 0 ? jth1Var.j : str2, (i & 1024) != 0 ? jth1Var.k : str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jth1)) {
            return false;
        }
        jth1 jth1Var = (jth1) obj;
        return u890.j(this.a, jth1Var.a) && this.b.equals(jth1Var.b) && this.c.equals(jth1Var.c) && u890.j(this.d, jth1Var.d) && u890.j(this.e, jth1Var.e) && u890.j(this.f, jth1Var.f) && this.g == jth1Var.g && this.h == jth1Var.h && this.i == jth1Var.i && this.j.equals(jth1Var.j) && this.k.equals(jth1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ith1 ith1Var = this.f;
        return this.k.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g((iHashCode2 + (ith1Var != null ? ith1Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
