package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.observers.SerializedObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableConcatMapScheduler<T, U> extends AbstractObservableWithUpstream<T, U> {
    public final Function b;
    public final int c;
    public final ErrorMode d;
    public final Scheduler e;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public volatile boolean X;
        public volatile boolean Y;
        public int Z;
        public final Observer a;
        public final Function b;
        public final int c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final DelayErrorInnerObserver e;
        public final boolean f;
        public final Scheduler.Worker g;
        public SimpleQueue h;
        public Disposable i;
        public volatile boolean t;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<Disposable> implements Observer<R> {
            public final Observer a;
            public final ConcatMapDelayErrorObserver b;

            public DelayErrorInnerObserver(Observer observer, ConcatMapDelayErrorObserver concatMapDelayErrorObserver) {
                this.a = observer;
                this.b = concatMapDelayErrorObserver;
            }

            public final void onComplete() {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.b;
                concatMapDelayErrorObserver.t = false;
                concatMapDelayErrorObserver.a();
            }

            public final void onError(Throwable th) {
                ConcatMapDelayErrorObserver concatMapDelayErrorObserver = this.b;
                if (concatMapDelayErrorObserver.d.a(th)) {
                    if (!concatMapDelayErrorObserver.f) {
                        concatMapDelayErrorObserver.i.dispose();
                    }
                    concatMapDelayErrorObserver.t = false;
                    concatMapDelayErrorObserver.a();
                }
            }

            public final void onNext(Object obj) {
                this.a.onNext(obj);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public ConcatMapDelayErrorObserver(Observer observer, Function function, int i, boolean z, Scheduler.Worker worker) {
            this.a = observer;
            this.b = function;
            this.c = i;
            this.f = z;
            this.e = new DelayErrorInnerObserver(observer, this);
            this.g = worker;
        }

        public final void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.g.a(this);
        }

        public void dispose() {
            this.Y = true;
            this.i.dispose();
            DelayErrorInnerObserver delayErrorInnerObserver = this.e;
            delayErrorInnerObserver.getClass();
            DisposableHelper.a(delayErrorInnerObserver);
            this.g.dispose();
            this.d.b();
        }

        public boolean isDisposed() {
            return this.Y;
        }

        public final void onComplete() {
            this.X = true;
            a();
        }

        public final void onError(Throwable th) {
            if (this.d.a(th)) {
                this.X = true;
                a();
            }
        }

        public final void onNext(Object obj) {
            if (this.Z == 0) {
                this.h.offer(obj);
            }
            a();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.i, disposable)) {
                this.i = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(3);
                    if (iA == 1) {
                        this.Z = iA;
                        this.h = queueDisposable;
                        this.X = true;
                        this.a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iA == 2) {
                        this.Z = iA;
                        this.h = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.h = new SpscLinkedArrayQueue(this.c);
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Observer observer = this.a;
            SimpleQueue simpleQueue = this.h;
            AtomicThrowable atomicThrowable = this.d;
            while (true) {
                if (!this.t) {
                    if (this.Y) {
                        simpleQueue.clear();
                        return;
                    }
                    if (!this.f && ((Throwable) atomicThrowable.get()) != null) {
                        simpleQueue.clear();
                        this.Y = true;
                        atomicThrowable.d(observer);
                        this.g.dispose();
                        return;
                    }
                    boolean z = this.X;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.Y = true;
                            atomicThrowable.d(observer);
                            this.g.dispose();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                Supplier supplier = (ObservableSource) objApply;
                                if (supplier instanceof Supplier) {
                                    try {
                                        Object obj = supplier.get();
                                        if (obj != null && !this.Y) {
                                            observer.onNext(obj);
                                        }
                                    } catch (Throwable th) {
                                        Exceptions.a(th);
                                        atomicThrowable.a(th);
                                    }
                                } else {
                                    this.t = true;
                                    supplier.subscribe(this.e);
                                }
                            } catch (Throwable th2) {
                                Exceptions.a(th2);
                                this.Y = true;
                                this.i.dispose();
                                simpleQueue.clear();
                                atomicThrowable.a(th2);
                                atomicThrowable.d(observer);
                                this.g.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.a(th3);
                        this.Y = true;
                        this.i.dispose();
                        atomicThrowable.a(th3);
                        atomicThrowable.d(observer);
                        this.g.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public static final class ConcatMapObserver<T, U> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        public int X;
        public final SerializedObserver a;
        public final Function b;
        public final InnerObserver c;
        public final int d;
        public final Scheduler.Worker e;
        public SimpleQueue f;
        public Disposable g;
        public volatile boolean h;
        public volatile boolean i;
        public volatile boolean t;

        public static final class InnerObserver<U> extends AtomicReference<Disposable> implements Observer<U> {
            public final SerializedObserver a;
            public final ConcatMapObserver b;

            public InnerObserver(SerializedObserver serializedObserver, ConcatMapObserver concatMapObserver) {
                this.a = serializedObserver;
                this.b = concatMapObserver;
            }

            public final void onComplete() {
                ConcatMapObserver concatMapObserver = this.b;
                concatMapObserver.h = false;
                if (concatMapObserver.getAndIncrement() != 0) {
                    return;
                }
                concatMapObserver.e.a(concatMapObserver);
            }

            public final void onError(Throwable th) {
                this.b.dispose();
                this.a.onError(th);
            }

            public final void onNext(Object obj) {
                this.a.onNext(obj);
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public ConcatMapObserver(SerializedObserver serializedObserver, Function function, int i, Scheduler.Worker worker) {
            this.a = serializedObserver;
            this.b = function;
            this.d = i;
            this.c = new InnerObserver(serializedObserver, this);
            this.e = worker;
        }

        public void dispose() {
            this.i = true;
            InnerObserver innerObserver = this.c;
            innerObserver.getClass();
            DisposableHelper.a(innerObserver);
            this.g.dispose();
            this.e.dispose();
            if (getAndIncrement() == 0) {
                this.f.clear();
            }
        }

        public boolean isDisposed() {
            return this.i;
        }

        public final void onComplete() {
            if (this.t) {
                return;
            }
            this.t = true;
            if (getAndIncrement() != 0) {
                return;
            }
            this.e.a(this);
        }

        public final void onError(Throwable th) {
            if (this.t) {
                RxJavaPlugins.b(th);
                return;
            }
            this.t = true;
            dispose();
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.t) {
                return;
            }
            if (this.X == 0) {
                this.f.offer(obj);
            }
            if (getAndIncrement() != 0) {
                return;
            }
            this.e.a(this);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.g, disposable)) {
                this.g = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(3);
                    if (iA == 1) {
                        this.X = iA;
                        this.f = queueDisposable;
                        this.t = true;
                        this.a.onSubscribe(this);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                        this.e.a(this);
                        return;
                    }
                    if (iA == 2) {
                        this.X = iA;
                        this.f = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.f = new SpscLinkedArrayQueue(this.d);
                this.a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!this.i) {
                if (!this.h) {
                    boolean z = this.t;
                    try {
                        Object objPoll = this.f.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.i = true;
                            this.a.onComplete();
                            this.e.dispose();
                            return;
                        } else if (!z2) {
                            try {
                                Object objApply = this.b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                ObservableSource observableSource = (ObservableSource) objApply;
                                this.h = true;
                                observableSource.subscribe(this.c);
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                dispose();
                                this.f.clear();
                                this.a.onError(th);
                                this.e.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        dispose();
                        this.f.clear();
                        this.a.onError(th2);
                        this.e.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f.clear();
        }
    }

    public ObservableConcatMapScheduler(Observable observable, Function function, int i, ErrorMode errorMode, Scheduler scheduler) {
        super(observable);
        this.b = function;
        this.d = errorMode;
        this.c = Math.max(8, i);
        this.e = scheduler;
    }

    public final void subscribeActual(Observer observer) {
        ErrorMode errorMode = ErrorMode.a;
        Scheduler scheduler = this.e;
        ObservableSource observableSource = ((AbstractObservableWithUpstream) this).a;
        ErrorMode errorMode2 = this.d;
        if (errorMode2 == errorMode) {
            observableSource.subscribe(new ConcatMapObserver(new SerializedObserver(observer), this.b, this.c, scheduler.b()));
        } else {
            observableSource.subscribe(new ConcatMapDelayErrorObserver(observer, this.b, this.c, errorMode2 == ErrorMode.c, scheduler.b()));
        }
    }
}
