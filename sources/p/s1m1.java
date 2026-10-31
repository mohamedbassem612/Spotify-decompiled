package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s1m1 {
    public final String a;
    public final int b;
    public final int c;
    public final Long d;
    public final i5u0 e;
    public final wa0 f;
    public final e58 g;
    public final String h;
    public final int i;
    public final String j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final List n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final List f38p;
    public final Integer q;
    public final boolean r;
    public final int s;
    public final ryl1 t;
    public final String u;

    public s1m1(String str, int i, int i2, Long l, i5u0 i5u0Var, wa0 wa0Var, e58 e58Var, String str2, int i3, String str3, boolean z, String str4, boolean z2, List list, int i4, List list2, Integer num, boolean z3, int i5, ryl1 ryl1Var, String str5) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = l;
        this.e = i5u0Var;
        this.f = wa0Var;
        this.g = e58Var;
        this.h = str2;
        this.i = i3;
        this.j = str3;
        this.k = z;
        this.l = str4;
        this.m = z2;
        this.n = list;
        this.o = i4;
        this.f38p = list2;
        this.q = num;
        this.r = z3;
        this.s = i5;
        this.t = ryl1Var;
        this.u = str5;
    }

    public static s1m1 a(s1m1 s1m1Var, int i, int i2, Long l, i5u0 i5u0Var, wa0 wa0Var, e58 e58Var, String str, int i3, String str2, boolean z, String str3, boolean z2, List list, int i4, List list2, Integer num, boolean z3, int i5, int i6) {
        String str4 = s1m1Var.a;
        int i7 = (i6 & 2) != 0 ? s1m1Var.b : i;
        int i8 = (i6 & 4) != 0 ? s1m1Var.c : i2;
        Long l2 = (i6 & 8) != 0 ? s1m1Var.d : l;
        i5u0 i5u0Var2 = (i6 & 16) != 0 ? s1m1Var.e : i5u0Var;
        wa0 wa0Var2 = (i6 & 32) != 0 ? s1m1Var.f : wa0Var;
        e58 e58Var2 = (i6 & 64) != 0 ? s1m1Var.g : e58Var;
        String str5 = (i6 & 128) != 0 ? s1m1Var.h : str;
        int i9 = (i6 & 256) != 0 ? s1m1Var.i : i3;
        String str6 = (i6 & 512) != 0 ? s1m1Var.j : str2;
        boolean z4 = (i6 & 1024) != 0 ? s1m1Var.k : z;
        String str7 = (i6 & 2048) != 0 ? s1m1Var.l : str3;
        boolean z5 = (i6 & 4096) != 0 ? s1m1Var.m : z2;
        List list3 = (i6 & 8192) != 0 ? s1m1Var.n : list;
        int i10 = (i6 & 16384) != 0 ? s1m1Var.o : i4;
        List list4 = (i6 & 32768) != 0 ? s1m1Var.f38p : list2;
        Integer num2 = (i6 & 65536) != 0 ? s1m1Var.q : num;
        boolean z6 = (i6 & 131072) != 0 ? s1m1Var.r : z3;
        s1m1Var.getClass();
        s1m1Var.getClass();
        int i11 = (i6 & 1048576) != 0 ? s1m1Var.s : i5;
        ryl1 ryl1Var = s1m1Var.t;
        String str8 = s1m1Var.u;
        s1m1Var.getClass();
        return new s1m1(str4, i7, i8, l2, i5u0Var2, wa0Var2, e58Var2, str5, i9, str6, z4, str7, z5, list3, i10, list4, num2, z6, i11, ryl1Var, str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1m1)) {
            return false;
        }
        s1m1 s1m1Var = (s1m1) obj;
        return u890.j(this.a, s1m1Var.a) && this.b == s1m1Var.b && this.c == s1m1Var.c && u890.j(this.d, s1m1Var.d) && u890.j(this.e, s1m1Var.e) && u890.j(this.f, s1m1Var.f) && u890.j(this.g, s1m1Var.g) && u890.j(this.h, s1m1Var.h) && this.i == s1m1Var.i && u890.j(this.j, s1m1Var.j) && this.k == s1m1Var.k && u890.j(this.l, s1m1Var.l) && this.m == s1m1Var.m && u890.j(this.n, s1m1Var.n) && this.o == s1m1Var.o && u890.j(this.f38p, s1m1Var.f38p) && u890.j(this.q, s1m1Var.q) && this.r == s1m1Var.r && this.s == s1m1Var.s && u890.j(this.t, s1m1Var.t) && u890.j(this.u, s1m1Var.u);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31);
        Long l = this.d;
        int iHashCode = (this.e.hashCode() + ((iF + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        wa0 wa0Var = this.f;
        int iHashCode2 = (iHashCode + (wa0Var == null ? 0 : wa0Var.hashCode())) * 31;
        e58 e58Var = this.g;
        int iHashCode3 = (iHashCode2 + (e58Var == null ? 0 : e58Var.hashCode())) * 31;
        String str = this.h;
        int iK = ab80.k(this.i, (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.j;
        int iG = xcg1.g((iK + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
        String str3 = this.l;
        int iB = f4i1.b(kaa0.f(this.o, f4i1.b(xcg1.g((iG + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.m), 31, this.n), 31), 31, this.f38p);
        Integer num = this.q;
        return this.u.hashCode() + ((this.t.hashCode() + kaa0.f(this.s, kaa0.f(0, xcg1.g((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.r), 961), 31)) * 31);
    }

    public /* synthetic */ s1m1(String str, ryl1 ryl1Var, String str2) {
        i5u0 i5u0Var = new i5u0(3, 0, 0, 0L, null);
        z6x z6xVar = z6x.a;
        this(str, 1, 0, null, i5u0Var, null, null, null, 1, null, false, null, true, z6xVar, 0, z6xVar, null, true, 0, ryl1Var, str2);
    }
}
