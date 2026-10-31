package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ghr {
    public static final bma1 k;
    public static final bma1 l;
    public final yqg a;
    public final Scheduler b;
    public final h481 c;
    public final n481 d;
    public final g7h e;
    public final Single f;
    public final zrm1 g;
    public final qhr h;
    public final e481 i;
    public final Observable j;

    static {
        nbc nbcVar = bma1.b;
        k = nbcVar.u("audiobook_nudge_player_uri");
        l = nbcVar.u("audiobook_nudge_player_timestamp");
    }

    public ghr(yqg yqgVar, Flowable flowable, Scheduler scheduler, h481 h481Var, n481 n481Var, g7h g7hVar, Single single, zrm1 zrm1Var, qhr qhrVar) {
        this.a = yqgVar;
        this.b = scheduler;
        this.c = h481Var;
        this.d = n481Var;
        this.e = g7hVar;
        this.f = single;
        this.g = zrm1Var;
        this.h = qhrVar;
        Boolean bool = Boolean.TRUE;
        this.i = new e481(new t881(new y381((e3z) null, new x381(f46.i0(new Integer[]{31, 90, 52}), sqg0.J(oqn1.n("link", bool), oqn1.n("playedTime", bool), oqn1.n("isBook", bool), oqn1.n("playedPercentage", bool), oqn1.n("isCurated", bool))), 5)), null, null, 262141);
        this.j = new ObservableFromPublisher(flowable).filter(new lfb(this, (byte) 6));
    }

    public final Observable a() {
        zrm1 zrm1Var = this.g;
        if (zrm1Var.a()) {
            Observable observableObserveOn = Observable.interval(0L, zrm1Var.c(), TimeUnit.MINUTES).flatMapSingle(new h9n(this, (byte) 6)).onErrorReturn(vap1.T0).observeOn(this.b);
            observableObserveOn.getClass();
            return observableObserveOn;
        }
        Observable observableJust = Observable.just(ea8.a);
        observableJust.getClass();
        return observableJust;
    }
}
