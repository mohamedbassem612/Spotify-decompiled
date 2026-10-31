package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.Window;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.processors.BehaviorProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qzp implements f62, az2, pkd, qas, xs10, lmf0, asl0, ukn0, j5v0, ecz0, r8b1, n8g1 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final v5q c;

    public /* synthetic */ qzp(daq daqVar, v5q v5qVar, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = v5qVar;
    }

    @Override // p.lmf0
    public m3e0 A() {
        return (m3e0) this.b.kr.get();
    }

    @Override // p.asl0
    public au90 A0() {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 6:
                break;
        }
        return daqVar.J1();
    }

    @Override // p.f62
    public c3s B() {
        return (c3s) this.b.e6.get();
    }

    @Override // p.f62
    public yjj1 B0() {
        return (yjj1) this.b.zq.get();
    }

    @Override // p.f62
    public a1r0 C() {
        return (a1r0) this.c.k1.get();
    }

    @Override // p.asl0
    public n3d0 C0() {
        return (n3d0) this.c.O1.get();
    }

    @Override // p.lmf0
    public q8q D() {
        return (q8q) this.b.mo.get();
    }

    @Override // p.asl0
    public fh4 D0() {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 6:
                break;
        }
        return new fh4(false, (luk) daqVar.L1.get());
    }

    @Override // p.lmf0
    public mr20 E() {
        return (mr20) this.c.F4.get();
    }

    @Override // p.asl0
    public Observable E0() {
        return (Observable) this.b.J6.get();
    }

    @Override // p.f62
    public Window F() {
        return this.c.H0();
    }

    @Override // p.f62
    public am30 F0() {
        return (am30) this.b.Qb.get();
    }

    @Override // p.f62
    public Scheduler G() {
        return (Scheduler) this.b.r3.get();
    }

    @Override // p.f62
    public mw7 G0() {
        return (mw7) this.b.o4.get();
    }

    @Override // p.lmf0
    public oqa1 H() {
        return (oqa1) this.b.no.get();
    }

    @Override // p.lmf0
    public smf0 I() {
        return (smf0) this.b.lr.get();
    }

    @Override // p.f62
    public nqc1 I0() {
        return (nqc1) this.b.wq.get();
    }

    @Override // p.f62
    public a7z J0() {
        return (a7z) this.b.Pp.get();
    }

    @Override // p.f62
    public cbv N0() {
        return (cbv) this.b.vq.get();
    }

    @Override // p.f62
    public w2k1 O0() {
        return (w2k1) this.b.L8.get();
    }

    @Override // p.f62
    public Flowable P0() {
        BehaviorProcessor behaviorProcessor = this.c.a.v1;
        behaviorProcessor.getClass();
        return behaviorProcessor.t(Functions.a);
    }

    @Override // p.f62
    public xn0 Q0() {
        return (xn0) this.b.jb.get();
    }

    @Override // p.f62
    public s4p0 R() {
        return (s4p0) this.c.f3.get();
    }

    @Override // p.f62
    public m2p R0() {
        return (m2p) this.b.uq.get();
    }

    @Override // p.f62
    public ufg1 S() {
        return (ufg1) this.b.xq.get();
    }

    @Override // p.f62
    public dz0 S0() {
        return (dz0) this.c.i5.get();
    }

    @Override // p.f62
    public pxc T0() {
        return (pxc) this.c.f5.get();
    }

    @Override // p.f62
    public up0 U0() {
        return new up0((a1r0) this.c.k1.get());
    }

    @Override // p.f62
    public ao0 V0() {
        return (ao0) this.b.Hk.get();
    }

    @Override // p.f62
    public Single W0() {
        return (Single) this.b.a.P1.get();
    }

    @Override // p.f62
    public g341 X0() {
        return (g341) this.b.Fh.get();
    }

    @Override // p.asl0
    public waz0 Y() {
        return (waz0) this.b.Kc.get();
    }

    @Override // p.f62
    public yq0 Y0() {
        return (yq0) this.c.g5.get();
    }

    @Override // p.f62
    public tp41 Z0() {
        return (tp41) this.b.Dg.get();
    }

    @Override // p.f62, p.lmf0, p.asl0
    public yqg a() {
        switch (this.a) {
            case 0:
                break;
            case 5:
                break;
        }
        return (yqg) this.b.J1.get();
    }

    @Override // p.f62
    public ddo a1() {
        return (ddo) this.c.j5.get();
    }

    @Override // p.f62
    public gw70 b() {
        return (gw70) this.b.d8.get();
    }

    @Override // p.f62
    public aq0 b1() {
        return (aq0) this.c.e5.get();
    }

    @Override // p.lmf0, p.asl0
    public Flowable c() {
        switch (this.a) {
            case 5:
                break;
            case 6:
                break;
        }
        return (Flowable) this.b.D5.get();
    }

    @Override // p.f62
    public xfx c0() {
        return (xfx) this.c.o1.get();
    }

    @Override // p.f62
    public r791 c1() {
        return (r791) this.c.l5.get();
    }

    @Override // p.f62
    public Context context() {
        return (Context) this.b.x1.a;
    }

    @Override // p.az2
    public bz2 create() {
        return new tzp(this.b, this.c, (byte) 0);
    }

    @Override // p.f62
    public q8n d() {
        return (q8n) this.b.E1.get();
    }

    @Override // p.f62
    public Scheduler d0() {
        return (Scheduler) this.b.z1.get();
    }

    @Override // p.f62
    public t2j0 d1() {
        return (t2j0) this.b.f2.get();
    }

    @Override // p.f62
    public q8n e() {
        return (q8n) this.b.V2.get();
    }

    @Override // p.f62
    public kma e0() {
        return (kma) this.b.Od.get();
    }

    @Override // p.f62
    public qq0 e1() {
        return (qq0) this.b.ib.get();
    }

    @Override // p.f62
    public Flowable f() {
        return (Flowable) this.b.D5.get();
    }

    @Override // p.f62
    public pqc1 f1() {
        return (pqc1) this.b.O8.get();
    }

    @Override // p.ukn0
    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public vkn0 mo911g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        cp31 cp31Var = new cp31();
        daq daqVar = this.b;
        cp31Var.b = daqVar;
        cp31Var.c = this.c;
        cp31Var.a = q2p0Var;
        cp31Var.d = new s2q(daqVar, cp31Var, 1, (byte) 16);
        cp31Var.e = iy81.a(new s2q(daqVar, cp31Var, 2, (byte) 16));
        cp31Var.f = iy81.a(new s2q(daqVar, cp31Var, 0, (byte) 16));
        return cp31Var;
    }

    @Override // p.f62
    public il0 g1() {
        return f42.l((qxo) this.b.a.a.kb.get());
    }

    @Override // p.f62
    public pe h() {
        return (pe) this.b.p9.get();
    }

    @Override // p.f62
    public ko0 h1() {
        return (ko0) this.b.a.A1.get();
    }

    @Override // p.f62
    public o241 i() {
        return (o241) this.b.u4.get();
    }

    @Override // p.f62, p.asl0
    public kt91 j() {
        switch (this.a) {
            case 0:
                break;
            case 6:
                break;
        }
        return (kt91) this.b.f8.get();
    }

    @Override // p.lmf0
    public luk k() {
        return (luk) this.b.L1.get();
    }

    @Override // p.asl0
    public xrc0 l() {
        return (xrc0) this.b.f5.get();
    }

    @Override // p.asl0
    public i8h1 m() {
        switch (this.a) {
            case 6:
                break;
        }
        return (i8h1) this.b.A5.get();
    }

    @Override // p.f62
    public RetrofitMaker n() {
        return (RetrofitMaker) this.b.Y3.get();
    }

    @Override // p.lmf0, p.asl0
    public Scheduler o() {
        switch (this.a) {
            case 5:
                break;
        }
        return (Scheduler) this.b.z1.get();
    }

    @Override // p.lmf0
    public gmt o0() {
        return this.c.C();
    }

    @Override // p.asl0
    public RxRouter p() {
        return (RxRouter) this.b.G1.get();
    }

    @Override // p.f62
    public Resources r() {
        return (Resources) this.c.X0.get();
    }

    @Override // p.f62
    public dg30 s() {
        return (dg30) this.c.i.a;
    }

    @Override // p.f62
    public u601 t() {
        return (u601) this.c.j3.get();
    }

    @Override // p.lmf0
    public mr20 u() {
        return (mr20) this.b.u5.get();
    }

    @Override // p.lmf0
    public t8u0 v() {
        return (t8u0) this.b.d9.get();
    }

    @Override // p.f62
    public luk w() {
        return (luk) this.b.L1.get();
    }

    @Override // p.asl0
    public g5p0 w0() {
        switch (this.a) {
            case 6:
                break;
        }
        return (g5p0) this.c.F5.get();
    }

    @Override // p.lmf0
    public sqs0 x() {
        return (sqs0) this.b.uo.get();
    }

    @Override // p.f62
    public g0l x0() {
        return (g0l) this.b.E5.get();
    }

    @Override // p.lmf0
    public aqs0 y() {
        return (aqs0) this.b.eq.get();
    }

    @Override // p.asl0
    public Scheduler y0() {
        return (Scheduler) this.b.A2.get();
    }

    @Override // p.lmf0
    public loc1 z() {
        return new loc1();
    }

    @Override // p.f62
    public i4q z0() {
        return (i4q) this.c.v2.get();
    }

    @Override // p.qas
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public ras mo907create() {
        return new tzp(this.b, this.c, (byte) 1);
    }

    @Override // p.xs10
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public ys10 mo908create() {
        return new tzp(this.b, this.c, (byte) 3);
    }

    @Override // p.j5v0
    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public k5v0 mo906create() {
        return new tzp(this.b, this.c, (byte) 6);
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public qkd m909g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new g1i(this.b, this.c, q2p0Var);
    }

    @Override // p.r8b1
    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public s8b1 mo910g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new byp(this.b, this.c, q2p0Var);
    }

    @Override // p.n8g1
    public o8g1 g(q2p0 q2p0Var) {
        q2p0Var.getClass();
        return new uw0(this.b, this.c, q2p0Var);
    }
}
