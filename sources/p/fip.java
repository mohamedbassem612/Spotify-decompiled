package p;

import android.app.Activity;
import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fip {
    public final j230 a;
    public final q130 b;
    public final bum1 c;
    public final q7r0 d;
    public final jly0 e = xqu.b(new chp(this, 2, (byte) 7));
    public final chp f = new chp(this, 4, (byte) 7);
    public final jly0 g = xqu.b(new chp(this, 3, (byte) 7));
    public final jly0 h = xqu.b(new chp(this, 1, (byte) 7));
    public final jly0 i = xqu.b(new chp(this, 0, (byte) 7));
    public final jly0 j = xqu.b(iy81.a(new chp(this, 9, (byte) 7)));
    public final jly0 k = xqu.b(new chp(this, 10, (byte) 7));
    public final jly0 l = xqu.b(new chp(this, 11, (byte) 7));
    public final jly0 m = xqu.b(new chp(this, 8, (byte) 7));
    public final jly0 n = xqu.b(new chp(this, 12, (byte) 7));
    public final jly0 o = xqu.b(new chp(this, 13, (byte) 7));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final chp f13p = new chp(this, 16, (byte) 7);
    public final jly0 q = xqu.b(new chp(this, 17, (byte) 7));
    public final jly0 r = xqu.b(new chp(this, 15, (byte) 7));
    public final jly0 s = xqu.b(new chp(this, 14, (byte) 7));
    public final jly0 t = xqu.b(new chp(this, 18, (byte) 7));
    public final jly0 u = xqu.b(new chp(this, 19, (byte) 7));
    public final jly0 v = xqu.b(new chp(this, 7, (byte) 7));
    public final chp w = new chp(this, 23, (byte) 7);
    public final chp x = new chp(this, 24, (byte) 7);
    public final jly0 y = iy81.a(new chp(this, 22, (byte) 7));
    public final jly0 z = iy81.a(new chp(this, 21, (byte) 7));
    public final jly0 A = xqu.b(new chp(this, 20, (byte) 7));
    public final jly0 B = xqu.b(new chp(this, 6, (byte) 7));
    public final jly0 C = xqu.b(new chp(this, 27, (byte) 7));
    public final jly0 D = xqu.b(new chp(this, 28, (byte) 7));
    public final jly0 E = xqu.b(new chp(this, 26, (byte) 7));
    public final jly0 F = xqu.b(new chp(this, 25, (byte) 7));
    public final jly0 G = xqu.b(new chp(this, 29, (byte) 7));
    public final jly0 H = xqu.b(new chp(this, 30, (byte) 7));
    public final jly0 I = xqu.b(new chp(this, 5, (byte) 7));
    public final jly0 J = xqu.b(new chp(this, 33, (byte) 7));
    public final jly0 K = xqu.b(new chp(this, 34, (byte) 7));
    public final jly0 L = xqu.b(new chp(this, 32, (byte) 7));
    public final jly0 M = xqu.b(new chp(this, 35, (byte) 7));
    public final jly0 N = iy81.a(new chp(this, 36, (byte) 7));
    public final jly0 O = xqu.b(new chp(this, 37, (byte) 7));
    public final jly0 P = xqu.b(new chp(this, 38, (byte) 7));
    public final jly0 Q = iy81.a(new chp(this, 39, (byte) 7));
    public final jly0 R = iy81.a(new chp(this, 40, (byte) 7));
    public final jly0 S = xqu.b(new chp(this, 41, (byte) 7));
    public final jly0 T = iy81.a(new chp(this, 42, (byte) 7));
    public final jly0 U = iy81.a(new chp(this, 43, (byte) 7));
    public final jly0 V = iy81.a(new chp(this, 44, (byte) 7));
    public final jly0 W = iy81.a(new chp(this, 45, (byte) 7));
    public final jly0 X = iy81.a(new chp(this, 46, (byte) 7));
    public final jly0 Y = iy81.a(new chp(this, 47, (byte) 7));
    public final jly0 Z = iy81.a(new chp(this, 48, (byte) 7));
    public final jly0 a0 = iy81.a(new chp(this, 49, (byte) 7));
    public final jly0 b0 = xqu.b(new chp(this, 50, (byte) 7));
    public final jly0 c0 = xqu.b(new chp(this, 52, (byte) 7));
    public final jly0 d0 = iy81.a(new chp(this, 53, (byte) 7));
    public final jly0 e0 = iy81.a(new chp(this, 51, (byte) 7));
    public final jly0 f0 = iy81.a(new chp(this, 54, (byte) 7));
    public final jly0 g0 = xqu.b(new chp(this, 55, (byte) 7));
    public final jly0 h0 = iy81.a(new chp(this, 56, (byte) 7));
    public final jly0 i0 = xqu.b(new chp(this, 31, (byte) 7));
    public final jly0 j0 = xqu.b(new chp(this, 59, (byte) 7));
    public final jly0 k0 = xqu.b(iy81.a(new chp(this, 58, (byte) 7)));
    public final jly0 l0 = xqu.b(iy81.a(new chp(this, 57, (byte) 7)));

    public fip(q130 q130Var, bum1 bum1Var, j230 j230Var, q7r0 q7r0Var) {
        this.a = j230Var;
        this.b = q130Var;
        this.c = bum1Var;
        this.d = q7r0Var;
    }

    public final oi a() {
        q130 q130Var = this.b;
        Activity activityS = q130Var.s();
        c8o.l(activityS);
        npm1 npm1VarN0 = q130Var.N0();
        c8o.l(npm1VarN0);
        zwm1 zwm1VarX = q130Var.x();
        c8o.l(zwm1VarX);
        h380 h380VarB = j380.b(14);
        zwm1 zwm1VarX2 = q130Var.x();
        c8o.l(zwm1VarX2);
        h380VarB.e(aey.c, new h93(zwm1VarX2, (byte) 0));
        Context context = q130Var.context();
        c8o.l(context);
        zwm1 zwm1VarX3 = q130Var.x();
        c8o.l(zwm1VarX3);
        h380VarB.e(aey.N0, new ry3(context, zwm1VarX3, (byte) 0));
        Context context2 = q130Var.context();
        c8o.l(context2);
        zwm1 zwm1VarX4 = q130Var.x();
        c8o.l(zwm1VarX4);
        h380VarB.e(aey.f, new ry3(context2, zwm1VarX4, (byte) 1));
        zwm1 zwm1VarX5 = q130Var.x();
        c8o.l(zwm1VarX5);
        h380VarB.e(aey.g, new h93(zwm1VarX5, (byte) 2));
        zwm1 zwm1VarX6 = q130Var.x();
        c8o.l(zwm1VarX6);
        h380VarB.e(aey.a, new h93(zwm1VarX6, (byte) 1));
        yqg yqgVarA = q130Var.a();
        c8o.l(yqgVarA);
        zwm1 zwm1VarX7 = q130Var.x();
        c8o.l(zwm1VarX7);
        h380VarB.e(aey.Z, new ry3(yqgVarA, zwm1VarX7));
        zwm1 zwm1VarX8 = q130Var.x();
        c8o.l(zwm1VarX8);
        h380VarB.e(aey.i, new h93(zwm1VarX8, (byte) 3));
        zwm1 zwm1VarX9 = q130Var.x();
        c8o.l(zwm1VarX9);
        h380VarB.e(aey.d, new h93(zwm1VarX9, (byte) 4));
        zwm1 zwm1VarX10 = q130Var.x();
        c8o.l(zwm1VarX10);
        h380VarB.e(aey.e, new h93(zwm1VarX10, (byte) 9));
        zwm1 zwm1VarX11 = q130Var.x();
        c8o.l(zwm1VarX11);
        h380VarB.e(aey.h, new h93(zwm1VarX11, (byte) 5));
        zwm1 zwm1VarX12 = q130Var.x();
        c8o.l(zwm1VarX12);
        h380VarB.e(aey.Y, new h93(zwm1VarX12, (byte) 6));
        wqg wqgVarL0 = q130Var.L0();
        c8o.l(wqgVarL0);
        zwm1 zwm1VarX13 = q130Var.x();
        c8o.l(zwm1VarX13);
        zwm1 zwm1VarX14 = q130Var.x();
        c8o.l(zwm1VarX14);
        rpg rpgVar = new rpg(zwm1VarX14, (byte) 0);
        zwm1 zwm1VarX15 = q130Var.x();
        c8o.l(zwm1VarX15);
        rpg rpgVar2 = new rpg(zwm1VarX15, (byte) 1);
        boolean zBooleanValue = ((Boolean) this.K.get()).booleanValue();
        i5y0 i5y0VarK0 = q130Var.k0();
        c8o.l(i5y0VarK0);
        h380VarB.e(aey.t, new zku0(wqgVarL0, zwm1VarX13, rpgVar, rpgVar2, zBooleanValue, i5y0VarK0));
        zwm1 zwm1VarX16 = q130Var.x();
        c8o.l(zwm1VarX16);
        h380VarB.e(aey.X, new h93(zwm1VarX16, (byte) 7));
        zwm1 zwm1VarX17 = q130Var.x();
        c8o.l(zwm1VarX17);
        h380VarB.e(aey.b, new h93(zwm1VarX17, (byte) 8));
        cey ceyVar = new cey(npm1VarN0, zwm1VarX, h380VarB.b(true));
        v5b1 v5b1Var = ((s4b1) this.l.get()).d;
        return new oi(activityS, ceyVar, u890.j(v5b1Var != null ? v5b1Var.getType() : null, bzu0.f), (byte) 10);
    }

    public final rmr b() {
        q130 q130Var = this.b;
        agc0 agc0VarM = q130Var.m();
        c8o.l(agc0VarM);
        imv0 imv0Var = new imv0(agc0VarM, (byte) 1);
        xrm1 xrm1VarG0 = q130Var.G0();
        c8o.l(xrm1VarG0);
        imv0 imv0Var2 = new imv0(xrm1VarG0, (byte) 3);
        wqg wqgVarL0 = q130Var.L0();
        c8o.l(wqgVarL0);
        return new rmr(new uv40(t380.w(imv0Var, imv0Var2, new imv0(wqgVarL0, (byte) 0), new imv0((upp0) this.f.get(), (byte) 2), jmv0.b, jmv0.c, new hmv0[0])), (byte) 10);
    }

    public final sw9 c() {
        dpy dpyVar = (dpy) this.P.get();
        Context context = this.b.context();
        c8o.l(context);
        i();
        return new sw9(dpyVar, context.getResources().getInteger(2131492959), (byte) 4);
    }

    public final y7c0 d() {
        q130 q130Var = this.b;
        dxz0 dxz0VarK = q130Var.K();
        c8o.l(dxz0VarK);
        b7n b7nVarQ0 = q130Var.q0();
        c8o.l(b7nVarQ0);
        m4e0 m4e0Var = new m4e0(b7nVarQ0, (byte) 23);
        jj4 jj4VarH = q130Var.H();
        c8o.l(jj4VarH);
        Observable observableS = q130Var.S();
        c8o.l(observableS);
        Scheduler schedulerG = q130Var.G();
        c8o.l(schedulerG);
        return new y7c0(dxz0VarK, m4e0Var, jj4VarH, observableS, schedulerG);
    }

    public final kjq0 e() {
        lik1 lik1Var = (lik1) this.M.get();
        boolean zBooleanValue = ((Boolean) this.J.get()).booleanValue();
        nfc0 nfc0VarC0 = this.b.C0();
        c8o.l(nfc0VarC0);
        return new kjq0(lik1Var, zBooleanValue, nfc0VarC0, (mfm) this.N.get());
    }

    public final gjq0 f() {
        lik1 lik1Var = (lik1) this.M.get();
        k781 k781VarB0 = this.b.B0();
        c8o.l(k781VarB0);
        return new gjq0(lik1Var, k781VarB0, (mfm) this.N.get(), (byte) 2);
    }

    public final stm1 g() {
        return new stm1((ley) this.L.get(), (g37) this.S.get(), new ryq((byte) 1), (aip) this.T.get(), (byte) 0);
    }

    public final stm1 h() {
        return new stm1((ley) this.L.get(), (g37) this.S.get(), new ryq((byte) 1), (bip) this.U.get(), (byte) 1);
    }

    public final evm1 i() {
        luk lukVarK = this.b.k();
        c8o.l(lukVarK);
        return new evm1(lukVarK);
    }
}
