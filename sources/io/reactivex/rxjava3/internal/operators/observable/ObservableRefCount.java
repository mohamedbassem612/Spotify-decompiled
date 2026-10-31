package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableRefCount<T> extends Observable<T> {
    public final ConnectableObservable a;
    public final boolean b = true;
    public final byte c;
    public final TimeUnit d;
    public final Scheduler e;
    public RefConnection f;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        public final ObservableRefCount a;
        public SequentialDisposable b;
        public long c;
        public boolean d;
        public boolean e;

        public RefConnection(ObservableRefCount observableRefCount) {
            this.a = observableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.c(this, (Disposable) obj);
            synchronized (this.a) {
                try {
                    if (this.e) {
                        this.a.a.g();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.c(this);
        }
    }

    public static final class RefCountObserver<T> extends AtomicBoolean implements Observer<T>, Disposable {
        public final Observer a;
        public final ObservableRefCount b;
        public final RefConnection c;
        public Disposable d;

        public RefCountObserver(Observer observer, ObservableRefCount observableRefCount, RefConnection refConnection) {
            this.a = observer;
            this.b = observableRefCount;
            this.c = refConnection;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.d.dispose();
            if (compareAndSet(false, true)) {
                ObservableRefCount observableRefCount = this.b;
                RefConnection refConnection = this.c;
                synchronized (observableRefCount) {
                    try {
                        RefConnection refConnection2 = observableRefCount.f;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.c - 1;
                            refConnection.c = j;
                            if (j == 0 && refConnection.d) {
                                if (observableRefCount.c == 0) {
                                    observableRefCount.c(refConnection);
                                    return;
                                }
                                SequentialDisposable sequentialDisposable = new SequentialDisposable();
                                refConnection.b = sequentialDisposable;
                                DisposableHelper.c(sequentialDisposable, observableRefCount.e.d(refConnection, observableRefCount.c, observableRefCount.d));
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.b.a(this.c);
                this.a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.b(th);
            } else {
                this.b.a(this.c);
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [byte, int] */
    public ObservableRefCount(ConnectableObservable connectableObservable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.a = connectableObservable;
        this.c = (int) j;
        this.d = timeUnit;
        this.e = scheduler;
    }

    public final void a(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.f == refConnection) {
                    SequentialDisposable sequentialDisposable = refConnection.b;
                    if (sequentialDisposable != null) {
                        sequentialDisposable.dispose();
                        refConnection.b = null;
                    }
                    long j = refConnection.c - 1;
                    refConnection.c = j;
                    if (j == 0) {
                        this.f = null;
                        this.a.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.c == 0 && refConnection == this.f) {
                    this.f = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.a(refConnection);
                    if (disposable == null) {
                        refConnection.e = true;
                    } else {
                        this.a.g();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        RefConnection refConnection;
        boolean z;
        SequentialDisposable sequentialDisposable;
        synchronized (this) {
            try {
                refConnection = this.f;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f = refConnection;
                }
                long j = refConnection.c;
                if (j == 0 && (sequentialDisposable = refConnection.b) != null) {
                    sequentialDisposable.dispose();
                }
                long j2 = j + 1;
                refConnection.c = j2;
                if (refConnection.d || j2 != (this.b ? 1L : 0L)) {
                    z = false;
                } else {
                    z = true;
                    refConnection.d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.subscribe(new RefCountObserver(observer, this, refConnection));
        if (z) {
            this.a.c(refConnection);
        }
    }
}
