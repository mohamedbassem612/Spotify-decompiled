package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k5u0 {
    public final m0u0 a;
    public final long b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final float f;
    public final boolean g;
    public final Integer h;
    public final List i;
    public final String j;
    public final jgc1 k;
    public final String l;
    public final int m;
    public final boolean n;
    public final boolean o;

    public k5u0(m0u0 m0u0Var, long j, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, String str, jgc1 jgc1Var, String str2, int i, boolean z3, boolean z4) {
        this.a = m0u0Var;
        this.b = j;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = f;
        this.g = z2;
        this.h = num;
        this.i = list;
        this.j = str;
        this.k = jgc1Var;
        this.l = str2;
        this.m = i;
        this.n = z3;
        this.o = z4;
    }

    public static k5u0 b(k5u0 k5u0Var, long j, Long l, Long l2, boolean z, float f, boolean z2, Integer num, List list, String str, jgc1 jgc1Var, int i, boolean z3, boolean z4, int i2) {
        m0u0 m0u0Var = k5u0Var.a;
        long j2 = (i2 & 2) != 0 ? k5u0Var.b : j;
        Long l3 = (i2 & 4) != 0 ? k5u0Var.c : l;
        Long l4 = (i2 & 8) != 0 ? k5u0Var.d : l2;
        boolean z5 = (i2 & 16) != 0 ? k5u0Var.e : z;
        float f2 = (i2 & 32) != 0 ? k5u0Var.f : f;
        boolean z6 = (i2 & 64) != 0 ? k5u0Var.g : z2;
        Integer num2 = (i2 & 128) != 0 ? k5u0Var.h : num;
        List list2 = (i2 & 256) != 0 ? k5u0Var.i : list;
        String str2 = (i2 & 512) != 0 ? k5u0Var.j : str;
        jgc1 jgc1Var2 = (i2 & 1024) != 0 ? k5u0Var.k : jgc1Var;
        String str3 = k5u0Var.l;
        int i3 = (i2 & 4096) != 0 ? k5u0Var.m : i;
        boolean z7 = (i2 & 8192) != 0 ? k5u0Var.n : z3;
        boolean z8 = (i2 & 16384) != 0 ? k5u0Var.o : z4;
        k5u0Var.getClass();
        return new k5u0(m0u0Var, j2, l3, l4, z5, f2, z6, num2, list2, str2, jgc1Var2, str3, i3, z7, z8);
    }

    public final Long a(long j) {
        boolean z = this.e;
        Long l = this.c;
        if (z || this.g || l == null) {
            return l;
        }
        return Long.valueOf(l.longValue() + ((long) (this.f * (j - this.b))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5u0)) {
            return false;
        }
        k5u0 k5u0Var = (k5u0) obj;
        return this.a.equals(k5u0Var.a) && this.b == k5u0Var.b && u890.j(this.c, k5u0Var.c) && u890.j(this.d, k5u0Var.d) && this.e == k5u0Var.e && Float.compare(this.f, k5u0Var.f) == 0 && this.g == k5u0Var.g && u890.j(this.h, k5u0Var.h) && u890.j(this.i, k5u0Var.i) && u890.j(this.j, k5u0Var.j) && this.k == k5u0Var.k && this.l.equals(k5u0Var.l) && this.m == k5u0Var.m && this.n == k5u0Var.n && this.o == k5u0Var.o;
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        Long l = this.c;
        int iHashCode = (iF + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iG = xcg1.g(x0d.f(xcg1.g((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Integer num = this.h;
        int iHashCode2 = (iG + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.j;
        return Boolean.hashCode(this.o) + xcg1.g(ab80.k(this.m, cy30.d((this.k.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.l), 31), 31, this.n);
    }
}
