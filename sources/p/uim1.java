package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uim1 implements vim1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public uim1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uim1)) {
            return false;
        }
        uim1 uim1Var = (uim1) obj;
        return u890.j(this.a, uim1Var.a) && u890.j(this.b, uim1Var.b) && u890.j(this.c, uim1Var.c) && u890.j(this.d, uim1Var.d) && u890.j(this.e, uim1Var.e) && u890.j(this.f, uim1Var.f) && u890.j(this.g, uim1Var.g) && u890.j(this.h, uim1Var.h) && u890.j(this.i, uim1Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d((((this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31) - 512988492) * 31, 31, this.h);
    }
}
