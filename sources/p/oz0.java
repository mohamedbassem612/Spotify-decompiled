package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oz0 {
    public final List a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public oz0(List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz0)) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return u890.j(this.a, oz0Var.a) && u890.j(this.b, oz0Var.b) && u890.j(this.c, oz0Var.c) && u890.j(this.d, oz0Var.d) && u890.j(this.e, oz0Var.e) && u890.j(this.f, oz0Var.f) && u890.j(this.g, oz0Var.g) && u890.j(this.h, oz0Var.h) && u890.j(this.i, oz0Var.i) && u890.j(this.j, oz0Var.j) && u890.j(this.k, oz0Var.k);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
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
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.j;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.k;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }
}
