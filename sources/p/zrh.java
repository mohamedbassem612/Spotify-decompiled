package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zrh {
    public final l78 a;
    public final Scheduler b;
    public final Scheduler c;
    public final Observable d;
    public final rku e = new rku();

    public zrh(l78 l78Var, Flowable flowable, Scheduler scheduler, Scheduler scheduler2) {
        this.a = l78Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = new ObservableFromPublisher(flowable).map(drm0.Q0).filter(cq41.Q0).map(uml1.Q0).distinctUntilChanged();
    }
}
