package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {
    public final Function b;

    public static final class OnErrorNextObserver<T> implements Observer<T> {
        public final Observer a;
        public final Function b;
        public final SequentialDisposable c = new SequentialDisposable();
        public boolean d;
        public boolean e;

        public OnErrorNextObserver(Observer observer, Function function) {
            this.a = observer;
            this.b = function;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.d = true;
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            boolean z = this.d;
            Observer observer = this.a;
            if (z) {
                if (this.e) {
                    RxJavaPlugins.b(th);
                    return;
                } else {
                    observer.onError(th);
                    return;
                }
            }
            this.d = true;
            try {
                ObservableSource observableSource = (ObservableSource) this.b.apply(th);
                if (observableSource != null) {
                    observableSource.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                observer.onError(nullPointerException);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                observer.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.c, disposable);
        }
    }

    public ObservableOnErrorNext(Observable observable, Function function) {
        super(observable);
        this.b = function;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer, this.b);
        observer.onSubscribe(onErrorNextObserver.c);
        this.a.subscribe(onErrorNextObserver);
    }
}
