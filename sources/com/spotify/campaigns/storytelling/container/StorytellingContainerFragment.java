package com.spotify.campaigns.storytelling.container;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import p.aac1;
import p.bac1;
import p.bfb1;
import p.c471;
import p.c4c1;
import p.cac1;
import p.cmt;
import p.cn00;
import p.cto1;
import p.dac1;
import p.eac1;
import p.eb71;
import p.ewn0;
import p.f4x0;
import p.fac1;
import p.fbc1;
import p.fn31;
import p.g4c1;
import p.gac1;
import p.gap1;
import p.gbc1;
import p.h5a1;
import p.hac1;
import p.hbc1;
import p.hdn1;
import p.he7;
import p.hip;
import p.i5x0;
import p.iac1;
import p.ibc1;
import p.ij01;
import p.j810;
import p.jac1;
import p.jbc1;
import p.jix0;
import p.k9p1;
import p.kac1;
import p.kas0;
import p.kbc1;
import p.l1d;
import p.l5b1;
import p.lac1;
import p.lbc1;
import p.lnm;
import p.mac1;
import p.mcn1;
import p.nac1;
import p.o8n;
import p.oac1;
import p.p5x0;
import p.pac1;
import p.ptj;
import p.qac1;
import p.qg7;
import p.qy7;
import p.r2a1;
import p.r4c1;
import p.r5x0;
import p.r6x0;
import p.rac1;
import p.ruz0;
import p.sac1;
import p.tac1;
import p.th30;
import p.u890;
import p.uac1;
import p.vdn1;
import p.x9c1;
import p.xh71;
import p.xq81;
import p.y6x0;
import p.y9c1;
import p.yon;
import p.z4c1;
import p.z9c1;
import p.zd1;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/campaigns/storytelling/container/StorytellingContainerFragment;", "Lp/hip;", "<init>", "()V", "src_main_java_com_spotify_campaigns_storytelling-storytelling"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class StorytellingContainerFragment extends hip {
    public kbc1 G1;
    public ewn0 H1;
    public ij01 I1;
    public c4c1 J1;
    public j810 K1;
    public MobiusLoop.Controller L1;

    public final void D0() {
        ((zf30) this).h1 = true;
        ewn0 ewn0Var = this.H1;
        if (ewn0Var != null) {
            ewn0Var.f(kas0.a);
        } else {
            u890.C("pauseStateConsumer");
            throw null;
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        ewn0 ewn0Var = this.H1;
        if (ewn0Var != null) {
            ewn0Var.f(kas0.b);
        } else {
            u890.C("pauseStateConsumer");
            throw null;
        }
    }

    public final void F0(Bundle bundle) {
        MobiusLoop.Controller controller = this.L1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        bundle.putSerializable("pause_state", ((lbc1) controller.a()).d);
        MobiusLoop.Controller controller2 = this.L1;
        if (controller2 != null) {
            bundle.putBoolean("muted", ((lbc1) controller2.a()).f);
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("controller");
            throw null;
        }
    }

    public final void H0() {
        MobiusLoop.Controller controller = this.L1;
        if (controller == null) {
            u890.C("controller");
            throw null;
        }
        controller.stop();
        ((zf30) this).h1 = true;
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        fn31.T(cto1.q(this), (o8n) null, 0, new bfb1(this, new fbc1(this, (byte) 1), new fbc1(this, (byte) 0), (lnm) null, (byte) 4), 3);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kas0 kas0Var;
        if (bundle == null) {
            kas0Var = kas0.b;
        } else {
            kas0Var = Build.VERSION.SDK_INT >= 33 ? (kas0) bundle.getSerializable("pause_state", kas0.class) : (kas0) bundle.getSerializable("pause_state");
            if (kas0Var == null) {
                kas0Var = kas0.b;
            }
        }
        lbc1 lbc1Var = new lbc1(r4c1.a, 0, 0, kas0Var, jix0.b, bundle != null ? bundle.getBoolean("muted", false) : false, true, false, false, false, eb71.b);
        th30 th30VarG0 = g0();
        c4c1 c4c1Var = this.J1;
        if (c4c1Var == null) {
            u890.C("controls");
            throw null;
        }
        he7 he7Var = new he7(layoutInflater, viewGroup, th30VarG0, c4c1Var);
        ConstraintLayout constraintLayout = (ConstraintLayout) he7Var.e;
        kbc1 kbc1Var = this.G1;
        if (kbc1Var == null) {
            u890.C("injector");
            throw null;
        }
        h5a1 h5a1Var = new h5a1(he7Var, (byte) 7);
        Single single = kbc1Var.a;
        l5b1 l5b1Var = kbc1Var.b;
        ptj ptjVar = kbc1Var.c;
        ewn0 ewn0Var = kbc1Var.d;
        xq81 xq81Var = kbc1Var.e;
        cn00 cn00Var = kbc1Var.f;
        z4c1 z4c1Var = kbc1Var.j;
        qy7 qy7Var = kbc1Var.k;
        r2a1 r2a1Var = kbc1Var.l;
        Scheduler scheduler = kbc1Var.o;
        cmt cmtVar = new cmt(c471.a, 3);
        String str = kbc1Var.r;
        xh71 xh71Var = (xh71) kbc1Var.f33p.h();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(y9c1.class, new yon(scheduler, single, ptjVar, str, (byte) 13));
        qg7 qg7Var = new qg7(qy7Var, h5a1Var, ptjVar, (byte) 29);
        Scheduler scheduler2 = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler2);
        subtypeEffectHandlerBuilderC.d(mac1.class, qg7Var, scheduler2);
        subtypeEffectHandlerBuilderC.b(x9c1.class, new ruz0(cn00Var, (byte) 13), scheduler2);
        subtypeEffectHandlerBuilderC.d(hac1.class, new oac1(ptjVar, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.d(iac1.class, new tac1(ptjVar, qy7Var, r2a1Var, (byte) 0), scheduler2);
        subtypeEffectHandlerBuilderC.d(kac1.class, new tac1(ptjVar, qy7Var, r2a1Var, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.g(jac1.class, new zd1(scheduler, l5b1Var, str, (byte) 20));
        subtypeEffectHandlerBuilderC.d(lac1.class, new uac1(r2a1Var, z4c1Var, ptjVar, ewn0Var, xh71Var, str, cmtVar), scheduler2);
        subtypeEffectHandlerBuilderC.a(z9c1.class, new pac1(r2a1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.a(bac1.class, new pac1(r2a1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.a(cac1.class, new pac1(r2a1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.a(fac1.class, new sac1(ewn0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.a(gac1.class, new sac1(ewn0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.b(eac1.class, new rac1(qy7Var, xq81Var, r2a1Var, (byte) 0), scheduler2);
        subtypeEffectHandlerBuilderC.b(nac1.class, new rac1(qy7Var, xq81Var, r2a1Var, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.c(dac1.class, new qac1(r2a1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.c(aac1.class, new qac1(r2a1Var, (byte) 0));
        MobiusLoop.Builder builderD = Mobius.d(hbc1.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        Observable observable = kbc1Var.g;
        MobiusLoop.Builder builderB = builderD.h(RxEventSources.a(new ObservableSource[]{observable.map(r6x0.R0).onErrorResumeNext(new k9p1(str, (byte) 16)), kbc1Var.h.map(f4x0.P0).onErrorResumeNext(new mcn1(str, (byte) 10)), kbc1Var.i.map(r5x0.R0).onErrorResumeNext(new vdn1(str, (byte) 19)), kbc1Var.m.map(y6x0.Q0).onErrorResumeNext(new gap1(str, (byte) 15)), kbc1Var.q.withLatestFrom(observable, i5x0.P0).map(p5x0.R0).onErrorResumeNext(new hdn1(str, (byte) 9))})).d(new ibc1(kbc1Var)).b(new jbc1(kbc1Var));
        "StorytellingContainer for ".concat(str);
        MobiusLoop.Controller controllerB = Mobius.b(l1d.g(builderB), lbc1Var, gbc1.a, MainThreadWorkRunner.a());
        this.L1 = controllerB;
        controllerB.c(he7Var);
        constraintLayout.setKeepScreenOn(true);
        return constraintLayout;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        c4c1 c4c1Var = this.J1;
        if (c4c1Var == null) {
            u890.C("controls");
            throw null;
        }
        g4c1 g4c1Var = c4c1Var.c;
        g4c1Var.n1.b();
        Disposable disposable = g4c1Var.o1;
        if (disposable != null) {
            disposable.dispose();
        }
        g4c1Var.o1 = null;
        MobiusLoop.Controller controller = this.L1;
        if (controller != null) {
            controller.disconnect();
        } else {
            u890.C("controller");
            throw null;
        }
    }
}
