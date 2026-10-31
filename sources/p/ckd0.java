package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ckd0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final long h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;

    public ckd0(String str, boolean z, String str2, String str3, String str4, int i, String str5, long j, String str6, String str7, String str8, String str9, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckd0)) {
            return false;
        }
        ckd0 ckd0Var = (ckd0) obj;
        return this.a.equals(ckd0Var.a) && this.b == ckd0Var.b && this.c.equals(ckd0Var.c) && u890.j(this.d, ckd0Var.d) && u890.j(this.e, ckd0Var.e) && this.f == ckd0Var.f && this.g.equals(ckd0Var.g) && this.h == ckd0Var.h && u890.j(this.i, ckd0Var.i) && u890.j(this.j, ckd0Var.j) && u890.j(this.k, ckd0Var.k) && u890.j(this.l, ckd0Var.l) && this.m == ckd0Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + cy30.d(cy30.d(cy30.d(cy30.d(cy30.f(cy30.d(ab80.k(this.f, cy30.d(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), this.h, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }
}
