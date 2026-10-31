package com.spotify.nowplaying.musicinstallation;

import android.app.PictureInPictureUiState;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.ags;
import p.b8k1;
import p.bpb1;
import p.bqn1;
import p.bvs0;
import p.bw20;
import p.d6d1;
import p.dg30;
import p.e6r0;
import p.f0i;
import p.f5p0;
import p.h580;
import p.hhp0;
import p.hid0;
import p.ih4;
import p.iw4;
import p.j1e1;
import p.jah;
import p.kj41;
import p.lik1;
import p.lrj0;
import p.mir0;
import p.mwn0;
import p.n2p0;
import p.n6r0;
import p.ncs;
import p.nhc;
import p.nik1;
import p.nu9;
import p.nyo0;
import p.o6p0;
import p.o6x;
import p.ov20;
import p.oyo0;
import p.p3t;
import p.p6r0;
import p.pqq0;
import p.qdd1;
import p.qir0;
import p.qyo0;
import p.r3p0;
import p.rg30;
import p.rqt0;
import p.s2p0;
import p.syo0;
import p.t2u;
import p.t3b1;
import p.t45;
import p.t4p0;
import p.th30;
import p.tkg;
import p.u890;
import p.vku;
import p.w4p0;
import p.w8c0;
import p.wnh1;
import p.xnh1;
import p.xoi1;
import p.y3o0;
import p.ydb;
import p.ynb0;
import p.yoi1;
import p.yon1;
import p.zf30;
import p.zia;
import p.zlv;
import p.zzc0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/nowplaying/musicinstallation/NowPlayingActivity;", "Lp/t3b1;", "<init>", "()V", "p/mhc", "src_main_java_com_spotify_nowplaying_musicinstallation-musicinstallation"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class NowPlayingActivity extends t3b1 {
    public static final lik1 y1 = nik1.p1;
    public ov20 f1;
    public th30 g1;
    public a2k h1;
    public o6p0 i1;
    public Flowable j1;
    public Scheduler k1;
    public mwn0 l1;
    public h580 m1;
    public ynb0 n1;
    public t4p0 o1;
    public w4p0 p1;
    public f5p0 q1;
    public ncs r1;
    public ih4 s1;
    public int t1;
    public int u1;
    public final BehaviorProcessor v1 = new BehaviorProcessor();
    public final vku w1 = new vku();
    public final tkg x1 = new tkg();

    public final void S(xnh1 xnh1Var) {
        this.x1.a(xnh1Var);
    }

    public final void U(n6r0 n6r0Var, qir0 qir0Var) {
        this.x1.U(n6r0Var, qir0Var);
    }

    public final mir0 c() {
        return p0().d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void finish() {
        o6p0 o6p0Var = this.i1;
        if (o6p0Var == null) {
            u890.C("nowPlayingTransitionManager");
            throw null;
        }
        boolean zBooleanValue = ((Boolean) o6p0Var.a.a().getValue()).booleanValue();
        dg30 dg30Var = o6p0Var.b;
        boolean booleanExtra = dg30Var.getIntent().getBooleanExtra("EXTRA_SHARED_ELEMENT_TRANSITION", false);
        if (!zBooleanValue || !booleanExtra) {
            dg30Var.overridePendingTransition(0, 2130772040);
        } else if (!o6p0Var.c) {
            dg30Var.getWindow().setReturnTransition(null);
            dg30Var.getWindow().setExitTransition(null);
            o6p0Var.c = true;
            dg30Var.finishAfterTransition();
            return;
        }
        super/*android.app.Activity*/.finish();
    }

    public final void h(n6r0 n6r0Var, qir0 qir0Var) {
        this.x1.h(n6r0Var, qir0Var);
    }

    public final zia j() {
        return this.x1.a;
    }

    public final rg30 l0() {
        a2k a2kVar = this.h1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0() {
        j1e1.q(this);
        o6p0 o6p0Var = this.i1;
        if (o6p0Var == null) {
            u890.C("nowPlayingTransitionManager");
            throw null;
        }
        n2p0 n2p0Var = o6p0Var.a;
        dg30 dg30Var = o6p0Var.b;
        n2p0Var.getClass();
        if (dg30Var.getIntent().getBooleanExtra("EXTRA_SHARED_ELEMENT_TRANSITION", false)) {
            return;
        }
        dg30Var.overridePendingTransition(2130772039, 0);
        dg30Var.startPostponedEnterTransition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(Class cls, Bundle bundle, boolean z) {
        if (isFinishing()) {
            return;
        }
        th30 th30Var = this.g1;
        if (th30Var == null) {
            u890.C("fragmentManager");
            throw null;
        }
        zf30 zf30VarF = th30Var.F(2131428203);
        if (zf30VarF == null || !zf30VarF.getClass().getSimpleName().equals(cls.getSimpleName()) || z) {
            th30 th30Var2 = this.g1;
            if (th30Var2 == null) {
                u890.C("fragmentManager");
                throw null;
            }
            nu9 nu9Var = new nu9(th30Var2);
            nu9Var.n(2131428203, nu9Var.j(bundle, cls), cls.getSimpleName());
            nu9Var.h();
            View viewFindViewById = findViewById(2131428203);
            WeakHashMap weakHashMap = b8k1.a;
            viewFindViewById.requestApplyInsets();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onConfigurationChanged(Configuration configuration) {
        super/*p.gj5*/.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT < 31 || !isInPictureInPictureMode()) {
            int i = configuration.orientation;
            int i2 = configuration.screenWidthDp;
            int i3 = this.u1;
            boolean z = i3 > 0 && (Math.abs(i2 - i3) * 100) / this.u1 > 10;
            if (this.t1 != i || z) {
                this.t1 = i;
                this.u1 = i2;
                ncs ncsVar = this.r1;
                if (ncsVar == null) {
                    u890.C("displayModeReconciler");
                    throw null;
                }
                pqq0 pqq0Var = pqq0.b;
                pqq0 pqq0Var2 = i == 1 ? pqq0.a : pqq0Var;
                bpb1 bpb1Var = ncsVar.c;
                s2p0 s2p0Var = (pqq0Var2 == pqq0Var && ((Boolean) ncsVar.b.invoke()).booleanValue()) ? s2p0.b : s2p0.a;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, s2p0Var);
                this.w1.a(r0(true));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        postponeEnterTransition();
        super.onCreate(bundle);
        w4p0 w4p0Var = this.p1;
        if (w4p0Var == null) {
            u890.C("pageLoadReporter");
            throw null;
        }
        if (!w4p0Var.f) {
            w4p0Var.f = true;
            iw4 iw4Var = w4p0Var.d;
            if (iw4Var != null) {
                String strValueOf = String.valueOf(w4p0Var.c.c() - w4p0Var.e);
                t45 t45Var = iw4Var.c;
                if (t45Var != null) {
                    t45Var.b("npv_launch_ms", strValueOf);
                }
            }
        }
        setTitle(2131959222);
        setContentView((bqn1.z(this) && xoi1.a(this)) ? 2131624008 : 2131624007);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            jah.f(getWindow().getAttributes(), 1);
        }
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        if (i >= 29) {
            getWindow().setNavigationBarContrastEnforced(true);
            getWindow().setStatusBarContrastEnforced(true);
        }
        this.t1 = getResources().getConfiguration().orientation;
        this.u1 = getResources().getConfiguration().screenWidthDp;
        View viewFindViewById = findViewById(2131431511);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new hid0(this, (byte) 9));
        }
        J().a(this, new ydb(new y3o0(this, (byte) 13), (byte) 18));
        h580 h580Var = this.m1;
        if (h580Var == null) {
            u890.C("inAppMessagingActivityObserver");
            throw null;
        }
        NowPlayingActivity nowPlayingActivity = h580Var.a;
        ((f0i) nowPlayingActivity).a.a(h580Var);
        h580Var.b.a(nowPlayingActivity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPause() {
        super/*p.dac0*/.onPause();
        if (!isChangingConfigurations()) {
            f5p0 f5p0Var = this.q1;
            if (f5p0Var == null) {
                u890.C("pageVisitTracker");
                throw null;
            }
            kj41 kj41Var = f5p0Var.a;
            if (kj41Var != null) {
                kj41Var.stop();
            }
            f5p0Var.a = null;
        }
        wnh1.H(p0().e);
    }

    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super/*p.g0i*/.onPictureInPictureModeChanged(z, configuration);
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (z) {
            q0();
            return;
        }
        if (!((f0i) this).a.i.a(w8c0.d)) {
            finish();
        } else {
            if (e0().U()) {
                return;
            }
            this.w1.a(r0(false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super/*android.app.Activity*/.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (Build.VERSION.SDK_INT < 35 || !pictureInPictureUiState.isTransitioningToPip()) {
            return;
        }
        ih4 ih4Var = this.s1;
        if (ih4Var == null) {
            u890.C("pipProperties");
            throw null;
        }
        if (ih4Var.a()) {
            q0();
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super/*p.dac0*/.onRestoreInstanceState(bundle);
        p0().e.y(bundle);
    }

    public final void onResume() {
        super/*p.dac0*/.onResume();
        f5p0 f5p0Var = this.q1;
        if (f5p0Var == null) {
            u890.C("pageVisitTracker");
            throw null;
        }
        hhp0 hhp0Var = hhp0.a;
        if (hhp0.y() && f5p0Var.a == null) {
            kj41 kj41VarU = hhp0.a.u("page.visit");
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            kj41VarU.setAttribute("page_identifier", yon1.X2().c);
            kj41VarU.setAttribute("page_implementation", "activity");
            f5p0Var.a = kj41VarU;
        }
        p0().e.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundleI;
        super/*p.dac0*/.onSaveInstanceState(bundle);
        if (!isChangingConfigurations() || (bundleI = p0().e.I()) == null) {
            return;
        }
        bundle.putAll(bundleI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onStart() {
        Disposable disposableSubscribe;
        super/*p.dac0*/.onStart();
        p0().e.G();
        int i = Build.VERSION.SDK_INT;
        vku vkuVar = this.w1;
        if (i < 31 || !isInPictureInPictureMode()) {
            vkuVar.a(r0(false));
        } else {
            o0(bvs0.class, null, false);
        }
        if (i < 31 || !getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            disposableSubscribe = EmptyDisposable.a;
        } else {
            Flowable flowable = this.j1;
            if (flowable == null) {
                u890.C("enablePiPAutoEnterFlowable");
                throw null;
            }
            disposableSubscribe = flowable.J(nyo0.a).subscribe(new oyo0(this, (byte) 0), zzc0.O0);
        }
        disposableSubscribe.getClass();
        vkuVar.a(disposableSubscribe);
        ynb0 ynb0Var = this.n1;
        if (ynb0Var == null) {
            u890.C("uiPluginPoint");
            throw null;
        }
        Iterator it = ((syo0) ynb0Var.get()).a.iterator();
        while (it.hasNext()) {
            ((qyo0) ((ynb0) it.next()).get()).c();
        }
    }

    public final void onStop() {
        super/*p.dac0*/.onStop();
        this.w1.c();
        ynb0 ynb0Var = this.n1;
        if (ynb0Var == null) {
            u890.C("uiPluginPoint");
            throw null;
        }
        Iterator it = ((syo0) ynb0Var.get()).a.iterator();
        while (it.hasNext()) {
            ((qyo0) ((ynb0) it.next()).get()).d();
        }
        w4p0 w4p0Var = this.p1;
        if (w4p0Var == null) {
            u890.C("pageLoadReporter");
            throw null;
        }
        iw4 iw4Var = w4p0Var.d;
        if (iw4Var != null) {
            iw4Var.b(3);
        }
        w4p0Var.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.v1.onNext(Boolean.valueOf(z));
        if (z) {
            p0().e.F();
        } else {
            wnh1.H(p0().e);
        }
    }

    public final t4p0 p0() {
        t4p0 t4p0Var = this.o1;
        if (t4p0Var != null) {
            return t4p0Var;
        }
        u890.C("pageBoundUbiLogger");
        throw null;
    }

    public final void q0() {
        int iNextIndex;
        th30 th30Var = this.g1;
        if (th30Var == null) {
            u890.C("fragmentManager");
            throw null;
        }
        List listU = th30Var.c.u();
        ListIterator listIterator = listU.listIterator(listU.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((zf30) listIterator.previous()) instanceof r3p0) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = listU.size();
            for (int i = iNextIndex + 1; i < size; i++) {
                t2u t2uVar = (zf30) listU.get(i);
                if (t2uVar instanceof t2u) {
                    t2u t2uVar2 = t2uVar;
                    if (t2uVar2.q0()) {
                        t2uVar2.Y0();
                    }
                }
            }
        }
        o0(bvs0.class, null, false);
    }

    public final Disposable r0(boolean z) {
        bw20 bw20Var = this.f1;
        if (bw20Var == null) {
            u890.C("flowProductState");
            throw null;
        }
        Observable map = yoi1.i(rqt0.u(new p3t(bw20Var.a, (byte) 23)), o6x.a).doOnSubscribe(new lrj0(this, (byte) 17)).map(new nhc((byte) 17));
        Scheduler scheduler = this.k1;
        if (scheduler != null) {
            return map.observeOn(scheduler).subscribe(new ags(this, z, (byte) 1), zzc0.P0);
        }
        u890.C("mainScheduler");
        throw null;
    }

    public final void y(e6r0 e6r0Var) {
        this.x1.y(e6r0Var);
    }
}
