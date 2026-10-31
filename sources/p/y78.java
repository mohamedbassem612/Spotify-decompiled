package p;

import android.text.SpannedString;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y78 {
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
    public final boolean m;
    public final boolean n;

    public y78(String str, String str2, String str3, SpannedString spannedString, String str4, String str5, int i, boolean z, String str6, d8r0 d8r0Var, String str7, boolean z2, boolean z3, boolean z4) {
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
        this.m = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y78)) {
            return false;
        }
        y78 y78Var = (y78) obj;
        return u890.j(this.a, y78Var.a) && u890.j(this.b, y78Var.b) && u890.j(this.c, y78Var.c) && this.d.equals(y78Var.d) && this.e.equals(y78Var.e) && u890.j(this.f, y78Var.f) && this.g == y78Var.g && this.h == y78Var.h && u890.j(this.i, y78Var.i) && this.j.equals(y78Var.j) && u890.j(this.k, y78Var.k) && this.l == y78Var.l && this.m == y78Var.m && this.n == y78Var.n;
    }

    public final int hashCode() {
        int i = hrt.i(this.j, cy30.d(xcg1.g(ab80.k(this.g, cy30.d(cy30.d((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31);
        String str = this.k;
        return Boolean.hashCode(this.n) + xcg1.g(xcg1.g((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.l), 31, this.m);
    }
}
