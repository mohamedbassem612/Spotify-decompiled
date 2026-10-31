package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class osv0 extends ayq0 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final ave0 i;

    public osv0(String str, String str2, String str3, String str4, String str5, String str6, String str7, ave0 ave0Var) {
        super(9);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osv0)) {
            return false;
        }
        osv0 osv0Var = (osv0) obj;
        return u890.j(this.b, osv0Var.b) && u890.j(this.c, osv0Var.c) && u890.j(this.d, osv0Var.d) && u890.j(this.e, osv0Var.e) && u890.j(this.f, osv0Var.f) && u890.j(this.g, osv0Var.g) && u890.j(this.h, osv0Var.h) && u890.j(this.i, osv0Var.i);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ave0 ave0Var = this.i;
        return iHashCode7 + (ave0Var != null ? ave0Var.hashCode() : 0);
    }
}
