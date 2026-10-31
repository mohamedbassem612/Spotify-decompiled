package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u6h1 {
    public final String a;
    public final y6r0 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;

    public u6h1(String str, y6r0 y6r0Var, String str2, String str3, String str4, String str5, String str6, String str7, Integer num) {
        this.a = str;
        this.b = y6r0Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = num;
    }

    public static u6h1 a(u6h1 u6h1Var, y6r0 y6r0Var, String str, String str2, int i) {
        String str3 = u6h1Var.a;
        if ((i & 4) != 0) {
            str = u6h1Var.c;
        }
        return new u6h1(str3, y6r0Var, str, u6h1Var.d, str2, u6h1Var.f, u6h1Var.g, u6h1Var.h, u6h1Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6h1)) {
            return false;
        }
        u6h1 u6h1Var = (u6h1) obj;
        return this.a.equals(u6h1Var.a) && u890.j(this.b, u6h1Var.b) && u890.j(this.c, u6h1Var.c) && this.d.equals(u6h1Var.d) && this.e.equals(u6h1Var.e) && this.f.equals(u6h1Var.f) && this.g.equals(u6h1Var.g) && u890.j(this.h, u6h1Var.h) && u890.j(this.i, u6h1Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        y6r0 y6r0Var = this.b;
        int iHashCode2 = (iHashCode + (y6r0Var == null ? 0 : y6r0Var.a.hashCode())) * 31;
        String str = this.c;
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Integer num = this.i;
        return iD + (num != null ? num.hashCode() : 0);
    }
}
