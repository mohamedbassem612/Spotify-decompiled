package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gdp {
    public final n0y a;
    public final q2p0 b;
    public final lbp c = new lbp(this, 1, (byte) 14);
    public final jly0 d = byo.g(this, 2);
    public final jly0 e = byo.g(this, 3);
    public final jly0 f = byo.g(this, 4);
    public final jly0 g = byo.g(this, 5);
    public final lbp h = new lbp(this, 6, (byte) 14);
    public final jly0 i = byo.g(this, 8);
    public final jly0 j = byo.g(this, 7);
    public final jly0 k = byo.g(this, 9);
    public final jly0 l = byo.g(this, 10);
    public final jly0 m = byo.g(this, 11);
    public final jly0 n = byo.g(this, 12);
    public final jly0 o = byo.g(this, 13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f5p = byo.g(this, 15);
    public final jly0 q = byo.g(this, 16);
    public final jly0 r = byo.g(this, 14);
    public final jly0 s = byo.g(this, 17);
    public final jly0 t = byo.g(this, 18);
    public final jly0 u = byo.g(this, 19);
    public final jly0 v = byo.g(this, 20);
    public final lbp w = new lbp(this, 21, (byte) 14);
    public final jly0 x = byo.g(this, 23);
    public final jly0 y = byo.g(this, 22);
    public final jly0 z = byo.g(this, 24);
    public final jly0 A = byo.g(this, 25);
    public final lbp B = new lbp(this, 26, (byte) 14);
    public final lbp C = new lbp(this, 27, (byte) 14);
    public final jly0 D = xqu.b(new lbp(this, 28, (byte) 14));
    public final lbp E = new lbp(this, 29, (byte) 14);
    public final lbp F = new lbp(this, 30, (byte) 14);
    public final lbp G = new lbp(this, 31, (byte) 14);
    public final lbp H = new lbp(this, 32, (byte) 14);
    public final lbp I = new lbp(this, 33, (byte) 14);
    public final lbp J = new lbp(this, 34, (byte) 14);
    public final lbp K = new lbp(this, 35, (byte) 14);
    public final jly0 L = xqu.b(new lbp(this, 36, (byte) 14));
    public final lbp M = new lbp(this, 0, (byte) 14);

    public gdp(n0y n0yVar, q2p0 q2p0Var) {
        this.a = n0yVar;
        this.b = q2p0Var;
    }

    public final vu4 a() {
        luk lukVarW = this.a.w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public final sas b() {
        return new sas(this.c, (o2p0) this.d.get(), (n6r0) this.e.get(), (lik1) this.f.get());
    }

    public final FlowableMap c() {
        return f2u0.f((Flowable) this.g.get());
    }

    public final Flowable d() {
        FlowableMap flowableMapC = c();
        n0y n0yVar = this.a;
        gw70 gw70VarB = n0yVar.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = n0yVar.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerU = n0yVar.U();
        c8o.l(schedulerU);
        return f2u0.g(flowableMapC, gw70VarB, ufg1VarS, schedulerU);
    }

    public final dpt0 e() {
        jly0 jly0Var = this.g;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapC = c();
        Flowable flowableJ2 = ((Flowable) jly0Var.get()).j(mo9.O0);
        w9u0 w9u0Var = (w9u0) this.n.get();
        gn10 gn10Var = (gn10) this.o.get();
        n0y n0yVar = this.a;
        mnk0 mnk0VarM = n0yVar.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH1 = n0yVar.h1();
        c8o.l(peVarH1);
        luk lukVarW = n0yVar.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapC, flowableJ2, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH1, new qmr(new in4(lukVarW)));
    }

    public final FlowableMap f() {
        return f2u0.D((Flowable) this.g.get());
    }
}
