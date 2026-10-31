package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jyf1 implements myf1 {
    public final String a;
    public final String b;
    public final Long c;
    public final ArrayList d;
    public final String e;
    public final int f;
    public final String g;
    public final qtt0 h;
    public final String i;
    public final String j;
    public final lmt0 k;
    public final String l;

    public jyf1(String str, String str2, Long l, ArrayList arrayList, String str3, int i, String str4, qtt0 qtt0Var, String str5, String str6, lmt0 lmt0Var, String str7) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = arrayList;
        this.e = str3;
        this.f = i;
        this.g = str4;
        this.h = qtt0Var;
        this.i = str5;
        this.j = str6;
        this.k = lmt0Var;
        this.l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyf1)) {
            return false;
        }
        jyf1 jyf1Var = (jyf1) obj;
        return u890.j(this.a, jyf1Var.a) && u890.j(this.b, jyf1Var.b) && u890.j(this.c, jyf1Var.c) && this.d.equals(jyf1Var.d) && u890.j(this.e, jyf1Var.e) && this.f == jyf1Var.f && u890.j(this.g, jyf1Var.g) && this.h == jyf1Var.h && u890.j(this.i, jyf1Var.i) && u890.j(this.j, jyf1Var.j) && u890.j(this.k, jyf1Var.k) && u890.j(this.l, jyf1Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        int iF = p3d1.f(this.d, (iD + (l == null ? 0 : l.hashCode())) * 31, 31);
        String str = this.e;
        int iK = ab80.k(1, xcg1.g((iF + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31);
        int i = this.f;
        int iD2 = cy30.d((iK + (i == 0 ? 0 : l1d.C(i))) * 31, 31, this.g);
        qtt0 qtt0Var = this.h;
        int iHashCode = (iD2 + (qtt0Var == null ? 0 : qtt0Var.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        lmt0 lmt0Var = this.k;
        return this.l.hashCode() + ((iHashCode3 + (lmt0Var != null ? lmt0Var.hashCode() : 0)) * 31);
    }
}
