package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yv2 {
    public final Integer a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public yv2(Integer num, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv2)) {
            return false;
        }
        yv2 yv2Var = (yv2) obj;
        return u890.j(this.a, yv2Var.a) && u890.j(this.b, yv2Var.b) && this.c.equals(yv2Var.c) && this.d == yv2Var.d && u890.j(this.e, yv2Var.e) && u890.j(this.f, yv2Var.f) && this.g.equals(yv2Var.g) && u890.j(this.h, yv2Var.h) && u890.j(this.i, yv2Var.i) && u890.j(this.j, yv2Var.j) && u890.j(this.k, yv2Var.k) && u890.j(this.l, yv2Var.l);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iK = ab80.k(this.d, cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31);
        String str2 = this.e;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iD = cy30.d((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        int iHashCode3 = (iD + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        return iHashCode6 + (str8 != null ? str8.hashCode() : 0);
    }
}
