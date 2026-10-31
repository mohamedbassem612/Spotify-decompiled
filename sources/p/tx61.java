package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tx61 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public tx61(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = str14;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx61)) {
            return false;
        }
        tx61 tx61Var = (tx61) obj;
        return u890.j(this.a, tx61Var.a) && u890.j(this.b, tx61Var.b) && u890.j(this.c, tx61Var.c) && u890.j(this.d, tx61Var.d) && u890.j(this.e, tx61Var.e) && u890.j(this.f, tx61Var.f) && u890.j(this.g, tx61Var.g) && u890.j(this.h, tx61Var.h) && u890.j(this.i, tx61Var.i) && u890.j(this.j, tx61Var.j) && u890.j(this.k, tx61Var.k) && u890.j(this.l, tx61Var.l) && u890.j(this.m, tx61Var.m) && u890.j(this.n, tx61Var.n);
    }

    public final String f() {
        return this.m;
    }

    public final String g() {
        return this.n;
    }

    public final String h() {
        return this.k;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str = this.j;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.m;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.n;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String i() {
        return this.j;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.h;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return this.e;
    }

    public final String n() {
        return this.l;
    }
}
