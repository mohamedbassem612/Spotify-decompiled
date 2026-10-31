package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m901 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final List i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;

    public m901(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List list, boolean z, int i4, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = z;
        this.k = i4;
        this.l = z2;
        this.m = z3;
    }

    public static m901 a(m901 m901Var, String str, String str2, int i, int i2, int i3, List list, boolean z, int i4, boolean z2, boolean z3, int i5) {
        return new m901(m901Var.a, (i5 & 2) != 0 ? m901Var.b : str, m901Var.c, m901Var.d, (i5 & 16) != 0 ? m901Var.e : str2, (i5 & 32) != 0 ? m901Var.f : i, (i5 & 64) != 0 ? m901Var.g : i2, (i5 & 128) != 0 ? m901Var.h : i3, (i5 & 256) != 0 ? m901Var.i : list, (i5 & 512) != 0 ? m901Var.j : z, (i5 & 1024) != 0 ? m901Var.k : i4, (i5 & 2048) != 0 ? m901Var.l : z2, (i5 & 4096) != 0 ? m901Var.m : z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m901)) {
            return false;
        }
        m901 m901Var = (m901) obj;
        return u890.j(this.a, m901Var.a) && u890.j(this.b, m901Var.b) && u890.j(this.c, m901Var.c) && u890.j(this.d, m901Var.d) && u890.j(this.e, m901Var.e) && this.f == m901Var.f && this.g == m901Var.g && this.h == m901Var.h && u890.j(this.i, m901Var.i) && this.j == m901Var.j && this.k == m901Var.k && this.l == m901Var.l && this.m == m901Var.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + xcg1.g(ab80.k(this.k, xcg1.g(f4i1.b(kaa0.f(this.h, kaa0.f(this.g, kaa0.f(this.f, cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31), 31, this.i), 31, this.j), 31), 31, this.l);
    }
}
