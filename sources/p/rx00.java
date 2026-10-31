package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rx00 implements tx00 {
    public final long a;
    public final String b;
    public final ex00 c;
    public final boolean d;
    public final ox00 e;
    public final boolean f;
    public final jx00 g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final boolean l;
    public final String m;

    public rx00(long j, String str, ex00 ex00Var, boolean z, ox00 ox00Var, boolean z2, jx00 jx00Var, String str2, String str3, String str4, List list, boolean z3, String str5) {
        this.a = j;
        this.b = str;
        this.c = ex00Var;
        this.d = z;
        this.e = ox00Var;
        this.f = z2;
        this.g = jx00Var;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = list;
        this.l = z3;
        this.m = str5;
    }

    public static rx00 b(rx00 rx00Var, long j, String str, ex00 ex00Var, boolean z, ox00 ox00Var, boolean z2, jx00 jx00Var, String str2, String str3, String str4, List list, boolean z3, String str5, int i) {
        return new rx00((i & 1) != 0 ? rx00Var.a : j, (i & 2) != 0 ? rx00Var.b : str, (i & 4) != 0 ? rx00Var.c : ex00Var, (i & 8) != 0 ? rx00Var.d : z, (i & 16) != 0 ? rx00Var.e : ox00Var, (i & 32) != 0 ? rx00Var.f : z2, (i & 64) != 0 ? rx00Var.g : jx00Var, (i & 128) != 0 ? rx00Var.h : str2, (i & 256) != 0 ? rx00Var.i : str3, (i & 512) != 0 ? rx00Var.j : str4, (i & 1024) != 0 ? rx00Var.k : list, (i & 2048) != 0 ? rx00Var.l : z3, (i & 4096) != 0 ? rx00Var.m : str5);
    }

    public final ex00 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx00)) {
            return false;
        }
        rx00 rx00Var = (rx00) obj;
        return this.a == rx00Var.a && u890.j(this.b, rx00Var.b) && u890.j(this.c, rx00Var.c) && this.d == rx00Var.d && this.e.equals(rx00Var.e) && this.f == rx00Var.f && this.g == rx00Var.g && u890.j(this.h, rx00Var.h) && u890.j(this.i, rx00Var.i) && this.j.equals(rx00Var.j) && u890.j(this.k, rx00Var.k) && this.l == rx00Var.l && u890.j(this.m, rx00Var.m);
    }

    public final String getEntityUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d((this.g.hashCode() + xcg1.g((this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31, this.f)) * 31, 31, this.h);
        String str = this.i;
        int iG = xcg1.g(f4i1.b(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        String str2 = this.m;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }
}
