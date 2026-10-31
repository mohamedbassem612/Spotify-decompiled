package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class flf {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final Function0 e;
    public final Function0 f;
    public final Function0 g;
    public final iu30 h;
    public final Function0 i;
    public final Function0 j;
    public final Function0 k;
    public final Function0 l;
    public final Function0 m;
    public final Function0 n;
    public final Function0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function0 f9p;

    public flf(Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, Function0 function6, iu30 iu30Var, Function0 function7, Function0 function8, Function0 function9, Function0 function10, Function0 function11, Function0 function12, Function0 function13, Function0 function14) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = function3;
        this.e = function4;
        this.f = function5;
        this.g = function6;
        this.h = iu30Var;
        this.i = function7;
        this.j = function8;
        this.k = function9;
        this.l = function10;
        this.m = function11;
        this.n = function12;
        this.o = function13;
        this.f9p = function14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flf)) {
            return false;
        }
        flf flfVar = (flf) obj;
        return u890.j(this.a, flfVar.a) && u890.j(this.b, flfVar.b) && u890.j(this.c, flfVar.c) && u890.j(this.d, flfVar.d) && u890.j(this.e, flfVar.e) && u890.j(this.f, flfVar.f) && u890.j(this.g, flfVar.g) && u890.j(this.h, flfVar.h) && u890.j(this.i, flfVar.i) && u890.j(this.j, flfVar.j) && u890.j(this.k, flfVar.k) && u890.j(this.l, flfVar.l) && u890.j(this.m, flfVar.m) && u890.j(this.n, flfVar.n) && u890.j(this.o, flfVar.o) && u890.j(this.f9p, flfVar.f9p);
    }

    public final int hashCode() {
        int iN = rjx.n(this.a.hashCode() * 31, 31, this.b);
        Function0 function0 = this.c;
        int iHashCode = (iN + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0 function1 = this.d;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0 function2 = this.e;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function0 function3 = this.f;
        int iN2 = rjx.n((iHashCode3 + (function3 == null ? 0 : function3.hashCode())) * 31, 31, this.g);
        iu30 iu30Var = this.h;
        int iN3 = rjx.n(rjx.n((iN2 + (iu30Var == null ? 0 : iu30Var.hashCode())) * 31, 31, this.i), 31, this.j);
        Function0 function4 = this.k;
        int iHashCode4 = (iN3 + (function4 == null ? 0 : function4.hashCode())) * 31;
        Function0 function5 = this.l;
        int iHashCode5 = (iHashCode4 + (function5 == null ? 0 : function5.hashCode())) * 31;
        Function0 function6 = this.m;
        int iHashCode6 = (iHashCode5 + (function6 == null ? 0 : function6.hashCode())) * 31;
        Function0 function7 = this.n;
        int iHashCode7 = (iHashCode6 + (function7 == null ? 0 : function7.hashCode())) * 31;
        Function0 function8 = this.o;
        int iHashCode8 = (iHashCode7 + (function8 == null ? 0 : function8.hashCode())) * 31;
        Function0 function9 = this.f9p;
        return iHashCode8 + (function9 != null ? function9.hashCode() : 0);
    }
}
