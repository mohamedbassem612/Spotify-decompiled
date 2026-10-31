package p;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.servicebasedrouter.ScopedCallbackRouter;
import com.spotify.cosmos.servicebasedrouter.ScopedRouter;
import com.spotify.mobius.coroutines.a;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fwo implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fwo(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        ai0 ai0Var = (ai0) this.c;
        byte b = 5;
        byte b2 = 2;
        byte b3 = 1;
        byte b4 = 0;
        byte b5 = this.b;
        switch (b5) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fwo fwoVar = (fwo) ai0Var.k1;
                so1 so1Var = (so1) ((jly0) ai0Var.e1).get();
                xu1 xu1Var = (xu1) ai0Var.b;
                a8e0 a8e0Var = (a8e0) xu1Var.n.get();
                c8o.l(a8e0Var);
                gw70 gw70VarB = xu1Var.b();
                c8o.l(gw70VarB);
                pe peVarH = xu1Var.h();
                c8o.l(peVarH);
                c8o.l(xu1Var.f());
                return new ao1(fwoVar, so1Var, new hvj(a8e0Var, new q3b1(gw70VarB, peVarH)));
            case 1:
                return new ov1((gxo) ((jly0) ai0Var.j1).get(), (cbr0) ((jly0) ai0Var.f).get(), (av1) ai0Var.c, (fwo) ai0Var.N0);
            case 2:
                return new gxo(this, b3);
            case 3:
                cbr0 cbr0Var = (cbr0) ((jly0) ai0Var.f).get();
                nxb nxbVar = (nxb) ((jly0) ai0Var.e).get();
                sua suaVar = new sua((byte) 19);
                Resources resources = (Resources) ((xu1) ai0Var.b).g.get();
                c8o.l(resources);
                return new eg30(new bxb(cbr0Var, nxbVar, suaVar, resources, (av1) ai0Var.c));
            case 4:
                nxb nxbVar2 = (nxb) ((jly0) ai0Var.e).get();
                tx4 tx4VarC = ai0Var.c();
                c8b1 c8b1Var = new c8b1(2);
                smc0 smc0VarN = k4p1.n();
                if (Build.VERSION.SDK_INT <= 29) {
                    smc0VarN.add(new bt21());
                }
                smc0VarN.add(new yxe1(new jx21(2131951960)));
                smc0VarN.add(new t1r0(true));
                smc0VarN.add(new s9h1(5, false, tx4VarC.b(), tx4VarC.b()));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                smc0VarN.add(new bn70(yon1.B3(), nik1.F1, tx4VarC.b() ? new nar0(new gpk0(yon1.B3().c)) : null));
                smc0VarN.add(new uwq0((twq0) null));
                c8b1Var.b(k4p1.k(smc0VarN).toArray(new dbr0[0]));
                c8b1Var.a(nxbVar2);
                ArrayList arrayList = c8b1Var.a;
                return new cbr0((dbr0[]) arrayList.toArray(new dbr0[arrayList.size()]), false);
            case 5:
                los losVar = (los) ((jly0) ai0Var.d).get();
                Resources resources2 = (Resources) ((xu1) ai0Var.b).g.get();
                c8o.l(resources2);
                return new nxb((Integer) null, (ixb) null, Integer.valueOf(resources2.getDimensionPixelSize(2131165381)), 0, (mxb) null, losVar, false, false, false, (nsm0) null, 3035);
            case 6:
                return pzm.h((mos) ((xu1) ai0Var.b).Q.get());
            case 7:
                return new hxo(this, (byte) 1);
            case 8:
                return cwl1.C((q7r0) ai0Var.a);
            case 9:
                return new yms((fwo) ai0Var.t);
            case 10:
                xu1 xu1Var2 = (xu1) ai0Var.b;
                xu1 xu1Var3 = (xu1) ai0Var.b;
                bl3 bl3VarA = xu1Var2.a();
                c8o.l(bl3VarA);
                z0t z0tVar = (z0t) xu1Var3.p.get();
                c8o.l(z0tVar);
                q8n q8nVar = (q8n) xu1Var3.b.get();
                c8o.l(q8nVar);
                zwm1 zwm1Var = (zwm1) xu1Var3.o.get();
                c8o.l(zwm1Var);
                agc0 agc0VarD = xu1Var3.d();
                c8o.l(agc0VarD);
                r2r r2rVar = (r2r) xu1Var3.q.get();
                c8o.l(r2rVar);
                return new ans(bl3VarA, z0tVar, q8nVar, zwm1Var, agc0VarD, r2rVar);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new yx1();
            case grn1.d /* 12 */:
                return new ixo(this, (byte) 1);
            case 13:
                xu1 xu1Var4 = (xu1) ai0Var.b;
                xu1 xu1Var5 = (xu1) ai0Var.b;
                Activity activity = (Activity) xu1Var4.f.get();
                c8o.l(activity);
                lzn0 lzn0Var = (lzn0) xu1Var5.w.get();
                c8o.l(lzn0Var);
                a1r0 a1r0Var = (a1r0) xu1Var5.t.get();
                c8o.l(a1r0Var);
                return new fsg(activity, lzn0Var, a1r0Var);
            case 14:
                xu1 xu1Var6 = (xu1) ai0Var.b;
                xu1 xu1Var7 = (xu1) ai0Var.b;
                q8n q8nVar2 = (q8n) xu1Var6.b.get();
                c8o.l(q8nVar2);
                ylk0 ylk0Var = (ylk0) xu1Var7.C.get();
                c8o.l(ylk0Var);
                agc0 agc0VarD2 = xu1Var7.d();
                c8o.l(agc0VarD2);
                return new cqa1(q8nVar2, ylk0Var, agc0VarD2);
            case 15:
                ai0Var.getClass();
                av1 av1Var = (av1) ai0Var.c;
                xu1 xu1Var8 = (xu1) ai0Var.b;
                Context context = (Context) xu1Var8.e.get();
                c8o.l(context);
                ut71 ut71Var = (ut71) xu1Var8.L.get();
                c8o.l(ut71Var);
                ria1 ria1Var = new ria1(context, ut71Var);
                dxz0 dxz0Var = (dxz0) xu1Var8.l.get();
                c8o.l(dxz0Var);
                kkg1 kkg1Var = (kkg1) xu1Var8.B.get();
                c8o.l(kkg1Var);
                uu00 uu00Var = (uu00) xu1Var8.F.get();
                c8o.l(uu00Var);
                wml wmlVar = new wml(kkg1Var, uu00Var);
                yjq yjqVarD = ai0Var.d();
                hy1 hy1Var = new hy1(av1Var, new ugb((fwo) ai0Var.X0));
                fwo fwoVar2 = (fwo) ai0Var.Z0;
                fwo fwoVar3 = (fwo) ai0Var.a1;
                gy1 gy1Var = av1Var.i;
                qt1 qt1Var = (u890.j(gy1Var, ay1.a) || (gy1Var instanceof ey1)) ? (qt1) fwoVar2.get() : (qt1) fwoVar3.get();
                jxo jxoVar = (jxo) ((jly0) ai0Var.b1).get();
                d0r d0rVar = (d0r) ((jly0) ai0Var.i).get();
                vlo vloVarC = xu1Var8.c();
                c8o.l(vloVarC);
                asn asnVar = new asn(d0rVar, vloVarC);
                q8n q8nVar3 = (q8n) xu1Var8.b.get();
                c8o.l(q8nVar3);
                cig1 cig1Var = (cig1) xu1Var8.E.get();
                c8o.l(cig1Var);
                qmr qmrVar = new qmr(cig1Var, (byte) 13);
                bl3 bl3VarA2 = xu1Var8.a();
                c8o.l(bl3VarA2);
                return new so1(ria1Var, dxz0Var, av1Var, wmlVar, yjqVarD, hy1Var, qt1Var, jxoVar, asnVar, q8nVar3, qmrVar, bl3VarA2, (ho1) ((jly0) ai0Var.Y0).get(), (ums) ((jly0) ai0Var.c1).get(), (yka1) ((jly0) ai0Var.d1).get(), ai0Var.c().e());
            case 16:
                return new glc0((fwo) ai0Var.P0, (fwo) ai0Var.Q0, (fwo) ai0Var.R0, (fwo) ai0Var.S0, (fwo) ai0Var.T0, (fwo) ai0Var.U0, (fwo) ai0Var.V0, (fwo) ai0Var.W0);
            case 17:
                vlo vloVarC2 = ((xu1) ai0Var.b).c();
                c8o.l(vloVarC2);
                return new x6x(vloVarC2, b2);
            case 18:
                vlo vloVarC3 = ((xu1) ai0Var.b).c();
                c8o.l(vloVarC3);
                return new x6x(vloVarC3, b3);
            case 19:
                return new lkg1(b3);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new lkg1(b2);
            case 21:
                return new lkg1(b);
            case 22:
                return new lkg1((byte) 4);
            case 23:
                vlo vloVarC4 = ((xu1) ai0Var.b).c();
                c8o.l(vloVarC4);
                return new x6x(vloVarC4, b4);
            case 24:
                return new lkg1((byte) 3);
            case 25:
                vwm1 vwm1Var = (vwm1) ((xu1) ai0Var.b).R.get();
                c8o.l(vwm1Var);
                return new xkr0(vwm1Var, (ho1) ((jly0) ai0Var.Y0).get(), wg0.s());
            case 26:
                av1 av1Var2 = (av1) ai0Var.c;
                xu1 xu1Var9 = (xu1) ai0Var.b;
                svh0 svh0Var = new svh0(av1Var2, ai0Var.c().a(), (byte) 24);
                zwm1 zwm1Var2 = (zwm1) xu1Var9.o.get();
                c8o.l(zwm1Var2);
                agc0 agc0VarD3 = xu1Var9.d();
                c8o.l(agc0VarD3);
                vlo vloVarC5 = xu1Var9.c();
                c8o.l(vloVarC5);
                return new ho1(svh0Var, zwm1Var2, agc0VarD3, vloVarC5);
            case 27:
                vwm1 vwm1Var2 = (vwm1) ((xu1) ai0Var.b).R.get();
                c8o.l(vwm1Var2);
                return new z180(vwm1Var2, (ho1) ((jly0) ai0Var.Y0).get(), (av1) ai0Var.c);
            case 28:
                return new jxo(this, (byte) 1);
            case 29:
                bl3 bl3VarA3 = ((xu1) ai0Var.b).a();
                c8o.l(bl3VarA3);
                j6g1 j6g1Var = (j6g1) ((xu1) ai0Var.b).N.get();
                c8o.l(j6g1Var);
                return new ums(bl3VarA3, j6g1Var);
            case 30:
                kxc0 kxc0Var = (kxc0) ((xu1) ai0Var.b).k.get();
                c8o.l(kxc0Var);
                av1 av1Var3 = (av1) ai0Var.c;
                ai0Var.c().g();
                v9c v9cVar = new v9c(kxc0Var, av1Var3);
                q8n q8nVar4 = (q8n) ((xu1) ai0Var.b).b.get();
                c8o.l(q8nVar4);
                return new yka1(v9cVar, q8nVar4);
            case 31:
                cig1 cig1Var2 = (cig1) ((xu1) ai0Var.b).E.get();
                c8o.l(cig1Var2);
                so1 so1Var2 = (so1) ((jly0) ai0Var.e1).get();
                wt1 wt1VarB = ai0Var.b();
                av1 av1Var4 = (av1) ai0Var.c;
                cfr cfrVar = (cfr) ((xu1) ai0Var.b).K.get();
                c8o.l(cfrVar);
                return new kjg1(cig1Var2, so1Var2, wt1VarB, av1Var4, cfrVar, ai0Var.a());
            case 32:
                iyc0 iyc0Var = (iyc0) ((xu1) ai0Var.b).j.get();
                c8o.l(iyc0Var);
                return new s4g0(iyc0Var, ai0Var.a());
            case 33:
                xrc0 xrc0Var = (xrc0) ((xu1) ai0Var.b).h.get();
                c8o.l(xrc0Var);
                iyc0 iyc0Var2 = (iyc0) ((xu1) ai0Var.b).j.get();
                c8o.l(iyc0Var2);
                return new in71(xrc0Var, iyc0Var2, ai0Var.a(), (av1) ai0Var.c);
            case 34:
                so1 so1Var3 = (so1) ((jly0) ai0Var.e1).get();
                xrc0 xrc0Var2 = (xrc0) ((xu1) ai0Var.b).h.get();
                c8o.l(xrc0Var2);
                yka1 yka1Var = (yka1) ((jly0) ai0Var.d1).get();
                ai0Var.c().g();
                return new okt(so1Var3, xrc0Var2, yka1Var);
            default:
                jah.e(b5);
                return null;
        }
    }

    private final Object b() {
        wxo wxoVar = (wxo) this.c;
        i691 i691Var = i691.a;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                f62 f62Var = (f62) wxoVar.b;
                f62 f62Var2 = (f62) wxoVar.b;
                xfx xfxVarC0 = f62Var.c0();
                c8o.l(xfxVarC0);
                Observable observable = (Observable) wxoVar.z.get();
                Resources resourcesR = f62Var2.r();
                c8o.l(resourcesR);
                eyh0 eyh0Var = new eyh0(observable, resourcesR, (zm4) ((fwo) wxoVar.e).get(), (byte) 12);
                yq0 yq0VarY0 = f62Var2.Y0();
                c8o.l(yq0VarY0);
                ynb0 ynb0VarA = xqu.a((fwo) wxoVar.g);
                gid gidVar = new gid((rxo) wxoVar.B.get(), (hnl) wxoVar.C.get(), (byte) 0);
                kr60 kr60Var = new kr60((sxo) wxoVar.K.get(), (byte) 0);
                Observable observableJust = Observable.just(swj1.a);
                gw70 gw70Var = (gw70) ((fwo) wxoVar.h).get();
                iac0 iac0Var = (iac0) wxoVar.A.get();
                w2k1 w2k1VarO0 = f62Var2.O0();
                c8o.l(w2k1VarO0);
                x5j1 x5j1Var = new x5j1(new dxy(observableJust, gw70Var, iac0Var, w2k1VarO0, (Scheduler) ((fwo) wxoVar.d).get(), (zm4) ((fwo) wxoVar.e).get(), (byte) 29), (byte) 0);
                Observable observable2 = (Observable) wxoVar.z.get();
                txo txoVar = (txo) wxoVar.M.get();
                u601 u601VarT = f62Var2.t();
                c8o.l(u601VarT);
                t4d1 t4d1Var = new t4d1(new ua91(observable2, txoVar, u601VarT, new wx8((w9u0) wxoVar.I.get()), (byte) 26), (byte) 0);
                gw70 gw70Var2 = (gw70) ((fwo) wxoVar.h).get();
                u601 u601VarT2 = f62Var2.t();
                c8o.l(u601VarT2);
                a42 a42Var = new a42(new ycc1(gw70Var2, u601VarT2, (byte) 18), (byte) 0);
                Observable observable3 = (Observable) wxoVar.z.get();
                j62 j62Var = (j62) wxoVar.Q.get();
                xn0 xn0VarQ0 = f62Var2.Q0();
                c8o.l(xn0VarQ0);
                pxc pxcVarT0 = f62Var2.T0();
                c8o.l(pxcVarT0);
                c62 c62Var = new c62(gidVar, kr60Var, x5j1Var, t4d1Var, a42Var, observable3, j62Var, xn0VarQ0, pxcVarT0, (Flowable) wxoVar.E.get(), (Scheduler) ((fwo) wxoVar.d).get());
                ynb0 ynb0VarA2 = xqu.a((fwo) wxoVar.k);
                j62 j62Var2 = (j62) wxoVar.Q.get();
                ynb0 ynb0VarA3 = xqu.a((fwo) wxoVar.l);
                Observable observable4 = (Observable) wxoVar.z.get();
                u961 u961Var = new u961(xqu.a((fwo) wxoVar.m), (o2p0) wxoVar.N.get(), (n6r0) wxoVar.O.get(), (lik1) wxoVar.P.get());
                p2p0 p2p0Var = (p2p0) wxoVar.R.get();
                h21 h21Var = new h21(xqu.a((fwo) wxoVar.q), (byte) 4);
                j62 j62Var3 = (j62) wxoVar.Q.get();
                xfx xfxVarC1 = f62Var2.c0();
                c8o.l(xfxVarC1);
                Resources resourcesR2 = f62Var2.r();
                c8o.l(resourcesR2);
                ko0 ko0VarH1 = f62Var2.h1();
                c8o.l(ko0VarH1);
                dg30 dg30Var = (dg30) ((fwo) wxoVar.n).get();
                up0 up0VarU0 = f62Var2.U0();
                aq0 aq0VarB1 = f62Var2.b1();
                c8o.l(aq0VarB1);
                zm4 zm4Var = (zm4) ((fwo) wxoVar.e).get();
                am30 am30VarF0 = f62Var2.F0();
                c8o.l(am30VarF0);
                an0 an0Var = new an0(observable4, u961Var, p2p0Var, h21Var, j62Var3, xfxVarC1, resourcesR2, ko0VarH1, dg30Var, up0VarU0, aq0VarB1, zm4Var, am30VarF0);
                Observable observable5 = (Observable) wxoVar.z.get();
                Flowable flowable = (Flowable) wxoVar.E.get();
                Scheduler scheduler = (Scheduler) ((fwo) wxoVar.d).get();
                a62 a62Var = (a62) wxoVar.S.get();
                ao0 ao0VarV0 = f62Var2.V0();
                c8o.l(ao0VarV0);
                j62 j62Var4 = (j62) wxoVar.Q.get();
                xfx xfxVarC2 = f62Var2.c0();
                c8o.l(xfxVarC2);
                u601 u601VarT3 = f62Var2.t();
                c8o.l(u601VarT3);
                em0 em0Var = new em0(observable5, flowable, scheduler, a62Var, ao0VarV0, j62Var4, xfxVarC2, u601VarT3, (hnl) wxoVar.C.get(), (zm4) ((fwo) wxoVar.e).get(), (byte) 0);
                r791 r791VarC1 = f62Var2.c1();
                c8o.l(r791VarC1);
                ddo ddoVarA1 = f62Var2.a1();
                c8o.l(ddoVarA1);
                ynb0 ynb0VarA4 = xqu.a((fwo) wxoVar.r);
                ynb0 ynb0VarA5 = xqu.a((fwo) wxoVar.s);
                Flowable flowable2 = (Flowable) wxoVar.D.get();
                mo9 mo9Var = mo9.N0;
                Flowable flowableJ = flowable2.j(mo9Var);
                FlowableMap flowableMapD = wxoVar.d();
                w9u0 w9u0Var = (w9u0) wxoVar.I.get();
                j62 j62Var5 = (j62) wxoVar.Q.get();
                w9u0 w9u0Var2 = (w9u0) wxoVar.I.get();
                gn10 gn10Var = (gn10) wxoVar.T.get();
                FlowableMap flowableMapB = wxoVar.b();
                Flowable flowableC = wxoVar.c();
                Flowable flowableJ2 = ((Flowable) wxoVar.D.get()).j(mo9Var);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) wxoVar.D.get());
                pe peVarH = f62Var2.h();
                c8o.l(peVarH);
                luk lukVarW = f62Var2.w();
                c8o.l(lukVarW);
                toj0 toj0Var = new toj0(flowableJ, flowableMapD, w9u0Var, j62Var5, new dfm(w9u0Var2, gn10Var, flowableMapB, flowableC, flowableJ2, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW))), (zm4) ((fwo) wxoVar.e).get(), (byte) 2);
                dz0 dz0VarS0 = f62Var2.S0();
                c8o.l(dz0VarS0);
                ynb0 ynb0VarA6 = xqu.a((fwo) wxoVar.t);
                ynb0 ynb0VarA7 = xqu.a((fwo) wxoVar.u);
                luk lukVarW2 = f62Var2.w();
                c8o.l(lukVarW2);
                dn4 dn4Var = new dn4(lukVarW2);
                p2o0 p2o0Var = new p2o0(wxoVar.d(), f2u0.j((Flowable) wxoVar.D.get()), wxoVar.c(), (w9u0) wxoVar.I.get(), (j62) wxoVar.Q.get(), (zm4) ((fwo) wxoVar.e).get(), (byte) 2);
                cp31 cp31Var = new cp31(wxoVar.d(), f2u0.j((Flowable) wxoVar.D.get()), wxoVar.c(), (w9u0) wxoVar.I.get(), (j62) wxoVar.Q.get(), (zm4) ((fwo) wxoVar.e).get());
                a680 a680Var = new a680(wxoVar.d(), (Flowable) wxoVar.G.get(), wxoVar.c(), (w9u0) wxoVar.I.get(), (j62) wxoVar.Q.get(), (zm4) ((fwo) wxoVar.e).get());
                kr60 kr60Var2 = new kr60((zm4) ((fwo) wxoVar.e).get(), (byte) 4);
                ynb0 ynb0VarA8 = xqu.a((fwo) wxoVar.v);
                ynb0 ynb0VarA9 = xqu.a((fwo) wxoVar.w);
                Flowable flowableX = ((Observable) wxoVar.z.get()).toFlowable(BackpressureStrategy.d).X(new ymm0((hnl) wxoVar.C.get(), (byte) 9));
                flowableX.getClass();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableX.t(Functions.a);
                FlowableMap flowableMapD2 = wxoVar.d();
                Scheduler scheduler2 = (Scheduler) ((fwo) wxoVar.d).get();
                luk lukVarW3 = f62Var2.w();
                c8o.l(lukVarW3);
                rzo0 rzo0Var = new rzo0(flowableMapD2, scheduler2, new tu4(false, lukVarW3), (byte) 20);
                vxo vxoVar = (vxo) wxoVar.U.get();
                ynb0 ynb0VarA10 = xqu.a((fwo) wxoVar.x);
                i8h1 i8h1Var = (i8h1) ((fwo) wxoVar.j).get();
                s4p0 s4p0VarR = f62Var2.R();
                c8o.l(s4p0VarR);
                l6h1 l6h1VarE = s4p0VarR.e();
                c8o.m(l6h1VarE);
                s4p0 s4p0VarR2 = f62Var2.R();
                c8o.l(s4p0VarR2);
                n7h1 n7h1VarF = s4p0VarR2.f();
                c8o.m(n7h1VarF);
                return new o62(xfxVarC0, eyh0Var, yq0VarY0, ynb0VarA, c62Var, ynb0VarA2, j62Var2, ynb0VarA3, an0Var, em0Var, r791VarC1, ddoVarA1, ynb0VarA4, ynb0VarA5, toj0Var, dz0VarS0, ynb0VarA6, ynb0VarA7, dn4Var, p2o0Var, cp31Var, a680Var, kr60Var2, ynb0VarA8, ynb0VarA9, flowableDistinctUntilChangedT, rzo0Var, vxoVar, ynb0VarA10, i8h1Var, l6h1VarE, n7h1VarF, (n6r0) wxoVar.O.get(), (lik1) wxoVar.P.get(), (q2p0) wxoVar.c);
            case 1:
                f62 f62Var3 = (f62) wxoVar.b;
                f62 f62Var4 = (f62) wxoVar.b;
                Flowable flowableF = f62Var3.f();
                c8o.l(flowableF);
                inr inrVarX0 = f62Var4.x0();
                c8o.l(inrVarX0);
                qq0 qq0VarE1 = f62Var4.e1();
                c8o.l(qq0VarE1);
                return inrVarX0.d().filter(j561.e).map(mpi1.e).distinctUntilChanged().switchMap(new eyh0(flowableF, qq0VarE1, (tuz) wxoVar.a.get(), (byte) 23)).distinctUntilChanged().observeOn((Scheduler) ((fwo) wxoVar.d).get());
            case 2:
                Scheduler schedulerD0 = ((f62) wxoVar.b).d0();
                c8o.l(schedulerD0);
                return schedulerD0;
            case 3:
                return ((q2p0) wxoVar.c).c().c();
            case 4:
                luk lukVarW4 = ((f62) wxoVar.b).w();
                c8o.l(lukVarW4);
                return new zm4(false, false, false, false, true, false, lukVarW4);
            case 5:
                return new qu0((Scheduler) ((fwo) wxoVar.d).get(), (Scheduler) ((fwo) wxoVar.f).get(), (Observable) wxoVar.z.get());
            case 6:
                Scheduler schedulerG = ((f62) wxoVar.b).G();
                c8o.l(schedulerG);
                return schedulerG;
            case 7:
                return new rxo(this);
            case 8:
                gw70 gw70VarB = ((f62) wxoVar.b).b();
                c8o.l(gw70VarB);
                return gw70VarB;
            case 9:
                return k9o0.v((q2p0) wxoVar.c);
            case 10:
                return k9o0.r((q2p0) wxoVar.c);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new sxo(this, (byte) 0);
            case grn1.d /* 12 */:
                return k9o0.B((q2p0) wxoVar.c);
            case 13:
                return f2u0.B(wxoVar.d(), (Flowable) wxoVar.E.get(), (Flowable) wxoVar.F.get(), wxoVar.a());
            case 14:
                Flowable flowable3 = (Flowable) wxoVar.D.get();
                Scheduler scheduler3 = (Scheduler) ((fwo) wxoVar.d).get();
                yqg yqgVarA = ((f62) wxoVar.b).a();
                c8o.l(yqgVarA);
                return f2u0.z(flowable3, scheduler3, yqgVarA, wxoVar.a());
            case 15:
                return f2u0.y((Flowable) wxoVar.D.get(), wxoVar.a());
            case 16:
                PublishProcessor publishProcessorD = ((q2p0) wxoVar.c).d();
                publishProcessorD.getClass();
                return new FlowableOnBackpressureLatest(publishProcessorD);
            case 17:
                Context context = ((f62) wxoVar.b).context();
                c8o.l(context);
                return context;
            case 18:
                return k9o0.z((q2p0) wxoVar.c);
            case 19:
                return k9o0.t((q2p0) wxoVar.c);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                s4p0 s4p0VarR3 = ((f62) wxoVar.b).R();
                c8o.l(s4p0VarR3);
                i8h1 i8h1VarD = s4p0VarR3.d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 21:
                return new txo(this, (byte) 0);
            case 22:
                return new uxo(this, (byte) 0);
            case 23:
                return new j62((Observable) wxoVar.z.get(), (i8h1) ((fwo) wxoVar.j).get(), (o2p0) wxoVar.N.get(), (n6r0) wxoVar.O.get(), (lik1) wxoVar.P.get());
            case 24:
                return ((q2p0) wxoVar.c).h();
            case 25:
                return ((q2p0) wxoVar.c).i();
            case 26:
                return ((q2p0) wxoVar.c).e();
            case 27:
                Flowable flowableP0 = ((f62) wxoVar.b).P0();
                Observable observable6 = (Observable) wxoVar.z.get();
                ao0 ao0VarV1 = ((f62) wxoVar.b).V0();
                c8o.l(ao0VarV1);
                return new i62(flowableP0, observable6, ao0VarV1);
            case 28:
                FlowableMap flowableMapB2 = wxoVar.b();
                gw70 gw70Var3 = (gw70) ((fwo) wxoVar.h).get();
                ufg1 ufg1VarS = ((f62) wxoVar.b).S();
                c8o.l(ufg1VarS);
                return new ww9(f2u0.g(flowableMapB2, gw70Var3, ufg1VarS, (Scheduler) ((fwo) wxoVar.d).get()));
            case 29:
                i4q i4qVarZ0 = ((f62) wxoVar.b).z0();
                c8o.l(i4qVarZ0);
                return i4qVarZ0.a((lik1) wxoVar.P.get());
            case 30:
                return ((q2p0) wxoVar.c).j();
            case 31:
                fwo fwoVar = (fwo) wxoVar.n;
                fwo fwoVar2 = (fwo) wxoVar.o;
                fwo fwoVar3 = (fwo) wxoVar.p;
                fwo fwoVar4 = (fwo) wxoVar.h;
                fwo fwoVar5 = (fwo) wxoVar.f;
                fwo fwoVar6 = (fwo) wxoVar.d;
                o42 o42Var = new o42();
                o42Var.a = fwoVar;
                o42Var.b = fwoVar2;
                o42Var.c = fwoVar3;
                o42Var.d = fwoVar4;
                o42Var.e = fwoVar5;
                o42Var.f = fwoVar6;
                return o42Var;
            case 32:
                dg30 dg30VarS = ((f62) wxoVar.b).s();
                c8o.l(dg30VarS);
                return dg30VarS;
            case 33:
                g341 g341VarX0 = ((f62) wxoVar.b).X0();
                c8o.l(g341VarX0);
                return g341VarX0;
            case 34:
                RetrofitMaker retrofitMakerN = ((f62) wxoVar.b).n();
                c8o.l(retrofitMakerN);
                return retrofitMakerN;
            case 35:
                return new a62((p2p0) wxoVar.R.get(), (byte) 0);
            case 36:
                return new r9v((Observable) wxoVar.z.get(), (zm4) ((fwo) wxoVar.e).get(), (Scheduler) ((fwo) wxoVar.d).get());
            case 37:
                a1g1 a1g1Var = new a1g1(((f62) wxoVar.b).F(), (byte) 11);
                Observable observable7 = (Observable) wxoVar.z.get();
                u601 u601VarT4 = ((f62) wxoVar.b).t();
                c8o.l(u601VarT4);
                return new mq0(a1g1Var, observable7, u601VarT4);
            case 38:
                return ((q2p0) wxoVar.c).f();
            case 39:
                Flowable flowable4 = (Flowable) wxoVar.D.get();
                Flowable flowable5 = (Flowable) wxoVar.G.get();
                w9u0 w9u0Var3 = (w9u0) wxoVar.I.get();
                o241 o241VarI = ((f62) wxoVar.b).i();
                c8o.l(o241VarI);
                return new ktf1(flowable4, flowable5, w9u0Var3, i691Var, o241VarI, (fwo) wxoVar.j, (fkf1) wxoVar.Q.get());
            case 40:
                Flowable flowable6 = (Flowable) wxoVar.D.get();
                Flowable flowable7 = (Flowable) wxoVar.G.get();
                w9u0 w9u0Var4 = (w9u0) wxoVar.I.get();
                o241 o241VarI2 = ((f62) wxoVar.b).i();
                c8o.l(o241VarI2);
                return new ekf1(flowable6, flowable7, w9u0Var4, i691Var, o241VarI2, (fwo) wxoVar.j, (fkf1) wxoVar.Q.get());
            case 41:
                return new ix0((Observable) wxoVar.z.get(), (Scheduler) ((fwo) wxoVar.d).get());
            case 42:
                e71 e71Var = new e71((Context) ((fwo) wxoVar.i).get(), (zm4) ((fwo) wxoVar.e).get(), (byte) 1);
                int i = Flowable.a;
                return new tqq0(new FlowableFromCallable(e71Var), (p2p0) wxoVar.R.get(), (Scheduler) ((fwo) wxoVar.d).get());
            case 43:
                return new vxo(this);
            case 44:
                jly0 jly0Var = wxoVar.z;
                f62 f62Var5 = (f62) wxoVar.b;
                Observable observable8 = (Observable) jly0Var.get();
                mw7 mw7VarG0 = f62Var5.G0();
                c8o.l(mw7VarG0);
                t2j0 t2j0VarD1 = f62Var5.d1();
                c8o.l(t2j0VarD1);
                ycc1 ycc1Var = new ycc1(mw7VarG0, t2j0VarD1, (byte) 9);
                Flowable flowable8 = (Flowable) wxoVar.E.get();
                fwo fwoVar7 = (fwo) wxoVar.e;
                tp41 tp41VarZ0 = f62Var5.Z0();
                c8o.l(tp41VarZ0);
                q8n q8nVarD = f62Var5.d();
                c8o.l(q8nVarD);
                return new vp41(observable8, ycc1Var, flowable8, fwoVar7, tp41VarZ0, q8nVarD);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object c() {
        ayo ayoVar = (ayo) this.c;
        vi2 vi2Var = ayoVar.a;
        byte b = this.b;
        if (b == 0) {
            return new ri2();
        }
        if (b == 1) {
            return new b450(new ezb1(new mbo1(((Context) vi2Var.a.get()).getApplicationContext()), (byte) 26), ayoVar.a());
        }
        if (b == 2) {
            ContentResolver contentResolver = (ContentResolver) vi2Var.b.get();
            Uri uri = hz3.e;
            c8o.m(uri);
            return new hz3(contentResolver, uri, ayoVar.a(), (q8n) vi2Var.c.get());
        }
        if (b != 3) {
            if (b == 4) {
                return new xwq0((mbo0) vi2Var.d.get());
            }
            jah.e(b);
            return null;
        }
        ContentResolver contentResolver2 = (ContentResolver) vi2Var.b.get();
        Uri uri2 = h741.e;
        c8o.m(uri2);
        return new h741(contentResolver2, uri2, ayoVar.a(), (q8n) vi2Var.c.get());
    }

    private final Object d() {
        cyo cyoVar = (cyo) this.c;
        i691 i691Var = i691.a;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                q2p0 q2p0Var = cyoVar.b;
                bz2 bz2Var = (bz2) cyoVar.G;
                i8h1 i8h1Var = (i8h1) ((fwo) cyoVar.H).get();
                s4p0 s4p0VarR = bz2Var.R();
                c8o.l(s4p0VarR);
                l6h1 l6h1VarE = s4p0VarR.e();
                c8o.m(l6h1VarE);
                s4p0 s4p0VarR2 = bz2Var.R();
                c8o.l(s4p0VarR2);
                n7h1 n7h1VarF = s4p0VarR2.f();
                c8o.m(n7h1VarF);
                mr20 mr20VarY0 = bz2Var.Y0();
                yjj1 yjj1VarB0 = bz2Var.B0();
                c8o.l(yjj1VarB0);
                iz2 iz2Var = new iz2(mr20VarY0, yjj1VarB0);
                xfx xfxVar = (xfx) ((fwo) cyoVar.I).get();
                a62 a62Var = (a62) cyoVar.d.get();
                mwn0 mwn0VarX = bz2Var.x();
                c8o.l(mwn0VarX);
                cce cceVar = new cce(a62Var, mwn0VarX, (hnl) cyoVar.e.get(), (byte) 16);
                l0y l0yVar = (l0y) cyoVar.f.get();
                k0y k0yVar = (k0y) cyoVar.g.get();
                mwn0 mwn0VarX2 = bz2Var.x();
                c8o.l(mwn0VarX2);
                sp00 sp00Var = new sp00(l0yVar, k0yVar, mwn0VarX2, (hnl) cyoVar.e.get(), (byte) 1);
                v1k v1kVar = new v1k(((Flowable) cyoVar.h.get()).j((FlowableTransformer) cyoVar.i.get()), (d0r) cyoVar.j.get(), (xrn0) cyoVar.k.get(), (byte) 15);
                Flowable flowable = (Flowable) cyoVar.h.get();
                ugm ugmVar = (ugm) cyoVar.o.get();
                Scheduler schedulerO = bz2Var.o();
                c8o.l(schedulerO);
                v1k v1kVar2 = new v1k(flowable, ugmVar, schedulerO, (byte) 16);
                FlowableMap flowableMapM = cyoVar.m();
                ip91 ip91Var = bz2Var.y().a;
                c8o.m(ip91Var);
                pta1 pta1VarI = bz2Var.I();
                c8o.l(pta1VarI);
                Scheduler schedulerO2 = bz2Var.o();
                c8o.l(schedulerO2);
                FlowableObserveOn flowableObserveOnL = d1j1.l(flowableMapM, ip91Var, pta1VarI, schedulerO2);
                fbm fbmVarL = bz2Var.L();
                c8o.l(fbmVarL);
                eyh0 eyh0Var = new eyh0((fwo) cyoVar.I, (fwo) cyoVar.J, (fwo) cyoVar.K, (byte) 29);
                ynb0 ynb0VarA = xqu.a((fwo) cyoVar.L);
                xfx xfxVar2 = (xfx) ((fwo) cyoVar.I).get();
                fwo fwoVar = (fwo) cyoVar.M;
                fwo fwoVar2 = (fwo) cyoVar.N;
                fwo fwoVar3 = (fwo) cyoVar.R;
                fwo fwoVar4 = (fwo) cyoVar.S;
                fwo fwoVar5 = (fwo) cyoVar.T;
                fwo fwoVar6 = (fwo) cyoVar.U;
                fwo fwoVar7 = (fwo) cyoVar.V;
                fwo fwoVar8 = (fwo) cyoVar.X;
                fwo fwoVar9 = (fwo) cyoVar.Z;
                luk lukVarW = bz2Var.w();
                c8o.l(lukVarW);
                h72 h72Var = new h72((Object) xfxVar2, (Object) fwoVar, (Object) fwoVar2, (Object) fwoVar3, (Object) fwoVar4, (Object) fwoVar5, (Object) fwoVar6, (Object) fwoVar7, (Object) fwoVar8, (Object) fwoVar9, (Object) new un4(lukVarW), (byte) 1);
                u961 u961Var = new u961((xfx) ((fwo) cyoVar.I).get(), (fwo) cyoVar.b0, (fwo) cyoVar.c0, (fwo) cyoVar.d0);
                FlowableMap flowableMapM2 = cyoVar.m();
                oj80 oj80Var = new oj80((xfx) ((fwo) cyoVar.I).get(), (fwo) cyoVar.e0, (fwo) cyoVar.f0, (byte) 21);
                luk lukVarW2 = bz2Var.w();
                c8o.l(lukVarW2);
                return new nz2(q2p0Var, i8h1Var, l6h1VarE, n7h1VarF, iz2Var, xfxVar, cceVar, sp00Var, v1kVar, v1kVar2, flowableObserveOnL, fbmVarL, eyh0Var, ynb0VarA, h72Var, u961Var, flowableMapM2, oj80Var, new ev4(false, false, lukVarW2), new kp5((xfx) ((fwo) cyoVar.I).get(), (fwo) cyoVar.g0, (fwo) cyoVar.h0, (fwo) cyoVar.i0, (fwo) cyoVar.j0, (fwo) cyoVar.k0, cyoVar.s, (fwo) cyoVar.l0), new uy2((fwo) cyoVar.m0, (fwo) cyoVar.n0, (fwo) cyoVar.o0, (fwo) cyoVar.p0), xqu.a(cyoVar.F), xqu.a((fwo) cyoVar.q0));
            case 1:
                s4p0 s4p0VarR3 = ((bz2) cyoVar.G).R();
                c8o.l(s4p0VarR3);
                i8h1 i8h1VarD = s4p0VarR3.d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 2:
                xfx xfxVarA0 = ((bz2) cyoVar.G).a0();
                c8o.l(xfxVarA0);
                return xfxVarA0;
            case 3:
                return new a62((p2p0) cyoVar.c.get(), (byte) 3);
            case 4:
                return cyoVar.b.j();
            case 5:
                return k9o0.r(cyoVar.b);
            case 6:
                return new l0y((p2p0) cyoVar.c.get(), (byte) 2);
            case 7:
                return new k0y((p2p0) cyoVar.c.get(), (byte) 2);
            case 8:
                return k9o0.B(cyoVar.b);
            case 9:
                return cyoVar.b.g();
            case 10:
                return k9o0.t(cyoVar.b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                lzn0 lzn0VarC = ((bz2) cyoVar.G).c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case grn1.d /* 12 */:
                return new i5v0((z2z) cyoVar.m.get(), (cmf1) cyoVar.n.get(), (byte) 1);
            case 13:
                jly0 jly0Var = cyoVar.l;
                bz2 bz2Var2 = (bz2) cyoVar.G;
                lik1 lik1Var = (lik1) jly0Var.get();
                s6z s6zVarY0 = bz2Var2.y0();
                c8o.l(s6zVarY0);
                uny unyVarF0 = bz2Var2.f0();
                c3s c3sVarB = bz2Var2.B();
                c8o.l(c3sVarB);
                luk lukVarW3 = bz2Var2.w();
                c8o.l(lukVarW3);
                an4 an4Var = new an4(false, lukVarW3);
                luk lukVarW4 = bz2Var2.w();
                c8o.l(lukVarW4);
                return new z2z(lik1Var, s6zVarY0, unyVarF0, c3sVarB, an4Var, new uu4(false, lukVarW4));
            case 14:
                return cyoVar.b.e();
            case 15:
                jly0 jly0Var2 = cyoVar.l;
                bz2 bz2Var3 = (bz2) cyoVar.G;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = bz2Var3.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = bz2Var3.B();
                c8o.l(c3sVarB2);
                luk lukVarW5 = bz2Var3.w();
                c8o.l(lukVarW5);
                an4 an4Var2 = new an4(false, lukVarW5);
                luk lukVarW6 = bz2Var3.w();
                c8o.l(lukVarW6);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB2, an4Var2, new uu4(false, lukVarW6), bz2Var3.q());
            case 16:
                gg11 gg11VarN = ((bz2) cyoVar.G).N();
                q2p0 q2p0Var2 = cyoVar.b;
                luk lukVarW7 = ((bz2) cyoVar.G).w();
                c8o.l(lukVarW7);
                return new k2p0(gg11VarN, q2p0Var2, new dn4(lukVarW7));
            case 17:
                Flowable flowable2 = (Flowable) cyoVar.h.get();
                Flowable flowable3 = (Flowable) cyoVar.r.get();
                w9u0 w9u0Var = (w9u0) cyoVar.s.get();
                o241 o241VarI = ((bz2) cyoVar.G).i();
                c8o.l(o241VarI);
                return new ekf1(flowable2, flowable3, w9u0Var, i691Var, o241VarI, (fwo) cyoVar.H, new zy2());
            case 18:
                return f2u0.B(cyoVar.x(), (Flowable) cyoVar.p.get(), (Flowable) cyoVar.q.get(), cyoVar.d());
            case 19:
                jly0 jly0Var3 = cyoVar.h;
                bz2 bz2Var4 = (bz2) cyoVar.G;
                Flowable flowable4 = (Flowable) jly0Var3.get();
                Scheduler schedulerO3 = bz2Var4.o();
                c8o.l(schedulerO3);
                yqg yqgVarA = bz2Var4.a();
                c8o.l(yqgVarA);
                return f2u0.z(flowable4, schedulerO3, yqgVarA, cyoVar.d());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return f2u0.y((Flowable) cyoVar.h.get(), cyoVar.d());
            case 21:
                return k9o0.z(cyoVar.b);
            case 22:
                msm0 msm0VarV = ((bz2) cyoVar.G).v();
                c8o.l(msm0VarV);
                return new x4p0(msm0VarV, (n6r0) cyoVar.t.get());
            case 23:
                return cyoVar.b.i();
            case 24:
                jly0 jly0Var4 = cyoVar.h;
                bz2 bz2Var5 = (bz2) cyoVar.G;
                Flowable flowableJ = ((Flowable) jly0Var4.get()).j(mo9.N0);
                FlowableMap flowableMapM3 = cyoVar.m();
                Flowable flowableP = cyoVar.p();
                w9u0 w9u0Var2 = (w9u0) cyoVar.s.get();
                gn10 gn10Var = (gn10) cyoVar.u.get();
                mnk0 mnk0VarM = bz2Var5.m();
                c8o.l(mnk0VarM);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) cyoVar.h.get());
                pe peVarH = bz2Var5.h();
                c8o.l(peVarH);
                luk lukVarW8 = bz2Var5.w();
                c8o.l(lukVarW8);
                return new dpt0(flowableJ, flowableMapM3, flowableP, w9u0Var2, gn10Var, mnk0VarM, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW8)));
            case 25:
                return cyoVar.b.f();
            case 26:
                return new s691(cyoVar.x(), (Flowable) cyoVar.r.get(), cyoVar.p(), (w9u0) cyoVar.s.get());
            case 27:
                return new k691((Flowable) cyoVar.h.get(), (Flowable) cyoVar.r.get(), (w9u0) cyoVar.s.get(), (mrq0) cyoVar.w.get(), i691Var);
            case 28:
                rh11 rh11VarD0 = ((bz2) cyoVar.G).d0();
                c8o.l(rh11VarD0);
                zh11 zh11Var = (zh11) cyoVar.v.get();
                luk lukVarW9 = ((bz2) cyoVar.G).w();
                c8o.l(lukVarW9);
                return new gmj1(rh11VarD0, zh11Var, new un4(lukVarW9));
            case 29:
                bz2 bz2Var6 = (bz2) cyoVar.G;
                u4q0 u4q0VarS0 = bz2Var6.s0();
                c8o.l(u4q0VarS0);
                a1r0 a1r0Var = (a1r0) ((fwo) cyoVar.O).get();
                am30 am30VarS0 = bz2Var6.S0();
                c8o.l(am30VarS0);
                ynb0 ynb0VarA2 = xqu.a((fwo) cyoVar.P);
                fwo fwoVar10 = (fwo) cyoVar.Q;
                q8n q8nVarR0 = bz2Var6.r0();
                c8o.l(q8nVarR0);
                p2o0 p2o0Var = new p2o0(u4q0VarS0, a1r0Var, am30VarS0, ynb0VarA2, fwoVar10, q8nVarR0, (byte) 1);
                Flowable flowableF = ((bz2) cyoVar.G).f();
                c8o.l(flowableF);
                return new zh11(p2o0Var, flowableF);
            case 30:
                a1r0 a1r0VarC = ((bz2) cyoVar.G).C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 31:
                a1i1 a1i1VarG0 = ((bz2) cyoVar.G).g0();
                c8o.l(a1i1VarG0);
                return a1i1VarG0;
            case 32:
                luk lukVarW10 = ((bz2) cyoVar.G).w();
                c8o.l(lukVarW10);
                return new h05(false, lukVarW10);
            case 33:
                FlowableMap flowableMapX = cyoVar.x();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j((Flowable) cyoVar.h.get());
                Flowable flowableP2 = cyoVar.p();
                Flowable flowable5 = (Flowable) cyoVar.r.get();
                w9u0 w9u0Var3 = (w9u0) cyoVar.s.get();
                yp91 yp91VarB = cyoVar.B();
                im51 im51Var = (im51) cyoVar.x.get();
                luk lukVarW11 = ((bz2) cyoVar.G).w();
                c8o.l(lukVarW11);
                return new am51(flowableMapX, flowableDistinctUntilChangedJ, flowableP2, flowable5, w9u0Var3, yp91VarB, im51Var, new kn4(false, lukVarW11));
            case 34:
                yqg yqgVarA2 = ((bz2) cyoVar.G).a();
                c8o.l(yqgVarA2);
                return new im51(yqgVarA2);
            case 35:
                FlowableMap flowableMapX2 = cyoVar.x();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j((Flowable) cyoVar.h.get());
                Flowable flowableP3 = cyoVar.p();
                Flowable flowable6 = (Flowable) cyoVar.r.get();
                w9u0 w9u0Var4 = (w9u0) cyoVar.s.get();
                yp91 yp91VarB2 = cyoVar.B();
                im51 im51Var2 = (im51) cyoVar.x.get();
                luk lukVarW12 = ((bz2) cyoVar.G).w();
                c8o.l(lukVarW12);
                return new qm51(flowableMapX2, flowableDistinctUntilChangedJ2, flowableP3, flowable6, w9u0Var4, yp91VarB2, im51Var2, new kn4(false, lukVarW12));
            case 36:
                bz2 bz2Var7 = (bz2) cyoVar.G;
                bz2 bz2Var8 = (bz2) cyoVar.G;
                tp91 tp91Var = bz2Var7.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = bz2Var7.y().f;
                c8o.m(u3qVar);
                nn61 nn61VarA = u3qVar.a();
                r5v0 r5v0Var = new r5v0((p2p0) cyoVar.c.get(), (byte) 1);
                p3q p3qVarQ0 = bz2Var7.Q0();
                c8o.l(p3qVarQ0);
                dg30 dg30VarZ = bz2Var7.Z();
                c8o.l(dg30VarZ);
                hj91 hj91VarA = tp91Var.a(new pp91(nn61VarA, r5v0Var, 3, p3qVarQ0.a(dg30VarZ.e0()), 76));
                Flowable flowable7 = (Flowable) cyoVar.h.get();
                xyl1 xyl1VarP0 = bz2Var8.p0();
                c8o.l(xyl1VarP0);
                up41 up41Var = new up41(xyl1VarP0, (byte) 12);
                kt91 kt91VarJ = bz2Var8.j();
                c8o.l(kt91VarJ);
                return new dm91(hj91VarA, flowable7, up41Var, new a78(kt91VarJ));
            case 37:
                return new dx0((Flowable) cyoVar.h.get(), (xbu0) cyoVar.y.get());
            case 38:
                return k9o0.A(cyoVar.b);
            case 39:
                bz2 bz2Var9 = (bz2) cyoVar.G;
                bz2 bz2Var10 = (bz2) cyoVar.G;
                pta1 pta1VarI2 = bz2Var9.I();
                c8o.l(pta1VarI2);
                Observable map = pta1VarI2.a().map(u9x0.P0);
                FlowableMap flowableMapM4 = cyoVar.m();
                pta1 pta1VarI3 = bz2Var10.I();
                c8o.l(pta1VarI3);
                ynb0 ynb0VarA3 = xqu.a((fwo) cyoVar.W);
                luk lukVarW13 = bz2Var10.w();
                c8o.l(lukVarW13);
                return new bs0(map, flowableMapM4, pta1VarI3, ynb0VarA3, lukVarW13);
            case 40:
                dg30 dg30VarZ2 = ((bz2) cyoVar.G).Z();
                c8o.l(dg30VarZ2);
                lik1 lik1Var3 = (lik1) cyoVar.l.get();
                lua1 lua1VarQ = ((bz2) cyoVar.G).Q();
                c8o.l(lua1VarQ);
                return lua1VarQ.a(dg30VarZ2, lik1Var3);
            case 41:
                Flowable flowable8 = (Flowable) cyoVar.h.get();
                FlowableMap flowableMapX3 = cyoVar.x();
                h991 h991VarP = ((bz2) cyoVar.G).P();
                c8o.l(h991VarP);
                return new bs0(flowable8, flowableMapX3, h991VarP, xqu.a((fwo) cyoVar.Y));
            case 42:
                y991 y991VarT = ((bz2) cyoVar.G).T();
                c8o.l(y991VarT);
                return y991VarT;
            case 43:
                jly0 jly0Var5 = cyoVar.j;
                bz2 bz2Var11 = (bz2) cyoVar.G;
                d0r d0rVar = (d0r) jly0Var5.get();
                FlowableMap flowableMapM5 = cyoVar.m();
                mo9 mo9Var = new mo9((byte) 21);
                mo9 mo9Var2 = new mo9((byte) 20);
                mo9 mo9Var3 = new mo9((byte) 22);
                Resources resourcesR = bz2Var11.r();
                c8o.l(resourcesR);
                yna0 yna0Var = new yna0(resourcesR);
                ynb0 ynb0VarA4 = xqu.a((fwo) cyoVar.a0);
                ynb0 ynb0VarA5 = xqu.a(cyoVar.k);
                ynb0 ynb0VarA6 = xqu.a((fwo) cyoVar.O);
                Resources resourcesR2 = bz2Var11.r();
                c8o.l(resourcesR2);
                luk lukVarW14 = bz2Var11.w();
                c8o.l(lukVarW14);
                ln4 ln4Var = new ln4(false, lukVarW14);
                vbs vbsVarN = bz2Var11.n();
                c8o.l(vbsVarN);
                return new dpf1(d0rVar, flowableMapM5, mo9Var, mo9Var2, mo9Var3, yna0Var, ynb0VarA4, ynb0VarA5, ynb0VarA6, resourcesR2, ln4Var, vbsVarN);
            case 44:
                return ((bz2) cyoVar.G).b0();
            case 45:
                jly0 jly0Var6 = cyoVar.j;
                bz2 bz2Var12 = (bz2) cyoVar.G;
                d0r d0rVar2 = (d0r) jly0Var6.get();
                gw70 gw70VarB = bz2Var12.b();
                c8o.l(gw70VarB);
                luk lukVarW15 = bz2Var12.w();
                c8o.l(lukVarW15);
                return new u27(d0rVar2, gw70VarB, new bn4(false, lukVarW15));
            case 46:
                Flowable flowable9 = (Flowable) cyoVar.h.get();
                fl3 fl3VarK = ((bz2) cyoVar.G).K();
                c8o.l(fl3VarK);
                return new yl1(flowable9, fl3VarK, (lik1) cyoVar.l.get());
            case 47:
                jly0 jly0Var7 = cyoVar.h;
                bz2 bz2Var13 = (bz2) cyoVar.G;
                Flowable flowable10 = (Flowable) jly0Var7.get();
                Flowable flowable11 = (Flowable) cyoVar.A.get();
                w9u0 w9u0Var5 = (w9u0) cyoVar.s.get();
                Consumer consumer = (Consumer) cyoVar.B.get();
                luk lukVarW16 = bz2Var13.w();
                c8o.l(lukVarW16);
                jn4 jn4Var = new jn4(lukVarW16);
                dma1 dma1VarM0 = bz2Var13.m0();
                c8o.l(dma1VarM0);
                return new mo51(flowable10, flowable11, w9u0Var5, consumer, jn4Var, dma1VarM0);
            case 48:
                return f2u0.C(cyoVar.x(), (Flowable) cyoVar.z.get(), (Flowable) cyoVar.q.get(), cyoVar.d());
            case 49:
                jly0 jly0Var8 = cyoVar.h;
                bz2 bz2Var14 = (bz2) cyoVar.G;
                Flowable flowable12 = (Flowable) jly0Var8.get();
                Scheduler schedulerO4 = bz2Var14.o();
                c8o.l(schedulerO4);
                yqg yqgVarA3 = bz2Var14.a();
                c8o.l(yqgVarA3);
                return f2u0.A(flowable12, schedulerO4, yqgVarA3, cyoVar.d());
            case 50:
                return new lrj0(cyoVar.b, (byte) 21);
            case 51:
                bz2 bz2Var15 = (bz2) cyoVar.G;
                bz2 bz2Var16 = (bz2) cyoVar.G;
                Scheduler schedulerO5 = bz2Var15.o();
                c8o.l(schedulerO5);
                Flowable flowable13 = (Flowable) cyoVar.h.get();
                Flowable flowable14 = (Flowable) cyoVar.A.get();
                uvy uvyVarQ0 = bz2Var16.q0();
                c8o.l(uvyVarQ0);
                d0r d0rVar3 = (d0r) cyoVar.j.get();
                q8n q8nVarG = bz2Var16.g();
                c8o.l(q8nVarG);
                luk lukVarW17 = bz2Var16.w();
                c8o.l(lukVarW17);
                hv4 hv4Var = new hv4(false, false, false, lukVarW17);
                dma1 dma1VarM1 = bz2Var16.m0();
                c8o.l(dma1VarM1);
                acl aclVar = new acl(flowable13, flowable14, uvyVarQ0, d0rVar3, q8nVarG, hv4Var, dma1VarM1);
                w9u0 w9u0Var6 = (w9u0) cyoVar.s.get();
                Consumer consumer2 = (Consumer) cyoVar.B.get();
                dma1 dma1VarM2 = bz2Var16.m0();
                c8o.l(dma1VarM2);
                zr51 zr51Var = new zr51(w9u0Var6, consumer2, dma1VarM2);
                luk lukVarW18 = bz2Var16.w();
                c8o.l(lukVarW18);
                return new y441(schedulerO5, aclVar, zr51Var, new zu4(false, lukVarW18));
            case 52:
                aor aorVarE = ((bz2) cyoVar.G).E();
                c8o.l(aorVarE);
                return aorVarE;
            case 53:
                bz2 bz2Var17 = (bz2) cyoVar.G;
                bz2 bz2Var18 = (bz2) cyoVar.G;
                c9c0 c9c0VarL = bz2Var17.l();
                c8o.l(c9c0VarL);
                g5p0 g5p0VarU = bz2Var18.u();
                c8o.l(g5p0VarU);
                waz0 waz0VarD0 = bz2Var18.D0();
                c8o.l(waz0VarD0);
                return new v6z0(c9c0VarL, g5p0VarU, waz0VarD0);
            case 54:
                jly0 jly0Var9 = cyoVar.h;
                bz2 bz2Var19 = (bz2) cyoVar.G;
                Flowable flowable15 = (Flowable) jly0Var9.get();
                xh71 xh71VarZ = bz2Var19.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL2 = bz2Var19.L();
                c8o.l(fbmVarL2);
                u601 u601VarT = bz2Var19.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = bz2Var19.D();
                c8o.l(hq41VarD);
                me30 me30VarK = bz2Var19.k();
                c8o.l(me30VarK);
                Flowable flowableF2 = bz2Var19.f();
                c8o.l(flowableF2);
                f771 f771VarO = bz2Var19.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0(hq41VarD, me30VarK, flowableF2, f771VarO, (byte) 15);
                f771 f771VarO2 = bz2Var19.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = bz2Var19.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) cyoVar.C.get();
                luk lukVarW19 = bz2Var19.w();
                c8o.l(lukVarW19);
                return new o671(flowable15, xh71VarZ, fbmVarL2, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW19);
            case 55:
                return k9o0.v(cyoVar.b);
            case 56:
                FlowableMap flowableMapM6 = cyoVar.m();
                bz2 bz2Var20 = (bz2) cyoVar.G;
                Flowable flowable16 = (Flowable) cyoVar.r.get();
                qmg qmgVarV = bz2Var20.V();
                c8o.l(qmgVarV);
                o3e0 o3e0VarW = bz2Var20.W();
                oj3 oj3VarM = bz2Var20.M();
                c8o.l(oj3VarM);
                return new v3i0(flowableMapM6, flowable16, qmgVarV, o3e0VarW, oj3VarM);
            case 57:
                return ((bz2) cyoVar.G).n0();
            case 58:
                hs71 hs71VarX = ((bz2) cyoVar.G).X();
                c8o.l(hs71VarX);
                return w3p0.D(hs71VarX, (Flowable) cyoVar.h.get());
            case 59:
                jly0 jly0Var10 = cyoVar.h;
                bz2 bz2Var21 = (bz2) cyoVar.G;
                Flowable flowable17 = (Flowable) jly0Var10.get();
                d0r d0rVar4 = (d0r) cyoVar.j.get();
                boolean zBooleanValue = ((Boolean) cyoVar.D.get()).booleanValue();
                w9u0 w9u0Var7 = (w9u0) cyoVar.s.get();
                u961 u961VarK0 = bz2Var21.k0();
                ajq0 ajq0VarT0 = bz2Var21.t0();
                c3s c3sVarB3 = bz2Var21.B();
                c8o.l(c3sVarB3);
                dma1 dma1VarL0 = bz2Var21.l0();
                c8o.l(dma1VarL0);
                return new e68(flowable17, d0rVar4, zBooleanValue, w9u0Var7, u961VarK0, ajq0VarT0, c3sVarB3, new in01(dma1VarL0));
            case 60:
                return Boolean.valueOf(cyoVar.b.a());
            case 61:
                jly0 jly0Var11 = cyoVar.h;
                bz2 bz2Var22 = (bz2) cyoVar.G;
                Flowable flowable18 = (Flowable) jly0Var11.get();
                a1r0 a1r0Var2 = (a1r0) ((fwo) cyoVar.O).get();
                uvy uvyVarQ1 = bz2Var22.q0();
                c8o.l(uvyVarQ1);
                q8n q8nVarE = bz2Var22.e();
                c8o.l(q8nVarE);
                luk lukVarW20 = bz2Var22.w();
                c8o.l(lukVarW20);
                return new duy(flowable18, a1r0Var2, uvyVarQ1, q8nVarE, new wu4(false, lukVarW20));
            case 62:
                return new vsy((Flowable) cyoVar.h.get(), (w9u0) cyoVar.s.get(), (d0r) cyoVar.j.get(), ((bz2) cyoVar.G).v0());
            case 63:
                return new a4f0((Flowable) cyoVar.h.get(), (Flowable) cyoVar.r.get(), (w9u0) cyoVar.s.get());
            case 64:
                return w3p0.w(((bz2) cyoVar.G).H(), cyoVar.b, (o2p0) cyoVar.E.get());
            case 65:
                return cyoVar.b.h();
            case 66:
                p2p0 p2p0Var = (p2p0) cyoVar.c.get();
                Scheduler schedulerO6 = ((bz2) cyoVar.G).o();
                c8o.l(schedulerO6);
                return new sqq0(p2p0Var, schedulerO6);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        zl5 zl5Var = (zl5) this.c;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new kb3(this, (byte) 1);
            case 1:
                return new lyo(this, (byte) 0);
            case 2:
                return new myo(this, (byte) 0);
            case 3:
                return (yqg) ((ib3) zl5Var.b).a;
            case 4:
                return (nwt) ((ib3) zl5Var.b).H;
            case 5:
                ib3 ib3Var = (ib3) zl5Var.b;
                return new clm((mr20) ib3Var.E, (c3s) ib3Var.G);
            case 6:
                fwo fwoVar = (fwo) zl5Var.g;
                ib3 ib3Var2 = (ib3) zl5Var.b;
                ynb0 ynb0VarA = xqu.a(fwoVar);
                fwo fwoVar2 = (fwo) zl5Var.h;
                ynb0 ynb0VarA2 = xqu.a((fwo) zl5Var.i);
                h5q h5qVar = (h5q) ib3Var2.m;
                b7r0 b7r0Var = (b7r0) ib3Var2.j;
                ynb0 ynb0VarA3 = xqu.a((fwo) zl5Var.j);
                ynb0 ynb0VarA4 = xqu.a((fwo) zl5Var.k);
                ov20 ov20Var = (ov20) ib3Var2.i;
                yqg yqgVar = (yqg) ((fwo) zl5Var.c).get();
                iac0 iac0Var = (iac0) ib3Var2.x;
                n3d0 n3d0Var = (n3d0) ib3Var2.n;
                String str = (String) ib3Var2.u;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return bhb.o(ynb0VarA, fwoVar2, ynb0VarA2, h5qVar, b7r0Var, ynb0VarA3, ynb0VarA4, ov20Var, yqgVar, iac0Var, n3d0Var, str, new bn70(yon1.K(), nik1.M.b((String) ib3Var2.v), (nar0) null), (g3q0) ib3Var2.f12p, (upp0) ib3Var2.D, Optional.empty(), Optional.empty());
            case 7:
                return ((cyp) xqu.a((fwo) zl5Var.f).get()).d();
            case 8:
                cyp cypVar = (cyp) ((ib3) zl5Var.b).w;
                c8o.l(cypVar);
                return cypVar;
            case 9:
                return PlayOrigin.builder("album_playback_manager").referrerIdentifier("album").build();
            case 10:
                return ((cyp) xqu.a((fwo) zl5Var.f).get()).a();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (xrc0) ((ib3) zl5Var.b).k;
            case grn1.d /* 12 */:
                return ((zut0) ((ib3) zl5Var.b).l).a(new lb3(xqu.a((fwo) zl5Var.f), (byte) 0), xqu.a((fwo) zl5Var.h));
            case 13:
                return new nyo(this, (byte) 0);
            case 14:
                return (ugn0) ((ib3) zl5Var.b).q;
            case 15:
                return null;
            case 16:
                return new oyo(this, (byte) 0);
            case 17:
                return (ku71) xqu.a((fwo) zl5Var.o).get();
            case 18:
                ib3 ib3Var3 = (ib3) zl5Var.b;
                return new ku71((dma1) ib3Var3.r, (nfa0) ib3Var3.I, new du71());
            case 19:
                return new hfw0((i8h1) ((ib3) zl5Var.b).o);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new nfw0(brt.x(), (fwo) zl5Var.c, (fwo) zl5Var.m, (fwo) zl5Var.d, (fwo) zl5Var.e, (fwo) zl5Var.n, (fwo) zl5Var.i, (fwo) zl5Var.r, (jly0) zl5Var.q);
            case 21:
                ib3 ib3Var4 = (ib3) zl5Var.b;
                xfx xfxVar = (xfx) ib3Var4.s;
                lzn0 lzn0Var = (lzn0) ib3Var4.e;
                return new luj(xfxVar, (gw70) ib3Var4.d, (agc0) ib3Var4.t, lzn0Var, false);
            case 22:
                return new pyo(this, (byte) 0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        ezo ezoVar = (ezo) this.c;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                s45 s45Var = (zle1) ((hc3) ezoVar.v).W.get();
                c8o.l(s45Var);
                return new joc(s45Var.a("cwp_page_load"), s45Var, UUID.randomUUID().toString(), 2, ezoVar.e());
            case 1:
                ggq ggqVar = (ggq) ((hc3) ezoVar.v).m.get();
                c8o.l(ggqVar);
                cyp cypVar = (cyp) ezoVar.c.get();
                lc3 lc3Var = ezoVar.w;
                iac0 iac0VarE = ezoVar.e();
                myq0 myq0Var = new myq0(ezoVar.a);
                ruz ruzVarA = cypVar.a();
                String str = lc3Var.a;
                thq thqVar = ggqVar.a;
                teq teqVar = thqVar.c;
                xrc0 xrc0Var = (xrc0) teqVar.e1.get();
                daq daqVar = thqVar.b;
                return new id3(xrc0Var, (b7r0) daqVar.p7.get(), (yqg) daqVar.J1.get(), (t7n0) teqVar.hc.get(), (buf0) teqVar.eb.get(), (g3q0) teqVar.fb.get(), (zeu0) daqVar.C6.get(), ruzVarA, str, iac0VarE, myq0Var);
            case 2:
                t8u0 t8u0Var = (t8u0) ((hc3) ezoVar.v).l.get();
                c8o.l(t8u0Var);
                return kmq0.x(ezoVar.a, t8u0Var);
            case 3:
                s4w0 s4w0Var = (s4w0) ((hc3) ezoVar.v).e.get();
                c8o.l(s4w0Var);
                return s4w0Var;
            case 4:
                hc3 hc3Var = (hc3) ezoVar.v;
                hc3 hc3Var2 = (hc3) ezoVar.v;
                dg30 dg30Var = (dg30) hc3Var.f0.get();
                c8o.l(dg30Var);
                dto0 dto0Var = (dto0) hc3Var2.f.get();
                c8o.l(dto0Var);
                kt91 kt91Var = (kt91) hc3Var2.g.get();
                c8o.l(kt91Var);
                rh4 rh4Var = (rh4) hc3Var2.h.get();
                c8o.l(rh4Var);
                q8n q8nVarD = hc3Var2.d();
                c8o.l(q8nVarD);
                return new od3(new tzx(kt91Var, dg30Var, dto0Var, rh4Var, new Handler(dg30Var.getMainLooper()), (byte) 1), kt91Var, q8nVarD);
            case 5:
                return new pvu(ezoVar.e(), (vyo) ezoVar.e.get(), (wyo) ezoVar.f.get(), (xyo) ezoVar.g.get(), (yyo) ezoVar.h.get(), (zyo) ezoVar.i.get());
            case 6:
                return new vyo(this, (byte) 0);
            case 7:
                h9n0 h9n0Var = (h9n0) ((hc3) ezoVar.v).a.get();
                c8o.l(h9n0Var);
                return h9n0Var;
            case 8:
                xzj1 xzj1Var = (xzj1) ((hc3) ezoVar.v).b.get();
                c8o.l(xzj1Var);
                return xzj1Var;
            case 9:
                return new wyo(this);
            case 10:
                return new xyo(this, (byte) 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new yyo(this, (byte) 0);
            case grn1.d /* 12 */:
                return new zyo(this);
            case 13:
                return new azo(this, (byte) 0);
            case 14:
                return new bzo(this, (byte) 0);
            case 15:
                hc3 hc3Var3 = (hc3) ezoVar.v;
                hc3 hc3Var4 = (hc3) ezoVar.v;
                woa woaVar = (woa) hc3Var3.R.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) hc3Var4.S.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) hc3Var4.T.get();
                c8o.l(fpaVar);
                pe peVar = (pe) hc3Var4.U.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) hc3Var4.V.get()).booleanValue();
                zle1 zle1Var = (zle1) hc3Var4.W.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 16:
                return new czo();
            case 17:
                hc3 hc3Var5 = (hc3) ezoVar.v;
                hc3 hc3Var6 = (hc3) ezoVar.v;
                xfx xfxVarE = hc3Var5.e();
                c8o.l(xfxVarE);
                lzn0 lzn0VarH = hc3Var6.h();
                c8o.l(lzn0VarH);
                agc0 agc0Var = (agc0) hc3Var6.n0.get();
                c8o.l(agc0Var);
                gw70 gw70VarG = hc3Var6.g();
                c8o.l(gw70VarG);
                return new d460(xfxVarE, gw70VarG, agc0Var, lzn0VarH, false);
            case 18:
                return new dzo(this, (byte) 0);
            case 19:
                return new ryo(this);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new syo(this);
            case 21:
                return new tyo(this);
            case 22:
                return new uyo(this);
            case 23:
                lc3 lc3Var2 = ezoVar.w;
                hc3 hc3Var7 = (hc3) ezoVar.v;
                uu00 uu00Var = (uu00) hc3Var7.i.get();
                c8o.l(uu00Var);
                kv00 kv00Var = (kv00) hc3Var7.j.get();
                c8o.l(kv00Var);
                iac0 iac0VarE2 = ezoVar.e();
                q8n q8nVar = (q8n) hc3Var7.K.get();
                c8o.l(q8nVar);
                return new yd3(lc3Var2, uu00Var, kv00Var, iac0VarE2, q8nVar);
            case 24:
                p241 p241Var = (o241) ((hc3) ezoVar.v).g0.get();
                c8o.l(p241Var);
                iac0 iac0VarE3 = ezoVar.e();
                q8n q8nVar2 = (q8n) ((hc3) ezoVar.v).K.get();
                c8o.l(q8nVar2);
                return d5p1.t(o4p1.r(yoi1.g(p241Var.a), q8nVar2), cto1.q(iac0VarE3), new alb1(5000L, Long.MAX_VALUE), b7x.a);
            case 25:
                a aVarB = ezoVar.b();
                q8n q8nVar3 = (q8n) ((hc3) ezoVar.v).J.get();
                c8o.l(q8nVar3);
                iac0 iac0VarE4 = ezoVar.e();
                b93 b93Var = new b93(aVarB, q8nVar3);
                b93Var.start();
                iac0VarE4.getLifecycle().a(new i83(b93Var, (byte) 1));
                return b93Var;
            case 26:
                luk lukVarB = ((hc3) ezoVar.v).b();
                c8o.l(lukVarB);
                return new eu4(lukVarB);
            case 27:
                xfx xfxVarE2 = ((hc3) ezoVar.v).e();
                c8o.l(xfxVarE2);
                yqg yqgVar = (yqg) ((hc3) ezoVar.v).Q.get();
                c8o.l(yqgVar);
                return new tzv0(xfxVarE2, yqgVar);
            case 28:
                jma jmaVar = new jma((byte) 28);
                luk lukVarB2 = ((hc3) ezoVar.v).b();
                c8o.l(lukVarB2);
                return new zvf1(jmaVar, new oi4(false, lukVarB2));
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        jzo jzoVar = (jzo) this.c;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                oj80 oj80Var = new oj80(new km3((qm3) ((fwo) jzoVar.e).get(), (zs3) ((fwo) jzoVar.f).get(), (edr0) jzoVar.b.get()), Optional.empty(), (byte) 29);
                gs3 gs3Var = new gs3((dma1) ((fwo) jzoVar.g).get());
                qs3 qs3Var = (qs3) jzoVar.d;
                dp60 dp60Var = (dp60) qs3Var.f.get();
                c8o.l(dp60Var);
                lan1 lan1Var = new lan1((Object) dp60Var, (byte) 13);
                hu3 hu3Var = (hu3) ((fwo) jzoVar.h).get();
                uz5 uz5Var = (uz5) qs3Var.g.get();
                c8o.l(uz5Var);
                String str = (String) qs3Var.h.get();
                c8o.l(str);
                Context context = (Context) qs3Var.i.get();
                c8o.l(context);
                return new ks3(new om3(oj80Var, gs3Var, lan1Var, hu3Var, new g23(uz5Var, str, context, (byte) 11)), (Scheduler) ((fwo) jzoVar.i).get(), (Scheduler) ((fwo) jzoVar.j).get());
            case 1:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((qs3) jzoVar.d).e.get();
                c8o.l(retrofitMaker);
                return (qm3) retrofitMaker.createWebgateService(qm3.class, "android-allboarding-allboardingpage");
            case 2:
                return new zs3();
            case 3:
                return new edr0((byte) 0);
            case 4:
                dma1 dma1Var = (dma1) ((qs3) jzoVar.d).j.get();
                c8o.l(dma1Var);
                return dma1Var;
            case 5:
                zle1 zle1Var = (zle1) ((qs3) jzoVar.d).k.get();
                c8o.l(zle1Var);
                return new hu3(zle1Var);
            case 6:
                Scheduler scheduler = (Scheduler) ((qs3) jzoVar.d).p.get();
                c8o.l(scheduler);
                return scheduler;
            case 7:
                Scheduler scheduler2 = (Scheduler) ((qs3) jzoVar.d).q.get();
                c8o.l(scheduler2);
                return scheduler2;
            case 8:
                Activity activity = (Activity) ((qs3) jzoVar.d).c.get();
                c8o.l(activity);
                return activity;
            case 9:
                a1r0 a1r0Var = (a1r0) ((qs3) jzoVar.d).d.get();
                c8o.l(a1r0Var);
                return a1r0Var;
            case 10:
                ynb0 ynb0VarA = xqu.a((fwo) jzoVar.f18p);
                tdl tdlVar = new tdl((byte) 8);
                tdlVar.b = ynb0VarA;
                return tdlVar;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                fwo fwoVar = (fwo) jzoVar.m;
                jly0 jly0Var = jzoVar.c;
                jly0 jly0Var2 = jzoVar.b;
                fwo fwoVar2 = (fwo) jzoVar.n;
                fwo fwoVar3 = (fwo) jzoVar.o;
                mmm mmmVar = new mmm();
                mmmVar.a = fwoVar;
                mmmVar.b = jly0Var;
                mmmVar.c = jly0Var2;
                mmmVar.d = fwoVar2;
                mmmVar.e = fwoVar3;
                return mmmVar;
            case grn1.d /* 12 */:
                qyj qyjVar = (qyj) ((qs3) jzoVar.d).a.get();
                c8o.l(qyjVar);
                return qyjVar;
            case 13:
                Observable observable = (Observable) ((qs3) jzoVar.d).r.get();
                c8o.l(observable);
                return observable;
            case 14:
                ofz0 ofz0Var = (ofz0) ((qs3) jzoVar.d).s.get();
                c8o.l(ofz0Var);
                return ofz0Var;
            case 15:
                ynb0 ynb0VarA2 = xqu.a((fwo) jzoVar.s);
                egn0 egn0Var = new egn0((byte) 9);
                egn0Var.b = ynb0VarA2;
                return egn0Var;
            case 16:
                fwo fwoVar4 = (fwo) jzoVar.m;
                jly0 jly0Var3 = jzoVar.c;
                fwo fwoVar5 = (fwo) jzoVar.k;
                fwo fwoVar6 = (fwo) jzoVar.g;
                fwo fwoVar7 = (fwo) jzoVar.r;
                vso0 vso0Var = new vso0();
                vso0Var.a = fwoVar4;
                vso0Var.b = jly0Var3;
                vso0Var.c = fwoVar5;
                vso0Var.d = fwoVar6;
                vso0Var.e = fwoVar7;
                return vso0Var;
            case 17:
                qnv0 qnv0Var = (qnv0) ((qs3) jzoVar.d).t.get();
                c8o.l(qnv0Var);
                return qnv0Var;
            case 18:
                ynb0 ynb0VarA3 = xqu.a((fwo) jzoVar.v);
                t8c t8cVar = new t8c((byte) 3);
                t8cVar.b = ynb0VarA3;
                return t8cVar;
            case 19:
                fwo fwoVar8 = (fwo) jzoVar.m;
                jly0 jly0Var4 = jzoVar.c;
                jly0 jly0Var5 = jzoVar.b;
                fwo fwoVar9 = (fwo) jzoVar.u;
                m0e m0eVar = new m0e();
                m0eVar.a = fwoVar8;
                m0eVar.b = jly0Var4;
                m0eVar.c = jly0Var5;
                m0eVar.d = fwoVar9;
                return m0eVar;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                msm0 msm0Var = (msm0) ((qs3) jzoVar.d).u.get();
                c8o.l(msm0Var);
                return msm0Var;
            case 21:
                ynb0 ynb0VarA4 = xqu.a((fwo) jzoVar.A);
                tdl tdlVar2 = new tdl((byte) 5);
                tdlVar2.b = ynb0VarA4;
                return tdlVar2;
            case 22:
                fwo fwoVar10 = (fwo) jzoVar.m;
                jly0 jly0Var6 = jzoVar.c;
                jly0 jly0Var7 = jzoVar.b;
                fwo fwoVar11 = (fwo) jzoVar.e;
                fwo fwoVar12 = (fwo) jzoVar.f;
                fwo fwoVar13 = (fwo) jzoVar.h;
                fwo fwoVar14 = (fwo) jzoVar.x;
                fwo fwoVar15 = (fwo) jzoVar.y;
                fwo fwoVar16 = (fwo) jzoVar.z;
                fwo fwoVar17 = (fwo) jzoVar.i;
                fwo fwoVar18 = (fwo) jzoVar.j;
                o3m o3mVar = new o3m();
                o3mVar.a = fwoVar10;
                o3mVar.b = jly0Var6;
                o3mVar.c = jly0Var7;
                o3mVar.d = fwoVar11;
                o3mVar.e = fwoVar12;
                o3mVar.f = fwoVar13;
                o3mVar.g = fwoVar14;
                o3mVar.h = fwoVar15;
                o3mVar.i = fwoVar16;
                o3mVar.j = fwoVar17;
                o3mVar.k = fwoVar18;
                return o3mVar;
            case 23:
                ccc0 ccc0Var = (ccc0) ((qs3) jzoVar.d).v.get();
                c8o.l(ccc0Var);
                return new ms3(ccc0Var, cto1.q(jzoVar.a.d.c));
            case 24:
                gw70 gw70Var = (gw70) ((qs3) jzoVar.d).w.get();
                c8o.l(gw70Var);
                return gw70Var;
            case 25:
                yqg yqgVar = (yqg) ((qs3) jzoVar.d).x.get();
                c8o.l(yqgVar);
                return yqgVar;
            case 26:
                ynb0 ynb0VarA5 = xqu.a((fwo) jzoVar.C);
                x0w x0wVar = new x0w((byte) 9);
                x0wVar.b = ynb0VarA5;
                return x0wVar;
            case 27:
                fwo fwoVar19 = (fwo) jzoVar.m;
                jly0 jly0Var8 = jzoVar.c;
                ujz ujzVar = new ujz();
                ujzVar.a = fwoVar19;
                ujzVar.b = jly0Var8;
                return ujzVar;
            case 28:
                ynb0 ynb0VarA6 = xqu.a((fwo) jzoVar.E);
                g561 g561Var = new g561((byte) 19);
                g561Var.b = ynb0VarA6;
                return g561Var;
            case 29:
                fwo fwoVar20 = (fwo) jzoVar.m;
                jly0 jly0Var9 = jzoVar.c;
                tyc1 tyc1Var = new tyc1();
                tyc1Var.a = fwoVar20;
                tyc1Var.b = jly0Var9;
                return tyc1Var;
            case 30:
                r2r r2rVar = (r2r) ((qs3) jzoVar.d).n.get();
                c8o.l(r2rVar);
                return new n1n0(r2rVar);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object h() {
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) ((kw3) ((wzn) this.c).a).b.get());
        }
        if (b == 1) {
            return new kzo();
        }
        if (b == 2) {
            return new lzo();
        }
        jah.e(b);
        return null;
    }

    private final Object i() {
        s24 s24Var = (s24) this.c;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fwo fwoVar = (fwo) s24Var.c;
                dj5 dj5Var = (dj5) s24Var.b;
                return new mxg((zle1) fwoVar.get(), (lxg) dj5Var.f.get(), new ct6((lxg) dj5Var.f.get(), (byte) 1), new ou7((lxg) dj5Var.f.get(), (byte) 1), (q8n) dj5Var.a.get());
            case 1:
                return (zle1) ((dj5) s24Var.b).e.get();
            case 2:
                return (s6b1) ((dj5) s24Var.b).i.get();
            case 3:
                return (jqq0) ((dj5) s24Var.b).g.get();
            case 4:
                return (Set) ((dj5) s24Var.b).r.get();
            case 5:
                return (kwn0) ((dj5) s24Var.b).m.get();
            case 6:
                return (xf10) ((dj5) s24Var.b).q.get();
            case 7:
                return ph5.M((Context) ((dj5) s24Var.b).j.get());
            case 8:
                return (hx5) ((dj5) s24Var.b).k.get();
            case 9:
                return (s2b1) ((dj5) s24Var.b).o.get();
            case 10:
                return (exh0) ((dj5) s24Var.b).p.get();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return (h54) ((dj5) s24Var.b).n.get();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        String str;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return BehaviorSubject.f();
            case 1:
                sam0 sam0Var = (xm41) ((kly0) ((ozo) this.c).a.c).get();
                return new x1n0(sam0Var.a, (oo70) ((kly0) ((ozo) this.c).a.e).get(), new ao41(sam0Var));
            case 2:
                sam0 sam0Var2 = (xm41) ((kly0) ((ozo) this.c).a.d).get();
                return new x1n0(sam0Var2.a, (oo70) ((kly0) ((ozo) this.c).a.e).get(), new ao41(sam0Var2));
            case 3:
                t6b1 t6b1Var = (s6b1) ((kly0) ((ozo) this.c).a.f).get();
                i94 i94Var = (lxg) ((kly0) ((ozo) this.c).a.h).get();
                ApplicationScopeConfiguration applicationScopeConfiguration = new ApplicationScopeConfiguration((String) null, (String) null, false, (String) null, 15, (DefaultConstructorMarker) null);
                i94 i94Var2 = i94Var;
                i94Var2.e("get_cache_location");
                t6b1 t6b1Var2 = t6b1Var;
                applicationScopeConfiguration.setCachePath(t6b1Var2.c());
                i94Var2.a("get_cache_location");
                synchronized (t6b1Var2) {
                    try {
                        if (!t6b1Var2.o) {
                            String strE = t6b1Var2.e();
                            t6b1Var2.p = strE;
                            Logger.g("Using settings location %s", new Object[]{strE});
                            t6b1Var2.o = true;
                        }
                        str = t6b1Var2.p;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                applicationScopeConfiguration.setSettingsPath(str);
                return applicationScopeConfiguration;
            case 4:
                return ((ekp) ((kly0) ((ozo) this.c).a.k).get()).a(new File(((ozo) this.c).a.p().getCacheDir(), "nowplaying-canvas-cache"), 50000000L);
            case 5:
                return new ys80((Context) ((kly0) ((ozo) this.c).a.j).get(), (pbk1) ((kly0) ((ozo) this.c).a.n).get(), (String) ((kly0) ((ozo) this.c).a.o).get());
            case 6:
                return (xm41) ((kly0) ((ozo) this.c).a.v).get();
            case 7:
                return new Random(new SecureRandom().nextLong());
            case 8:
                try {
                    return new nkl1(((ozo) this.c).a.p(), (g341) ((kly0) ((ozo) this.c).a.p).get(), (pbk1) ((kly0) ((ozo) this.c).a.n).get(), (xye1) ((kly0) ((ozo) this.c).a.q).get(), (zn41) ((ozo) this.c).c.get());
                } catch (CertificateException e) {
                    Logger.e(e, "Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", new Object[0]);
                    n57.g("Cannot init a WebsiteAutologinUtility, falling back to default utility that does nothing", e);
                    return new cpi1();
                }
            case 9:
                return new ObservableFromPublisher(new FlowableTake(((Flowable) ((kly0) ((ozo) this.c).a.l).get()).x(new f341((byte) 13)).x(new f341((byte) 14))).J(new f341((byte) 15)));
            case 10:
                return new joo((mr20) ((kly0) ((ozo) this.c).a.m).get(), (byte) 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Boolean.FALSE;
            case grn1.d /* 12 */:
                return Boolean.FALSE;
            case 13:
                return Boolean.TRUE;
            case 14:
                return new t241((RxRouter) ((ozo) this.c).o.get(), (RxRouter) ((ozo) this.c).p.get());
            case 15:
                return new ScopedRouter((sy9) ((kly0) ((ozo) this.c).a.w).get());
            case 16:
                return new ScopedRouter((ih61) ((kly0) ((ozo) this.c).a.x).get());
            case 17:
                return new lzc((CallbackRouter) ((ozo) this.c).r.get(), (CallbackRouter) ((ozo) this.c).s.get());
            case 18:
                return new ScopedCallbackRouter((sy9) ((kly0) ((ozo) this.c).a.w).get());
            case 19:
                return new ScopedCallbackRouter((ih61) ((kly0) ((ozo) this.c).a.x).get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object k() {
        Set setSingleton;
        k9k k9kVar = (k9k) this.c;
        zwg zwgVar = (zwg) k9kVar.b;
        byte b = this.b;
        if (b == 0) {
            ActivityManager activityManager = (ActivityManager) zwgVar.b;
            c8o.l(activityManager);
            return activityManager;
        }
        if (b != 1) {
            if (b == 2) {
                t2j0 t2j0Var = (t2j0) zwgVar.c;
                c8o.l(t2j0Var);
                return t2j0Var;
            }
            if (b != 3) {
                jah.e(b);
                return null;
            }
            Scheduler scheduler = (Scheduler) zwgVar.e;
            c8o.l(scheduler);
            return scheduler;
        }
        ArrayList arrayList = new ArrayList(2);
        ynb0 ynb0VarA = xqu.a((fwo) k9kVar.d);
        Context context = (Context) zwgVar.a;
        c8o.l(context);
        ut71 ut71Var = (ut71) zwgVar.d;
        c8o.l(ut71Var);
        arrayList.add(new jy30(ynb0VarA, context, ut71Var));
        arrayList.add(new sue0());
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        return new ycc(setSingleton);
    }

    private final Object l() {
        wdm wdmVar = (wdm) this.c;
        z86 z86Var = (z86) wdmVar.c;
        c56 c56Var = (c56) wdmVar.b;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Map map = (Map) c56Var.s.get();
                c8o.l(map);
                chr0 chr0Var = z86Var.c;
                Object obj = map.get(chr0Var);
                if (obj != null) {
                    return (n86) obj;
                }
                jah.h("No ArtifactPageGating registered for ", chr0Var, ". Did you install the config module in MainActivityModule?");
                return null;
            case 1:
                nfa0 nfa0Var = (nfa0) c56Var.w.get();
                c8o.l(nfa0Var);
                String str = z86Var.a;
                String str2 = z86Var.b;
                psk pskVar = z86Var.d;
                chr0 chr0Var2 = z86Var.c;
                String str3 = z86Var.f;
                String str4 = z86Var.g;
                String str5 = z86Var.h;
                Integer num = z86Var.i;
                List listB = uiz.b(z86Var.e, nfa0Var);
                ArrayList arrayList = new ArrayList(q7h.U(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    String strA = ((n4y0) it.next()).a();
                    if (ihc1.y0(strA)) {
                        strA = "Unknown error";
                    }
                    arrayList.add(new l46(strA));
                }
                return new u46(str, str2, chr0Var2, pskVar, arrayList, str3, str4, str5, num);
            case 2:
                return new qa2((q7r0) wdmVar.d, (byte) 3);
            case 3:
                return new da6();
            case 4:
                return new qzo(this);
            case 5:
                Resources resources = (Resources) c56Var.g.get();
                c8o.l(resources);
                Function0 function0 = (Function0) ((jly0) wdmVar.g).get();
                Set set = (Set) c56Var.o.get();
                c8o.l(set);
                da6 da6Var = (da6) ((jly0) wdmVar.h).get();
                c9n c9nVar = (c9n) ((jly0) wdmVar.i).get();
                o86 o86Var = (o86) ((jly0) wdmVar.t).get();
                x1i1 x1i1Var = (x1i1) c56Var.j.get();
                c8o.l(x1i1Var);
                o3o o3oVar = (o3o) c56Var.f.get();
                c8o.l(o3oVar);
                ba6 ba6Var = (ba6) ((jly0) wdmVar.X).get();
                mlw0 mlw0Var = new mlw0(new axx0(), new mju());
                mju mjuVar = new mju();
                e220 e220Var = (e220) c56Var.m.get();
                c8o.l(e220Var);
                q120 q120Var = (q120) c56Var.n.get();
                c8o.l(q120Var);
                a1r0 a1r0Var = (a1r0) c56Var.i.get();
                c8o.l(a1r0Var);
                axc1 axc1Var = (axc1) c56Var.u.get();
                c8o.l(axc1Var);
                Map map2 = (Map) c56Var.t.get();
                c8o.l(map2);
                a4i1 a4i1Var = (a4i1) c56Var.v.get();
                c8o.l(a4i1Var);
                return new l96(resources, function0, set, da6Var, c9nVar, o86Var, x1i1Var, o3oVar, ba6Var, mlw0Var, mjuVar, e220Var, q120Var, a1r0Var, axc1Var, map2, a4i1Var);
            case 6:
                q8n q8nVar = (q8n) c56Var.d.get();
                c8o.l(q8nVar);
                return smo1.e(flo1.l(guo1.B(), q8nVar));
            case 7:
                Map map3 = (Map) c56Var.r.get();
                c8o.l(map3);
                chr0 chr0Var3 = z86Var.c;
                Object obj2 = map3.get(chr0Var3);
                if (obj2 == null) {
                    jah.h("No ArtifactPageLogger.Factory registered for ", chr0Var3, ". Did you install the config module in MainActivityModule?");
                    return null;
                }
                hgq hgqVar = (hgq) obj2;
                int iOrdinal = z86Var.d.ordinal();
                int i = 2;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i = 1;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                switch (hgqVar.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return new j9b((i8h1) ((thq) hgqVar.b).b.A5.get(), i);
                    default:
                        return new ggu0((i8h1) hgqVar.b);
                }
            case 8:
                Map map4 = (Map) c56Var.q.get();
                c8o.l(map4);
                chr0 chr0Var4 = z86Var.c;
                Object obj3 = map4.get(chr0Var4);
                if (obj3 != null) {
                    return (ba6) obj3;
                }
                jah.h("No ArtifactPageUiConfig registered for ", chr0Var4, ". Did you install the config module in MainActivityModule?");
                return null;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object m() {
        uw0 uw0Var = (uw0) this.c;
        byte b = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                t8u0 t8u0Var = (t8u0) ((dw6) uw0Var.d).k.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) uw0Var.e, t8u0Var);
            case 1:
                req reqVar = (req) ((dw6) uw0Var.d).x.get();
                c8o.l(reqVar);
                return reqVar;
            case 2:
                peq peqVar = (peq) ((dw6) uw0Var.d).y.get();
                c8o.l(peqVar);
                return peqVar;
            case 3:
                vb2 vb2Var = (vb2) ((dw6) uw0Var.d).z.get();
                c8o.l(vb2Var);
                return vb2Var;
            case 4:
                opv0 opv0Var = (opv0) ((dw6) uw0Var.d).A.get();
                c8o.l(opv0Var);
                return opv0Var;
            case 5:
                t740 t740Var = (t740) ((dw6) uw0Var.d).B.get();
                c8o.l(t740Var);
                return t740Var;
            case 6:
                return new d0p();
            case 7:
                return new e0p();
            case 8:
                return new f0p(this);
            case 9:
                return new g0p();
            case 10:
                return u1n0.z((q7r0) uw0Var.e);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                luk lukVar = (luk) ((dw6) uw0Var.d).b.get();
                c8o.l(lukVar);
                return new f54(lukVar);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object n() {
        byte b = this.b;
        if (b == 0) {
            return new i0p(this);
        }
        if (b == 1) {
            return new azo(this, (byte) 1);
        }
        if (b == 2) {
            return (opv0) ((kly0) ((zwg) ((wzn) this.c).a).e).get();
        }
        jah.e(b);
        return null;
    }

    private final Object o() {
        r6h1 r6h1Var;
        tnm tnmVar = (tnm) this.c;
        pz6 pz6Var = (pz6) tnmVar.b;
        q7r0 q7r0Var = (q7r0) tnmVar.d;
        nz6 nz6Var = (nz6) tnmVar.c;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new njm(q7r0Var);
            }
            if (b == 2) {
                ttm0 ttm0VarE = cwl1.E(q7r0Var);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            }
            if (b == 3) {
                return new k0p(this, (byte) 0);
            }
            jah.e(b);
            return null;
        }
        a7a1 a7a1Var = (a7a1) nz6Var.g.get();
        c8o.l(a7a1Var);
        String str = pz6Var.b;
        lik1 lik1VarB = pz6Var.d.isEmpty() ? nik1.I6.b(str) : nik1.J6.b(str);
        d0r d0rVarC = cwl1.C(q7r0Var);
        hvp0 hvp0Var = new hvp0(q7r0Var, (byte) 4);
        fos fosVar = new fos((byte) 1);
        kd6 kd6Var = (kd6) nz6Var.a.get();
        c8o.l(kd6Var);
        hz6 hz6Var = (hz6) nz6Var.b.get();
        c8o.l(hz6Var);
        xyf1 xyf1Var = (xyf1) nz6Var.d.get();
        c8o.l(xyf1Var);
        oyg oygVar = (oyg) nz6Var.c.get();
        c8o.l(oygVar);
        rea1 rea1Var = (rea1) nz6Var.f.get();
        c8o.l(rea1Var);
        mjm mjmVar = (mjm) ((jly0) tnmVar.e).get();
        ngs0 ngs0Var = new ngs0((mjm) ((jly0) tnmVar.e).get());
        lzn0 lzn0Var = (lzn0) nz6Var.h.get();
        c8o.l(lzn0Var);
        na9 na9Var = new na9(lzn0Var, (byte) 3);
        p6r0 p6r0VarU = tnmVar.u();
        ttm0 ttm0Var = (ttm0) ((jly0) tnmVar.f).get();
        kt91 kt91Var = (kt91) nz6Var.i.get();
        c8o.l(kt91Var);
        k0p k0pVar = (k0p) ((jly0) tnmVar.g).get();
        p6r0 p6r0VarU2 = tnmVar.u();
        boolean zIsEmpty = pz6Var.d.isEmpty();
        String str2 = pz6Var.c;
        String str3 = p6r0VarU2.c;
        if (zIsEmpty) {
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-song-dna-artist-page";
            x6h1VarI.f = "3.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.b = str3;
            x6h1VarI.d = str2;
            y6h1 y6h1VarA = x6h1VarI.a();
            Collections.singletonList("artists-dna");
            r6h1 r6h1Var2 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
        } else {
            y6h1 y6h1Var2 = y6h1.i;
            x6h1 x6h1VarI2 = i3o1.i();
            x6h1VarI2.h = "music";
            x6h1VarI2.a = "mobile-song-dna-blend-page";
            x6h1VarI2.f = "4.0.0";
            x6h1VarI2.g = "22.0.0";
            x6h1VarI2.b = str3;
            x6h1VarI2.d = str2;
            y6h1 y6h1VarA2 = x6h1VarI2.a();
            Collections.singletonList("blend-dna");
            r6h1 r6h1Var3 = r6h1.c;
            r6h1Var = new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        }
        r6h1 r6h1Var4 = r6h1Var;
        String str4 = pz6Var.c;
        c8o.m(str4);
        ((szo) ((jly0) kd6Var.a.b).get()).getClass();
        xzq xzqVar = new xzq(new jd6(mjmVar, d0rVarC, (byte) 0), fz6.Z);
        ((j0p) ((jly0) hz6Var.a.b).get()).getClass();
        xzq xzqVar2 = new xzq(new jd6(d0rVarC, (byte) 1), new oz6(lik1VarB, (byte) 0));
        aod aodVar = (aod) ((b6p) ((j6p) ((jly0) oygVar.a.c).get()).a.b).b;
        bv40 bv40Var = (bv40) aodVar.c;
        a7a1 a7a1Var2 = (a7a1) aodVar.b;
        c8o.l(a7a1Var2);
        return new rm6(a7a1Var, d0rVarC, hvp0Var, fosVar, xzqVar, xzqVar2, xyf1Var, new hw2(d0rVarC, mjmVar, hvp0Var, bv40Var, a7a1Var2), rea1Var, ttm0Var, mjmVar, k0pVar.a(str4), ngs0Var, na9Var, r6h1Var4, p6r0VarU.c, kt91Var);
    }

    private final Object p() {
        x0p x0pVar = (x0p) this.c;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zle1 zle1Var = (zle1) x0pVar.b.i.get();
                c8o.l(zle1Var);
                return new rg7(zle1Var);
            case 1:
                return new o0p(this);
            case 2:
                return new p0p(this);
            case 3:
                ub7 ub7Var = x0pVar.b;
                ub7 ub7Var2 = x0pVar.b;
                sjj0 sjj0VarB = ub7Var.b();
                c8o.l(sjj0VarB);
                q0p q0pVar = (q0p) x0pVar.f.get();
                rg7 rg7Var = (rg7) x0pVar.e.get();
                lfb lfbVar = new lfb((byte) 22);
                kly0 kly0Var = ub7Var2.D;
                kly0 kly0Var2 = ub7Var2.B;
                kly0 kly0Var3 = ub7Var2.j;
                kly0 kly0Var4 = ub7Var2.e;
                kly0 kly0Var5 = ub7Var2.m;
                kly0 kly0Var6 = ub7Var2.E;
                sjj0 sjj0VarB2 = ub7Var2.b();
                c8o.l(sjj0VarB2);
                RetrofitMaker retrofitMaker = (RetrofitMaker) kly0Var5.get();
                c8o.l(retrofitMaker);
                x9a sp01Var = new sp01(new lc20(sjj0VarB2, (wlu0) retrofitMaker.createWebgateService(wlu0.class, "android-assisted-curation-assistedcurationcontent"), new lfb((byte) 22), (byte) 12), new fjb((byte) 1), x0pVar.a(), a06.m());
                x9a x9aVar = (gv81) x0pVar.h.get();
                Context contextA = ub7Var2.a();
                c8o.l(contextA);
                b7n b7nVar = (b7n) kly0Var3.get();
                c8o.l(b7nVar);
                xrc0 xrc0VarC = ub7Var2.c();
                c8o.l(xrc0VarC);
                String str = x0pVar.a.b;
                c8o.m(str);
                fjb fjbVar = new fjb((byte) 1);
                sjj0 sjj0VarB3 = ub7Var2.b();
                c8o.l(sjj0VarB3);
                pob pobVar = new pob((byte) 19, false);
                r87 r87VarM = a06.m();
                agc0 agc0Var = (agc0) ub7Var2.U.get();
                c8o.l(agc0Var);
                x9a icc0Var = new icc0(contextA, b7nVar, xrc0VarC, str, fjbVar, sjj0VarB3, pobVar, r87VarM, agc0Var, new lfb((byte) 22));
                Context contextA2 = ub7Var2.a();
                c8o.l(contextA2);
                xrc0 xrc0VarC2 = ub7Var2.c();
                c8o.l(xrc0VarC2);
                fjb fjbVar2 = new fjb((byte) 1);
                sjj0 sjj0VarB4 = ub7Var2.b();
                c8o.l(sjj0VarB4);
                x9a hmm0Var = new hmm0(contextA2, xrc0VarC2, fjbVar2, sjj0VarB4, a06.m(), new lfb((byte) 22));
                Context contextA3 = ub7Var2.a();
                c8o.l(contextA3);
                o411 o411Var = (o411) x0pVar.g.get();
                String strA = x0pVar.a();
                fjb fjbVar3 = new fjb((byte) 1);
                r87 r87VarM2 = a06.m();
                Context contextA4 = ub7Var2.a();
                c8o.l(contextA4);
                Activity activity = (Activity) x0pVar.i.get();
                lzn0 lzn0Var = (lzn0) ub7Var2.h.get();
                c8o.l(lzn0Var);
                String strA2 = x0pVar.a();
                xvo xvoVar = (xvo) ub7Var2.r.get();
                c8o.l(xvoVar);
                pch1 pch1Var = (pch1) kly0Var2.get();
                c8o.l(pch1Var);
                dlg1 dlg1Var = pch1Var.b;
                a1r0 a1r0Var = (a1r0) kly0Var.get();
                c8o.l(a1r0Var);
                a1r0 a1r0Var2 = (a1r0) kly0Var.get();
                c8o.l(a1r0Var2);
                f2g1 f2g1Var = new f2g1(a1r0Var2, (byte) 1);
                vxe1 vxe1Var = (vxe1) ub7Var2.C.get();
                c8o.l(vxe1Var);
                fwo fwoVar = x0pVar.j;
                pch1 pch1Var2 = (pch1) kly0Var2.get();
                c8o.l(pch1Var2);
                x9a hmm0Var2 = new hmm0(contextA3, o411Var, strA, fjbVar3, r87VarM2, new uw0(contextA4, activity, lzn0Var, strA2, xvoVar, dlg1Var, a1r0Var, f2g1Var, vxe1Var, fwoVar, pch1Var2.d));
                Context contextA5 = ub7Var2.a();
                c8o.l(contextA5);
                sjj0 sjj0VarB5 = ub7Var2.b();
                c8o.l(sjj0VarB5);
                fjb fjbVar4 = new fjb((byte) 1);
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) kly0Var5.get();
                c8o.l(retrofitMaker2);
                x9a hmm0Var3 = new hmm0(contextA5, sjj0VarB5, fjbVar4, (fmm0) retrofitMaker2.createWebgateService(fmm0.class, "android-assisted-curation-assistedcurationcontent"), a06.m(), new lfb((byte) 22));
                yqg yqgVar = (yqg) kly0Var4.get();
                c8o.l(yqgVar);
                Context contextA6 = ub7Var2.a();
                c8o.l(contextA6);
                String strA3 = x0pVar.a();
                fjb fjbVar5 = new fjb((byte) 1);
                r87 r87VarM3 = a06.m();
                vz01 vz01Var = (vz01) kly0Var6.get();
                c8o.l(vz01Var);
                x9a fv81Var = new fv81(yqgVar, contextA6, strA3, fjbVar5, r87VarM3, vz01Var, new lfb((byte) 22), (byte) 1);
                Context contextA7 = ub7Var2.a();
                c8o.l(contextA7);
                fjb fjbVar6 = new fjb((byte) 1);
                r87 r87VarM4 = a06.m();
                sjj0 sjj0VarB6 = ub7Var2.b();
                c8o.l(sjj0VarB6);
                lfb lfbVar2 = new lfb((byte) 22);
                np01 np01Var = (np01) ub7Var2.J.get();
                c8o.l(np01Var);
                x9a sp01Var2 = new sp01(contextA7, fjbVar6, r87VarM4, new yp01(sjj0VarB6, lfbVar2, np01Var));
                Context contextA8 = ub7Var2.a();
                c8o.l(contextA8);
                String strA4 = x0pVar.a();
                fjb fjbVar7 = new fjb((byte) 1);
                rg7 rg7Var2 = (rg7) x0pVar.e.get();
                r87 r87VarM5 = a06.m();
                vz01 vz01Var2 = (vz01) kly0Var6.get();
                c8o.l(vz01Var2);
                x9a ctc1Var = new ctc1(contextA8, strA4, fjbVar7, rg7Var2, r87VarM5, vz01Var2, new lfb((byte) 22));
                yqg yqgVar2 = (yqg) kly0Var4.get();
                c8o.l(yqgVar2);
                Context contextA9 = ub7Var2.a();
                c8o.l(contextA9);
                String strA5 = x0pVar.a();
                fjb fjbVar8 = new fjb((byte) 1);
                r87 r87VarM6 = a06.m();
                vz01 vz01Var3 = (vz01) kly0Var6.get();
                c8o.l(vz01Var3);
                x9a fv81Var2 = new fv81(yqgVar2, contextA9, strA5, fjbVar8, r87VarM6, vz01Var3, new lfb((byte) 22), (byte) 0);
                Context contextA10 = ub7Var2.a();
                c8o.l(contextA10);
                String strA6 = x0pVar.a();
                fjb fjbVar9 = new fjb((byte) 1);
                rg7 rg7Var3 = (rg7) x0pVar.e.get();
                r87 r87VarM7 = a06.m();
                vz01 vz01Var4 = (vz01) kly0Var6.get();
                c8o.l(vz01Var4);
                x9a ysc1Var = new ysc1(contextA10, strA6, fjbVar9, rg7Var3, r87VarM7, vz01Var4, new lfb((byte) 22));
                Context contextA11 = ub7Var2.a();
                c8o.l(contextA11);
                fjb fjbVar10 = new fjb((byte) 1);
                sjj0 sjj0VarB7 = ub7Var2.b();
                c8o.l(sjj0VarB7);
                RetrofitMaker retrofitMaker3 = (RetrofitMaker) kly0Var5.get();
                c8o.l(retrofitMaker3);
                x9a sp01Var3 = new sp01(contextA11, fjbVar10, sjj0VarB7, (t5a1) retrofitMaker3.createWebgateService(t5a1.class, "android-socialrecommendation-endpoints"), new lfb((byte) 22));
                yqg yqgVar3 = (yqg) kly0Var4.get();
                c8o.l(yqgVar3);
                Context contextA12 = ub7Var2.a();
                c8o.l(contextA12);
                String strA7 = x0pVar.a();
                b7n b7nVar2 = (b7n) kly0Var3.get();
                c8o.l(b7nVar2);
                xrc0 xrc0VarC3 = ub7Var2.c();
                c8o.l(xrc0VarC3);
                iyc0 iyc0Var = (iyc0) ub7Var2.R.get();
                c8o.l(iyc0Var);
                fjb fjbVar11 = new fjb((byte) 1);
                sjj0 sjj0VarB8 = ub7Var2.b();
                c8o.l(sjj0VarB8);
                Set setB0 = dm61.B0(new x9a[]{x9aVar, sp01Var, icc0Var, hmm0Var, hmm0Var2, hmm0Var3, sp01Var2, fv81Var, ctc1Var, fv81Var2, ysc1Var, sp01Var3, new a5c(yqgVar3, contextA12, strA7, b7nVar2, xrc0VarC3, iyc0Var, fjbVar11, sjj0VarB8, a06.m(), new lfb((byte) 22))});
                int iS = zno1.s(q7h.U(setB0, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj : setB0) {
                    linkedHashMap.put(((x9a) obj).e(), obj);
                }
                luk lukVar = (luk) ub7Var2.A.get();
                c8o.l(lukVar);
                return new yvd(sjj0VarB, q0pVar, rg7Var, lfbVar, linkedHashMap, new qdy0(new pl4(lukVar)));
            case 4:
                return new q0p();
            case 5:
                ub7 ub7Var3 = x0pVar.b;
                ub7 ub7Var4 = x0pVar.b;
                yqg yqgVar4 = (yqg) ub7Var3.e.get();
                c8o.l(yqgVar4);
                Context contextA13 = ub7Var4.a();
                c8o.l(contextA13);
                o411 o411Var2 = (o411) x0pVar.g.get();
                sjj0 sjj0VarB9 = ub7Var4.b();
                c8o.l(sjj0VarB9);
                gid gidVar = new gid(sjj0VarB9, new lfb((byte) 22), (byte) 27);
                sjj0 sjj0VarB10 = ub7Var4.b();
                c8o.l(sjj0VarB10);
                return new gv81(yqgVar4, contextA13, o411Var2, gidVar, new em3(sjj0VarB10, new lfb((byte) 22), (byte) 17), new fjb((byte) 1), a06.m());
            case 6:
                RetrofitMaker retrofitMaker4 = (RetrofitMaker) x0pVar.b.m.get();
                c8o.l(retrofitMaker4);
                i411 i411Var = (i411) retrofitMaker4.createWebgateService(i411.class, "android-assisted-curation-assistedcurationcontent");
                sjj0 sjj0VarB11 = x0pVar.b.b();
                c8o.l(sjj0VarB11);
                return new o411(i411Var, sjj0VarB11, new lfb((byte) 22));
            case 7:
                Activity activity2 = (Activity) x0pVar.b.g.get();
                c8o.l(activity2);
                return activity2;
            case 8:
                a1r0 a1r0Var3 = (a1r0) x0pVar.b.D.get();
                c8o.l(a1r0Var3);
                return new kah1(new up0(a1r0Var3));
            case 9:
                return ((r0p) x0pVar.m.get()).a(x0pVar.a.a, "7547a696ffa74995a5f05e7f08c79e5a", "assisted-curation");
            case 10:
                return new r0p(this, b);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ttm0 ttm0VarE = cwl1.E(x0pVar.c);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case grn1.d /* 12 */:
                d690 d690Var = new d690();
                BehaviorSubject.f();
                return d690Var;
            case 13:
                return new zx11();
            case 14:
                v6q v6qVar = (v6q) x0pVar.b.M.get();
                c8o.l(v6qVar);
                return new x5b0(v6qVar, (d0r) x0pVar.q.get());
            case 15:
                return cwl1.C(x0pVar.c);
            case 16:
                c8o.l((v9q) x0pVar.b.q.get());
                return new aek1(20, 50);
            case 17:
                return new s0p(this);
            case 18:
                v6q v6qVar2 = (v6q) x0pVar.b.M.get();
                c8o.l(v6qVar2);
                umf0 umf0Var = new umf0(v6qVar2, (d0r) x0pVar.q.get());
                alk0 alk0Var = (alk0) x0pVar.b.l.get();
                c8o.l(alk0Var);
                return new wyf1(umf0Var, alk0Var, (d0r) x0pVar.q.get(), (b6p0) x0pVar.v.get());
            case 19:
                x0pVar.getClass();
                ub7 ub7Var5 = x0pVar.b;
                yb7 yb7Var = x0pVar.a;
                rxj0 rxj0Var = (rxj0) ub7Var5.P.get();
                c8o.l(rxj0Var);
                mr20 mr20Var = (mr20) ub7Var5.x.get();
                c8o.l(mr20Var);
                xrc0 xrc0VarC4 = ub7Var5.c();
                c8o.l(xrc0VarC4);
                mnk0 mnk0Var = (mnk0) ub7Var5.y.get();
                c8o.l(mnk0Var);
                z6k0 z6k0Var = (z6k0) ub7Var5.k.get();
                c8o.l(z6k0Var);
                sjj0 sjj0VarB12 = ub7Var5.b();
                c8o.l(sjj0VarB12);
                x5p0 x5p0Var = new x5p0(yb7Var, rxj0Var, mr20Var, xrc0VarC4, mnk0Var, z6k0Var, sjj0VarB12);
                yqg yqgVar5 = (yqg) ub7Var5.e.get();
                c8o.l(yqgVar5);
                iac0 iac0Var = x0pVar.c.d.c;
                c8o.m(iac0Var);
                return new b6p0(x5p0Var, yqgVar5, iac0Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ufs ufsVar = (ufs) x0pVar.b.K.get();
                c8o.l(ufsVar);
                return new ec8(ufsVar, (byte) 1);
            case 21:
                ufs ufsVar2 = (ufs) x0pVar.b.K.get();
                c8o.l(ufsVar2);
                return new ec8(ufsVar2, (byte) 0);
            case 22:
                return new t0p(this, (byte) 0);
            case 23:
                return new u0p(this, (byte) 0);
            case 24:
                return new v0p(this, (byte) 0);
            case 25:
                return new w0p(this, (byte) 0);
            case 26:
                t8u0 t8u0Var = (t8u0) x0pVar.b.G.get();
                c8o.l(t8u0Var);
                return kmq0.x(x0pVar.c, t8u0Var);
            case 27:
                return new l0p(this, (byte) 0);
            case 28:
                return new m0p(this, (byte) 0);
            case 29:
                return new n0p(this);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object q() {
        yxo yxoVar = (yxo) this.c;
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new g1p(this, (byte) 0);
            case 1:
                return new md7();
            case 2:
                return new t0p(this, (byte) 1);
            case 3:
                return new u0p(this, (byte) 1);
            case 4:
                return new v0p(this, (byte) 1);
            case 5:
                return new w0p(this, (byte) 1);
            case 6:
                t8u0 t8u0Var = (t8u0) ((ae7) yxoVar.d).x.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) yxoVar.e, t8u0Var);
            case 7:
                return new l0p(this, (byte) 1);
            case 8:
                return new m0p(this, (byte) 1);
            case 9:
                return new h1p(this);
            case 10:
                return new i1p(this, (byte) 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new y0p(this, (byte) 0);
            case grn1.d /* 12 */:
                return new z0p((byte) 0);
            case 13:
                return new yf7();
            case 14:
                p6r0 p6r0VarE = ((be7) yxoVar.c).d.e();
                c8o.m(p6r0VarE);
                return ((r0p) yxoVar.Q0.get()).a(p6r0VarE.c, "492fe76563af46f2b24a4322e1110b5c", "assisted-curation-search");
            case 15:
                return new r0p(this, b);
            case 16:
                ttm0 ttm0VarE = cwl1.E((q7r0) yxoVar.e);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 17:
                return new a1p(this, (byte) 0);
            case 18:
                return new b1p(this, (byte) 0);
            case 19:
                return new c1p(this, (byte) 0);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new d1p(this, (byte) 0);
            case 21:
                return new e1p(this, (byte) 0);
            case 22:
                return new f1p(this);
            case 23:
                c8o.l((v9q) ((ae7) yxoVar.d).n.get());
                return new nd51((x5b0) yxoVar.a1.get());
            case 24:
                v6q v6qVar = (v6q) ((ae7) yxoVar.d).E.get();
                c8o.l(v6qVar);
                return new x5b0(v6qVar, (d0r) yxoVar.Z0.get());
            case 25:
                return cwl1.C((q7r0) yxoVar.e);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object r() {
        voa voaVar = (voa) this.c;
        byte b = 2;
        byte b2 = this.b;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new g1p(this, (byte) 1);
            case 1:
                return new md7();
            case 2:
                return new t0p(this, (byte) 2);
            case 3:
                return new u0p(this, (byte) 2);
            case 4:
                return new v0p(this, (byte) 2);
            case 5:
                return new w0p(this, (byte) 2);
            case 6:
                t8u0 t8u0Var = (t8u0) ((oe7) voaVar.b).x.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) voaVar.c, t8u0Var);
            case 7:
                return new l0p(this, (byte) 2);
            case 8:
                return new m0p(this, (byte) 2);
            case 9:
                return new m1p(this);
            case 10:
                return new i1p(this, (byte) 1);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new y0p(this, (byte) 1);
            case grn1.d /* 12 */:
                return new z0p((byte) 1);
            case 13:
                return new yf7();
            case 14:
                return ((r0p) ((jly0) voaVar.p).get()).a(((pe7) voaVar.a).a, "492fe76563af46f2b24a4322e1110b5c", "assisted-curation-search");
            case 15:
                return new r0p(this, b);
            case 16:
                ttm0 ttm0VarE = cwl1.E((q7r0) voaVar.c);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 17:
                return new a1p(this, (byte) 1);
            case 18:
                return new b1p(this, (byte) 1);
            case 19:
                return new c1p(this, (byte) 1);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new d1p(this, (byte) 1);
            case 21:
                return new e1p(this, (byte) 1);
            case 22:
                return new j1p(this);
            case 23:
                c8o.l((v9q) ((oe7) voaVar.b).o.get());
                return new nd51((x5b0) ((jly0) voaVar.z).get());
            case 24:
                v6q v6qVar = (v6q) ((oe7) voaVar.b).E.get();
                c8o.l(v6qVar);
                return new x5b0(v6qVar, (d0r) ((jly0) voaVar.y).get());
            case 25:
                return cwl1.C((q7r0) voaVar.c);
            case 26:
                return new k1p(this);
            case 27:
                return new l1p(this);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object s() {
        byte b = this.b;
        if (b == 0) {
            return new p1p(this);
        }
        if (b == 1) {
            return new q1p(this, (byte) 0);
        }
        if (b == 2) {
            return new r1p();
        }
        jah.e(b);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:256:0x0ded  */
    /* JADX WARN: Code duplicated, block: B:258:0x0df7  */
    /* JADX WARN: Code duplicated, block: B:260:0x0dfe  */
    /* JADX WARN: Code duplicated, block: B:261:0x0e13  */
    public final Object get() {
        vkg cls;
        Object ffo0Var;
        Constructor<?>[] declaredConstructors;
        g6h1 g6h1Var;
        b2r0 b2r0VarF;
        w1r0 ansVar;
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 4;
        byte b4 = 3;
        byte b5 = 2;
        byte b6 = 1;
        Object obj = this.c;
        byte b7 = this.b;
        vkg cls2 = null;
        byte b8 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gwo gwoVar = (gwo) obj;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        gwoVar.getClass();
                        mk mkVar = gwoVar.a;
                        t360 t360Var = new t360(6);
                        t360Var.a(gwoVar.g.get());
                        t360Var.a(gwoVar.h.get());
                        t360Var.a(gwoVar.i.get());
                        t360Var.a(gwoVar.j.get());
                        t360Var.a(gwoVar.k.get());
                        t360Var.a(gwoVar.l.get());
                        return new vdr(t360Var.d(), (BluetoothCategorizer) mkVar.c.get(), (rdr) gwoVar.d.get(), (q8n) mkVar.b.get());
                    case 1:
                        return new rdr(gwoVar.b, gwoVar.c);
                    case 2:
                        return (fuf0) gwoVar.a.g.get();
                    case 3:
                        return (p7s) gwoVar.a.f.get();
                    case 4:
                        return new jw7(xqu.a(gwoVar.f), (mw7) gwoVar.a.j.get());
                    case 5:
                        return (Context) gwoVar.a.a.get();
                    case 6:
                        mk mkVar2 = gwoVar.a;
                        mk mkVar3 = gwoVar.a;
                        return new yfb((a84) mkVar2.d.get(), (o4o0) mkVar3.e.get(), (Observable) mkVar3.k.get(), (q8n) mkVar3.b.get());
                    case 7:
                        return new spd((ypd) gwoVar.a.l.get());
                    case 8:
                        return new st40((ut40) gwoVar.a.m.get());
                    case 9:
                        fwo fwoVar = gwoVar.f;
                        mk mkVar4 = gwoVar.a;
                        return new nwh0(xqu.a(fwoVar), (o4o0) mkVar4.e.get(), (o7s) mkVar4.i.get(), gwoVar.b, (q8n) mkVar4.b.get());
                    case 10:
                        fwo fwoVar2 = gwoVar.f;
                        mk mkVar5 = gwoVar.a;
                        return new wwh0(xqu.a(fwoVar2), (o4o0) mkVar5.e.get(), gwoVar.c, (jks) mkVar5.h.get(), (q8n) mkVar5.b.get());
                    default:
                        jah.e(b7);
                        return null;
                }
            case 1:
                em0 em0Var = (em0) obj;
                qq qqVar = (qq) em0Var.b;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        oq oqVarAccountSwitcherCredentialManager = ((uq) ((jly0) em0Var.d).get()).accountSwitcherCredentialManager();
                        c8o.m(oqVarAccountSwitcherCredentialManager);
                        return oqVarAccountSwitcherCredentialManager;
                    case 1:
                        uq8 uq8Var = new uq8((em0) em0Var.c, (byte) 24);
                        try {
                            try {
                                cls = Class.forName("com.spotify.accountswitching.switcher.dynamic.DynamicFeatureProviderImpl");
                            } catch (ClassNotFoundException unused) {
                                cls2 = Class.forName("com.spotify.accountswitching.switcherimpl.AccountSwitcherProviderImpl");
                                cls = cls2;
                                if (cls != null) {
                                    declaredConstructors = cls.getDeclaredConstructors();
                                    declaredConstructors.getClass();
                                    if (declaredConstructors.length == 0) {
                                        ffo0Var = new ffo0();
                                    } else {
                                        ffo0Var = (uq) ((Constructor) f46.j0(cls.getDeclaredConstructors())).newInstance(uq8Var);
                                    }
                                } else {
                                    ffo0Var = new ffo0();
                                }
                                return ffo0Var;
                            }
                            break;
                        } catch (ClassNotFoundException unused2) {
                            cls = cls2;
                        }
                        if (cls != null) {
                            declaredConstructors = cls.getDeclaredConstructors();
                            declaredConstructors.getClass();
                            if (declaredConstructors.length == 0) {
                                ffo0Var = new ffo0();
                            } else {
                                ffo0Var = (uq) ((Constructor) f46.j0(cls.getDeclaredConstructors())).newInstance(uq8Var);
                            }
                        } else {
                            ffo0Var = new ffo0();
                        }
                        return ffo0Var;
                    case 2:
                        mya1 mya1Var = (mya1) qqVar.h;
                        c8o.l(mya1Var);
                        return mya1Var;
                    case 3:
                        return Boolean.TRUE;
                    case 4:
                        Scheduler scheduler = (Scheduler) qqVar.n;
                        c8o.l(scheduler);
                        return scheduler;
                    case 5:
                        yv yvVar = (yv) qqVar.p;
                        c8o.l(yvVar);
                        return yvVar;
                    case 6:
                        wbd1 wbd1Var = (wbd1) qqVar.l;
                        c8o.l(wbd1Var);
                        return wbd1Var;
                    case 7:
                        vbd1 vbd1Var = (vbd1) qqVar.m;
                        c8o.l(vbd1Var);
                        return vbd1Var;
                    default:
                        jah.e(b7);
                        return null;
                }
            case 2:
                wdm wdmVar = (wdm) obj;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return (qhe0) ((jly0) wdmVar.c).get();
                    case 1:
                        c2r0 c2r0Var = (c2r0) ((d21) wdmVar.b).A.get();
                        c8o.l(c2r0Var);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return c2r0Var.b(yon1.v(), (qir0) null);
                    case 2:
                        return new lwo(this);
                    case 3:
                        d21 d21Var = (d21) wdmVar.b;
                        d21 d21Var2 = (d21) wdmVar.b;
                        c8o.l((a11) d21Var.a.get());
                        Context context = (Context) d21Var2.d.get();
                        c8o.l(context);
                        vxe0 vxe0Var = (vxe0) d21Var2.e.get();
                        c8o.l(vxe0Var);
                        vf8 vf8Var = (vf8) d21Var2.f.get();
                        c8o.l(vf8Var);
                        RetrofitMaker retrofitMaker = (RetrofitMaker) d21Var2.g.get();
                        c8o.l(retrofitMaker);
                        ou71 ou71Var = (ou71) d21Var2.h.get();
                        c8o.l(ou71Var);
                        x01 x01Var = (x01) d21Var2.i.get();
                        c8o.l(x01Var);
                        c8o.l((iwe0) d21Var2.j.get());
                        c8o.l((ohv0) d21Var2.m.get());
                        p3n1 p3n1Var = (p3n1) d21Var2.n.get();
                        c8o.l(p3n1Var);
                        x2g1 x2g1Var = (x2g1) d21Var2.o.get();
                        c8o.l(x2g1Var);
                        a911 a911Var = (a911) d21Var2.p.get();
                        c8o.l(a911Var);
                        hj01 hj01Var = (hj01) d21Var2.v.get();
                        c8o.l(hj01Var);
                        br81 br81Var = (br81) d21Var2.x.get();
                        c8o.l(br81Var);
                        g1f0 g1f0Var = (g1f0) d21Var2.u.get();
                        c8o.l(g1f0Var);
                        v4s0 v4s0Var = (v4s0) d21Var2.y.get();
                        c8o.l(v4s0Var);
                        jqt jqtVar = (jqt) d21Var2.w.get();
                        c8o.l(jqtVar);
                        nfa0 nfa0Var = (nfa0) d21Var2.z.get();
                        c8o.l(nfa0Var);
                        tzr0 tzr0Var = new tzr0(g1f0Var, v4s0Var, jqtVar, new yrg0(nfa0Var, (byte) 5), (byte) 2);
                        Set set = (Set) d21Var2.c.get();
                        c8o.l(set);
                        Set set2 = set;
                        String str = (String) d21Var2.q.get();
                        c8o.l(str);
                        String str2 = (String) d21Var2.r.get();
                        c8o.l(str2);
                        jqt jqtVar2 = (jqt) d21Var2.w.get();
                        c8o.l(jqtVar2);
                        return new j21(context, vxe0Var, vf8Var, retrofitMaker, ou71Var, x01Var, p3n1Var, x2g1Var, a911Var, hj01Var, br81Var, tzr0Var, set2, str, str2, jqtVar2);
                    case 4:
                        return (qhe0) ((jly0) wdmVar.c).get();
                    case 5:
                        r6h1 r6h1Var = r6h1.c;
                        return new vzl0();
                    case 6:
                        r6h1 r6h1Var2 = r6h1.c;
                        return new wdl0();
                    case 7:
                        r6h1 r6h1Var3 = r6h1.c;
                        return new zdl0();
                    case 8:
                        r6h1 r6h1Var4 = r6h1.c;
                        return new xzl0();
                    case 9:
                        r6h1 r6h1Var5 = r6h1.c;
                        return new yzl0();
                    case 10:
                        return new mir0(((qhe0) ((jly0) wdmVar.c).get()).a());
                    default:
                        jah.e(b7);
                        return null;
                }
            case 3:
                qq qqVar2 = (qq) obj;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return new owo(this, (byte) 0);
                    case 1:
                        return new pwo(this, (byte) 0);
                    case 2:
                        return u1n0.z((q7r0) qqVar2.b);
                    case 3:
                        return new qwo(this, (byte) 0);
                    case 4:
                        return new rwo(this, (byte) 0);
                    case 5:
                        return new swo(this, (byte) 0);
                    case 6:
                        muz muzVar = (muz) ((jly0) qqVar2.i).get();
                        nb1 nb1Var = (nb1) qqVar2.c;
                        return new rxr0(muzVar, PlayOrigin.builder(nb1Var.d.d).viewUri(nb1Var.b.a).build());
                    case 7:
                        q7r0 q7r0Var = (q7r0) qqVar2.b;
                        t8u0 t8u0Var = (t8u0) ((mb1) qqVar2.a).h.get();
                        c8o.l(t8u0Var);
                        return kmq0.w(q7r0Var, t8u0Var);
                    case 8:
                        return new two((byte) 0);
                    case 9:
                        return new uwo();
                    case 10:
                        return new vwo();
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        return new wwo(this);
                    case grn1.d /* 12 */:
                        return new mwo(this);
                    case 13:
                        return new nwo(this);
                    case 14:
                        nb1 nb1Var2 = (nb1) qqVar2.c;
                        mb1 mb1Var = (mb1) qqVar2.a;
                        l2r l2rVar = (dv00) mb1Var.k.get();
                        c8o.l(l2rVar);
                        l2r l2rVar2 = (ztw0) mb1Var.l.get();
                        c8o.l(l2rVar2);
                        a9q a9qVar = (a9q) mb1Var.m.get();
                        c8o.l(a9qVar);
                        return new e5b0(30, p7h.M(new l2r[]{l2rVar, l2rVar2, a9qVar.a(nb1Var2.d.d)}), (List) null);
                    default:
                        jah.e(b7);
                        return null;
                }
            case 4:
                if (b7 == 0) {
                    return new zwo(this);
                }
                if (b7 == 1) {
                    return new axo((byte) 0);
                }
                if (b7 == 2) {
                    return new bxo((byte) 0);
                }
                if (b7 == 3) {
                    return new cxo((byte) 0);
                }
                if (b7 == 4) {
                    return new dxo();
                }
                if (b7 == 5) {
                    return new exo();
                }
                jah.e(b7);
                return null;
            case 5:
                ib3 ib3Var = (ib3) obj;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return new gxo(this, b8);
                    case 1:
                        jt1 jt1Var = (jt1) ib3Var.a;
                        c2r0 c2r0Var2 = (c2r0) ((kt1) ib3Var.b).d.get();
                        c8o.l(c2r0Var2);
                        if (ib3Var.d().b()) {
                            tv80 parcelable = jt1Var.O0().getParcelable("interaction_logging_result");
                            if (parcelable == null || (g6h1Var = parcelable.g) == null) {
                                g6h1.Companion.getClass();
                                g6h1Var = g6h1.e;
                            }
                            g6h1 g6h1Var2 = g6h1Var;
                            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                            b2r0VarF = c2r0Var2.f(jt1Var, yon1.B3(), nik1.F1.a(), new nar0(new gpk0(yon1.B3().c)), g6h1Var2);
                        } else {
                            AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                            p6r0 p6r0VarB3 = yon1.B3();
                            qir0 qir0VarA = nik1.F1.a();
                            g6h1.Companion.getClass();
                            b2r0VarF = c2r0.c(c2r0Var2, jt1Var, p6r0VarB3, qir0VarA, g6h1.d, 16);
                        }
                        b2r0 b2r0Var = b2r0VarF;
                        c8o.m(b2r0Var);
                        return b2r0Var;
                    case 2:
                        Context context2 = (Context) ((kt1) ib3Var.b).b.a;
                        c8o.l(context2);
                        return context2;
                    case 3:
                        return new hxo(this, (byte) 0);
                    case 4:
                        jt1 jt1Var2 = (jt1) ib3Var.a;
                        r2r r2rVar = (r2r) ((kt1) ib3Var.b).I.get();
                        c8o.l(r2rVar);
                        j3r j3rVar = rzq.y;
                        rzq rzqVarF = l2p1.f(r2rVar.a("android-add-to-playlist-fragment", ywq.O0));
                        ((zf30) jt1Var2).s1.a(new lt1(rzqVarF, (byte) 0));
                        return rzqVarF;
                    case 5:
                        return new yms((fwo) ib3Var.g);
                    case 6:
                        kt1 kt1Var = (kt1) ib3Var.b;
                        kt1 kt1Var2 = (kt1) ib3Var.b;
                        bl3 bl3VarA = kt1Var.a();
                        c8o.l(bl3VarA);
                        z0t z0tVar = (z0t) kt1Var2.q.get();
                        c8o.l(z0tVar);
                        q8n q8nVar = (q8n) kt1Var2.g.get();
                        c8o.l(q8nVar);
                        zwm1 zwm1Var = (zwm1) kt1Var2.p.get();
                        c8o.l(zwm1Var);
                        agc0 agc0VarC = kt1Var2.c();
                        c8o.l(agc0VarC);
                        r2r r2rVar2 = (r2r) kt1Var2.I.get();
                        c8o.l(r2rVar2);
                        ansVar = new ans(bl3VarA, z0tVar, q8nVar, zwm1Var, agc0VarC, r2rVar2);
                        break;
                    case 7:
                        return new yx1();
                    case 8:
                        return new ixo(this, (byte) 0);
                    case 9:
                        kt1 kt1Var3 = (kt1) ib3Var.b;
                        kt1 kt1Var4 = (kt1) ib3Var.b;
                        q8n q8nVar2 = (q8n) kt1Var3.g.get();
                        c8o.l(q8nVar2);
                        ylk0 ylk0Var = (ylk0) kt1Var4.C.get();
                        c8o.l(ylk0Var);
                        agc0 agc0VarC2 = kt1Var4.c();
                        c8o.l(agc0VarC2);
                        return new cqa1(q8nVar2, ylk0Var, agc0VarC2);
                    case 10:
                        ib3Var.getClass();
                        kt1 kt1Var5 = (kt1) ib3Var.b;
                        Context context3 = (Context) ((fwo) ib3Var.d).get();
                        ut71 ut71Var = (ut71) kt1Var5.M.get();
                        c8o.l(ut71Var);
                        ria1 ria1Var = new ria1(context3, ut71Var);
                        dxz0 dxz0Var = (dxz0) kt1Var5.n.get();
                        c8o.l(dxz0Var);
                        av1 av1VarC = ib3Var.c();
                        kkg1 kkg1Var = (kkg1) kt1Var5.B.get();
                        c8o.l(kkg1Var);
                        uu00 uu00Var = (uu00) kt1Var5.G.get();
                        c8o.l(uu00Var);
                        wml wmlVar = new wml(kkg1Var, uu00Var);
                        yjq yjqVarG = ib3Var.g();
                        hy1 hy1Var = new hy1(ib3Var.c(), new ugb((fwo) ib3Var.t));
                        av1 av1VarC2 = ib3Var.c();
                        fwo fwoVar3 = (fwo) ib3Var.v;
                        fwo fwoVar4 = (fwo) ib3Var.w;
                        gy1 gy1Var = av1VarC2.i;
                        qt1 qt1Var = (u890.j(gy1Var, ay1.a) || (gy1Var instanceof ey1)) ? (qt1) fwoVar3.get() : (qt1) fwoVar4.get();
                        jxo jxoVar = (jxo) ((jly0) ib3Var.x).get();
                        d0r d0rVar = (d0r) ((jly0) ib3Var.f).get();
                        vlo vloVarB = kt1Var5.b();
                        c8o.l(vloVarB);
                        asn asnVar = new asn(d0rVar, vloVarB);
                        q8n q8nVar3 = (q8n) kt1Var5.g.get();
                        c8o.l(q8nVar3);
                        cig1 cig1Var = (cig1) kt1Var5.E.get();
                        c8o.l(cig1Var);
                        qmr qmrVar = new qmr(cig1Var, (byte) 13);
                        bl3 bl3VarA2 = kt1Var5.a();
                        c8o.l(bl3VarA2);
                        return new so1(ria1Var, dxz0Var, av1VarC, wmlVar, yjqVarG, hy1Var, qt1Var, jxoVar, asnVar, q8nVar3, qmrVar, bl3VarA2, (ho1) ((jly0) ib3Var.u).get(), (ums) ((jly0) ib3Var.y).get(), (yka1) ((jly0) ib3Var.z).get(), ib3Var.d().e());
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        return new glc0((fwo) ib3Var.l, (fwo) ib3Var.m, (fwo) ib3Var.n, (fwo) ib3Var.o, (fwo) ib3Var.f12p, (fwo) ib3Var.q, (fwo) ib3Var.r, (fwo) ib3Var.s);
                    case grn1.d /* 12 */:
                        vlo vloVarB2 = ((kt1) ib3Var.b).b();
                        c8o.l(vloVarB2);
                        return new x6x(vloVarB2, b5);
                    case 13:
                        vlo vloVarB3 = ((kt1) ib3Var.b).b();
                        c8o.l(vloVarB3);
                        return new x6x(vloVarB3, b6);
                    case 14:
                        return new lkg1(b6);
                    case 15:
                        return new lkg1(b5);
                    case 16:
                        return new lkg1(b2);
                    case 17:
                        return new lkg1(b3);
                    case 18:
                        vlo vloVarB4 = ((kt1) ib3Var.b).b();
                        c8o.l(vloVarB4);
                        return new x6x(vloVarB4, b8);
                    case 19:
                        return new lkg1(b4);
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        vwm1 vwm1Var = (vwm1) ((kt1) ib3Var.b).P.get();
                        c8o.l(vwm1Var);
                        return new xkr0(vwm1Var, (ho1) ((jly0) ib3Var.u).get(), wg0.s());
                    case 21:
                        av1 av1VarC3 = ib3Var.c();
                        kt1 kt1Var6 = (kt1) ib3Var.b;
                        svh0 svh0Var = new svh0(av1VarC3, ib3Var.d().a(), (byte) 24);
                        zwm1 zwm1Var2 = (zwm1) kt1Var6.p.get();
                        c8o.l(zwm1Var2);
                        agc0 agc0VarC3 = kt1Var6.c();
                        c8o.l(agc0VarC3);
                        vlo vloVarB5 = kt1Var6.b();
                        c8o.l(vloVarB5);
                        return new ho1(svh0Var, zwm1Var2, agc0VarC3, vloVarB5);
                    case 22:
                        vwm1 vwm1Var2 = (vwm1) ((kt1) ib3Var.b).P.get();
                        c8o.l(vwm1Var2);
                        return new z180(vwm1Var2, (ho1) ((jly0) ib3Var.u).get(), ib3Var.c());
                    case 23:
                        return new jxo(this, (byte) 0);
                    case 24:
                        bl3 bl3VarA3 = ((kt1) ib3Var.b).a();
                        c8o.l(bl3VarA3);
                        j6g1 j6g1Var = (j6g1) ((kt1) ib3Var.b).u.get();
                        c8o.l(j6g1Var);
                        return new ums(bl3VarA3, j6g1Var);
                    case 25:
                        kxc0 kxc0Var = (kxc0) ((kt1) ib3Var.b).m.get();
                        c8o.l(kxc0Var);
                        av1 av1VarC4 = ib3Var.c();
                        ib3Var.d().g();
                        v9c v9cVar = new v9c(kxc0Var, av1VarC4);
                        q8n q8nVar4 = (q8n) ((kt1) ib3Var.b).g.get();
                        c8o.l(q8nVar4);
                        return new yka1(v9cVar, q8nVar4);
                    case 26:
                        return wg0.h((fwo) ib3Var.d, (fwo) ib3Var.B);
                    case 27:
                        xfx xfxVar = (xfx) ((kt1) ib3Var.b).Q.get();
                        c8o.l(xfxVar);
                        return xfxVar;
                    case 28:
                        cig1 cig1Var2 = (cig1) ((kt1) ib3Var.b).E.get();
                        c8o.l(cig1Var2);
                        so1 so1Var = (so1) ((jly0) ib3Var.A).get();
                        wt1 wt1VarB = ib3Var.b();
                        av1 av1VarC5 = ib3Var.c();
                        cfr cfrVar = (cfr) ((kt1) ib3Var.b).s.get();
                        c8o.l(cfrVar);
                        return new kjg1(cig1Var2, so1Var, wt1VarB, av1VarC5, cfrVar, ib3Var.a());
                    case 29:
                        iyc0 iyc0Var = (iyc0) ((kt1) ib3Var.b).l.get();
                        c8o.l(iyc0Var);
                        return new s4g0(iyc0Var, ib3Var.a());
                    case 30:
                        xrc0 xrc0Var = (xrc0) ((kt1) ib3Var.b).k.get();
                        c8o.l(xrc0Var);
                        iyc0 iyc0Var2 = (iyc0) ((kt1) ib3Var.b).l.get();
                        c8o.l(iyc0Var2);
                        return new in71(xrc0Var, iyc0Var2, ib3Var.a(), ib3Var.c());
                    case 31:
                        so1 so1Var2 = (so1) ((jly0) ib3Var.A).get();
                        xrc0 xrc0Var2 = (xrc0) ((kt1) ib3Var.b).k.get();
                        c8o.l(xrc0Var2);
                        yka1 yka1Var = (yka1) ((jly0) ib3Var.z).get();
                        ib3Var.d().g();
                        return new okt(so1Var2, xrc0Var2, yka1Var);
                    case 32:
                        vkg vkgVar = (Activity) ((kt1) ib3Var.b).a.a;
                        c8o.l(vkgVar);
                        cls2 = vkgVar instanceof vkg ? vkgVar : null;
                        if (cls2 == null) {
                            cls2 = new tkg();
                        }
                        ansVar = new w1r0(cls2);
                        break;
                    default:
                        jah.e(b7);
                        return null;
                }
                return ansVar;
            case 6:
                return a();
            case 7:
                qxo qxoVar = (qxo) obj;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        RetrofitMaker retrofitMaker2 = (RetrofitMaker) ((kly0) qxoVar.a.d).get();
                        k370 k370Var = new k370();
                        k370Var.f((l370) null, "https://ads-privacy-center.spotify.com/");
                        return new il0((j72) retrofitMaker2.createCustomHostService(j72.class, k370Var.b()));
                    case 1:
                        return new bq0();
                    case 2:
                        return qxoVar.a.c().a(jx0.o);
                    case 3:
                        return qxoVar.a.c().a(jx0.p);
                    case 4:
                        return qxoVar.a.c().a(jx0.k);
                    case 5:
                        return qxoVar.a.c().a(jx0.q);
                    case 6:
                        return qxoVar.a.c().a(jx0.n);
                    case 7:
                        return qxoVar.a.c().a(jx0.m);
                    case 8:
                        return new de31(false, (luk) ((kly0) qxoVar.a.s).get());
                    case 9:
                        return qxoVar.a.c().a(jx0.j);
                    case 10:
                        er0 er0VarC = qxoVar.a.c();
                        jx0 jx0Var = jx0.c;
                        oxo oxoVar = (oxo) er0VarC.a.a.c;
                        be91 be91VarB = oxoVar.b();
                        c42 c42Var = oxoVar.a;
                        return new ay0(jx0Var, uhv0.a, be91VarB, new qr20((ov20) c42Var.o.get()), c42Var.b());
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        return new o44(false, false, (luk) ((kly0) qxoVar.a.s).get());
                    case grn1.d /* 12 */:
                        return qxoVar.a.c().a(jx0.i);
                    case 13:
                        k42 k42Var = qxoVar.a;
                        k42 k42Var2 = qxoVar.a;
                        return new d1x((t2j0) ((kly0) k42Var2.l).get(), (mr20) ((kly0) k42Var2.m).get(), (yqg) ((kly0) k42Var2.o).get(), (q8n) ((kly0) k42Var2.b).get());
                    case 14:
                        jly0 jly0Var = qxoVar.p;
                        k42 k42Var3 = qxoVar.a;
                        return new fza1((v1b1) jly0Var.get(), (e1b1) qxoVar.q.get(), (yqg) ((kly0) k42Var3.o).get(), (q8n) ((kly0) k42Var3.c).get());
                    case 15:
                        k42 k42Var4 = qxoVar.a;
                        k42 k42Var5 = qxoVar.a;
                        return new v1b1((Observable) ((kly0) k42Var4.p).get(), (yqg) ((kly0) k42Var5.o).get(), (q8n) ((kly0) k42Var5.b).get());
                    case 16:
                        return (e1b1) ((RetrofitMaker) ((kly0) qxoVar.a.d).get()).createWebgateService(e1b1.class, "android-adsdisplay-sponsorshipimpl");
                    case 17:
                        k42 k42Var6 = qxoVar.a;
                        k42 k42Var7 = qxoVar.a;
                        return new q62((be91) ((kly0) k42Var6.f).get(), (liv0) ((kly0) k42Var7.g).get(), (fza1) qxoVar.r.get(), new ge4((luk) ((kly0) k42Var7.s).get()));
                    case 18:
                        return new pxo();
                    case 19:
                        return new k44(false, (luk) ((kly0) qxoVar.a.s).get());
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        return new ce31((t2j0) ((kly0) qxoVar.a.l).get());
                    default:
                        jah.e(b7);
                        return null;
                }
            case 8:
                return b();
            case 9:
                yxo yxoVar = (yxo) obj;
                byte b9 = 9;
                switch (b7) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        qyj qyjVar = (qyj) ((oa2) yxoVar.c).a.get();
                        c8o.l(qyjVar);
                        return qyjVar;
                    case 1:
                        ynb0 ynb0VarA = xqu.a((fwo) yxoVar.O0);
                        pt0 pt0Var = new pt0(b9);
                        pt0Var.b = ynb0VarA;
                        return pt0Var;
                    case 2:
                        Object obj2 = yxoVar.e;
                        fwo fwoVar5 = (fwo) yxoVar.f;
                        fwo fwoVar6 = (fwo) yxoVar.g;
                        fwo fwoVar7 = (fwo) yxoVar.h;
                        fwo fwoVar8 = (fwo) yxoVar.i;
                        fwo fwoVar9 = (fwo) yxoVar.t;
                        fwo fwoVar10 = (fwo) yxoVar.X;
                        fwo fwoVar11 = (fwo) yxoVar.Y;
                        fwo fwoVar12 = (fwo) yxoVar.Z;
                        fwo fwoVar13 = (fwo) yxoVar.N0;
                        bf2 bf2Var = new bf2();
                        bf2Var.a = fwoVar5;
                        bf2Var.b = fwoVar6;
                        bf2Var.c = fwoVar7;
                        bf2Var.d = fwoVar8;
                        bf2Var.e = fwoVar9;
                        bf2Var.f = fwoVar10;
                        bf2Var.g = fwoVar11;
                        bf2Var.h = fwoVar12;
                        bf2Var.i = fwoVar13;
                        return bf2Var;
                    case 3:
                        t3f0 t3f0Var = (t3f0) ((oa2) yxoVar.c).i.get();
                        c8o.l(t3f0Var);
                        return t3f0Var;
                    case 4:
                        f1n0 f1n0Var = (f1n0) ((oa2) yxoVar.c).h.get();
                        c8o.l(f1n0Var);
                        return f1n0Var;
                    case 5:
                        f4f0 f4f0Var = (f4f0) ((oa2) yxoVar.c).j.get();
                        c8o.l(f4f0Var);
                        return f4f0Var;
                    case 6:
                        ov20 ov20Var = (ov20) ((oa2) yxoVar.c).g.get();
                        c8o.l(ov20Var);
                        return ov20Var;
                    case 7:
                        vb2 vb2Var = (vb2) ((oa2) yxoVar.c).k.get();
                        c8o.l(vb2Var);
                        return vb2Var;
                    case 8:
                        Boolean bool = (Boolean) ((oa2) yxoVar.c).u.get();
                        bool.getClass();
                        return bool;
                    case 9:
                        pe peVar = (pe) ((oa2) yxoVar.c).l.get();
                        c8o.l(peVar);
                        return peVar;
                    case 10:
                        gw70 gw70Var = (gw70) ((oa2) yxoVar.c).m.get();
                        c8o.l(gw70Var);
                        return gw70Var;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        ix81 ix81Var = (ix81) ((oa2) yxoVar.c).s.get();
                        c8o.l(ix81Var);
                        return ix81Var;
                    case grn1.d /* 12 */:
                        jtl1 jtl1Var = (jtl1) ((oa2) yxoVar.c).t.get();
                        c8o.l(jtl1Var);
                        return jtl1Var;
                    case 13:
                        ynb0 ynb0VarA2 = xqu.a((fwo) yxoVar.V0);
                        pt0 pt0Var2 = new pt0((byte) 8);
                        pt0Var2.b = ynb0VarA2;
                        return pt0Var2;
                    case 14:
                        fwo fwoVar14 = (fwo) yxoVar.R0;
                        fwo fwoVar15 = (fwo) yxoVar.S0;
                        fwo fwoVar16 = (fwo) yxoVar.T0;
                        fwo fwoVar17 = (fwo) yxoVar.h;
                        fwo fwoVar18 = (fwo) yxoVar.U0;
                        fwo fwoVar19 = (fwo) yxoVar.X;
                        fwo fwoVar20 = (fwo) yxoVar.Y;
                        fwo fwoVar21 = (fwo) yxoVar.Q0;
                        fwo fwoVar22 = (fwo) yxoVar.N0;
                        pc2 pc2Var = new pc2();
                        pc2Var.a = fwoVar14;
                        pc2Var.b = fwoVar15;
                        pc2Var.c = fwoVar16;
                        pc2Var.d = fwoVar17;
                        pc2Var.e = fwoVar18;
                        pc2Var.f = fwoVar19;
                        pc2Var.g = fwoVar20;
                        pc2Var.h = fwoVar21;
                        pc2Var.i = fwoVar22;
                        return pc2Var;
                    case 15:
                        q7e0 q7e0Var = (q7e0) ((fwo) yxoVar.Q0).get();
                        gw70 gw70Var2 = (gw70) ((fwo) yxoVar.Y).get();
                        pe peVar2 = (pe) ((fwo) yxoVar.X).get();
                        return new yuj(q7e0Var, new q3b1(gw70Var2, peVar2));
                    case 16:
                        q7e0 q7e0Var2 = (q7e0) ((oa2) yxoVar.c).n.get();
                        c8o.l(q7e0Var2);
                        return q7e0Var2;
                    case 17:
                        w0g w0gVar = (w0g) ((oa2) yxoVar.c).o.get();
                        c8o.l(w0gVar);
                        return w0gVar;
                    case 18:
                        a1g a1gVar = (a1g) ((oa2) yxoVar.c).f27p.get();
                        c8o.l(a1gVar);
                        return a1gVar;
                    case 19:
                        q8n q8nVar5 = (q8n) ((oa2) yxoVar.c).r.get();
                        c8o.l(q8nVar5);
                        return q8nVar5;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        ynb0 ynb0VarA3 = xqu.a((fwo) yxoVar.a1);
                        ynb0 ynb0VarA4 = xqu.a((fwo) yxoVar.b1);
                        v2 v2Var = new v2(b9);
                        v2Var.b = ynb0VarA3;
                        v2Var.c = ynb0VarA4;
                        return v2Var;
                    case 21:
                        fwo fwoVar23 = (fwo) yxoVar.d;
                        fwo fwoVar24 = (fwo) yxoVar.T0;
                        fwo fwoVar25 = (fwo) yxoVar.X0;
                        fwo fwoVar26 = (fwo) yxoVar.Y0;
                        fwo fwoVar27 = (fwo) yxoVar.Z0;
                        ae2 ae2Var = new ae2();
                        ae2Var.a = fwoVar23;
                        ae2Var.b = fwoVar24;
                        ae2Var.c = fwoVar25;
                        ae2Var.d = fwoVar26;
                        ae2Var.e = fwoVar27;
                        return ae2Var;
                    case 22:
                        pd2 pd2Var = (pd2) ((oa2) yxoVar.c).q.get();
                        c8o.l(pd2Var);
                        return pd2Var;
                    case 23:
                        dwr0 dwr0Var = (dwr0) ((oa2) yxoVar.c).v.get();
                        c8o.l(dwr0Var);
                        return dwr0Var;
                    case 24:
                        z710 z710Var = (z710) ((oa2) yxoVar.c).w.get();
                        c8o.l(z710Var);
                        return z710Var;
                    case 25:
                        fwo fwoVar28 = (fwo) yxoVar.X;
                        fwo fwoVar29 = (fwo) yxoVar.Y;
                        fwo fwoVar30 = (fwo) yxoVar.Z;
                        fwo fwoVar31 = (fwo) yxoVar.N0;
                        syj syjVar = new syj((byte) 13);
                        syjVar.b = fwoVar28;
                        syjVar.c = fwoVar29;
                        syjVar.d = fwoVar30;
                        syjVar.e = fwoVar31;
                        return syjVar;
                    case 26:
                        return new xxo(this);
                    case 27:
                        r2r r2rVar3 = (r2r) ((oa2) yxoVar.c).c.get();
                        c8o.l(r2rVar3);
                        return new n1n0(r2rVar3);
                    default:
                        jah.e(b7);
                        return null;
                }
            case 10:
                kp5 kp5Var = (kp5) obj;
                ohv0 ohv0Var = (ohv0) kp5Var.b;
                Context context4 = (Context) kp5Var.a;
                if (b7 == 0) {
                    return new b450(new ezb1(new mbo1(context4.getApplicationContext()), (byte) 26), new ihv0(ohv0Var));
                }
                if (b7 == 1) {
                    ContentResolver contentResolver = context4.getContentResolver();
                    Uri uri = hz3.e;
                    c8o.m(uri);
                    ihv0 ihv0Var = new ihv0(ohv0Var);
                    fns fnsVar = igu.a;
                    return new hz3(contentResolver, uri, ihv0Var, b3s.c);
                }
                if (b7 != 2) {
                    if (b7 == 3) {
                        return new xwq0((mbo0) kp5Var.c);
                    }
                    jah.e(b7);
                    return null;
                }
                ContentResolver contentResolver2 = context4.getContentResolver();
                Uri uri2 = h741.e;
                c8o.m(uri2);
                ihv0 ihv0Var2 = new ihv0(ohv0Var);
                fns fnsVar2 = igu.a;
                return new h741(contentResolver2, uri2, ihv0Var2, b3s.c);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return c();
            case grn1.d /* 12 */:
                return d();
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return l();
            case 21:
                if (b7 == 0) {
                    return new vzo(this);
                }
                if (b7 == 1) {
                    return new wzo(this);
                }
                if (b7 == 2) {
                    return new xzo(this);
                }
                jah.e(b7);
                return null;
            case 22:
                return m();
            case 23:
                return n();
            case 24:
                return o();
            case 25:
                return p();
            case 26:
                return q();
            case 27:
                return r();
            case 28:
                return s();
            default:
                ozp ozpVar = (ozp) ((a680) obj).a;
                if (b7 == 0) {
                    return new s1p(this, (byte) 0);
                }
                if (b7 == 1) {
                    return new t1p(this, (byte) 0);
                }
                if (b7 == 2) {
                    return new u1p(this, (byte) 0);
                }
                if (b7 == 3) {
                    return new v1p(this, (byte) 0);
                }
                if (b7 != 4) {
                    jah.e(b7);
                    return null;
                }
                lzn0 lzn0Var = (lzn0) ozpVar.b.i.get();
                c8o.l(lzn0Var);
                a1r0 a1r0Var = (a1r0) ozpVar.b.V0.get();
                c8o.l(a1r0Var);
                Activity activityA = ozpVar.a();
                c8o.l(activityA);
                return new et90(activityA, lzn0Var, a1r0Var);
        }
    }
}
