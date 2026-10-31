package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lnu0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hnu0 e;
    public final gnu0 f;
    public final boolean g;

    public lnu0(String str, String str2, String str3, String str4, hnu0 hnu0Var, gnu0 gnu0Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hnu0Var;
        this.f = gnu0Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnu0)) {
            return false;
        }
        lnu0 lnu0Var = (lnu0) obj;
        return u890.j(this.a, lnu0Var.a) && u890.j(this.b, lnu0Var.b) && u890.j(this.c, lnu0Var.c) && u890.j(this.d, lnu0Var.d) && u890.j(this.e, lnu0Var.e) && u890.j(this.f, lnu0Var.f) && this.g == lnu0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        hnu0 hnu0Var = this.e;
        int iHashCode3 = (iHashCode2 + (hnu0Var == null ? 0 : hnu0Var.hashCode())) * 31;
        gnu0 gnu0Var = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode3 + (gnu0Var != null ? gnu0Var.hashCode() : 0)) * 31);
    }
}
