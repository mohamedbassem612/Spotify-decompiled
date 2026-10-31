package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qs51 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final List j;
    public final long k;
    public final long l;
    public final boolean m;
    public final agv n;

    public /* synthetic */ qs51(String str, boolean z, boolean z2, boolean z3, agv agvVar, int i) {
        this((i & 1) != 0 ? "" : str, 0L, 0L, 0L, (i & 16) != 0 ? false : z, false, false, false, (i & 256) != 0 ? false : z2, z6x.a, -1L, -1L, (i & 4096) != 0 ? false : z3, (i & 8192) != 0 ? agv.a : agvVar);
    }

    public static qs51 a(qs51 qs51Var, String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, long j4, long j5, boolean z6, agv agvVar, int i) {
        String str2 = (i & 1) != 0 ? qs51Var.a : str;
        long j6 = (i & 2) != 0 ? qs51Var.b : j;
        return new qs51(str2, j6, (i & 4) != 0 ? qs51Var.c : j2, (i & 8) != 0 ? qs51Var.d : j3, (i & 16) != 0 ? qs51Var.e : z, (i & 32) != 0 ? qs51Var.f : z2, (i & 64) != 0 ? qs51Var.g : z3, (i & 128) != 0 ? qs51Var.h : z4, (i & 256) != 0 ? qs51Var.i : z5, (i & 512) != 0 ? qs51Var.j : list, (i & 1024) != 0 ? qs51Var.k : j4, (i & 2048) != 0 ? qs51Var.l : j5, (i & 4096) != 0 ? qs51Var.m : z6, (i & 8192) != 0 ? qs51Var.n : agvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs51)) {
            return false;
        }
        qs51 qs51Var = (qs51) obj;
        return u890.j(this.a, qs51Var.a) && this.b == qs51Var.b && this.c == qs51Var.c && this.d == qs51Var.d && this.e == qs51Var.e && this.f == qs51Var.f && this.g == qs51Var.g && this.h == qs51Var.h && this.i == qs51Var.i && u890.j(this.j, qs51Var.j) && this.k == qs51Var.k && this.l == qs51Var.l && this.m == qs51Var.m && this.n == qs51Var.n;
    }

    public final int hashCode() {
        return this.n.hashCode() + xcg1.g(cy30.f(cy30.f(f4i1.b(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.f(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), this.k, 31), this.l, 31), 31, this.m);
    }

    public qs51(String str, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, long j4, long j5, boolean z6, agv agvVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = list;
        this.k = j4;
        this.l = j5;
        this.m = z6;
        this.n = agvVar;
    }
}
