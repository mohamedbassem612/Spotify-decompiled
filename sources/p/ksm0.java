package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ksm0 {
    public final ujo1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ ksm0(ujo1 ujo1Var, String str, String str2, String str3, String str4, String str5, int i) {
        this(ujo1Var, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksm0)) {
            return false;
        }
        ksm0 ksm0Var = (ksm0) obj;
        return u890.j(this.a, ksm0Var.a) && u890.j(this.b, ksm0Var.b) && u890.j(this.c, ksm0Var.c) && u890.j(this.d, ksm0Var.d) && u890.j(this.e, ksm0Var.e) && u890.j(this.f, ksm0Var.f) && u890.j(this.g, ksm0Var.g) && u890.j(this.h, ksm0Var.h) && u890.j(this.i, ksm0Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iD = cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int iHashCode3 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public ksm0(ujo1 ujo1Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.a = ujo1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }
}
