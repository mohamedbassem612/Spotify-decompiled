package p;

import android.content.Context;
import com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity;
import com.spotify.collection.contentimpl.played.PlayedStateService;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qqp implements dl4, jmf0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public qqp(daq daqVar, wdm wdmVar, byte b) {
        this.a = b;
        switch (b) {
            case 25:
                this.d = daqVar;
                this.e = new p2q(daqVar, wdmVar, this, 1, (byte) 13);
                byte b2 = 13;
                this.b = new p2q(daqVar, wdmVar, this, 0, b2);
                this.c = new p2q(daqVar, wdmVar, this, 2, b2);
                break;
            default:
                this.d = daqVar;
                this.e = wdmVar;
                byte b3 = 2;
                this.c = new x0q(daqVar, this, 1, b3);
                this.b = xqu.b(new x0q(daqVar, this, 0, b3));
                break;
        }
    }

    public p2o0 a() {
        IPLDialogsHostActivity iPLDialogsHostActivity = (IPLDialogsHostActivity) ((wdm) this.e).b;
        daq daqVar = (daq) this.d;
        return aan0.t(iPLDialogsHostActivity, (d3o0) daqVar.E2.get(), new u210((t2j0) daqVar.f2.get()), (Scheduler) daqVar.z1.get());
    }

    public ytp0 b() {
        iac0 iac0VarC = ((qop) this.d).c();
        a3u0 a3u0Var = (a3u0) ((l3q) this.e).b.Cc.get();
        c8o.l(a3u0Var);
        return a3u0Var.a(iac0VarC);
    }

    public xmu0 c() {
        i8h1 i8h1Var = (i8h1) ((ypu0) this.e).f.get();
        c8o.l(i8h1Var);
        return new xmu0(i8h1Var, new tdl0((byte) 20), (byte) 1);
    }

    public qhm element() {
        v5q v5qVar = (v5q) this.c;
        pjf0 pjf0Var = (pjf0) v5qVar.xa.get();
        daq daqVar = (daq) this.b;
        eof0 eof0Var = (eof0) daqVar.to.get();
        vgb vgbVar = new vgb(v5qVar.xa);
        q8q q8qVar = (q8q) daqVar.mo.get();
        Flowable flowable = (Flowable) this.d;
        Flowable flowableX = zgf0.x(flowable, (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get());
        Flowable flowableW = zgf0.w((Flowable) daqVar.D5.get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get());
        FlowableOnBackpressureLatest flowableOnBackpressureLatest = new FlowableOnBackpressureLatest((PublishProcessor) this.e);
        if (((oqa1) daqVar.no.get()).h) {
            flowableX = flowableW;
        }
        return new qhm(pjf0Var, vgbVar, eof0Var, q8qVar.a(flowableX, flowableOnBackpressureLatest), new z6c((lzn0) v5qVar.U0.get()), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), (zwz0) daqVar.U1.get(), flowable, (sqs0) daqVar.uo.get(), (lnf0) daqVar.po.get(), ((cr4) v5qVar.W8.get()).b(), v5qVar.b.g().i(), (xpw) null);
    }

    public void w(Object obj) {
        t5g t5gVar;
        arg0 arg0Var;
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 13:
                AgeAssuranceWebViewActivity ageAssuranceWebViewActivity = (AgeAssuranceWebViewActivity) obj;
                daq daqVar = (daq) obj3;
                ((t3b1) ageAssuranceWebViewActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) ageAssuranceWebViewActivity).c1 = new tuk(xqu.a((jxp) obj5));
                ageAssuranceWebViewActivity.i1 = (yqg) daqVar.J1.get();
                ageAssuranceWebViewActivity.g1 = (g7h1) daqVar.vg.get();
                ageAssuranceWebViewActivity.f1 = (z710) ((jxp) obj4).get();
                ageAssuranceWebViewActivity.l1 = (q8n) daqVar.E1.get();
                ageAssuranceWebViewActivity.h1 = (g341) daqVar.Fh.get();
                ageAssuranceWebViewActivity.j1 = (g8h1) daqVar.im.get();
                ageAssuranceWebViewActivity.k1 = (i8h1) daqVar.A5.get();
                break;
            case 14:
                ChoiceScreenUcActivity choiceScreenUcActivity = (ChoiceScreenUcActivity) obj;
                daq daqVar2 = (daq) obj3;
                ((mzo) choiceScreenUcActivity).a1 = (jgu) daqVar2.a.g0.get();
                bih1 bih1VarC = svf.C((z5p) daqVar2.dk.get());
                ChoiceScreenUcActivity choiceScreenUcActivity2 = (ChoiceScreenUcActivity) obj2;
                bma1 bma1Var = u5g.a;
                v5g v5gVar = (v5g) choiceScreenUcActivity2.q1.getValue();
                c8o.m(v5gVar);
                zxf zxfVar = v5gVar.a;
                c8o.m(zxfVar);
                choiceScreenUcActivity.k1 = bih1VarC.e(zxfVar, choiceScreenUcActivity2);
                choiceScreenUcActivity.c1 = (nww0) daqVar2.Jn.get();
                choiceScreenUcActivity.j1 = svf.o();
                choiceScreenUcActivity.e1 = daqVar2.g0();
                choiceScreenUcActivity.b1 = (gw70) daqVar2.d8.get();
                choiceScreenUcActivity.g1 = new u8g((Context) daqVar2.x1.a);
                choiceScreenUcActivity.d1 = daqVar2.S1();
                choiceScreenUcActivity.h1 = (b2r0) ((jly0) obj5).get();
                choiceScreenUcActivity.i1 = (gik1) ((jly0) obj4).get();
                usa usaVar = (usa) daqVar2.Yj.get();
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar2.Y3.get();
                dma1 dma1Var = (dma1) daqVar2.C5.get();
                try {
                    t5gVar = (t5g) t5g.d.get(dma1Var.l(u5g.a, 0));
                } catch (Throwable unused) {
                    t5gVar = t5g.b;
                }
                t6g t6gVar = (t6g) t5gVar.a.invoke(retrofitMaker, dma1Var);
                c8o.m(t6gVar);
                vhc vhcVar = new vhc((byte) 1);
                bma1 bma1Var2 = u5g.a;
                v5g v5gVar2 = (v5g) choiceScreenUcActivity2.q1.getValue();
                c8o.m(v5gVar2);
                vx40 vx40VarF0 = daqVar2.f0();
                hr0 hr0Var = new hr0((t2j0) daqVar2.f2.get());
                b6y b6yVar = new b6y((t2j0) daqVar2.f2.get());
                String string = ((j0u) daqVar2.lh.get()).a.toString();
                c8o.m(string);
                choiceScreenUcActivity.f1 = new n9g(new s6g(usaVar, t6gVar, vhcVar, v5gVar2, vx40VarF0, hr0Var, b6yVar, string), (Scheduler) daqVar2.r3.get(), (Scheduler) daqVar2.z1.get());
                break;
            case 15:
                GoogleCheckoutActivity googleCheckoutActivity = (GoogleCheckoutActivity) obj;
                daq daqVar3 = (daq) obj3;
                ((mzo) googleCheckoutActivity).a1 = (jgu) daqVar3.a.g0.get();
                GoogleCheckoutActivity googleCheckoutActivity2 = (GoogleCheckoutActivity) obj2;
                i050 i050Var = (i050) googleCheckoutActivity2.f1.getValue();
                c8o.m(i050Var);
                googleCheckoutActivity.b1 = new l150(i050Var, new c0c(googleCheckoutActivity2, (byte) 4), new r050(googleCheckoutActivity2, (usa) daqVar3.Yj.get(), daqVar3.g0(), new b6y((t2j0) daqVar3.f2.get()), daqVar3.f0()), (Scheduler) daqVar3.r3.get());
                googleCheckoutActivity.e1 = daqVar3.S1();
                googleCheckoutActivity.c1 = (b2r0) ((jly0) obj5).get();
                googleCheckoutActivity.d1 = (gik1) ((jly0) obj4).get();
                break;
            case 16:
            default:
                j1f1 j1f1Var = (j1f1) obj;
                daq daqVar4 = (daq) obj2;
                j1f1Var.a2 = (ohv0) daqVar4.U5.get();
                e3q e3qVar = (e3q) obj3;
                j1f1Var.W1 = (bvw) e3qVar.K1.get();
                j1f1Var.V1 = (lde0) e3qVar.h1.get();
                j1f1Var.Z1 = (mwn0) daqVar4.Wd.get();
                j1f1Var.Y1 = (xdl0) ((jly0) obj5).get();
                j1f1Var.X1 = (qhe0) ((jly0) obj4).get();
                break;
            case 17:
                bvg0 bvg0Var = (bvg0) obj;
                ((nzo) bvg0Var).V1 = (jgu) ((s7q) obj4).i.get();
                daq daqVar5 = (daq) obj3;
                bvg0Var.Y1 = daqVar5.u1();
                bvg0Var.W1 = (f3q) ((jly0) obj5).get();
                bvg0Var.X1 = (kt91) daqVar5.f8.get();
                break;
            case 18:
                bvg0 bvg0Var2 = (bvg0) obj;
                ((nzo) bvg0Var2).V1 = (jgu) ((s2q) ((uw0) obj4).i).get();
                daq daqVar6 = (daq) obj3;
                bvg0Var2.Y1 = daqVar6.u1();
                bvg0Var2.W1 = (f3q) ((jly0) obj5).get();
                bvg0Var2.X1 = (kt91) daqVar6.f8.get();
                break;
            case 19:
                hx81 hx81Var = (hx81) obj;
                wdm wdmVar = (wdm) obj3;
                ((hip) hx81Var).F1 = (jgu) ((s2q) wdmVar.f).get();
                hx81Var.I1 = a();
                hx81Var.K1 = (t1o0) ((jly0) obj5).get();
                hx81Var.J1 = (th30) ((s2q) wdmVar.Z).get();
                break;
            case 20:
                ParentalConsentWebActivity parentalConsentWebActivity = (ParentalConsentWebActivity) obj;
                daq daqVar7 = (daq) obj3;
                ((t3b1) parentalConsentWebActivity).b1 = (jgu) daqVar7.a.g0.get();
                ((t3b1) parentalConsentWebActivity).c1 = new tuk(xqu.a((jxp) obj5));
                parentalConsentWebActivity.g1 = (g7h1) daqVar7.vg.get();
                parentalConsentWebActivity.f1 = (z710) ((jxp) obj4).get();
                break;
            case 21:
                PlayedStateService playedStateService = (PlayedStateService) obj;
                s2q s2qVar = (s2q) obj3;
                s2q s2qVar2 = (s2q) obj5;
                s2q s2qVar3 = (s2q) obj4;
                int iOrdinal = new k94(j94.b, (luk) ((daq) obj2).L1.get()).a().ordinal();
                if (iOrdinal == 0) {
                    arg0Var = (arg0) s2qVar.get();
                } else if (iOrdinal == 1) {
                    arg0Var = (arg0) s2qVar2.get();
                } else if (iOrdinal != 2) {
                    eg.o();
                } else {
                    arg0Var = (arg0) s2qVar3.get();
                }
                playedStateService.a = arg0Var;
                break;
            case 22:
                u0a1 u0a1Var = (u0a1) obj;
                daq daqVar8 = (daq) obj2;
                bfa0 bfa0Var = new bfa0((gw70) daqVar8.d8.get());
                u0a1Var.c2 = new dn81(j380.m(bfa0.class, bfa0Var, uc71.class, new uc71()), (byte) 5);
                u0a1Var.b2 = (Scheduler) daqVar8.z1.get();
                break;
            case 23:
                u0a1 u0a1Var2 = (u0a1) obj;
                daq daqVar9 = (daq) obj2;
                bfa0 bfa0Var2 = new bfa0((gw70) daqVar9.d8.get());
                u0a1Var2.c2 = new dn81(j380.m(bfa0.class, bfa0Var2, uc71.class, new uc71()), (byte) 5);
                u0a1Var2.b2 = (Scheduler) daqVar9.z1.get();
                break;
            case 24:
                u0a1 u0a1Var3 = (u0a1) obj;
                daq daqVar10 = (daq) obj2;
                bfa0 bfa0Var3 = new bfa0((gw70) daqVar10.d8.get());
                u0a1Var3.c2 = new dn81(j380.m(bfa0.class, bfa0Var3, uc71.class, new uc71()), (byte) 5);
                u0a1Var3.b2 = (Scheduler) daqVar10.z1.get();
                break;
            case 25:
                u0a1 u0a1Var4 = (u0a1) obj;
                daq daqVar11 = (daq) obj2;
                bfa0 bfa0Var4 = new bfa0((gw70) daqVar11.d8.get());
                u0a1Var4.c2 = new dn81(j380.m(bfa0.class, bfa0Var4, uc71.class, new uc71()), (byte) 5);
                u0a1Var4.b2 = (Scheduler) daqVar11.z1.get();
                break;
        }
    }

    public qqp(r0s0 r0s0Var) {
        byte b = 8;
        this.a = (byte) 8;
        this.d = r0s0Var;
        this.e = new ywp(this, 0, b);
        this.b = new ywp(this, 1, b);
        this.c = new ywp(this, 2, b);
    }

    public qqp(sjq0 sjq0Var) {
        this.a = (byte) 10;
        this.d = sjq0Var;
        byte b = 12;
        this.e = new ywp(this, 1, b);
        this.b = new ywp(this, 2, b);
        this.c = new ywp(this, 0, b);
    }

    public qqp(l3q l3qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 27;
        this.d = jbtVar;
        this.e = qopVar;
        this.b = l3qVar;
        this.c = new uyp(this, (byte) 6);
    }

    public qqp(nzp nzpVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 2;
        this.d = qopVar;
        this.e = nzpVar;
        this.b = jbtVar;
        this.c = new xrp(this, (byte) 4);
    }

    public qqp(z0q z0qVar, tbt tbtVar) {
        this.a = (byte) 29;
        this.d = z0qVar;
        this.e = tbtVar;
        byte b = 10;
        this.b = iy81.a(new jxp(this, 1, b));
        this.c = iy81.a(new jxp(this, 0, b));
    }

    public qqp(k3q k3qVar, qop qopVar, jbt jbtVar) {
        this.a = (byte) 28;
        this.d = jbtVar;
        this.e = qopVar;
        this.b = k3qVar;
        this.c = new uyp(this, (byte) 9);
    }

    public qqp(l3q l3qVar, qop qopVar, fl90 fl90Var) {
        this.a = (byte) 4;
        this.d = qopVar;
        this.e = l3qVar;
        this.c = fl90Var;
        this.b = iy81.a(new xrp(this, (byte) 11));
    }

    public qqp(rgv0 rgv0Var, q7r0 q7r0Var) {
        this.a = (byte) 12;
        this.e = rgv0Var;
        this.d = q7r0Var;
        byte b = 1;
        this.b = xqu.b(new jxp(this, 0, b));
        this.c = new jxp(this, b, b);
    }

    public qqp(enp0 enp0Var, pp20 pp20Var) {
        this.a = (byte) 5;
        this.d = enp0Var;
        byte b = 28;
        this.b = iy81.a(new bsp(this, 1, b));
        this.c = iy81.a(new bsp(this, 0, b));
        this.e = iy81.a(new bsp(this, 2, b));
    }

    public qqp(xts0 xts0Var, wts0 wts0Var) {
        this.a = (byte) 7;
        this.d = xts0Var;
        this.e = wts0Var;
        byte b = 0;
        this.b = xqu.b(new jxp(this, 1, b));
        this.c = xqu.b(new jxp(this, b, b));
    }

    public qqp(bsq0 bsq0Var, psq0 psq0Var) {
        this.a = (byte) 6;
        this.d = bsq0Var;
        this.e = psq0Var;
        this.b = iy81.a(new dlp(this, 0, (byte) 26));
        this.c = xqu.b(new dlp(this, 1, (byte) 26));
    }

    public qqp(r0s0 r0s0Var, byte b) {
        this.a = (byte) 9;
        this.d = r0s0Var;
        byte b2 = 10;
        this.e = new ywp(this, 0, b2);
        this.b = new ywp(this, 2, b2);
        this.c = new ywp(this, 1, b2);
    }

    public qqp(a1q a1qVar) {
        this.a = (byte) 1;
        this.d = a1qVar;
        byte b = 4;
        this.b = xqu.b(new bsp(this, 1, b));
        this.c = xqu.b(new bsp(this, 0, b));
        this.e = xqu.b(new bsp(this, 2, b));
    }

    public qqp(k9k0 k9k0Var, ryj ryjVar, l9k0 l9k0Var) {
        this.a = (byte) 3;
        this.d = k9k0Var;
        byte b = 10;
        this.e = new bsp(this, 0, b);
        this.b = iy81.a(new bsp(this, 1, b));
        this.c = new bsp(this, 2, b);
    }

    public qqp(wvf0 wvf0Var, yvf0 yvf0Var, q7r0 q7r0Var) {
        this.a = (byte) 0;
        this.d = q7r0Var;
        this.e = new blp(this, 1, (byte) 20);
        this.b = xqu.b(new blp(this, 2, (byte) 20));
        this.c = xqu.b(new blp(this, 0, (byte) 20));
    }

    public qqp(ypu0 ypu0Var, fqu0 fqu0Var, q7r0 q7r0Var) {
        this.a = (byte) 11;
        this.e = ypu0Var;
        this.b = fqu0Var;
        this.d = q7r0Var;
        this.c = new xrp(this, (byte) 28);
    }

    public qqp(daq daqVar, AgeAssuranceWebViewActivity ageAssuranceWebViewActivity) {
        this.a = (byte) 13;
        this.e = daqVar;
        this.d = ageAssuranceWebViewActivity;
        byte b = 3;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public qqp(daq daqVar, ParentalConsentWebActivity parentalConsentWebActivity) {
        this.a = (byte) 20;
        this.e = daqVar;
        this.d = parentalConsentWebActivity;
        byte b = 4;
        this.b = new jxp(this, 0, b);
        this.c = new jxp(this, 1, b);
    }

    public qqp(daq daqVar, e3q e3qVar) {
        this.a = (byte) 26;
        this.d = daqVar;
        this.e = e3qVar;
        byte b = 5;
        this.b = xqu.b(new jxp(daqVar, 0, b));
        this.c = xqu.b(new jxp(daqVar, 1, b));
    }

    public qqp(daq daqVar, ChoiceScreenUcActivity choiceScreenUcActivity) {
        this.a = (byte) 14;
        this.e = daqVar;
        this.d = choiceScreenUcActivity;
        byte b = 0;
        this.b = xqu.b(new x0q(daqVar, this, b, b));
        this.c = xqu.b(new x0q(daqVar, this, 1, b));
    }

    public qqp(daq daqVar, GoogleCheckoutActivity googleCheckoutActivity) {
        this.a = (byte) 15;
        this.e = daqVar;
        this.d = googleCheckoutActivity;
        byte b = 1;
        this.b = xqu.b(new x0q(daqVar, this, 0, b));
        this.c = xqu.b(new x0q(daqVar, this, b, b));
    }

    public qqp(daq daqVar, s7q s7qVar, bvg0 bvg0Var) {
        this.a = (byte) 17;
        this.e = daqVar;
        this.c = s7qVar;
        this.d = bvg0Var;
        this.b = iy81.a(new bup(s7qVar, this, (byte) 4));
    }

    public qqp(daq daqVar, uw0 uw0Var, bvg0 bvg0Var) {
        this.a = (byte) 18;
        this.e = daqVar;
        this.c = uw0Var;
        this.d = bvg0Var;
        this.b = iy81.a(new bup(uw0Var, this, (byte) 5));
    }

    public qqp(daq daqVar) {
        this.a = (byte) 21;
        this.d = daqVar;
        byte b = 25;
        this.e = new s2q(daqVar, this, 0, b);
        this.b = new s2q(daqVar, this, 1, b);
        this.c = new s2q(daqVar, this, 2, b);
    }

    public qqp(daq daqVar, em0 em0Var) {
        this.a = (byte) 22;
        this.d = daqVar;
        this.e = new p2q(daqVar, em0Var, this, 1, (byte) 10);
        byte b = 10;
        this.b = new p2q(daqVar, em0Var, this, 0, b);
        this.c = new p2q(daqVar, em0Var, this, 2, b);
    }

    public qqp(daq daqVar, v5q v5qVar) {
        this.a = (byte) 23;
        this.d = daqVar;
        this.e = new p2q(daqVar, v5qVar, this, 1, (byte) 11);
        byte b = 11;
        this.b = new p2q(daqVar, v5qVar, this, 0, b);
        this.c = new p2q(daqVar, v5qVar, this, 2, b);
    }

    public qqp(daq daqVar, v5q v5qVar, Flowable flowable, PublishProcessor publishProcessor) {
        this.a = (byte) 16;
        this.b = daqVar;
        this.c = v5qVar;
        this.d = flowable;
        this.e = publishProcessor;
    }

    public qqp(daq daqVar, teq teqVar) {
        this.a = (byte) 24;
        this.d = daqVar;
        this.e = new p2q(daqVar, teqVar, this, 1, (byte) 12);
        byte b = 12;
        this.b = new p2q(daqVar, teqVar, this, 0, b);
        this.c = new p2q(daqVar, teqVar, this, 2, b);
    }
}
