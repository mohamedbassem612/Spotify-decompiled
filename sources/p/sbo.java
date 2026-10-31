package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sbo {
    public final String a;
    public final int b;
    public final d8r0 c;
    public final String d;
    public final String e;
    public final String f;
    public final c380 g;
    public final boolean h;
    public final String i;
    public final List j;
    public final String k;
    public final qbo l;

    public sbo(String str, int i, d8r0 d8r0Var, String str2, String str3, String str4, c380 c380Var, String str5, List list, String str6, qbo qboVar, int i2) {
        boolean z = (i2 & 128) == 0;
        str5 = (i2 & 256) != 0 ? null : str5;
        list = (i2 & 512) != 0 ? null : list;
        str6 = (i2 & 1024) != 0 ? null : str6;
        this.a = str;
        this.b = i;
        this.c = d8r0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = c380Var;
        this.h = z;
        this.i = str5;
        this.j = list;
        this.k = str6;
        this.l = qboVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbo)) {
            return false;
        }
        sbo sboVar = (sbo) obj;
        return u890.j(this.a, sboVar.a) && this.b == sboVar.b && this.c.equals(sboVar.c) && u890.j(this.d, sboVar.d) && u890.j(this.e, sboVar.e) && u890.j(this.f, sboVar.f) && u890.j(this.g, sboVar.g) && this.h == sboVar.h && u890.j(this.i, sboVar.i) && u890.j(this.j, sboVar.j) && u890.j(this.k, sboVar.k) && this.l.equals(sboVar.l);
    }

    public final int hashCode() {
        int iD = cy30.d(hrt.i(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iG = xcg1.g(kk0.f(this.g, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.h);
        String str3 = this.i;
        int iHashCode2 = (iG + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.j;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.k;
        return this.l.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
