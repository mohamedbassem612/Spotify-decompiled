package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kl91 {
    public final ndy0 a;
    public final jdu0 b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final y0a1 f;
    public final Boolean g;
    public final Boolean h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final List l;
    public final Map m;
    public final Map n;
    public final Set o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f52p;
    public final int q;
    public final Map r;
    public final boolean s;

    public kl91(ndy0 ndy0Var, jdu0 jdu0Var, Map map, Map map2, Map map3, y0a1 y0a1Var, Boolean bool, Boolean bool2, boolean z, boolean z2, int i, List list, Map map4, Map map5, Set set, int i2, int i3, Map map6, boolean z3) {
        this.a = ndy0Var;
        this.b = jdu0Var;
        this.c = map;
        this.d = map2;
        this.e = map3;
        this.f = y0a1Var;
        this.g = bool;
        this.h = bool2;
        this.i = z;
        this.j = z2;
        this.k = i;
        this.l = list;
        this.m = map4;
        this.n = map5;
        this.o = set;
        this.f52p = i2;
        this.q = i3;
        this.r = map6;
        this.s = z3;
    }

    public static kl91 a(kl91 kl91Var, jdu0 jdu0Var, Map map, Map map2, Map map3, y0a1 y0a1Var, Boolean bool, Boolean bool2, boolean z, boolean z2, int i, ArrayList arrayList, Map map4, Map map5, Set set, int i2, int i3, Map map6, boolean z3, int i4) {
        ndy0 ndy0Var = kl91Var.a;
        jdu0 jdu0Var2 = (i4 & 2) != 0 ? kl91Var.b : jdu0Var;
        Map map7 = (i4 & 4) != 0 ? kl91Var.c : map;
        Map map8 = (i4 & 8) != 0 ? kl91Var.d : map2;
        Map map9 = (i4 & 16) != 0 ? kl91Var.e : map3;
        y0a1 y0a1Var2 = (i4 & 32) != 0 ? kl91Var.f : y0a1Var;
        Boolean bool3 = (i4 & 64) != 0 ? kl91Var.g : bool;
        Boolean bool4 = (i4 & 128) != 0 ? kl91Var.h : bool2;
        boolean z4 = (i4 & 256) != 0 ? kl91Var.i : z;
        boolean z5 = (i4 & 512) != 0 ? kl91Var.j : z2;
        int i5 = (i4 & 1024) != 0 ? kl91Var.k : i;
        List list = (i4 & 2048) != 0 ? kl91Var.l : arrayList;
        Map map10 = (i4 & 4096) != 0 ? kl91Var.m : map4;
        Map map11 = (i4 & 8192) != 0 ? kl91Var.n : map5;
        Set set2 = (i4 & 16384) != 0 ? kl91Var.o : set;
        int i6 = (i4 & 32768) != 0 ? kl91Var.f52p : i2;
        int i7 = (i4 & 65536) != 0 ? kl91Var.q : i3;
        Map map12 = (i4 & 131072) != 0 ? kl91Var.r : map6;
        boolean z6 = (i4 & 262144) != 0 ? kl91Var.s : z3;
        kl91Var.getClass();
        return new kl91(ndy0Var, jdu0Var2, map7, map8, map9, y0a1Var2, bool3, bool4, z4, z5, i5, list, map10, map11, set2, i6, i7, map12, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl91)) {
            return false;
        }
        kl91 kl91Var = (kl91) obj;
        return this.a.equals(kl91Var.a) && this.b.equals(kl91Var.b) && u890.j(this.c, kl91Var.c) && u890.j(this.d, kl91Var.d) && u890.j(this.e, kl91Var.e) && this.f.equals(kl91Var.f) && u890.j(this.g, kl91Var.g) && u890.j(this.h, kl91Var.h) && this.i == kl91Var.i && this.j == kl91Var.j && this.k == kl91Var.k && u890.j(this.l, kl91Var.l) && u890.j(this.m, kl91Var.m) && u890.j(this.n, kl91Var.n) && u890.j(this.o, kl91Var.o) && this.f52p == kl91Var.f52p && this.q == kl91Var.q && u890.j(this.r, kl91Var.r) && this.s == kl91Var.s;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + cy30.e(cy30.e(cy30.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        Boolean bool = this.g;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        return Boolean.hashCode(this.s) + cy30.e(kaa0.f(this.q, kaa0.f(this.f52p, gvg.c(cy30.e(cy30.e(f4i1.b(kaa0.f(this.k, xcg1.g(xcg1.g((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31), 31), 31, this.r);
    }
}
