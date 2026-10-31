package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f6h0 implements h0r0 {
    public final kyj a;
    public final x6h0 b;
    public final w6h0 c;
    public final n18 d;
    public final mr4 e;
    public final yo2 f;
    public final m680 g;
    public final kly0 h;
    public final exg1 i;
    public final yrn j;
    public final los k;
    public final dt71 l;
    public final dt71 m;
    public final hrr0 n;
    public final hrr0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hrr0 f26p;
    public final idd1 q;
    public final boolean r;
    public final h3h1 s;
    public final or4 t;
    public final cbr0 u;

    public f6h0(kyj kyjVar, x6h0 x6h0Var, w6h0 w6h0Var, n18 n18Var, mr4 mr4Var, yo2 yo2Var, m680 m680Var, jt2 jt2Var, blp blpVar, kg01 kg01Var, exg1 exg1Var, yrn yrnVar, a2n a2nVar, luk lukVar, mos mosVar, frp frpVar, ks6 ks6Var, jrp jrpVar, q7r0 q7r0Var, cyp cypVar, lik1 lik1Var, e5b0 e5b0Var) {
        this.a = kyjVar;
        this.b = x6h0Var;
        this.c = w6h0Var;
        this.d = n18Var;
        this.e = mr4Var;
        this.f = yo2Var;
        this.g = m680Var;
        this.h = blpVar;
        this.i = exg1Var;
        this.j = yrnVar;
        los losVarA = mos.a();
        this.k = losVarA;
        this.l = mgo1.e(0, 1, 2, 1);
        this.m = mgo1.e(0, 1, 0, 5);
        this.n = xto.t((Object) null);
        this.o = xto.t(Boolean.FALSE);
        this.f26p = xto.t(Boolean.valueOf(x6h0Var.b() == 3));
        this.q = new idd1(new dy7(frpVar, this, jrpVar, ks6Var, cypVar, q7r0Var, (byte) 11));
        boolean z = x6h0Var.a() instanceof m6h0;
        this.r = z;
        if (!z) {
        }
        this.s = z ? new h3h1(s4h0.i) : new h3h1(s4h0.t);
        this.t = new or4(lukVar);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.u = new cbr0(new dbr0[]{new bn70(yon1.N2(), lik1Var, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, new kxb(2131101161), losVarA, false, false, false, (nsm0) null, 4045), new tc30(1), new s9h1(14, true, false, false), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.u;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(799734670, new kmd0(this, (byte) 29), true), new dx81(new e6h0(this), new e4f0(this, (byte) 29), new ruc0(this, (byte) 12)));
    }
}
