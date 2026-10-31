package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zyi0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final w4i1 d;
    public final float e;
    public final yyi0 f;
    public final long g;
    public final boolean h;
    public final List i;
    public final Function0 j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final uyi0 n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f44p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final iu30 w;

    public zyi0(String str, boolean z, String str2, w4i1 w4i1Var, float f, yyi0 yyi0Var, long j, boolean z2, List list, Function0 function0, boolean z3, boolean z4, boolean z5, uyi0 uyi0Var, boolean z6, boolean z7, List list2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, iu30 iu30Var) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = w4i1Var;
        this.e = f;
        this.f = yyi0Var;
        this.g = j;
        this.h = z2;
        this.i = list;
        this.j = function0;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = uyi0Var;
        this.o = z6;
        this.f44p = z7;
        this.q = list2;
        this.r = z8;
        this.s = z9;
        this.t = z10;
        this.u = z11;
        this.v = z12;
        this.w = iu30Var;
    }

    public final boolean a() {
        uyi0 uyi0Var = this.n;
        return (uyi0Var instanceof tyi0) || (uyi0Var instanceof syi0) || (uyi0Var instanceof oyi0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyi0)) {
            return false;
        }
        zyi0 zyi0Var = (zyi0) obj;
        return u890.j(this.a, zyi0Var.a) && this.b == zyi0Var.b && u890.j(this.c, zyi0Var.c) && u890.j(this.d, zyi0Var.d) && p3v.c(this.e, zyi0Var.e) && this.f.equals(zyi0Var.f) && this.g == zyi0Var.g && this.h == zyi0Var.h && u890.j(this.i, zyi0Var.i) && this.j.equals(zyi0Var.j) && this.k == zyi0Var.k && this.l == zyi0Var.l && this.m == zyi0Var.m && this.n.equals(zyi0Var.n) && this.o == zyi0Var.o && this.f44p == zyi0Var.f44p && u890.j(this.q, zyi0Var.q) && this.r == zyi0Var.r && this.s == zyi0Var.s && this.t == zyi0Var.t && this.u == zyi0Var.u && this.v == zyi0Var.v && u890.j(this.w, zyi0Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(f4i1.b(xcg1.g(xcg1.g((this.n.hashCode() + xcg1.g(xcg1.g(xcg1.g(rjx.n(f4i1.b(xcg1.g(cy30.f((this.f.hashCode() + x0d.f(ydh.d(this.d, cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, this.g, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31, 31, this.o), 31, this.f44p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v);
    }
}
