package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wb41 {
    public final int a;
    public final float b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final Integer k;
    public final String l;
    public final String m;
    public final String n;
    public final Boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f22p;
    public final List q;
    public final yb41 r;

    public wb41(int i, float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Boolean bool, List list, List list2, yb41 yb41Var) {
        this.a = i;
        this.b = f;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = num;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = bool;
        this.f22p = list;
        this.q = list2;
        this.r = yb41Var;
    }

    public static wb41 a(wb41 wb41Var, int i, float f, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, String str10, String str11, Boolean bool, List list, List list2, yb41 yb41Var, int i2) {
        int i3 = (i2 & 1) != 0 ? wb41Var.a : i;
        float f2 = (i2 & 2) != 0 ? wb41Var.b : f;
        String str12 = (i2 & 4) != 0 ? wb41Var.c : str;
        String str13 = (i2 & 8) != 0 ? wb41Var.d : str2;
        String str14 = (i2 & 16) != 0 ? wb41Var.e : str3;
        String str15 = (i2 & 32) != 0 ? wb41Var.f : str4;
        wb41Var.getClass();
        wb41Var.getClass();
        wb41Var.getClass();
        String str16 = (i2 & 512) != 0 ? wb41Var.g : str5;
        String str17 = (i2 & 1024) != 0 ? wb41Var.h : str6;
        wb41Var.getClass();
        wb41Var.getClass();
        wb41Var.getClass();
        wb41Var.getClass();
        wb41Var.getClass();
        String str18 = (65536 & i2) != 0 ? wb41Var.i : str7;
        String str19 = (131072 & i2) != 0 ? wb41Var.j : str8;
        Integer num2 = (262144 & i2) != 0 ? wb41Var.k : num;
        String str20 = (524288 & i2) != 0 ? wb41Var.l : str9;
        String str21 = (1048576 & i2) != 0 ? wb41Var.m : str10;
        String str22 = (2097152 & i2) != 0 ? wb41Var.n : str11;
        Boolean bool2 = (i2 & 4194304) != 0 ? wb41Var.o : bool;
        List list3 = (i2 & 8388608) != 0 ? wb41Var.f22p : list;
        List list4 = (i2 & 16777216) != 0 ? wb41Var.q : list2;
        yb41 yb41Var2 = (i2 & 33554432) != 0 ? wb41Var.r : yb41Var;
        wb41Var.getClass();
        return new wb41(i3, f2, str12, str13, str14, str15, str16, str17, str18, str19, num2, str20, str21, str22, bool2, list3, list4, yb41Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb41)) {
            return false;
        }
        wb41 wb41Var = (wb41) obj;
        return this.a == wb41Var.a && Float.compare(this.b, wb41Var.b) == 0 && u890.j(this.c, wb41Var.c) && u890.j(this.d, wb41Var.d) && u890.j(this.e, wb41Var.e) && u890.j(this.f, wb41Var.f) && u890.j(this.g, wb41Var.g) && u890.j(this.h, wb41Var.h) && u890.j(this.i, wb41Var.i) && u890.j(this.j, wb41Var.j) && u890.j(this.k, wb41Var.k) && u890.j(this.l, wb41Var.l) && u890.j(this.m, wb41Var.m) && u890.j(this.n, wb41Var.n) && u890.j(this.o, wb41Var.o) && u890.j(this.f22p, wb41Var.f22p) && u890.j(this.q, wb41Var.q) && this.r == wb41Var.r;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(x0d.f(l1d.C(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 923521, this.f), 31, this.g), 887503681, this.h), 31, this.i), 31, this.j);
        Integer num = this.k;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.m;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.n;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.o;
        return this.r.hashCode() + f4i1.b(f4i1.b((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.f22p), 31, this.q);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ wb41() {
        yb41 yb41Var = yb41.NOTHING;
        z6x z6xVar = z6x.a;
        this(1, 0.0f, "", "", "", "", "", "", "", "", null, null, null, null, null, z6xVar, z6xVar, yb41Var);
    }
}
