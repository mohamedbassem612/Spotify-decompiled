package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kp0 {
    public final cs10 a;
    public final String b;
    public final String c;
    public final fq0 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final iu30 k;

    public kp0(cs10 cs10Var, String str, String str2, fq0 fq0Var, String str3, String str4, String str5, String str6, String str7, boolean z, iu30 iu30Var) {
        this.a = cs10Var;
        this.b = str;
        this.c = str2;
        this.d = fq0Var;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = iu30Var;
    }

    public final fq0 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp0)) {
            return false;
        }
        kp0 kp0Var = (kp0) obj;
        return this.a.equals(kp0Var.a) && u890.j(this.b, kp0Var.b) && u890.j(this.c, kp0Var.c) && u890.j(this.d, kp0Var.d) && u890.j(this.e, kp0Var.e) && u890.j(this.f, kp0Var.f) && u890.j(this.g, kp0Var.g) && u890.j(this.h, kp0Var.h) && u890.j(this.i, kp0Var.i) && this.j == kp0Var.j && u890.j(this.k, kp0Var.k);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a.a) * 31;
        String str = this.b;
        return this.k.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d((this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }
}
