package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p.fey;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {
    public final FlowableObserveOn a;
    public final fey b;
    public final ErrorMode c = ErrorMode.a;
    public final byte d = 2;

    public static final class ConcatMapCompletableObserver<T> extends ConcatMapXMainSubscriber<T> implements Disposable {
        public final ConcatMapInnerObserver X;
        public volatile boolean Y;
        public int Z;
        public final CompletableObserver i;
        public final Function t;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            public final ConcatMapCompletableObserver a;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver concatMapCompletableObserver) {
                this.a = concatMapCompletableObserver;
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onComplete() {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.a;
                concatMapCompletableObserver.Y = false;
                concatMapCompletableObserver.c();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onError(Throwable th) {
                ConcatMapCompletableObserver concatMapCompletableObserver = this.a;
                if (concatMapCompletableObserver.a.a(th)) {
                    if (concatMapCompletableObserver.c != ErrorMode.a) {
                        concatMapCompletableObserver.Y = false;
                        concatMapCompletableObserver.c();
                        return;
                    }
                    concatMapCompletableObserver.e.cancel();
                    concatMapCompletableObserver.a.c(concatMapCompletableObserver.i);
                    if (concatMapCompletableObserver.getAndIncrement() == 0) {
                        concatMapCompletableObserver.d.clear();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver, fey feyVar, ErrorMode errorMode, int i) {
            super(i, errorMode);
            this.i = completableObserver;
            this.t = feyVar;
            this.X = new ConcatMapInnerObserver(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public final void b() {
            ConcatMapInnerObserver concatMapInnerObserver = this.X;
            concatMapInnerObserver.getClass();
            DisposableHelper.a(concatMapInnerObserver);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ErrorMode errorMode = this.c;
            SimpleQueue simpleQueue = this.d;
            AtomicThrowable atomicThrowable = this.a;
            boolean z = this.h;
            while (!this.g) {
                if (atomicThrowable.get() != null && (errorMode == ErrorMode.a || (errorMode == ErrorMode.b && !this.Y))) {
                    simpleQueue.clear();
                    atomicThrowable.c(this.i);
                    return;
                }
                if (!this.Y) {
                    boolean z2 = this.f;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z3 = objPoll == null;
                        if (z2 && z3) {
                            atomicThrowable.c(this.i);
                            return;
                        }
                        if (!z3) {
                            int i = this.b;
                            int i2 = i - (i >> 1);
                            if (!z) {
                                int i3 = this.Z + 1;
                                if (i3 == i2) {
                                    this.Z = 0;
                                    this.e.request(i2);
                                } else {
                                    this.Z = i3;
                                }
                            }
                            try {
                                Object objApply = this.t.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                                CompletableSource completableSource = (CompletableSource) objApply;
                                this.Y = true;
                                completableSource.subscribe(this.X);
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                simpleQueue.clear();
                                this.e.cancel();
                                atomicThrowable.a(th);
                                atomicThrowable.c(this.i);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        this.e.cancel();
                        atomicThrowable.a(th2);
                        atomicThrowable.c(this.i);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            simpleQueue.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            h();
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        public final void g() {
            this.i.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.g;
        }
    }

    public FlowableConcatMapCompletable(FlowableObserveOn flowableObserveOn, fey feyVar) {
        this.a = flowableObserveOn;
        this.b = feyVar;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe((FlowableSubscriber) new ConcatMapCompletableObserver(completableObserver, this.b, this.c, this.d));
    }
}
