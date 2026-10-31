package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class og60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final mg60 i;

    public og60(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, mg60 mg60Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = mg60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og60)) {
            return false;
        }
        og60 og60Var = (og60) obj;
        return u890.j(this.a, og60Var.a) && u890.j(this.b, og60Var.b) && u890.j(this.c, og60Var.c) && u890.j(this.d, og60Var.d) && u890.j(this.e, og60Var.e) && u890.j(this.f, og60Var.f) && u890.j(this.g, og60Var.g) && u890.j(this.h, og60Var.h) && this.i == og60Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        mg60 mg60Var = this.i;
        return iHashCode6 + (mg60Var != null ? mg60Var.hashCode() : 0);
    }
}
