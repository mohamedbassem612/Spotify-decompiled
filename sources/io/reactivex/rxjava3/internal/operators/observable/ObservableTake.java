package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;

    public static final class TakeObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public boolean b;
        public Disposable c;
        public long d;

        public TakeObserver(Observer observer, long j) {
            this.a = observer;
            this.d = j;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.b(th);
                return;
            }
            this.b = true;
            this.c.dispose();
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.b) {
                return;
            }
            long j = this.d;
            long j2 = j - 1;
            this.d = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.a.onNext(obj);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                long j = this.d;
                Observer observer = this.a;
                if (j != 0) {
                    observer.onSubscribe(this);
                    return;
                }
                this.b = true;
                disposable.dispose();
                EmptyDisposable.b(observer);
            }
        }
    }

    public ObservableTake(ObservableSource observableSource, long j) {
        super(observableSource);
        this.b = j;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new TakeObserver(observer, this.b));
    }
}
