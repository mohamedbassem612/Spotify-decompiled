package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.LeakDebugLoggingFlowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.LinkedHashMap;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ywp implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ywp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public static /* bridge */ /* synthetic */ p2o0 a(ywp ywpVar) {
        return (p2o0) ywpVar.c;
    }

    private final Object b() {
        h72 h72Var = (h72) this.c;
        z2v0 z2v0Var = (z2v0) h72Var.c;
        a3v0 a3v0Var = (a3v0) h72Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                return new k3v0();
            case 1:
                return new e3v0((w470) ((jly0) h72Var.h).get(), (ie70) ((jly0) h72Var.i).get());
            case 2:
                return new ie70((l670) ((jly0) h72Var.g).get(), (w470) ((jly0) h72Var.h).get());
            case 3:
                Context context = (Context) a3v0Var.b.get();
                c8o.l(context);
                kly0 kly0Var = a3v0Var.i;
                kly0 kly0Var2 = a3v0Var.l;
                kly0 kly0Var3 = a3v0Var.h;
                i8h1 i8h1Var = (i8h1) a3v0Var.m.get();
                c8o.l(i8h1Var);
                lzn0 lzn0Var = (lzn0) a3v0Var.j.get();
                c8o.l(lzn0Var);
                in8 in8Var = new in8(lzn0Var);
                r630 r630Var = (r630) kly0Var3.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var3.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) h72Var.e).get();
                gw70 gw70Var = (gw70) a3v0Var.n.get();
                c8o.l(gw70Var);
                q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), h72Var.F()), new e570((byte) 0, h72Var.F()), new z970((fe70) ((jly0) h72Var.e).get()), new ea70((fe70) ((jly0) h72Var.e).get(), (byte) 0), new ea70((fe70) ((jly0) h72Var.e).get(), (byte) 2), new ea70((fe70) ((jly0) h72Var.e).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar = (yqg) kly0Var2.get();
                c8o.l(yqgVar);
                p670 p670Var = new p670(yqgVar, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) h72Var.e).get();
                j3a j3aVar = (j3a) kly0Var.get();
                c8o.l(j3aVar);
                l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                yqg yqgVar2 = (yqg) kly0Var2.get();
                c8o.l(yqgVar2);
                p670 p670Var2 = new p670(yqgVar2, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) h72Var.e).get();
                j3a j3aVar2 = (j3a) kly0Var.get();
                c8o.l(j3aVar2);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) h72Var.e).get())), new q770(new e570((byte) 1, h72Var.F()), new h770((byte) 0), new h770((byte) 1), new k770(h72Var.F()), new i870((fe70) ((jly0) h72Var.e).get())));
                c8o.l((u3f1) a3v0Var.g.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str = (String) a3v0Var.q.get();
                c8o.l(str);
                mxa1 mxa1Var = new mxa1(i8h1Var, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
                vgm vgmVar = (vgm) a3v0Var.f.get();
                c8o.l(vgmVar);
                c3v0 c3v0Var = new c3v0((mi30) ((jly0) h72Var.f).get(), (k3v0) ((jly0) h72Var.d).get());
                gw70 gw70Var2 = (gw70) a3v0Var.n.get();
                c8o.l(gw70Var2);
                DisplayMetrics displayMetrics = (DisplayMetrics) a3v0Var.d.get();
                c8o.l(displayMetrics);
                y2v0 y2v0Var = new y2v0(gw70Var2, displayMetrics);
                Context context2 = (Context) a3v0Var.b.get();
                c8o.l(context2);
                gw70 gw70Var3 = (gw70) a3v0Var.n.get();
                c8o.l(gw70Var3);
                m3v0 m3v0Var = new m3v0(context2, gw70Var3);
                gw70 gw70Var4 = (gw70) a3v0Var.n.get();
                c8o.l(gw70Var4);
                Context context3 = (Context) a3v0Var.b.get();
                c8o.l(context3);
                g3v0 g3v0Var = new g3v0(gw70Var4, context3, (mi30) ((jly0) h72Var.f).get(), (k3v0) ((jly0) h72Var.d).get());
                k670 k670Var = (k670) mxa1Var.b(context, z2v0Var).s(vgmVar).b;
                k670Var.b(2131429217, "podcastcharts:header", c3v0Var);
                k670Var.b(2131429216, "podcastcharts:card", y2v0Var);
                k670Var.b(2131429219, "podcastcharts:indexedImageRankRow", m3v0Var);
                k670Var.b(2131429218, "podcastcharts:chartHeader", g3v0Var);
                return k670Var.a();
            case 4:
                Activity activity = (Activity) a3v0Var.a.get();
                c8o.l(activity);
                gw70 gw70Var5 = (gw70) a3v0Var.n.get();
                c8o.l(gw70Var5);
                hl00 hl00Var = new hl00(gw70Var5, (byte) 14);
                j3a j3aVar3 = (j3a) a3v0Var.i.get();
                c8o.l(j3aVar3);
                return new fe70(activity, hl00Var, j3aVar3);
            case 5:
                return new mi30((zf30) z2v0Var);
            case 6:
                Context context4 = (Context) a3v0Var.b.get();
                c8o.l(context4);
                l670 l670Var = (l670) ((jly0) h72Var.g).get();
                Activity activity2 = (Activity) a3v0Var.a.get();
                c8o.l(activity2);
                Context context5 = (Context) a3v0Var.b.get();
                c8o.l(context5);
                l7m0 l7m0VarW = mw60.w(context5, (l670) ((jly0) h72Var.g).get(), h72Var.F());
                Resources resources = (Resources) a3v0Var.c.get();
                c8o.l(resources);
                w470 w470VarD = new ycc1(new sw9(1, z2v0Var), new sw9(activity2, l7m0VarW, td70.a(resources, h72Var.F())), (byte) 1).d(context4, l670Var);
                c8o.m(w470VarD);
                return w470VarD;
            case 7:
                Resources resources2 = (Resources) a3v0Var.c.get();
                c8o.l(resources2);
                Single<re70> singleA = ((o3v0) ((jly0) h72Var.X).get()).a(d8.c(z2v0Var).a);
                c8o.m(singleA);
                Scheduler scheduler = (Scheduler) a3v0Var.f2p.get();
                c8o.l(scheduler);
                aru0 aru0Var = new aru0(resources2, singleA, scheduler, false, (byte) 7);
                e3v0 e3v0Var = (e3v0) ((jly0) h72Var.t).get();
                Scheduler scheduler2 = (Scheduler) a3v0Var.o.get();
                c8o.l(scheduler2);
                return new l3v0(aru0Var, e3v0Var, scheduler2);
            case 8:
                RetrofitMaker retrofitMaker = (RetrofitMaker) a3v0Var.e.get();
                c8o.l(retrofitMaker);
                o3v0 o3v0Var = (o3v0) retrofitMaker.createWebgateService(o3v0.class, "android-podcast-charts-chartsv2");
                c8o.m(o3v0Var);
                return o3v0Var;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object c() {
        wdm wdmVar = (wdm) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new e3v0((w470) ((jly0) wdmVar.i).get(), (ie70) ((jly0) wdmVar.t).get());
            case 1:
                return new ie70((l670) ((jly0) wdmVar.h).get(), (w470) ((jly0) wdmVar.i).get());
            case 2:
                gj5 gj5VarA = wdmVar.a();
                i3v0 i3v0Var = (i3v0) wdmVar.b;
                kly0 kly0Var = i3v0Var.i;
                kly0 kly0Var2 = i3v0Var.l;
                kly0 kly0Var3 = i3v0Var.h;
                i8h1 i8h1Var = (i8h1) i3v0Var.m.get();
                c8o.l(i8h1Var);
                lzn0 lzn0Var = (lzn0) i3v0Var.j.get();
                c8o.l(lzn0Var);
                in8 in8Var = new in8(lzn0Var);
                r630 r630Var = (r630) kly0Var3.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var3.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) wdmVar.d).get();
                gw70 gw70Var = (gw70) i3v0Var.n.get();
                c8o.l(gw70Var);
                q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), wdmVar.s()), new e570((byte) 0, wdmVar.s()), new z970((fe70) ((jly0) wdmVar.d).get()), new ea70((fe70) ((jly0) wdmVar.d).get(), (byte) 0), new ea70((fe70) ((jly0) wdmVar.d).get(), (byte) 2), new ea70((fe70) ((jly0) wdmVar.d).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar = (yqg) kly0Var2.get();
                c8o.l(yqgVar);
                p670 p670Var = new p670(yqgVar, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) wdmVar.d).get();
                j3a j3aVar = (j3a) kly0Var.get();
                c8o.l(j3aVar);
                l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                yqg yqgVar2 = (yqg) kly0Var2.get();
                c8o.l(yqgVar2);
                p670 p670Var2 = new p670(yqgVar2, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) wdmVar.d).get();
                j3a j3aVar2 = (j3a) kly0Var.get();
                c8o.l(j3aVar2);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) wdmVar.d).get())), new q770(new e570((byte) 1, wdmVar.s()), new h770((byte) 0), new h770((byte) 1), new k770(wdmVar.s()), new i870((fe70) ((jly0) wdmVar.d).get())));
                c8o.l((u3f1) i3v0Var.g.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str = (String) i3v0Var.q.get();
                c8o.l(str);
                mxa1 mxa1Var = new mxa1(i8h1Var, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
                lik1 lik1Var = ((j3v0) wdmVar.c).a;
                c8o.m(lik1Var);
                vuf0 vuf0Var = new vuf0(lik1Var);
                vgm vgmVar = (vgm) i3v0Var.f.get();
                c8o.l(vgmVar);
                c3v0 c3v0Var = new c3v0((mi30) ((jly0) wdmVar.f).get(), (k3v0) ((jly0) wdmVar.g).get());
                gw70 gw70Var2 = (gw70) i3v0Var.n.get();
                c8o.l(gw70Var2);
                DisplayMetrics displayMetrics = (DisplayMetrics) i3v0Var.d.get();
                c8o.l(displayMetrics);
                y2v0 y2v0Var = new y2v0(gw70Var2, displayMetrics);
                gj5 gj5VarA2 = wdmVar.a();
                gw70 gw70Var3 = (gw70) i3v0Var.n.get();
                c8o.l(gw70Var3);
                m3v0 m3v0Var = new m3v0(gj5VarA2, gw70Var3);
                gw70 gw70Var4 = (gw70) i3v0Var.n.get();
                c8o.l(gw70Var4);
                g3v0 g3v0Var = new g3v0(gw70Var4, wdmVar.a(), (mi30) ((jly0) wdmVar.f).get(), (k3v0) ((jly0) wdmVar.g).get());
                k670 k670Var = (k670) mxa1Var.b(gj5VarA, vuf0Var).s(vgmVar).b;
                k670Var.b(2131429217, "podcastcharts:header", c3v0Var);
                k670Var.b(2131429216, "podcastcharts:card", y2v0Var);
                k670Var.b(2131429219, "podcastcharts:indexedImageRankRow", m3v0Var);
                k670Var.b(2131429218, "podcastcharts:chartHeader", g3v0Var);
                return k670Var.a();
            case 3:
                gj5 gj5VarA3 = wdmVar.a();
                i3v0 i3v0Var2 = (i3v0) wdmVar.b;
                gw70 gw70Var5 = (gw70) i3v0Var2.n.get();
                c8o.l(gw70Var5);
                hl00 hl00Var = new hl00(gw70Var5, (byte) 14);
                j3a j3aVar3 = (j3a) i3v0Var2.i.get();
                c8o.l(j3aVar3);
                return new fe70(gj5VarA3, hl00Var, j3aVar3);
            case 4:
                return new mi30((kgr0) ((jly0) wdmVar.e).get());
            case 5:
                o6 kgr0Var = new kgr0(wdmVar.a());
                kgr0Var.setId(2131430276);
                return kgr0Var;
            case 6:
                return new k3v0();
            case 7:
                gj5 gj5VarA4 = wdmVar.a();
                l670 l670Var = (l670) ((jly0) wdmVar.h).get();
                gj5 gj5VarA5 = wdmVar.a();
                l7m0 l7m0VarW = mw60.w(wdmVar.a(), (l670) ((jly0) wdmVar.h).get(), wdmVar.s());
                Resources resources = (Resources) ((i3v0) wdmVar.b).c.get();
                c8o.l(resources);
                return new ycc1(new sw9(1, (zf30) null), new sw9(gj5VarA5, l7m0VarW, td70.a(resources, wdmVar.s())), (byte) 1).d(gj5VarA4, l670Var);
            case 8:
                i3v0 i3v0Var3 = (i3v0) wdmVar.b;
                Resources resources2 = (Resources) i3v0Var3.c.get();
                c8o.l(resources2);
                lik1 lik1Var2 = ((j3v0) wdmVar.c).a;
                c8o.m(lik1Var2);
                Single<re70> singleA = ((o3v0) ((jly0) wdmVar.Y).get()).a(lik1Var2.a);
                Scheduler scheduler = (Scheduler) i3v0Var3.f33p.get();
                c8o.l(scheduler);
                aru0 aru0Var = new aru0(resources2, singleA, scheduler, false, (byte) 7);
                e3v0 e3v0Var = (e3v0) ((jly0) wdmVar.X).get();
                Scheduler scheduler2 = (Scheduler) ((i3v0) wdmVar.b).o.get();
                c8o.l(scheduler2);
                return new l3v0(aru0Var, e3v0Var, scheduler2);
            case 9:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((i3v0) wdmVar.b).e.get();
                c8o.l(retrofitMaker);
                return (o3v0) retrofitMaker.createWebgateService(o3v0.class, "android-podcast-charts-podcastchartspage");
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object d() {
        u9x0 u9x0Var = u9x0.P0;
        fyp fypVar = (fyp) this.c;
        byte b = 3;
        i691 i691Var = i691.a;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                k5v0 k5v0Var = fypVar.a;
                k5v0 k5v0Var2 = fypVar.a;
                xfx xfxVarA0 = k5v0Var.a0();
                c8o.l(xfxVarA0);
                sap sapVar = (sap) fypVar.N.get();
                Flowable flowable = (Flowable) fypVar.c.get();
                fl3 fl3VarK = k5v0Var2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable, fl3VarK, (lik1) fypVar.q.get());
                ynb0 ynb0VarA = xqu.a(fypVar.R);
                ynb0 ynb0VarA2 = xqu.a(fypVar.S);
                ynb0 ynb0VarA3 = xqu.a(fypVar.U);
                ynb0 ynb0VarA4 = xqu.a(fypVar.W);
                ynb0 ynb0VarA5 = xqu.a(fypVar.X);
                ynb0 ynb0VarA6 = xqu.a(fypVar.Z);
                ynb0 ynb0VarA7 = xqu.a(fypVar.a0);
                ynb0 ynb0VarA8 = xqu.a(fypVar.b0);
                ynb0 ynb0VarA9 = xqu.a(fypVar.c0);
                ynb0 ynb0VarA10 = xqu.a(fypVar.e0);
                FlowableMap flowableMapC = fypVar.c();
                uu00 uu00VarA = k5v0Var2.A();
                c8o.l(uu00VarA);
                d0r d0rVar = (d0r) fypVar.o.get();
                vbs vbsVarN = k5v0Var2.n();
                c8o.l(vbsVarN);
                q8n q8nVarG = k5v0Var2.g();
                c8o.l(q8nVarG);
                luk lukVarW = k5v0Var2.w();
                c8o.l(lukVarW);
                dxy dxyVar = new dxy((Object) flowableMapC, (Object) uu00VarA, (Object) d0rVar, (Object) vbsVarN, (Object) q8nVarG, (Object) new gn4(false, lukVarW), (byte) 17);
                Flowable flowable2 = (Flowable) fypVar.c.get();
                xh71 xh71VarZ = k5v0Var2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = k5v0Var2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = k5v0Var2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = k5v0Var2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = k5v0Var2.k();
                c8o.l(me30VarK);
                Flowable flowableF = k5v0Var2.f();
                c8o.l(flowableF);
                f771 f771VarO = k5v0Var2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0(hq41VarD, me30VarK, flowableF, f771VarO, (byte) 15);
                f771 f771VarO2 = k5v0Var2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = k5v0Var2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) fypVar.f0.get();
                luk lukVarW2 = k5v0Var2.w();
                c8o.l(lukVarW2);
                o671 o671Var = new o671(flowable2, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW2);
                FlowableMap flowableMapC2 = fypVar.c();
                Flowable flowable3 = (Flowable) fypVar.h.get();
                qmg qmgVarV = k5v0Var2.V();
                c8o.l(qmgVarV);
                o3e0 o3e0VarW = k5v0Var2.W();
                oj3 oj3VarM = k5v0Var2.M();
                c8o.l(oj3VarM);
                v3i0 v3i0Var = new v3i0(flowableMapC2, flowable3, qmgVarV, o3e0VarW, oj3VarM);
                c9c0 c9c0VarL = k5v0Var2.l();
                c8o.l(c9c0VarL);
                g5p0 g5p0VarU = k5v0Var2.u();
                c8o.l(g5p0VarU);
                waz0 waz0VarY = k5v0Var2.Y();
                c8o.l(waz0VarY);
                v6z0 v6z0Var = new v6z0(c9c0VarL, g5p0VarU, waz0VarY);
                Flowable flowable4 = (Flowable) fypVar.c.get();
                d0r d0rVar2 = (d0r) fypVar.o.get();
                boolean zBooleanValue = ((Boolean) fypVar.g0.get()).booleanValue();
                w9u0 w9u0Var = (w9u0) fypVar.d.get();
                u961 u961VarK0 = k5v0Var2.k0();
                ajq0 ajq0VarT0 = k5v0Var2.t0();
                c3s c3sVarB = k5v0Var2.B();
                c8o.l(c3sVarB);
                dma1 dma1VarP0 = k5v0Var2.P0();
                c8o.l(dma1VarP0);
                e68 e68Var = new e68(flowable4, d0rVar2, zBooleanValue, w9u0Var, u961VarK0, ajq0VarT0, c3sVarB, new in01(dma1VarP0));
                ynb0 ynb0VarA11 = xqu.a(fypVar.h0);
                Flowable flowable5 = (Flowable) fypVar.c.get();
                a1r0 a1r0Var = (a1r0) fypVar.F.get();
                uvy uvyVarQ0 = k5v0Var2.q0();
                c8o.l(uvyVarQ0);
                q8n q8nVarE = k5v0Var2.e();
                c8o.l(q8nVarE);
                luk lukVarW3 = k5v0Var2.w();
                c8o.l(lukVarW3);
                duy duyVar = new duy(flowable5, a1r0Var, uvyVarQ0, q8nVarE, new wu4(false, lukVarW3));
                vsy vsyVar = new vsy((Flowable) fypVar.c.get(), (w9u0) fypVar.d.get(), (d0r) fypVar.o.get(), k5v0Var2.v0());
                ynb0 ynb0VarA12 = xqu.a(fypVar.H);
                boolean zBooleanValue2 = ((Boolean) fypVar.g0.get()).booleanValue();
                pqq0 pqq0Var = (pqq0) fypVar.i0.get();
                pta1 pta1VarI = k5v0Var2.I();
                c8o.l(pta1VarI);
                Observable map = pta1VarI.a().map(u9x0Var);
                waz0 waz0VarY2 = k5v0Var2.Y();
                c8o.l(waz0VarY2);
                FlowableMap flowableMapJ = Observable.combineLatest(map, waz0VarY2.c().map(xi20.d1), yi20.b1).toFlowable(BackpressureStrategy.d).J(new svh0(zBooleanValue2, pqq0Var, (byte) 8));
                FlowableJust flowableJustY = k9o0.y((hnl) fypVar.k.get());
                Flowable flowable6 = (Flowable) fypVar.c.get();
                o241 o241VarI = k5v0Var2.i();
                c8o.l(o241VarI);
                uwh uwhVarJ = k5v0Var2.J();
                c8o.l(uwhVarJ);
                lid lidVarL0 = k5v0Var2.L0();
                c8o.l(lidVarL0);
                lkd lkdVarV = mid.v(lidVarL0);
                pqq0 pqq0Var2 = (pqq0) fypVar.i0.get();
                yqg yqgVarA = k5v0Var2.a();
                c8o.l(yqgVarA);
                Scheduler schedulerO = k5v0Var2.o();
                c8o.l(schedulerO);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedK = ioo1.K(flowable6, o241VarI, uwhVarJ, lkdVarV, pqq0Var2, yqgVarA, schedulerO);
                ynb0 ynb0VarA13 = xqu.a(fypVar.j0);
                luk lukVarW4 = k5v0Var2.w();
                c8o.l(lukVarW4);
                iv4 iv4Var = new iv4(lukVarW4);
                luk lukVarW5 = k5v0Var2.w();
                c8o.l(lukVarW5);
                return new q5v0(xfxVarA0, sapVar, yl1Var, ynb0VarA, ynb0VarA2, ynb0VarA3, ynb0VarA4, ynb0VarA5, ynb0VarA6, ynb0VarA7, ynb0VarA8, ynb0VarA9, ynb0VarA10, dxyVar, o671Var, v3i0Var, v6z0Var, e68Var, ynb0VarA11, duyVar, vsyVar, ynb0VarA12, flowableMapJ, flowableJustY, flowableDistinctUntilChangedK, ynb0VarA13, iv4Var, new xm4(false, false, lukVarW5), (n6r0) fypVar.y.get(), (lik1) fypVar.q.get());
            case 1:
                return new sap(this, b);
            case 2:
                return k9o0.B(fypVar.b);
            case 3:
                return k9o0.z(fypVar.b);
            case 4:
                return fypVar.b.f();
            case 5:
                return f2u0.B(fypVar.g(), (Flowable) fypVar.f.get(), (Flowable) fypVar.g.get(), fypVar.b());
            case 6:
                jly0 jly0Var = fypVar.c;
                k5v0 k5v0Var3 = fypVar.a;
                Flowable flowable7 = (Flowable) jly0Var.get();
                Scheduler schedulerO2 = k5v0Var3.o();
                c8o.l(schedulerO2);
                yqg yqgVarA2 = k5v0Var3.a();
                c8o.l(yqgVarA2);
                return f2u0.z(flowable7, schedulerO2, yqgVarA2, fypVar.b());
            case 7:
                return f2u0.y((Flowable) fypVar.c.get(), fypVar.b());
            case 8:
                return new a62((p2p0) fypVar.i.get(), (byte) 3);
            case 9:
                return fypVar.b.j();
            case 10:
                return k9o0.r(fypVar.b);
            case 11:
                return new l0y((p2p0) fypVar.i.get(), (byte) 2);
            case 12:
                return new k0y((p2p0) fypVar.i.get(), (byte) 2);
            case 13:
                return fypVar.b.g();
            case 14:
                return k9o0.t(fypVar.b);
            case 15:
                lzn0 lzn0VarC = fypVar.a.c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 16:
                return new i5v0((z2z) fypVar.r.get(), (cmf1) fypVar.s.get(), (byte) 0);
            case 17:
                jly0 jly0Var2 = fypVar.q;
                k5v0 k5v0Var4 = fypVar.a;
                lik1 lik1Var = (lik1) jly0Var2.get();
                s6z s6zVarY0 = k5v0Var4.y0();
                c8o.l(s6zVarY0);
                uny unyVarF0 = k5v0Var4.f0();
                c3s c3sVarB2 = k5v0Var4.B();
                c8o.l(c3sVarB2);
                luk lukVarW6 = k5v0Var4.w();
                c8o.l(lukVarW6);
                an4 an4Var = new an4(false, lukVarW6);
                luk lukVarW7 = k5v0Var4.w();
                c8o.l(lukVarW7);
                return new z2z(lik1Var, s6zVarY0, unyVarF0, c3sVarB2, an4Var, new uu4(false, lukVarW7));
            case 18:
                return fypVar.b.e();
            case 19:
                jly0 jly0Var3 = fypVar.q;
                k5v0 k5v0Var5 = fypVar.a;
                lik1 lik1Var2 = (lik1) jly0Var3.get();
                ssf1 ssf1VarP = k5v0Var5.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB3 = k5v0Var5.B();
                c8o.l(c3sVarB3);
                luk lukVarW8 = k5v0Var5.w();
                c8o.l(lukVarW8);
                an4 an4Var2 = new an4(false, lukVarW8);
                luk lukVarW9 = k5v0Var5.w();
                c8o.l(lukVarW9);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB3, an4Var2, new uu4(false, lukVarW9), k5v0Var5.q());
            case 20:
                jly0 jly0Var4 = fypVar.u;
                k5v0 k5v0Var6 = fypVar.a;
                jnk0 jnk0Var = (jnk0) jly0Var4.get();
                gw70 gw70VarB = k5v0Var6.b();
                c8o.l(gw70VarB);
                d0r d0rVar3 = (d0r) fypVar.o.get();
                luk lukVarW10 = k5v0Var6.w();
                c8o.l(lukVarW10);
                return new yxb0(jnk0Var, gw70VarB, d0rVar3, new fn4(false, lukVarW10));
            case 21:
                Flowable flowable8 = (Flowable) fypVar.c.get();
                Flowable flowable9 = (Flowable) fypVar.f.get();
                c3s c3sVarB4 = fypVar.a.B();
                c8o.l(c3sVarB4);
                return new jnk0(flowable8, flowable9, c3sVarB4);
            case 22:
                Flowable flowable10 = (Flowable) fypVar.c.get();
                Flowable flowable11 = (Flowable) fypVar.h.get();
                w9u0 w9u0Var2 = (w9u0) fypVar.d.get();
                o241 o241VarI2 = fypVar.a.i();
                c8o.l(o241VarI2);
                return new ktf1(flowable10, flowable11, w9u0Var2, i691Var, o241VarI2, fypVar.w, fypVar.h());
            case 23:
                s4p0 s4p0VarR = fypVar.a.R();
                c8o.l(s4p0VarR);
                return w3p0.B(s4p0VarR);
            case 24:
                return fypVar.b.h();
            case 25:
                return fypVar.b.i();
            case 26:
                Flowable flowable12 = (Flowable) fypVar.c.get();
                Flowable flowable13 = (Flowable) fypVar.h.get();
                w9u0 w9u0Var3 = (w9u0) fypVar.d.get();
                o241 o241VarI3 = fypVar.a.i();
                c8o.l(o241VarI3);
                return new ekf1(flowable12, flowable13, w9u0Var3, i691Var, o241VarI3, fypVar.w, fypVar.h());
            case 27:
                return new FlowableOnBackpressureLatest((PublishProcessor) fypVar.B.get());
            case 28:
                return new PublishProcessor();
            case 29:
                return new tap(this, b);
            case 30:
                return fypVar.a.b0();
            case 31:
                a1r0 a1r0VarC = fypVar.a.C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 32:
                return w3p0.w(fypVar.a.H(), fypVar.b, (o2p0) fypVar.x.get());
            case 33:
                return new a4f0((Flowable) fypVar.c.get(), (Flowable) fypVar.h.get(), (w9u0) fypVar.d.get());
            case 34:
                return new ww9(fypVar.d());
            case 35:
                a1g1 a1g1Var = new a1g1(fypVar.a.F(), (byte) 11);
                Scheduler schedulerO3 = fypVar.a.o();
                c8o.l(schedulerO3);
                return new h280(a1g1Var, schedulerO3);
            case 36:
                s4p0 s4p0VarR2 = fypVar.a.R();
                c8o.l(s4p0VarR2);
                return w3p0.z(s4p0VarR2);
            case 37:
                s4p0 s4p0VarR3 = fypVar.a.R();
                c8o.l(s4p0VarR3);
                return w3p0.A(s4p0VarR3);
            case 38:
                jly0 jly0Var5 = fypVar.c;
                k5v0 k5v0Var7 = fypVar.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var5.get());
                z6k0 z6k0VarM0 = k5v0Var7.M0();
                c8o.l(z6k0VarM0);
                mnk0 mnk0VarM = k5v0Var7.m();
                c8o.l(mnk0VarM);
                rxj0 rxj0VarG0 = k5v0Var7.G0();
                c8o.l(rxj0VarG0);
                return new k6k0(flowableDistinctUntilChangedD, z6k0VarM0, mnk0VarM, rxj0VarG0);
            case 39:
                jly0 jly0Var6 = fypVar.c;
                k5v0 k5v0Var8 = fypVar.a;
                Flowable flowable14 = (Flowable) jly0Var6.get();
                Flowable flowable15 = (Flowable) fypVar.P.get();
                w9u0 w9u0Var4 = (w9u0) fypVar.d.get();
                Consumer consumer = (Consumer) fypVar.Q.get();
                luk lukVarW11 = k5v0Var8.w();
                c8o.l(lukVarW11);
                jn4 jn4Var = new jn4(lukVarW11);
                dma1 dma1VarM0 = k5v0Var8.m0();
                c8o.l(dma1VarM0);
                return new mo51(flowable14, flowable15, w9u0Var4, consumer, jn4Var, dma1VarM0);
            case 40:
                return f2u0.C(fypVar.g(), (Flowable) fypVar.O.get(), (Flowable) fypVar.g.get(), fypVar.b());
            case 41:
                jly0 jly0Var7 = fypVar.c;
                k5v0 k5v0Var9 = fypVar.a;
                Flowable flowable16 = (Flowable) jly0Var7.get();
                Scheduler schedulerO4 = k5v0Var9.o();
                c8o.l(schedulerO4);
                yqg yqgVarA3 = k5v0Var9.a();
                c8o.l(yqgVarA3);
                return f2u0.A(flowable16, schedulerO4, yqgVarA3, fypVar.b());
            case 42:
                return new lrj0(fypVar.b, (byte) 21);
            case 43:
                FlowableMap flowableMapC3 = fypVar.c();
                k5v0 k5v0Var10 = fypVar.a;
                mo51 mo51Var = (mo51) fypVar.R.get();
                Scheduler schedulerO5 = k5v0Var10.o();
                c8o.l(schedulerO5);
                Flowable flowable17 = (Flowable) fypVar.c.get();
                Flowable flowable18 = (Flowable) fypVar.P.get();
                uvy uvyVarQ1 = k5v0Var10.q0();
                c8o.l(uvyVarQ1);
                d0r d0rVar4 = (d0r) fypVar.o.get();
                q8n q8nVarG2 = k5v0Var10.g();
                c8o.l(q8nVarG2);
                luk lukVarW12 = k5v0Var10.w();
                c8o.l(lukVarW12);
                hv4 hv4Var = new hv4(false, false, false, lukVarW12);
                dma1 dma1VarM1 = k5v0Var10.m0();
                c8o.l(dma1VarM1);
                acl aclVar = new acl(flowable17, flowable18, uvyVarQ1, d0rVar4, q8nVarG2, hv4Var, dma1VarM1);
                w9u0 w9u0Var5 = (w9u0) fypVar.d.get();
                Consumer consumer2 = (Consumer) fypVar.Q.get();
                dma1 dma1VarM2 = k5v0Var10.m0();
                c8o.l(dma1VarM2);
                zr51 zr51Var = new zr51(w9u0Var5, consumer2, dma1VarM2);
                luk lukVarW13 = k5v0Var10.w();
                c8o.l(lukVarW13);
                y441 y441Var = new y441(schedulerO5, aclVar, zr51Var, new zu4(false, lukVarW13));
                xfx xfxVarA1 = k5v0Var10.a0();
                c8o.l(xfxVarA1);
                return new rt01(flowableMapC3, mo51Var, y441Var, xfxVarA1);
            case 44:
                k5v0 k5v0Var11 = fypVar.a;
                k5v0 k5v0Var12 = fypVar.a;
                pta1 pta1VarI2 = k5v0Var11.I();
                c8o.l(pta1VarI2);
                Observable map2 = pta1VarI2.a().map(u9x0Var);
                FlowableMap flowableMapC4 = fypVar.c();
                pta1 pta1VarI3 = k5v0Var12.I();
                c8o.l(pta1VarI3);
                ynb0 ynb0VarA14 = xqu.a(fypVar.T);
                luk lukVarW14 = k5v0Var12.w();
                c8o.l(lukVarW14);
                return new bs0(map2, flowableMapC4, pta1VarI3, ynb0VarA14, lukVarW14);
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                dg30 dg30VarZ = fypVar.a.Z();
                c8o.l(dg30VarZ);
                lik1 lik1Var3 = (lik1) fypVar.q.get();
                lua1 lua1VarQ = fypVar.a.Q();
                c8o.l(lua1VarQ);
                return lua1VarQ.a(dg30VarZ, lik1Var3);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new am51(fypVar.g(), f2u0.j((Flowable) fypVar.c.get()), fypVar.e(), (Flowable) fypVar.h.get(), (w9u0) fypVar.d.get(), fypVar.i(), (im51) fypVar.V.get(), fypVar.a());
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                yqg yqgVarA4 = fypVar.a.a();
                c8o.l(yqgVarA4);
                return new im51(yqgVarA4);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                qm51 qm51Var = new qm51(fypVar.g(), f2u0.j((Flowable) fypVar.c.get()), fypVar.e(), (Flowable) fypVar.h.get(), (w9u0) fypVar.d.get(), fypVar.i(), (im51) fypVar.V.get(), fypVar.a());
                h791 h791Var = new h791((Flowable) fypVar.c.get(), (Flowable) fypVar.h.get(), (w9u0) fypVar.d.get());
                k5v0 k5v0Var13 = fypVar.a;
                uu00 uu00VarA2 = k5v0Var13.A();
                c8o.l(uu00VarA2);
                uvy uvyVarQ2 = k5v0Var13.q0();
                c8o.l(uvyVarQ2);
                return new rt01(qm51Var, h791Var, new nn61(uu00VarA2, uvyVarQ2, false, (byte) 25), (Flowable) fypVar.c.get(), fypVar.a());
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                Flowable flowable19 = (Flowable) fypVar.c.get();
                FlowableMap flowableMapG = fypVar.g();
                h991 h991VarP = fypVar.a.P();
                c8o.l(h991VarP);
                return new bs0(flowable19, flowableMapG, h991VarP, xqu.a(fypVar.Y));
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                y991 y991VarT = fypVar.a.T();
                c8o.l(y991VarT);
                return y991VarT;
            case 51:
                return new s691(fypVar.g(), (Flowable) fypVar.h.get(), fypVar.e(), (w9u0) fypVar.d.get());
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                return new k691((Flowable) fypVar.c.get(), (Flowable) fypVar.h.get(), (w9u0) fypVar.d.get(), nrq0.a, i691Var);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                k5v0 k5v0Var14 = fypVar.a;
                k5v0 k5v0Var15 = fypVar.a;
                tp91 tp91Var = k5v0Var14.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = k5v0Var14.y().f;
                c8o.m(u3qVar);
                hj91 hj91VarA = j991.A(tp91Var, u3qVar.a(), new r5v0((p2p0) fypVar.i.get(), (byte) 0));
                Flowable flowable20 = (Flowable) fypVar.c.get();
                xyl1 xyl1VarP0 = k5v0Var15.p0();
                c8o.l(xyl1VarP0);
                up41 up41Var = new up41(xyl1VarP0, (byte) 12);
                kt91 kt91VarJ = k5v0Var15.j();
                c8o.l(kt91VarJ);
                return new dm91(hj91VarA, flowable20, up41Var, new a78(kt91VarJ));
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new dx0((Flowable) fypVar.c.get(), (xbu0) fypVar.d0.get());
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return k9o0.A(fypVar.b);
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return k9o0.v(fypVar.b);
            case 57:
                return Boolean.valueOf(fypVar.b.a());
            case 58:
                return new mhe((Flowable) fypVar.c.get(), (a1r0) fypVar.F.get());
            case 59:
                return k9o0.x(fypVar.b);
            case 60:
                FlowableMap flowableMapC5 = fypVar.c();
                k5v0 k5v0Var16 = fypVar.a;
                kt91 kt91VarJ2 = k5v0Var16.j();
                c8o.l(kt91VarJ2);
                m5v0 m5v0VarH = fypVar.h();
                Resources resourcesR = k5v0Var16.r();
                c8o.l(resourcesR);
                luk lukVarW15 = k5v0Var16.w();
                c8o.l(lukVarW15);
                return new f3x(flowableMapC5, kt91VarJ2, m5v0VarH, resourcesR, new xu4(false, lukVarW15));
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object e() {
        f0a f0aVar = (f0a) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                p7v0 p7v0Var = (p7v0) f0aVar.b;
                p7v0 p7v0Var2 = (p7v0) f0aVar.b;
                lzn0 lzn0Var = (lzn0) p7v0Var.h.get();
                c8o.l(lzn0Var);
                dsb1 dsb1Var = (dsb1) ((jly0) f0aVar.g).get();
                eny enyVar = (eny) p7v0Var2.e.get();
                c8o.l(enyVar);
                zfr zfrVar = new zfr(xqu.a((ywp) f0aVar.h), (kpl0) ((jly0) f0aVar.i).get(), (byte) 18);
                dir dirVar = (dir) ((jly0) f0aVar.e).get();
                xhr xhrVar = (xhr) ((jly0) f0aVar.Y).get();
                kt8 kt8Var = (kt8) p7v0Var2.c.get();
                c8o.l(kt8Var);
                eqs eqsVar = (eqs) ((jly0) f0aVar.N0).get();
                h0s h0sVar = (h0s) ((jly0) f0aVar.O0).get();
                otr otrVar = (otr) ((jly0) f0aVar.P0).get();
                boolean zA = f0aVar.a().a();
                boolean zC = f0aVar.a().c();
                frh1 frh1Var = (frh1) p7v0Var2.t.get();
                c8o.l(frh1Var);
                nvh1 nvh1Var = (nvh1) p7v0Var2.u.get();
                c8o.l(nvh1Var);
                kuw0 kuw0Var = new kuw0((byte) 17);
                q8n q8nVar = (q8n) p7v0Var2.f61p.get();
                c8o.l(q8nVar);
                Scheduler scheduler = (Scheduler) p7v0Var2.o.get();
                c8o.l(scheduler);
                return new dgs(lzn0Var, dsb1Var, enyVar, zfrVar, dirVar, xhrVar, kt8Var, eqsVar, h0sVar, otrVar, zA, zC, frh1Var, nvh1Var, kuw0Var, q8nVar, scheduler);
            case 1:
                gj5 gj5Var = (gj5) ((p7v0) f0aVar.b).b.get();
                c8o.l(gj5Var);
                return new dsb1(gj5Var, (air) ((jly0) f0aVar.f).get(), f0aVar.a().d());
            case 2:
                dir dirVar2 = (dir) ((jly0) f0aVar.e).get();
                kt8 kt8Var2 = (kt8) ((p7v0) f0aVar.b).c.get();
                c8o.l(kt8Var2);
                return new air(dirVar2, kt8Var2);
            case 3:
                p7v0 p7v0Var3 = (p7v0) f0aVar.b;
                p7v0 p7v0Var4 = (p7v0) f0aVar.b;
                mt8 mt8Var = (mt8) p7v0Var3.d.get();
                c8o.l(mt8Var);
                x3v0 x3v0Var = (x3v0) p7v0Var4.i.get();
                c8o.l(x3v0Var);
                b7n b7nVar = (b7n) p7v0Var4.k.get();
                c8o.l(b7nVar);
                o241 o241Var = (o241) p7v0Var4.f.get();
                c8o.l(o241Var);
                uu00 uu00Var = (uu00) p7v0Var4.l.get();
                c8o.l(uu00Var);
                return new dir(mt8Var, x3v0Var, b7nVar, o241Var, uu00Var);
            case 4:
                return u1n0.z((q7r0) f0aVar.c);
            case 5:
                String str = ((r7v0) f0aVar.d).a;
                c8o.m(str);
                return new kpl0(str);
            case 6:
                kt91 kt91Var = (kt91) ((p7v0) f0aVar.b).g.get();
                c8o.l(kt91Var);
                nuu nuuVar = (nuu) ((p7v0) f0aVar.b).j.get();
                c8o.l(nuuVar);
                return new xhr(kt91Var, nuuVar, (yhr) ((jly0) f0aVar.X).get());
            case 7:
                return new yhr(xqu.a((ywp) f0aVar.h), (uol0) ((jly0) f0aVar.t).get());
            case 8:
                return new uol0(((kpl0) ((jly0) f0aVar.i).get()).b());
            case 9:
                return new eqs((z3u0) ((jly0) f0aVar.Z).get());
            case 10:
                CallbackRouter callbackRouter = (CallbackRouter) ((p7v0) f0aVar.b).n.get();
                c8o.l(callbackRouter);
                return new z3u0(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 0)));
            case 11:
                xrc0 xrc0Var = (xrc0) ((p7v0) f0aVar.b).r.get();
                c8o.l(xrc0Var);
                return new h0s(xrc0Var);
            case 12:
                p7v0 p7v0Var5 = (p7v0) f0aVar.b;
                p7v0 p7v0Var6 = (p7v0) f0aVar.b;
                y7h0 y7h0Var = (y7h0) p7v0Var5.s.get();
                c8o.l(y7h0Var);
                lzn0 lzn0Var2 = (lzn0) p7v0Var6.h.get();
                c8o.l(lzn0Var2);
                q8n q8nVar2 = (q8n) p7v0Var6.q.get();
                c8o.l(q8nVar2);
                q8n q8nVar3 = (q8n) p7v0Var6.f61p.get();
                c8o.l(q8nVar3);
                return new otr(y7h0Var, lzn0Var2, q8nVar2, q8nVar3);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        e93 e93Var = (e93) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                zle1 zle1Var = (zle1) ((xrv0) e93Var.b).z.get();
                c8o.l(zle1Var);
                yqg yqgVar = (yqg) ((xrv0) e93Var.b).A.get();
                c8o.l(yqgVar);
                return new jsv0(zle1Var, yqgVar, (rrv0) ((jly0) e93Var.e).get());
            case 1:
                zle1 zle1Var2 = (zle1) ((xrv0) e93Var.b).z.get();
                c8o.l(zle1Var2);
                return new rrv0(zle1Var2);
            case 2:
                return new kyp(this);
            case 3:
                return u1n0.z((q7r0) e93Var.d);
            case 4:
                return new lyp(this);
            case 5:
                Boolean bool = (Boolean) ((xrv0) e93Var.b).C.get();
                bool.getClass();
                return bool;
            case 6:
                mr20 mr20Var = (mr20) ((xrv0) e93Var.b).D.get();
                c8o.l(mr20Var);
                return mr20Var;
            case 7:
                return new myp();
            case 8:
                return new nyp(this);
            case 9:
                return new oyp(this);
            case 10:
                return new pyp(this);
            case 11:
                return new qyp(this);
            case 12:
                return new ryp(this);
            case 13:
                return new syp(this);
            case 14:
                return new gyp(this);
            case 15:
                return new hyp();
            case 16:
                return new iyp();
            case 17:
                return new jyp(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        em0 em0Var = (em0) this.c;
        v2w0 v2w0Var = (v2w0) em0Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                b0d0 b0d0Var = (b0d0) v2w0Var.G.get();
                c8o.l(b0d0Var);
                return new g0d0(b0d0Var, em0Var.e0(), em0Var.C0());
            case 1:
                return u1n0.z((q7r0) em0Var.c);
            case 2:
                return new y9p((byte) 1);
            case 3:
                woa woaVar = (woa) v2w0Var.m.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) v2w0Var.l.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) v2w0Var.t.get();
                c8o.l(fpaVar);
                pe peVar = (pe) v2w0Var.f83p.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) v2w0Var.a.get()).booleanValue();
                zle1 zle1Var = (zle1) v2w0Var.x.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 4:
                hik1 hik1Var = (hik1) v2w0Var.q.get();
                c8o.l(hik1Var);
                return hik1Var.a(em0Var.e0(), (b2r0) ((jly0) em0Var.i).get());
            case 5:
                return (i8h1) ((ywp) em0Var.f).get();
            case 6:
                return new typ(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object h() {
        cp31 cp31Var = (cp31) this.c;
        q7r0 q7r0Var = (q7r0) cp31Var.c;
        byte b = this.b;
        if (b == 0) {
            return new s7w0((x7w0) cp31Var.a, (a9w0) ((mct) cp31Var.b).a.get());
        }
        if (b == 1) {
            jly0 jly0Var = (jly0) cp31Var.e;
            iac0 iac0Var = q7r0Var.d.c;
            return new j5h1(jly0Var, cto1.q(iac0Var), iac0Var);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        ttm0 ttm0VarE = cwl1.E(q7r0Var);
        c8o.m(ttm0VarE);
        return ttm0VarE;
    }

    private final Object i() {
        a680 a680Var = (a680) this.c;
        q7r0 q7r0Var = (q7r0) a680Var.b;
        byte b = this.b;
        if (b == 0) {
            return new d8w0((a9w0) ((nct) a680Var.a).a.get());
        }
        if (b == 1) {
            jly0 jly0Var = (jly0) a680Var.d;
            iac0 iac0Var = q7r0Var.d.c;
            return new j5h1(jly0Var, cto1.q(iac0Var), iac0Var);
        }
        if (b == 2) {
            ttm0 ttm0VarE = cwl1.E(q7r0Var);
            c8o.m(ttm0VarE);
            return ttm0VarE;
        }
        if (b == 3) {
            return u1n0.z(q7r0Var);
        }
        jah.e(b);
        return null;
    }

    private final Object j() {
        pug pugVar = (pug) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new xmp(this, (byte) 1);
            case 1:
                return new e9p(this, (byte) 2);
            case 2:
                yqg yqgVar = (yqg) ((e1o) pugVar.g).a;
                c8o.l(yqgVar);
                return yqgVar;
            case 3:
                nwt nwtVar = (nwt) ((e1o) pugVar.g).i;
                c8o.l(nwtVar);
                return nwtVar;
            case 4:
                mr20 mr20Var = (mr20) ((e1o) pugVar.g).j;
                c8o.l(mr20Var);
                c3s c3sVar = (c3s) ((e1o) pugVar.g).h;
                c8o.l(c3sVar);
                return new clm(mr20Var, c3sVar);
            case 5:
                ywp ywpVar = (ywp) pugVar.l;
                e1o e1oVar = (e1o) pugVar.g;
                ynb0 ynb0VarA = xqu.a(ywpVar);
                ywp ywpVar2 = (ywp) pugVar.m;
                ynb0 ynb0VarA2 = xqu.a((ywp) pugVar.n);
                h5q h5qVar = (h5q) e1oVar.o;
                c8o.l(h5qVar);
                b7r0 b7r0Var = (b7r0) e1oVar.l;
                c8o.l(b7r0Var);
                ynb0 ynb0VarA3 = xqu.a((ywp) pugVar.o);
                ynb0 ynb0VarA4 = xqu.a((ywp) pugVar.p);
                ov20 ov20Var = (ov20) e1oVar.k;
                c8o.l(ov20Var);
                yqg yqgVar2 = (yqg) ((ywp) pugVar.h).get();
                iac0 iac0Var = (iac0) e1oVar.C;
                n3d0 n3d0Var = (n3d0) e1oVar.p;
                c8o.l(n3d0Var);
                String str = (String) e1oVar.y;
                c8o.l(str);
                bn70 bn70Var = (bn70) e1oVar.A;
                g3q0 g3q0Var = (g3q0) e1oVar.s;
                c8o.l(g3q0Var);
                upp0 upp0Var = (upp0) e1oVar.I;
                c8o.l(upp0Var);
                return bhb.o(ynb0VarA, ywpVar2, ynb0VarA2, h5qVar, b7r0Var, ynb0VarA3, ynb0VarA4, ov20Var, yqgVar2, iac0Var, n3d0Var, str, bn70Var, g3q0Var, upp0Var, Optional.empty(), Optional.empty());
            case 6:
                return ((cyp) xqu.a((ywp) pugVar.k).get()).d();
            case 7:
                t8u0 t8u0Var = (t8u0) ((e1o) pugVar.g).z;
                c8o.l(t8u0Var);
                return t8u0Var.a(((iac0) ((e1o) pugVar.g).C).getLifecycle());
            case 8:
                return (PlayOrigin) ((e1o) pugVar.g).B;
            case 9:
                return ((cyp) xqu.a((ywp) pugVar.k).get()).a();
            case 10:
                xrc0 xrc0Var = (xrc0) ((e1o) pugVar.g).m;
                c8o.l(xrc0Var);
                return xrc0Var;
            case 11:
                zut0 zut0Var = (zut0) ((e1o) pugVar.g).n;
                c8o.l(zut0Var);
                return zut0Var.a(new lb3(xqu.a((ywp) pugVar.k), (byte) 6), xqu.a((ywp) pugVar.m));
            case 12:
                return new nyo(this, (byte) 6);
            case 13:
                ugn0 ugn0Var = (ugn0) ((e1o) pugVar.g).u;
                c8o.l(ugn0Var);
                return ugn0Var;
            case 14:
                return null;
            case 15:
                return new oyo(this, (byte) 7);
            case 16:
                return (ku71) xqu.a((ywp) pugVar.t).get();
            case 17:
                dma1 dma1Var = (dma1) ((e1o) pugVar.g).v;
                c8o.l(dma1Var);
                nfa0 nfa0Var = (nfa0) ((e1o) pugVar.g).J;
                c8o.l(nfa0Var);
                return new ku71(dma1Var, nfa0Var, new du71());
            case 18:
                i8h1 i8h1Var = (i8h1) ((e1o) pugVar.g).r;
                c8o.l(i8h1Var);
                return new hfw0(i8h1Var);
            case 19:
                return new nfw0(brt.x(), (ywp) pugVar.h, (ywp) pugVar.r, (ywp) pugVar.i, (ywp) pugVar.j, (ywp) pugVar.s, (ywp) pugVar.n, (ywp) pugVar.u, (jly0) pugVar.b);
            case 20:
                e1o e1oVar2 = (e1o) pugVar.g;
                e1o e1oVar3 = (e1o) pugVar.g;
                xfx xfxVar = (xfx) e1oVar2.w;
                c8o.l(xfxVar);
                lzn0 lzn0Var = (lzn0) e1oVar3.d;
                c8o.l(lzn0Var);
                agc0 agc0Var = (agc0) e1oVar3.x;
                c8o.l(agc0Var);
                gw70 gw70Var = (gw70) e1oVar3.c;
                c8o.l(gw70Var);
                return new luj(xfxVar, gw70Var, agc0Var, lzn0Var, false);
            case 21:
                return new ymp(this, (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object k() {
        wyp wypVar = (wyp) this.c;
        vi2 vi2Var = wypVar.a;
        byte b = this.b;
        if (b == 0) {
            return new p241((Observable) wypVar.b.get());
        }
        if (b != 1) {
            if (b == 2) {
                return new bw20((Observable) wypVar.b.get());
            }
            jah.e(b);
            return null;
        }
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(vi2Var.d().J(new qpp0((byte) 25)));
        dg90 dg90Var = new dg90(observableFromPublisher, new qx(wypVar.a(), vi2Var.a(), new ltw0((byte) 0)), (byte) 17);
        return lmt0.p(observableFromPublisher.distinctUntilChanged().switchMap(new jpa0(dg90Var, (byte) 12)), (Scheduler) vi2Var.c.get(), (q8n) vi2Var.d.get(), (db4) vi2Var.e.get(), vi2Var.a());
    }

    private final Object l() {
        sww0 sww0Var = (sww0) ((yjq) this.c).d;
        byte b = 0;
        byte b2 = this.b;
        if (b2 == 0) {
            return new wjq(this, b);
        }
        if (b2 != 1) {
            if (b2 == 2) {
                return new xjq(this, (byte) 0);
            }
            jah.e(b2);
            return null;
        }
        Scheduler scheduler = (Scheduler) sww0Var.f.get();
        c8o.l(scheduler);
        ma41 ma41Var = (ma41) sww0Var.h.get();
        c8o.l(ma41Var);
        return new lzw0(scheduler, ma41Var);
    }

    private final Object m() {
        byp bypVar = (byp) this.c;
        q7r0 q7r0Var = (q7r0) bypVar.d;
        k0x0 k0x0Var = (k0x0) bypVar.b;
        byte b = this.b;
        if (b == 0) {
            Scheduler scheduler = (Scheduler) k0x0Var.h.get();
            c8o.l(scheduler);
            ma41 ma41Var = (ma41) k0x0Var.j.get();
            c8o.l(ma41Var);
            return new lzw0(scheduler, ma41Var);
        }
        byte b2 = 1;
        if (b == 1) {
            return new wjq(this, b2);
        }
        if (b == 2) {
            return new xjq(this, (byte) 1);
        }
        if (b == 3) {
            return u1n0.z(q7r0Var);
        }
        if (b == 4) {
            l6h1 l6h1Var = (l6h1) q7r0Var.b(l6h1.class);
            c8o.m(l6h1Var);
            return l6h1Var;
        }
        if (b == 5) {
            return pzm.h((mos) k0x0Var.c.get());
        }
        jah.e(b);
        return null;
    }

    private final Object n() {
        qq qqVar = (qq) this.c;
        byte b = 21;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                n3x0 n3x0Var = (n3x0) qqVar.b;
                n3x0 n3x0Var2 = (n3x0) qqVar.b;
                g341 g341Var = (g341) n3x0Var.l.get();
                c8o.l(g341Var);
                bfd bfdVar = (bfd) n3x0Var2.V.get();
                c8o.l(bfdVar);
                v5n v5nVar = (v5n) n3x0Var2.r.get();
                c8o.l(v5nVar);
                zsc zscVarA = qqVar.a();
                o241 o241Var = (o241) n3x0Var2.i.get();
                c8o.l(o241Var);
                RetrofitMaker retrofitMaker = (RetrofitMaker) n3x0Var2.m.get();
                c8o.l(retrofitMaker);
                do70 do70Var = new do70(retrofitMaker);
                gdx0 gdx0Var = (gdx0) n3x0Var2.h.get();
                c8o.l(gdx0Var);
                Scheduler scheduler = (Scheduler) n3x0Var2.b.get();
                c8o.l(scheduler);
                add addVar = (add) n3x0Var2.Z.get();
                c8o.l(addVar);
                j0a1 j0a1Var = (j0a1) n3x0Var2.I.get();
                c8o.l(j0a1Var);
                Scheduler scheduler2 = (Scheduler) n3x0Var2.a.get();
                c8o.l(scheduler2);
                ov20 ov20Var = (ov20) n3x0Var2.R.get();
                c8o.l(ov20Var);
                q8n q8nVar = (q8n) n3x0Var2.d.get();
                c8o.l(q8nVar);
                b581 b581Var = (b581) n3x0Var2.S.get();
                c8o.l(b581Var);
                a981 a981Var = (a981) n3x0Var2.T.get();
                c8o.l(a981Var);
                k981 k981Var = (k981) n3x0Var2.U.get();
                c8o.l(k981Var);
                kbd kbdVar = (kbd) n3x0Var2.a0.get();
                c8o.l(kbdVar);
                f3x0 f3x0Var = new f3x0(ov20Var, q8nVar, b581Var, a981Var, k981Var, kbdVar);
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) n3x0Var2.m.get();
                c8o.l(retrofitMaker2);
                cfi1 cfi1Var = new cfi1(retrofitMaker2);
                q8n q8nVar2 = (q8n) n3x0Var2.e.get();
                c8o.l(q8nVar2);
                Scheduler scheduler3 = (Scheduler) n3x0Var2.c.get();
                c8o.l(scheduler3);
                return new k3x0(g341Var, bfdVar, v5nVar, zscVarA, o241Var, do70Var, gdx0Var, scheduler, addVar, j0a1Var, scheduler2, f3x0Var, cfi1Var, q8nVar2, scheduler3);
            case 1:
                egq egqVar = (egq) ((n3x0) qqVar.b).b0.get();
                c8o.l(egqVar);
                return new t5w((d0r) ((jly0) qqVar.f).get(), egqVar.a.c.O0());
            case 2:
                return cwl1.C((q7r0) qqVar.a);
            case 3:
                pgq pgqVar = (pgq) ((n3x0) qqVar.b).c0.get();
                c8o.l(pgqVar);
                return new q5w((d0r) ((jly0) qqVar.f).get(), pgqVar.a.c.O0());
            case 4:
                return new zjq(this);
            case 5:
                n3x0 n3x0Var3 = (n3x0) qqVar.b;
                q7r0 q7r0Var = (q7r0) qqVar.a;
                n3x0 n3x0Var4 = (n3x0) qqVar.b;
                Scheduler scheduler4 = (Scheduler) n3x0Var3.a.get();
                c8o.l(scheduler4);
                Scheduler scheduler5 = (Scheduler) n3x0Var4.b.get();
                c8o.l(scheduler5);
                Scheduler scheduler6 = (Scheduler) n3x0Var4.c.get();
                c8o.l(scheduler6);
                q8n q8nVar3 = (q8n) n3x0Var4.e.get();
                c8o.l(q8nVar3);
                lzn0 lzn0Var = (lzn0) n3x0Var4.n.get();
                c8o.l(lzn0Var);
                i8h1 i8h1VarZ = u1n0.z(q7r0Var);
                zsc zscVar = new zsc(lzn0Var, i8h1VarZ, qqVar.c(), new hvp0((y3x0) qqVar.c, b));
                zsc zscVarA2 = qqVar.a();
                kt91 kt91Var = (kt91) n3x0Var4.k.get();
                c8o.l(kt91Var);
                o3x0 o3x0Var = (o3x0) ((ywp) qqVar.i).get();
                c4n0 c4n0Var = new c4n0(q7r0Var);
                jl21 jl21Var = (jl21) n3x0Var4.x.get();
                c8o.l(jl21Var);
                od90 od90Var = (od90) n3x0Var4.E.get();
                c8o.l(od90Var);
                j0j0 j0j0Var = (j0j0) n3x0Var4.D.get();
                c8o.l(j0j0Var);
                d7b d7bVar = (d7b) n3x0Var4.B.get();
                c8o.l(d7bVar);
                oh41 oh41Var = (oh41) n3x0Var4.y.get();
                c8o.l(oh41Var);
                igh1 igh1Var = (igh1) n3x0Var4.A.get();
                c8o.l(igh1Var);
                i4q i4qVar = (i4q) n3x0Var4.v.get();
                c8o.l(i4qVar);
                ae71 ae71Var = (ae71) n3x0Var4.w.get();
                c8o.l(ae71Var);
                i7x0 i7x0Var = (i7x0) n3x0Var4.C.get();
                c8o.l(i7x0Var);
                okw0 okw0Var = (okw0) n3x0Var4.z.get();
                c8o.l(okw0Var);
                boolean zBooleanValue = ((Boolean) n3x0Var4.J.get()).booleanValue();
                wmy wmyVarD = qqVar.d();
                x860 x860Var = (x860) n3x0Var4.K.get();
                c8o.l(x860Var);
                hgd0 hgd0Var = (hgd0) n3x0Var4.N.get();
                c8o.l(hgd0Var);
                jed0 jed0Var = (jed0) n3x0Var4.M.get();
                c8o.l(jed0Var);
                vcd0 vcd0Var = (vcd0) n3x0Var4.L.get();
                c8o.l(vcd0Var);
                gdx0 gdx0Var2 = (gdx0) n3x0Var4.h.get();
                c8o.l(gdx0Var2);
                y621 y621Var = (y621) n3x0Var4.F.get();
                c8o.l(y621Var);
                egd egdVar = (egd) n3x0Var4.G.get();
                c8o.l(egdVar);
                eb ebVar = (eb) n3x0Var4.H.get();
                c8o.l(ebVar);
                m1x0 m1x0Var = new m1x0(c4n0Var, jl21Var, od90Var, j0j0Var, d7bVar, oh41Var, igh1Var, i4qVar, ae71Var, i7x0Var, okw0Var, zBooleanValue, wmyVarD, x860Var, hgd0Var, jed0Var, vcd0Var, gdx0Var2, y621Var, egdVar, ebVar);
                dg30 dg30Var = (dg30) n3x0Var4.o.get();
                c8o.l(dg30Var);
                e630 e630Var = (e630) n3x0Var4.u.get();
                c8o.l(e630Var);
                bfd bfdVar2 = (bfd) n3x0Var4.V.get();
                c8o.l(bfdVar2);
                wmy wmyVarD2 = qqVar.d();
                c4n0 c4n0Var2 = new c4n0(q7r0Var);
                oxi0 oxi0VarC = qqVar.c();
                j0a1 j0a1Var2 = (j0a1) n3x0Var4.I.get();
                c8o.l(j0a1Var2);
                i8h1 i8h1VarZ2 = u1n0.z(q7r0Var);
                gw70 gw70VarB = ((zuj) qqVar.d).b();
                c8o.l(gw70VarB);
                dg30 dg30Var2 = (dg30) n3x0Var4.o.get();
                c8o.l(dg30Var2);
                hz5 hz5Var = new hz5((byte) 10);
                q8n q8nVar4 = (q8n) n3x0Var4.f.get();
                c8o.l(q8nVar4);
                bo71 bo71Var = (bo71) n3x0Var4.X.get();
                c8o.l(bo71Var);
                m771 m771Var = (m771) n3x0Var4.Y.get();
                c8o.l(m771Var);
                smp0 smp0Var = new smp0(q8nVar4, bo71Var, m771Var);
                eq80 eq80Var = (eq80) ((jly0) qqVar.j).get();
                gdx0 gdx0Var3 = (gdx0) n3x0Var4.h.get();
                c8o.l(gdx0Var3);
                kp5 kp5Var = new kp5(i8h1VarZ2, gw70VarB, dg30Var2, hz5Var, smp0Var, eq80Var, gdx0Var3);
                r35 r35Var = (r35) n3x0Var4.W.get();
                c8o.l(r35Var);
                return new w6x0(scheduler4, scheduler5, scheduler6, q8nVar3, zscVar, zscVarA2, kt91Var, o3x0Var, m1x0Var, dg30Var, e630Var, bfdVar2, wmyVarD2, c4n0Var2, oxi0VarC, j0a1Var2, kp5Var, r35Var, (k3x0) ((jly0) qqVar.e).get());
            case 6:
                return new o3x0(u1n0.z((q7r0) qqVar.a), new hvp0((y3x0) qqVar.c, b));
            case 7:
                q7r0 q7r0Var2 = (q7r0) qqVar.a;
                return new eq80(new e3h1((l6h1) q7r0Var2.b(l6h1.class), cwl1.G(q7r0Var2), cwl1.H(q7r0Var2)));
            case 8:
                return new akq(this);
            case 9:
                zcx0 zcx0Var = (zcx0) ((n3x0) qqVar.b).O.get();
                c8o.l(zcx0Var);
                t5w t5wVar = (t5w) ((jly0) qqVar.g).get();
                n3x0 n3x0Var5 = (n3x0) qqVar.b;
                t6w t6wVar = (t6w) n3x0Var5.d0.get();
                c8o.l(t6wVar);
                d0r d0rVar = (d0r) ((jly0) qqVar.f).get();
                q7r0 q7r0Var3 = (q7r0) qqVar.a;
                p3x0 p3x0Var = new p3x0(t6wVar, d0rVar, q7r0Var3, (byte) 0);
                t6w t6wVar2 = (t6w) n3x0Var5.e0.get();
                c8o.l(t6wVar2);
                p3x0 p3x0Var2 = new p3x0(t6wVar2, (d0r) ((jly0) qqVar.f).get(), q7r0Var3, (byte) 1);
                t6w t6wVar3 = (t6w) n3x0Var5.f0.get();
                c8o.l(t6wVar3);
                gg11 gg11VarJ = j380.j("editor_albums", p3x0Var, "editor_curated_playlists", p3x0Var2, "editor_track_of_the_week", new p3x0(t6wVar3, (d0r) ((jly0) qqVar.f).get(), q7r0Var3, (byte) 2));
                yqu0 yqu0Var = zcx0Var.a;
                wfq wfqVar = (wfq) yqu0Var.b;
                LinkedHashMap linkedHashMapO = sqg0.O((gg11) yqu0Var.c, gg11VarJ);
                wfqVar.getClass();
                thq thqVar = wfqVar.a;
                return new sdx0(thqVar.c.O0(), (Scheduler) thqVar.b.z1.get(), t5wVar, linkedHashMapO);
            case 10:
                return new bkq(this);
            case 11:
                z7e0 z7e0Var = (z7e0) ((n3x0) qqVar.b).g.get();
                c8o.l(z7e0Var);
                return z7e0Var;
            case 12:
                q7e0 q7e0VarG = ((zuj) qqVar.d).g();
                c8o.l(q7e0VarG);
                zuj zujVar = (zuj) qqVar.d;
                gw70 gw70VarB2 = zujVar.b();
                pe peVarA = byo.a(gw70VarB2, zujVar);
                c8o.l(zujVar.f());
                return new yuj(q7e0VarG, new q3b1(gw70VarB2, peVarA));
            case 13:
                return new ckq(this);
            default:
                jah.e(b2);
                return null;
        }
    }

    public final Object get() {
        ubx0 rbx0Var;
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.c;
        byte b3 = this.b;
        switch (b) {
            case 0:
                p410 p410Var = (p410) ((g1i) obj).b;
                if (b3 == 0) {
                    return new wwp(this);
                }
                if (b3 == 1) {
                    String str = (String) p410Var.c;
                    Single singleOnErrorReturnItem = ((v5n) p410Var.f).a(str).onErrorReturnItem("");
                    xrc0 xrc0Var = (xrc0) p410Var.d;
                    c8o.l(xrc0Var);
                    return new qfc0(str, singleOnErrorReturnItem, xrc0Var, (agc0) p410Var.g);
                }
                if (b3 == 2) {
                    return new xwp(this);
                }
                if (b3 == 3) {
                    return (g35) p410Var.h;
                }
                jah.e(b3);
                return null;
            case 1:
                phi0 phi0Var = (phi0) ((cp31) obj).a;
                if (b3 == 0) {
                    o241 o241Var = (o241) phi0Var.b;
                    c8o.l(o241Var);
                    return o241Var;
                }
                if (b3 == 1) {
                    luw0 luw0Var = (luw0) phi0Var.c;
                    c8o.l(luw0Var);
                    return luw0Var;
                }
                if (b3 == 2) {
                    RxRouter rxRouter = (RxRouter) phi0Var.d;
                    c8o.l(rxRouter);
                    return new byp0(new vpp0(new CosmosTransport(new rtp0(rxRouter))));
                }
                if (b3 == 3) {
                    dma1 dma1Var = (dma1) phi0Var.e;
                    c8o.l(dma1Var);
                    return dma1Var;
                }
                if (b3 != 4) {
                    jah.e(b3);
                    return null;
                }
                Scheduler scheduler = (Scheduler) phi0Var.f;
                c8o.l(scheduler);
                return scheduler;
            case 2:
                axp axpVar = (axp) obj;
                i7d i7dVar = axpVar.a;
                if (b3 == 0) {
                    return new rwj(axpVar.b(), (k7d) i7dVar.d, new wb2((dg30) i7dVar.Y, (lzn0) i7dVar.X, (i3j0) i7dVar.t, axpVar.b), (m971) i7dVar.c, axpVar.a());
                }
                if (b3 == 1) {
                    return (a1r0) i7dVar.i;
                }
                if (b3 == 2) {
                    return new pki1((add) i7dVar.e, (pni1) i7dVar.P0);
                }
                jah.e(b3);
                return null;
            case 3:
                qq qqVar = (qq) obj;
                switch (b3) {
                    case 0:
                        gw70 gw70Var = (gw70) ((sgq0) qqVar.a).c.get();
                        c8o.l(gw70Var);
                        return gw70Var;
                    case 1:
                        pe peVar = (pe) ((sgq0) qqVar.a).e.get();
                        c8o.l(peVar);
                        return peVar;
                    case 2:
                        jtl1 jtl1Var = (jtl1) ((sgq0) qqVar.a).d.get();
                        c8o.l(jtl1Var);
                        return jtl1Var;
                    case 3:
                        return new bxp(this);
                    case 4:
                        return pzm.h((mos) ((nbq0) qqVar.b).n.get());
                    case 5:
                        ynb0 ynb0VarA = xqu.a((ywp) qqVar.k);
                        ynb0 ynb0VarA2 = xqu.a((ywp) qqVar.m);
                        l9g0 l9g0Var = new l9g0((byte) 24);
                        l9g0Var.b = ynb0VarA;
                        l9g0Var.c = ynb0VarA2;
                        return l9g0Var;
                    case 6:
                        ywp ywpVar = (ywp) qqVar.j;
                        nct nctVar = new nct();
                        nctVar.a = ywpVar;
                        return nctVar;
                    case 7:
                        return new a9w0((m9w0) ((jly0) qqVar.i).get());
                    case 8:
                        RetrofitMaker retrofitMaker = (RetrofitMaker) ((nbq0) qqVar.b).c.get();
                        c8o.l(retrofitMaker);
                        return (m9w0) retrofitMaker.createWebgateService(m9w0.class, "android-bluejay-data-impl");
                    case 9:
                        ywp ywpVar2 = (ywp) qqVar.e;
                        ywp ywpVar3 = (ywp) qqVar.d;
                        ywp ywpVar4 = (ywp) qqVar.l;
                        ywp ywpVar5 = (ywp) qqVar.f;
                        mvj mvjVar = new mvj((byte) 1);
                        mvjVar.b = ywpVar2;
                        mvjVar.c = ywpVar3;
                        mvjVar.d = ywpVar4;
                        mvjVar.e = ywpVar5;
                        return mvjVar;
                    case 10:
                        a8e0 a8e0Var = (a8e0) ((sgq0) qqVar.a).a.get();
                        c8o.l(a8e0Var);
                        return a8e0Var;
                    case 11:
                        ynb0 ynb0VarA3 = xqu.a((ywp) qqVar.o);
                        ynb0 ynb0VarA4 = xqu.a((ywp) qqVar.p);
                        l9g0 l9g0Var2 = new l9g0((byte) 23);
                        l9g0Var2.b = ynb0VarA3;
                        l9g0Var2.c = ynb0VarA4;
                        return l9g0Var2;
                    case 12:
                        ywp ywpVar6 = (ywp) qqVar.j;
                        mct mctVar = new mct();
                        mctVar.a = ywpVar6;
                        return mctVar;
                    case 13:
                        ywp ywpVar7 = (ywp) qqVar.e;
                        ywp ywpVar8 = (ywp) qqVar.d;
                        ywp ywpVar9 = (ywp) qqVar.l;
                        ywp ywpVar10 = (ywp) qqVar.f;
                        mvj mvjVar2 = new mvj((byte) 0);
                        mvjVar2.b = ywpVar7;
                        mvjVar2.c = ywpVar8;
                        mvjVar2.d = ywpVar9;
                        mvjVar2.e = ywpVar10;
                        return mvjVar2;
                    case 14:
                        r2r r2rVar = (r2r) ((nbq0) qqVar.b).h.get();
                        c8o.l(r2rVar);
                        return new n1n0(r2rVar);
                    default:
                        jah.e(b3);
                        return null;
                }
            case 4:
                gxp gxpVar = (gxp) obj;
                switch (b3) {
                    case 0:
                        return new exp(this);
                    case 1:
                        return new ujp(this, b2);
                    case 2:
                        return new iae1((o0e1) gxpVar.b.get(), gxpVar.a.e);
                    case 3:
                        return new o0e1();
                    case 4:
                        return new sj30(new j8o());
                    case 5:
                        return new ri41(gxpVar.a.e);
                    case 6:
                        return new a4d((q4d) gxpVar.g.get(), new qj0((q4d) gxpVar.g.get(), (ems0) gxpVar.h.get()), (sj30) gxpVar.d.get());
                    case 7:
                        qsq0 qsq0Var = gxpVar.a;
                        qsq0 qsq0Var2 = gxpVar.a;
                        zhq0 zhq0VarK = qsq0Var.j.k();
                        c8o.m(zhq0VarK);
                        jc9 jc9Var = qsq0Var2.k;
                        c8o.l(jc9Var);
                        iac0 iac0VarE = qsq0Var2.j.e();
                        c8o.m(iac0VarE);
                        return new q4d(zhq0VarK, jc9Var, iac0VarE);
                    case 8:
                        qsq0 qsq0Var3 = gxpVar.a;
                        return new ems0(qsq0Var3.a, qsq0Var3.j);
                    case 9:
                        return new vep((byte) 1);
                    case 10:
                        return new fxp();
                    case 11:
                        qsq0 qsq0Var4 = gxpVar.a;
                        return qsq0Var4.f.a(qsq0Var4.j.g().d.c.getLifecycle()).a();
                    default:
                        jah.e(b3);
                        return null;
                }
            case 5:
                ib3 ib3Var = (ib3) obj;
                switch (b3) {
                    case 0:
                        return cwl1.C((q7r0) ib3Var.b);
                    case 1:
                        ynb0 ynb0VarA5 = xqu.a((ywp) ib3Var.f);
                        mc3 mc3Var = new mc3((byte) 2);
                        mc3Var.b = ynb0VarA5;
                        return mc3Var;
                    case 2:
                        ywp ywpVar11 = (ywp) ib3Var.d;
                        ywp ywpVar12 = (ywp) ib3Var.e;
                        ciz cizVar = new ciz();
                        cizVar.a = ywpVar11;
                        cizVar.b = ywpVar12;
                        return cizVar;
                    case 3:
                        qyj qyjVar = (qyj) ((r8r0) ib3Var.a).a.get();
                        c8o.l(qyjVar);
                        return qyjVar;
                    case 4:
                        Boolean bool = (Boolean) ((r8r0) ib3Var.a).t.get();
                        bool.getClass();
                        return bool;
                    case 5:
                        ynb0 ynb0VarA6 = xqu.a((ywp) ib3Var.m);
                        eh50 eh50Var = new eh50((byte) 8);
                        eh50Var.b = ynb0VarA6;
                        return eh50Var;
                    case 6:
                        ywp ywpVar13 = (ywp) ib3Var.d;
                        ywp ywpVar14 = (ywp) ib3Var.h;
                        ywp ywpVar15 = (ywp) ib3Var.i;
                        ywp ywpVar16 = (ywp) ib3Var.j;
                        ywp ywpVar17 = (ywp) ib3Var.k;
                        ywp ywpVar18 = (ywp) ib3Var.l;
                        f880 f880Var = new f880();
                        f880Var.a = ywpVar13;
                        f880Var.b = ywpVar14;
                        f880Var.c = ywpVar15;
                        f880Var.d = ywpVar16;
                        f880Var.e = ywpVar17;
                        f880Var.f = ywpVar18;
                        return f880Var;
                    case 7:
                        Activity activity = (Activity) ((r8r0) ib3Var.a).g.get();
                        c8o.l(activity);
                        return activity;
                    case 8:
                        RetrofitMaker retrofitMaker2 = (RetrofitMaker) ((r8r0) ib3Var.a).k.get();
                        c8o.l(retrofitMaker2);
                        return retrofitMaker2;
                    case 9:
                        yqg yqgVar = (yqg) ((r8r0) ib3Var.a).r.get();
                        c8o.l(yqgVar);
                        return yqgVar;
                    case 10:
                        luk lukVar = (luk) ((r8r0) ib3Var.a).j.get();
                        c8o.l(lukVar);
                        return lukVar;
                    case 11:
                        q8n q8nVar = (q8n) ((r8r0) ib3Var.a).o.get();
                        c8o.l(q8nVar);
                        return q8nVar;
                    case 12:
                        ynb0 ynb0VarA7 = xqu.a((ywp) ib3Var.B);
                        g561 g561Var = new g561((byte) 18);
                        g561Var.b = ynb0VarA7;
                        return g561Var;
                    case 13:
                        ywp ywpVar19 = (ywp) ib3Var.d;
                        ywp ywpVar20 = (ywp) ib3Var.o;
                        ywp ywpVar21 = (ywp) ib3Var.p;
                        ywp ywpVar22 = (ywp) ib3Var.q;
                        ywp ywpVar23 = (ywp) ib3Var.r;
                        ywp ywpVar24 = (ywp) ib3Var.s;
                        ywp ywpVar25 = (ywp) ib3Var.t;
                        ywp ywpVar26 = (ywp) ib3Var.u;
                        ywp ywpVar27 = (ywp) ib3Var.v;
                        ywp ywpVar28 = (ywp) ib3Var.k;
                        ywp ywpVar29 = (ywp) ib3Var.w;
                        ywp ywpVar30 = (ywp) ib3Var.x;
                        ywp ywpVar31 = (ywp) ib3Var.y;
                        ywp ywpVar32 = (ywp) ib3Var.z;
                        ywp ywpVar33 = (ywp) ib3Var.A;
                        isc1 isc1Var = new isc1();
                        isc1Var.a = ywpVar19;
                        isc1Var.b = ywpVar20;
                        isc1Var.c = ywpVar21;
                        isc1Var.d = ywpVar22;
                        isc1Var.e = ywpVar23;
                        isc1Var.f = ywpVar24;
                        isc1Var.g = ywpVar25;
                        isc1Var.h = ywpVar26;
                        isc1Var.i = ywpVar27;
                        isc1Var.j = ywpVar28;
                        isc1Var.k = ywpVar29;
                        isc1Var.l = ywpVar30;
                        isc1Var.m = ywpVar31;
                        isc1Var.n = ywpVar32;
                        isc1Var.o = ywpVar33;
                        return isc1Var;
                    case 14:
                        pp11 pp11Var = (pp11) ((r8r0) ib3Var.a).l.get();
                        c8o.l(pp11Var);
                        return pp11Var;
                    case 15:
                        CallbackRouter callbackRouter = (CallbackRouter) ((r8r0) ib3Var.a).s.get();
                        c8o.l(callbackRouter);
                        return callbackRouter;
                    case 16:
                        kt91 kt91Var = (kt91) ((r8r0) ib3Var.a).m.get();
                        c8o.l(kt91Var);
                        return kt91Var;
                    case 17:
                        n9r0 n9r0Var = (n9r0) ((r8r0) ib3Var.a).u.get();
                        c8o.l(n9r0Var);
                        return n9r0Var;
                    case 18:
                        mwm1 mwm1Var = (mwm1) ((r8r0) ib3Var.a).v.get();
                        c8o.l(mwm1Var);
                        return mwm1Var;
                    case 19:
                        ccc0 ccc0Var = (ccc0) ((r8r0) ib3Var.a).w.get();
                        c8o.l(ccc0Var);
                        return ccc0Var;
                    case 20:
                        i1r0 i1r0Var = (i1r0) ((r8r0) ib3Var.a).x.get();
                        c8o.l(i1r0Var);
                        return i1r0Var;
                    case 21:
                        y390 y390Var = (y390) ((r8r0) ib3Var.a).y.get();
                        c8o.l(y390Var);
                        return y390Var;
                    case 22:
                        six0 six0Var = (six0) ((r8r0) ib3Var.a).q.get();
                        c8o.l(six0Var);
                        return six0Var;
                    case 23:
                        peq peqVar = (peq) ((r8r0) ib3Var.a).z.get();
                        c8o.l(peqVar);
                        return peqVar;
                    case 24:
                        qeq qeqVar = (qeq) ((r8r0) ib3Var.a).A.get();
                        c8o.l(qeqVar);
                        return qeqVar;
                    case 25:
                        t8u0 t8u0Var = (t8u0) ((r8r0) ib3Var.a).B.get();
                        c8o.l(t8u0Var);
                        return t8u0Var;
                    case 26:
                        Flowable flowable = (Flowable) ((r8r0) ib3Var.a).C.get();
                        c8o.l(flowable);
                        return flowable;
                    case 27:
                        ynb0 ynb0VarA8 = xqu.a((ywp) ib3Var.F);
                        egn0 egn0Var = new egn0((byte) 13);
                        egn0Var.b = ynb0VarA8;
                        return egn0Var;
                    case 28:
                        ywp ywpVar34 = (ywp) ib3Var.d;
                        ywp ywpVar35 = (ywp) ib3Var.h;
                        ywp ywpVar36 = (ywp) ib3Var.i;
                        ywp ywpVar37 = (ywp) ib3Var.k;
                        ywp ywpVar38 = (ywp) ib3Var.j;
                        ywp ywpVar39 = (ywp) ib3Var.w;
                        ywp ywpVar40 = (ywp) ib3Var.z;
                        ywp ywpVar41 = (ywp) ib3Var.A;
                        ywp ywpVar42 = (ywp) ib3Var.D;
                        ywp ywpVar43 = (ywp) ib3Var.r;
                        ywp ywpVar44 = (ywp) ib3Var.E;
                        bsq0 bsq0Var = new bsq0();
                        bsq0Var.a = ywpVar34;
                        bsq0Var.b = ywpVar35;
                        bsq0Var.c = ywpVar36;
                        bsq0Var.d = ywpVar37;
                        bsq0Var.e = ywpVar38;
                        bsq0Var.f = ywpVar39;
                        bsq0Var.g = ywpVar40;
                        bsq0Var.h = ywpVar41;
                        bsq0Var.i = ywpVar42;
                        bsq0Var.j = ywpVar43;
                        bsq0Var.k = ywpVar44;
                        return bsq0Var;
                    case 29:
                        q6q q6qVar = (q6q) ((r8r0) ib3Var.a).E.get();
                        c8o.l(q6qVar);
                        return q6qVar;
                    case 30:
                        i8h1 i8h1Var = (i8h1) ((r8r0) ib3Var.a).D.get();
                        c8o.l(i8h1Var);
                        return i8h1Var;
                    case 31:
                        return new hxp(this);
                    case 32:
                        r2r r2rVar2 = (r2r) ((r8r0) ib3Var.a).f.get();
                        c8o.l(r2rVar2);
                        return new n1n0(r2rVar2);
                    default:
                        jah.e(b3);
                        return null;
                }
            case 6:
                a680 a680Var = (a680) obj;
                qsr0 qsr0Var = (qsr0) a680Var.a;
                if (b3 == 0) {
                    return pzm.h((mos) qsr0Var.c.get());
                }
                if (b3 == 1) {
                    lzn0 lzn0Var = (lzn0) qsr0Var.d.get();
                    c8o.l(lzn0Var);
                    return lzn0Var;
                }
                if (b3 == 2) {
                    z710 z710Var = (z710) qsr0Var.e.get();
                    c8o.l(z710Var);
                    return z710Var;
                }
                if (b3 == 3) {
                    return u1n0.z((q7r0) a680Var.b);
                }
                jah.e(b3);
                return null;
            case 7:
                if (b3 == 0) {
                    return new rxp(this);
                }
                if (b3 == 1) {
                    return new sxp(this);
                }
                if (b3 == 2) {
                    return new txp(this);
                }
                if (b3 == 3) {
                    return new uxp();
                }
                if (b3 == 4) {
                    return new vxp();
                }
                jah.e(b3);
                return null;
            case 8:
                r0s0 r0s0Var = (r0s0) ((qqp) obj).d;
                if (b3 == 0) {
                    zor zorVar = (zor) r0s0Var.b;
                    c8o.l(zorVar);
                    return zorVar;
                }
                if (b3 == 1) {
                    dfs dfsVar = (dfs) r0s0Var.c;
                    c8o.l(dfsVar);
                    return dfsVar;
                }
                if (b3 != 2) {
                    jah.e(b3);
                    return null;
                }
                efs efsVar = (efs) r0s0Var.d;
                c8o.l(efsVar);
                return new ffs(efsVar);
            case 9:
                pug pugVar = (pug) ((p2o0) obj).b;
                if (b3 == 0) {
                    return new yxp(this);
                }
                if (b3 == 1) {
                    return new zxp(this);
                }
                if (b3 == 2) {
                    return new ayp(this);
                }
                if (b3 == 3) {
                    ez11 ez11Var = (ez11) pugVar.d;
                    c8o.l(ez11Var);
                    return new pm4(ez11Var);
                }
                if (b3 != 4) {
                    jah.e(b3);
                    return null;
                }
                dpb dpbVar = (dpb) pugVar.e;
                c8o.l(dpbVar);
                return dpbVar;
            case 10:
                qqp qqpVar = (qqp) obj;
                r0s0 r0s0Var2 = (r0s0) qqpVar.d;
                if (b3 == 0) {
                    tau0 tau0Var = (tau0) r0s0Var2.c;
                    c8o.l(tau0Var);
                    return tau0Var.a();
                }
                if (b3 == 1) {
                    ynb0 ynb0VarA9 = xqu.a((ywp) qqpVar.b);
                    yqg yqgVar2 = (yqg) r0s0Var2.b;
                    c8o.l(yqgVar2);
                    return f2u0.r(ynb0VarA9, new cve0(yqgVar2));
                }
                if (b3 != 2) {
                    jah.e(b3);
                    return null;
                }
                RxRouter rxRouter2 = (RxRouter) r0s0Var2.d;
                c8o.l(rxRouter2);
                return sdl.q(rxRouter2);
            case 11:
                byp bypVar = (byp) obj;
                a7u0 a7u0Var = (a7u0) bypVar.b;
                switch (b3) {
                    case 0:
                        return pzm.h((mos) a7u0Var.e.get());
                    case 1:
                        n3v n3vVar = (n3v) a7u0Var.c.get();
                        c8o.l(n3vVar);
                        lut0 lut0Var = (lut0) a7u0Var.d.get();
                        c8o.l(lut0Var);
                        ywp ywpVar45 = (ywp) bypVar.g;
                        Resources resources = (Resources) a7u0Var.b.get();
                        c8o.l(resources);
                        return new smp0(n3vVar, lut0Var, ywpVar45, new yna0(resources, false));
                    case 2:
                        return new d70(new ksk0(k4s0.c(((b7u0) bypVar.c).a)), xqu.a((ywp) bypVar.f));
                    case 3:
                        return new vy40(xqu.a((ywp) bypVar.d), xqu.a((jly0) bypVar.a), xqu.a((ywp) bypVar.e));
                    case 4:
                        lzn0 lzn0Var2 = (lzn0) a7u0Var.a.get();
                        c8o.l(lzn0Var2);
                        return lzn0Var2;
                    case 5:
                        q8n q8nVar2 = (q8n) a7u0Var.g.get();
                        c8o.l(q8nVar2);
                        return q8nVar2;
                    case 6:
                        xm41 xm41Var = (xm41) a7u0Var.f.get();
                        c8o.l(xm41Var);
                        return xm41Var;
                    default:
                        jah.e(b3);
                        return null;
                }
            case 12:
                qqp qqpVar2 = (qqp) obj;
                sjq0 sjq0Var = (sjq0) qqpVar2.d;
                if (b3 == 0) {
                    return f2u0.q(xqu.a((ywp) qqpVar2.e), (cve0) ((ywp) qqpVar2.b).get());
                }
                if (b3 == 1) {
                    RxRouter rxRouter3 = (RxRouter) sjq0Var.b;
                    c8o.l(rxRouter3);
                    return sdl.q(rxRouter3);
                }
                if (b3 != 2) {
                    jah.e(b3);
                    return null;
                }
                yqg yqgVar3 = (yqg) sjq0Var.c;
                c8o.l(yqgVar3);
                return new cve0(yqgVar3);
            case 13:
                dyp dypVar = (dyp) obj;
                uau0 uau0Var = dypVar.a;
                if (b3 == 0) {
                    return sdl.q((RxRouter) uau0Var.a.get());
                }
                if (b3 == 1) {
                    zeu0 zeu0Var = (zeu0) dypVar.c.get();
                    if (new xt4(false, (luk) uau0Var.d.get()).a()) {
                        return new LeakDebugLoggingFlowable(zeu0Var.c());
                    }
                    Flowable flowableC = zeu0Var.c();
                    flowableC.getClass();
                    return flowableC;
                }
                if (b3 != 2) {
                    jah.e(b3);
                    return null;
                }
                RxRouter rxRouter4 = (RxRouter) uau0Var.a.get();
                boolean zA = new lx4(false, (luk) uau0Var.d.get()).a();
                return new ptc(new vuz(new ujm(new CosmosTransport(new sn0(rxRouter4, (byte) 24))), Schedulers.b, zA));
            case 14:
                return b();
            case 15:
                return c();
            case 16:
                return d();
            case 17:
                wj3 wj3Var = (wj3) obj;
                switch (b3) {
                    case 0:
                        h7v0 h7v0Var = (h7v0) wj3Var.b;
                        h7v0 h7v0Var2 = (h7v0) wj3Var.b;
                        lzn0 lzn0Var3 = (lzn0) h7v0Var.g.get();
                        c8o.l(lzn0Var3);
                        dsb1 dsb1Var = (dsb1) ((jly0) wj3Var.f).get();
                        eny enyVar = (eny) h7v0Var2.d.get();
                        c8o.l(enyVar);
                        zfr zfrVar = new zfr(xqu.a((ywp) wj3Var.g), (kpl0) ((jly0) wj3Var.h).get(), (byte) 18);
                        dir dirVar = (dir) ((jly0) wj3Var.d).get();
                        xhr xhrVar = (xhr) ((jly0) wj3Var.X).get();
                        kt8 kt8Var = (kt8) h7v0Var2.b.get();
                        c8o.l(kt8Var);
                        eqs eqsVar = (eqs) ((jly0) wj3Var.Z).get();
                        h0s h0sVar = (h0s) ((jly0) wj3Var.N0).get();
                        otr otrVar = (otr) ((jly0) wj3Var.O0).get();
                        boolean zA2 = wj3Var.c().a();
                        boolean zC = wj3Var.c().c();
                        frh1 frh1Var = (frh1) h7v0Var2.u.get();
                        c8o.l(frh1Var);
                        nvh1 nvh1Var = (nvh1) h7v0Var2.v.get();
                        c8o.l(nvh1Var);
                        kuw0 kuw0Var = new kuw0((byte) 17);
                        q8n q8nVar3 = (q8n) h7v0Var2.q.get();
                        c8o.l(q8nVar3);
                        Scheduler scheduler2 = (Scheduler) h7v0Var2.m.get();
                        c8o.l(scheduler2);
                        return new dgs(lzn0Var3, dsb1Var, enyVar, zfrVar, dirVar, xhrVar, kt8Var, eqsVar, h0sVar, otrVar, zA2, zC, frh1Var, nvh1Var, kuw0Var, q8nVar3, scheduler2);
                    case 1:
                        Context context = (Context) ((h7v0) wj3Var.b).a.get();
                        c8o.l(context);
                        return new dsb1(context, (air) ((jly0) wj3Var.e).get(), wj3Var.c().d());
                    case 2:
                        dir dirVar2 = (dir) ((jly0) wj3Var.d).get();
                        kt8 kt8Var2 = (kt8) ((h7v0) wj3Var.b).b.get();
                        c8o.l(kt8Var2);
                        return new air(dirVar2, kt8Var2);
                    case 3:
                        h7v0 h7v0Var3 = (h7v0) wj3Var.b;
                        h7v0 h7v0Var4 = (h7v0) wj3Var.b;
                        mt8 mt8Var = (mt8) h7v0Var3.c.get();
                        c8o.l(mt8Var);
                        x3v0 x3v0Var = (x3v0) h7v0Var4.h.get();
                        c8o.l(x3v0Var);
                        b7n b7nVar = (b7n) h7v0Var4.k.get();
                        c8o.l(b7nVar);
                        o241 o241Var2 = (o241) h7v0Var4.e.get();
                        c8o.l(o241Var2);
                        uu00 uu00Var = (uu00) h7v0Var4.n.get();
                        c8o.l(uu00Var);
                        return new dir(mt8Var, x3v0Var, b7nVar, o241Var2, uu00Var);
                    case 4:
                        i8h1 i8h1Var2 = (i8h1) ((h7v0) wj3Var.b).l.get();
                        c8o.l(i8h1Var2);
                        return i8h1Var2;
                    case 5:
                        return new kpl0(((g7v0) wj3Var.c).O0().getString("key.showuri", ""));
                    case 6:
                        kt91 kt91Var2 = (kt91) ((h7v0) wj3Var.b).f.get();
                        c8o.l(kt91Var2);
                        nuu nuuVar = (nuu) ((h7v0) wj3Var.b).i.get();
                        c8o.l(nuuVar);
                        return new xhr(kt91Var2, nuuVar, (yhr) ((jly0) wj3Var.t).get());
                    case 7:
                        return new yhr(xqu.a((ywp) wj3Var.g), (uol0) ((jly0) wj3Var.i).get());
                    case 8:
                        return new uol0(((kpl0) ((jly0) wj3Var.h).get()).b());
                    case 9:
                        return new eqs((z3u0) ((jly0) wj3Var.Y).get());
                    case 10:
                        CallbackRouter callbackRouter2 = (CallbackRouter) ((h7v0) wj3Var.b).f27p.get();
                        c8o.l(callbackRouter2);
                        return new z3u0(new CosmosCoroutineTransport(new ny5(callbackRouter2, (byte) 29)));
                    case 11:
                        xrc0 xrc0Var2 = (xrc0) ((h7v0) wj3Var.b).s.get();
                        c8o.l(xrc0Var2);
                        return new h0s(xrc0Var2);
                    case 12:
                        h7v0 h7v0Var5 = (h7v0) wj3Var.b;
                        h7v0 h7v0Var6 = (h7v0) wj3Var.b;
                        y7h0 y7h0Var = (y7h0) h7v0Var5.t.get();
                        c8o.l(y7h0Var);
                        lzn0 lzn0Var4 = (lzn0) h7v0Var6.g.get();
                        c8o.l(lzn0Var4);
                        q8n q8nVar4 = (q8n) h7v0Var6.r.get();
                        c8o.l(q8nVar4);
                        q8n q8nVar5 = (q8n) h7v0Var6.q.get();
                        c8o.l(q8nVar5);
                        return new otr(y7h0Var, lzn0Var4, q8nVar4, q8nVar5);
                    default:
                        jah.e(b3);
                        return null;
                }
            case 18:
                return e();
            case 19:
                return f();
            case 20:
                tnm tnmVar = (tnm) obj;
                hwv0 hwv0Var = (hwv0) tnmVar.b;
                if (b3 == 0) {
                    return pzm.h((mos) hwv0Var.c.get());
                }
                if (b3 == 1) {
                    return new fwv0(xqu.a((ywp) tnmVar.e), xqu.a((ywp) tnmVar.f));
                }
                if (b3 == 2) {
                    return u1n0.z((q7r0) tnmVar.c);
                }
                if (b3 == 3) {
                    return new rol0();
                }
                if (b3 != 4) {
                    jah.e(b3);
                    return null;
                }
                lzn0 lzn0Var5 = (lzn0) hwv0Var.a.get();
                c8o.l(lzn0Var5);
                los losVar = (los) ((jly0) tnmVar.d).get();
                q8n q8nVar6 = (q8n) hwv0Var.b.get();
                c8o.l(q8nVar6);
                xvv0 xvv0Var = new xvv0(q8nVar6, losVar, lzn0Var5);
                los losVar2 = (los) ((jly0) tnmVar.d).get();
                q8n q8nVar7 = (q8n) hwv0Var.b.get();
                c8o.l(q8nVar7);
                return new yup0(xvv0Var, new pyh1(losVar2, q8nVar7), (rol0) ((ywp) tnmVar.f).get());
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                s24 s24Var = (s24) obj;
                switch (b3) {
                    case 0:
                        l8x0 l8x0Var = (l8x0) s24Var.b;
                        sbx0 sbx0Var = (sbx0) s24Var.c;
                        a8e0 a8e0Var2 = (a8e0) l8x0Var.g.get();
                        c8o.l(a8e0Var2);
                        rbx0Var = new rbx0(a8e0Var2, s24Var.T(), sbx0Var, xqu.a((ywp) s24Var.Z), new ytp0(new hvp0((Object) sbx0Var, (byte) 22)));
                        break;
                    case 1:
                        return new dkq(this);
                    case 2:
                        return new ekq(this);
                    case 3:
                        return new fkq(this);
                    case 4:
                        return new gkq(this);
                    case 5:
                        return new hkq(this);
                    case 6:
                        return new ikq(this);
                    case 7:
                        l8x0 l8x0Var2 = (l8x0) s24Var.b;
                        sbx0 sbx0Var2 = (sbx0) s24Var.c;
                        q7r0 q7r0Var = (q7r0) s24Var.d;
                        xfx xfxVarB = l8x0Var2.b();
                        c8o.l(xfxVarB);
                        xfx xfxVarB2 = l8x0Var2.b();
                        c8o.l(xfxVarB2);
                        h0y h0yVar = new h0y(xfxVarB2, (byte) 13);
                        xfx xfxVarB3 = l8x0Var2.b();
                        c8o.l(xfxVarB3);
                        j3v j3vVar = new j3v(xfxVarB3, (byte) 21);
                        xfx xfxVarB4 = l8x0Var2.b();
                        c8o.l(xfxVarB4);
                        mjv mjvVar = new mjv(xfxVarB4, (byte) 17);
                        xfx xfxVarB5 = l8x0Var2.b();
                        c8o.l(xfxVarB5);
                        fx6 fx6Var = new fx6(xfxVarB5);
                        xfx xfxVarB6 = l8x0Var2.b();
                        c8o.l(xfxVarB6);
                        vyq0 vyq0Var = new vyq0((Object) xfxVarB6, (byte) 7);
                        xfx xfxVarB7 = l8x0Var2.b();
                        c8o.l(xfxVarB7);
                        lmw lmwVar = new lmw(xfxVarB7, (byte) 17);
                        xfx xfxVarB8 = l8x0Var2.b();
                        c8o.l(xfxVarB8);
                        fx6 fx6Var2 = new fx6(xfxVarB8);
                        xfx xfxVarB9 = l8x0Var2.b();
                        c8o.l(xfxVarB9);
                        wb00 wb00Var = new wb00(xfxVarB9, (byte) 20);
                        xfx xfxVarB10 = l8x0Var2.b();
                        c8o.l(xfxVarB10);
                        yqu0 yqu0Var = new yqu0(new i8x0(xfxVarB, h0yVar, j3vVar, mjvVar, fx6Var, vyq0Var, lmwVar, fx6Var2, wb00Var, new gtc1(xfxVarB10)), new s880(u1n0.z(q7r0Var), new hvp0((Object) sbx0Var2, (byte) 22)), (byte) 20);
                        k8x0 k8x0VarT = s24Var.T();
                        l8x0 l8x0Var3 = (l8x0) s24Var.b;
                        kly0 kly0Var = l8x0Var3.b;
                        kly0 kly0Var2 = l8x0Var3.v;
                        kly0 kly0Var3 = l8x0Var3.q;
                        Scheduler scheduler3 = (Scheduler) kly0Var.get();
                        c8o.l(scheduler3);
                        Scheduler scheduler4 = (Scheduler) l8x0Var3.c.get();
                        c8o.l(scheduler4);
                        Scheduler scheduler5 = (Scheduler) l8x0Var3.a.get();
                        c8o.l(scheduler5);
                        lzn0 lzn0Var6 = (lzn0) l8x0Var3.j.get();
                        c8o.l(lzn0Var6);
                        xmu0 xmu0Var = new xmu0(lzn0Var6, new s880(u1n0.z(q7r0Var), new hvp0((Object) sbx0Var2, (byte) 22)), (byte) 19);
                        zsc zscVarH = s24Var.H();
                        c4n0 c4n0Var = new c4n0(q7r0Var);
                        js6 js6Var = (js6) l8x0Var3.l.get();
                        c8o.l(js6Var);
                        ywc0 ywc0Var = (ywc0) l8x0Var3.n.get();
                        c8o.l(ywc0Var);
                        i4q i4qVar = (i4q) l8x0Var3.A.get();
                        c8o.l(i4qVar);
                        ywp ywpVar46 = (ywp) s24Var.X;
                        ywp ywpVar47 = (ywp) s24Var.Y;
                        em6 em6Var = (em6) l8x0Var3.m.get();
                        c8o.l(em6Var);
                        uu0 uu0Var = new uu0(c4n0Var, js6Var, ywc0Var, i4qVar, ywpVar46, ywpVar47, em6Var, ((Boolean) l8x0Var3.o.get()).booleanValue());
                        kt91 kt91Var3 = (kt91) l8x0Var3.u.get();
                        c8o.l(kt91Var3);
                        dg30 dg30Var = (dg30) kly0Var3.get();
                        c8o.l(dg30Var);
                        uip0 uip0Var = new uip0(dg30Var, (byte) 23);
                        Activity activityA = l8x0Var3.a();
                        c8o.l(activityA);
                        e630 e630Var = (e630) l8x0Var3.z.get();
                        c8o.l(e630Var);
                        j0a1 j0a1Var = (j0a1) l8x0Var3.L.get();
                        c8o.l(j0a1Var);
                        o730 o730Var = (o730) l8x0Var3.M.get();
                        c8o.l(o730Var);
                        gdx0 gdx0Var = (gdx0) kly0Var2.get();
                        c8o.l(gdx0Var);
                        i8h1 i8h1VarZ = u1n0.z(q7r0Var);
                        gw70 gw70Var2 = (gw70) l8x0Var3.s.get();
                        c8o.l(gw70Var2);
                        dg30 dg30Var2 = (dg30) kly0Var3.get();
                        c8o.l(dg30Var2);
                        hz5 hz5Var = new hz5((byte) 10);
                        q8n q8nVar8 = (q8n) l8x0Var3.f.get();
                        c8o.l(q8nVar8);
                        bo71 bo71Var = (bo71) l8x0Var3.S.get();
                        c8o.l(bo71Var);
                        m771 m771Var = (m771) l8x0Var3.T.get();
                        c8o.l(m771Var);
                        smp0 smp0Var = new smp0(q8nVar8, bo71Var, m771Var);
                        i8h1 i8h1VarZ2 = u1n0.z(q7r0Var);
                        l6h1 l6h1Var = (l6h1) q7r0Var.b(l6h1.class);
                        c8o.m(l6h1Var);
                        eq80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1VarZ2));
                        gdx0 gdx0Var2 = (gdx0) kly0Var2.get();
                        c8o.l(gdx0Var2);
                        kp5 kp5Var = new kp5(i8h1VarZ, gw70Var2, dg30Var2, hz5Var, smp0Var, eq80Var, gdx0Var2);
                        ao30 ao30Var = (ao30) l8x0Var3.G.get();
                        c8o.l(ao30Var);
                        kbd kbdVar = (kbd) l8x0Var3.K.get();
                        c8o.l(kbdVar);
                        q8n q8nVar9 = (q8n) l8x0Var3.e.get();
                        c8o.l(q8nVar9);
                        rbx0Var = new ubx0(yqu0Var, k8x0VarT, sbx0Var2, new cbx0(scheduler3, scheduler4, scheduler5, xmu0Var, zscVarH, uu0Var, kt91Var3, uip0Var, activityA, e630Var, j0a1Var, o730Var, gdx0Var, kp5Var, ao30Var, kbdVar, q8nVar9));
                        break;
                    case 8:
                        yhm yhmVar = (yhm) ((l8x0) s24Var.b).k.get();
                        c8o.l(yhmVar);
                        return yhmVar;
                    case 9:
                        l8x0 l8x0Var4 = (l8x0) s24Var.b;
                        l8x0 l8x0Var5 = (l8x0) s24Var.b;
                        j0j0 j0j0Var = (j0j0) l8x0Var4.C.get();
                        c8o.l(j0j0Var);
                        d7b d7bVar = (d7b) l8x0Var5.B.get();
                        c8o.l(d7bVar);
                        xy40 xy40Var = (xy40) l8x0Var5.H.get();
                        c8o.l(xy40Var);
                        egd egdVar = (egd) l8x0Var5.D.get();
                        c8o.l(egdVar);
                        y621 y621Var = (y621) l8x0Var5.E.get();
                        c8o.l(y621Var);
                        xa21 xa21Var = (xa21) l8x0Var5.F.get();
                        c8o.l(xa21Var);
                        jl21 jl21Var = (jl21) l8x0Var5.I.get();
                        c8o.l(jl21Var);
                        x860 x860Var = (x860) l8x0Var5.N.get();
                        c8o.l(x860Var);
                        hgd0 hgd0Var = (hgd0) l8x0Var5.O.get();
                        c8o.l(hgd0Var);
                        jed0 jed0Var = (jed0) l8x0Var5.P.get();
                        c8o.l(jed0Var);
                        vcd0 vcd0Var = (vcd0) l8x0Var5.Q.get();
                        c8o.l(vcd0Var);
                        return new wn30(j0j0Var, d7bVar, xy40Var, egdVar, y621Var, xa21Var, jl21Var, x860Var, hgd0Var, jed0Var, vcd0Var);
                    default:
                        jah.e(b3);
                        return null;
                }
                return rbx0Var;
        }
    }
}
