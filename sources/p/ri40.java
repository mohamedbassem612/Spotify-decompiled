package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ri40 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final String e;
    public final d8r0 f;
    public final int g;
    public final Integer h;
    public final String i;
    public final o940 j;

    public ri40(String str, String str2, CharSequence charSequence, String str3, String str4, d8r0 d8r0Var, int i, Integer num, String str5, o940 o940Var) {
        this.a = str;
        this.b = str2;
        this.c = charSequence;
        this.d = str3;
        this.e = str4;
        this.f = d8r0Var;
        this.g = i;
        this.h = num;
        this.i = str5;
        this.j = o940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri40)) {
            return false;
        }
        ri40 ri40Var = (ri40) obj;
        return u890.j(this.a, ri40Var.a) && u890.j(this.b, ri40Var.b) && u890.j(this.c, ri40Var.c) && u890.j(this.d, ri40Var.d) && u890.j(this.e, ri40Var.e) && this.f.equals(ri40Var.f) && this.g == ri40Var.g && u890.j(this.h, ri40Var.h) && u890.j(this.i, ri40Var.i) && u890.j(this.j, ri40Var.j);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.g, hrt.i(this.f, cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31), 31);
        Integer num = this.h;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o940 o940Var = this.j;
        return iHashCode2 + (o940Var != null ? o940Var.hashCode() : 0);
    }
}
