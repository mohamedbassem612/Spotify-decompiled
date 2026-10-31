package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mt6 {
    public final g07 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public mt6(g07 g07Var, String str, String str2, String str3, String str4, String str5) {
        this.a = g07Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt6)) {
            return false;
        }
        mt6 mt6Var = (mt6) obj;
        return this.a.equals(mt6Var.a) && u890.j(this.b, mt6Var.b) && this.c.equals(mt6Var.c) && this.d.equals(mt6Var.d) && this.e.equals(mt6Var.e) && u890.j(this.f, mt6Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 961, this.d), 31, this.e);
        String str2 = this.f;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
