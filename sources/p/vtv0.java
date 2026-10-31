package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vtv0 {
    public final String a;
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
    public final int l;
    public final boolean m;
    public final qp20 n;
    public final qp20 o;

    public vtv0(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, String str7, String str8, String str9, String str10, int i, boolean z, qp20 qp20Var, qp20 qp20Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = i;
        this.m = z;
        this.n = qp20Var;
        this.o = qp20Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtv0)) {
            return false;
        }
        vtv0 vtv0Var = (vtv0) obj;
        return u890.j(this.a, vtv0Var.a) && u890.j(this.b, vtv0Var.b) && u890.j(this.c, vtv0Var.c) && u890.j(this.d, vtv0Var.d) && u890.j(this.e, vtv0Var.e) && this.f.equals(vtv0Var.f) && u890.j(this.g, vtv0Var.g) && u890.j(this.h, vtv0Var.h) && u890.j(this.i, vtv0Var.i) && u890.j(this.j, vtv0Var.j) && u890.j(this.k, vtv0Var.k) && this.l == vtv0Var.l && this.m == vtv0Var.m && u890.j(this.n, vtv0Var.n) && u890.j(this.o, vtv0Var.o);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iB = f4i1.b((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f);
        String str6 = this.g;
        int iHashCode5 = (iB + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.k;
        int iG = xcg1.g(kaa0.f(12, kaa0.f(16, kaa0.f(this.l, (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31, 31), 31), 31), 31, this.m);
        qp20 qp20Var = this.n;
        int iHashCode9 = (iG + (qp20Var == null ? 0 : qp20Var.hashCode())) * 31;
        qp20 qp20Var2 = this.o;
        return iHashCode9 + (qp20Var2 != null ? qp20Var2.hashCode() : 0);
    }
}
