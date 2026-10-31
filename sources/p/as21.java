package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class as21 {
    public final zr21 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;

    public as21(zr21 zr21Var, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        this.a = zr21Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as21)) {
            return false;
        }
        as21 as21Var = (as21) obj;
        return this.a.equals(as21Var.a) && u890.j(this.b, as21Var.b) && u890.j(this.c, as21Var.c) && this.d.equals(as21Var.d) && this.e.equals(as21Var.e) && u890.j(this.f, as21Var.f) && u890.j(this.g, as21Var.g) && this.h == as21Var.h && this.i == as21Var.i;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return Integer.hashCode(this.i) + kaa0.f(this.h, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
