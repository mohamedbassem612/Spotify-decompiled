package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.externalintegration.service.provider.MediaProvider;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import com.spotify.tap.spoton.SpotOnService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wtp implements jmf0, dl4, bob0, oo91 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wtp(g0q g0qVar, qop qopVar, bct bctVar) {
        this.a = (byte) 21;
        this.d = g0qVar;
        byte b = 6;
        this.b = iy81.a(new jxp(this, 1, b));
        this.c = iy81.a(new jxp(this, 0, b));
    }

    public uu00 A() {
        return (uu00) ((daq) this.b).a5.get();
    }

    public i8h1 B() {
        return u1n0.z((q7r0) this.b);
    }

    public a1r0 C() {
        return (a1r0) ((v5q) this.c).k1.get();
    }

    public Scheduler G() {
        return (Scheduler) ((daq) this.b).r3.get();
    }

    public mw7 G0() {
        return (mw7) ((daq) this.b).o4.get();
    }

    public yqg a() {
        return (yqg) ((daq) this.b).J1.get();
    }

    public gw70 b() {
        return (gw70) ((daq) this.b).d8.get();
    }

    public lzn0 c() {
        return (lzn0) ((v5q) this.c).U0.get();
    }

    public Context context() {
        return (Context) ((daq) this.b).x1.a;
    }

    public q8n d() {
        return (q8n) ((daq) this.b).E1.get();
    }

    public Scheduler d0() {
        return (Scheduler) ((daq) this.b).z1.get();
    }

    public lik1 e() {
        return (lik1) this.d;
    }

    public g7h e0() {
        return (g7h) ((daq) this.b).b7.get();
    }

    public qhm element() {
        nwp nwpVar = (nwp) this.c;
        pjf0 pjf0Var = (pjf0) nwpVar.M1.get();
        em0 em0Var = nwpVar.a;
        eof0 eof0Var = (eof0) ((daq) em0Var.b).to.get();
        c8o.l(eof0Var);
        vgb vgbVar = new vgb(nwpVar.M1);
        q8q q8qVar = (q8q) ((daq) em0Var.b).mo.get();
        c8o.l(q8qVar);
        Flowable flowable = (Flowable) this.d;
        Flowable flowableX = zgf0.x(flowable, (Scheduler) nwpVar.s.get(), (yqg) nwpVar.i.get());
        Flowable flowableW = zgf0.w((Flowable) nwpVar.l.get(), (Scheduler) nwpVar.s.get(), (yqg) nwpVar.i.get());
        FlowableOnBackpressureLatest flowableOnBackpressureLatest = new FlowableOnBackpressureLatest((PublishProcessor) this.b);
        oqa1 oqa1Var = (oqa1) ((daq) em0Var.b).no.get();
        c8o.l(oqa1Var);
        if (oqa1Var.h) {
            flowableX = flowableW;
        }
        e27 e27VarA = q8qVar.a(flowableX, flowableOnBackpressureLatest);
        z6c z6cVar = new z6c((lzn0) nwpVar.G.get());
        Scheduler scheduler = (Scheduler) nwpVar.s.get();
        Scheduler scheduler2 = (Scheduler) nwpVar.t.get();
        zwz0 zwz0Var = (zwz0) ((daq) em0Var.b).U1.get();
        c8o.l(zwz0Var);
        sqs0 sqs0Var = (sqs0) ((daq) em0Var.b).uo.get();
        c8o.l(sqs0Var);
        lnf0 lnf0Var = (lnf0) ((daq) em0Var.b).po.get();
        c8o.l(lnf0Var);
        return new qhm(pjf0Var, vgbVar, eof0Var, e27VarA, z6cVar, scheduler, scheduler2, zwz0Var, flowable, sqs0Var, lnf0Var, new cr4(false, false, false, (luk) nwpVar.g.get()).b(), new pg4((luk) nwpVar.g.get()).i(), (xpw) null);
    }

    public Flowable f() {
        return (Flowable) ((daq) this.b).D5.get();
    }

    public q8n g() {
        return (q8n) ((daq) this.b).r2.get();
    }

    public ip91 h() {
        return (ip91) ((daq) this.b).g8.get();
    }

    public o241 i() {
        return (o241) ((daq) this.b).u4.get();
    }

    public cfr j() {
        return (cfr) ((v5q) this.c).r1.get();
    }

    public vu1 k() {
        return (vu1) ((v5q) this.c).q1.get();
    }

    public xrc0 l() {
        return (xrc0) ((daq) this.b).f5.get();
    }

    public agc0 m() {
        return (agc0) ((daq) this.b).B7.get();
    }

    public jo91 n() {
        return (jo91) ((daq) this.b).r7.get();
    }

    public ccc0 o() {
        return (ccc0) ((v5q) this.c).H2.get();
    }

    public RxRouter p() {
        return (RxRouter) ((daq) this.b).G1.get();
    }

    public t2j0 q() {
        return (t2j0) ((daq) this.b).f2.get();
    }

    public jp00 r() {
        return (jp00) ((daq) this.b).Fr.get();
    }

    public Activity s() {
        return (Activity) ((v5q) this.c).i.a;
    }

    public io91 t() {
        return (io91) ((daq) this.b).Gr.get();
    }

    public hn91 u() {
        return (hn91) ((v5q) this.c).y9.get();
    }

    public dg30 v() {
        return (Activity) this.d;
    }

    public void w(Object obj) {
        byte b = this.a;
        zxf zxfVar = oxf.b;
        zxf zxfVar2 = null;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 10:
                MediaProvider mediaProvider = (MediaProvider) obj;
                daq daqVar = (daq) obj3;
                mediaProvider.a = xqu.a(daqVar.f2);
                mediaProvider.b = xqu.a(daqVar.vo);
                mediaProvider.c = xqu.a(daqVar.xo);
                mediaProvider.d = xqu.a((lkp) obj4);
                mediaProvider.e = xqu.a((lkp) obj2);
                mediaProvider.f = xqu.a(daqVar.yo);
                break;
            case 11:
            default:
                SpotOnService spotOnService = (SpotOnService) obj;
                spotOnService.d = new yrg0((byte) 16);
                spotOnService.g = new c4m0();
                daq daqVar2 = (daq) obj3;
                spotOnService.c = (Scheduler) daqVar2.z1.get();
                spotOnService.e = new li4(true, (luk) daqVar2.L1.get());
                spotOnService.a = tk00.D((ghp) daqVar2.qa.get());
                spotOnService.h = new av60((t2j0) daqVar2.f2.get(), (g0l) daqVar2.E5.get());
                spotOnService.b = ((b3q) ((jly0) obj4).get()).a(mno1.i0);
                spotOnService.f = (i8h1) daqVar2.A5.get();
                break;
            case 12:
                ypv0 ypv0Var = (ypv0) obj;
                daq daqVar3 = (daq) obj4;
                byf byfVar = (byf) daqVar3.Bm.get();
                ypv0 ypv0Var2 = (ypv0) obj3;
                dg30 dg30Var = (dg30) ((teq) obj2).f.a;
                e4b1 e4b1Var = new e4b1(dg30Var, (byte) 3);
                try {
                    Bundle bundle = ((zf30) ypv0Var2).f;
                    if (bundle != null) {
                        zxfVar2 = (zxf) jhc1.t(bundle, "KEY_IN_APP_INTERNAL_WEBVIEW_CHECKOUT_SOURCE", zxf.class);
                    }
                } catch (ClassCastException unused) {
                }
                ypv0Var.Y1 = i7v0.w(byfVar, ypv0Var2, e4b1Var, dg30Var, zxfVar2 == null ? zxfVar : zxfVar2, ypv0Var2);
                ypv0Var.X1 = (g341) daqVar3.Fh.get();
                break;
            case 13:
                ypv0 ypv0Var3 = (ypv0) obj;
                daq daqVar4 = (daq) obj4;
                byf byfVar2 = (byf) daqVar4.Bm.get();
                ypv0 ypv0Var4 = (ypv0) obj3;
                PremiumAccountManagementWebviewActivity premiumAccountManagementWebviewActivity = (PremiumAccountManagementWebviewActivity) ((tnm) obj2).b;
                e4b1 e4b1Var2 = new e4b1(premiumAccountManagementWebviewActivity, (byte) 3);
                try {
                    Bundle bundle2 = ((zf30) ypv0Var4).f;
                    if (bundle2 != null) {
                        zxfVar2 = (zxf) jhc1.t(bundle2, "KEY_IN_APP_INTERNAL_WEBVIEW_CHECKOUT_SOURCE", zxf.class);
                    }
                } catch (ClassCastException unused2) {
                }
                ypv0Var3.Y1 = i7v0.w(byfVar2, ypv0Var4, e4b1Var2, premiumAccountManagementWebviewActivity, zxfVar2 == null ? zxfVar : zxfVar2, ypv0Var4);
                ypv0Var3.X1 = (g341) daqVar4.Fh.get();
                break;
            case 14:
                PageActivityProxy pageActivityProxy = (PageActivityProxy) obj;
                daq daqVar5 = (daq) obj2;
                ((mzo) pageActivityProxy).a1 = (jgu) daqVar5.a.g0.get();
                pageActivityProxy.b1 = (a1r0) ((jly0) obj4).get();
                pageActivityProxy.c1 = (amy0) daqVar5.Eo.get();
                break;
            case 15:
                u0a1 u0a1Var = (u0a1) obj;
                daq daqVar6 = (daq) obj3;
                bfa0 bfa0Var = new bfa0((gw70) daqVar6.d8.get());
                ((w2q) obj2).get();
                u0a1Var.c2 = new dn81(j380.m(bfa0.class, bfa0Var, uc71.class, new uc71()), (byte) 5);
                u0a1Var.b2 = (Scheduler) daqVar6.z1.get();
                break;
        }
    }

    public iyc0 x() {
        return (iyc0) ((daq) this.b).g5.get();
    }

    public p2o0 y() {
        dg30 dg30Var = (dg30) this.d;
        daq daqVar = (daq) this.c;
        return aan0.t(dg30Var, (d3o0) daqVar.E2.get(), new u210((t2j0) daqVar.f2.get()), (Scheduler) daqVar.z1.get());
    }

    public Scheduler y0() {
        return (Scheduler) ((daq) this.b).A2.get();
    }

    public fv9 z() {
        obt0 obt0Var = (obt0) this.d;
        kly0 kly0Var = obt0Var.j;
        p090 p090Var = (p090) kly0Var.get();
        c8o.l(p090Var);
        kly0 kly0Var2 = obt0Var.f;
        RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var2.get();
        c8o.l(retrofitMaker);
        enr0 enr0VarT = kmq0.t(p090Var, retrofitMaker);
        p090 p090Var2 = (p090) kly0Var.get();
        c8o.l(p090Var2);
        RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var2.get();
        c8o.l(retrofitMaker2);
        enr0 enr0VarU = kmq0.u(p090Var2, retrofitMaker2);
        dma1 dma1Var = (dma1) obt0Var.g.get();
        c8o.l(dma1Var);
        wpv0 wpv0Var = (wpv0) obt0Var.h.get();
        c8o.l(wpv0Var);
        return new fv9(enr0VarT, enr0VarU, dma1Var, wpv0Var);
    }

    public Flowable z0() {
        return (Flowable) ((daq) this.b).z2.get();
    }

    public /* synthetic */ wtp(daq daqVar, dl4 dl4Var, Object obj, byte b) {
        this.a = b;
        this.b = daqVar;
        this.c = dl4Var;
        this.d = obj;
    }

    public wtp(daq daqVar, s7q s7qVar) {
        this.a = (byte) 15;
        this.d = daqVar;
        this.b = s7qVar;
        this.c = new w2q(daqVar, s7qVar, (byte) 1);
    }

    public wtp(daq daqVar, dg30 dg30Var) {
        this.a = (byte) 11;
        this.c = daqVar;
        this.d = dg30Var;
        this.b = xqu.b(new bup(daqVar, this, (byte) 7));
    }

    public wtp(aru0 aru0Var) {
        this.a = (byte) 9;
        this.d = aru0Var;
        byte b = 2;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public wtp(rbs0 rbs0Var) {
        this.a = (byte) 5;
        this.d = rbs0Var;
        this.b = new dlp(this, 0, (byte) 29);
        this.c = new dlp(this, 1, (byte) 29);
    }

    public wtp(lzp lzpVar, qop qopVar, bct bctVar) {
        this.a = (byte) 22;
        this.d = qopVar;
        this.b = lzpVar;
        this.c = new uyp(this, (byte) 10);
    }

    public wtp(ozp ozpVar, qop qopVar, bct bctVar) {
        this.a = (byte) 3;
        this.d = qopVar;
        this.b = ozpVar;
        this.c = new xrp(this, (byte) 15);
    }

    public wtp(jbq jbqVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 24;
        this.d = qopVar;
        this.b = jbqVar;
        this.c = new uyp(this, (byte) 13);
    }

    public wtp(l0q l0qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 23;
        this.d = qopVar;
        this.b = l0qVar;
        this.c = new uyp(this, (byte) 12);
    }

    public wtp(k3q k3qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 25;
        this.d = qopVar;
        this.b = k3qVar;
        this.c = new uyp(this, (byte) 15);
    }

    public wtp(l3q l3qVar, bct bctVar) {
        this.a = (byte) 8;
        this.d = l3qVar;
        this.c = bctVar;
        this.b = iy81.a(new xrp(this, (byte) 29));
    }

    public wtp(b0q b0qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 19;
        this.d = qopVar;
        this.b = b0qVar;
        this.c = new uyp(this, (byte) 4);
    }

    public wtp(ibq ibqVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 20;
        this.d = qopVar;
        this.b = ibqVar;
        this.c = new uyp(this, (byte) 5);
    }

    public wtp(daq daqVar, Activity activity) {
        this.a = (byte) 18;
        this.d = activity;
        this.b = xqu.b(new sjq(daqVar, this, 1));
        this.c = new sjq(daqVar, this, 0);
    }

    public wtp(ucz0 ucz0Var, vcz0 vcz0Var) {
        this.a = (byte) 29;
        this.d = ucz0Var;
        byte b = 8;
        this.b = xqu.b(new jxp(this, 1, b));
        this.c = new jxp(this, 0, b);
    }

    public wtp(e1t0 e1t0Var, f1t0 f1t0Var, q7r0 q7r0Var) {
        this.a = (byte) 6;
        this.d = e1t0Var;
        this.b = q7r0Var;
        this.c = new n1p(this, (byte) 1);
    }

    public wtp(r3o0 r3o0Var, s3o0 s3o0Var) {
        this.a = (byte) 0;
        this.d = r3o0Var;
        this.b = iy81.a(new dlp(this, 1, (byte) 23));
        this.c = iy81.a(new dlp(this, 0, (byte) 23));
    }

    public wtp(e4o0 e4o0Var, f4o0 f4o0Var) {
        this.a = (byte) 1;
        this.d = e4o0Var;
        this.b = iy81.a(new dlp(this, 1, (byte) 24));
        this.c = iy81.a(new dlp(this, 0, (byte) 24));
    }

    public wtp(xtr0 xtr0Var, ytr0 ytr0Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.d = q7r0Var;
        this.c = new dlp(this, 1, (byte) 27);
        this.b = xqu.b(new dlp(this, 0, (byte) 27));
    }

    public wtp(jty0 jty0Var, lyj lyjVar, kty0 kty0Var, q7r0 q7r0Var) {
        this.a = (byte) 28;
        this.d = jty0Var;
        this.c = q7r0Var;
        this.b = xqu.b(new uyp(this, (byte) 19));
    }

    public wtp(obt0 obt0Var, zuj zujVar, pbt0 pbt0Var, q7r0 q7r0Var) {
        this.a = (byte) 7;
        this.d = obt0Var;
        this.b = q7r0Var;
        this.c = new xrp(this, (byte) 25);
    }

    public wtp(dry0 dry0Var, zuj zujVar, ery0 ery0Var, q7r0 q7r0Var) {
        this.a = (byte) 26;
        this.d = dry0Var;
        this.c = q7r0Var;
        this.b = xqu.b(new uyp(this, (byte) 17));
    }

    public wtp(asy0 asy0Var, lyj lyjVar, bsy0 bsy0Var, q7r0 q7r0Var) {
        this.a = (byte) 27;
        this.d = asy0Var;
        this.c = q7r0Var;
        this.b = xqu.b(new uyp(this, (byte) 18));
    }

    public wtp(nwp nwpVar, Flowable flowable, PublishProcessor publishProcessor) {
        this.a = (byte) 2;
        this.c = nwpVar;
        this.d = flowable;
        this.b = publishProcessor;
    }

    public wtp(daq daqVar) {
        this.a = (byte) 10;
        this.d = daqVar;
        this.b = new lkp(daqVar, 0, (byte) 2);
        this.c = new lkp(daqVar, 1, (byte) 2);
    }

    public wtp(daq daqVar, PageActivityProxy pageActivityProxy) {
        this.a = (byte) 14;
        this.c = daqVar;
        this.d = pageActivityProxy;
        this.b = xqu.b(new bup(daqVar, this, (byte) 8));
    }

    public wtp(daq daqVar, SpotOnService spotOnService) {
        this.a = (byte) 17;
        this.d = daqVar;
        byte b = 4;
        this.c = new x0q(daqVar, this, 1, b);
        this.b = xqu.b(iy81.a(new x0q(daqVar, this, 0, b)));
    }
}
