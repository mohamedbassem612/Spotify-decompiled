package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableDebounceTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;

    public static final class DebounceTimedObserver<T> implements Observer<T>, Disposable {
        public final SerializedObserver a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler.Worker d;
        public Disposable e;
        public Disposable f;
        public volatile long g;
        public boolean h;

        public DebounceTimedObserver(SerializedObserver serializedObserver, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.a = serializedObserver;
            this.b = j;
            this.c = timeUnit;
            this.d = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            DebounceEmitter debounceEmitter = this.f;
            if (debounceEmitter != null) {
                debounceEmitter.dispose();
            }
            DebounceEmitter debounceEmitter2 = debounceEmitter;
            if (debounceEmitter2 != null) {
                debounceEmitter2.run();
            }
            this.a.onComplete();
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            Disposable disposable = this.f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.h = true;
            this.a.onError(th);
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            long j = this.g + 1;
            this.g = j;
            Disposable disposable = this.f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f = debounceEmitter;
            debounceEmitter.a(this.d.b(debounceEmitter, this.b, this.c));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(Observable observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new DebounceTimedObserver(new SerializedObserver(observer), this.b, this.c, this.d.b()));
    }
}
