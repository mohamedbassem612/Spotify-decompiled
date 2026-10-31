package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.Window;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tzp implements bz2, ras, n0y, ys10, hm30, ve50, k5v0, uh11, fmj1 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final v5q c;
    public final jly0 d;

    public tzp(daq daqVar, v5q v5qVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 1));
                break;
            case 2:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 3));
                break;
            case 3:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 4));
                break;
            case 4:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 5));
                break;
            case 5:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 6));
                break;
            case 6:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 9));
                break;
            case 7:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 11));
                break;
            case 8:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 16));
                break;
            default:
                this.b = daqVar;
                this.c = v5qVar;
                this.d = iy81.a(new szp(daqVar, (byte) 0));
                break;
        }
    }

    public uu00 A() {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (uu00) this.b.a5.get();
    }

    public yhm A0() {
        return (yhm) this.c.n8.get();
    }

    public c3s B() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (c3s) this.b.e6.get();
    }

    public yjj1 B0() {
        switch (this.a) {
            case 0:
                break;
        }
        return (yjj1) this.b.zq.get();
    }

    public a1r0 C() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (a1r0) this.c.k1.get();
    }

    public unr C0() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (unr) this.c.u5.get();
    }

    public final hq41 D() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (hq41) this.c.L9.get();
    }

    public waz0 D0() {
        switch (this.a) {
            case 0:
                break;
        }
        return (waz0) this.b.Kc.get();
    }

    public final aor E() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (aor) this.c.D5.get();
    }

    @Override // p.ras
    public vy90 E0() {
        switch (this.a) {
            case 1:
                break;
        }
        return (vy90) this.b.a.i2.get();
    }

    public Window F() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.H0();
    }

    public am30 F0() {
        return (am30) this.b.Qb.get();
    }

    public Scheduler G() {
        switch (this.a) {
            case 7:
                break;
        }
        return (Scheduler) this.b.r3.get();
    }

    public rxj0 G0() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return (rxj0) this.c.H1.get();
    }

    public final hyo0 H() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.j0();
    }

    public ljg H0() {
        switch (this.a) {
            case 3:
                break;
        }
        return (ljg) this.c.N3.get();
    }

    @Override // p.ras
    public pta1 I() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (pta1) this.b.Q9.get();
    }

    public nqc1 I0() {
        return (nqc1) this.b.wq.get();
    }

    @Override // p.ras
    public uwh J() {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return (uwh) this.b.Wq.get();
    }

    public a7z J0() {
        return (a7z) this.b.Pp.get();
    }

    public final fl3 K() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (fl3) this.c.t5.get();
    }

    public m4c K0() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (fbm) this.d.get();
    }

    public lid L0() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return (lid) this.b.g9.get();
    }

    @Override // p.ras
    public oj3 M() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
        }
        return (oj3) this.c.p5.get();
    }

    public z6k0 M0() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return (z6k0) this.c.I1.get();
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
        v5q v5qVar = this.c;
        lkf1 lkf1Var8 = lkf1.e;
        switch (b) {
            case 0:
                h380 h380VarB = j380.b(8);
                h380VarB.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB.b(true);
            case 1:
                h380 h380VarB2 = j380.b(8);
                h380VarB2.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB2.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB2.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB2.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB2.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB2.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB2.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB2.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB2.b(true);
            case 2:
                h380 h380VarB3 = j380.b(8);
                h380VarB3.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB3.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB3.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB3.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB3.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB3.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB3.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB3.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB3.b(true);
            case 3:
                h380 h380VarB4 = j380.b(8);
                h380VarB4.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB4.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB4.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB4.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB4.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB4.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB4.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB4.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB4.b(true);
            case 4:
                h380 h380VarB5 = j380.b(8);
                h380VarB5.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB5.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB5.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB5.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB5.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB5.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB5.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB5.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB5.b(true);
            case 5:
                h380 h380VarB6 = j380.b(8);
                h380VarB6.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB6.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB6.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB6.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB6.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB6.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB6.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB6.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB6.b(true);
            case 6:
                h380 h380VarB7 = j380.b(8);
                h380VarB7.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB7.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB7.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB7.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB7.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB7.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB7.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB7.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB7.b(true);
            case 7:
                h380 h380VarB8 = j380.b(8);
                h380VarB8.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB8.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB8.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB8.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB8.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB8.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB8.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB8.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB8.b(true);
            default:
                h380 h380VarB9 = j380.b(8);
                h380VarB9.e(lkf1Var8, xqu.a(v5qVar.U9));
                h380VarB9.e(lkf1Var7, xqu.a(v5qVar.X9));
                h380VarB9.e(lkf1Var6, xqu.a(v5qVar.Z9));
                h380VarB9.e(lkf1Var5, xqu.a(v5qVar.ba));
                h380VarB9.e(lkf1Var4, xqu.a(v5qVar.da));
                h380VarB9.e(lkf1Var3, xqu.a(v5qVar.fa));
                h380VarB9.e(lkf1Var2, xqu.a(v5qVar.ha));
                h380VarB9.e(lkf1Var, xqu.a(v5qVar.ja));
                return h380VarB9.b(true);
        }
    }

    public cbv N0() {
        return (cbv) this.b.vq.get();
    }

    public final f771 O() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (f771) this.c.k5.get();
    }

    public w2k1 O0() {
        return (w2k1) this.b.L8.get();
    }

    @Override // p.ras
    public h991 P() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (h991) this.b.Mg.get();
    }

    public dma1 P0() {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return (dma1) this.b.C5.get();
    }

    @Override // p.ras
    public lua1 Q() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (lua1) this.c.R5.get();
    }

    public p3q Q0() {
        switch (this.a) {
            case 0:
                break;
        }
        return (p3q) this.c.K9.get();
    }

    public s4p0 R() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (s4p0) this.c.f3.get();
    }

    public joe R0() {
        return (joe) this.c.X8.get();
    }

    public ufg1 S() {
        switch (this.a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (ufg1) this.b.xq.get();
    }

    public am30 S0() {
        switch (this.a) {
            case 0:
                break;
        }
        return (am30) this.b.Qb.get();
    }

    @Override // p.ras
    public y991 T() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (y991) this.c.l1.get();
    }

    public pqs T0() {
        return (pqs) this.b.ka.get();
    }

    public Scheduler U() {
        switch (this.a) {
            case 2:
                break;
        }
        return (Scheduler) this.b.z1.get();
    }

    public Scheduler U0() {
        return (Scheduler) this.b.r3.get();
    }

    @Override // p.ras
    public qmg V() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
        }
        return (qmg) this.b.Bq.get();
    }

    public q8n V0() {
        return (q8n) this.b.w1.get();
    }

    @Override // p.ras
    public o3e0 W() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
        }
        return v5qVar.e0();
    }

    public ns10 W0() {
        v5q v5qVar = this.c;
        return new ns10((Flowable) v5qVar.oa.get(), (Scheduler) v5qVar.b.z1.get(), (id31) v5qVar.ra.get());
    }

    public hs71 X() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (hs71) this.c.P9.get();
    }

    public skd0 X0() {
        return (skd0) this.b.a.k2.get();
    }

    public waz0 Y() {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return (waz0) this.b.Kc.get();
    }

    public mr20 Y0() {
        return rqt0.u(new ht20(eth.t((xm41) this.c.b.Yl.get(), new huz((Object) null, (byte) 10), fw2.Y0), new sd0(2, (lnm) null, (byte) 5)));
    }

    public dg30 Z() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (dg30) this.c.i.a;
    }

    public mr20 Z0() {
        return (mr20) this.b.ul.get();
    }

    public final yqg a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (yqg) this.b.J1.get();
    }

    public xfx a0() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (xfx) this.c.o1.get();
    }

    @Override // p.ras
    public mpd0 a1() {
        return new mpd0();
    }

    public final gw70 b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (gw70) this.b.d8.get();
    }

    public jc6 b0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.m();
    }

    public ye90 b1() {
        v5q v5qVar = this.c;
        return new ye90(new p410((f971) v5qVar.E5.get(), new eea0((eny) v5qVar.b.xp.get(), (byte) 9), new dg8((lzn0) v5qVar.U0.get(), (byte) 10), v5qVar.r(), v5qVar.p(), new h0y((bi0) v5qVar.S0.get(), (byte) 22), v5qVar.p0(), (byte) 16), (i4q) v5qVar.v2.get(), (byte) 29);
    }

    public final lzn0 c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (lzn0) this.c.U0.get();
    }

    public xfx c0() {
        return (xfx) this.c.o1.get();
    }

    public FlowableMap c1() {
        return this.c.H();
    }

    public Context context() {
        switch (this.a) {
            case 2:
                break;
        }
        return (Context) this.b.x1.a;
    }

    public final q8n d() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (q8n) this.b.E1.get();
    }

    public rh11 d0() {
        switch (this.a) {
            case 0:
                break;
            case 4:
                break;
            case 7:
                break;
        }
        return (rh11) this.b.ia.get();
    }

    public kvs0 d1() {
        return (kvs0) this.c.sa.get();
    }

    public q8n e() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (q8n) this.b.V2.get();
    }

    @Override // p.ras
    public g7h e0() {
        return (g7h) this.b.b7.get();
    }

    @Override // p.ras
    public u63 e1() {
        return new u63();
    }

    public final Flowable f() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (Flowable) this.b.D5.get();
    }

    public uny f0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 6:
                break;
        }
        return v5qVar.D();
    }

    public pqc1 f1() {
        return (pqc1) this.b.O8.get();
    }

    @Override // p.ras
    public q8n g() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (q8n) this.b.r2.get();
    }

    public a1i1 g0() {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
        }
        return (a1i1) this.c.ka.get();
    }

    public p3q g1() {
        return (p3q) this.c.K9.get();
    }

    public pe h() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (pe) this.b.p9.get();
    }

    public boolean h0() {
        return ((Boolean) this.c.K8.get()).booleanValue();
    }

    public pe h1() {
        return (pe) this.b.p9.get();
    }

    public final o241 i() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (o241) this.b.u4.get();
    }

    @Override // p.ras
    public fzw i0() {
        switch (this.a) {
            case 1:
                break;
            case 4:
                break;
        }
        return new fzw((mr20) this.c.F4.get(), (q8n) this.b.V2.get());
    }

    public ln91 i1() {
        return (ln91) this.b.yf.get();
    }

    public kt91 j() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (kt91) this.b.f8.get();
    }

    public ijr j0() {
        switch (this.a) {
            case 3:
                break;
            case 4:
                break;
        }
        return (ijr) this.c.o6.get();
    }

    public r3b1 j1() {
        return (r3b1) this.b.I8.get();
    }

    @Override // p.ras
    public final me30 k() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (me30) this.b.w7.get();
    }

    public u961 k0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.d();
    }

    public hp91 k1() {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return daqVar.c2();
    }

    @Override // p.ras
    public c9c0 l() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (c9c0) this.b.Ed.get();
    }

    public dma1 l0() {
        switch (this.a) {
            case 0:
                return (dma1) this.b.C5.get();
            case 1:
            default:
                return (dma1) this.b.C5.get();
            case 2:
                return (dma1) this.b.C1.get();
        }
    }

    public wm70 l1() {
        return (wm70) this.b.Dl.get();
    }

    @Override // p.ras
    public mnk0 m() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (mnk0) this.c.K1.get();
    }

    public dma1 m0() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (dma1) this.b.C1.get();
    }

    public s4p0 m1() {
        return (s4p0) this.c.f3.get();
    }

    @Override // p.ras
    public vbs n() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (vbs) this.b.wf.get();
    }

    public fzg0 n0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.k0();
    }

    public l6s n1() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
        }
        return v5qVar.z();
    }

    public Scheduler o() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (Scheduler) this.b.z1.get();
    }

    public gmt o0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 4:
                break;
        }
        return v5qVar.C();
    }

    public boolean o1() {
        return this.c.b.g().c();
    }

    @Override // p.ras
    public ssf1 p() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (ssf1) this.c.p8.get();
    }

    public xyl1 p0() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 6:
                break;
        }
        return (xyl1) this.c.la.get();
    }

    @Override // p.ras
    public mta q() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return new mta((byte) 14);
    }

    public uvy q0() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (uvy) this.b.cf.get();
    }

    public Resources r() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (Resources) this.c.X0.get();
    }

    public q8n r0() {
        switch (this.a) {
            case 0:
                break;
        }
        return (q8n) this.b.w1.get();
    }

    @Override // p.ras
    public mmf0 s() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.a0();
    }

    public u4q0 s0() {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
        }
        return (u4q0) this.b.em.get();
    }

    public final u601 t() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (u601) this.c.j3.get();
    }

    public ajq0 t0() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.n();
    }

    @Override // p.ras
    public g5p0 u() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 5:
                break;
            case 6:
                break;
        }
        return (g5p0) this.c.F5.get();
    }

    public ywc0 u0() {
        return (ywc0) this.c.G8.get();
    }

    public final msm0 v() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (msm0) this.b.t9.get();
    }

    public boolean v0() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 4:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((Boolean) this.b.Aq.get()).booleanValue();
    }

    public final luk w() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (luk) this.b.L1.get();
    }

    public g5p0 w0() {
        return (g5p0) this.c.F5.get();
    }

    public final mwn0 x() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (mwn0) this.b.Wd.get();
    }

    public g0l x0() {
        return (g0l) this.b.E5.get();
    }

    @Override // p.ras
    public vl91 y() {
        byte b = this.a;
        v5q v5qVar = this.c;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return v5qVar.C0();
    }

    public s6z y0() {
        switch (this.a) {
            case 0:
                break;
            case 6:
                break;
        }
        return (s6z) this.c.k6.get();
    }

    public final xh71 z() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return (xh71) this.c.i4.get();
    }

    public i4q z0() {
        return (i4q) this.c.v2.get();
    }
}
