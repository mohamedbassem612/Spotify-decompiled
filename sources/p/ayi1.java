package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ayi1 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final double f;
    public final double g;
    public final String h;
    public final String i;

    public ayi1(String str, String str2, String str3, String str4, String str5, double d, double d2, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d;
        this.g = d2;
        this.h = str6;
        this.i = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayi1)) {
            return false;
        }
        ayi1 ayi1Var = (ayi1) obj;
        return u890.j(this.a, ayi1Var.a) && u890.j(this.b, ayi1Var.b) && u890.j(this.c, ayi1Var.c) && u890.j(this.d, ayi1Var.d) && u890.j(this.e, ayi1Var.e) && Double.compare(this.f, ayi1Var.f) == 0 && Double.compare(this.g, ayi1Var.g) == 0 && u890.j(this.h, ayi1Var.h) && u890.j(this.i, ayi1Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iE = xcg1.e(this.g, xcg1.e(this.f, (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.h;
        int iHashCode5 = (iE + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        return iHashCode5 + (str7 != null ? str7.hashCode() : 0);
    }
}
