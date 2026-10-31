package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fyp {
    public final ywp A;
    public final jly0 B;
    public final jly0 C;
    public final ywp E;
    public final ywp F;
    public final jly0 G;
    public final ywp H;
    public final ywp I;
    public final ywp J;
    public final ywp K;
    public final ywp L;
    public final ywp M;
    public final ywp R;
    public final ywp S;
    public final ywp T;
    public final ywp U;
    public final ywp W;
    public final ywp X;
    public final ywp Y;
    public final ywp Z;
    public final k5v0 a;
    public final ywp a0;
    public final q2p0 b;
    public final ywp b0;
    public final ywp c0;
    public final ywp e0;
    public final ywp h0;
    public final ywp j0;
    public final ywp k0;
    public final jly0 u;
    public final ywp v;
    public final ywp w;
    public final ywp z;
    public final jly0 c = byo.q(this, 2);
    public final jly0 d = byo.q(this, 3);
    public final jly0 e = byo.q(this, 4);
    public final jly0 f = byo.q(this, 6);
    public final jly0 g = byo.q(this, 7);
    public final jly0 h = byo.q(this, 5);
    public final jly0 i = byo.q(this, 9);
    public final jly0 j = byo.q(this, 8);
    public final jly0 k = byo.q(this, 10);
    public final jly0 l = byo.q(this, 11);
    public final jly0 m = byo.q(this, 12);
    public final jly0 n = byo.q(this, 13);
    public final jly0 o = byo.q(this, 14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f20p = byo.q(this, 15);
    public final jly0 q = byo.q(this, 18);
    public final jly0 r = byo.q(this, 17);
    public final jly0 s = byo.q(this, 19);
    public final jly0 t = byo.q(this, 16);
    public final jly0 x = byo.q(this, 24);
    public final jly0 y = byo.q(this, 25);
    public final jly0 D = byo.q(this, 29);
    public final jly0 N = byo.q(this, 1);
    public final jly0 O = byo.q(this, 41);
    public final jly0 P = byo.q(this, 40);
    public final jly0 Q = byo.q(this, 42);
    public final jly0 V = byo.q(this, 47);
    public final jly0 d0 = byo.q(this, 55);
    public final jly0 f0 = byo.q(this, 56);
    public final jly0 g0 = byo.q(this, 57);
    public final jly0 i0 = byo.q(this, 59);

    public fyp(k5v0 k5v0Var, q2p0 q2p0Var) {
        this.a = k5v0Var;
        this.b = q2p0Var;
        byte b = 16;
        this.u = xqu.b(new ywp(this, 21, b));
        this.v = new ywp(this, 20, b);
        this.w = new ywp(this, 23, b);
        this.z = new ywp(this, 22, b);
        this.A = new ywp(this, 26, b);
        this.B = xqu.b(new ywp(this, 28, b));
        this.C = xqu.b(new ywp(this, 27, b));
        this.E = new ywp(this, 30, b);
        this.F = new ywp(this, 31, b);
        this.G = xqu.b(new ywp(this, 32, b));
        this.H = new ywp(this, 33, b);
        this.I = new ywp(this, 34, b);
        this.J = new ywp(this, 35, b);
        this.K = new ywp(this, 36, b);
        this.L = new ywp(this, 37, b);
        this.M = new ywp(this, 38, b);
        this.R = new ywp(this, 39, b);
        this.S = new ywp(this, 43, b);
        this.T = new ywp(this, 45, b);
        this.U = new ywp(this, 44, b);
        this.W = new ywp(this, 46, b);
        this.X = new ywp(this, 48, b);
        this.Y = new ywp(this, 50, b);
        this.Z = new ywp(this, 49, b);
        this.a0 = new ywp(this, 51, b);
        this.b0 = new ywp(this, 52, b);
        this.c0 = new ywp(this, 53, b);
        this.e0 = new ywp(this, 54, b);
        this.h0 = new ywp(this, 58, b);
        this.j0 = new ywp(this, 60, b);
        this.k0 = new ywp(this, 0, b);
    }

    public final kn4 a() {
        luk lukVarW = this.a.w();
        c8o.l(lukVarW);
        return new kn4(false, lukVarW);
    }

    public final vu4 b() {
        luk lukVarW = this.a.w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public final FlowableMap c() {
        return f2u0.f((Flowable) this.c.get());
    }

    public final Flowable d() {
        FlowableMap flowableMapC = c();
        k5v0 k5v0Var = this.a;
        gw70 gw70VarB = k5v0Var.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = k5v0Var.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerO = k5v0Var.o();
        c8o.l(schedulerO);
        return f2u0.g(flowableMapC, gw70VarB, ufg1VarS, schedulerO);
    }

    public final Flowable e() {
        return ((Flowable) this.c.get()).j(mo9.O0);
    }

    public final dpt0 f() {
        jly0 jly0Var = this.c;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapC = c();
        Flowable flowableE = e();
        w9u0 w9u0Var = (w9u0) this.d.get();
        gn10 gn10Var = (gn10) this.e.get();
        k5v0 k5v0Var = this.a;
        mnk0 mnk0VarM = k5v0Var.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH = k5v0Var.h();
        c8o.l(peVarH);
        luk lukVarW = k5v0Var.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapC, flowableE, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW)));
    }

    public final FlowableMap g() {
        return f2u0.D((Flowable) this.c.get());
    }

    public final m5v0 h() {
        return new m5v0(this.w, (o2p0) this.x.get(), (n6r0) this.y.get(), (lik1) this.q.get());
    }

    public final yp91 i() {
        k5v0 k5v0Var = this.a;
        uvy uvyVarQ0 = k5v0Var.q0();
        c8o.l(uvyVarQ0);
        luk lukVarW = k5v0Var.w();
        c8o.l(lukVarW);
        yu4 yu4Var = new yu4(false, lukVarW);
        q8n q8nVarD = k5v0Var.d();
        c8o.l(q8nVarD);
        return new yp91(g(), uvyVarQ0, yu4Var, q8nVarD);
    }
}
