package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iip {
    public final hm30 a;
    public final q2p0 b;
    public final jly0 c = byo.i(this, 2);
    public final jly0 d = byo.i(this, 3);
    public final jly0 e = byo.i(this, 4);
    public final jly0 f = byo.i(this, 6);
    public final jly0 g = byo.i(this, 7);
    public final jly0 h = byo.i(this, 5);
    public final jly0 i = byo.i(this, 9);
    public final jly0 j = byo.i(this, 8);
    public final jly0 k = byo.i(this, 10);
    public final jly0 l = byo.i(this, 11);
    public final jly0 m = byo.i(this, 12);
    public final jly0 n = byo.i(this, 13);
    public final jly0 o = byo.i(this, 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f26p = byo.i(this, 15);
    public final jly0 q = byo.i(this, 17);
    public final jly0 r = byo.i(this, 16);
    public final jly0 s = xqu.b(new chp(this, 19, (byte) 9));
    public final chp t = new chp(this, 18, (byte) 9);
    public final chp u = new chp(this, 22, (byte) 9);
    public final chp v = new chp(this, 23, (byte) 9);
    public final jly0 w = byo.i(this, 21);
    public final chp x = new chp(this, 24, (byte) 9);
    public final jly0 y = byo.i(this, 25);
    public final jly0 z = byo.i(this, 26);
    public final chp A = new chp(this, 20, (byte) 9);
    public final chp B = new chp(this, 27, (byte) 9);
    public final jly0 C = xqu.b(new chp(this, 29, (byte) 9));
    public final jly0 D = xqu.b(new chp(this, 28, (byte) 9));
    public final jly0 E = byo.i(this, 30);
    public final chp F = new chp(this, 31, (byte) 9);
    public final chp G = new chp(this, 32, (byte) 9);
    public final jly0 H = xqu.b(new chp(this, 33, (byte) 9));
    public final chp I = new chp(this, 34, (byte) 9);
    public final chp J = new chp(this, 35, (byte) 9);
    public final chp K = new chp(this, 36, (byte) 9);
    public final chp L = new chp(this, 37, (byte) 9);
    public final chp M = new chp(this, 38, (byte) 9);
    public final chp N = new chp(this, 39, (byte) 9);
    public final jly0 O = byo.i(this, 1);
    public final jly0 P = byo.i(this, 42);
    public final jly0 Q = byo.i(this, 41);
    public final jly0 R = byo.i(this, 43);
    public final chp S = new chp(this, 40, (byte) 9);
    public final chp T = new chp(this, 44, (byte) 9);
    public final chp U = new chp(this, 45, (byte) 9);
    public final jly0 V = byo.i(this, 47);
    public final chp W = new chp(this, 46, (byte) 9);
    public final jly0 X = byo.i(this, 49);
    public final chp Y = new chp(this, 48, (byte) 9);
    public final chp Z = new chp(this, 50, (byte) 9);
    public final jly0 a0 = byo.i(this, 51);
    public final jly0 b0 = byo.i(this, 52);
    public final jly0 c0 = byo.i(this, 53);
    public final chp d0 = new chp(this, 54, (byte) 9);
    public final jly0 e0 = xqu.b(new chp(this, 55, (byte) 9));
    public final chp f0 = new chp(this, 0, (byte) 9);

    public iip(hm30 hm30Var, q2p0 q2p0Var) {
        this.a = hm30Var;
        this.b = q2p0Var;
    }

    public final vu4 a() {
        luk lukVarW = this.a.w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public final FlowableMap b() {
        return f2u0.f((Flowable) this.c.get());
    }

    public final Flowable c() {
        FlowableMap flowableMapB = b();
        hm30 hm30Var = this.a;
        gw70 gw70VarB = hm30Var.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = hm30Var.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerO = hm30Var.o();
        c8o.l(schedulerO);
        return f2u0.g(flowableMapB, gw70VarB, ufg1VarS, schedulerO);
    }

    public final Flowable d() {
        return ((Flowable) this.c.get()).j(mo9.O0);
    }

    public final sas e() {
        return new sas((o2p0) this.y.get(), (n6r0) this.z.get(), (lik1) this.q.get(), (byte) 3);
    }

    public final dpt0 f() {
        jly0 jly0Var = this.c;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapB = b();
        Flowable flowableD = d();
        w9u0 w9u0Var = (w9u0) this.d.get();
        gn10 gn10Var = (gn10) this.e.get();
        hm30 hm30Var = this.a;
        mnk0 mnk0VarM = hm30Var.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH = hm30Var.h();
        c8o.l(peVarH);
        luk lukVarW = hm30Var.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapB, flowableD, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW)));
    }

    public final FlowableMap g() {
        return f2u0.D((Flowable) this.c.get());
    }

    public final yp91 h() {
        hm30 hm30Var = this.a;
        uvy uvyVarQ0 = hm30Var.q0();
        c8o.l(uvyVarQ0);
        luk lukVarW = hm30Var.w();
        c8o.l(lukVarW);
        yu4 yu4Var = new yu4(false, lukVarW);
        q8n q8nVarD = hm30Var.d();
        c8o.l(q8nVarD);
        return new yp91(g(), uvyVarQ0, yu4Var, q8nVarD);
    }
}
