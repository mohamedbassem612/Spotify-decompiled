package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.observables.GroupedObservable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableGroupBy$GroupedUnicast<K, T> extends GroupedObservable<K, T> {
    public final ObservableGroupBy$State b;

    public ObservableGroupBy$GroupedUnicast(Object obj, ObservableGroupBy$State observableGroupBy$State) {
        super(obj);
        this.b = observableGroupBy$State;
    }

    public static ObservableGroupBy$GroupedUnicast a(int i, ObservableGroupBy.GroupByObserver groupByObserver, Object obj, boolean z) {
        return new ObservableGroupBy$GroupedUnicast(obj, new ObservableGroupBy$State(i, groupByObserver, obj, z));
    }

    public final void onComplete() {
        ObservableGroupBy$State observableGroupBy$State = this.b;
        observableGroupBy$State.e = true;
        observableGroupBy$State.a();
    }

    public final void onError(Throwable th) {
        ObservableGroupBy$State observableGroupBy$State = this.b;
        observableGroupBy$State.f = th;
        observableGroupBy$State.e = true;
        observableGroupBy$State.a();
    }

    public final void onNext(Object obj) {
        ObservableGroupBy$State observableGroupBy$State = this.b;
        observableGroupBy$State.b.offer(obj);
        observableGroupBy$State.a();
    }

    public final void subscribeActual(Observer observer) {
        this.b.subscribe(observer);
    }
}
