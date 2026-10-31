package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gsa0 implements lsa0 {
    public final String a;
    public final rq2 b;
    public final String c;
    public final uya1 d;
    public final tv80 e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public gsa0(int i, String str, String str2, String str3, String str4, String str5, rq2 rq2Var, tv80 tv80Var, uya1 uya1Var, boolean z) {
        tv80Var = (i & 16) != 0 ? null : tv80Var;
        str5 = (i & 128) != 0 ? "text" : str5;
        z = (i & 256) != 0 ? false : z;
        this.a = str;
        this.b = rq2Var;
        this.c = str2;
        this.d = uya1Var;
        this.e = tv80Var;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsa0)) {
            return false;
        }
        gsa0 gsa0Var = (gsa0) obj;
        return u890.j(this.a, gsa0Var.a) && this.b == gsa0Var.b && this.c.equals(gsa0Var.c) && this.d.equals(gsa0Var.d) && u890.j(this.e, gsa0Var.e) && u890.j(this.f, gsa0Var.f) && u890.j(this.g, gsa0Var.g) && this.h.equals(gsa0Var.h) && this.i == gsa0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31;
        tv80 tv80Var = this.e;
        int iHashCode2 = (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str = this.f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return Boolean.hashCode(this.i) + cy30.d((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.h);
    }
}
