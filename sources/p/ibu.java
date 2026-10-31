package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ibu implements l4h1 {
    public final nau a;
    public final v7m0 b;
    public final n6s c;
    public final cbp d;
    public final kly0 e;
    public final fal1 f;
    public final xjl g;
    public final cbu h;
    public final iac0 i;
    public final o5s j;
    public final gg11 k;
    public final efr l;
    public final cir0 m;
    public final abu n;

    public ibu(nau nauVar, v7m0 v7m0Var, n6s n6sVar, cbp cbpVar, jly0 jly0Var, fal1 fal1Var, xjl xjlVar, cbu cbuVar, iac0 iac0Var, o5s o5sVar, gg11 gg11Var, efr efrVar, cir0 cir0Var, abu abuVar) {
        this.a = nauVar;
        this.b = v7m0Var;
        this.c = n6sVar;
        this.d = cbpVar;
        this.e = jly0Var;
        this.f = fal1Var;
        this.g = xjlVar;
        this.h = cbuVar;
        this.i = iac0Var;
        this.j = o5sVar;
        this.k = gg11Var;
        this.l = efrVar;
        this.m = cir0Var;
        this.n = abuVar;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        k42 k42Var;
        qau qauVarB;
        Observable observableC;
        s9l1 s9l1Var = (s9l1) obj;
        n8l1 n8l1Var = (n8l1) this.e.get();
        n8l1Var.getClass();
        cbp cbpVar = this.d;
        switch (cbpVar.a) {
            case 0:
                hbp hbpVar = (hbp) cbpVar.b.c;
                cce cceVarD = hbpVar.d();
                dbp dbpVar = (dbp) hbpVar.f2.get();
                q9l1 q9l1Var = (q9l1) hbpVar.g.get();
                q9l1 q9l1Var2 = (q9l1) hbpVar.g.get();
                fbp fbpVar = (fbp) hbpVar.h2.get();
                abu abuVar = hbpVar.c;
                pe peVarA = hbpVar.a.a();
                c8o.l(peVarA);
                gw70 gw70VarB = hbpVar.a.B();
                c8o.l(gw70VarB);
                bcl1 bcl1Var = (bcl1) hbpVar.h.get();
                hcl1 hcl1Var = (hcl1) hbpVar.i.get();
                hcl1 hcl1Var2 = (hcl1) hbpVar.i.get();
                m0t m0tVar = (m0t) hbpVar.u.get();
                fq10 fq10Var = (fq10) hbpVar.i2.get();
                q8n q8nVarO = hbpVar.a.O();
                c8o.l(q8nVarO);
                k42Var = new k42(cceVarD, dbpVar, q9l1Var, q9l1Var2, fbpVar, abuVar, peVarA, gw70VarB, bcl1Var, hcl1Var, hcl1Var2, m0tVar, fq10Var, q8nVarO, viewGroup, n8l1Var);
                break;
            default:
                mxp mxpVar = (mxp) cbpVar.b.c;
                cce cceVarD2 = mxpVar.d();
                dbp dbpVar2 = (dbp) mxpVar.f2.get();
                q9l1 q9l1Var3 = (q9l1) mxpVar.g.get();
                q9l1 q9l1Var4 = (q9l1) mxpVar.g.get();
                fbp fbpVar2 = (fbp) mxpVar.h2.get();
                abu abuVar2 = mxpVar.c;
                pe peVarA2 = mxpVar.a.a();
                c8o.l(peVarA2);
                gw70 gw70VarB2 = mxpVar.a.B();
                c8o.l(gw70VarB2);
                bcl1 bcl1Var2 = (bcl1) mxpVar.h.get();
                hcl1 hcl1Var3 = (hcl1) mxpVar.i.get();
                hcl1 hcl1Var4 = (hcl1) mxpVar.i.get();
                m0t m0tVar2 = (m0t) mxpVar.u.get();
                fq10 fq10Var2 = (fq10) mxpVar.i2.get();
                q8n q8nVarO2 = mxpVar.a.O();
                c8o.l(q8nVarO2);
                k42Var = new k42(cceVarD2, dbpVar2, q9l1Var3, q9l1Var4, fbpVar2, abuVar2, peVarA2, gw70VarB2, bcl1Var2, hcl1Var3, hcl1Var4, m0tVar2, fq10Var2, q8nVarO2, viewGroup, n8l1Var);
                break;
        }
        ComposeView composeView = (ComposeView) k42Var.t;
        ku1 ku1Var = new ku1(k42Var, (byte) 11);
        efr efrVar = this.l;
        u680 u680Var = (u680) efrVar.b;
        abu abuVar3 = this.n;
        if (!u680Var.a.containsKey(abuVar3.a()) || bundle == null || (qauVarB = (qau) bundle.getParcelable("discoveryFeedModel")) == null) {
            qauVarB = efr.b(abuVar3);
        }
        qau qauVarA = qau.a(qauVarB, null, null, null, false, false, null, s9l1Var, null, false, ((Boolean) this.f.d.getValue()).booleanValue(), false, false, null, false, false, null, null, false, 1047999);
        nau nauVar = this.a;
        h9u h9uVar = nauVar.b;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(j8u.class, h9uVar.a);
        subtypeEffectHandlerBuilderC.g(k8u.class, h9uVar.b);
        subtypeEffectHandlerBuilderC.g(y8u.class, h9uVar.c);
        g9u g9uVar = new g9u(n8l1Var, (byte) 5);
        Scheduler scheduler = h9uVar.e;
        subtypeEffectHandlerBuilderC.d(h8u.class, g9uVar, scheduler);
        subtypeEffectHandlerBuilderC.d(i8u.class, new g9u(n8l1Var, (byte) 6), scheduler);
        subtypeEffectHandlerBuilderC.g(g8u.class, h9uVar.h);
        subtypeEffectHandlerBuilderC.c(l8u.class, new vrk1((byte) 16));
        subtypeEffectHandlerBuilderC.c(b9u.class, new f9u(h9uVar, (byte) 2));
        subtypeEffectHandlerBuilderC.c(x8u.class, h9uVar.d);
        subtypeEffectHandlerBuilderC.c(q8u.class, new f9u(h9uVar, (byte) 3));
        subtypeEffectHandlerBuilderC.c(a9u.class, new f9u(h9uVar, (byte) 4));
        subtypeEffectHandlerBuilderC.d(c9u.class, new f9u(h9uVar, (byte) 5), scheduler);
        subtypeEffectHandlerBuilderC.d(f8u.class, h9uVar.j, scheduler);
        subtypeEffectHandlerBuilderC.c(v8u.class, new f9u(h9uVar, (byte) 6));
        subtypeEffectHandlerBuilderC.d(w8u.class, new g9u(n8l1Var, (byte) 7), scheduler);
        subtypeEffectHandlerBuilderC.c(e8u.class, new f9u(h9uVar, (byte) 0));
        subtypeEffectHandlerBuilderC.d(u8u.class, new g9u(n8l1Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(p8u.class, new g9u(n8l1Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(n8u.class, new g9u(n8l1Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(m8u.class, new g9u(n8l1Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(s8u.class, new g9u(n8l1Var, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.c(r8u.class, new f9u(h9uVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(o8u.class, h9uVar.n);
        subtypeEffectHandlerBuilderC.d(t8u.class, h9uVar.o, scheduler);
        subtypeEffectHandlerBuilderC.d(z8u.class, h9uVar.f20p, scheduler);
        MobiusLoop.Builder builderD = Mobius.d(new kau(), RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        s24 s24Var = nauVar.a;
        ObservableSource map = Observable.create(new jut(s24Var, (iac0) s24Var.h, (byte) 3)).map(new qmr(s24Var, (byte) 17));
        ObservableSource observableSourceDistinctUntilChanged = new ObservableFromPublisher((Flowable) s24Var.c).map(new rmr(s24Var, (byte) 16)).distinctUntilChanged();
        ObservableSource map2 = ((dxz0) s24Var.b).e().map(qbo1.W0);
        ObservableSource observableSource = ((v7m0) s24Var.d).a;
        kji1 kji1Var = (kji1) s24Var.N0;
        String strA = bbu.a((abu) s24Var.g);
        if (strA == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        vi11 vi11Var = kji1Var.a;
        int iOrdinal = kji1Var.b.e().ordinal();
        if (iOrdinal == 0) {
            observableC = vi11Var.C(strA);
        } else if (iOrdinal == 1) {
            observableC = Observable.combineLatest(vi11Var.C(strA), kji1Var.a(), w1x0.a1);
            observableC.getClass();
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            observableC = Observable.combineLatest(yoi1.i(((dma1) vi11Var.b).q((bma1) vi11Var.e), o6x.a).filter(a2x0.Y).map(e2x0.Y).startWith(Observable.fromCallable(new st71(vi11Var, (byte) 1))).distinctUntilChanged(), kji1Var.a(), njx0.V0);
            observableC.getClass();
        }
        return new hbu(this.m, Mobius.b(gvg.d("Discovery feed feature", builderD.h(RxEventSources.a(new ObservableSource[]{map, observableSourceDistinctUntilChanged, map2, observableSource, observableC.map(cxo1.Y0), ((euw0) s24Var.f).a.map(o9p1.Z0), ((m0t) s24Var.i).d.map(vap1.X0), ((fal1) s24Var.Y).c.map(xbp1.Y0), ((hcl1) s24Var.Z).i.filter(wcp1.X0).map(vgp1.Y0)})).b(new lau(nauVar)).d(new mau(nauVar))), qauVarA, new jau(), MainThreadWorkRunner.a()), this.b, ku1Var, this.c, this.g, this.h, abuVar3, this.k, efrVar, this.i, this.j, composeView);
    }
}
