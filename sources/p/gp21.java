package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gp21 {
    public final rq2 a;
    public final String b;
    public final uya1 c;
    public final tv80 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public gp21(int i, String str, String str2, String str3, String str4, String str5, rq2 rq2Var, tv80 tv80Var, uya1 uya1Var, boolean z) {
        rq2Var = (i & 1) != 0 ? rq2.HOME_DJ : rq2Var;
        str = (i & 2) != 0 ? null : str;
        tv80Var = (i & 8) != 0 ? null : tv80Var;
        str2 = (i & 16) != 0 ? null : str2;
        str4 = (i & 64) != 0 ? "text" : str4;
        str5 = (i & 128) != 0 ? null : str5;
        z = (i & 256) != 0 ? false : z;
        this.a = rq2Var;
        this.b = str;
        this.c = uya1Var;
        this.d = tv80Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp21)) {
            return false;
        }
        gp21 gp21Var = (gp21) obj;
        return this.a == gp21Var.a && u890.j(this.b, gp21Var.b) && this.c.equals(gp21Var.c) && u890.j(this.d, gp21Var.d) && u890.j(this.e, gp21Var.e) && u890.j(this.f, gp21Var.f) && this.g.equals(gp21Var.g) && u890.j(this.h, gp21Var.h) && this.i == gp21Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        tv80 tv80Var = this.d;
        int iHashCode3 = (iHashCode2 + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iD = cy30.d((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g);
        String str4 = this.h;
        return Boolean.hashCode(this.i) + ((iD + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
