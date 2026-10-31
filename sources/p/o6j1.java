package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o6j1 {
    public final String a;
    public final x360 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final k6j1 j;
    public final k6j1 k;
    public final lsm0 l;
    public final boolean m;
    public final String n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f25p;

    public o6j1(String str, x360 x360Var, String str2, String str3, String str4, String str5, String str6, String str7, String str8, k6j1 k6j1Var, k6j1 k6j1Var2, lsm0 lsm0Var, boolean z, String str9, String str10, String str11) {
        this.a = str;
        this.b = x360Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = k6j1Var;
        this.k = k6j1Var2;
        this.l = lsm0Var;
        this.m = z;
        this.n = str9;
        this.o = str10;
        this.f25p = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6j1)) {
            return false;
        }
        o6j1 o6j1Var = (o6j1) obj;
        return this.a.equals(o6j1Var.a) && u890.j(this.b, o6j1Var.b) && this.c.equals(o6j1Var.c) && u890.j(this.d, o6j1Var.d) && u890.j(this.e, o6j1Var.e) && u890.j(this.f, o6j1Var.f) && u890.j(this.g, o6j1Var.g) && u890.j(this.h, o6j1Var.h) && u890.j(this.i, o6j1Var.i) && u890.j(this.j, o6j1Var.j) && u890.j(this.k, o6j1Var.k) && this.l.equals(o6j1Var.l) && this.m == o6j1Var.m && this.n.equals(o6j1Var.n) && u890.j(this.o, o6j1Var.o) && this.f25p.equals(o6j1Var.f25p);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode2 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        k6j1 k6j1Var = this.j;
        int iHashCode3 = (iHashCode2 + (k6j1Var == null ? 0 : k6j1Var.hashCode())) * 31;
        k6j1 k6j1Var2 = this.k;
        int iD2 = cy30.d(xcg1.g((this.l.hashCode() + ((iHashCode3 + (k6j1Var2 == null ? 0 : k6j1Var2.hashCode())) * 31)) * 31, 31, this.m), 31, this.n);
        String str2 = this.o;
        return this.f25p.hashCode() + ((iD2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
