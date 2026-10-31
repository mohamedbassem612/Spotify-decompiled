package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {
    public final Flowable b;
    public final Function c;
    public final ErrorMode d;
    public final int e;

    public static final class ConcatMapSingleSubscriber<T, R> extends ConcatMapXMainSubscriber<T> implements pnc1 {
        public int N0;
        public Object O0;
        public volatile byte P0;
        public final AtomicLong X;
        public final ConcatMapSingleObserver Y;
        public long Z;
        public final gnc1 i;
        public final Function t;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {
            public final ConcatMapSingleSubscriber a;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.a = concatMapSingleSubscriber;
            }

            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.a;
                if (((ConcatMapXMainSubscriber) concatMapSingleSubscriber).a.a(th)) {
                    if (((ConcatMapXMainSubscriber) concatMapSingleSubscriber).c != ErrorMode.c) {
                        ((ConcatMapXMainSubscriber) concatMapSingleSubscriber).e.cancel();
                    }
                    concatMapSingleSubscriber.P0 = (byte) 0;
                    concatMapSingleSubscriber.c();
                }
            }

            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.c(this, disposable);
            }

            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.a;
                concatMapSingleSubscriber.O0 = obj;
                concatMapSingleSubscriber.P0 = (byte) 2;
                concatMapSingleSubscriber.c();
            }
        }

        public ConcatMapSingleSubscriber(gnc1 gnc1Var, Function function, int i, ErrorMode errorMode) {
            super(i, errorMode);
            this.i = gnc1Var;
            this.t = function;
            this.X = new AtomicLong();
            this.Y = new ConcatMapSingleObserver(this);
        }

        public final void a() {
            this.O0 = null;
        }

        public final void b() {
            ConcatMapSingleObserver concatMapSingleObserver = this.Y;
            concatMapSingleObserver.getClass();
            DisposableHelper.a(concatMapSingleObserver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void c() {
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.i;
            ErrorMode errorMode = ((ConcatMapXMainSubscriber) this).c;
            SimpleQueue simpleQueue = ((ConcatMapXMainSubscriber) this).d;
            AtomicThrowable atomicThrowable = ((ConcatMapXMainSubscriber) this).a;
            AtomicLong atomicLong = this.X;
            int i = ((ConcatMapXMainSubscriber) this).b;
            int i2 = i - (i >> 1);
            boolean z = ((ConcatMapXMainSubscriber) this).h;
            int iAddAndGet = 1;
            while (true) {
                if (!((ConcatMapXMainSubscriber) this).g) {
                    byte b = this.P0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.a || (errorMode == ErrorMode.b && b == 0))) {
                        break;
                    }
                    if (b == 0) {
                        boolean z2 = ((ConcatMapXMainSubscriber) this).f;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z3 = objPoll == null;
                            if (z2 && z3) {
                                atomicThrowable.e(gnc1Var);
                                return;
                            }
                            if (!z3) {
                                if (!z) {
                                    int i3 = this.N0 + 1;
                                    if (i3 == i2) {
                                        this.N0 = 0;
                                        ((ConcatMapXMainSubscriber) this).e.request(i2);
                                    } else {
                                        this.N0 = i3;
                                    }
                                }
                                try {
                                    Object objApply = this.t.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
                                    SingleSource singleSource = (SingleSource) objApply;
                                    this.P0 = (byte) 1;
                                    singleSource.subscribe(this.Y);
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    ((ConcatMapXMainSubscriber) this).e.cancel();
                                    simpleQueue.clear();
                                    atomicThrowable.a(th);
                                    atomicThrowable.e(gnc1Var);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.a(th2);
                            ((ConcatMapXMainSubscriber) this).e.cancel();
                            atomicThrowable.a(th2);
                            atomicThrowable.e(gnc1Var);
                            return;
                        }
                    } else if (b == 2) {
                        long j = this.Z;
                        if (j != atomicLong.get()) {
                            Object obj = this.O0;
                            this.O0 = null;
                            gnc1Var.onNext(obj);
                            this.Z = j + 1;
                            this.P0 = (byte) 0;
                        }
                    }
                } else {
                    simpleQueue.clear();
                    this.O0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simpleQueue.clear();
            this.O0 = null;
            atomicThrowable.e(gnc1Var);
        }

        public final void g() {
            this.i.onSubscribe(this);
        }

        public final void request(long j) {
            BackpressureHelper.a(this.X, j);
            c();
        }
    }

    public FlowableConcatMapSingle(Flowable flowable, Function function, ErrorMode errorMode, int i) {
        this.b = flowable;
        this.c = function;
        this.d = errorMode;
        this.e = i;
    }

    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new ConcatMapSingleSubscriber(gnc1Var, this.c, this.e, this.d));
    }
}
