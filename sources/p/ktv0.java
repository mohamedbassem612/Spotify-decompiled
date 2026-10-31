package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ktv0 extends ayq0 {
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final String m;
    public final htv0 n;
    public final htv0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ave0 f9p;

    public ktv0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, htv0 htv0Var, htv0 htv0Var2, ave0 ave0Var) {
        super(7);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = list;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = htv0Var;
        this.o = htv0Var2;
        this.f9p = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktv0)) {
            return false;
        }
        ktv0 ktv0Var = (ktv0) obj;
        return this.b == ktv0Var.b && u890.j(this.c, ktv0Var.c) && u890.j(this.d, ktv0Var.d) && u890.j(this.e, ktv0Var.e) && u890.j(this.f, ktv0Var.f) && u890.j(this.g, ktv0Var.g) && u890.j(this.h, ktv0Var.h) && u890.j(this.i, ktv0Var.i) && this.j.equals(ktv0Var.j) && u890.j(this.k, ktv0Var.k) && u890.j(this.l, ktv0Var.l) && u890.j(this.m, ktv0Var.m) && u890.j(this.n, ktv0Var.n) && u890.j(this.o, ktv0Var.o) && u890.j(this.f9p, ktv0Var.f9p);
    }

    public final int hashCode() {
        int iC = l1d.C(this.b) * 31;
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iB = f4i1.b((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.j);
        String str8 = this.k;
        int iHashCode7 = (iB + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.l;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.m;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        htv0 htv0Var = this.n;
        int iHashCode10 = (iHashCode9 + (htv0Var == null ? 0 : htv0Var.hashCode())) * 31;
        htv0 htv0Var2 = this.o;
        int iHashCode11 = (iHashCode10 + (htv0Var2 == null ? 0 : htv0Var2.hashCode())) * 31;
        ave0 ave0Var = this.f9p;
        return iHashCode11 + (ave0Var != null ? ave0Var.hashCode() : 0);
    }
}
