package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9w0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final xk41 g;
    public final zlk1 h;
    public final ArrayList i;
    public final r591 j;
    public final String k;
    public final String l;
    public final String m;

    public e9w0(String str, String str2, String str3, String str4, String str5, String str6, xk41 xk41Var, zlk1 zlk1Var, ArrayList arrayList, r591 r591Var, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = xk41Var;
        this.h = zlk1Var;
        this.i = arrayList;
        this.j = r591Var;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9w0)) {
            return false;
        }
        e9w0 e9w0Var = (e9w0) obj;
        return this.a.equals(e9w0Var.a) && this.b.equals(e9w0Var.b) && this.c.equals(e9w0Var.c) && this.d.equals(e9w0Var.d) && u890.j(this.e, e9w0Var.e) && this.f.equals(e9w0Var.f) && u890.j(this.g, e9w0Var.g) && u890.j(this.h, e9w0Var.h) && this.i.equals(e9w0Var.i) && this.j == e9w0Var.j && this.k.equals(e9w0Var.k) && u890.j(this.l, e9w0Var.l) && u890.j(this.m, e9w0Var.m);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        xk41 xk41Var = this.g;
        int iHashCode = (iD2 + (xk41Var == null ? 0 : xk41Var.hashCode())) * 31;
        zlk1 zlk1Var = this.h;
        int iF = p3d1.f(this.i, (iHashCode + (zlk1Var == null ? 0 : zlk1Var.hashCode())) * 31, 31);
        r591 r591Var = this.j;
        int iD3 = cy30.d((iF + (r591Var == null ? 0 : r591Var.hashCode())) * 31, 31, this.k);
        String str2 = this.l;
        int iHashCode2 = (iD3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
