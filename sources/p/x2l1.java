package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x2l1 implements l4h1 {
    public final cir0 a;
    public final cbr0 b;
    public final q7m0 c;
    public final m4l1 d;
    public final zuq e;
    public final u2l1 f;
    public final iu30 g;
    public final g0l1 h;
    public final q2l1 i;
    public final avq j;
    public final ArrayList k;
    public final j810 l;

    public x2l1(cir0 cir0Var, cbr0 cbr0Var, q7m0 q7m0Var, m4l1 m4l1Var, zuq zuqVar, u2l1 u2l1Var, iu30 iu30Var, g0l1 g0l1Var, q2l1 q2l1Var, avq avqVar, ArrayList arrayList, j810 j810Var) {
        this.a = cir0Var;
        this.b = cbr0Var;
        this.c = q7m0Var;
        this.d = m4l1Var;
        this.e = zuqVar;
        this.f = u2l1Var;
        this.g = iu30Var;
        this.h = g0l1Var;
        this.i = q2l1Var;
        this.j = avqVar;
        this.k = arrayList;
        this.l = j810Var;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        flb1 flb1Var = (flb1) obj;
        dlb1 dlb1Var = (dlb1) flb1Var;
        f291 f291Var = dlb1Var.a;
        if (f291Var.g) {
            this.b.a(new hgr0(egr0.a, 0, 2));
        }
        boolean z = f291Var.i;
        cir0 cir0Var = this.a;
        if (z && f291Var.c == ci8.c) {
            g0l1 g0l1Var = this.h;
            g0l1Var.c = context;
            g0l1Var.d = cir0Var;
        }
        View viewInflate = layoutInflater.inflate(2131626334, viewGroup, false);
        View viewN = b8k1.n(viewInflate, 2131431397);
        WebView webView = (WebView) b8k1.n(viewInflate, 2131431678);
        View viewN2 = b8k1.n(viewInflate, 2131428102);
        View viewN3 = b8k1.n(viewInflate, 2131431654);
        xy2 xy2Var = new xy2(viewN, (byte) 13);
        gp71 gp71Var = gp71.z;
        q7m0 q7m0Var = this.c;
        final j1l1 j1l1Var = q7m0Var.b;
        m7m0 m7m0Var = new m7m0(1, webView, WebView.class, "loadUrl", "loadUrl(Ljava/lang/String;)V", 0);
        n7m0 n7m0Var = new n7m0(2, webView, WebView.class, "evaluateJavascript", "evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V", 0);
        o7m0 o7m0Var = new o7m0(q7m0Var, viewN3, webView);
        p7m0 p7m0Var = new p7m0(q7m0Var, viewN3, webView);
        Scheduler scheduler = j1l1Var.a;
        ilh1 ilh1Var = new ilh1(j1l1Var, n7m0Var, (byte) 19);
        z6x z6xVar = (List) j1l1Var.v.a.a.get(j1l1Var.l);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        List list = (Iterable) z6xVar;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            scm1 scm1Var = (scm1) it.next();
            arrayList.add(new rcm1(scm1Var.a, scm1Var.b, ilh1Var));
        }
        j1l1Var.w = arrayList;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        final byte b = 5;
        subtypeEffectHandlerBuilderC.c(l0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        });
        subtypeEffectHandlerBuilderC.d(p0l1.class, new rdj1(m7m0Var, (byte) 10), scheduler);
        final byte b2 = 6;
        subtypeEffectHandlerBuilderC.d(q0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        }, scheduler);
        final byte b3 = 4;
        subtypeEffectHandlerBuilderC.b(b1l1.class, new kur(o7m0Var, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.b(n0l1.class, new kur(p7m0Var, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.g(o0l1.class, new zd1(j1l1Var, scheduler, n7m0Var, (byte) 21));
        subtypeEffectHandlerBuilderC.d(y0l1.class, new qdj1(j1l1Var, n7m0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.g(w0l1.class, new h1l1(j1l1Var, (byte) 2));
        final byte b4 = 7;
        subtypeEffectHandlerBuilderC.d(a1l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        }, scheduler);
        subtypeEffectHandlerBuilderC.g(v0l1.class, new h1l1(j1l1Var, (byte) 0));
        byte b5 = 15;
        subtypeEffectHandlerBuilderC.g(s0l1.class, new g2x0(j1l1Var, new lda1(2, j1l1Var, j1l1.class, "handlePause", "handlePause(Lcom/spotify/player/model/PlayerState;Lcom/spotify/thestage/vtec/logic/VtecEffect$PausePlayback;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 14), b5));
        subtypeEffectHandlerBuilderC.g(x0l1.class, new g2x0(j1l1Var, new lda1(2, j1l1Var, j1l1.class, "handleResume", "handleResume(Lcom/spotify/player/model/PlayerState;Lcom/spotify/thestage/vtec/logic/VtecEffect$ResumePlayback;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 15), b5));
        subtypeEffectHandlerBuilderC.g(d1l1.class, new g2x0(j1l1Var, new lda1(2, j1l1Var, j1l1.class, "handleSkipToPrevious", "handleSkipToPrevious(Lcom/spotify/player/model/PlayerState;Lcom/spotify/thestage/vtec/logic/VtecEffect$SkipToPrevious;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 16), b5));
        subtypeEffectHandlerBuilderC.g(c1l1.class, new g2x0(j1l1Var, new lda1(2, j1l1Var, j1l1.class, "handleSkipToNext", "handleSkipToNext(Lcom/spotify/player/model/PlayerState;Lcom/spotify/thestage/vtec/logic/VtecEffect$SkipToNext;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 17), b5));
        subtypeEffectHandlerBuilderC.g(t0l1.class, new g2x0(j1l1Var, new lda1(2, j1l1Var, j1l1.class, "handlePlayTrack", "handlePlayTrack(Lcom/spotify/player/model/PlayerState;Lcom/spotify/thestage/vtec/logic/VtecEffect$PlayTrack;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 13), b5));
        subtypeEffectHandlerBuilderC.g(h0l1.class, new g2x0((Object) j1l1Var, (Object) scheduler, (byte) 14));
        final byte b6 = 0;
        subtypeEffectHandlerBuilderC.c(e1l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        });
        final byte b7 = 1;
        subtypeEffectHandlerBuilderC.d(i0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        }, scheduler);
        final byte b8 = 3;
        subtypeEffectHandlerBuilderC.g(j0l1.class, new h1l1(j1l1Var, b8));
        final byte b9 = 2;
        subtypeEffectHandlerBuilderC.d(m0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        }, scheduler);
        subtypeEffectHandlerBuilderC.c(r0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        });
        subtypeEffectHandlerBuilderC.d(z0l1.class, new rdj1(xy2Var, (byte) 9), scheduler);
        subtypeEffectHandlerBuilderC.g(u0l1.class, new h1l1(j1l1Var, b7));
        subtypeEffectHandlerBuilderC.c(k0l1.class, new Consumer() { // from class: p.g1l1
            /* JADX WARN: Code duplicated, block: B:108:0x027c  */
            /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
                java.lang.UnsupportedOperationException
                	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
                	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
                */
            public final void accept(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 784
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.g1l1.accept(java.lang.Object):void");
            }
        });
        MobiusLoop.Builder builderG = l1d.g(Mobius.d(gp71Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())));
        ObservableSource observableSource = q7m0Var.d;
        ObservableSource observableSourceCast = q7m0Var.c.cast(j2l1.class);
        ObservableSource observableSourceHide = q7m0Var.e.c.hide();
        ObservableSource map = q7m0Var.f.a.map(sa20.Z0);
        yp41 yp41Var = q7m0Var.g;
        MobiusLoop.Controller controllerB = MobiusAndroid.b(builderG.h(RxEventSources.a(new ObservableSource[]{observableSource, observableSourceCast, observableSourceHide, map, yoi1.i(yp41Var.a.a, yp41Var.b).map(w1x0.t), q7m0Var.h.a.skip(1L).distinctUntilChanged().map(s321.h)})), new p2l1(q7m0Var.a, bundle != null ? bundle.getString("vtec_current_url") : null, dlb1Var.a, bundle == null ? 1 : 2, cb71.c, dlb1Var.c), new utw0(dlb1Var));
        FrameLayout frameLayout = (FrameLayout) b8k1.n(viewInflate, 2131431582);
        viewN.setVisibility(this.f.e ? 0 : 8);
        fn31.T(zso1.H(cir0Var.e().getLifecycle()), (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 9), 3);
        viewInflate.getClass();
        f9p f9pVar = (f9p) this.e.a.c;
        hcf1 hcf1Var = new hcf1(1, new qn40(viewInflate, cir0Var, (ts70) ((jly0) f9pVar.i).get(), new pn40(), (ArrayList) ((jly0) f9pVar.f).get()), qn40.class, "start", "start(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 27);
        boolean z2 = f291Var.k;
        avq avqVar = this.j;
        avqVar.getClass();
        f9p f9pVar2 = (f9p) avqVar.a.c;
        xao0 xao0Var = new xao0(webView, hcf1Var, frameLayout, viewN, cir0Var, z2, ((u2l1) f9pVar2.X).e, new l3n(new zgl1(1, (PublishSubject) ((jly0) f9pVar2.N0).get(), PublishSubject.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, (byte) 2), (g0l1) ((jly0) f9pVar2.g).get()), (ArrayList) ((jly0) f9pVar2.f).get());
        flb1Var.toString();
        return new y2l1(cir0Var, controllerB, viewInflate, webView, viewN2, this.d, xao0Var, f291Var.h, this.i, f291Var.j, bundle, this.g, this.k, new sjf1(0, this.c, q7m0.class, "sessionDidEnd", "sessionDidEnd()V", 0, (byte) 15));
    }
}
