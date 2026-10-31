package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eux0 {
    public final qqn1 a;
    public final String b;
    public final boolean c;
    public final oqn1 d;
    public final dux0 e;
    public final boolean f;
    public final nua0 g;
    public final String h;
    public final kqf1 i;
    public final boolean j;
    public final List k;
    public final String l;
    public final String m;
    public final Boolean n;
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f12p;
    public final Set q;
    public final Set r;
    public final List s;
    public final boolean t;
    public final List u;
    public final List v;
    public final ttx0 w;
    public final boolean x;
    public final boolean y;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ eux0(qqn1 qqn1Var, String str, boolean z, oqn1 oqn1Var, dux0 dux0Var, boolean z2, String str2, kqf1 kqf1Var, List list, String str3, String str4, Boolean bool, String str5, boolean z3, Set set, Set set2, boolean z4, ArrayList arrayList, ttx0 ttx0Var, boolean z5, int i) {
        boolean z6 = (i & 32) != 0 ? true : z2;
        String str6 = (i & 128) != 0 ? null : str2;
        kqf1 kqf1Var2 = (i & 256) != 0 ? null : kqf1Var;
        String str7 = (i & 4096) != 0 ? null : str3;
        Boolean bool2 = (i & 16384) != 0 ? null : bool;
        String str8 = (32768 & i) != 0 ? null : str5;
        int i2 = 131072 & i;
        Set set3 = w7x.a;
        Set set4 = i2 != 0 ? set3 : set;
        Set set5 = (262144 & i) != 0 ? set3 : set2;
        boolean z7 = (1048576 & i) != 0 ? false : z4;
        int i3 = 2097152 & i;
        ArrayList arrayList2 = z6x.a;
        this(qqn1Var, str, z, oqn1Var, dux0Var, z6, lua0.a, str6, kqf1Var2, false, list, str7, str4, bool2, str8, z3, set4, set5, arrayList2, z7, i3 != 0 ? arrayList2 : arrayList, arrayList2, ttx0Var, (i & 16777216) != 0 ? false : z5);
    }

    public static eux0 a(eux0 eux0Var, qqn1 qqn1Var, dux0 dux0Var, boolean z, nua0 nua0Var, kqf1 kqf1Var, boolean z2, Set set, Set set2, List list, boolean z3, List list2, List list3, int i) {
        qqn1 qqn1Var2 = (i & 1) != 0 ? eux0Var.a : qqn1Var;
        String str = eux0Var.b;
        boolean z4 = eux0Var.c;
        oqn1 oqn1Var = eux0Var.d;
        dux0 dux0Var2 = (i & 16) != 0 ? eux0Var.e : dux0Var;
        boolean z5 = (i & 32) != 0 ? eux0Var.f : z;
        nua0 nua0Var2 = (i & 64) != 0 ? eux0Var.g : nua0Var;
        String str2 = eux0Var.h;
        kqf1 kqf1Var2 = (i & 256) != 0 ? eux0Var.i : kqf1Var;
        boolean z6 = (i & 512) != 0 ? eux0Var.j : z2;
        eux0Var.getClass();
        List list4 = eux0Var.k;
        String str3 = eux0Var.l;
        String str4 = eux0Var.m;
        Boolean bool = eux0Var.n;
        String str5 = eux0Var.o;
        boolean z7 = eux0Var.f12p;
        Set set3 = (i & 131072) != 0 ? eux0Var.q : set;
        Set set4 = (i & 262144) != 0 ? eux0Var.r : set2;
        List list5 = (i & 524288) != 0 ? eux0Var.s : list;
        boolean z8 = (i & 1048576) != 0 ? eux0Var.t : z3;
        List list6 = (i & 2097152) != 0 ? eux0Var.u : list2;
        List list7 = (i & 4194304) != 0 ? eux0Var.v : list3;
        ttx0 ttx0Var = eux0Var.w;
        boolean z9 = (i & 16777216) != 0 ? eux0Var.x : false;
        eux0Var.getClass();
        return new eux0(qqn1Var2, str, z4, oqn1Var, dux0Var2, z5, nua0Var2, str2, kqf1Var2, z6, list4, str3, str4, bool, str5, z7, set3, set4, list5, z8, list6, list7, ttx0Var, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eux0)) {
            return false;
        }
        eux0 eux0Var = (eux0) obj;
        return u890.j(this.a, eux0Var.a) && u890.j(this.b, eux0Var.b) && this.c == eux0Var.c && u890.j(this.d, eux0Var.d) && u890.j(this.e, eux0Var.e) && this.f == eux0Var.f && u890.j(this.g, eux0Var.g) && u890.j(this.h, eux0Var.h) && u890.j(this.i, eux0Var.i) && this.j == eux0Var.j && u890.j(this.k, eux0Var.k) && u890.j(this.l, eux0Var.l) && u890.j(this.m, eux0Var.m) && u890.j(this.n, eux0Var.n) && u890.j(this.o, eux0Var.o) && this.f12p == eux0Var.f12p && u890.j(this.q, eux0Var.q) && u890.j(this.r, eux0Var.r) && u890.j(this.s, eux0Var.s) && this.t == eux0Var.t && u890.j(this.u, eux0Var.u) && u890.j(this.v, eux0Var.v) && u890.j(this.w, eux0Var.w) && this.x == eux0Var.x;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + xcg1.g((this.e.hashCode() + ((this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f)) * 31;
        String str = this.h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        kqf1 kqf1Var = this.i;
        int iB = f4i1.b(xcg1.g((iHashCode2 + (kqf1Var == null ? 0 : kqf1Var.hashCode())) * 31, 961, this.j), 31, this.k);
        String str2 = this.l;
        int iHashCode3 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.m;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.n;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.o;
        return Boolean.hashCode(this.x) + ((this.w.hashCode() + f4i1.b(f4i1.b(xcg1.g(f4i1.b(gvg.c(gvg.c(xcg1.g((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.f12p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v)) * 31);
    }

    public eux0(qqn1 qqn1Var, String str, boolean z, oqn1 oqn1Var, dux0 dux0Var, boolean z2, nua0 nua0Var, String str2, kqf1 kqf1Var, boolean z3, List list, String str3, String str4, Boolean bool, String str5, boolean z4, Set set, Set set2, List list2, boolean z5, List list3, List list4, ttx0 ttx0Var, boolean z6) {
        this.a = qqn1Var;
        this.b = str;
        this.c = z;
        this.d = oqn1Var;
        this.e = dux0Var;
        this.f = z2;
        this.g = nua0Var;
        this.h = str2;
        this.i = kqf1Var;
        this.j = z3;
        this.k = list;
        this.l = str3;
        this.m = str4;
        this.n = bool;
        this.o = str5;
        this.f12p = z4;
        this.q = set;
        this.r = set2;
        this.s = list2;
        this.t = z5;
        this.u = list3;
        this.v = list4;
        this.w = ttx0Var;
        this.x = z6;
        this.y = true ^ (str4 == null || str4.length() == 0);
    }
}
