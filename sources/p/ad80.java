package p;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ad80 implements g0x {
    public final ji0 a;
    public final String b;
    public final String c;
    public final ju0 d;
    public final Set e;
    public final boolean f;
    public final boolean g;
    public final Object h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final boolean l;
    public final e441 m;
    public final boolean n;

    public ad80(ji0 ji0Var, String str, String str2, ju0 ju0Var, Set set, boolean z, boolean z2, Object obj, boolean z3, boolean z4, long j, boolean z5, e441 e441Var, boolean z6) {
        this.a = ji0Var;
        this.b = str;
        this.c = str2;
        this.d = ju0Var;
        this.e = set;
        this.f = z;
        this.g = z2;
        this.h = obj;
        this.i = z3;
        this.j = z4;
        this.k = j;
        this.l = z5;
        this.m = e441Var;
        this.n = z6;
    }

    public static ad80 f(ad80 ad80Var, LinkedHashSet linkedHashSet, Object obj, boolean z, long j, e441 e441Var, boolean z2, int i) {
        ji0 ji0Var = ad80Var.a;
        String str = ad80Var.b;
        String str2 = ad80Var.c;
        ju0 ju0Var = ad80Var.d;
        Set set = (i & 16) != 0 ? ad80Var.e : linkedHashSet;
        boolean z3 = (i & 32) != 0 ? ad80Var.f : true;
        boolean z4 = (i & 64) != 0 ? ad80Var.g : true;
        Object obj2 = (i & 128) != 0 ? ad80Var.h : obj;
        boolean z5 = (i & 256) != 0 ? ad80Var.i : z;
        boolean z6 = true;
        Object obj3 = obj2;
        boolean z7 = ad80Var.j;
        long j2 = (i & 1024) != 0 ? ad80Var.k : j;
        if ((i & 2048) != 0) {
            z6 = ad80Var.l;
        }
        return new ad80(ji0Var, str, str2, ju0Var, set, z3, z4, obj3, z5, z7, j2, z6, (i & 4096) != 0 ? ad80Var.m : e441Var, (i & 8192) != 0 ? ad80Var.n : z2);
    }

    public final boolean a() {
        return this.l;
    }

    public final long b() {
        return this.k;
    }

    public final e441 c() {
        return this.m;
    }

    public final boolean d() {
        return this.n;
    }

    public final boolean e() {
        return this.f && this.g && !this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad80)) {
            return false;
        }
        ad80 ad80Var = (ad80) obj;
        return u890.j(this.a, ad80Var.a) && u890.j(this.b, ad80Var.b) && this.c.equals(ad80Var.c) && this.d == ad80Var.d && u890.j(this.e, ad80Var.e) && this.f == ad80Var.f && this.g == ad80Var.g && u890.j(this.h, ad80Var.h) && this.i == ad80Var.i && this.j == ad80Var.j && yr80.b(this.k, ad80Var.k) && this.l == ad80Var.l && u890.j(this.m, ad80Var.m) && this.n == ad80Var.n;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g(xcg1.g(gvg.c((this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        Object obj = this.h;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + xcg1.g(cy30.f(xcg1.g(xcg1.g((iG + (obj != null ? obj.hashCode() : 0)) * 31, 31, this.i), 31, this.j), this.k, 31), 31, this.l)) * 31);
    }
}
