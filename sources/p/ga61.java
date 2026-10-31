package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class ga61 {
    public final int A;
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final Integer k;
    public final Boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f31p;
    public final wg61 q;
    public final fb61 r;
    public final td61 s;
    public final boolean t;
    public final boolean u;
    public final wi61 v;
    public final boolean w;
    public final boolean x;
    public final ab61 y;
    public final int z;
    public static final z961 Companion = new z961();
    public static final znb0[] B = {null, null, null, null, null, dm5.S(2, w661.d), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
    public static final ga61 C = new ga61();

    public /* synthetic */ ga61(int i, Long l, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, String str5, String str6, Integer num, Boolean bool, String str7, boolean z3, boolean z4, boolean z5, wg61 wg61Var, fb61 fb61Var, td61 td61Var, boolean z6, boolean z7, wi61 wi61Var, boolean z8, boolean z9, ab61 ab61Var) {
        String str8;
        String str9;
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = null;
            str8 = null;
        } else {
            this.i = str5;
            str8 = str5;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str6;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num;
        }
        if ((i & 2048) == 0) {
            this.l = Boolean.FALSE;
        } else {
            this.l = bool;
        }
        if ((i & 4096) == 0) {
            this.m = null;
            str9 = null;
        } else {
            str9 = str7;
            this.m = str9;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z3;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z4;
        }
        if ((32768 & i) == 0) {
            this.f31p = false;
        } else {
            this.f31p = z5;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = wg61Var;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = fb61Var;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = td61Var;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z6;
        }
        if ((1048576 & i) == 0) {
            this.u = false;
        } else {
            this.u = z7;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = wi61Var;
        }
        if ((4194304 & i) == 0) {
            this.w = false;
        } else {
            this.w = z8;
        }
        this.x = (8388608 & i) != 0 ? z9 : false;
        if ((i & 16777216) == 0) {
            this.y = null;
        } else {
            this.y = ab61Var;
        }
        this.z = bpo1.n(str9);
        this.A = bpo1.o(str8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga61)) {
            return false;
        }
        ga61 ga61Var = (ga61) obj;
        return u890.j(this.a, ga61Var.a) && u890.j(this.b, ga61Var.b) && u890.j(this.c, ga61Var.c) && u890.j(this.d, ga61Var.d) && u890.j(this.e, ga61Var.e) && u890.j(this.f, ga61Var.f) && this.g == ga61Var.g && this.h == ga61Var.h && u890.j(this.i, ga61Var.i) && u890.j(this.j, ga61Var.j) && u890.j(this.k, ga61Var.k) && u890.j(this.l, ga61Var.l) && u890.j(this.m, ga61Var.m) && this.n == ga61Var.n && this.o == ga61Var.o && this.f31p == ga61Var.f31p && u890.j(this.q, ga61Var.q) && u890.j(this.r, ga61Var.r) && u890.j(this.s, ga61Var.s) && this.t == ga61Var.t && this.u == ga61Var.u && u890.j(this.v, ga61Var.v) && this.w == ga61Var.w && this.x == ga61Var.x && u890.j(this.y, ga61Var.y);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f;
        int iG = xcg1.g(xcg1.g((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.g), 31, this.h);
        String str5 = this.i;
        int iHashCode6 = (iG + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.k;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.l;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.m;
        int iG2 = xcg1.g(xcg1.g(xcg1.g((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.f31p);
        wg61 wg61Var = this.q;
        int iHashCode10 = (iG2 + (wg61Var == null ? 0 : wg61Var.hashCode())) * 31;
        fb61 fb61Var = this.r;
        int iHashCode11 = (iHashCode10 + (fb61Var == null ? 0 : fb61Var.hashCode())) * 31;
        td61 td61Var = this.s;
        int iG3 = xcg1.g(xcg1.g((iHashCode11 + (td61Var == null ? 0 : td61Var.hashCode())) * 31, 31, this.t), 31, this.u);
        wi61 wi61Var = this.v;
        int iG4 = xcg1.g(xcg1.g((iG3 + (wi61Var == null ? 0 : wi61Var.hashCode())) * 31, 31, this.w), 31, this.x);
        ab61 ab61Var = this.y;
        return iG4 + (ab61Var != null ? ab61Var.hashCode() : 0);
    }

    public ga61() {
        Boolean bool = Boolean.FALSE;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = bool;
        this.m = null;
        this.n = false;
        this.o = false;
        this.f31p = false;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = false;
        this.u = false;
        this.v = null;
        this.w = false;
        this.x = false;
        this.y = null;
        this.z = bpo1.n((String) null);
        this.A = bpo1.o((String) null);
    }
}
