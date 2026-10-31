package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.Window;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gup implements bz2, n0y, ve50 {
    public final /* synthetic */ byte a;
    public final nwp b;
    public final jly0 c;

    public gup(nwp nwpVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 2));
                break;
            case 2:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 5));
                break;
            default:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 0));
                break;
        }
    }

    public yhm A0() {
        nwp nwpVar = this.b;
        nwpVar.getClass();
        em0 em0Var = nwpVar.a;
        Activity activityM = em0Var.m();
        c8o.l(activityM);
        lzn0 lzn0Var = (lzn0) nwpVar.G.get();
        a1r0 a1r0VarA0 = em0Var.A0();
        c8o.l(a1r0VarA0);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new yhm(activityM, lzn0Var, a1r0VarA0, new cbr0(new dbr0[]{new bn70(yon1.Z2(), nik1.q1, (nar0) null)}, false));
    }

    public c3s B() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                c3s c3sVarC0 = nwpVar.a.c0();
                c8o.l(c3sVarC0);
                return c3sVarC0;
            default:
                c3s c3sVarC1 = nwpVar.a.c0();
                c8o.l(c3sVarC1);
                return c3sVarC1;
        }
    }

    public yjj1 B0() {
        yjj1 yjj1VarL1 = this.b.a.l1();
        c8o.l(yjj1VarL1);
        return yjj1VarL1;
    }

    public a1r0 C() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                a1r0 a1r0VarA0 = nwpVar.a.A0();
                c8o.l(a1r0VarA0);
                return a1r0VarA0;
            default:
                a1r0 a1r0VarA1 = nwpVar.a.A0();
                c8o.l(a1r0VarA1);
                return a1r0VarA1;
        }
    }

    public unr C0() {
        unr unrVarF = this.b.a.F();
        c8o.l(unrVarF);
        return unrVarF;
    }

    public final hq41 D() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                hq41 hq41VarO0 = nwpVar.a.O0();
                c8o.l(hq41VarO0);
                return hq41VarO0;
            case 1:
                hq41 hq41VarO1 = nwpVar.a.O0();
                c8o.l(hq41VarO1);
                return hq41VarO1;
            default:
                hq41 hq41VarO2 = nwpVar.a.O0();
                c8o.l(hq41VarO2);
                return hq41VarO2;
        }
    }

    public waz0 D0() {
        waz0 waz0VarG0 = this.b.a.G0();
        c8o.l(waz0VarG0);
        return waz0VarG0;
    }

    public final aor E() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                aor aorVarG = nwpVar.a.G();
                c8o.l(aorVarG);
                return aorVarG;
            case 1:
                aor aorVarG2 = nwpVar.a.G();
                c8o.l(aorVarG2);
                return aorVarG2;
            default:
                aor aorVarG3 = nwpVar.a.G();
                c8o.l(aorVarG3);
                return aorVarG3;
        }
    }

    public Window F() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                break;
        }
        return ((dg30) nwpVar.b.c).getWindow();
    }

    public rxj0 G0() {
        rxj0 rxj0VarJ0 = this.b.a.j0();
        c8o.l(rxj0VarJ0);
        return rxj0VarJ0;
    }

    public final hyo0 H() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.y();
    }

    public pta1 I() {
        pta1 pta1VarF1 = this.b.a.f1();
        c8o.l(pta1VarF1);
        return pta1VarF1;
    }

    public final fl3 K() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                fl3 fl3VarL = nwpVar.a.l();
                c8o.l(fl3VarL);
                return fl3VarL;
            case 1:
                fl3 fl3VarL2 = nwpVar.a.l();
                c8o.l(fl3VarL2);
                return fl3VarL2;
            default:
                fl3 fl3VarL3 = nwpVar.a.l();
                c8o.l(fl3VarL3);
                return fl3VarL3;
        }
    }

    public m4c K0() {
        em0 em0Var = this.b.a;
        return new m4c((byte) 16);
    }

    public final fbm L() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return (fbm) this.c.get();
    }

    public lid L0() {
        lid lidVarU = this.b.a.u();
        c8o.l(lidVarU);
        return lidVarU;
    }

    public oj3 M() {
        oj3 oj3VarK = this.b.a.k();
        c8o.l(oj3VarK);
        return oj3VarK;
    }

    public z6k0 M0() {
        z6k0 z6k0VarK0 = this.b.a.k0();
        c8o.l(z6k0VarK0);
        return z6k0VarK0;
    }

    public final gg11 N() {
        byte b = this.a;
        lkf1 lkf1Var = lkf1.h;
        lkf1 lkf1Var2 = lkf1.g;
        lkf1 lkf1Var3 = lkf1.f;
        lkf1 lkf1Var4 = lkf1.d;
        lkf1 lkf1Var5 = lkf1.c;
        lkf1 lkf1Var6 = lkf1.b;
        lkf1 lkf1Var7 = lkf1.a;
        nwp nwpVar = this.b;
        lkf1 lkf1Var8 = lkf1.e;
        switch (b) {
            case 0:
                h380 h380VarB = j380.b(8);
                h380VarB.e(lkf1Var8, xqu.a(nwpVar.p1));
                h380VarB.e(lkf1Var7, xqu.a(nwpVar.t1));
                h380VarB.e(lkf1Var6, xqu.a(nwpVar.v1));
                h380VarB.e(lkf1Var5, xqu.a(nwpVar.C1));
                h380VarB.e(lkf1Var4, xqu.a(nwpVar.E1));
                h380VarB.e(lkf1Var3, xqu.a(nwpVar.G1));
                h380VarB.e(lkf1Var2, xqu.a(nwpVar.I1));
                h380VarB.e(lkf1Var, xqu.a(nwpVar.K1));
                return h380VarB.b(true);
            case 1:
                h380 h380VarB2 = j380.b(8);
                h380VarB2.e(lkf1Var8, xqu.a(nwpVar.p1));
                h380VarB2.e(lkf1Var7, xqu.a(nwpVar.t1));
                h380VarB2.e(lkf1Var6, xqu.a(nwpVar.v1));
                h380VarB2.e(lkf1Var5, xqu.a(nwpVar.C1));
                h380VarB2.e(lkf1Var4, xqu.a(nwpVar.E1));
                h380VarB2.e(lkf1Var3, xqu.a(nwpVar.G1));
                h380VarB2.e(lkf1Var2, xqu.a(nwpVar.I1));
                h380VarB2.e(lkf1Var, xqu.a(nwpVar.K1));
                return h380VarB2.b(true);
            default:
                h380 h380VarB3 = j380.b(8);
                h380VarB3.e(lkf1Var8, xqu.a(nwpVar.p1));
                h380VarB3.e(lkf1Var7, xqu.a(nwpVar.t1));
                h380VarB3.e(lkf1Var6, xqu.a(nwpVar.v1));
                h380VarB3.e(lkf1Var5, xqu.a(nwpVar.C1));
                h380VarB3.e(lkf1Var4, xqu.a(nwpVar.E1));
                h380VarB3.e(lkf1Var3, xqu.a(nwpVar.G1));
                h380VarB3.e(lkf1Var2, xqu.a(nwpVar.I1));
                h380VarB3.e(lkf1Var, xqu.a(nwpVar.K1));
                return h380VarB3.b(true);
        }
    }

    public final f771 O() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                f771 f771VarW0 = nwpVar.a.W0();
                c8o.l(f771VarW0);
                return f771VarW0;
            case 1:
                f771 f771VarW1 = nwpVar.a.W0();
                c8o.l(f771VarW1);
                return f771VarW1;
            default:
                f771 f771VarW2 = nwpVar.a.W0();
                c8o.l(f771VarW2);
                return f771VarW2;
        }
    }

    public h991 P() {
        h991 h991Var = (h991) ((daq) this.b.a.b).Mg.get();
        c8o.l(h991Var);
        return h991Var;
    }

    public lua1 Q() {
        lua1 lua1VarG1 = this.b.a.g1();
        c8o.l(lua1VarG1);
        return lua1VarG1;
    }

    public p3q Q0() {
        p3q p3qVar = (p3q) ((teq) this.b.a.c).m5.get();
        c8o.l(p3qVar);
        return p3qVar;
    }

    public s4p0 R() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (s4p0) nwpVar.H.get();
    }

    public joe R0() {
        return this.b.j();
    }

    public ufg1 S() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                ufg1 ufg1VarK1 = nwpVar.a.k1();
                c8o.l(ufg1VarK1);
                return ufg1VarK1;
            default:
                ufg1 ufg1VarK2 = nwpVar.a.k1();
                c8o.l(ufg1VarK2);
                return ufg1VarK2;
        }
    }

    public am30 S0() {
        am30 am30Var = (am30) ((daq) this.b.a.b).Qb.get();
        c8o.l(am30Var);
        return am30Var;
    }

    public y991 T() {
        y991 y991VarA1 = this.b.a.a1();
        c8o.l(y991VarA1);
        return y991VarA1;
    }

    public Scheduler U() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                break;
        }
        return (Scheduler) nwpVar.s.get();
    }

    public Scheduler U0() {
        return (Scheduler) this.b.t.get();
    }

    public qmg V() {
        qmg qmgVar = (qmg) ((daq) this.b.a.b).Bq.get();
        c8o.l(qmgVar);
        return qmgVar;
    }

    public o3e0 W() {
        return this.b.x();
    }

    public ns10 W0() {
        return ((teq) this.b.a.c).b.X();
    }

    public hs71 X() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                hs71 hs71VarY0 = nwpVar.a.Y0();
                c8o.l(hs71VarY0);
                return hs71VarY0;
            default:
                hs71 hs71VarY1 = nwpVar.a.Y0();
                c8o.l(hs71VarY1);
                return hs71VarY1;
        }
    }

    public skd0 X0() {
        skd0 skd0Var = (skd0) ((daq) this.b.a.b).a.k2.get();
        c8o.l(skd0Var);
        return skd0Var;
    }

    public waz0 Y() {
        waz0 waz0VarG0 = this.b.a.G0();
        c8o.l(waz0VarG0);
        return waz0VarG0;
    }

    public mr20 Y0() {
        xm41 xm41Var = (xm41) ((daq) this.b.a.b).Yl.get();
        c8o.l(xm41Var);
        return rqt0.u(new ht20(eth.t(xm41Var, new huz((Object) null, (byte) 10), fw2.Y0), new sd0(2, (lnm) null, (byte) 5)));
    }

    public dg30 Z() {
        return (dg30) this.b.e.get();
    }

    public mr20 Z0() {
        mr20 mr20Var = (mr20) ((daq) this.b.a.b).ul.get();
        c8o.l(mr20Var);
        return mr20Var;
    }

    public final yqg a() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (yqg) nwpVar.i.get();
    }

    public xfx a0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (xfx) nwpVar.h.get();
    }

    public final gw70 b() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                return gw70VarA0;
            case 1:
                gw70 gw70VarA1 = nwpVar.a.a0();
                c8o.l(gw70VarA1);
                return gw70VarA1;
            default:
                gw70 gw70VarA2 = nwpVar.a.a0();
                c8o.l(gw70VarA2);
                return gw70VarA2;
        }
    }

    public jc6 b0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return nwpVar.h();
    }

    public ye90 b1() {
        nwp nwpVar = this.b;
        yiq yiqVar = ((teq) nwpVar.a.c).b;
        teq teqVar = yiqVar.b;
        p410 p410Var = new p410((f971) teqVar.O3.get(), new eea0((eny) yiqVar.a.xp.get(), (byte) 9), teqVar.e0(), teqVar.d0(), teqVar.b0(), new h0y((bi0) teqVar.g.get(), (byte) 22), teqVar.J2(), (byte) 16);
        i4q i4qVarI = nwpVar.a.I();
        c8o.l(i4qVarI);
        return new ye90(p410Var, i4qVarI, (byte) 29);
    }

    public final lzn0 c() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (lzn0) nwpVar.G.get();
    }

    public xfx c0() {
        return (xfx) this.b.h.get();
    }

    public FlowableMap c1() {
        return ((teq) this.b.a.c).a.Y();
    }

    public Context context() {
        Context context = (Context) this.b.b.d;
        c8o.l(context);
        return context;
    }

    public final q8n d() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVarB0 = nwpVar.a.b0();
                c8o.l(q8nVarB0);
                return q8nVarB0;
            case 1:
                q8n q8nVarB1 = nwpVar.a.b0();
                c8o.l(q8nVarB1);
                return q8nVarB1;
            default:
                q8n q8nVarB2 = nwpVar.a.b0();
                c8o.l(q8nVarB2);
                return q8nVarB2;
        }
    }

    public rh11 d0() {
        rh11 rh11VarK0 = this.b.a.K0();
        c8o.l(rh11VarK0);
        return rh11VarK0;
    }

    public q8n e() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVarG0 = nwpVar.a.g0();
                c8o.l(q8nVarG0);
                return q8nVarG0;
            default:
                q8n q8nVarG1 = nwpVar.a.g0();
                c8o.l(q8nVarG1);
                return q8nVarG1;
        }
    }

    public final Flowable f() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (Flowable) nwpVar.l.get();
    }

    public uny f0() {
        return ((teq) this.b.a.c).a.W();
    }

    public q8n g() {
        return (q8n) this.b.A.get();
    }

    public a1i1 g0() {
        return this.b.F();
    }

    public pe h() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                pe peVarG = nwpVar.a.g();
                c8o.l(peVarG);
                return peVarG;
            default:
                pe peVarG2 = nwpVar.a.g();
                c8o.l(peVarG2);
                return peVarG2;
        }
    }

    public boolean h0() {
        return ((Boolean) ((teq) this.b.a.c).K6.get()).booleanValue();
    }

    public pe h1() {
        pe peVarG = this.b.a.g();
        c8o.l(peVarG);
        return peVarG;
    }

    public final o241 i() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (o241) nwpVar.k.get();
    }

    public kt91 j() {
        kt91 kt91VarD1 = this.b.a.d1();
        c8o.l(kt91VarD1);
        return kt91VarD1;
    }

    public final me30 k() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (me30) nwpVar.n.get();
    }

    public u961 k0() {
        return this.b.b();
    }

    public c9c0 l() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                c9c0 c9c0VarD0 = nwpVar.a.d0();
                c8o.l(c9c0VarD0);
                return c9c0VarD0;
            default:
                c9c0 c9c0VarD1 = nwpVar.a.d0();
                c8o.l(c9c0VarD1);
                return c9c0VarD1;
        }
    }

    public dma1 l0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                dma1 dma1VarZ0 = nwpVar.a.Z0();
                c8o.l(dma1VarZ0);
                return dma1VarZ0;
            default:
                dma1 dma1VarX = nwpVar.a.X();
                c8o.l(dma1VarX);
                return dma1VarX;
        }
    }

    public mnk0 m() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                mnk0 mnk0VarR = nwpVar.a.R();
                c8o.l(mnk0VarR);
                return mnk0VarR;
            default:
                mnk0 mnk0VarR2 = nwpVar.a.R();
                c8o.l(mnk0VarR2);
                return mnk0VarR2;
        }
    }

    public dma1 m0() {
        dma1 dma1VarX = this.b.a.X();
        c8o.l(dma1VarX);
        return dma1VarX;
    }

    public s4p0 m1() {
        return (s4p0) this.b.H.get();
    }

    public vbs n() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                vbs vbsVarQ0 = nwpVar.a.q0();
                c8o.l(vbsVarQ0);
                return vbsVarQ0;
            default:
                vbs vbsVarQ1 = nwpVar.a.q0();
                c8o.l(vbsVarQ1);
                return vbsVarQ1;
        }
    }

    public fzg0 n0() {
        return this.b.z();
    }

    public Scheduler o() {
        return (Scheduler) this.b.s.get();
    }

    public ssf1 p() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                ssf1 ssf1VarJ1 = nwpVar.a.j1();
                c8o.l(ssf1VarJ1);
                return ssf1VarJ1;
            default:
                ssf1 ssf1VarJ2 = nwpVar.a.j1();
                c8o.l(ssf1VarJ2);
                return ssf1VarJ2;
        }
    }

    public xyl1 p0() {
        xyl1 xyl1VarM1 = this.b.a.m1();
        c8o.l(xyl1VarM1);
        return xyl1VarM1;
    }

    public mta q() {
        switch (this.a) {
            case 0:
                break;
            default:
                em0 em0Var = this.b.a;
                break;
        }
        return new mta((byte) 14);
    }

    public uvy q0() {
        uvy uvyVarO = this.b.a.O();
        c8o.l(uvyVarO);
        return uvyVarO;
    }

    public Resources r() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (Resources) nwpVar.f.get();
    }

    public q8n r0() {
        q8n q8nVar = (q8n) ((daq) this.b.a.b).w1.get();
        c8o.l(q8nVar);
        return q8nVar;
    }

    public u4q0 s0() {
        u4q0 u4q0Var = (u4q0) ((daq) this.b.a.b).em.get();
        c8o.l(u4q0Var);
        return u4q0Var;
    }

    public final u601 t() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((q7r0) nwpVar.b.e).a;
    }

    public ajq0 t0() {
        return this.b.i();
    }

    public g5p0 u() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                g5p0 g5p0VarX0 = nwpVar.a.x0();
                c8o.l(g5p0VarX0);
                return g5p0VarX0;
            default:
                g5p0 g5p0VarX1 = nwpVar.a.x0();
                c8o.l(g5p0VarX1);
                return g5p0VarX1;
        }
    }

    public ywc0 u0() {
        ywc0 ywc0Var = (ywc0) ((teq) this.b.a.c).b.D.get();
        c8o.l(ywc0Var);
        return ywc0Var;
    }

    public final msm0 v() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                msm0 msm0VarP0 = nwpVar.a.p0();
                c8o.l(msm0VarP0);
                return msm0VarP0;
            case 1:
                msm0 msm0VarP1 = nwpVar.a.p0();
                c8o.l(msm0VarP1);
                return msm0VarP1;
            default:
                msm0 msm0VarP2 = nwpVar.a.p0();
                c8o.l(msm0VarP2);
                return msm0VarP2;
        }
    }

    public boolean v0() {
        return this.b.a.v();
    }

    public final luk w() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (luk) nwpVar.g.get();
    }

    public final mwn0 x() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (mwn0) nwpVar.j.get();
    }

    public vl91 y() {
        return this.b.a.b1();
    }

    public s6z y0() {
        s6z s6zVar = (s6z) ((teq) this.b.a.c).b.Cb.get();
        c8o.l(s6zVar);
        return s6zVar;
    }

    public final xh71 z() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                xh71 xh71VarX0 = nwpVar.a.X0();
                c8o.l(xh71VarX0);
                return xh71VarX0;
            case 1:
                xh71 xh71VarX1 = nwpVar.a.X0();
                c8o.l(xh71VarX1);
                return xh71VarX1;
            default:
                xh71 xh71VarX2 = nwpVar.a.X0();
                c8o.l(xh71VarX2);
                return xh71VarX2;
        }
    }

    public i4q z0() {
        i4q i4qVarI = this.b.a.I();
        c8o.l(i4qVarI);
        return i4qVarI;
    }
}
