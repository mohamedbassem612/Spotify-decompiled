package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableInterval extends Observable<Long> {
    public final Scheduler a;
    public final long b;
    public final long c;
    public final TimeUnit d;

    public static final class IntervalObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer a;
        public long b;

        public IntervalObserver(Observer observer) {
            this.a = observer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == DisposableHelper.a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != DisposableHelper.a) {
                long j = this.b;
                this.b = 1 + j;
                this.a.onNext(Long.valueOf(j));
            }
        }
    }

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super Long> observer) {
        IntervalObserver intervalObserver = new IntervalObserver(observer);
        observer.onSubscribe(intervalObserver);
        Scheduler scheduler = this.a;
        if (!(scheduler instanceof TrampolineScheduler)) {
            DisposableHelper.g(intervalObserver, scheduler.e(intervalObserver, this.b, this.c, this.d));
        } else {
            Scheduler.Worker workerB = scheduler.b();
            DisposableHelper.g(intervalObserver, workerB);
            workerB.c(intervalObserver, this.b, this.c, this.d);
        }
    }
}
