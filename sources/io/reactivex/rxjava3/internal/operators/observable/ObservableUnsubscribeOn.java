package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler b;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer a;
        public final Scheduler b;
        public Disposable c;

        public final class DisposeTask implements Runnable {
            public DisposeTask() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeObserver.this.c.dispose();
            }
        }

        public UnsubscribeObserver(Observer observer, Scheduler scheduler) {
            this.a = observer;
            this.b = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.b.c(new DisposeTask());
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (get()) {
                return;
            }
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.b(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(Observable observable, Scheduler scheduler) {
        super(observable);
        this.b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new UnsubscribeObserver(observer, this.b));
    }
}
