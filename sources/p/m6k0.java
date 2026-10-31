package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.a;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class m6k0 implements yg30, pqg0, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6k0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public MobiusLoop.Factory a(a aVar) {
        return (MobiusLoop.Factory) ((com.spotify.mobius.functions.Function) this.b).apply(aVar);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 14:
                return new i5e0((Throwable) obj2, (g7o0) obj);
            default:
                cgp0 cgp0Var = (cgp0) obj2;
                nmr0 nmr0Var = (nmr0) obj;
                Throwable th = (Throwable) nmr0Var.a;
                th.getClass();
                Integer num = (Integer) nmr0Var.b;
                num.getClass();
                long jIntValue = num.intValue();
                if (jIntValue == cgp0Var.a) {
                    return Observable.error(th);
                }
                th.getMessage();
                return Observable.timer(((long) cgp0Var.b) * jIntValue, TimeUnit.MILLISECONDS, cgp0Var.c);
        }
    }

    public Object b(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ozp ozpVar = (ozp) obj3;
                pbt pbtVar = (pbt) obj2;
                daq daqVar = ozpVar.a;
                teq teqVar = ozpVar.b;
                ((qop) obj).getClass();
                pbtVar.getClass();
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                koc0 koc0Var = pbtVar.a;
                z6k0 z6k0Var = (z6k0) teqVar.Z5.get();
                c8o.l(z6k0Var);
                mnk0 mnk0Var = (mnk0) teqVar.b6.get();
                c8o.l(mnk0Var);
                return new l6k0(context, koc0Var, z6k0Var, mnk0Var);
            case 1:
                qop qopVar = (qop) obj;
                gl90 gl90Var = (gl90) obj2;
                teq teqVar2 = ((wzp) obj3).a;
                qopVar.getClass();
                gl90Var.getClass();
                String strD = qopVar.d();
                d0r d0rVar = gl90Var.b;
                z6k0 z6k0Var2 = (z6k0) teqVar2.Z5.get();
                c8o.l(z6k0Var2);
                nfq nfqVar = (nfq) teqVar2.a.s6.get();
                c8o.l(nfqVar);
                jbk0 jbk0Var = (jbk0) teqVar2.a6.get();
                c8o.l(jbk0Var);
                return new m7k0(strD, d0rVar, z6k0Var2, nfqVar, jbk0Var);
            case 2:
                qop qopVar2 = (qop) obj;
                gl90 gl90Var2 = (gl90) obj2;
                teq teqVar3 = ((xzp) obj3).a;
                qopVar2.getClass();
                gl90Var2.getClass();
                d0r d0rVar2 = gl90Var2.b;
                String strD2 = qopVar2.d();
                z6k0 z6k0Var3 = (z6k0) teqVar3.Z5.get();
                c8o.l(z6k0Var3);
                v6q v6qVar = (v6q) teqVar3.r8.get();
                c8o.l(v6qVar);
                jbk0 jbk0Var2 = (jbk0) teqVar3.a6.get();
                c8o.l(jbk0Var2);
                return new p7k0(d0rVar2, strD2, z6k0Var3, v6qVar, jbk0Var2);
            case 3:
                kzp kzpVar = (kzp) obj3;
                qop qopVar3 = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar2 = kzpVar.a;
                teq teqVar4 = kzpVar.b;
                qopVar3.getClass();
                actVar.getClass();
                rzq rzqVar = actVar.c;
                c8o.l(rzqVar);
                z6k0 z6k0Var4 = (z6k0) teqVar4.Z5.get();
                c8o.l(z6k0Var4);
                String strD3 = qopVar3.d();
                koc0 koc0Var2 = actVar.f;
                mnk0 mnk0Var2 = (mnk0) teqVar4.b6.get();
                c8o.l(mnk0Var2);
                q8n q8nVar = (q8n) daqVar2.E1.get();
                c8o.l(q8nVar);
                return new fjk0((d0r) rzqVar, z6k0Var4, strD3, koc0Var2, mnk0Var2, q8nVar);
            case 4:
            case 6:
            case 7:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            default:
                pbt pbtVar2 = (pbt) obj2;
                daq daqVar3 = ((q0q) obj3).b;
                ((qop) obj).getClass();
                pbtVar2.getClass();
                Context context2 = (Context) daqVar3.x1.a;
                c8o.l(context2);
                gw70 gw70Var = (gw70) daqVar3.d8.get();
                c8o.l(gw70Var);
                return new wtp0(context2, gw70Var, pbtVar2.a);
            case 5:
                nzp nzpVar = (nzp) obj3;
                qop qopVar4 = (qop) obj;
                bct bctVar = (bct) obj2;
                ozp ozpVar2 = new ozp(nzpVar.a, nzpVar.b);
                qopVar4.getClass();
                bctVar.getClass();
                return new clm0(bctVar.b, qopVar4.d(), bctVar.d, (atp) ((jly0) new g1i(ozpVar2, qopVar4, bctVar).f).get());
            case 8:
                gl90 gl90Var3 = (gl90) obj2;
                y0q y0qVar = new y0q(((q0q) obj3).b, (byte) 4);
                ((qop) obj).getClass();
                gl90Var3.getClass();
                return new t2n0((gtp) ((jly0) new qjp(y0qVar, gl90Var3).a).get());
            case 9:
                qop qopVar5 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                teq teqVar5 = ((q2q) obj3).a;
                qopVar5.getClass();
                bctVar2.getClass();
                jly0 jly0VarA = iy81.a(new fyo((byte) 19));
                String strD4 = qopVar5.d();
                koc0 koc0Var3 = bctVar2.d;
                jtp jtpVar = (jtp) jly0VarA.get();
                lzn0 lzn0Var = (lzn0) teqVar5.i.get();
                c8o.l(lzn0Var);
                return new zg3(strD4, koc0Var3, jtpVar, lzn0Var);
            case 11:
                k3q k3qVar = (k3q) obj3;
                qop qopVar6 = (qop) obj;
                fl90 fl90Var = (fl90) obj2;
                l3q l3qVar = new l3q(k3qVar.a, k3qVar.b);
                qopVar6.getClass();
                fl90Var.getClass();
                return new e9n0(qopVar6.d(), (otp) ((jly0) new qqp(l3qVar, qopVar6, fl90Var).b).get());
            case 12:
                qop qopVar7 = (qop) obj;
                vbt vbtVar = (vbt) obj2;
                teq teqVar6 = ((b0q) obj3).a;
                qopVar7.getClass();
                vbtVar.getClass();
                jly0 jly0VarA2 = iy81.a(new fyo((byte) 20));
                yzc0 yzc0Var = vbtVar.b;
                String strD5 = qopVar7.d();
                e7p0 e7p0Var = (e7p0) teqVar6.W4.get();
                c8o.l(e7p0Var);
                return new q9n0(yzc0Var, strD5, e7p0Var, (jyo) jly0VarA2.get());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                k3q k3qVar2 = (k3q) obj3;
                qop qopVar8 = (qop) obj;
                daq daqVar4 = k3qVar2.a;
                teq teqVar7 = k3qVar2.b;
                qopVar8.getClass();
                ((lbt) obj2).getClass();
                Context context3 = (Context) daqVar4.x1.a;
                c8o.l(context3);
                lik1 lik1VarG = qopVar8.g();
                oj3 oj3Var = (oj3) teqVar7.k1.get();
                c8o.l(oj3Var);
                qut0 qut0Var = (qut0) daqVar4.v7.get();
                c8o.l(qut0Var);
                upp0 upp0Var = (upp0) daqVar4.I9.get();
                c8o.l(upp0Var);
                return new j1b(new res(context3, lik1VarG, oj3Var, qut0Var, upp0Var));
            case 22:
                l3q l3qVar2 = (l3q) obj3;
                qop qopVar9 = (qop) obj;
                bct bctVar3 = (bct) obj2;
                ozp ozpVar3 = new ozp(l3qVar2.a, l3qVar2.b);
                qopVar9.getClass();
                bctVar3.getClass();
                return new fb3(bctVar3.b, bctVar3.d, qopVar9.d(), (xrp) new wtp(ozpVar3, qopVar9, bctVar3).c);
            case 23:
                qop qopVar10 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                t2q t2qVar = new t2q(((izp) obj3).b);
                qopVar10.getClass();
                jbtVar.getClass();
                return new app0(jbtVar.d, qopVar10.d(), (dlp) new k9k(t2qVar, qopVar10, jbtVar).f);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                qop qopVar11 = (qop) obj;
                bct bctVar4 = (bct) obj2;
                daq daqVar5 = ((d1q) obj3).a;
                rzp rzpVar = new rzp(daqVar5, (byte) 3);
                qopVar11.getClass();
                bctVar4.getClass();
                b6p b6pVar = new b6p(rzpVar, qopVar11, bctVar4);
                koc0 koc0Var4 = bctVar4.d;
                lik1 lik1VarG2 = qopVar11.g();
                d0r d0rVar3 = bctVar4.b;
                String strD6 = qopVar11.d();
                ynb0 ynb0VarA = xqu.a((xrp) b6pVar.c);
                q8n q8nVar2 = (q8n) daqVar5.E1.get();
                c8o.l(q8nVar2);
                return new mpp0(koc0Var4, new umf0(lik1VarG2, new fdc(d0rVar3, strD6, koc0Var4, ynb0VarA, q8nVar2)));
            case 25:
                daq daqVar6 = ((uzp) obj3).b;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context4 = (Context) daqVar6.x1.a;
                c8o.l(context4);
                return new uqg(context4, (byte) 4);
            case 26:
                daq daqVar7 = ((vzp) obj3).b;
                ((qop) obj).getClass();
                ((gl90) obj2).getClass();
                luk lukVar = (luk) daqVar7.L1.get();
                c8o.l(lukVar);
                return new l1b(new uq8(new jq4(lukVar), (byte) 2), (byte) 2);
            case 27:
                qop qopVar12 = (qop) obj;
                act actVar2 = (act) obj2;
                p0q p0qVar = new p0q(((n0q) obj3).b, (byte) 2);
                qopVar12.getClass();
                actVar2.getClass();
                d3p d3pVar = new d3p(p0qVar, qopVar12, actVar2);
                rzq rzqVar2 = actVar2.c;
                c8o.l(rzqVar2);
                return new odm(rzqVar2, qopVar12.d(), cto1.q(qopVar12.c()), xqu.a((xrp) d3pVar.b));
        }
    }

    public Object c(Object obj, Object obj2) {
        return z1p1.D((List) ((Collection) obj2), new lqg0(((hwm0) this.b).f, obj));
    }

    public void f(zf30 zf30Var) {
        gp41 gp41Var;
        byte b = this.a;
        t700 t700Var = (t700) this.b;
        switch (b) {
            case 6:
                nlm0 nlm0Var = (nlm0) zf30Var;
                olm0 olm0Var = (olm0) t700Var.b.get();
                olm0Var.getClass();
                nlm0Var.getClass();
                nlm0Var.X1 = (dtp) new z2p(olm0Var).a.get();
                zwz0 zwz0Var = (zwz0) olm0Var.c.get();
                c8o.l(zwz0Var);
                nlm0Var.Y1 = zwz0Var;
                Scheduler scheduler = (Scheduler) olm0Var.a.get();
                c8o.l(scheduler);
                nlm0Var.Z1 = scheduler;
                break;
            case 13:
                epn0 epn0Var = (epn0) zf30Var;
                cpn0 cpn0Var = (cpn0) t700Var.b.get();
                cpn0Var.getClass();
                epn0Var.getClass();
                kg0 kg0Var = (kg0) cpn0Var.b.get();
                c8o.l(kg0Var);
                Bundle bundle = ((zf30) epn0Var).f;
                vjt parcelable = bundle != null ? bundle.getParcelable("ARG_SOURCE") : null;
                int i = parcelable == null ? -1 : fpn0.a[parcelable.ordinal()];
                if (i != 1) {
                    gp41Var = i != 2 ? gp41.X : gp41.t;
                } else {
                    gp41Var = gp41.i;
                }
                ohv0 ohv0Var = (ohv0) cpn0Var.c.get();
                c8o.l(ohv0Var);
                epn0Var.G1 = new gpn0(kg0Var, new npn0(gp41Var, ohv0Var));
                Activity activity = (Activity) cpn0Var.a.a;
                c8o.l(activity);
                ppn0 ppn0Var = (ppn0) cpn0Var.d.get();
                c8o.l(ppn0Var);
                epn0Var.H1 = new rok0(activity, ppn0Var);
                c2r0 c2r0Var = (c2r0) cpn0Var.e.get();
                c8o.l(c2r0Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                epn0Var.I1 = c2r0Var.d(yon1.G1("EXTERNAL_NAVER", "external/naver", 539, "external"), (qir0) null);
                break;
            case 15:
                i9o0 i9o0Var = (i9o0) zf30Var;
                j9o0 j9o0Var = (j9o0) t700Var.b.get();
                j9o0Var.getClass();
                i9o0Var.getClass();
                xxr xxrVar = (xxr) j9o0Var.a.get();
                c8o.l(xxrVar);
                i9o0Var.G1 = xxrVar;
                break;
            case 16:
                fpo0 fpo0Var = (fpo0) zf30Var;
                dpo0 dpo0Var = (dpo0) t700Var.b.get();
                dpo0Var.getClass();
                fpo0Var.getClass();
                ck20 ck20Var = (ck20) dpo0Var.a.get();
                c8o.l(ck20Var);
                fpo0Var.c2 = ck20Var;
                i8h1 i8h1Var = (i8h1) dpo0Var.d.get();
                c8o.l(i8h1Var);
                fpo0Var.d2 = new rok0(i8h1Var);
                lcs lcsVar = (lcs) dpo0Var.b.get();
                c8o.l(lcsVar);
                fpo0Var.e2 = lcsVar;
                qnv0 qnv0Var = (qnv0) dpo0Var.c.get();
                c8o.l(qnv0Var);
                fpo0Var.f2 = qnv0Var;
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                NotificationPermissionFragment notificationPermissionFragment = (NotificationPermissionFragment) zf30Var;
                xro0 xro0Var = (xro0) t700Var.b.get();
                xro0Var.getClass();
                notificationPermissionFragment.getClass();
                caq caqVar = xro0Var.c;
                i8h1 i8h1Var2 = (i8h1) caqVar.get();
                c8o.l(i8h1Var2);
                ts3 ts3Var = ts3.f;
                notificationPermissionFragment.H1 = new rok0(i8h1Var2, new yvk0(ts3Var.a.c, ts3Var.b.a), (byte) 12);
                Activity activity2 = (Activity) xro0Var.a.a;
                c8o.l(activity2);
                dma1 dma1Var = (dma1) xro0Var.b.get();
                c8o.l(dma1Var);
                notificationPermissionFragment.I1 = new uso0(activity2, dma1Var);
                notificationPermissionFragment.J1 = new jpa0((byte) 29, false);
                qnv0 qnv0Var2 = (qnv0) xro0Var.e.get();
                c8o.l(qnv0Var2);
                notificationPermissionFragment.K1 = new bnj0(qnv0Var2);
                notificationPermissionFragment.L1 = new yvk0(ts3Var.a.c, ts3Var.b.a);
                i8h1 i8h1Var3 = (i8h1) caqVar.get();
                c8o.l(i8h1Var3);
                notificationPermissionFragment.M1 = i8h1Var3;
                l6h1 l6h1Var = (l6h1) xro0Var.d.get();
                c8o.l(l6h1Var);
                notificationPermissionFragment.N1 = l6h1Var;
                notificationPermissionFragment.O1 = ((Boolean) xro0Var.f.get()).booleanValue();
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qvo0 qvo0Var = (qvo0) zf30Var;
                rvo0 rvo0Var = (rvo0) t700Var.b.get();
                rvo0Var.getClass();
                qvo0Var.getClass();
                k9k k9kVar = new k9k(rvo0Var, qvo0Var);
                kly0 kly0Var = rvo0Var.f;
                c8o.l((q1n0) kly0Var.get());
                c881 c881Var = (c881) rvo0Var.e.get();
                c8o.l(c881Var);
                q1n0 q1n0Var = (q1n0) kly0Var.get();
                c8o.l(q1n0Var);
                qvo0Var.G1 = q1n0Var.a(bbp1.g(c881Var.a.a().map(ybx0.Y)));
                i1n0 i1n0Var = (i1n0) rvo0Var.g.get();
                c8o.l(i1n0Var);
                ytp ytpVar = (ytp) ((jly0) k9kVar.e).get();
                ztp ztpVar = (ztp) ((jly0) k9kVar.f).get();
                ees eesVarA = i1n0Var.a(qvo0Var, qvo0Var);
                s28 s28Var = s28.i;
                a680 a680Var = eesVarA.a;
                a680Var.a = s28Var;
                a680Var.b = new u5e(ztpVar, ytpVar, (byte) 3);
                qvo0Var.H1 = eesVarA;
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                r3p0 r3p0Var = (r3p0) zf30Var;
                s3p0 s3p0Var = (s3p0) t700Var.b.get();
                s3p0Var.getClass();
                r3p0Var.getClass();
                h72 h72Var = new h72(s3p0Var, r3p0Var);
                mwn0 mwn0Var = (mwn0) s3p0Var.i.get();
                c8o.l(mwn0Var);
                r3p0Var.I1 = mwn0Var;
                kly0 kly0Var2 = s3p0Var.m;
                Flowable flowable = (Flowable) kly0Var2.get();
                c8o.l(flowable);
                o241 o241Var = (o241) s3p0Var.l.get();
                c8o.l(o241Var);
                List list = (List) s3p0Var.o.get();
                c8o.l(list);
                rzo0 rzo0Var = new rzo0(flowable, o241Var, list);
                p4p0 p4p0Var = (p4p0) ((jly0) h72Var.d).get();
                ynb0 ynb0VarA = xqu.a((jly0) h72Var.e);
                Flowable flowable2 = (Flowable) kly0Var2.get();
                c8o.l(flowable2);
                Scheduler scheduler2 = (Scheduler) s3p0Var.q.get();
                c8o.l(scheduler2);
                Scheduler scheduler3 = (Scheduler) s3p0Var.p.get();
                c8o.l(scheduler3);
                kly0 kly0Var3 = s3p0Var.k;
                w4p0 w4p0Var = (w4p0) kly0Var3.get();
                c8o.l(w4p0Var);
                kly0 kly0Var4 = s3p0Var.f;
                luk lukVar = (luk) kly0Var4.get();
                c8o.l(lukVar);
                r24 r24Var = new r24(rzo0Var, p4p0Var, ynb0VarA, flowable2, scheduler2, scheduler3, w4p0Var, new vu4(false, false, false, lukVar));
                xfx xfxVar = (xfx) s3p0Var.e.get();
                c8o.l(xfxVar);
                ewx ewxVar = new ewx(new ogr(xfxVar));
                o2p0 o2p0Var = (o2p0) ((jly0) h72Var.f).get();
                jly0 jly0Var = (jly0) h72Var.g;
                jly0 jly0Var2 = (jly0) h72Var.h;
                jly0 jly0Var3 = (jly0) h72Var.i;
                ror rorVar = (ror) s3p0Var.t.get();
                c8o.l(rorVar);
                w4p0 w4p0Var2 = (w4p0) kly0Var3.get();
                c8o.l(w4p0Var2);
                luk lukVar2 = (luk) kly0Var4.get();
                c8o.l(lukVar2);
                r3p0Var.G1 = new u4p0(r24Var, ewxVar, o2p0Var, jly0Var, jly0Var2, jly0Var3, rorVar, w4p0Var2, new vu4(false, false, false, lukVar2));
                r3p0Var.J1 = (mir0) ((jly0) h72Var.t).get();
                r3p0Var.H1 = (Completable) ((jly0) h72Var.X).get();
                n2p0 n2p0Var = (n2p0) s3p0Var.s.get();
                c8o.l(n2p0Var);
                r3p0Var.K1 = new swm0(n2p0Var, (byte) 9);
                break;
            default:
                gxp0 gxp0Var = (gxp0) zf30Var;
                hxp0 hxp0Var = (hxp0) t700Var.b.get();
                hxp0Var.getClass();
                gxp0Var.getClass();
                prp0 prp0Var = (prp0) hxp0Var.a.get();
                c8o.l(prp0Var);
                gxp0Var.I1 = prp0Var;
                kt91 kt91Var = (kt91) hxp0Var.b.get();
                c8o.l(kt91Var);
                gxp0Var.J1 = kt91Var;
                i8h1 i8h1Var4 = (i8h1) hxp0Var.c.get();
                c8o.l(i8h1Var4);
                gxp0Var.K1 = i8h1Var4;
                break;
        }
    }
}
