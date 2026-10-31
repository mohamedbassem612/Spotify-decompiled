package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hcz0 {
    public final Map A;
    public final Map B;
    public final boolean C;
    public final Map D;
    public final Map E;
    public final boolean F;
    public final Set G;
    public final String H;
    public final int I;
    public final int J;
    public final ContextTrack a;
    public final ContextTrack b;
    public final List c;
    public final List d;
    public final Map e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final Restrictions j;
    public final ktw0 k;
    public final boolean l;
    public final boolean m;
    public final List n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f15p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final gcz0 w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public hcz0(ContextTrack contextTrack, ContextTrack contextTrack2, List list, List list2, Map map, boolean z, boolean z2, String str, String str2, Restrictions restrictions, ktw0 ktw0Var, int i, int i2, boolean z3, boolean z4, List list3, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, gcz0 gcz0Var, boolean z13, boolean z14, boolean z15, Map map2, Map map3, boolean z16, Map map4, Map map5, boolean z17, Set set, String str3) {
        this.a = contextTrack;
        this.b = contextTrack2;
        this.c = list;
        this.d = list2;
        this.e = map;
        this.f = z;
        this.g = z2;
        this.h = str;
        this.i = str2;
        this.j = restrictions;
        this.k = ktw0Var;
        this.I = i;
        this.J = i2;
        this.l = z3;
        this.m = z4;
        this.n = list3;
        this.o = z5;
        this.f15p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = gcz0Var;
        this.x = z13;
        this.y = z14;
        this.z = z15;
        this.A = map2;
        this.B = map3;
        this.C = z16;
        this.D = map4;
        this.E = map5;
        this.F = z17;
        this.G = set;
        this.H = str3;
    }

    public static hcz0 a(hcz0 hcz0Var, ContextTrack contextTrack, ContextTrack contextTrack2, ArrayList arrayList, List list, Map map, boolean z, boolean z2, String str, String str2, ktw0 ktw0Var, int i, int i2, boolean z3, boolean z4, List list2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, gcz0 gcz0Var, boolean z11, LinkedHashMap linkedHashMap, Map map2, boolean z12, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, boolean z13, Set set, String str3, int i3, int i4) {
        ContextTrack contextTrack3 = (i3 & 1) != 0 ? hcz0Var.a : contextTrack;
        ContextTrack contextTrack4 = (i3 & 2) != 0 ? hcz0Var.b : contextTrack2;
        List list3 = (i3 & 4) != 0 ? hcz0Var.c : arrayList;
        List list4 = (i3 & 8) != 0 ? hcz0Var.d : list;
        Map map3 = (i3 & 16) != 0 ? hcz0Var.e : map;
        boolean z14 = (i3 & 32) != 0 ? hcz0Var.f : z;
        boolean z15 = (i3 & 64) != 0 ? hcz0Var.g : z2;
        String str4 = (i3 & 128) != 0 ? hcz0Var.h : str;
        String str5 = (i3 & 256) != 0 ? hcz0Var.i : str2;
        Restrictions restrictions = hcz0Var.j;
        ktw0 ktw0Var2 = (i3 & 1024) != 0 ? hcz0Var.k : ktw0Var;
        int i5 = (i3 & 2048) != 0 ? hcz0Var.I : i;
        int i6 = (i3 & 4096) != 0 ? hcz0Var.J : i2;
        boolean z16 = (i3 & 8192) != 0 ? hcz0Var.l : z3;
        boolean z17 = (i3 & 16384) != 0 ? hcz0Var.m : z4;
        List list5 = (32768 & i3) != 0 ? hcz0Var.n : list2;
        hcz0Var.getClass();
        boolean z18 = (131072 & i3) != 0 ? hcz0Var.o : z5;
        boolean z19 = (262144 & i3) != 0 ? hcz0Var.f15p : z6;
        boolean z20 = (524288 & i3) != 0 ? hcz0Var.q : z7;
        boolean z21 = (1048576 & i3) != 0 ? hcz0Var.r : z8;
        boolean z22 = (2097152 & i3) != 0 ? hcz0Var.s : z9;
        boolean z23 = hcz0Var.t;
        boolean z24 = (8388608 & i3) != 0 ? hcz0Var.u : z10;
        boolean z25 = (16777216 & i3) != 0 ? hcz0Var.v : true;
        gcz0 gcz0Var2 = (33554432 & i3) != 0 ? hcz0Var.w : gcz0Var;
        boolean z26 = (67108864 & i3) != 0 ? hcz0Var.x : z11;
        boolean z27 = hcz0Var.y;
        boolean z28 = hcz0Var.z;
        Map map4 = (i3 & 536870912) != 0 ? hcz0Var.A : linkedHashMap;
        Map map5 = (i3 & 1073741824) != 0 ? hcz0Var.B : map2;
        boolean z29 = (i3 & Integer.MIN_VALUE) != 0 ? hcz0Var.C : z12;
        Map map6 = (i4 & 1) != 0 ? hcz0Var.D : linkedHashMap2;
        Map map7 = (i4 & 2) != 0 ? hcz0Var.E : linkedHashMap3;
        boolean z30 = (i4 & 4) != 0 ? hcz0Var.F : z13;
        Set set2 = (i4 & 8) != 0 ? hcz0Var.G : set;
        String str6 = (i4 & 16) != 0 ? hcz0Var.H : str3;
        hcz0Var.getClass();
        return new hcz0(contextTrack3, contextTrack4, list3, list4, map3, z14, z15, str4, str5, restrictions, ktw0Var2, i5, i6, z16, z17, list5, z18, z19, z20, z21, z22, z23, z24, z25, gcz0Var2, z26, z27, z28, map4, map5, z29, map6, map7, z30, set2, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcz0)) {
            return false;
        }
        hcz0 hcz0Var = (hcz0) obj;
        return u890.j(this.a, hcz0Var.a) && u890.j(this.b, hcz0Var.b) && u890.j(this.c, hcz0Var.c) && u890.j(this.d, hcz0Var.d) && u890.j(this.e, hcz0Var.e) && this.f == hcz0Var.f && this.g == hcz0Var.g && u890.j(this.h, hcz0Var.h) && u890.j(this.i, hcz0Var.i) && u890.j(this.j, hcz0Var.j) && u890.j(this.k, hcz0Var.k) && this.I == hcz0Var.I && this.J == hcz0Var.J && this.l == hcz0Var.l && this.m == hcz0Var.m && u890.j(this.n, hcz0Var.n) && this.o == hcz0Var.o && this.f15p == hcz0Var.f15p && this.q == hcz0Var.q && this.r == hcz0Var.r && this.s == hcz0Var.s && this.t == hcz0Var.t && this.u == hcz0Var.u && this.v == hcz0Var.v && u890.j(this.w, hcz0Var.w) && this.x == hcz0Var.x && this.y == hcz0Var.y && this.z == hcz0Var.z && u890.j(this.A, hcz0Var.A) && u890.j(this.B, hcz0Var.B) && this.C == hcz0Var.C && u890.j(this.D, hcz0Var.D) && u890.j(this.E, hcz0Var.E) && this.F == hcz0Var.F && u890.j(this.G, hcz0Var.G) && u890.j(this.H, hcz0Var.H);
    }

    public final int hashCode() {
        ContextTrack contextTrack = this.a;
        int iHashCode = (contextTrack == null ? 0 : contextTrack.hashCode()) * 31;
        ContextTrack contextTrack2 = this.b;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g(ab80.k(this.J, ab80.k(this.I, (this.k.hashCode() + ((this.j.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(cy30.e(f4i1.b(f4i1.b((iHashCode + (contextTrack2 == null ? 0 : contextTrack2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31)) * 31, 31), 31), 31, this.l), 31, this.m), 31, this.n), 31, false), 31, this.o), 31, this.f15p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
        gcz0 gcz0Var = this.w;
        return this.H.hashCode() + gvg.c(xcg1.g(cy30.e(cy30.e(xcg1.g(cy30.e(cy30.e(xcg1.g(xcg1.g(xcg1.g((iG + (gcz0Var != null ? gcz0Var.hashCode() : 0)) * 31, 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hcz0(int i, boolean z, boolean z2, boolean z3) {
        Restrictions restrictions = Restrictions.EMPTY;
        jtw0 jtw0Var = jtw0.l;
        boolean z4 = (i & 4194304) != 0 ? false : z;
        boolean z5 = (i & 268435456) != 0 ? false : z3;
        w7x w7xVar = w7x.a;
        z6x z6xVar = z6x.a;
        b7x b7xVar = b7x.a;
        this(null, null, z6xVar, z6xVar, b7xVar, false, false, "", "", restrictions, jtw0Var, 3, 1, false, false, z6xVar, false, false, false, false, false, z4, false, false, null, false, z2, z5, b7xVar, b7xVar, false, b7xVar, b7xVar, false, w7xVar, "");
    }
}
