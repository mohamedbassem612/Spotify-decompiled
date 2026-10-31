package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ynq {
    public final uh11 a;
    public final q2p0 b;
    public final jly0 c = byo.w(this, 2);
    public final jly0 d = byo.w(this, 3);
    public final jly0 e = byo.w(this, 4);
    public final jly0 f = byo.w(this, 6);
    public final jly0 g = byo.w(this, 7);
    public final jly0 h = byo.w(this, 5);
    public final jly0 i = byo.w(this, 9);
    public final jly0 j = byo.w(this, 8);
    public final jly0 k = byo.w(this, 10);
    public final jly0 l = byo.w(this, 11);
    public final jly0 m = byo.w(this, 12);
    public final jly0 n = byo.w(this, 13);
    public final jly0 o = byo.w(this, 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f85p = byo.w(this, 15);
    public final jly0 q = byo.w(this, 17);
    public final jly0 r = byo.w(this, 16);
    public final jly0 s = xqu.b(new ykq(this, 19, (byte) 16));
    public final ykq t = new ykq(this, 18, (byte) 16);
    public final ykq u = new ykq(this, 22, (byte) 16);
    public final ykq v = new ykq(this, 23, (byte) 16);
    public final jly0 w = byo.w(this, 21);
    public final ykq x = new ykq(this, 24, (byte) 16);
    public final jly0 y = byo.w(this, 25);
    public final jly0 z = byo.w(this, 26);
    public final ykq A = new ykq(this, 20, (byte) 16);
    public final ykq B = new ykq(this, 27, (byte) 16);
    public final jly0 C = xqu.b(new ykq(this, 29, (byte) 16));
    public final jly0 D = xqu.b(new ykq(this, 28, (byte) 16));
    public final jly0 E = byo.w(this, 30);
    public final ykq F = new ykq(this, 31, (byte) 16);
    public final ykq G = new ykq(this, 32, (byte) 16);
    public final jly0 H = xqu.b(new ykq(this, 33, (byte) 16));
    public final ykq I = new ykq(this, 34, (byte) 16);
    public final ykq J = new ykq(this, 35, (byte) 16);
    public final ykq K = new ykq(this, 36, (byte) 16);
    public final ykq L = new ykq(this, 37, (byte) 16);
    public final ykq M = new ykq(this, 38, (byte) 16);
    public final ykq N = new ykq(this, 39, (byte) 16);
    public final jly0 O = byo.w(this, 1);
    public final jly0 P = byo.w(this, 40);
    public final ykq Q = new ykq(this, 42, (byte) 16);
    public final ykq R = new ykq(this, 43, (byte) 16);
    public final jly0 S = byo.w(this, 41);
    public final jly0 T = byo.w(this, 45);
    public final jly0 U = byo.w(this, 44);
    public final jly0 V = byo.w(this, 46);
    public final ykq W = new ykq(this, 47, (byte) 16);
    public final ykq X = new ykq(this, 49, (byte) 16);
    public final ykq Y = new ykq(this, 50, (byte) 16);
    public final jly0 Z = byo.w(this, 48);
    public final ykq a0 = new ykq(this, 51, (byte) 16);
    public final jly0 b0 = byo.w(this, 52);
    public final jly0 c0 = byo.w(this, 53);
    public final jly0 d0 = byo.w(this, 55);
    public final ykq e0 = new ykq(this, 54, (byte) 16);
    public final ykq f0 = new ykq(this, 56, (byte) 16);
    public final ykq g0 = new ykq(this, 58, (byte) 16);
    public final ykq h0 = new ykq(this, 57, (byte) 16);
    public final ykq i0 = new ykq(this, 60, (byte) 16);
    public final ykq j0 = new ykq(this, 59, (byte) 16);
    public final jly0 k0 = byo.w(this, 61);
    public final jly0 l0 = byo.w(this, 62);
    public final ykq m0 = new ykq(this, 63, (byte) 16);
    public final jly0 n0 = xqu.b(new ykq(this, 64, (byte) 16));
    public final ykq o0 = new ykq(this, 0, (byte) 16);

    public ynq(uh11 uh11Var, q2p0 q2p0Var) {
        this.a = uh11Var;
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
        uh11 uh11Var = this.a;
        gw70 gw70VarB = uh11Var.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = uh11Var.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerO = uh11Var.o();
        c8o.l(schedulerO);
        return f2u0.g(flowableMapB, gw70VarB, ufg1VarS, schedulerO);
    }

    public final Flowable d() {
        return ((Flowable) this.c.get()).j(mo9.O0);
    }

    public final dpt0 e() {
        jly0 jly0Var = this.c;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapB = b();
        Flowable flowableD = d();
        w9u0 w9u0Var = (w9u0) this.d.get();
        gn10 gn10Var = (gn10) this.e.get();
        uh11 uh11Var = this.a;
        mnk0 mnk0VarM = uh11Var.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH = uh11Var.h();
        c8o.l(peVarH);
        luk lukVarW = uh11Var.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapB, flowableD, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW)));
    }

    public final FlowableMap f() {
        return f2u0.D((Flowable) this.c.get());
    }

    public final sas g() {
        return new sas((o2p0) this.y.get(), (n6r0) this.z.get(), (lik1) this.q.get(), (byte) 4);
    }

    public final t8r0 h() {
        dg30 dg30VarZ = this.a.Z();
        c8o.l(dg30VarZ);
        new avw0((byte) 20);
        tz01 tz01Var = new tz01((xnq) this.c0.get(), (byte) 3);
        t8r0 t8r0Var = new t8r0();
        t8r0Var.a = dg30VarZ;
        t8r0Var.b = tz01Var;
        return t8r0Var;
    }

    public final mo51 i() {
        Flowable flowable = (Flowable) this.c.get();
        Flowable flowable2 = (Flowable) this.U.get();
        w9u0 w9u0Var = (w9u0) this.d.get();
        Consumer consumer = (Consumer) this.V.get();
        uh11 uh11Var = this.a;
        luk lukVarW = uh11Var.w();
        c8o.l(lukVarW);
        jn4 jn4Var = new jn4(lukVarW);
        dma1 dma1VarM0 = uh11Var.m0();
        c8o.l(dma1VarM0);
        return new mo51(flowable, flowable2, w9u0Var, consumer, jn4Var, dma1VarM0);
    }

    public final yp91 j() {
        uh11 uh11Var = this.a;
        uvy uvyVarQ0 = uh11Var.q0();
        c8o.l(uvyVarQ0);
        luk lukVarW = uh11Var.w();
        c8o.l(lukVarW);
        yu4 yu4Var = new yu4(false, lukVarW);
        q8n q8nVarD = uh11Var.d();
        c8o.l(q8nVarD);
        return new yp91(f(), uvyVarQ0, yu4Var, q8nVarD);
    }
}
