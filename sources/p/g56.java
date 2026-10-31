package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g56 {
    public final String a;
    public final String b;
    public final String c;
    public final xw51 d;
    public final String e;
    public final String f;
    public final nmu0 g;

    public g56(String str, String str2, String str3, xw51 xw51Var, String str4, String str5, nmu0 nmu0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xw51Var;
        this.e = str4;
        this.f = str5;
        this.g = nmu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g56)) {
            return false;
        }
        g56 g56Var = (g56) obj;
        return u890.j(this.a, g56Var.a) && u890.j(this.b, g56Var.b) && u890.j(this.c, g56Var.c) && u890.j(this.d, g56Var.d) && u890.j(this.e, g56Var.e) && u890.j(this.f, g56Var.f) && this.g == g56Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        xw51 xw51Var = this.d;
        int iHashCode4 = (iHashCode3 + (xw51Var == null ? 0 : xw51Var.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        nmu0 nmu0Var = this.g;
        return iHashCode6 + (nmu0Var != null ? nmu0Var.hashCode() : 0);
    }
}
