package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gwk1 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Map m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f19p;
    public final boolean q;
    public final boolean r;
    public final boolean s;

    public gwk1(String str, String str2, int i, int i2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, Map map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = map;
        this.n = z;
        this.o = z2;
        this.f19p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
    }

    public static gwk1 b(gwk1 gwk1Var, Map map, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str = gwk1Var.a;
        String str2 = gwk1Var.b;
        int i2 = gwk1Var.c;
        int i3 = gwk1Var.d;
        String str3 = gwk1Var.e;
        String str4 = gwk1Var.f;
        List list = gwk1Var.g;
        String str5 = gwk1Var.h;
        String str6 = gwk1Var.i;
        String str7 = gwk1Var.j;
        String str8 = gwk1Var.k;
        String str9 = gwk1Var.l;
        Map map2 = (i & 4096) != 0 ? gwk1Var.m : map;
        boolean z5 = (i & 8192) != 0 ? gwk1Var.n : true;
        boolean z6 = (i & 16384) != 0 ? gwk1Var.o : z;
        boolean z7 = (i & 32768) != 0 ? gwk1Var.f19p : true;
        boolean z8 = (i & 65536) != 0 ? gwk1Var.q : z2;
        boolean z9 = (i & 131072) != 0 ? gwk1Var.r : z3;
        boolean z10 = (i & 262144) != 0 ? gwk1Var.s : z4;
        gwk1Var.getClass();
        return new gwk1(str, str2, i2, i3, str3, str4, list, str5, str6, str7, str8, str9, map2, z5, z6, z7, z8, z9, z10);
    }

    public final gwk1 a(int i, String str) {
        Map map = this.m;
        Integer num = (Integer) map.get(str);
        return b(this, sqg0.P(map, new mmr0(str, Integer.valueOf((num != null ? num.intValue() : 0) + i))), false, false, false, false, 520191);
    }

    public final gwk1 c() {
        return lm5.x(b(this, null, false, false, false, false, 507903));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwk1)) {
            return false;
        }
        gwk1 gwk1Var = (gwk1) obj;
        return this.a.equals(gwk1Var.a) && this.b.equals(gwk1Var.b) && this.c == gwk1Var.c && this.d == gwk1Var.d && this.e.equals(gwk1Var.e) && this.f.equals(gwk1Var.f) && this.g.equals(gwk1Var.g) && this.h.equals(gwk1Var.h) && this.i.equals(gwk1Var.i) && this.j.equals(gwk1Var.j) && this.k.equals(gwk1Var.k) && this.l.equals(gwk1Var.l) && u890.j(this.m, gwk1Var.m) && this.n == gwk1Var.n && this.o == gwk1Var.o && this.f19p == gwk1Var.f19p && this.q == gwk1Var.q && this.r == gwk1Var.r && this.s == gwk1Var.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.e(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(f4i1.b(cy30.d(cy30.d(ab80.k(this.d, kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f19p), 31, this.q), 31, this.r);
    }
}
