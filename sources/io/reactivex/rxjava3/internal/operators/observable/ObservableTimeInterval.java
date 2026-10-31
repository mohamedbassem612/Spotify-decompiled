package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTimeInterval<T> extends AbstractObservableWithUpstream<T, Timed<T>> {
    public final Scheduler b;
    public final TimeUnit c;

    public static final class TimeIntervalObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final TimeUnit b;
        public final Scheduler c;
        public long d;
        public Disposable e;

        public TimeIntervalObserver(Observer observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.a = observer;
            this.c = scheduler;
            this.b = timeUnit;
        }

        public void dispose() {
            this.e.dispose();
        }

        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.c.getClass();
            TimeUnit timeUnit = this.b;
            long jA = Scheduler.a(timeUnit);
            long j = this.d;
            this.d = jA;
            this.a.onNext(new Timed(obj, jA - j, timeUnit));
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.c.getClass();
                this.d = Scheduler.a(this.b);
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableTimeInterval(Observable observable, TimeUnit timeUnit, Scheduler scheduler) {
        super(observable);
        this.b = scheduler;
        this.c = timeUnit;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new TimeIntervalObserver(observer, this.c, this.b));
    }
}
