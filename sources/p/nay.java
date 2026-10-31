package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.blend.tastematch.GroupBlendTasteMatchFragment;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class nay implements Function, yg30, e9d0, h8q0, uua, oi30, se21, k2r, ypb0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nay(yjq yjqVar, zfg1 zfg1Var) {
        this.a = (byte) 14;
        this.b = yjqVar;
    }

    public Object a(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                ozp ozpVar = (ozp) obj3;
                qop qopVar = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                kzp kzpVar = new kzp(ozpVar.a, ozpVar.b);
                qopVar.getClass();
                lbtVar.getClass();
                return new zwr(lbtVar.b, qopVar.d(), (bzo) ((jly0) new t7p(kzpVar, qopVar, lbtVar).a).get());
            case 2:
                nzp nzpVar = (nzp) obj3;
                qop qopVar2 = (qop) obj;
                fl90 fl90Var = (fl90) obj2;
                daq daqVar = nzpVar.a;
                teq teqVar = nzpVar.b;
                ozp ozpVar2 = new ozp(daqVar, teqVar);
                qopVar2.getClass();
                fl90Var.getClass();
                t7p t7pVar = new t7p(ozpVar2, qopVar2, fl90Var);
                d0r d0rVar = fl90Var.b;
                yzc0 yzc0Var = fl90Var.a;
                String strD = qopVar2.d();
                yiq yiqVar = teqVar.b;
                ogr ogrVarV = g7y.v((udp) yiqVar.Kb.get());
                d511 d511VarH3 = teqVar.h3();
                i5y0 i5y0Var = (i5y0) teqVar.pb.get();
                c8o.l(i5y0Var);
                pux0 pux0Var = new pux0(d511VarH3, i5y0Var, (byte) 26);
                oum oumVar = (oum) daqVar.Eq.get();
                c8o.l(oumVar);
                eb8 eb8Var = new eb8(oumVar, (v1p) ((jly0) t7pVar.a).get(), (byte) 2);
                String strD2 = qopVar2.d();
                d2f1 d2f1VarP3 = teqVar.P3();
                me30 me30Var = (me30) daqVar.w7.get();
                c8o.l(me30Var);
                tu11 tu11Var = new tu11(d0rVar, strD2, d2f1VarP3, me30Var);
                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                c8o.l(lzn0Var);
                String strD3 = qopVar2.d();
                uu00 uu00Var = (uu00) daqVar.a5.get();
                c8o.l(uu00Var);
                vgm vgmVar = (vgm) yiqVar.E.get();
                c8o.l(vgmVar);
                return new kvy(d0rVar, yzc0Var, strD, ogrVarV, pux0Var, eb8Var, tu11Var, new gvy(d0rVar, lzn0Var, strD3, uu00Var, vgmVar, t7pVar.c(), yzc0Var, teqVar.B2(), new a5m(), teqVar.Y0()), new ejb((byte) 9), t7pVar.c());
            case 3:
                daq daqVar2 = ((t2q) obj3).a;
                ((qop) obj).getClass();
                ((gzu0) obj2).getClass();
                boolean z = cgj1.z(daqVar2.a.a.e());
                luk lukVar = (luk) daqVar2.L1.get();
                c8o.l(lukVar);
                mp4 mp4Var = new mp4(false, lukVar);
                vbs vbsVar = (vbs) daqVar2.wf.get();
                c8o.l(vbsVar);
                return new s4z(z, mp4Var, vbsVar);
            case 4:
                kzp kzpVar2 = (kzp) obj3;
                qop qopVar3 = (qop) obj;
                fl90 fl90Var2 = (fl90) obj2;
                daq daqVar3 = kzpVar2.a;
                teq teqVar2 = kzpVar2.b;
                nzp nzpVar2 = new nzp(daqVar3, teqVar2);
                qopVar3.getClass();
                fl90Var2.getClass();
                c21 c21Var = new c21(nzpVar2, qopVar3, fl90Var2);
                d0r d0rVar2 = fl90Var2.b;
                lik1 lik1VarG = qopVar3.g();
                yzc0 yzc0Var2 = fl90Var2.a;
                String strD4 = qopVar3.d();
                yqg yqgVar = (yqg) daqVar3.J1.get();
                c8o.l(yqgVar);
                gw70 gw70Var = (gw70) daqVar3.d8.get();
                c8o.l(gw70Var);
                f6g1 f6g1Var = (f6g1) teqVar2.I8.get();
                c8o.l(f6g1Var);
                zs11 zs11Var = new zs11(yqgVar, gw70Var, f6g1Var);
                s1p s1pVar = (s1p) ((jly0) c21Var.e).get();
                t1p t1pVar = (t1p) ((jly0) c21Var.f).get();
                d2q d2qVar = (d2q) teqVar2.b.I.get();
                c8o.l(d2qVar);
                zwp zwpVar = (zwp) teqVar2.qf.get();
                c8o.l(zwpVar);
                yzu yzuVar = new yzu(s1pVar, t1pVar, d2qVar, zwpVar);
                yqg yqgVar2 = (yqg) daqVar3.J1.get();
                c8o.l(yqgVar2);
                n39 n39Var = new n39(yqgVar2);
                pep pepVar = (pep) ((jly0) c21Var.g).get();
                oum oumVar2 = (oum) daqVar3.Eq.get();
                c8o.l(oumVar2);
                yzu yzuVar2 = new yzu(zs11Var, yzuVar, n39Var, pepVar, new eb8(oumVar2, (v1p) ((jly0) c21Var.i).get(), (byte) 1));
                d511 d511VarH4 = teqVar2.h3();
                i5y0 i5y0Var2 = (i5y0) teqVar2.pb.get();
                c8o.l(i5y0Var2);
                hyy0 hyy0Var = new hyy0(d511VarH4, i5y0Var2, (byte) 21);
                f1n0 f1n0Var = (f1n0) teqVar2.T2.get();
                c8o.l(f1n0Var);
                luk lukVarD = nzpVar2.d();
                c8o.l(lukVarD);
                nm1 nm1Var = new nm1(d0rVar2, f1n0Var, new jq4(lukVarD));
                String strD5 = qopVar3.d();
                d2f1 d2f1VarP4 = teqVar2.P3();
                me30 me30Var2 = (me30) daqVar3.w7.get();
                c8o.l(me30Var2);
                tu11 tu11Var2 = new tu11(d0rVar2, strD5, d2f1VarP4, me30Var2);
                qep qepVar = (qep) ((jly0) c21Var.t).get();
                me30 me30Var3 = (me30) daqVar3.w7.get();
                c8o.l(me30Var3);
                hbq hbqVar = daqVar3.a;
                boolean z2 = cgj1.z(hbqVar.a.e());
                boolean zF = cgj1.F(hbqVar.a.e());
                otu otuVar = new otu(new c9c((byte) 9), c21Var.a(), (byte) 24);
                String strD6 = qopVar3.d();
                c8c0 c8c0Var = qopVar3.b;
                mp8 mp8VarR0 = teqVar2.r0();
                xi90 xi90Var = fl90Var2.e;
                c8o.l(xi90Var);
                o860 o860Var = new o860(strD6, c8c0Var, mp8VarR0, xi90Var, (byte) 14);
                luk lukVarD2 = nzpVar2.d();
                c8o.l(lukVarD2);
                new kq4(false, lukVarD2);
                i5y0 i5y0Var3 = (i5y0) teqVar2.pb.get();
                c8o.l(i5y0Var3);
                return new d9z(d0rVar2, lik1VarG, yzc0Var2, strD4, yzuVar2, hyy0Var, nm1Var, tu11Var2, qepVar, me30Var3, z2, zF, otuVar, o860Var, i5y0Var3, c21Var.a());
            case 11:
                ozp ozpVar3 = (ozp) obj3;
                qop qopVar4 = (qop) obj;
                bct bctVar = (bct) obj2;
                daq daqVar4 = ozpVar3.a;
                teq teqVar3 = ozpVar3.b;
                k0q k0qVar = new k0q(daqVar4, teqVar3);
                qopVar4.getClass();
                bctVar.getClass();
                c21 c21Var2 = new c21(k0qVar, qopVar4, bctVar);
                c8c0 c8c0Var2 = qopVar4.b;
                koc0 koc0Var = bctVar.d;
                xgp xgpVar = (xgp) ((jly0) c21Var2.i).get();
                Context context = (Context) daqVar4.x1.a;
                c8o.l(context);
                String strD7 = qopVar4.d();
                xvo xvoVar = (xvo) daqVar4.H8.get();
                c8o.l(xvoVar);
                pch1 pch1Var = (pch1) teqVar3.m8.get();
                c8o.l(pch1Var);
                dlg1 dlg1Var = pch1Var.b;
                vxe1 vxe1Var = (vxe1) teqVar3.n8.get();
                c8o.l(vxe1Var);
                chp chpVar = (chp) c21Var2.t;
                pch1 pch1Var2 = (pch1) teqVar3.m8.get();
                c8o.l(pch1Var2);
                return new vy00(c8c0Var2, koc0Var, bctVar, xgpVar, new buc1(context, strD7, xvoVar, dlg1Var, vxe1Var, chpVar, pch1Var2.d));
            default:
                ozp ozpVar4 = (ozp) obj3;
                qop qopVar5 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar5 = ozpVar4.a;
                teq teqVar4 = ozpVar4.b;
                kzp kzpVar3 = new kzp(daqVar5, teqVar4);
                qopVar5.getClass();
                jbtVar.getClass();
                x2p x2pVar = new x2p(kzpVar3, qopVar5, jbtVar);
                koc0 koc0Var2 = jbtVar.d;
                String strD8 = qopVar5.d();
                wmu0 wmu0Var = (wmu0) teqVar4.y6.get();
                c8o.l(wmu0Var);
                return new ih60(koc0Var2, strD8, wmu0Var, x2pVar.b);
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ObservableSource observableSource = (Observable) obj;
                dj20.l();
                return Observable.ambArray(new ObservableSource[]{observableSource, Observable.concatArrayEager(new ObservableSource[]{Observable.just(h5e0.a).delay(10L, TimeUnit.MILLISECONDS, ((oay) obj2).b), observableSource})});
            case 12:
                return ((y610) obj2).m;
            default:
                sm30 sm30Var = (sm30) obj2;
                Uri uri = (Uri) obj;
                String lastPathSegment = uri.getLastPathSegment();
                HashMap map = new HashMap();
                for (String str : uri.getQueryParameterNames()) {
                    map.put(str, uri.getQueryParameter(str));
                }
                return sm30Var.d.a(lastPathSegment, map).toObservable().compose(sm30Var.e).cast(re70.class);
        }
    }

    public long b(long j) {
        xn20 xn20Var = (xn20) this.b;
        return zoi1.k((j * ((long) xn20Var.e)) / 1000000, 0L, xn20Var.j - 1);
    }

    public Object create() {
        return z470.c((Class) this.b);
    }

    public void e(long j, izr0 izr0Var) {
        ijo1.q(j, izr0Var, ((pj30) this.b).J);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ErrorFragment errorFragment = (ErrorFragment) zf30Var;
                khz khzVar = (khz) ((h21) obj).b.get();
                khzVar.getClass();
                errorFragment.getClass();
                i8h1 i8h1Var = (i8h1) khzVar.b.get();
                c8o.l(i8h1Var);
                edr0 edr0Var = (edr0) khzVar.a.get();
                c8o.l(edr0Var);
                errorFragment.H1 = new j3h1(i8h1Var, edr0Var);
                en3 en3Var = (en3) khzVar.c.get();
                c8o.l(en3Var);
                errorFragment.I1 = en3Var;
                break;
            case 6:
                s700 s700Var = (s700) zf30Var;
                r700 r700Var = (r700) ((t700) obj).b.get();
                r700Var.getClass();
                s700Var.getClass();
                d3p d3pVar = new d3p(r700Var);
                s700Var.W1 = new ypa((byte) 10, false);
                xfx xfxVar = (xfx) r700Var.a.get();
                c8o.l(xfxVar);
                qmr qmrVar = new qmr(xfxVar, (byte) 29);
                xep xepVar = (xep) d3pVar.b;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                s700Var.X1 = new otu(qmrVar, new mvb(new cfd(xepVar, new rxk0(yon1.N0().c, "spotify:concerts"), (byte) 27)), (byte) 27);
                break;
            case 13:
                pf10 pf10Var = (pf10) zf30Var;
                nf10 nf10Var = (nf10) ((t700) obj).b.get();
                nf10Var.getClass();
                pf10Var.getClass();
                x2p x2pVar = new x2p(nf10Var, pf10Var);
                pf10Var.G1 = (sf10) x2pVar.b.get();
                x2pVar.k();
                gp41 gp41VarK = x2pVar.k();
                ohv0 ohv0Var = (ohv0) nf10Var.c.get();
                c8o.l(ohv0Var);
                pf10Var.H1 = new kp00(gp41VarK, ohv0Var, (byte) 8);
                xf10 xf10Var = (xf10) nf10Var.a.get();
                c8o.l(xf10Var);
                pf10Var.I1 = new t7y(xf10Var);
                kg0 kg0Var = (kg0) nf10Var.b.get();
                c8o.l(kg0Var);
                pf10Var.J1 = kg0Var;
                c2r0 c2r0Var = (c2r0) nf10Var.f.get();
                c8o.l(c2r0Var);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                pf10Var.K1 = c2r0Var.d(yon1.z1(), (qir0) null);
                g7h1 g7h1Var = (g7h1) nf10Var.g.get();
                c8o.l(g7h1Var);
                pf10Var.L1 = g7h1Var;
                break;
            case 15:
                mh20 mh20Var = (mh20) zf30Var;
                nh20 nh20Var = (nh20) ((t700) obj).b.get();
                nh20Var.getClass();
                mh20Var.getClass();
                uw0 uw0Var = new uw0(nh20Var, mh20Var);
                kly0 kly0Var = nh20Var.k;
                xfx xfxVar2 = (xfx) kly0Var.get();
                c8o.l(xfxVar2);
                oh20 oh20Var = new oh20(xfxVar2);
                xfx xfxVar3 = (xfx) kly0Var.get();
                c8o.l(xfxVar3);
                rxr rxrVar = (rxr) ((jly0) uw0Var.c).get();
                kly0 kly0Var2 = nh20Var.q;
                luk lukVar = (luk) kly0Var2.get();
                c8o.l(lukVar);
                do4 do4Var = new do4(lukVar);
                chp chpVar = (chp) uw0Var.Y;
                yqg yqgVar = (yqg) nh20Var.s.get();
                c8o.l(yqgVar);
                bf3 bf3Var = new bf3(yqgVar);
                f6g1 f6g1Var = (f6g1) nh20Var.H.get();
                c8o.l(f6g1Var);
                kp00 kp00Var = new kp00(oh20Var, new wb00(new qxx0(new g2z(xfxVar3, rxrVar, do4Var, chpVar, bf3Var, f6g1Var)), (byte) 5), (byte) 17);
                Context context = (Context) nh20Var.a.get();
                c8o.l(context);
                lik1 lik1Var = (lik1) ((chp) uw0Var.g).get();
                ufs ufsVar = (ufs) nh20Var.C.get();
                c8o.l(ufsVar);
                otu otuVar = new otu(ufsVar);
                lo9 lo9Var = new lo9(new cce((lik1) ((chp) uw0Var.g).get(), new jma((byte) 7)), (byte) 12);
                luk lukVar2 = (luk) kly0Var2.get();
                c8o.l(lukVar2);
                f7k1 f7k1Var = new f7k1(new vxr(context, lik1Var, otuVar, lo9Var, false, true, new do4(lukVar2).a(), ((Boolean) nh20Var.E.get()).booleanValue()), ((Boolean) nh20Var.f.get()).booleanValue());
                Scheduler scheduler = (Scheduler) nh20Var.x.get();
                c8o.l(scheduler);
                Scheduler scheduler2 = (Scheduler) nh20Var.w.get();
                c8o.l(scheduler2);
                mh20Var.H1 = new g8e0(kp00Var, f7k1Var, scheduler, scheduler2);
                mh20Var.I1 = (r7m0) ((jly0) uw0Var.O0).get();
                break;
            case 21:
                u250 u250Var = (u250) zf30Var;
                s250 s250Var = (s250) ((t700) obj).b.get();
                s250Var.getClass();
                u250Var.getClass();
                k9k k9kVar = new k9k(s250Var, u250Var);
                gp41 gp41VarH = k9kVar.h();
                gp41 gp41VarH2 = k9kVar.h();
                caq caqVar = s250Var.c;
                ohv0 ohv0Var2 = (ohv0) caqVar.get();
                c8o.l(ohv0Var2);
                r5o r5oVar = new r5o(gp41VarH2, ohv0Var2);
                g5t g5tVar = s250Var.b;
                kg0 kg0Var2 = (kg0) g5tVar.get();
                c8o.l(kg0Var2);
                ohv0 ohv0Var3 = (ohv0) caqVar.get();
                c8o.l(ohv0Var3);
                u250Var.W1 = new x250(u250Var, gp41VarH, r5oVar, kg0Var2, ohv0Var3);
                Context context2 = (Context) s250Var.a.a;
                c8o.l(context2);
                u250Var.X1 = new l7m0(context2);
                c0i c0iVar = ((g0i) u250Var.N0()).i;
                c8o.m(c0iVar);
                u250Var.Y1 = c0iVar;
                kg0 kg0Var3 = (kg0) g5tVar.get();
                c8o.l(kg0Var3);
                u250Var.Z1 = kg0Var3;
                k9kVar.h();
                s2q s2qVar = s250Var.e;
                g1f0 g1f0Var = (g1f0) s2qVar.get();
                c8o.l(g1f0Var);
                u250Var.a2 = g1f0Var;
                Activity activity = (Activity) s250Var.d.a;
                c8o.l(activity);
                g1f0 g1f0Var2 = (g1f0) s2qVar.get();
                c8o.l(g1f0Var2);
                caq caqVar2 = s250Var.g;
                g7h1 g7h1Var2 = (g7h1) caqVar2.get();
                c8o.l(g7h1Var2);
                w5o w5oVar = new w5o(activity, g1f0Var2, g7h1Var2);
                gp41 gp41VarH3 = k9kVar.h();
                ohv0 ohv0Var4 = (ohv0) caqVar.get();
                c8o.l(ohv0Var4);
                u250Var.b2 = new oql(w5oVar, new r5o(gp41VarH3, ohv0Var4), (byte) 14);
                gp41 gp41VarH4 = k9kVar.h();
                ohv0 ohv0Var5 = (ohv0) caqVar.get();
                c8o.l(ohv0Var5);
                u250Var.c2 = new r5o(gp41VarH4, ohv0Var5);
                u250Var.d2 = (wnh1) ((jly0) k9kVar.e).get();
                u250Var.e2 = (qhe0) ((jly0) k9kVar.d).get();
                u250Var.f2 = (mir0) ((jly0) k9kVar.f).get();
                g7h1 g7h1Var3 = (g7h1) caqVar2.get();
                c8o.l(g7h1Var3);
                u250Var.g2 = g7h1Var3;
                break;
            case 22:
                qa50 qa50Var = (qa50) zf30Var;
                ra50 ra50Var = (ra50) ((t700) obj).b.get();
                ra50Var.getClass();
                qa50Var.getClass();
                kg0 kg0Var4 = (kg0) ra50Var.a.get();
                c8o.l(kg0Var4);
                wza0 wza0Var = (wza0) ra50Var.c.get();
                c8o.l(wza0Var);
                Scheduler scheduler3 = (Scheduler) ra50Var.b.get();
                c8o.l(scheduler3);
                pbk1 pbk1Var = (pbk1) ra50Var.d.get();
                c8o.l(pbk1Var);
                qa50Var.G1 = new ha50(new ua50(kg0Var4, wza0Var, scheduler3, pbk1Var));
                qa50Var.H1 = fj10.e;
                break;
            case 23:
                GroupBlendTasteMatchFragment groupBlendTasteMatchFragment = (GroupBlendTasteMatchFragment) zf30Var;
                vh50 vh50Var = (vh50) ((t700) obj).b.get();
                vh50Var.getClass();
                groupBlendTasteMatchFragment.getClass();
                x2p x2pVar2 = new x2p(vh50Var, groupBlendTasteMatchFragment);
                r1n0 r1n0Var = (r1n0) vh50Var.i.get();
                c8o.l(r1n0Var);
                groupBlendTasteMatchFragment.G1 = r1n0Var.a(groupBlendTasteMatchFragment, groupBlendTasteMatchFragment, bbp1.g((Single) x2pVar2.b.get()));
                i1n0 i1n0Var = (i1n0) vh50Var.j.get();
                c8o.l(i1n0Var);
                jik1 jik1Var = (jik1) vh50Var.e.a;
                c8o.l(jik1Var);
                lzn0 lzn0Var = (lzn0) vh50Var.f.get();
                c8o.l(lzn0Var);
                kt91 kt91Var = (kt91) vh50Var.c.get();
                c8o.l(kt91Var);
                i8h1 i8h1Var2 = (i8h1) vh50Var.k.get();
                c8o.l(i8h1Var2);
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                ntk0 ntk0Var = new ntk0(yon1.f0().c);
                di50 di50Var = (di50) ((jly0) x2pVar2.d).get();
                jh50 jh50Var = (jh50) vh50Var.m.get();
                c8o.l(jh50Var);
                Scheduler scheduler4 = (Scheduler) vh50Var.n.get();
                c8o.l(scheduler4);
                qh50 qh50Var = (qh50) vh50Var.l.get();
                c8o.l(qh50Var);
                ees eesVarA = i1n0Var.a(t5b.c, jik1Var);
                s28 s28Var = s28.f;
                a680 a680Var = eesVarA.a;
                a680Var.d = s28Var;
                a680Var.b = new ci50(di50Var, lzn0Var, kt91Var, i8h1Var2, ntk0Var, jh50Var, scheduler4, qh50Var);
                groupBlendTasteMatchFragment.H1 = eesVarA;
                break;
            default:
                li50 li50Var = (li50) zf30Var;
                mi50 mi50Var = (mi50) ((t700) obj).b.get();
                mi50Var.getClass();
                li50Var.getClass();
                tnm tnmVar = new tnm(mi50Var, li50Var);
                q1n0 q1n0Var = (q1n0) mi50Var.f.get();
                c8o.l(q1n0Var);
                li50Var.G1 = q1n0Var;
                li50Var.H1 = (ees) ((jly0) tnmVar.g).get();
                li50Var.I1 = (ni50) ((jly0) tnmVar.h).get();
                break;
        }
    }

    public void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                ((o8u0) obj).o((qeo) obj2);
                break;
            case 8:
                ((o8u0) obj).n0(((so00) obj2).a.R);
                break;
            case 9:
                ((o8u0) obj).u((hjj0) obj2);
                break;
            default:
                ((yjq) obj2).getClass();
                ((i690) obj).getClass();
                break;
        }
    }

    public o2r j() {
        return ((nk60) this.b).a(8);
    }

    public void onSuccess(Object obj) {
        boolean z;
        shf1 shf1Var = (shf1) obj;
        if (!((FirebaseMessaging) this.b).e.z() || shf1Var.h.a() == null) {
            return;
        }
        synchronized (shf1Var) {
            z = shf1Var.g;
        }
        if (z) {
            return;
        }
        shf1Var.d(0L);
    }

    public void q(Bundle bundle, String str) {
        ((q1) this.b).invoke(str, bundle);
    }

    public /* synthetic */ nay(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
