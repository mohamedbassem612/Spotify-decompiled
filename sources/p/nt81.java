package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nt81 {
    public final boolean a;
    public final List b;
    public final boolean c;
    public final String d;
    public final e090 e;
    public final xnu f;
    public final boolean g;
    public final boolean h;
    public final q1g1 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final cal n;
    public final boolean o;

    public nt81(boolean z, List list, boolean z2, String str, e090 e090Var, xnu xnuVar, boolean z3, boolean z4, q1g1 q1g1Var, boolean z5, boolean z6, boolean z7, boolean z8, cal calVar, boolean z9) {
        this.a = z;
        this.b = list;
        this.c = z2;
        this.d = str;
        this.e = e090Var;
        this.f = xnuVar;
        this.g = z3;
        this.h = z4;
        this.i = q1g1Var;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = calVar;
        this.o = z9;
    }

    public static nt81 a(nt81 nt81Var, boolean z, List list, String str, e090 e090Var, xnu xnuVar, boolean z2, boolean z3, q1g1 q1g1Var, boolean z4, boolean z5, boolean z6, cal calVar, boolean z7, int i) {
        boolean z8 = (i & 1) != 0 ? nt81Var.a : z;
        List list2 = (i & 2) != 0 ? nt81Var.b : list;
        boolean z9 = (i & 4) != 0 ? nt81Var.c : true;
        String str2 = (i & 8) != 0 ? nt81Var.d : str;
        e090 e090Var2 = (i & 16) != 0 ? nt81Var.e : e090Var;
        xnu xnuVar2 = (i & 32) != 0 ? nt81Var.f : xnuVar;
        boolean z10 = (i & 64) != 0 ? nt81Var.g : z2;
        boolean z11 = (i & 128) != 0 ? nt81Var.h : z3;
        q1g1 q1g1Var2 = (i & 256) != 0 ? nt81Var.i : q1g1Var;
        boolean z12 = (i & 512) != 0 ? nt81Var.j : z4;
        boolean z13 = (i & 1024) != 0 ? nt81Var.k : true;
        boolean z14 = (i & 2048) != 0 ? nt81Var.l : z5;
        boolean z15 = (i & 4096) != 0 ? nt81Var.m : z6;
        cal calVar2 = (i & 8192) != 0 ? nt81Var.n : calVar;
        boolean z16 = (i & 16384) != 0 ? nt81Var.o : z7;
        nt81Var.getClass();
        return new nt81(z8, list2, z9, str2, e090Var2, xnuVar2, z10, z11, q1g1Var2, z12, z13, z14, z15, calVar2, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt81)) {
            return false;
        }
        nt81 nt81Var = (nt81) obj;
        return this.a == nt81Var.a && u890.j(this.b, nt81Var.b) && this.c == nt81Var.c && u890.j(this.d, nt81Var.d) && u890.j(this.e, nt81Var.e) && u890.j(this.f, nt81Var.f) && this.g == nt81Var.g && this.h == nt81Var.h && u890.j(this.i, nt81Var.i) && this.j == nt81Var.j && this.k == nt81Var.k && this.l == nt81Var.l && this.m == nt81Var.m && this.n == nt81Var.n && this.o == nt81Var.o;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.o) + ((this.n.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g((this.i.hashCode() + xcg1.g(xcg1.g((this.f.hashCode() + ((this.e.hashCode() + cy30.d(xcg1.g(f4i1.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31, 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31);
    }

    public nt81() {
        this(false, z6x.a, false, "", a090.a, xnu.f, false, true, h1g1.a, false, false, false, true, cal.b, false);
    }
}
