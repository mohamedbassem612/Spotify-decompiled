package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kby {
    public final String A;
    public final long B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final List F;
    public final List G;
    public final String a;
    public final String b;
    public final String c;
    public final ben d;
    public final x4i1 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final Boolean l;
    public final Boolean m;
    public final r2q0 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f49p;
    public final Map q;
    public final List r;
    public final fbp1 s;
    public final int t;
    public final x4i1 u;
    public final wls0 v;
    public final x7i1 w;
    public final tu00 x;
    public final e3c0 y;
    public final List z;

    public kby(String str, String str2, String str3, ben benVar, x4i1 x4i1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Boolean bool, Boolean bool2, r2q0 r2q0Var, boolean z7, String str4, Map map, List list, fbp1 fbp1Var, int i, x4i1 x4i1Var2, wls0 wls0Var, x7i1 x7i1Var, tu00 tu00Var, e3c0 e3c0Var, List list2, String str5, long j, boolean z8, boolean z9, boolean z10, List list3, List list4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = benVar;
        this.e = x4i1Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = bool;
        this.m = bool2;
        this.n = r2q0Var;
        this.o = z7;
        this.f49p = str4;
        this.q = map;
        this.r = list;
        this.s = fbp1Var;
        this.t = i;
        this.u = x4i1Var2;
        this.v = wls0Var;
        this.w = x7i1Var;
        this.x = tu00Var;
        this.y = e3c0Var;
        this.z = list2;
        this.A = str5;
        this.B = j;
        this.C = z8;
        this.D = z9;
        this.E = z10;
        this.F = list3;
        this.G = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kby)) {
            return false;
        }
        kby kbyVar = (kby) obj;
        return u890.j(this.a, kbyVar.a) && u890.j(this.b, kbyVar.b) && u890.j(this.c, kbyVar.c) && u890.j(this.d, kbyVar.d) && u890.j(this.e, kbyVar.e) && this.f == kbyVar.f && this.g == kbyVar.g && this.h == kbyVar.h && this.i == kbyVar.i && this.j == kbyVar.j && this.k == kbyVar.k && u890.j(this.l, kbyVar.l) && u890.j(this.m, kbyVar.m) && this.n == kbyVar.n && this.o == kbyVar.o && u890.j(this.f49p, kbyVar.f49p) && u890.j(this.q, kbyVar.q) && u890.j(this.r, kbyVar.r) && u890.j(this.s, kbyVar.s) && this.t == kbyVar.t && u890.j(this.u, kbyVar.u) && this.v == kbyVar.v && u890.j(this.w, kbyVar.w) && u890.j(this.x, kbyVar.x) && u890.j(this.y, kbyVar.y) && u890.j(this.z, kbyVar.z) && u890.j(this.A, kbyVar.A) && this.B == kbyVar.B && this.C == kbyVar.C && this.D == kbyVar.D && this.E == kbyVar.E && u890.j(this.F, kbyVar.F) && u890.j(this.G, kbyVar.G);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        x4i1 x4i1Var = this.e;
        int iG = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iHashCode + (x4i1Var == null ? 0 : x4i1Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        Boolean bool = this.l;
        int iHashCode2 = (iG + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.m;
        int iG2 = xcg1.g((this.n.hashCode() + ((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31)) * 31, 31, this.o);
        String str2 = this.f49p;
        int iF = kaa0.f(this.t, (this.s.hashCode() + f4i1.b(cy30.e((iG2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.q), 31, this.r)) * 31, 31);
        x4i1 x4i1Var2 = this.u;
        int iB = f4i1.b(f4i1.b((this.x.hashCode() + ((this.w.hashCode() + ((this.v.hashCode() + ((iF + (x4i1Var2 == null ? 0 : x4i1Var2.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.y.a), 31, this.z);
        String str3 = this.A;
        return this.G.hashCode() + f4i1.b(xcg1.g(xcg1.g(xcg1.g(cy30.f((iB + (str3 != null ? str3.hashCode() : 0)) * 31, this.B, 31), 31, this.C), 31, this.D), 31, this.E), 31, this.F);
    }

    public /* synthetic */ kby(String str, int i) {
        String str2 = (i & 1) != 0 ? "" : str;
        ben benVar = new ben();
        x7i1 x7i1Var = new x7i1(false, null, null, false, false, false, false, false, 8191);
        e3c0 e3c0Var = new e3c0();
        r2q0 r2q0Var = r2q0.a;
        b7x b7xVar = b7x.a;
        z6x z6xVar = z6x.a;
        this(str2, "", "", benVar, null, false, false, false, false, false, false, null, null, r2q0Var, false, null, b7xVar, z6xVar, swp0.c, 0, null, wls0.b, x7i1Var, tu00.a, e3c0Var, z6xVar, null, 0L, false, false, false, z6xVar, z6xVar);
    }
}
