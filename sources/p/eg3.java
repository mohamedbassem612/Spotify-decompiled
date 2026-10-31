package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eg3 {
    public final String a;
    public final List b;
    public final o1v c;
    public final k4m d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final uez0 j;
    public final int k;
    public final Object l;
    public final String m;
    public final String n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11p;

    public /* synthetic */ eg3(String str, List list, o1v o1vVar, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uez0 uez0Var, int i, zuc0 zuc0Var, String str2, boolean z6, int i2) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? z6x.a : list, (i2 & 4) != 0 ? o1v.a : o1vVar, (i2 & 8) != 0 ? k4m.d : k4mVar, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? false : z3, (i2 & 128) != 0 ? true : z4, (i2 & 256) != 0 ? false : z5, (i2 & 512) != 0 ? tez0.a : uez0Var, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? null : zuc0Var, (i2 & 4096) != 0 ? "" : str2, null, (i2 & 16384) != 0 ? false : z6, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg3)) {
            return false;
        }
        eg3 eg3Var = (eg3) obj;
        return u890.j(this.a, eg3Var.a) && u890.j(this.b, eg3Var.b) && this.c == eg3Var.c && this.d == eg3Var.d && this.e == eg3Var.e && this.f == eg3Var.f && this.g == eg3Var.g && this.h == eg3Var.h && this.i == eg3Var.i && u890.j(this.j, eg3Var.j) && this.k == eg3Var.k && u890.j(this.l, eg3Var.l) && u890.j(this.m, eg3Var.m) && u890.j(this.n, eg3Var.n) && this.o == eg3Var.o && this.f11p == eg3Var.f11p;
    }

    public final int hashCode() {
        int iF = kaa0.f(this.k, (this.j.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(p3d1.g(this.d, (this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31);
        Object obj = this.l;
        int iD = cy30.d((iF + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.m);
        String str = this.n;
        return Integer.hashCode(this.f11p) + xcg1.g((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.o);
    }

    public eg3(String str, List list, o1v o1vVar, k4m k4mVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, uez0 uez0Var, int i, Object obj, String str2, String str3, boolean z6, int i2) {
        this.a = str;
        this.b = list;
        this.c = o1vVar;
        this.d = k4mVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = uez0Var;
        this.k = i;
        this.l = obj;
        this.m = str2;
        this.n = str3;
        this.o = z6;
        this.f11p = i2;
    }
}
