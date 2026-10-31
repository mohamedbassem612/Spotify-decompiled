package p;

import android.content.res.Resources;
import android.view.Window;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pup implements ras, hm30, uh11 {
    public final /* synthetic */ byte a;
    public final nwp b;
    public final jly0 c;

    public pup(nwp nwpVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 4));
                break;
            case 2:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 8));
                break;
            default:
                this.b = nwpVar;
                this.c = iy81.a(new fup(nwpVar, (byte) 1));
                break;
        }
    }

    public final uu00 A() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                uu00 uu00VarP = nwpVar.a.P();
                c8o.l(uu00VarP);
                return uu00VarP;
            case 1:
                uu00 uu00VarP2 = nwpVar.a.P();
                c8o.l(uu00VarP2);
                return uu00VarP2;
            default:
                uu00 uu00VarP3 = nwpVar.a.P();
                c8o.l(uu00VarP3);
                return uu00VarP3;
        }
    }

    public final c3s B() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                c3s c3sVarC0 = nwpVar.a.c0();
                c8o.l(c3sVarC0);
                return c3sVarC0;
            case 1:
                c3s c3sVarC1 = nwpVar.a.c0();
                c8o.l(c3sVarC1);
                return c3sVarC1;
            default:
                c3s c3sVarC2 = nwpVar.a.c0();
                c8o.l(c3sVarC2);
                return c3sVarC2;
        }
    }

    public final a1r0 C() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                a1r0 a1r0VarA0 = nwpVar.a.A0();
                c8o.l(a1r0VarA0);
                return a1r0VarA0;
            case 1:
                a1r0 a1r0VarA1 = nwpVar.a.A0();
                c8o.l(a1r0VarA1);
                return a1r0VarA1;
            default:
                a1r0 a1r0VarA2 = nwpVar.a.A0();
                c8o.l(a1r0VarA2);
                return a1r0VarA2;
        }
    }

    public final unr C0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                unr unrVarF = nwpVar.a.F();
                c8o.l(unrVarF);
                return unrVarF;
            case 1:
                unr unrVarF2 = nwpVar.a.F();
                c8o.l(unrVarF2);
                return unrVarF2;
            default:
                unr unrVarF3 = nwpVar.a.F();
                c8o.l(unrVarF3);
                return unrVarF3;
        }
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

    public vy90 E0() {
        vy90 vy90Var = (vy90) ((daq) this.b.a.b).a.i2.get();
        c8o.l(vy90Var);
        return vy90Var;
    }

    public final Window F() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((dg30) nwpVar.b.c).getWindow();
    }

    @Override // p.uh11
    public am30 F0() {
        am30 am30Var = (am30) ((daq) this.b.a.b).Qb.get();
        c8o.l(am30Var);
        return am30Var;
    }

    public Scheduler G() {
        return (Scheduler) this.b.t.get();
    }

    public final rxj0 G0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                rxj0 rxj0VarJ0 = nwpVar.a.j0();
                c8o.l(rxj0VarJ0);
                return rxj0VarJ0;
            case 1:
                rxj0 rxj0VarJ1 = nwpVar.a.j0();
                c8o.l(rxj0VarJ1);
                return rxj0VarJ1;
            default:
                rxj0 rxj0VarJ2 = nwpVar.a.j0();
                c8o.l(rxj0VarJ2);
                return rxj0VarJ2;
        }
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

    public ljg H0() {
        return (ljg) this.b.J.get();
    }

    @Override // p.uh11
    public pta1 I() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                pta1 pta1VarF1 = nwpVar.a.f1();
                c8o.l(pta1VarF1);
                return pta1VarF1;
            default:
                pta1 pta1VarF2 = nwpVar.a.f1();
                c8o.l(pta1VarF2);
                return pta1VarF2;
        }
    }

    @Override // p.uh11
    public final uwh J() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                uwh uwhVarA = nwpVar.a.A();
                c8o.l(uwhVarA);
                return uwhVarA;
            case 1:
                uwh uwhVarA2 = nwpVar.a.A();
                c8o.l(uwhVarA2);
                return uwhVarA2;
            default:
                uwh uwhVarA3 = nwpVar.a.A();
                c8o.l(uwhVarA3);
                return uwhVarA3;
        }
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

    public final m4c K0() {
        switch (this.a) {
            case 0:
                em0 em0Var = this.b.a;
                break;
            case 1:
                em0 em0Var2 = this.b.a;
                break;
            default:
                em0 em0Var3 = this.b.a;
                break;
        }
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

    public final lid L0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                lid lidVarU = nwpVar.a.u();
                c8o.l(lidVarU);
                return lidVarU;
            case 1:
                lid lidVarU2 = nwpVar.a.u();
                c8o.l(lidVarU2);
                return lidVarU2;
            default:
                lid lidVarU3 = nwpVar.a.u();
                c8o.l(lidVarU3);
                return lidVarU3;
        }
    }

    public oj3 M() {
        oj3 oj3VarK = this.b.a.k();
        c8o.l(oj3VarK);
        return oj3VarK;
    }

    public final z6k0 M0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                z6k0 z6k0VarK0 = nwpVar.a.k0();
                c8o.l(z6k0VarK0);
                return z6k0VarK0;
            case 1:
                z6k0 z6k0VarK1 = nwpVar.a.k0();
                c8o.l(z6k0VarK1);
                return z6k0VarK1;
            default:
                z6k0 z6k0VarK2 = nwpVar.a.k0();
                c8o.l(z6k0VarK2);
                return z6k0VarK2;
        }
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

    @Override // p.uh11
    public h991 P() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                h991 h991Var = (h991) ((daq) nwpVar.a.b).Mg.get();
                c8o.l(h991Var);
                return h991Var;
            default:
                h991 h991Var2 = (h991) ((daq) nwpVar.a.b).Mg.get();
                c8o.l(h991Var2);
                return h991Var2;
        }
    }

    public final dma1 P0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                dma1 dma1VarZ0 = nwpVar.a.Z0();
                c8o.l(dma1VarZ0);
                return dma1VarZ0;
            case 1:
                dma1 dma1VarZ1 = nwpVar.a.Z0();
                c8o.l(dma1VarZ1);
                return dma1VarZ1;
            default:
                dma1 dma1VarZ2 = nwpVar.a.Z0();
                c8o.l(dma1VarZ2);
                return dma1VarZ2;
        }
    }

    @Override // p.uh11
    public lua1 Q() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                lua1 lua1VarG1 = nwpVar.a.g1();
                c8o.l(lua1VarG1);
                return lua1VarG1;
            default:
                lua1 lua1VarG2 = nwpVar.a.g1();
                c8o.l(lua1VarG2);
                return lua1VarG2;
        }
    }

    public final s4p0 R() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (s4p0) nwpVar.H.get();
    }

    public final ufg1 S() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                ufg1 ufg1VarK1 = nwpVar.a.k1();
                c8o.l(ufg1VarK1);
                return ufg1VarK1;
            case 1:
                ufg1 ufg1VarK2 = nwpVar.a.k1();
                c8o.l(ufg1VarK2);
                return ufg1VarK2;
            default:
                ufg1 ufg1VarK3 = nwpVar.a.k1();
                c8o.l(ufg1VarK3);
                return ufg1VarK3;
        }
    }

    @Override // p.uh11
    public y991 T() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                y991 y991VarA1 = nwpVar.a.a1();
                c8o.l(y991VarA1);
                return y991VarA1;
            default:
                y991 y991VarA2 = nwpVar.a.a1();
                c8o.l(y991VarA2);
                return y991VarA2;
        }
    }

    @Override // p.uh11
    public pqs T0() {
        pqs pqsVar = (pqs) ((daq) this.b.a.b).ka.get();
        c8o.l(pqsVar);
        return pqsVar;
    }

    public qmg V() {
        qmg qmgVar = (qmg) ((daq) this.b.a.b).Bq.get();
        c8o.l(qmgVar);
        return qmgVar;
    }

    @Override // p.uh11
    public q8n V0() {
        q8n q8nVar = (q8n) ((daq) this.b.a.b).w1.get();
        c8o.l(q8nVar);
        return q8nVar;
    }

    public o3e0 W() {
        return this.b.x();
    }

    public final hs71 X() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                hs71 hs71VarY0 = nwpVar.a.Y0();
                c8o.l(hs71VarY0);
                return hs71VarY0;
            case 1:
                hs71 hs71VarY1 = nwpVar.a.Y0();
                c8o.l(hs71VarY1);
                return hs71VarY1;
            default:
                hs71 hs71VarY2 = nwpVar.a.Y0();
                c8o.l(hs71VarY2);
                return hs71VarY2;
        }
    }

    public waz0 Y() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                waz0 waz0VarG0 = nwpVar.a.G0();
                c8o.l(waz0VarG0);
                return waz0VarG0;
            default:
                waz0 waz0VarG1 = nwpVar.a.G0();
                c8o.l(waz0VarG1);
                return waz0VarG1;
        }
    }

    public dg30 Z() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return (dg30) nwpVar.e.get();
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

    public final xfx a0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (xfx) nwpVar.h.get();
    }

    public mpd0 a1() {
        em0 em0Var = this.b.a;
        return new mpd0();
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

    public final jc6 b0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.h();
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
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                rh11 rh11VarK0 = nwpVar.a.K0();
                c8o.l(rh11VarK0);
                return rh11VarK0;
            default:
                rh11 rh11VarK1 = nwpVar.a.K0();
                c8o.l(rh11VarK1);
                return rh11VarK1;
        }
    }

    @Override // p.uh11
    public kvs0 d1() {
        kvs0 kvs0Var = (kvs0) ((teq) this.b.a.c).a.Qa.get();
        c8o.l(kvs0Var);
        return kvs0Var;
    }

    public final q8n e() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                q8n q8nVarG0 = nwpVar.a.g0();
                c8o.l(q8nVarG0);
                return q8nVarG0;
            case 1:
                q8n q8nVarG1 = nwpVar.a.g0();
                c8o.l(q8nVarG1);
                return q8nVarG1;
            default:
                q8n q8nVarG2 = nwpVar.a.g0();
                c8o.l(q8nVarG2);
                return q8nVarG2;
        }
    }

    public g7h e0() {
        g7h g7hVar = (g7h) ((daq) this.b.a.b).b7.get();
        c8o.l(g7hVar);
        return g7hVar;
    }

    public u63 e1() {
        em0 em0Var = this.b.a;
        return new u63();
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

    @Override // p.uh11
    public final q8n g() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (q8n) nwpVar.A.get();
    }

    @Override // p.uh11
    public a1i1 g0() {
        return this.b.F();
    }

    @Override // p.uh11
    public p3q g1() {
        p3q p3qVar = (p3q) ((teq) this.b.a.c).m5.get();
        c8o.l(p3qVar);
        return p3qVar;
    }

    public final pe h() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                pe peVarG = nwpVar.a.g();
                c8o.l(peVarG);
                return peVarG;
            case 1:
                pe peVarG2 = nwpVar.a.g();
                c8o.l(peVarG2);
                return peVarG2;
            default:
                pe peVarG3 = nwpVar.a.g();
                c8o.l(peVarG3);
                return peVarG3;
        }
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

    @Override // p.uh11
    public final fzw i0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                mr20 mr20Var = (mr20) nwpVar.x1.get();
                q8n q8nVarG0 = nwpVar.a.g0();
                c8o.l(q8nVarG0);
                return new fzw(mr20Var, q8nVarG0);
            case 1:
                mr20 mr20Var2 = (mr20) nwpVar.x1.get();
                q8n q8nVarG1 = nwpVar.a.g0();
                c8o.l(q8nVarG1);
                return new fzw(mr20Var2, q8nVarG1);
            default:
                mr20 mr20Var3 = (mr20) nwpVar.x1.get();
                q8n q8nVarG2 = nwpVar.a.g0();
                c8o.l(q8nVarG2);
                return new fzw(mr20Var3, q8nVarG2);
        }
    }

    @Override // p.uh11
    public ln91 i1() {
        ln91 ln91Var = (ln91) ((daq) this.b.a.b).yf.get();
        c8o.l(ln91Var);
        return ln91Var;
    }

    public final kt91 j() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                kt91 kt91VarD1 = nwpVar.a.d1();
                c8o.l(kt91VarD1);
                return kt91VarD1;
            case 1:
                kt91 kt91VarD2 = nwpVar.a.d1();
                c8o.l(kt91VarD2);
                return kt91VarD2;
            default:
                kt91 kt91VarD3 = nwpVar.a.d1();
                c8o.l(kt91VarD3);
                return kt91VarD3;
        }
    }

    @Override // p.uh11
    public ijr j0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                ijr ijrVarQ = nwpVar.a.q();
                c8o.l(ijrVarQ);
                return ijrVarQ;
            default:
                ijr ijrVarQ2 = nwpVar.a.q();
                c8o.l(ijrVarQ2);
                return ijrVarQ2;
        }
    }

    @Override // p.uh11
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

    public final u961 k0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.b();
    }

    public final hp91 k1() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((daq) nwpVar.a.b).c2();
    }

    @Override // p.uh11
    public final c9c0 l() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                c9c0 c9c0VarD0 = nwpVar.a.d0();
                c8o.l(c9c0VarD0);
                return c9c0VarD0;
            case 1:
                c9c0 c9c0VarD1 = nwpVar.a.d0();
                c8o.l(c9c0VarD1);
                return c9c0VarD1;
            default:
                c9c0 c9c0VarD2 = nwpVar.a.d0();
                c8o.l(c9c0VarD2);
                return c9c0VarD2;
        }
    }

    @Override // p.uh11
    public wm70 l1() {
        return (wm70) this.b.p.get();
    }

    @Override // p.uh11
    public final mnk0 m() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                mnk0 mnk0VarR = nwpVar.a.R();
                c8o.l(mnk0VarR);
                return mnk0VarR;
            case 1:
                mnk0 mnk0VarR2 = nwpVar.a.R();
                c8o.l(mnk0VarR2);
                return mnk0VarR2;
            default:
                mnk0 mnk0VarR3 = nwpVar.a.R();
                c8o.l(mnk0VarR3);
                return mnk0VarR3;
        }
    }

    public final dma1 m0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                dma1 dma1VarX = nwpVar.a.X();
                c8o.l(dma1VarX);
                return dma1VarX;
            case 1:
                dma1 dma1VarX2 = nwpVar.a.X();
                c8o.l(dma1VarX2);
                return dma1VarX2;
            default:
                dma1 dma1VarX3 = nwpVar.a.X();
                c8o.l(dma1VarX3);
                return dma1VarX3;
        }
    }

    @Override // p.uh11
    public final vbs n() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                vbs vbsVarQ0 = nwpVar.a.q0();
                c8o.l(vbsVarQ0);
                return vbsVarQ0;
            case 1:
                vbs vbsVarQ1 = nwpVar.a.q0();
                c8o.l(vbsVarQ1);
                return vbsVarQ1;
            default:
                vbs vbsVarQ2 = nwpVar.a.q0();
                c8o.l(vbsVarQ2);
                return vbsVarQ2;
        }
    }

    public final fzg0 n0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.z();
    }

    public final l6s n1() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.n();
    }

    public final Scheduler o() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (Scheduler) nwpVar.s.get();
    }

    @Override // p.uh11
    public gmt o0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 1:
                break;
        }
        return nwpVar.o();
    }

    @Override // p.uh11
    public final ssf1 p() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                ssf1 ssf1VarJ1 = nwpVar.a.j1();
                c8o.l(ssf1VarJ1);
                return ssf1VarJ1;
            case 1:
                ssf1 ssf1VarJ2 = nwpVar.a.j1();
                c8o.l(ssf1VarJ2);
                return ssf1VarJ2;
            default:
                ssf1 ssf1VarJ3 = nwpVar.a.j1();
                c8o.l(ssf1VarJ3);
                return ssf1VarJ3;
        }
    }

    public xyl1 p0() {
        xyl1 xyl1VarM1 = this.b.a.m1();
        c8o.l(xyl1VarM1);
        return xyl1VarM1;
    }

    @Override // p.uh11
    public final mta q() {
        switch (this.a) {
            case 0:
                em0 em0Var = this.b.a;
                break;
            case 1:
                em0 em0Var2 = this.b.a;
                break;
            default:
                em0 em0Var3 = this.b.a;
                break;
        }
        return new mta((byte) 14);
    }

    public final uvy q0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                uvy uvyVarO = nwpVar.a.O();
                c8o.l(uvyVarO);
                return uvyVarO;
            case 1:
                uvy uvyVarO2 = nwpVar.a.O();
                c8o.l(uvyVarO2);
                return uvyVarO2;
            default:
                uvy uvyVarO3 = nwpVar.a.O();
                c8o.l(uvyVarO3);
                return uvyVarO3;
        }
    }

    public final Resources r() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return (Resources) nwpVar.f.get();
    }

    @Override // p.uh11
    public final mmf0 s() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.w();
    }

    @Override // p.uh11
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

    public final ajq0 t0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.i();
    }

    public g5p0 u() {
        g5p0 g5p0VarX0 = this.b.a.x0();
        c8o.l(g5p0VarX0);
        return g5p0VarX0;
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

    public final boolean v0() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return nwpVar.a.v();
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

    @Override // p.uh11
    public g5p0 w0() {
        g5p0 g5p0VarX0 = this.b.a.x0();
        c8o.l(g5p0VarX0);
        return g5p0VarX0;
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

    @Override // p.uh11
    public vl91 y() {
        byte b = this.a;
        nwp nwpVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return nwpVar.a.b1();
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
}
