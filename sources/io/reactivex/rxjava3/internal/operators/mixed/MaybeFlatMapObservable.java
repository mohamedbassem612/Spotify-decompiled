package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class MaybeFlatMapObservable<T, R> extends Observable<R> {
    public final Maybe a;
    public final Function b;

    public static final class FlatMapObserver<T, R> extends AtomicReference<Disposable> implements Observer<R>, MaybeObserver<T>, Disposable {
        public final Observer a;
        public final Function b;

        public FlatMapObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver
        public final void onSuccess(Object obj) {
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                ObservableSource observableSource = (ObservableSource) objApply;
                if (isDisposed()) {
                    return;
                }
                observableSource.subscribe(this);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.a.onError(th);
            }
        }
    }

    public MaybeFlatMapObservable(Maybe maybe, Function function) {
        this.a = maybe;
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        FlatMapObserver flatMapObserver = new FlatMapObserver(observer, this.b);
        observer.onSubscribe(flatMapObserver);
        this.a.subscribe(flatMapObserver);
    }
}
