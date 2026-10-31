package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSkipLastTimed<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final TimeUnit c;
    public final Scheduler d;
    public final int e;
    public final boolean f;

    public static final class SkipLastTimedObserver<T> extends AtomicInteger implements Observer<T>, Disposable {
        public final Observer a;
        public final long b;
        public final TimeUnit c;
        public final Scheduler d;
        public final SpscLinkedArrayQueue e;
        public final boolean f;
        public Disposable g;
        public volatile boolean h;
        public volatile boolean i;
        public Throwable t;

        public SkipLastTimedObserver(Observer observer, long j, TimeUnit timeUnit, Scheduler scheduler, int i, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = timeUnit;
            this.d = scheduler;
            this.e = new SpscLinkedArrayQueue(i);
            this.f = z;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.a;
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.e;
            boolean z = this.f;
            TimeUnit timeUnit = this.c;
            Scheduler scheduler = this.d;
            long j = this.b;
            int iAddAndGet = 1;
            while (!this.h) {
                boolean z2 = this.i;
                Long l = (Long) spscLinkedArrayQueue.c();
                boolean z3 = l == null;
                scheduler.getClass();
                long jA = Scheduler.a(timeUnit);
                if (!z3 && l.longValue() > jA - j) {
                    z3 = true;
                }
                if (z2) {
                    if (!z) {
                        Throwable th = this.t;
                        if (th != null) {
                            this.e.clear();
                            observer.onError(th);
                            return;
                        } else if (z3) {
                            observer.onComplete();
                            return;
                        }
                    } else if (z3) {
                        Throwable th2 = this.t;
                        if (th2 != null) {
                            observer.onError(th2);
                            return;
                        } else {
                            observer.onComplete();
                            return;
                        }
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    spscLinkedArrayQueue.poll();
                    observer.onNext(spscLinkedArrayQueue.poll());
                }
            }
            this.e.clear();
        }

        public void dispose() {
            if (this.h) {
                return;
            }
            this.h = true;
            this.g.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        public boolean isDisposed() {
            return this.h;
        }

        public final void onComplete() {
            this.i = true;
            a();
        }

        public final void onError(Throwable th) {
            this.t = th;
            this.i = true;
            a();
        }

        public final void onNext(Object obj) {
            this.d.getClass();
            this.e.b(Long.valueOf(Scheduler.a(this.c)), obj);
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.g, disposable)) {
                this.g = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLastTimed(int i, long j, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        super(observable);
        this.b = j;
        this.c = timeUnit;
        this.d = scheduler;
        this.e = i;
        this.f = z;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new SkipLastTimedObserver(observer, this.b, this.c, this.d, this.e, this.f));
    }
}
