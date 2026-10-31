package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableConcatMapMaybe<T, R> extends Observable<R> {
    public final Observable a;
    public final Function b;
    public final ErrorMode c;
    public final int d;

    public static final class ConcatMapMaybeMainObserver<T, R> extends ConcatMapXMainObserver<T> {
        public Object X;
        public volatile byte Y;
        public final Observer h;
        public final Function i;
        public final ConcatMapMaybeObserver t;

        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            public final ConcatMapMaybeMainObserver a;

            public ConcatMapMaybeObserver(ConcatMapMaybeMainObserver concatMapMaybeMainObserver) {
                this.a = concatMapMaybeMainObserver;
            }

            public final void onComplete() {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.a;
                concatMapMaybeMainObserver.Y = (byte) 0;
                concatMapMaybeMainObserver.c();
            }

            public final void onError(Throwable th) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.a;
                if (((ConcatMapXMainObserver) concatMapMaybeMainObserver).a.a(th)) {
                    if (((ConcatMapXMainObserver) concatMapMaybeMainObserver).c != ErrorMode.c) {
                        ((ConcatMapXMainObserver) concatMapMaybeMainObserver).e.dispose();
                    }
                    concatMapMaybeMainObserver.Y = (byte) 0;
                    concatMapMaybeMainObserver.c();
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }

            public final void onSuccess(Object obj) {
                ConcatMapMaybeMainObserver concatMapMaybeMainObserver = this.a;
                concatMapMaybeMainObserver.X = obj;
                concatMapMaybeMainObserver.Y = (byte) 2;
                concatMapMaybeMainObserver.c();
            }
        }

        public ConcatMapMaybeMainObserver(Observer observer, Function function, int i, ErrorMode errorMode) {
            super(i, errorMode);
            this.h = observer;
            this.i = function;
            this.t = new ConcatMapMaybeObserver(this);
        }

        public final void a() {
            this.X = null;
        }

        public final void b() {
            ConcatMapMaybeObserver concatMapMaybeObserver = this.t;
            concatMapMaybeObserver.getClass();
            DisposableHelper.a(concatMapMaybeObserver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            Observer observer = this.h;
            ErrorMode errorMode = ((ConcatMapXMainObserver) this).c;
            SimpleQueue simpleQueue = ((ConcatMapXMainObserver) this).d;
            AtomicThrowable atomicThrowable = ((ConcatMapXMainObserver) this).a;
            int iAddAndGet = 1;
            while (true) {
                if (!((ConcatMapXMainObserver) this).g) {
                    byte b = this.Y;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.a || (errorMode == ErrorMode.b && b == 0))) {
                        break;
                    }
                    if (b == 0) {
                        boolean z = ((ConcatMapXMainObserver) this).f;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                atomicThrowable.d(observer);
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.i.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                                    MaybeSource maybeSource = (MaybeSource) objApply;
                                    this.Y = (byte) 1;
                                    maybeSource.subscribe(this.t);
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    ((ConcatMapXMainObserver) this).e.dispose();
                                    simpleQueue.clear();
                                    atomicThrowable.a(th);
                                    atomicThrowable.d(observer);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            ((ConcatMapXMainObserver) this).g = true;
                            ((ConcatMapXMainObserver) this).e.dispose();
                            atomicThrowable.a(th2);
                            atomicThrowable.d(observer);
                            return;
                        }
                    } else if (b == 2) {
                        Object obj = this.X;
                        this.X = null;
                        observer.onNext(obj);
                        this.Y = (byte) 0;
                    }
                } else {
                    simpleQueue.clear();
                    this.X = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simpleQueue.clear();
            this.X = null;
            atomicThrowable.d(observer);
        }

        public final void f() {
            this.h.onSubscribe(this);
        }
    }

    public ObservableConcatMapMaybe(Observable observable, Function function, ErrorMode errorMode, int i) {
        this.a = observable;
        this.b = function;
        this.c = errorMode;
        this.d = i;
    }

    public final void subscribeActual(Observer observer) {
        Observable observable = this.a;
        Function function = this.b;
        if (ScalarXMapZHelper.b(observable, function, observer)) {
            return;
        }
        observable.subscribe(new ConcatMapMaybeMainObserver(observer, function, this.d, this.c));
    }
}
