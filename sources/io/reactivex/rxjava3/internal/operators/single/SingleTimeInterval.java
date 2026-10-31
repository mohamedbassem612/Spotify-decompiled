package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleTimeInterval<T> extends Single<Timed<T>> {
    public final Single a;
    public final TimeUnit b;
    public final Scheduler c;
    public final boolean d;

    public static final class TimeIntervalSingleObserver<T> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final TimeUnit b;
        public final Scheduler c;
        public final long d;
        public Disposable e;

        public TimeIntervalSingleObserver(SingleObserver singleObserver, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            long jA;
            this.a = singleObserver;
            this.b = timeUnit;
            this.c = scheduler;
            if (z) {
                scheduler.getClass();
                jA = Scheduler.a(timeUnit);
            } else {
                jA = 0;
            }
            this.d = jA;
        }

        public void dispose() {
            this.e.dispose();
        }

        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.c.getClass();
            TimeUnit timeUnit = this.b;
            this.a.onSuccess(new Timed(obj, Scheduler.a(timeUnit) - this.d, timeUnit));
        }
    }

    public SingleTimeInterval(Single single, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.a = single;
        this.b = timeUnit;
        this.c = scheduler;
        this.d = z;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new TimeIntervalSingleObserver(singleObserver, this.b, this.c, this.d));
    }
}
