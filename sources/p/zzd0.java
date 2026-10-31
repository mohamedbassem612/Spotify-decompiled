package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zzd0 {
    public final xzd0 a;
    public final pwd0 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final a0e0 i;
    public final wzd0 j;
    public final tle1 k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final String o;

    public zzd0(xzd0 xzd0Var, pwd0 pwd0Var, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, a0e0 a0e0Var, wzd0 wzd0Var, tle1 tle1Var, boolean z6, boolean z7, boolean z8, String str2) {
        this.a = xzd0Var;
        this.b = pwd0Var;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = a0e0Var;
        this.j = wzd0Var;
        this.k = tle1Var;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = str2;
    }

    public static zzd0 a(zzd0 zzd0Var, pwd0 pwd0Var, boolean z, tle1 tle1Var, boolean z2, int i) {
        xzd0 xzd0Var = zzd0Var.a;
        pwd0 pwd0Var2 = (i & 2) != 0 ? zzd0Var.b : pwd0Var;
        String str = zzd0Var.c;
        pwd0 pwd0Var3 = pwd0Var2;
        boolean z3 = zzd0Var.d;
        boolean z4 = zzd0Var.e;
        boolean z5 = zzd0Var.f;
        boolean z6 = (i & 64) != 0 ? zzd0Var.g : false;
        boolean z7 = (i & 128) != 0 ? zzd0Var.h : z;
        a0e0 a0e0Var = zzd0Var.i;
        boolean z8 = z6;
        boolean z9 = z7;
        wzd0 wzd0Var = zzd0Var.j;
        tle1 tle1Var2 = (i & 1024) != 0 ? zzd0Var.k : tle1Var;
        boolean z10 = (i & 2048) != 0 ? zzd0Var.l : z2;
        boolean z11 = zzd0Var.m;
        boolean z12 = zzd0Var.n;
        String str2 = zzd0Var.o;
        zzd0Var.getClass();
        return new zzd0(xzd0Var, pwd0Var3, str, z3, z4, z5, z8, z9, a0e0Var, wzd0Var, tle1Var2, z10, z11, z12, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd0)) {
            return false;
        }
        zzd0 zzd0Var = (zzd0) obj;
        return this.a.equals(zzd0Var.a) && this.b.equals(zzd0Var.b) && this.c.equals(zzd0Var.c) && this.d == zzd0Var.d && this.e == zzd0Var.e && this.f == zzd0Var.f && this.g == zzd0Var.g && this.h == zzd0Var.h && this.i.equals(zzd0Var.i) && this.j.equals(zzd0Var.j) && this.k.equals(zzd0Var.k) && this.l == zzd0Var.l && this.m == zzd0Var.m && this.n == zzd0Var.n && this.o.equals(zzd0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + xcg1.g(xcg1.g(xcg1.g((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.n);
    }
}
