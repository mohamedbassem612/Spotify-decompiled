package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableConcatMapCompletable<T> extends Completable {
    public final Observable a;
    public final Function b;
    public final ErrorMode c;
    public final int d;

    public static final class ConcatMapCompletableObserver<T> extends ConcatMapXMainObserver<T> {
        public volatile boolean X;
        public final CompletableObserver h;
        public final Function i;
        public final ConcatMapInnerObserver t;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final ConcatMapCompletableObserver a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.a;
                concatMapCompletableObserver.X = false;
                concatMapCompletableObserver.c();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.a;
                if (concatMapCompletableObserver.a.a(th)) {
                    if (concatMapCompletableObserver.c != ErrorMode.c) {
                        concatMapCompletableObserver.e.dispose();
                    }
                    concatMapCompletableObserver.X = false;
                    concatMapCompletableObserver.c();
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver, Function function, ErrorMode errorMode, int i) {
            super(i, errorMode);
            this.h = completableObserver;
            this.i = function;
            this.t = new ConcatMapInnerObserver(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        public final void b() {
            ConcatMapInnerObserver concatMapInnerObserver = this.t;
            concatMapInnerObserver.getClass();
            DisposableHelper.a(concatMapInnerObserver);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        public final void c() {
            CompletableSource completableSource;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.a;
            ErrorMode errorMode = this.c;
            SimpleQueue simpleQueue = this.d;
            while (!this.g) {
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.a || (errorMode == ErrorMode.b && !this.X))) {
                    this.g = true;
                    simpleQueue.clear();
                    atomicThrowable.c(this.h);
                    return;
                }
                if (!this.X) {
                    boolean z2 = this.f;
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (objPoll != null) {
                            Object objApply = this.i.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                            completableSource = (CompletableSource) objApply;
                            z = false;
                        } else {
                            completableSource = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.g = true;
                            atomicThrowable.c(this.h);
                            return;
                        } else if (!z) {
                            this.X = true;
                            completableSource.subscribe(this.t);
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.g = true;
                        simpleQueue.clear();
                        this.e.dispose();
                        atomicThrowable.a(th);
                        atomicThrowable.c(this.h);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainObserver
        public final void f() {
            this.h.onSubscribe(this);
        }
    }

    public ObservableConcatMapCompletable(Observable observable, Function function, ErrorMode errorMode, int i) {
        this.a = observable;
        this.b = function;
        this.c = errorMode;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        Observable observable = this.a;
        Function function = this.b;
        if (ScalarXMapZHelper.a(observable, function, completableObserver)) {
            return;
        }
        observable.subscribe(new ConcatMapCompletableObserver(completableObserver, function, this.c, this.d));
    }
}
