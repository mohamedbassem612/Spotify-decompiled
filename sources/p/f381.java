package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f381 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final d8r0 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public f381(String str, String str2, String str3, String str4, String str5, String str6, d8r0 d8r0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = d8r0Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f381)) {
            return false;
        }
        f381 f381Var = (f381) obj;
        return u890.j(this.a, f381Var.a) && u890.j(this.b, f381Var.b) && u890.j(this.c, f381Var.c) && u890.j(this.d, f381Var.d) && u890.j(this.e, f381Var.e) && u890.j(this.f, f381Var.f) && this.g.equals(f381Var.g) && this.h == f381Var.h && this.i == f381Var.i && this.j == f381Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + xcg1.g(xcg1.g(hrt.i(this.g, cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
    }
}
