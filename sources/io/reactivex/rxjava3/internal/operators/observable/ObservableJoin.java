package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {
    public final ObservableSource b;
    public final Function c;
    public final Function d;
    public final BiFunction e;

    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, ObservableGroupJoin.JoinSupport {
        public int X;
        public int Y;
        public volatile boolean Z;
        public final Observer a;
        public final Function g;
        public final Function h;
        public final BiFunction i;
        public final CompositeDisposable c = new CompositeDisposable();
        public final SpscLinkedArrayQueue b = new SpscLinkedArrayQueue(Observable.bufferSize());
        public final LinkedHashMap d = new LinkedHashMap();
        public final LinkedHashMap e = new LinkedHashMap();
        public final AtomicReference f = new AtomicReference();
        public final AtomicInteger t = new AtomicInteger(2);

        public JoinDisposable(Observer observer, Function function, Function function2, BiFunction biFunction) {
            this.a = observer;
            this.g = function;
            this.h = function2;
            this.i = biFunction;
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void a(Throwable th) {
            if (!ExceptionHelper.a(this.f, th)) {
                RxJavaPlugins.b(th);
            } else {
                this.t.decrementAndGet();
                h();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void b(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.c.c(leftRightObserver);
            this.t.decrementAndGet();
            h();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void c(Throwable th) {
            if (ExceptionHelper.a(this.f, th)) {
                h();
            } else {
                RxJavaPlugins.b(th);
            }
        }

        public void dispose() {
            if (this.Z) {
                return;
            }
            this.Z = true;
            this.c.dispose();
            if (getAndIncrement() == 0) {
                this.b.clear();
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void f(boolean z, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                try {
                    this.b.b(z ? 3 : 4, leftRightEndObserver);
                } catch (Throwable th) {
                    throw th;
                }
            }
            h();
        }

        @Override // io.reactivex.rxjava3.internal.operators.observable.ObservableGroupJoin.JoinSupport
        public final void g(Object obj, boolean z) {
            synchronized (this) {
                try {
                    this.b.b(z ? 1 : 2, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            h();
        }

        public final void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue = this.b;
            Observer observer = this.a;
            int iAddAndGet = 1;
            while (!this.Z) {
                if (((Throwable) this.f.get()) != null) {
                    spscLinkedArrayQueue.clear();
                    this.c.dispose();
                    i(observer);
                    return;
                }
                boolean z = this.t.get() == 0;
                Integer num = (Integer) spscLinkedArrayQueue.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.d.clear();
                    this.e.clear();
                    this.c.dispose();
                    observer.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = spscLinkedArrayQueue.poll();
                    if (num == 1) {
                        int i = this.X;
                        this.X = i + 1;
                        this.d.put(Integer.valueOf(i), objPoll);
                        try {
                            Object objApply = this.g.apply(objPoll);
                            Objects.requireNonNull(objApply, "The leftEnd returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new ObservableGroupJoin.LeftRightEndObserver(this, true, i);
                            this.c.b(leftRightEndObserver);
                            observableSource.subscribe(leftRightEndObserver);
                            if (((Throwable) this.f.get()) != null) {
                                spscLinkedArrayQueue.clear();
                                this.c.dispose();
                                i(observer);
                                return;
                            }
                            Iterator it = this.e.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    Object objApply2 = this.i.apply(objPoll, it.next());
                                    Objects.requireNonNull(objApply2, "The resultSelector returned a null value");
                                    observer.onNext(objApply2);
                                } catch (Throwable th) {
                                    j(th, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            j(th2, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == 2) {
                        int i2 = this.Y;
                        this.Y = i2 + 1;
                        this.e.put(Integer.valueOf(i2), objPoll);
                        try {
                            Object objApply3 = this.h.apply(objPoll);
                            Objects.requireNonNull(objApply3, "The rightEnd returned a null ObservableSource");
                            ObservableSource observableSource2 = (ObservableSource) objApply3;
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new ObservableGroupJoin.LeftRightEndObserver(this, false, i2);
                            this.c.b(leftRightEndObserver2);
                            observableSource2.subscribe(leftRightEndObserver2);
                            if (((Throwable) this.f.get()) != null) {
                                spscLinkedArrayQueue.clear();
                                this.c.dispose();
                                i(observer);
                                return;
                            }
                            Iterator it2 = this.d.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    Object objApply4 = this.i.apply(it2.next(), objPoll);
                                    Objects.requireNonNull(objApply4, "The resultSelector returned a null value");
                                    observer.onNext(objApply4);
                                } catch (Throwable th3) {
                                    j(th3, observer, spscLinkedArrayQueue);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            j(th4, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == 3) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.d.remove(Integer.valueOf(leftRightEndObserver3.c));
                        this.c.a(leftRightEndObserver3);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.e.remove(Integer.valueOf(leftRightEndObserver4.c));
                        this.c.a(leftRightEndObserver4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void i(Observer observer) {
            Throwable thD = ExceptionHelper.d(this.f);
            this.d.clear();
            this.e.clear();
            observer.onError(thD);
        }

        public boolean isDisposed() {
            return this.Z;
        }

        public final void j(Throwable th, Observer observer, SpscLinkedArrayQueue spscLinkedArrayQueue) {
            Exceptions.a(th);
            ExceptionHelper.a(this.f, th);
            spscLinkedArrayQueue.clear();
            this.c.dispose();
            i(observer);
        }
    }

    public ObservableJoin(Observable observable, ObservableSource observableSource, Function function, Function function2, BiFunction biFunction) {
        super(observable);
        this.b = observableSource;
        this.c = function;
        this.d = function2;
        this.e = biFunction;
    }

    public final void subscribeActual(Observer observer) {
        JoinDisposable joinDisposable = new JoinDisposable(observer, this.c, this.d, this.e);
        observer.onSubscribe(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        CompositeDisposable compositeDisposable = joinDisposable.c;
        compositeDisposable.b(leftRightObserver);
        ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new ObservableGroupJoin.LeftRightObserver(joinDisposable, false);
        compositeDisposable.b(leftRightObserver2);
        ((AbstractObservableWithUpstream) this).a.subscribe(leftRightObserver);
        this.b.subscribe(leftRightObserver2);
    }
}
