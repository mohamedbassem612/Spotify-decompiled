package p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c6b1 implements dwo {
    public static final bma1 f = bma1.b.q("send_playback_broadcasts");
    public static final wx91 g = wx91.e;
    public final Context a;
    public final kly0 b;
    public final dma1 c;
    public final CompositeDisposable d;
    public final FlowableObserveOn e;

    public c6b1(Context context, u0i0 u0i0Var, kly0 kly0Var, Scheduler scheduler, Flowable flowable) {
        this.a = context;
        this.b = kly0Var;
        ima1 ima1VarD = u0i0Var.a.d(context, "spotify_preferences");
        this.c = ima1VarD;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.d = compositeDisposable;
        FlowableObserveOn flowableObserveOnL = flowable.L(scheduler);
        this.e = flowableObserveOnL;
        FlowableDistinctUntilChanged flowableDistinctUntilChangedT = flowableObserveOnL.x(new eoc(this, (byte) 25)).t(kuw0.h);
        Disposable disposableSubscribe = yoi1.i(ima1VarD.q(f), o6x.a).filter(hcx0.Q0).map(icx0.P0).startWith(Observable.fromCallable(new sra(this, (byte) 23))).subscribe((Consumer) new z0u0(this, flowableDistinctUntilChangedT, (byte) 21));
        Disposable disposableSubscribe2 = flowableDistinctUntilChangedT.subscribe(new dy40(this, (byte) 24), g);
        compositeDisposable.b(disposableSubscribe);
        compositeDisposable.b(disposableSubscribe2);
    }

    public static boolean a(PlayerState playerState) {
        spq0 spq0VarTrack = playerState.track();
        return spq0VarTrack.c() && l4o1.E((ContextTrack) spq0VarTrack.b());
    }

    public static boolean b(PlayerState playerState) {
        if (playerState.track().c()) {
            return "fallback".equalsIgnoreCase((String) ((ContextTrack) playerState.track().b()).metadata().get("mft.injection_source"));
        }
        return false;
    }

    @Override // p.dwo
    public final void shutdown() {
        this.d.g();
    }
}
