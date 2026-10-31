package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ewg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final twg0 n;
    public final String o;

    public ewg0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, twg0 twg0Var, String str14) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = twg0Var;
        this.o = str14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewg0)) {
            return false;
        }
        ewg0 ewg0Var = (ewg0) obj;
        return u890.j(this.a, ewg0Var.a) && u890.j(this.b, ewg0Var.b) && u890.j(this.c, ewg0Var.c) && u890.j(this.d, ewg0Var.d) && u890.j(this.e, ewg0Var.e) && u890.j(this.f, ewg0Var.f) && u890.j(this.g, ewg0Var.g) && u890.j(this.h, ewg0Var.h) && u890.j(this.i, ewg0Var.i) && u890.j(this.j, ewg0Var.j) && u890.j(this.k, ewg0Var.k) && u890.j(this.l, ewg0Var.l) && u890.j(this.m, ewg0Var.m) && this.n == ewg0Var.n && u890.j(this.o, ewg0Var.o);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iD2 = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        int iD3 = cy30.d(cy30.d(cy30.d((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        String str3 = this.m;
        int iHashCode = (iD3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        twg0 twg0Var = this.n;
        int iHashCode2 = (iHashCode + (twg0Var == null ? 0 : twg0Var.hashCode())) * 31;
        String str4 = this.o;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
