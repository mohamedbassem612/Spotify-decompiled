package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sn2 implements tn2 {
    public final String a;
    public final String b;
    public final Long c;
    public final String d;
    public final String e;
    public final ijg1 f;
    public final h290 g;
    public final boolean h;
    public final boolean i;
    public final tv80 j;
    public final String k;
    public final String l;

    public sn2(String str, String str2, Long l, String str3, String str4, ijg1 ijg1Var, h290 h290Var, boolean z, boolean z2, tv80 tv80Var, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = str4;
        this.f = ijg1Var;
        this.g = h290Var;
        this.h = z;
        this.i = z2;
        this.j = tv80Var;
        this.k = str5;
        this.l = str6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn2)) {
            return false;
        }
        sn2 sn2Var = (sn2) obj;
        return this.a.equals(sn2Var.a) && u890.j(this.b, sn2Var.b) && u890.j(this.c, sn2Var.c) && u890.j(this.d, sn2Var.d) && u890.j(this.e, sn2Var.e) && this.f == sn2Var.f && this.g.equals(sn2Var.g) && this.h == sn2Var.h && this.i == sn2Var.i && u890.j(this.j, sn2Var.j) && u890.j(this.k, sn2Var.k) && u890.j(this.l, sn2Var.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ijg1 ijg1Var = this.f;
        int iG = xcg1.g(xcg1.g(kk0.g(this.g, (iHashCode5 + (ijg1Var == null ? 0 : ijg1Var.hashCode())) * 31, 31), 31, this.h), 31, this.i);
        tv80 tv80Var = this.j;
        int iHashCode6 = (iG + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }
}
