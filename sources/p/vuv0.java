package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vuv0 extends ayq0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ave0 f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final uuv0 m;

    public vuv0(String str, String str2, String str3, String str4, ave0 ave0Var, String str5, String str6, String str7, String str8, String str9, String str10, uuv0 uuv0Var) {
        super(2);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = ave0Var;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = uuv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuv0)) {
            return false;
        }
        vuv0 vuv0Var = (vuv0) obj;
        return u890.j(this.b, vuv0Var.b) && u890.j(this.c, vuv0Var.c) && u890.j(this.d, vuv0Var.d) && u890.j(this.e, vuv0Var.e) && u890.j(this.f, vuv0Var.f) && u890.j(this.g, vuv0Var.g) && u890.j(this.h, vuv0Var.h) && u890.j(this.i, vuv0Var.i) && u890.j(this.j, vuv0Var.j) && u890.j(this.k, vuv0Var.k) && u890.j(this.l, vuv0Var.l) && u890.j(this.m, vuv0Var.m);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ave0 ave0Var = this.f;
        int iHashCode5 = (iHashCode4 + (ave0Var == null ? 0 : ave0Var.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.l;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        uuv0 uuv0Var = this.m;
        return iHashCode11 + (uuv0Var != null ? uuv0Var.a.hashCode() : 0);
    }
}
