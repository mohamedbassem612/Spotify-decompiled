package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subjects.UnicastSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableGroupJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractObservableWithUpstream<TLeft, R> {
    public final ObservableSource b;
    public final Function c;
    public final Function d;
    public final BiFunction e;

    public static final class GroupJoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements Disposable, JoinSupport {
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

        public GroupJoinDisposable(Observer observer, Function function, Function function2, BiFunction biFunction) {
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
        public final void b(LeftRightObserver leftRightObserver) {
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
        public final void f(boolean z, LeftRightEndObserver leftRightEndObserver) {
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
                    Iterator it = this.d.values().iterator();
                    while (it.hasNext()) {
                        ((UnicastSubject) it.next()).onComplete();
                    }
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
                        UnicastSubject unicastSubject = new UnicastSubject(Observable.bufferSize(), null);
                        int i = this.X;
                        this.X = i + 1;
                        this.d.put(Integer.valueOf(i), unicastSubject);
                        try {
                            Object objApply = this.g.apply(objPoll);
                            Objects.requireNonNull(objApply, "The leftEnd returned a null ObservableSource");
                            ObservableSource observableSource = (ObservableSource) objApply;
                            LeftRightEndObserver leftRightEndObserver = new LeftRightEndObserver(this, true, i);
                            this.c.b(leftRightEndObserver);
                            observableSource.subscribe(leftRightEndObserver);
                            if (((Throwable) this.f.get()) != null) {
                                spscLinkedArrayQueue.clear();
                                this.c.dispose();
                                i(observer);
                                return;
                            }
                            try {
                                Object objApply2 = this.i.apply(objPoll, unicastSubject);
                                Objects.requireNonNull(objApply2, "The resultSelector returned a null value");
                                observer.onNext(objApply2);
                                Iterator it2 = this.e.values().iterator();
                                while (it2.hasNext()) {
                                    unicastSubject.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                j(th, observer, spscLinkedArrayQueue);
                                return;
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
                            LeftRightEndObserver leftRightEndObserver2 = new LeftRightEndObserver(this, false, i2);
                            this.c.b(leftRightEndObserver2);
                            observableSource2.subscribe(leftRightEndObserver2);
                            if (((Throwable) this.f.get()) != null) {
                                spscLinkedArrayQueue.clear();
                                this.c.dispose();
                                i(observer);
                                return;
                            } else {
                                Iterator it3 = this.d.values().iterator();
                                while (it3.hasNext()) {
                                    ((UnicastSubject) it3.next()).onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            j(th3, observer, spscLinkedArrayQueue);
                            return;
                        }
                    } else if (num == 3) {
                        LeftRightEndObserver leftRightEndObserver3 = (LeftRightEndObserver) objPoll;
                        UnicastSubject unicastSubject2 = (UnicastSubject) this.d.remove(Integer.valueOf(leftRightEndObserver3.c));
                        this.c.a(leftRightEndObserver3);
                        if (unicastSubject2 != null) {
                            unicastSubject2.onComplete();
                        }
                    } else {
                        LeftRightEndObserver leftRightEndObserver4 = (LeftRightEndObserver) objPoll;
                        this.e.remove(Integer.valueOf(leftRightEndObserver4.c));
                        this.c.a(leftRightEndObserver4);
                    }
                }
            }
            spscLinkedArrayQueue.clear();
        }

        public final void i(Observer observer) {
            Throwable thD = ExceptionHelper.d(this.f);
            LinkedHashMap linkedHashMap = this.d;
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((UnicastSubject) it.next()).onError(thD);
            }
            linkedHashMap.clear();
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

    public interface JoinSupport {
        void a(Throwable th);

        void b(LeftRightObserver leftRightObserver);

        void c(Throwable th);

        void f(boolean z, LeftRightEndObserver leftRightEndObserver);

        void g(Object obj, boolean z);
    }

    public static final class LeftRightEndObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        public final JoinSupport a;
        public final boolean b;
        public final int c;

        public LeftRightEndObserver(JoinSupport joinSupport, boolean z, int i) {
            this.a = joinSupport;
            this.b = z;
            this.c = i;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.a.f(this.b, this);
        }

        public final void onError(Throwable th) {
            this.a.c(th);
        }

        public final void onNext(Object obj) {
            if (DisposableHelper.a(this)) {
                this.a.f(this.b, this);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public static final class LeftRightObserver extends AtomicReference<Disposable> implements Observer<Object>, Disposable {
        public final JoinSupport a;
        public final boolean b;

        public LeftRightObserver(JoinSupport joinSupport, boolean z) {
            this.a = joinSupport;
            this.b = z;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.a.b(this);
        }

        public final void onError(Throwable th) {
            this.a.a(th);
        }

        public final void onNext(Object obj) {
            this.a.g(obj, this.b);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }
    }

    public ObservableGroupJoin(Observable observable, ObservableSource observableSource, Function function, Function function2, BiFunction biFunction) {
        super(observable);
        this.b = observableSource;
        this.c = function;
        this.d = function2;
        this.e = biFunction;
    }

    public final void subscribeActual(Observer observer) {
        GroupJoinDisposable groupJoinDisposable = new GroupJoinDisposable(observer, this.c, this.d, this.e);
        observer.onSubscribe(groupJoinDisposable);
        LeftRightObserver leftRightObserver = new LeftRightObserver(groupJoinDisposable, true);
        CompositeDisposable compositeDisposable = groupJoinDisposable.c;
        compositeDisposable.b(leftRightObserver);
        LeftRightObserver leftRightObserver2 = new LeftRightObserver(groupJoinDisposable, false);
        compositeDisposable.b(leftRightObserver2);
        ((AbstractObservableWithUpstream) this).a.subscribe(leftRightObserver);
        this.b.subscribe(leftRightObserver2);
    }
}
