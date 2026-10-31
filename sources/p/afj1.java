package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class afj1 {
    public final yej1 a;
    public final String b;
    public final sqj1 c;
    public final String d;
    public final Float e;
    public final String f;

    public afj1(yej1 yej1Var, String str, sqj1 sqj1Var, String str2, Float f, String str3) {
        this.a = yej1Var;
        this.b = str;
        this.c = sqj1Var;
        this.d = str2;
        this.e = f;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afj1)) {
            return false;
        }
        afj1 afj1Var = (afj1) obj;
        return u890.j(this.a, afj1Var.a) && u890.j(this.b, afj1Var.b) && u890.j(this.c, afj1Var.c) && u890.j(this.d, afj1Var.d) && u890.j(this.e, afj1Var.e) && u890.j(this.f, afj1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        sqj1 sqj1Var = this.c;
        int iHashCode = (iD + (sqj1Var == null ? 0 : sqj1Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.e;
        return this.f.hashCode() + ((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31);
    }

    public /* synthetic */ afj1(yej1 yej1Var) {
        this(yej1Var, "", null, null, null, "");
    }
}
