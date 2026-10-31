package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tge0 {
    public final ObservableRefCount a;

    public tge0(Observable observable, Observable observable2, Scheduler scheduler) {
        this.a = Observable.combineLatest(observable.map(eh10.Y), observable2.map(mi10.Y).startWithItem(Boolean.FALSE), fkj0.X0).skipWhile(yb10.Y).distinctUntilChanged().subscribeOn(scheduler).replay(1).f();
    }
}
