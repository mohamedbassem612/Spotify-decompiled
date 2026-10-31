package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gg31 {
    public final apl a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final w4i1 l;
    public final float m;
    public final fg31 n;
    public final long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f17p;
    public final List q;
    public final List r;
    public final Function0 s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final bg31 w;
    public final v721 x;

    public gg31(apl aplVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, boolean z7, w4i1 w4i1Var, float f, fg31 fg31Var, long j, boolean z8, List list, List list2, Function0 function0, boolean z9, boolean z10, boolean z11, bg31 bg31Var, v721 v721Var) {
        this.a = aplVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = str3;
        this.k = z7;
        this.l = w4i1Var;
        this.m = f;
        this.n = fg31Var;
        this.o = j;
        this.f17p = z8;
        this.q = list;
        this.r = list2;
        this.s = function0;
        this.t = z9;
        this.u = z10;
        this.v = z11;
        this.w = bg31Var;
        this.x = v721Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gg31) {
            gg31 gg31Var = (gg31) obj;
            return this.a.equals(gg31Var.a) && u890.j(this.b, gg31Var.b) && u890.j(this.c, gg31Var.c) && this.d == gg31Var.d && this.e == gg31Var.e && this.f == gg31Var.f && this.g == gg31Var.g && this.h == gg31Var.h && this.i == gg31Var.i && u890.j(this.j, gg31Var.j) && this.k == gg31Var.k && u890.j(this.l, gg31Var.l) && p3v.c(this.m, gg31Var.m) && this.n.equals(gg31Var.n) && this.o == gg31Var.o && this.f17p == gg31Var.f17p && u890.j(this.q, gg31Var.q) && u890.j(this.r, gg31Var.r) && this.s.equals(gg31Var.s) && this.t == gg31Var.t && this.u == gg31Var.u && this.v == gg31Var.v && this.w.equals(gg31Var.w) && this.x == gg31Var.x;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode() + ((this.w.hashCode() + xcg1.g(xcg1.g(xcg1.g(rjx.n(f4i1.b(f4i1.b(xcg1.g(cy30.f((this.n.hashCode() + x0d.f(ydh.d(this.l, xcg1.g(cy30.d(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31), 31, this.m)) * 31, this.o, 31), 31, this.f17p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v)) * 31);
    }
}
