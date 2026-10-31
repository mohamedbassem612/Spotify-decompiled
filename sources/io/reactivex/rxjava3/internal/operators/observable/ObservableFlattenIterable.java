package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {
    public final Function b;

    public static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {
        public final Observer a;
        public final Function b;
        public Disposable c;

        public FlattenIterableObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Disposable disposable = this.c;
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (disposable == disposableHelper) {
                return;
            }
            this.c = disposableHelper;
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            Disposable disposable = this.c;
            DisposableHelper disposableHelper = DisposableHelper.a;
            if (disposable == disposableHelper) {
                RxJavaPlugins.b(th);
            } else {
                this.c = disposableHelper;
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.c == DisposableHelper.a) {
                return;
            }
            try {
                for (T t : (Iterable) this.b.apply(obj)) {
                    try {
                        try {
                            Objects.requireNonNull(t, "The iterator returned a null value");
                            this.a.onNext(t);
                        } catch (Throwable th) {
                            Exceptions.a(th);
                            this.c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        this.c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.a(th3);
                this.c.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlattenIterable(Observable observable, Function function) {
        super(observable);
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new FlattenIterableObserver(observer, this.b));
    }
}
