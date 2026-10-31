package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bru0 implements dz01 {
    public final hn91 a;
    public final Scheduler b;
    public final xrc0 c;
    public final Observable d;
    public final Observable e;

    public bru0(Flowable flowable, hn91 hn91Var, Scheduler scheduler, xrc0 xrc0Var) {
        this.a = hn91Var;
        this.b = scheduler;
        this.c = xrc0Var;
        this.d = new ObservableFromPublisher(flowable).map(si10.b1).distinctUntilChanged().switchMap(new sks0(this, (byte) 8));
        this.e = new ObservableFromPublisher(flowable).map(eh10.b1).distinctUntilChanged();
    }
}
