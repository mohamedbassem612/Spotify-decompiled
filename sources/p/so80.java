package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class so80 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final d8r0 f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public so80(String str, String str2, String str3, int i, int i2, d8r0 d8r0Var, int i3, String str4, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = d8r0Var;
        this.g = i3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so80)) {
            return false;
        }
        so80 so80Var = (so80) obj;
        return u890.j(this.a, so80Var.a) && u890.j(this.b, so80Var.b) && u890.j(this.c, so80Var.c) && this.d == so80Var.d && this.e == so80Var.e && u890.j(this.f, so80Var.f) && this.g == so80Var.g && u890.j(this.h, so80Var.h) && u890.j(this.i, so80Var.i) && u890.j(this.j, so80Var.j) && u890.j(this.k, so80Var.k) && u890.j(this.l, so80Var.l);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(kaa0.f(this.g, hrt.i(this.f, ab80.k(this.e, ab80.k(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
