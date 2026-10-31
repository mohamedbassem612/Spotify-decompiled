package p;

import android.text.SpannedString;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x78 {
    public final String a;
    public final String b;
    public final String c;
    public final SpannedString d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final String i;
    public final d8r0 j;
    public final String k;
    public final boolean l;
    public final int m;
    public final boolean n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f44p;

    public x78(String str, String str2, String str3, SpannedString spannedString, String str4, String str5, int i, boolean z, String str6, d8r0 d8r0Var, String str7, boolean z2, int i2, boolean z3, Integer num, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = spannedString;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = z;
        this.i = str6;
        this.j = d8r0Var;
        this.k = str7;
        this.l = z2;
        this.m = i2;
        this.n = z3;
        this.o = num;
        this.f44p = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x78)) {
            return false;
        }
        x78 x78Var = (x78) obj;
        return u890.j(this.a, x78Var.a) && u890.j(this.b, x78Var.b) && u890.j(this.c, x78Var.c) && this.d.equals(x78Var.d) && this.e.equals(x78Var.e) && u890.j(this.f, x78Var.f) && this.g == x78Var.g && this.h == x78Var.h && u890.j(this.i, x78Var.i) && this.j.equals(x78Var.j) && u890.j(this.k, x78Var.k) && this.l == x78Var.l && this.m == x78Var.m && this.n == x78Var.n && u890.j(this.o, x78Var.o) && u890.j(this.f44p, x78Var.f44p);
    }

    public final int hashCode() {
        int i = hrt.i(this.j, cy30.d(xcg1.g(ab80.k(this.g, cy30.d(cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31);
        String str = this.k;
        int iG = xcg1.g(kaa0.f(this.m, xcg1.g((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.l), 31), 31, this.n);
        Integer num = this.o;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f44p;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
