package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ddw {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Long e;
    public final String f;
    public final tv80 g;

    public ddw(Long l, String str, String str2, String str3, String str4, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = l;
        this.f = str4;
        this.g = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddw)) {
            return false;
        }
        ddw ddwVar = (ddw) obj;
        return u890.j(this.a, ddwVar.a) && u890.j(this.b, ddwVar.b) && u890.j(this.c, ddwVar.c) && this.d == ddwVar.d && u890.j(this.e, ddwVar.e) && u890.j(this.f, ddwVar.f) && u890.j(this.g, ddwVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        int iD2 = cy30.d((iG + (l == null ? 0 : l.hashCode())) * 31, 31, this.f);
        tv80 tv80Var = this.g;
        return iD2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
