package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableIntervalRange extends Observable<Long> {
    public final Scheduler a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final TimeUnit f;

    public static final class IntervalRangeObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer a;
        public final long b;
        public long c;

        public IntervalRangeObserver(Observer observer, long j, long j2) {
            this.a = observer;
            this.c = j;
            this.b = j2;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return get() == DisposableHelper.a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            long j = this.c;
            Long lValueOf = Long.valueOf(j);
            Observer observer = this.a;
            observer.onNext(lValueOf);
            if (j != this.b) {
                this.c = j + 1;
                return;
            }
            if (!isDisposed()) {
                observer.onComplete();
            }
            DisposableHelper.a(this);
        }
    }

    public ObservableIntervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, Scheduler scheduler) {
        this.d = j3;
        this.e = j4;
        this.f = timeUnit;
        this.a = scheduler;
        this.b = j;
        this.c = j2;
    }

    public final void subscribeActual(Observer observer) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(observer, this.b, this.c);
        observer.onSubscribe(intervalRangeObserver);
        Scheduler scheduler = this.a;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.g(intervalRangeObserver, scheduler.e(intervalRangeObserver, this.d, this.e, this.f));
        } else {
            Scheduler.Worker workerB = scheduler.b();
            DisposableHelper.g(intervalRangeObserver, workerB);
            workerB.c(intervalRangeObserver, this.d, this.e, this.f);
        }
    }
}
