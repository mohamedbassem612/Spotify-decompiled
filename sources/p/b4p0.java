package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp/b4p0;", "Lp/fac0;", "Lp/fn10;", "Lp/o6r0;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_nowplayingmini_nowplayingmini-nowplayingmini"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class b4p0 extends fac0 implements fn10, o6r0, jik1 {
    public bjx G1;
    public ewx H1;
    public m7p0 I1;
    public ror J1;
    public ViewGroup K1;
    public final idd1 L1 = new idd1(new ivn0(this, (byte) 20));
    public final gn10 M1 = mno1.N;
    public final lik1 N1 = nik1.n1;

    public final void D0() {
        super.D0();
        bjx bjxVar = this.G1;
        if (bjxVar == null) {
            u890.C("miniModeContainerPresenter");
            throw null;
        }
        ((rku) bjxVar.f).a();
        m4p0 m4p0Var = (m4p0) bjxVar.g;
        if (m4p0Var != null) {
            m4p0Var.stop();
        }
    }

    public final void E0() {
        super.E0();
        bjx bjxVar = this.G1;
        if (bjxVar == null) {
            u890.C("miniModeContainerPresenter");
            throw null;
        }
        m4p0 m4p0Var = (m4p0) bjxVar.g;
        if (m4p0Var != null) {
            m4p0Var.start();
        }
        rku rkuVar = (rku) bjxVar.f;
        rzo0 rzo0Var = (rzo0) bjxVar.b;
        rkuVar.b(new FlowableOnBackpressureLatest(Flowable.h((FlowableDistinctUntilChanged) rzo0Var.c, (Flowable) rzo0Var.d, as10.R0).J(new z8c0(rzo0Var, (byte) 28)).t(Functions.a)).x(new jpa0(bjxVar, (byte) 22)).c0(Flowable.O(0, Integer.MAX_VALUE), xi10.P0).m(new dg90(bjxVar, (byte) 26)).v(new vrk1(bjxVar, (byte) 22)).C(new upa0(bjxVar, (byte) 25), false, Integer.MAX_VALUE).W((Scheduler) bjxVar.d).L((Scheduler) bjxVar.e).subscribe(new w090(bjxVar, this, (byte) 17)));
    }

    public final void G0() {
        super.G0();
        m7p0 m7p0Var = this.I1;
        if (m7p0Var != null) {
            m7p0Var.b((l7p0) this.L1.getValue(), new h7p0());
        } else {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getM1() {
        return this.M1;
    }

    public final void Y0() {
        ror rorVar = this.J1;
        if (rorVar == null) {
            u890.C("smartControlContainer");
            throw null;
        }
        Context contextP0 = P0();
        ViewGroup viewGroup = this.K1;
        if (viewGroup == null) {
            u890.C("rootView");
            throw null;
        }
        View viewB = rorVar.b(contextP0, viewGroup, 2, zg91.c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        layoutParams.gravity = 8388693;
        viewB.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = this.K1;
        if (viewGroup2 != null) {
            viewGroup2.addView(viewB);
        } else {
            u890.C("rootView");
            throw null;
        }
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.Z2();
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getN1() {
        return this.N1;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.K1 = (ViewGroup) layoutInflater.inflate(2131625324, viewGroup, false);
        Y0();
        ViewGroup viewGroup2 = this.K1;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        u890.C("rootView");
        throw null;
    }

    public final void y0() {
        super.y0();
        m7p0 m7p0Var = this.I1;
        if (m7p0Var != null) {
            m7p0Var.a((l7p0) this.L1.getValue());
        } else {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
    }
}
