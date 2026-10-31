package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hth1 {
    public final c380 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ith1 f;
    public final String g;
    public final String h;

    public hth1(c380 c380Var, String str, String str2, String str3, String str4, ith1 ith1Var, String str5, String str6) {
        this.a = c380Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = ith1Var;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hth1)) {
            return false;
        }
        hth1 hth1Var = (hth1) obj;
        return u890.j(this.a, hth1Var.a) && this.b.equals(hth1Var.b) && this.c.equals(hth1Var.c) && u890.j(this.d, hth1Var.d) && u890.j(this.e, hth1Var.e) && u890.j(this.f, hth1Var.f) && this.g.equals(hth1Var.g) && this.h.equals(hth1Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ith1 ith1Var = this.f;
        return this.h.hashCode() + cy30.d((iHashCode2 + (ith1Var != null ? ith1Var.hashCode() : 0)) * 31, 31, this.g);
    }
}
