package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uxi1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final txi1 k;

    public uxi1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, txi1 txi1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = list;
        this.k = txi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxi1)) {
            return false;
        }
        uxi1 uxi1Var = (uxi1) obj;
        return this.a.equals(uxi1Var.a) && this.b.equals(uxi1Var.b) && u890.j(this.c, uxi1Var.c) && this.d.equals(uxi1Var.d) && this.e.equals(uxi1Var.e) && u890.j(this.f, uxi1Var.f) && this.g.equals(uxi1Var.g) && this.h.equals(uxi1Var.h) && u890.j(this.i, uxi1Var.i) && u890.j(this.j, uxi1Var.j) && u890.j(this.k, uxi1Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int iD3 = cy30.d(cy30.d(xcg1.g((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, false), 31, this.g), 31, this.h);
        String str3 = this.i;
        int iB = f4i1.b((iD3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        txi1 txi1Var = this.k;
        return iB + (txi1Var != null ? txi1Var.hashCode() : 0);
    }
}
