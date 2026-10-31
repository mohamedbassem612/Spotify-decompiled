package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0d1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final w281 f;
    public final cd8 g;

    public p0d1(String str, String str2, boolean z, String str3, String str4, w281 w281Var, cd8 cd8Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = w281Var;
        this.g = cd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0d1)) {
            return false;
        }
        p0d1 p0d1Var = (p0d1) obj;
        return this.a.equals(p0d1Var.a) && this.b.equals(p0d1Var.b) && this.c == p0d1Var.c && this.d.equals(p0d1Var.d) && u890.j(this.e, p0d1Var.e) && u890.j(this.f, p0d1Var.f) && u890.j(this.g, p0d1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        w281 w281Var = this.f;
        int iHashCode2 = (iHashCode + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        cd8 cd8Var = this.g;
        return iHashCode2 + (cd8Var != null ? cd8Var.a.hashCode() : 0);
    }
}
