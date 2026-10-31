package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rg20 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rg20(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg20)) {
            return false;
        }
        rg20 rg20Var = (rg20) obj;
        return this.a.equals(rg20Var.a) && this.b.equals(rg20Var.b) && u890.j(this.c, rg20Var.c) && u890.j(this.d, rg20Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(false) + ((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) - 637232924) * 31);
    }
}
