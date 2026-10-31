package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.media3.transformer.ExportException;
import com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class ifb1 implements yg30, Function, akl, k1q0, au9, e9d0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ifb1(a1g1 a1g1Var, dt00 dt00Var) {
        this.a = (byte) 21;
        this.b = a1g1Var;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gl90 gl90Var = (gl90) obj2;
                daq daqVar = ((uzp) obj3).b;
                vzp vzpVar = new vzp(daqVar, (byte) 6);
                ((qop) obj).getClass();
                gl90Var.getClass();
                yrq yrqVar = (yrq) ((jly0) new jnq(vzpVar, gl90Var).a).get();
                vbs vbsVar = (vbs) daqVar.wf.get();
                c8o.l(vbsVar);
                return new hfb1(yrqVar, vbsVar);
            case 1:
                qop qopVar = (qop) obj;
                gl90 gl90Var2 = (gl90) obj2;
                p0q p0qVar = new p0q(((n0q) obj3).b, (byte) 7);
                qopVar.getClass();
                gl90Var2.getClass();
                return new nfb1(qopVar.d(), (zrq) ((jly0) new jmq(p0qVar, qopVar, gl90Var2).b).get());
            case 2:
                jbq jbqVar = (jbq) obj3;
                daq daqVar2 = jbqVar.a;
                teq teqVar = jbqVar.b;
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                boolean z = cgj1.z(daqVar2.a.a.e());
                boolean zF = cgj1.F(daqVar2.a.a.e());
                abm abmVar = (abm) teqVar.Qa.get();
                c8o.l(abmVar);
                jq4 jq4VarG = teqVar.G();
                vbs vbsVar2 = (vbs) daqVar2.wf.get();
                c8o.l(vbsVar2);
                return new ofb1(z, zF, abmVar, jq4VarG, vbsVar2);
            case 3:
            case 4:
            case 5:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case 22:
            default:
                jbq jbqVar2 = (jbq) obj3;
                qop qopVar2 = (qop) obj;
                gl90 gl90Var3 = (gl90) obj2;
                daq daqVar3 = jbqVar2.a;
                teq teqVar2 = jbqVar2.b;
                yzp yzpVar = new yzp(daqVar3, teqVar2);
                qopVar2.getClass();
                gl90Var3.getClass();
                jmq jmqVar = new jmq(yzpVar, qopVar2, gl90Var3);
                yqg yqgVar = (yqg) daqVar3.J1.get();
                c8o.l(yqgVar);
                bpb1 bpb1Var = gl90Var3.e;
                String strD = qopVar2.d();
                jxp jxpVar = (jxp) jmqVar.b;
                iyc0 iyc0Var = (iyc0) teqVar2.g1.get();
                c8o.l(iyc0Var);
                return new x1b(yqgVar, bpb1Var, strD, jxpVar, iyc0Var, gl90Var3.c, (jxp) jmqVar.c);
            case 6:
                k3q k3qVar = (k3q) obj3;
                qop qopVar3 = (qop) obj;
                bct bctVar = (bct) obj2;
                daq daqVar4 = k3qVar.a;
                teq teqVar3 = k3qVar.b;
                l3q l3qVar = new l3q(daqVar4, teqVar3);
                qopVar3.getClass();
                bctVar.getClass();
                lbq lbqVar = new lbq(l3qVar, qopVar3, bctVar);
                Activity activity = (Activity) teqVar3.f.a;
                c8o.l(activity);
                c8c0 c8c0Var = qopVar3.b;
                koc0 koc0Var = bctVar.d;
                esq esqVar = (esq) ((jly0) lbqVar.c).get();
                xfx xfxVar = (xfx) teqVar3.q1.get();
                c8o.l(xfxVar);
                lcb0 lcb0Var = new lcb0(new hjc(xfxVar.b, (byte) 9));
                Scheduler scheduler = (Scheduler) daqVar4.z1.get();
                c8o.l(scheduler);
                e3x e3xVar = (e3x) teqVar3.Bh.get();
                c8o.l(e3xVar);
                luk lukVar = (luk) daqVar4.L1.get();
                c8o.l(lukVar);
                ge4 ge4Var = new ge4(lukVar);
                q8n q8nVar = (q8n) daqVar4.V2.get();
                c8o.l(q8nVar);
                return new gdc1(activity, c8c0Var, koc0Var, esqVar, lcb0Var, scheduler, e3xVar, ge4Var, q8nVar);
            case 7:
                daq daqVar5 = ((q0q) obj3).b;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context = (Context) daqVar5.x1.a;
                c8o.l(context);
                return new uqg(context, (byte) 6);
            case 8:
                a0q a0qVar = new a0q(((y0q) obj3).b);
                ((qop) obj).getClass();
                ((tbt) obj2).getClass();
                return new ka3((gsq) ((jly0) new k2q(a0qVar).c).get());
            case 9:
                ibq ibqVar = new ibq(((b0q) obj3).a);
                ((qop) obj).getClass();
                ((jbt) obj2).getClass();
                return new dqg((hsq) new lbq(ibqVar).c);
            case 10:
                teq teqVar4 = ((g0q) obj3).a;
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                gjc1 gjc1Var = (gjc1) teqVar4.M4.get();
                c8o.l(gjc1Var);
                return new tjc1(gjc1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qop qopVar4 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                lzp lzpVar = new lzp(((h0q) obj3).a);
                qopVar4.getClass();
                bctVar2.getClass();
                return new gsf1(bctVar2.d, (dtq) ((jly0) new jmq(lzpVar, qopVar4, bctVar2).b).get());
            case 23:
                qop qopVar5 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                teq teqVar5 = ((mzp) obj3).a;
                qopVar5.getClass();
                bctVar3.getClass();
                return new rb3(qopVar5.d(), bctVar3.d, teqVar5.i3(), new vf40(), new vnd1((i8h1) teqVar5.d.A5.get(), (byte) 16));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                teq teqVar6 = ((l0q) obj3).a;
                ((qop) obj).getClass();
                ((tbt) obj2).getClass();
                lzn0 lzn0Var = (lzn0) teqVar6.i.get();
                c8o.l(lzn0Var);
                return new apz0(lzn0Var, new vnd1((i8h1) teqVar6.d.A5.get(), (byte) 16));
            case 25:
                k3q k3qVar2 = (k3q) obj3;
                qop qopVar6 = (qop) obj;
                daq daqVar6 = k3qVar2.a;
                teq teqVar7 = k3qVar2.b;
                lhc lhcVar = new lhc((byte) 5);
                qopVar6.getClass();
                ((act) obj2).getClass();
                k2q k2qVar = new k2q(lhcVar, qopVar6);
                String strD2 = qopVar6.d();
                gtt gttVar = (gtt) daqVar6.mn.get();
                c8o.l(gttVar);
                zhe0 zhe0Var = (zhe0) teqVar7.a.h7.get();
                c8o.l(zhe0Var);
                hsq hsqVar = (hsq) k2qVar.c;
                lzn0 lzn0Var2 = (lzn0) teqVar7.i.get();
                c8o.l(lzn0Var2);
                iyc0 iyc0Var2 = (iyc0) teqVar7.g1.get();
                c8o.l(iyc0Var2);
                ifl1 ifl1Var = new ifl1(iyc0Var2, (byte) 21);
                dma1 dma1Var = qopVar6.d;
                yqg yqgVar2 = (yqg) daqVar6.J1.get();
                c8o.l(yqgVar2);
                qes qesVar = new qes(yqgVar2, dma1Var);
                q8n q8nVar2 = (q8n) daqVar6.r2.get();
                c8o.l(q8nVar2);
                q8n q8nVar3 = (q8n) daqVar6.V2.get();
                c8o.l(q8nVar3);
                return new npg1(strD2, gttVar, zhe0Var, hsqVar, lzn0Var2, ifl1Var, qesVar, q8nVar2, q8nVar3);
            case 26:
                qop qopVar7 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                m0q m0qVar = new m0q(((w7q) obj3).a);
                qopVar7.getClass();
                jbtVar.getClass();
                return new d82(qopVar7.d(), jbtVar.d, (hsq) new jmq(m0qVar, qopVar7, jbtVar).c);
            case 27:
                qop qopVar8 = (qop) obj;
                teq teqVar8 = ((wzp) obj3).a;
                qopVar8.getClass();
                ((gl90) obj2).getClass();
                return new bvm(qopVar8.d(), teqVar8.h3());
            case 28:
                l3q l3qVar2 = (l3q) obj3;
                qop qopVar9 = (qop) obj;
                gl90 gl90Var4 = (gl90) obj2;
                daq daqVar7 = l3qVar2.a;
                xzp xzpVar = new xzp(daqVar7, l3qVar2.b);
                qopVar9.getClass();
                gl90Var4.getClass();
                lbq lbqVar2 = new lbq(xzpVar, qopVar9, gl90Var4);
                yqg yqgVar3 = (yqg) daqVar7.J1.get();
                c8o.l(yqgVar3);
                return new ech1(yqgVar3, gl90Var4.e, qopVar9.d(), (hsq) lbqVar2.c);
        }
    }

    public void accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 11:
                ((v280) obj2).c((bfo) obj);
                break;
            default:
                ((ogg1) obj2).b((ExportException) obj);
                break;
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                Context context = ((olm) obj2).g;
                if (((th61) obj).b) {
                    xt5.Companion.getClass();
                    return xt5.e;
                }
                xt5.Companion.getClass();
                return new xt5(context.getString(2131952374), String.format(Locale.ROOT, "%s %s", Arrays.copyOf(new Object[]{context.getString(2131952399), context.getString(2131952400)}, 2)), 1);
            default:
                lve1 lve1Var = (lve1) obj2;
                Observable observable = (Observable) obj;
                return observable.timeout(Observable.timer(lve1Var.a, TimeUnit.MILLISECONDS, lve1Var.c), new t8e1((byte) 4), Observable.merge(observable, Observable.just(lve1Var.b)));
        }
    }

    public float b(float f) {
        return ((ynb1) this.b).k.h() * f;
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                fib1 fib1Var = (fib1) zf30Var;
                gib1 gib1Var = (gib1) ((ynb0) ((uww0) obj).b).get();
                gib1Var.getClass();
                fib1Var.getClass();
                k42 k42Var = new k42(gib1Var, fib1Var);
                fib1Var.G1 = (bkb1) ((jly0) k42Var.l).get();
                fib1Var.H1 = new q881(new t700(xqu.a((ipq) k42Var.s), (byte) 7), (byte) 11);
                fib1Var.I1 = (mir0) ((jly0) k42Var.t).get();
                fib1Var.J1 = (g1f0) ((ipq) k42Var.g).get();
                break;
            case 12:
                SummaryFragment summaryFragment = (SummaryFragment) zf30Var;
                uxc1 uxc1Var = (uxc1) ((ynb0) ((uww0) obj).b).get();
                uxc1Var.getClass();
                summaryFragment.getClass();
                gw70 gw70Var = (gw70) uxc1Var.a.get();
                c8o.l(gw70Var);
                summaryFragment.G1 = gw70Var;
                Scheduler scheduler = (Scheduler) uxc1Var.b.get();
                c8o.l(scheduler);
                summaryFragment.H1 = scheduler;
                luk lukVar = (luk) uxc1Var.c.get();
                c8o.l(lukVar);
                summaryFragment.I1 = new ul4(lukVar);
                en3 en3Var = (en3) uxc1Var.d.get();
                c8o.l(en3Var);
                summaryFragment.J1 = en3Var;
                break;
            case 13:
                l0d1 l0d1Var = (l0d1) zf30Var;
                m0d1 m0d1Var = (m0d1) ((ynb0) ((uww0) obj).b).get();
                m0d1Var.getClass();
                l0d1Var.getClass();
                xfx xfxVar = (xfx) m0d1Var.b.get();
                c8o.l(xfxVar);
                l0d1Var.W1 = xfxVar;
                c8o.l((Scheduler) m0d1Var.a.get());
                mts mtsVar = (mts) m0d1Var.c.get();
                c8o.l(mtsVar);
                l0d1Var.X1 = mtsVar;
                break;
            case 15:
                oyd1 oyd1Var = (oyd1) zf30Var;
                iyd1 iyd1Var = (iyd1) ((ynb0) ((uww0) obj).b).get();
                iyd1Var.getClass();
                oyd1Var.getClass();
                dkh dkhVar = (dkh) iyd1Var.a.get();
                c8o.l(dkhVar);
                oyd1Var.c2 = dkhVar;
                ck20 ck20Var = (ck20) iyd1Var.b.get();
                c8o.l(ck20Var);
                oyd1Var.d2 = ck20Var;
                oyd1Var.e2 = new cyd1(kn5.l);
                i8h1 i8h1Var = (i8h1) iyd1Var.c.get();
                c8o.l(i8h1Var);
                oyd1Var.f2 = new vnd1(i8h1Var, (byte) 1);
                break;
            default:
                nnf1 nnf1Var = (nnf1) zf30Var;
                tmf1 tmf1Var = (tmf1) ((sva) obj).b.get();
                tmf1Var.getClass();
                nnf1Var.getClass();
                ib3 ib3Var = new ib3(tmf1Var, nnf1Var);
                nnf1Var.H1 = (tm30) ((jly0) ib3Var.t).get();
                Scheduler scheduler2 = (Scheduler) tmf1Var.E.get();
                c8o.l(scheduler2);
                kly0 kly0Var = tmf1Var.a;
                o241 o241Var = (o241) kly0Var.get();
                c8o.l(o241Var);
                e5l0 e5l0Var = new e5l0(o241Var, (byte) 7);
                lyw0 lyw0Var = new lyw0((mm30) ((jly0) ib3Var.u).get());
                c8o.l((o241) kly0Var.get());
                nnf1Var.I1 = new sp00(scheduler2, e5l0Var, lyw0Var);
                q1n0 q1n0Var = (q1n0) tmf1Var.R.get();
                c8o.l(q1n0Var);
                nnf1Var.J1 = q1n0Var.a(p8p1.n(((sm30) ((jly0) ib3Var.C).get()).a((String) ((jly0) ib3Var.g).get())));
                i1n0 i1n0Var = (i1n0) tmf1Var.Q.get();
                c8o.l(i1n0Var);
                ctq ctqVar = (ctq) ((jly0) ib3Var.H).get();
                k391 k391Var = z391.X;
                h491 h491VarG = xpn1.G(new e491[]{z391.a, z391.c, z391.h, k391Var, k391Var, k391Var});
                ees eesVarA = i1n0Var.a(nnf1Var, nnf1Var);
                u5b u5bVar = new u5b(ctqVar, (byte) 7);
                a680 a680Var = eesVarA.a;
                a680Var.b = u5bVar;
                a680Var.a = new htf1(h491VarG);
                nnf1Var.K1 = eesVarA;
                nnf1Var.L1 = (mir0) ((jly0) ib3Var.I).get();
                nnf1Var.M1 = (wnh1) ((jly0) ib3Var.c).get();
                sg30 sg30Var = (sg30) tmf1Var.T.get();
                c8o.l(sg30Var);
                nnf1Var.N1 = sg30Var;
                hs71 hs71Var = (hs71) tmf1Var.V.get();
                c8o.l(hs71Var);
                nnf1Var.O1 = hs71Var;
                break;
        }
    }

    public void invoke(Object obj) {
        i690 i690Var = (i690) obj;
        ((kgg1) ((a1g1) this.b).b).r.getClass();
        i690Var.getClass();
        if (i690Var.c.compareAndSet(false, true)) {
            i690Var.a.invoke(0L);
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        pdd1 pdd1Var = (pdd1) this.b;
        ArrayList arrayList = pdd1Var.b;
        esl1 esl1Var = hsl1Var.a;
        nk80 nk80VarB = nk80.b(esl1Var.i(519), esl1Var.i(64));
        nk80 nk80VarB2 = nk80.b(esl1Var.j(519), esl1Var.j(64));
        if (!nk80VarB.equals(pdd1Var.c) || !nk80VarB2.equals(pdd1Var.d)) {
            pdd1Var.c = nk80VarB;
            pdd1Var.d = nk80VarB2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                xey0 xey0Var = (xey0) arrayList.get(size);
                xey0Var.c = nk80VarB;
                xey0Var.d = nk80VarB2;
                xey0Var.c();
            }
        }
        return hsl1Var;
    }

    public /* synthetic */ ifb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
