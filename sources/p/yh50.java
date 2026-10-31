package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yh50 {
    public final dhr0 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public yh50(dhr0 dhr0Var, String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2) {
        this.a = dhr0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = z;
        this.n = z2;
    }

    public static yh50 a(yh50 yh50Var, boolean z) {
        return new yh50(yh50Var.a, yh50Var.b, yh50Var.c, yh50Var.d, yh50Var.e, yh50Var.f, yh50Var.g, yh50Var.h, yh50Var.i, yh50Var.j, yh50Var.k, yh50Var.l, yh50Var.m, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh50)) {
            return false;
        }
        yh50 yh50Var = (yh50) obj;
        return this.a == yh50Var.a && this.b.equals(yh50Var.b) && u890.j(this.c, yh50Var.c) && u890.j(this.d, yh50Var.d) && u890.j(this.e, yh50Var.e) && u890.j(this.f, yh50Var.f) && u890.j(this.g, yh50Var.g) && u890.j(this.h, yh50Var.h) && u890.j(this.i, yh50Var.i) && u890.j(this.j, yh50Var.j) && u890.j(this.k, yh50Var.k) && u890.j(this.l, yh50Var.l) && this.m == yh50Var.m && this.n == yh50Var.n;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.k;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.l;
        return Boolean.hashCode(this.n) + xcg1.g((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31, 31, this.m);
    }
}
