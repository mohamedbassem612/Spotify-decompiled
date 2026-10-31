package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableReplay$MulticastReplay<R, U> extends Observable<R> {
    public final Supplier a;
    public final Function b;

    public ObservableReplay$MulticastReplay(Function function, Supplier supplier) {
        this.a = supplier;
        this.b = function;
    }

    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.a.get();
            Objects.requireNonNull(obj, "The connectableFactory returned a null ConnectableObservable");
            ConnectableObservable connectableObservable = (ConnectableObservable) obj;
            Object objApply = this.b.apply(connectableObservable);
            Objects.requireNonNull(objApply, "The selector returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            final ObserverResourceWrapper observerResourceWrapper = new ObserverResourceWrapper(observer);
            observableSource.subscribe(observerResourceWrapper);
            connectableObservable.c(new Consumer<Disposable>(observerResourceWrapper) { // from class: io.reactivex.rxjava3.internal.operators.observable.ObservableReplay$DisposeConsumer
                public final ObserverResourceWrapper a;

                {
                    this.a = observerResourceWrapper;
                }

                public final void accept(Object obj2) {
                    DisposableHelper.f(this.a, (Disposable) obj2);
                }
            });
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.c(th, observer);
        }
    }
}
