package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableTakeLastTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final long c;
    public final TimeUnit d;
    public final Scheduler e;
    public final int f;
    public final boolean g;

    public static final class TakeLastTimedObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer a;
        public final long b;
        public final long c;
        public final TimeUnit d;
        public final Scheduler e;
        public final SpscLinkedArrayQueue f;
        public final boolean g;
        public Disposable h;
        public volatile boolean i;
        public Throwable t;

        public TakeLastTimedObserver(int i, long j, long j2, Observer observer, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = j2;
            this.d = timeUnit;
            this.e = scheduler;
            this.f = new SpscLinkedArrayQueue(i);
            this.g = z;
        }

        public final void a() {
            Throwable th;
            if (compareAndSet(false, true)) {
                Observer observer = this.a;
                SpscLinkedArrayQueue spscLinkedArrayQueue = this.f;
                boolean z = this.g;
                Scheduler scheduler = this.e;
                TimeUnit timeUnit = this.d;
                scheduler.getClass();
                long jA = Scheduler.a(timeUnit) - this.c;
                while (!this.i) {
                    if (!z && (th = this.t) != null) {
                        spscLinkedArrayQueue.clear();
                        observer.onError(th);
                        return;
                    }
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (objPoll == null) {
                        Throwable th2 = this.t;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                    Object objPoll2 = spscLinkedArrayQueue.poll();
                    if (((Long) objPoll).longValue() >= jA) {
                        observer.onNext(objPoll2);
                    }
                }
                spscLinkedArrayQueue.clear();
            }
        }

        public void dispose() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.h.dispose();
            if (compareAndSet(false, true)) {
                this.f.clear();
            }
        }

        public boolean isDisposed() {
            return this.i;
        }

        public final void onComplete() {
            a();
        }

        public final void onError(Throwable th) {
            this.t = th;
            a();
        }

        public final void onNext(Object obj) {
            long j;
            long j2;
            this.e.getClass();
            long jA = Scheduler.a(this.d);
            long j3 = this.b;
            boolean z = j3 == Long.MAX_VALUE;
            Long lValueOf = Long.valueOf(jA);
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.f;
            spscLinkedArrayQueue.b(lValueOf, obj);
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.c()).longValue() > jA - this.c) {
                    if (z) {
                        return;
                    }
                    AtomicLong atomicLong = spscLinkedArrayQueue.h;
                    long j4 = atomicLong.get();
                    while (true) {
                        j = spscLinkedArrayQueue.a.get();
                        j2 = atomicLong.get();
                        if (j4 == j2) {
                            break;
                        } else {
                            j4 = j2;
                        }
                    }
                    if ((((int) (j - j2)) >> 1) <= j3) {
                        return;
                    }
                }
                spscLinkedArrayQueue.poll();
                spscLinkedArrayQueue.poll();
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.h, disposable)) {
                this.h = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableTakeLastTimed(Observable observable, long j, long j2, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
        super(observable);
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = i;
        this.g = z;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new TakeLastTimedObserver(this.f, this.b, this.c, observer, this.e, this.d, this.g));
    }
}
