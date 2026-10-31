package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k7l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;
    public final String k;
    public final long l;
    public final long m;
    public final Float n;
    public final boolean o;

    public k7l1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, long j, long j2, Float f, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = num;
        this.j = str9;
        this.k = str10;
        this.l = j;
        this.m = j2;
        this.n = f;
        this.o = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7l1)) {
            return false;
        }
        k7l1 k7l1Var = (k7l1) obj;
        return u890.j(this.a, k7l1Var.a) && this.b.equals(k7l1Var.b) && this.c.equals(k7l1Var.c) && this.d.equals(k7l1Var.d) && u890.j(this.e, k7l1Var.e) && u890.j(this.f, k7l1Var.f) && u890.j(this.g, k7l1Var.g) && this.h.equals(k7l1Var.h) && u890.j(this.i, k7l1Var.i) && this.j.equals(k7l1Var.j) && this.k.equals(k7l1Var.k) && this.l == k7l1Var.l && this.m == k7l1Var.m && u890.j(this.n, k7l1Var.n) && this.o == k7l1Var.o;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        int iF = cy30.f(cy30.f(cy30.d(cy30.d((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.j), 31, this.k), this.l, 31), this.m, 31);
        Float f = this.n;
        return Boolean.hashCode(this.o) + ((iF + (f != null ? f.hashCode() : 0)) * 31);
    }
}
