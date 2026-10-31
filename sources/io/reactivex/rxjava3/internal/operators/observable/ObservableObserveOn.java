package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.internal.schedulers.TrampolineScheduler;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableObserveOn<T> extends AbstractObservableWithUpstream<T, T> {
    public final Scheduler b;
    public final boolean c;
    public final int d;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T>, Runnable {
        public boolean X;
        public final Observer a;
        public final Scheduler.Worker b;
        public final boolean c;
        public final int d;
        public SimpleQueue e;
        public Disposable f;
        public Throwable g;
        public volatile boolean h;
        public volatile boolean i;
        public int t;

        public ObserveOnObserver(Observer observer, Scheduler.Worker worker, boolean z, int i) {
            this.a = observer;
            this.b = worker;
            this.c = z;
            this.d = i;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            this.X = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, Observer observer) {
            if (this.i) {
                this.e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.g;
            if (this.c) {
                if (!z2) {
                    return false;
                }
                this.i = true;
                if (th != null) {
                    observer.onError(th);
                } else {
                    observer.onComplete();
                }
                this.b.dispose();
                return true;
            }
            if (th != null) {
                this.i = true;
                this.e.clear();
                observer.onError(th);
                this.b.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.i = true;
            observer.onComplete();
            this.b.dispose();
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.dispose();
            this.b.dispose();
            if (this.X || getAndIncrement() != 0) {
                return;
            }
            this.e.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            if (getAndIncrement() == 0) {
                this.b.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.g = th;
            this.h = true;
            if (getAndIncrement() == 0) {
                this.b.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            if (this.t != 2) {
                this.e.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.b.a(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.f, disposable)) {
                this.f = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int iA = queueDisposable.a(7);
                    if (iA == 1) {
                        this.t = iA;
                        this.e = queueDisposable;
                        this.h = true;
                        this.a.onSubscribe(this);
                        if (getAndIncrement() == 0) {
                            this.b.a(this);
                            return;
                        }
                        return;
                    }
                    if (iA == 2) {
                        this.t = iA;
                        this.e = queueDisposable;
                        this.a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new SpscLinkedArrayQueue(this.d);
                this.a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return this.e.poll();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            if (!this.X) {
                SimpleQueue simpleQueue = this.e;
                Observer observer = this.a;
                int iAddAndGet = 1;
                while (!b(this.h, simpleQueue.isEmpty(), observer)) {
                    while (true) {
                        boolean z = this.h;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z2 = objPoll == null;
                            if (b(z, z2, observer)) {
                                return;
                            }
                            if (z2) {
                                break;
                            } else {
                                observer.onNext(objPoll);
                            }
                        } catch (Throwable th) {
                            Exceptions.a(th);
                            this.i = true;
                            this.f.dispose();
                            simpleQueue.clear();
                            observer.onError(th);
                            this.b.dispose();
                            return;
                        }
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            int iAddAndGet2 = 1;
            while (!this.i) {
                boolean z3 = this.h;
                Throwable th2 = this.g;
                if (!this.c && z3 && th2 != null) {
                    this.i = true;
                    this.a.onError(this.g);
                    this.b.dispose();
                    return;
                }
                this.a.onNext(null);
                if (z3) {
                    this.i = true;
                    Throwable th3 = this.g;
                    Observer observer2 = this.a;
                    if (th3 != null) {
                        observer2.onError(th3);
                    } else {
                        observer2.onComplete();
                    }
                    this.b.dispose();
                    return;
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public ObservableObserveOn(Observable observable, Scheduler scheduler, boolean z, int i) {
        super(observable);
        this.b = scheduler;
        this.c = z;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Scheduler scheduler = this.b;
        boolean z = scheduler instanceof TrampolineScheduler;
        ObservableSource observableSource = this.a;
        if (z) {
            observableSource.subscribe(observer);
        } else {
            observableSource.subscribe(new ObserveOnObserver(observer, scheduler.b(), this.c, this.d));
        }
    }
}
