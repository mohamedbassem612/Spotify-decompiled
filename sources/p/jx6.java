package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jx6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final q8b i;
    public final d8r0 j;
    public final List k;

    public jx6(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, q8b q8bVar, d8r0 d8r0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str5;
        this.i = q8bVar;
        this.j = d8r0Var;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx6)) {
            return false;
        }
        jx6 jx6Var = (jx6) obj;
        return u890.j(this.a, jx6Var.a) && u890.j(this.b, jx6Var.b) && u890.j(this.c, jx6Var.c) && u890.j(this.d, jx6Var.d) && this.e == jx6Var.e && this.f == jx6Var.f && this.g == jx6Var.g && u890.j(this.h, jx6Var.h) && this.i.equals(jx6Var.i) && this.j.equals(jx6Var.j) && this.k.equals(jx6Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.k.hashCode() + hrt.i(this.j, (this.i.hashCode() + cy30.d(xcg1.g(xcg1.g(xcg1.g(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31);
    }
}
