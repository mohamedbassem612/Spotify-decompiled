package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uap {
    public final jly0 A;
    public final jly0 B;
    public final jly0 C;
    public final jly0 D;
    public final jly0 E;
    public final jly0 F;
    public final jly0 G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final jly0 L;
    public final jly0 M;
    public final jly0 N;
    public final jly0 O;
    public final jly0 P;
    public final jly0 Q;
    public final jly0 R;
    public final jly0 S;
    public final jly0 T;
    public final jly0 U;
    public final jly0 V;
    public final jly0 W;
    public final jly0 X;
    public final jly0 Y;
    public final jly0 Z;
    public final jly0 a;
    public final jly0 a0;
    public final jly0 b;
    public final jly0 b0;
    public final jly0 c;
    public final jly0 c0;
    public final jly0 d;
    public final jly0 d0;
    public final jly0 e;
    public final jly0 e0;
    public final jly0 f;
    public final jly0 f0;
    public final jly0 g;
    public final jly0 g0;
    public final jly0 h;
    public final jly0 h0;
    public final jly0 i;
    public final jly0 i0;
    public final jly0 j;
    public final jly0 j0;
    public final jly0 k;
    public final jly0 l;
    public final jly0 m;
    public final jly0 n;
    public final jly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jly0 f79p;
    public final jly0 q;
    public final jly0 r;
    public final jly0 s;
    public final jly0 t;
    public final jly0 u;
    public final jly0 v;
    public final jly0 w;
    public final jly0 x;
    public final jly0 y;
    public final jly0 z;

    public uap(zyc0 zyc0Var, fzc0 fzc0Var, q7r0 q7r0Var) {
        this.K = this;
        this.H = q7r0Var;
        this.I = zyc0Var;
        this.J = fzc0Var;
        this.a = xqu.b(new blp(this, 1, (byte) 8));
        this.b = xqu.b(new blp(this, 2, (byte) 8));
        this.c = xqu.b(new blp(this, 3, (byte) 8));
        this.d = byo.z(this, 4);
        this.e = xqu.b(new blp(this, 6, (byte) 8));
        this.f = byo.z(this, 7);
        this.g = byo.z(this, 5);
        this.h = xqu.b(new blp(this, 8, (byte) 8));
        this.i = xqu.b(new blp(this, 10, (byte) 8));
        this.j = byo.z(this, 9);
        this.k = xqu.b(new blp(this, 11, (byte) 8));
        this.l = xqu.b(new blp(this, 12, (byte) 8));
        this.m = xqu.b(new blp(this, 13, (byte) 8));
        this.n = byo.z(this, 15);
        this.o = byo.z(this, 14);
        this.f79p = byo.z(this, 17);
        this.q = xqu.b(iy81.a(new blp(this, 18, (byte) 8)));
        this.r = byo.z(this, 16);
        this.s = xqu.b(new blp(this, 19, (byte) 8));
        this.t = xqu.b(new blp(this, 20, (byte) 8));
        this.u = xqu.b(new blp(this, 21, (byte) 8));
        this.v = xqu.b(new blp(this, 22, (byte) 8));
        this.w = byo.z(this, 23);
        this.x = xqu.b(new blp(this, 24, (byte) 8));
        this.y = byo.z(this, 26);
        this.z = byo.z(this, 27);
        this.A = byo.z(this, 29);
        this.B = byo.z(this, 28);
        this.C = byo.z(this, 25);
        this.D = byo.z(this, 30);
        this.E = byo.z(this, 31);
        this.F = xqu.b(new blp(this, 33, (byte) 8));
        this.G = xqu.b(new blp(this, 34, (byte) 8));
        this.L = xqu.b(new blp(this, 35, (byte) 8));
        this.M = byo.z(this, 36);
        this.N = byo.z(this, 37);
        this.O = byo.z(this, 38);
        this.P = byo.z(this, 39);
        this.Q = byo.z(this, 32);
        this.R = xqu.b(new blp(this, 40, (byte) 8));
        this.S = byo.z(this, 41);
        this.T = new g5t();
        this.U = xqu.b(new blp(this, 43, (byte) 8));
        this.V = new blp(this, 44, (byte) 8);
        this.W = byo.z(this, 45);
        this.X = xqu.b(new blp(this, 46, (byte) 8));
        this.Y = byo.z(this, 42);
        this.Z = byo.z(this, 48);
        this.a0 = byo.z(this, 47);
        this.b0 = byo.z(this, 49);
        this.c0 = byo.z(this, 50);
        this.d0 = byo.z(this, 51);
        this.e0 = byo.z(this, 52);
        this.f0 = xqu.b(new blp(this, 54, (byte) 8));
        this.g0 = byo.z(this, 55);
        this.h0 = byo.z(this, 53);
        this.i0 = xqu.b(new blp(this, 56, (byte) 8));
        g5t.a(this.T, xqu.b(new blp(this, 0, (byte) 8)));
        xqu.b(new blp(this, 57, (byte) 8));
        this.j0 = xqu.b(new blp(this, 58, (byte) 8));
    }

    public vu4 a() {
        luk lukVarW = ((ras) this.H).w();
        c8o.l(lukVarW);
        return new vu4(false, false, false, lukVarW);
    }

    public fp8 b() {
        me30 me30Var = (me30) ((zyc0) this.I).M.get();
        c8o.l(me30Var);
        return new fp8(me30Var, (byte) 26);
    }

    public sas c() {
        return new sas((o2p0) this.r.get(), (n6r0) this.s.get(), (lik1) this.o.get(), (byte) 0);
    }

    public gn10 d() {
        gn10 gn10Var;
        j0c0 j0c0VarA = ((j1c0) ((q7r0) this.H).d.b().a().b0(j0c0.class)).a();
        return (j0c0VarA == null || (gn10Var = j0c0VarA.a) == null) ? mno1.q0 : gn10Var;
    }

    public FlowableMap e() {
        return f2u0.f((Flowable) this.a.get());
    }

    public Flowable f() {
        FlowableMap flowableMapE = e();
        ras rasVar = (ras) this.H;
        gw70 gw70VarB = rasVar.b();
        c8o.l(gw70VarB);
        ufg1 ufg1VarS = rasVar.S();
        c8o.l(ufg1VarS);
        Scheduler schedulerO = rasVar.o();
        c8o.l(schedulerO);
        return f2u0.g(flowableMapE, gw70VarB, ufg1VarS, schedulerO);
    }

    public Flowable g() {
        return ((Flowable) this.a.get()).j(mo9.O0);
    }

    public String h() {
        String str = ((exu0) this.e.get()).a;
        if (str != null) {
            return str;
        }
        hhg1.n("Trying to access Playlist URI too early. Its only available at plugin creation point and onwards.");
        return null;
    }

    public ezc i() {
        bw20 bw20Var = (ov20) ((zyc0) this.I).s.get();
        c8o.l(bw20Var);
        return bw20Var.a;
    }

    public dpt0 j() {
        jly0 jly0Var = this.a;
        Flowable flowableJ = ((Flowable) jly0Var.get()).j(mo9.N0);
        FlowableMap flowableMapE = e();
        Flowable flowableG = g();
        w9u0 w9u0Var = (w9u0) this.b.get();
        gn10 gn10Var = (gn10) this.c.get();
        ras rasVar = (ras) this.H;
        mnk0 mnk0VarM = rasVar.m();
        c8o.l(mnk0VarM);
        FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var.get());
        pe peVarH = rasVar.h();
        c8o.l(peVarH);
        luk lukVarW = rasVar.w();
        c8o.l(lukVarW);
        return new dpt0(flowableJ, flowableMapE, flowableG, w9u0Var, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW)));
    }

    public FlowableMap k() {
        return f2u0.D((Flowable) this.a.get());
    }

    public yp91 l() {
        ras rasVar = (ras) this.H;
        uvy uvyVarQ0 = rasVar.q0();
        c8o.l(uvyVarQ0);
        luk lukVarW = rasVar.w();
        c8o.l(lukVarW);
        yu4 yu4Var = new yu4(false, lukVarW);
        q8n q8nVarD = rasVar.d();
        c8o.l(q8nVarD);
        return new yp91(k(), uvyVarQ0, yu4Var, q8nVarD);
    }

    public owf1 m() {
        mwm1 mwm1Var = (mwm1) ((zyc0) this.I).O.get();
        c8o.l(mwm1Var);
        return new owf1(mwm1Var, (byte) 18);
    }

    public uap(ras rasVar, q2p0 q2p0Var) {
        this.H = rasVar;
        this.I = q2p0Var;
        this.a = byo.e(this, 2);
        this.b = byo.e(this, 3);
        this.c = byo.e(this, 4);
        this.d = byo.e(this, 6);
        this.e = byo.e(this, 7);
        this.f = byo.e(this, 5);
        this.g = byo.e(this, 9);
        this.h = byo.e(this, 8);
        this.i = byo.e(this, 10);
        this.j = byo.e(this, 11);
        this.k = byo.e(this, 12);
        this.l = byo.e(this, 13);
        this.m = byo.e(this, 14);
        this.n = byo.e(this, 15);
        this.o = byo.e(this, 17);
        this.f79p = byo.e(this, 16);
        byte b = 26;
        this.q = xqu.b(new d7p(this, 19, b));
        this.J = new d7p(this, 18, b);
        this.K = new d7p(this, 21, b);
        this.r = byo.e(this, 22);
        this.s = byo.e(this, 23);
        this.L = new d7p(this, 20, b);
        this.M = new d7p(this, 24, b);
        this.t = xqu.b(new d7p(this, b, b));
        this.u = xqu.b(new d7p(this, 25, b));
        this.v = byo.e(this, 27);
        this.N = new d7p(this, 28, b);
        this.O = new d7p(this, 29, b);
        this.w = xqu.b(new d7p(this, 30, b));
        this.P = new d7p(this, 31, b);
        this.Q = new d7p(this, 32, b);
        this.R = new d7p(this, 33, b);
        this.S = new d7p(this, 34, b);
        this.T = new d7p(this, 35, b);
        this.U = new d7p(this, 36, b);
        this.x = byo.e(this, 1);
        this.y = byo.e(this, 39);
        this.z = byo.e(this, 38);
        this.A = byo.e(this, 40);
        this.V = new d7p(this, 37, b);
        this.W = new d7p(this, 41, b);
        this.X = new d7p(this, 42, b);
        this.B = byo.e(this, 43);
        this.Y = new d7p(this, 44, b);
        this.Z = new d7p(this, 45, b);
        this.C = byo.e(this, 47);
        this.a0 = new d7p(this, 46, b);
        this.D = byo.e(this, 49);
        this.b0 = new d7p(this, 48, b);
        this.c0 = new d7p(this, 50, b);
        this.d0 = new d7p(this, 52, b);
        this.e0 = new d7p(this, 51, b);
        this.f0 = new d7p(this, 54, b);
        this.g0 = new d7p(this, 53, b);
        this.E = byo.e(this, 55);
        this.F = byo.e(this, 56);
        this.h0 = new d7p(this, 57, b);
        this.G = xqu.b(new d7p(this, 58, b));
        this.i0 = new d7p(this, 59, b);
        this.j0 = new d7p(this, 0, b);
    }
}
