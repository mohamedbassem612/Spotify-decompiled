package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvq {
    public final tsq A;
    public final tsq B;
    public final jly0 B0;
    public final jly0 C0;
    public final tsq D;
    public final jly0 D0;
    public final jly0 E;
    public final jly0 E0;
    public final jly0 F0;
    public final jly0 G;
    public final jly0 H;
    public final jly0 H0;
    public final tsq I;
    public final jly0 I0;
    public final tsq J0;
    public final jly0 K0;
    public final jly0 L;
    public final tsq L0;
    public final jly0 M;
    public final tsq M0;
    public final jly0 N;
    public final jly0 O;
    public final jly0 O0;
    public final jly0 P;
    public final jly0 P0;
    public final jly0 Q0;
    public final jly0 R0;
    public final jly0 S;
    public final jly0 S0;
    public final tsq T;
    public final jly0 T0;
    public final tsq U;
    public final jly0 U0;
    public final jly0 V;
    public final jly0 V0;
    public final jly0 W;
    public final jly0 Y;
    public final jly0 Z;
    public final rvm1 a;
    public final kvm1 b;
    public final jly0 b0;
    public final bum1 c;
    public final tsq c0;
    public final q7r0 d;
    public final tsq d0;
    public final jly0 e;
    public final tsq f;
    public final jly0 f0;
    public final jly0 g;
    public final jly0 h0;
    public final jly0 j;
    public final jly0 k;
    public final jly0 k0;
    public final jly0 l0;
    public final jly0 m0;
    public final jly0 n0;
    public final tsq o;
    public final jly0 o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tsq f30p;
    public final jly0 p0;
    public final tsq q;
    public final jly0 q0;
    public final tsq r;
    public final tsq s;
    public final jly0 s0;
    public final tsq t;
    public final jly0 t0;
    public final tsq u;
    public final jly0 u0;
    public final jly0 v0;
    public final jly0 w0;
    public final tsq x;
    public final jly0 x0;
    public final tsq y;
    public final jly0 y0;
    public final tsq z;
    public final jly0 z0;
    public final jly0 h = eqq.s(this, 1);
    public final jly0 i = eqq.s(this, 0);
    public final jly0 l = eqq.s(this, 11);
    public final jly0 m = eqq.s(this, 12);
    public final jly0 n = eqq.s(this, 9);
    public final jly0 v = eqq.s(this, 13);
    public final jly0 w = eqq.s(this, 21);
    public final jly0 C = eqq.s(this, 22);
    public final jly0 F = eqq.s(this, 30);
    public final jly0 J = eqq.s(this, 33);
    public final jly0 K = eqq.s(this, 36);
    public final jly0 Q = eqq.s(this, 41);
    public final jly0 R = eqq.s(this, 42);
    public final jly0 X = eqq.s(this, 43);
    public final jly0 a0 = eqq.s(this, 52);
    public final jly0 e0 = eqq.s(this, 48);
    public final jly0 g0 = eqq.s(this, 55);
    public final jly0 i0 = eqq.s(this, 58);
    public final jly0 j0 = eqq.s(this, 59);
    public final jly0 r0 = eqq.s(this, 66);
    public final jly0 A0 = eqq.s(this, 75);
    public final jly0 G0 = eqq.s(this, 81);
    public final jly0 N0 = eqq.s(this, 87);

    public lvq(kvm1 kvm1Var, bum1 bum1Var, rvm1 rvm1Var, q7r0 q7r0Var) {
        this.a = rvm1Var;
        this.b = kvm1Var;
        this.c = bum1Var;
        this.d = q7r0Var;
        byte b = 26;
        this.e = xqu.b(new tsq(this, 2, b));
        this.f = new tsq(this, 4, b);
        this.g = xqu.b(new tsq(this, 3, b));
        this.j = xqu.b(new tsq(this, 8, b));
        this.k = xqu.b(iy81.a(new tsq(this, 10, b)));
        this.o = new tsq(this, 14, b);
        this.f30p = new tsq(this, 16, b);
        this.q = new tsq(this, 17, b);
        this.r = new tsq(this, 18, b);
        this.s = new tsq(this, 19, b);
        this.t = new tsq(this, 20, b);
        this.u = new tsq(this, 15, b);
        this.x = new tsq(this, 24, b);
        this.y = new tsq(this, 25, b);
        this.z = new tsq(this, b, b);
        this.A = new tsq(this, 23, b);
        this.B = new tsq(this, 27, b);
        this.D = new tsq(this, 29, b);
        this.E = xqu.b(new tsq(this, 31, b));
        this.G = xqu.b(new tsq(this, 28, b));
        this.H = xqu.b(new tsq(this, 32, b));
        this.I = new tsq(this, 34, b);
        this.L = xqu.b(new tsq(this, 35, b));
        this.M = xqu.b(new tsq(this, 37, b));
        this.N = xqu.b(new tsq(this, 39, b));
        this.O = xqu.b(new tsq(this, 40, b));
        this.P = xqu.b(new tsq(this, 38, b));
        this.S = xqu.b(new tsq(this, 7, b));
        this.T = new tsq(this, 46, b);
        this.U = new tsq(this, 47, b);
        this.V = iy81.a(new tsq(this, 45, b));
        this.W = iy81.a(new tsq(this, 44, b));
        this.Y = xqu.b(new tsq(this, 6, b));
        this.Z = xqu.b(new tsq(this, 51, b));
        this.b0 = xqu.b(new tsq(this, 50, b));
        this.c0 = new tsq(this, 49, b);
        this.d0 = new tsq(this, 53, b);
        this.f0 = xqu.b(new tsq(this, 54, b));
        this.h0 = xqu.b(new tsq(this, 5, b));
        this.k0 = xqu.b(new tsq(this, 57, b));
        this.l0 = iy81.a(new tsq(this, 60, b));
        this.m0 = xqu.b(new tsq(this, 61, b));
        this.n0 = xqu.b(new tsq(this, 62, b));
        this.o0 = xqu.b(new tsq(this, 63, b));
        this.p0 = iy81.a(new tsq(this, 64, b));
        this.q0 = iy81.a(new tsq(this, 65, b));
        this.s0 = iy81.a(new tsq(this, 67, b));
        this.t0 = iy81.a(new tsq(this, 68, b));
        this.u0 = iy81.a(new tsq(this, 69, b));
        this.v0 = iy81.a(new tsq(this, 70, b));
        this.w0 = iy81.a(new tsq(this, 71, b));
        this.x0 = iy81.a(new tsq(this, 72, b));
        this.y0 = iy81.a(new tsq(this, 73, b));
        this.z0 = iy81.a(new tsq(this, 74, b));
        this.B0 = xqu.b(new tsq(this, 76, b));
        this.C0 = xqu.b(new tsq(this, 78, b));
        this.D0 = iy81.a(new tsq(this, 79, b));
        this.E0 = iy81.a(new tsq(this, 77, b));
        this.F0 = iy81.a(new tsq(this, 80, b));
        this.H0 = xqu.b(new tsq(this, 82, b));
        this.I0 = iy81.a(new tsq(this, 83, b));
        this.J0 = new tsq(this, 84, b);
        this.K0 = xqu.b(new tsq(this, 86, b));
        this.L0 = new tsq(this, 88, b);
        this.M0 = new tsq(this, 89, b);
        this.O0 = xqu.b(new tsq(this, 85, b));
        this.P0 = iy81.a(new tsq(this, 90, b));
        this.Q0 = iy81.a(new tsq(this, 91, b));
        this.R0 = xqu.b(iy81.a(new tsq(this, 92, b)));
        this.S0 = xqu.b(new tsq(this, 56, b));
        this.T0 = xqu.b(new tsq(this, 95, b));
        this.U0 = xqu.b(iy81.a(new tsq(this, 94, b)));
        this.V0 = xqu.b(iy81.a(new tsq(this, 93, b)));
    }

    public final Context a() {
        Context context = this.b.context();
        c8o.l(context);
        return context.getApplicationContext();
    }

    public final oi b() {
        kvm1 kvm1Var = this.b;
        Activity activityS = kvm1Var.s();
        c8o.l(activityS);
        npm1 npm1VarN0 = kvm1Var.N0();
        c8o.l(npm1VarN0);
        zwm1 zwm1VarX = kvm1Var.x();
        c8o.l(zwm1VarX);
        h380 h380VarB = j380.b(14);
        zwm1 zwm1VarX2 = kvm1Var.x();
        c8o.l(zwm1VarX2);
        h380VarB.e(aey.c, new h93(zwm1VarX2, (byte) 0));
        Context context = kvm1Var.context();
        c8o.l(context);
        zwm1 zwm1VarX3 = kvm1Var.x();
        c8o.l(zwm1VarX3);
        h380VarB.e(aey.N0, new ry3(context, zwm1VarX3, (byte) 0));
        Context context2 = kvm1Var.context();
        c8o.l(context2);
        zwm1 zwm1VarX4 = kvm1Var.x();
        c8o.l(zwm1VarX4);
        h380VarB.e(aey.f, new ry3(context2, zwm1VarX4, (byte) 1));
        zwm1 zwm1VarX5 = kvm1Var.x();
        c8o.l(zwm1VarX5);
        h380VarB.e(aey.g, new h93(zwm1VarX5, (byte) 2));
        zwm1 zwm1VarX6 = kvm1Var.x();
        c8o.l(zwm1VarX6);
        h380VarB.e(aey.a, new h93(zwm1VarX6, (byte) 1));
        yqg yqgVarA = kvm1Var.a();
        c8o.l(yqgVarA);
        zwm1 zwm1VarX7 = kvm1Var.x();
        c8o.l(zwm1VarX7);
        h380VarB.e(aey.Z, new ry3(yqgVarA, zwm1VarX7));
        zwm1 zwm1VarX8 = kvm1Var.x();
        c8o.l(zwm1VarX8);
        h380VarB.e(aey.i, new h93(zwm1VarX8, (byte) 3));
        zwm1 zwm1VarX9 = kvm1Var.x();
        c8o.l(zwm1VarX9);
        h380VarB.e(aey.d, new h93(zwm1VarX9, (byte) 4));
        zwm1 zwm1VarX10 = kvm1Var.x();
        c8o.l(zwm1VarX10);
        h380VarB.e(aey.e, new h93(zwm1VarX10, (byte) 9));
        zwm1 zwm1VarX11 = kvm1Var.x();
        c8o.l(zwm1VarX11);
        h380VarB.e(aey.h, new h93(zwm1VarX11, (byte) 5));
        zwm1 zwm1VarX12 = kvm1Var.x();
        c8o.l(zwm1VarX12);
        h380VarB.e(aey.Y, new h93(zwm1VarX12, (byte) 6));
        wqg wqgVarL0 = kvm1Var.L0();
        c8o.l(wqgVarL0);
        zwm1 zwm1VarX13 = kvm1Var.x();
        c8o.l(zwm1VarX13);
        zwm1 zwm1VarX14 = kvm1Var.x();
        c8o.l(zwm1VarX14);
        rpg rpgVar = new rpg(zwm1VarX14, (byte) 0);
        zwm1 zwm1VarX15 = kvm1Var.x();
        c8o.l(zwm1VarX15);
        rpg rpgVar2 = new rpg(zwm1VarX15, (byte) 1);
        boolean zBooleanValue = ((Boolean) this.j0.get()).booleanValue();
        i5y0 i5y0VarK0 = kvm1Var.k0();
        c8o.l(i5y0VarK0);
        h380VarB.e(aey.t, new zku0(wqgVarL0, zwm1VarX13, rpgVar, rpgVar2, zBooleanValue, i5y0VarK0));
        zwm1 zwm1VarX16 = kvm1Var.x();
        c8o.l(zwm1VarX16);
        h380VarB.e(aey.X, new h93(zwm1VarX16, (byte) 7));
        zwm1 zwm1VarX17 = kvm1Var.x();
        c8o.l(zwm1VarX17);
        h380VarB.e(aey.b, new h93(zwm1VarX17, (byte) 8));
        cey ceyVar = new cey(npm1VarN0, zwm1VarX, h380VarB.b(true));
        v5b1 v5b1Var = ((s4b1) this.m.get()).d;
        return new oi(activityS, ceyVar, u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f), (byte) 10);
    }

    public final k9r c() {
        return new k9r((d0r) this.Q.get(), (c9n) this.R.get(), (zns) this.g.get(), (byte) 28);
    }

    public final rmr d() {
        kvm1 kvm1Var = this.b;
        agc0 agc0VarM = kvm1Var.m();
        c8o.l(agc0VarM);
        imv0 imv0Var = new imv0(agc0VarM, (byte) 1);
        xrm1 xrm1VarG0 = kvm1Var.G0();
        c8o.l(xrm1VarG0);
        imv0 imv0Var2 = new imv0(xrm1VarG0, (byte) 3);
        wqg wqgVarL0 = kvm1Var.L0();
        c8o.l(wqgVarL0);
        return new rmr(new uv40(t380.w(imv0Var, imv0Var2, new imv0(wqgVarL0, (byte) 0), new imv0((upp0) this.f.get(), (byte) 2), jmv0.b, jmv0.c, new hmv0[0])), (byte) 10);
    }

    public final sw9 e() {
        dpy dpyVar = (dpy) this.o0.get();
        Context context = this.b.context();
        c8o.l(context);
        n();
        return new sw9(dpyVar, context.getResources().getInteger(2131492959), (byte) 4);
    }

    public final fab0 f() {
        kvm1 kvm1Var = this.b;
        zwm1 zwm1VarX = kvm1Var.x();
        c8o.l(zwm1VarX);
        String strC = zwm1VarX.c();
        zwm1 zwm1VarX2 = kvm1Var.x();
        c8o.l(zwm1VarX2);
        String strH = zwm1VarX2.h();
        zwm1 zwm1VarX3 = kvm1Var.x();
        c8o.l(zwm1VarX3);
        String strD = zwm1VarX3.d();
        c8o.l(kvm1Var.n0());
        return new fab0(strC, strD, 32, strH);
    }

    public final gg11 g() {
        h380 h380VarB = j380.b(6);
        kvm1 kvm1Var = this.b;
        Context context = kvm1Var.context();
        c8o.l(context);
        h380VarB.e(mg51.AlsoAvailableOffline, new ty3(context, (upp0) this.f.get()));
        h380VarB.e(mg51.AddArtist, new g81(a(), (byte) 0));
        h380VarB.e(mg51.AddPodcast, new g81(a(), (byte) 1));
        Context context2 = kvm1Var.context();
        c8o.l(context2);
        h380VarB.e(mg51.EventsHubNavigation, new g81(context2, (byte) 2));
        h380VarB.e(mg51.ImportMusic, new g81(a(), (byte) 3));
        Context context3 = kvm1Var.context();
        c8o.l(context3);
        h380VarB.e(mg51.SavedContentByArtist, new g81(context3, (byte) 4));
        return h380VarB.b(true);
    }

    public final y7c0 h() {
        kvm1 kvm1Var = this.b;
        dxz0 dxz0VarK = kvm1Var.K();
        c8o.l(dxz0VarK);
        b7n b7nVarQ0 = kvm1Var.q0();
        c8o.l(b7nVarQ0);
        m4e0 m4e0Var = new m4e0(b7nVarQ0, (byte) 23);
        jj4 jj4VarH = kvm1Var.H();
        c8o.l(jj4VarH);
        Observable observableS = kvm1Var.S();
        c8o.l(observableS);
        Scheduler schedulerG = kvm1Var.G();
        c8o.l(schedulerG);
        return new y7c0(dxz0VarK, m4e0Var, jj4VarH, observableS, schedulerG);
    }

    public final kjq0 i() {
        lik1 lik1Var = (lik1) this.K.get();
        boolean zBooleanValue = ((Boolean) this.i0.get()).booleanValue();
        nfc0 nfc0VarC0 = this.b.C0();
        c8o.l(nfc0VarC0);
        return new kjq0(lik1Var, zBooleanValue, nfc0VarC0, (mfm) this.l0.get());
    }

    public final gjq0 j() {
        lik1 lik1Var = (lik1) this.K.get();
        k781 k781VarB0 = this.b.B0();
        c8o.l(k781VarB0);
        return new gjq0(lik1Var, k781VarB0, (mfm) this.l0.get(), (byte) 2);
    }

    public final stm1 k() {
        return new stm1((ley) this.k0.get(), (g37) this.r0.get(), new ryq((byte) 1), (aip) this.s0.get(), (byte) 0);
    }

    public final stm1 l() {
        return new stm1((ley) this.k0.get(), (g37) this.r0.get(), new ryq((byte) 1), (bip) this.t0.get(), (byte) 1);
    }

    public final cik1 m() {
        kvm1 kvm1Var = this.b;
        RxRouter rxRouterP = kvm1Var.p();
        c8o.l(rxRouterP);
        mwm1 mwm1Var = new mwm1(new CosmosTransport(new sn0(rxRouterP, (byte) 26)));
        ap20 ap20Var = new ap20(n());
        wnl xprVar = new xpr();
        if (this.a.e) {
            Object obj = this.x.get();
            obj.getClass();
            xprVar = (wnl) obj;
        }
        a130 a130Var = new a130((byte) 1);
        z0t z0tVarA0 = kvm1Var.a0();
        c8o.l(z0tVarA0);
        return new cik1(mwm1Var, new d1t(ap20Var, xprVar, a130Var, z0tVarA0), ado0.b, n(), (byte) 14);
    }

    public final evm1 n() {
        luk lukVarK = this.b.k();
        c8o.l(lukVarK);
        return new evm1(lukVarK);
    }
}
