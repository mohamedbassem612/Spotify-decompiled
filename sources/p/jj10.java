package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jj10 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    public jj10(String str, String str2, String str3, long j, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = str11;
        this.n = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj10)) {
            return false;
        }
        jj10 jj10Var = (jj10) obj;
        return this.a.equals(jj10Var.a) && this.b.equals(jj10Var.b) && this.c.equals(jj10Var.c) && this.d == jj10Var.d && this.e.equals(jj10Var.e) && this.f == jj10Var.f && this.g.equals(jj10Var.g) && this.h.equals(jj10Var.h) && u890.j(this.i, jj10Var.i) && u890.j(this.j, jj10Var.j) && u890.j(this.k, jj10Var.k) && u890.j(this.l, jj10Var.l) && u890.j(this.m, jj10Var.m) && this.n.equals(jj10Var.n);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(ab80.k(this.f, cy30.d(cy30.f(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e), 31), 31, this.g), 31, this.h);
        String str = this.i;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        return this.n.hashCode() + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }
}
