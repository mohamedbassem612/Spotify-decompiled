package p;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp/bvs0;", "Lp/zf30;", "Lp/fn10;", "Lp/o6r0;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_nowplaying_pip-pip"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class bvs0 extends zf30 implements fn10, o6r0, jik1 {
    public Flowable F1;
    public c3s G1;
    public t8r0 H1;
    public w2k1 I1;
    public Scheduler J1;
    public t8r0 K1;
    public t8r0 L1;
    public View M1;
    public VideoSurfaceView N1;
    public final vku O1 = new vku();
    public final vku P1 = new vku();
    public final lik1 Q1 = nik1.p1;
    public final gn10 R1 = mno1.M;

    public final void G0() {
        ((zf30) this).h1 = true;
        w2k1 w2k1Var = this.I1;
        if (w2k1Var == null) {
            u890.C("videoSurfaceManager");
            throw null;
        }
        VideoSurfaceView videoSurfaceView = this.N1;
        if (videoSurfaceView == null) {
            u890.C("videoSurfaceView");
            throw null;
        }
        w2k1Var.a(videoSurfaceView);
        t8r0 t8r0Var = this.L1;
        if (t8r0Var == null) {
            u890.C("pipTrigger");
            throw null;
        }
        this.P1.a(!((ih4) t8r0Var.b).c() ? EmptyDisposable.a : ljg.c((ljg) t8r0Var.a, "pip:pip-started:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510).onErrorComplete().subscribe());
        Flowable flowable = this.F1;
        if (flowable == null) {
            u890.C("playerStateFlowable");
            throw null;
        }
        Scheduler scheduler = this.J1;
        if (scheduler != null) {
            this.O1.a(flowable.L(scheduler).subscribe(new oyo0(this, (byte) 1)));
        } else {
            u890.C("mainScheduler");
            throw null;
        }
    }

    public final void H0() {
        this.O1.c();
        w2k1 w2k1Var = this.I1;
        if (w2k1Var == null) {
            u890.C("videoSurfaceManager");
            throw null;
        }
        VideoSurfaceView videoSurfaceView = this.N1;
        if (videoSurfaceView == null) {
            u890.C("videoSurfaceView");
            throw null;
        }
        w2k1Var.f(videoSurfaceView);
        t8r0 t8r0Var = this.L1;
        if (t8r0Var == null) {
            u890.C("pipTrigger");
            throw null;
        }
        this.P1.a(!((ih4) t8r0Var.b).b() ? EmptyDisposable.a : ljg.c((ljg) t8r0Var.a, "pip:pip-ended:v1", (TriggerType) null, (String) null, (List) null, (tv80) null, (uy31) null, (DynamicTagsMetadata) null, (ConflictResolutionStrategy) null, (d3j0) null, 510).onErrorComplete().subscribe());
        ((zf30) this).h1 = true;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getR1() {
        return this.R1;
    }

    public final RemoteAction Y0(boolean z) {
        if (z) {
            wu7.k();
            Icon iconCreateWithResource = Icon.createWithResource(h0(), 2131232313);
            String string = P0().getString(2131959750);
            String string2 = P0().getString(2131959750);
            t8r0 t8r0Var = this.H1;
            if (t8r0Var != null) {
                return wu7.d(iconCreateWithResource, string, string2, ((zo5) t8r0Var.a).a(AppLifecycleServicePendingIntent.PIP_PLAYER_RESUME, (Bundle) t8r0Var.b));
            }
            u890.C("pipPlayerIntentsFactory");
            throw null;
        }
        wu7.k();
        Icon iconCreateWithResource2 = Icon.createWithResource(h0(), 2131232286);
        String string3 = P0().getString(2131959749);
        String string4 = P0().getString(2131959749);
        t8r0 t8r0Var2 = this.H1;
        if (t8r0Var2 != null) {
            return wu7.d(iconCreateWithResource2, string3, string4, ((zo5) t8r0Var2.a).a(AppLifecycleServicePendingIntent.PIP_PLAYER_PAUSE, (Bundle) t8r0Var2.b));
        }
        u890.C("pipPlayerIntentsFactory");
        throw null;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.X2();
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getQ1() {
        return this.Q1;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131624685, viewGroup, false);
        this.M1 = b8k1.n(viewInflate, 2131430345);
        VideoSurfaceView videoSurfaceViewFindViewById = viewInflate.findViewById(2131430347);
        VideoSurfaceView videoSurfaceView = videoSurfaceViewFindViewById;
        videoSurfaceView.setPriority(y2k1.d);
        videoSurfaceView.setConfiguration(dlm.h);
        this.N1 = videoSurfaceViewFindViewById;
        t8r0 t8r0Var = this.K1;
        if (t8r0Var != null) {
            ((i8h1) t8r0Var.a).f(((zok0) t8r0Var.b).e(), (Set) null);
            return viewInflate;
        }
        u890.C("logger");
        throw null;
    }

    public final void y0() {
        this.P1.c();
        ((zf30) this).h1 = true;
    }
}
