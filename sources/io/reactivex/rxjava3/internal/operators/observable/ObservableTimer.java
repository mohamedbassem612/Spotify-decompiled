package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p.hrt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableTimer extends Observable<Long> {
    public final Scheduler a;
    public final long b;
    public final TimeUnit c;

    public static final class TimerObserver extends AtomicReference<Disposable> implements Disposable, Runnable {
        public final Observer a;

        public TimerObserver(Observer observer) {
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
            if (isDisposed()) {
                return;
            }
            Observer observer = this.a;
            observer.onNext(0L);
            lazySet(EmptyDisposable.a);
            observer.onComplete();
        }
    }

    public ObservableTimer(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.b = j;
        this.c = timeUnit;
        this.a = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer<? super Long> observer) {
        TimerObserver timerObserver = new TimerObserver(observer);
        observer.onSubscribe(timerObserver);
        Disposable disposableD = this.a.d(timerObserver, this.b, this.c);
        if (hrt.r(timerObserver, disposableD) || timerObserver.get() != DisposableHelper.a) {
            return;
        }
        disposableD.dispose();
    }
}
