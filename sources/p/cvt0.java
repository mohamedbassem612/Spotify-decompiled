package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cvt0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final Long k;

    public cvt0(String str, String str2, String str3, String str4, String str5, boolean z, int i, boolean z2, String str6, boolean z3, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = i;
        this.h = z2;
        this.i = str6;
        this.j = z3;
        this.k = l;
    }

    public static cvt0 a(cvt0 cvt0Var, boolean z) {
        String str = cvt0Var.a;
        String str2 = cvt0Var.b;
        String str3 = cvt0Var.c;
        String str4 = cvt0Var.d;
        String str5 = cvt0Var.e;
        int i = cvt0Var.g;
        boolean z2 = cvt0Var.h;
        String str6 = cvt0Var.i;
        boolean z3 = cvt0Var.j;
        Long l = cvt0Var.k;
        cvt0Var.getClass();
        return new cvt0(str, str2, str3, str4, str5, z, i, z2, str6, z3, l);
    }

    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvt0)) {
            return false;
        }
        cvt0 cvt0Var = (cvt0) obj;
        return u890.j(this.a, cvt0Var.a) && u890.j(this.b, cvt0Var.b) && this.c.equals(cvt0Var.c) && u890.j(this.d, cvt0Var.d) && u890.j(this.e, cvt0Var.e) && this.f == cvt0Var.f && this.g == cvt0Var.g && this.h == cvt0Var.h && u890.j(this.i, cvt0Var.i) && this.j == cvt0Var.j && u890.j(this.k, cvt0Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(ab80.k(this.g, xcg1.g(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h);
        String str = this.i;
        int iG2 = xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.j);
        Long l = this.k;
        return iG2 + (l != null ? l.hashCode() : 0);
    }
}
