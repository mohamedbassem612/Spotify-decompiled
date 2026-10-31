package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lfi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final d2k1 f;
    public final String g;
    public final String h;
    public final String i;
    public final k4m j;
    public final wcm k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f20p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final Function0 t;
    public final Function0 u;
    public final hfi0 v;
    public final String w;
    public final Float x;

    public /* synthetic */ lfi0(String str, String str2, String str3, String str4, String str5, d2k1 d2k1Var, String str6, String str7, String str8, k4m k4mVar, wcm wcmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str9, Float f, int i) {
        this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : d2k1Var, str6, str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? k4m.d : k4mVar, wcmVar, (i & 4096) != 0 ? false : z, false, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? false : z4, (131072 & i) != 0 ? true : z5, (262144 & i) != 0 ? false : z6, (524288 & i) != 0 ? false : z7, null, null, ffi0.a, (8388608 & i) != 0 ? null : str9, (i & 16777216) != 0 ? null : f);
    }

    public static lfi0 a(lfi0 lfi0Var, wcm wcmVar, boolean z, Function0 function0, Function0 function1, hfi0 hfi0Var, int i) {
        return new lfi0(lfi0Var.a, lfi0Var.b, lfi0Var.c, lfi0Var.d, lfi0Var.e, lfi0Var.f, lfi0Var.g, lfi0Var.h, lfi0Var.i, lfi0Var.j, (i & 2048) != 0 ? lfi0Var.k : wcmVar, (i & 4096) != 0 ? lfi0Var.l : false, (i & 8192) != 0 ? lfi0Var.m : true, lfi0Var.n, (i & 32768) != 0 ? lfi0Var.o : z, lfi0Var.f20p, lfi0Var.q, lfi0Var.r, lfi0Var.s, (i & 1048576) != 0 ? lfi0Var.t : function0, (i & 2097152) != 0 ? lfi0Var.u : function1, (i & 4194304) != 0 ? lfi0Var.v : hfi0Var, lfi0Var.w, lfi0Var.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfi0)) {
            return false;
        }
        lfi0 lfi0Var = (lfi0) obj;
        return u890.j(this.a, lfi0Var.a) && u890.j(this.b, lfi0Var.b) && u890.j(this.c, lfi0Var.c) && u890.j(this.d, lfi0Var.d) && u890.j(this.e, lfi0Var.e) && u890.j(this.f, lfi0Var.f) && u890.j(this.g, lfi0Var.g) && u890.j(this.h, lfi0Var.h) && u890.j(this.i, lfi0Var.i) && this.j == lfi0Var.j && u890.j(this.k, lfi0Var.k) && this.l == lfi0Var.l && this.m == lfi0Var.m && this.n == lfi0Var.n && this.o == lfi0Var.o && this.f20p == lfi0Var.f20p && this.q == lfi0Var.q && this.r == lfi0Var.r && this.s == lfi0Var.s && u890.j(this.t, lfi0Var.t) && u890.j(this.u, lfi0Var.u) && u890.j(this.v, lfi0Var.v) && u890.j(this.w, lfi0Var.w) && u890.j(this.x, lfi0Var.x);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        d2k1 d2k1Var = this.f;
        int iHashCode4 = (iHashCode3 + (d2k1Var == null ? 0 : d2k1Var.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 961;
        String str6 = this.h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.i;
        int iG = p3d1.g(this.j, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        wcm wcmVar = this.k;
        int iG2 = xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g((iG + (wcmVar == null ? 0 : wcmVar.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.f20p), 31, this.q), 31, this.r), 31, this.s);
        Function0 function0 = this.t;
        int iHashCode7 = (iG2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.u;
        int iHashCode8 = (this.v.hashCode() + ((iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31)) * 31;
        String str8 = this.w;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f = this.x;
        return iHashCode9 + (f != null ? f.hashCode() : 0);
    }

    public lfi0(String str, String str2, String str3, String str4, String str5, d2k1 d2k1Var, String str6, String str7, String str8, k4m k4mVar, wcm wcmVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Function0 function0, Function0 function1, hfi0 hfi0Var, String str9, Float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = d2k1Var;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = k4mVar;
        this.k = wcmVar;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.f20p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = function0;
        this.u = function1;
        this.v = hfi0Var;
        this.w = str9;
        this.x = f;
    }
}
