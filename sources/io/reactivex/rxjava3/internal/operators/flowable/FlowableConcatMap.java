package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function c;
    public final byte d;
    public final ErrorMode e;

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, pnc1 {
        public volatile boolean X;
        public int Y;
        public final Function b;
        public final int c;
        public final int d;
        public pnc1 e;
        public int f;
        public SimpleQueue g;
        public volatile boolean h;
        public volatile boolean i;
        public final ConcatMapInner a = new ConcatMapInner(this);
        public final AtomicThrowable t = new AtomicThrowable();

        public BaseConcatMapSubscriber(Function function, int i) {
            this.b = function;
            this.c = i;
            this.d = i - (i >> 2);
        }

        public abstract void c();

        public abstract void d();

        @Override // p.gnc1
        public final void onComplete() {
            this.h = true;
            c();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.Y == 2 || this.g.offer(obj)) {
                c();
            } else {
                this.e.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.Y = iA;
                        this.g = queueSubscription;
                        this.h = true;
                        d();
                        c();
                        return;
                    }
                    if (iA == 2) {
                        this.Y = iA;
                        this.g = queueSubscription;
                        d();
                        pnc1Var.request(this.c);
                        return;
                    }
                }
                this.g = new SpscArrayQueue(this.c);
                d();
                pnc1Var.request(this.c);
            }
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {
        public final AtomicInteger N0;
        public final gnc1 Z;

        public ConcatMapImmediate(gnc1 gnc1Var, Function function, int i) {
            super(function, i);
            this.Z = gnc1Var;
            this.N0 = new AtomicInteger();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void a(Throwable th) {
            this.e.cancel();
            AtomicThrowable atomicThrowable = this.t;
            if (atomicThrowable.a(th) && getAndIncrement() == 0) {
                atomicThrowable.e(this.Z);
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        public final void b(Object obj) {
            HalfSerializer.d(this.Z, obj, this, this.t);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void c() {
            if (this.N0.getAndIncrement() == 0) {
                while (!this.i) {
                    if (!this.X) {
                        boolean z = this.h;
                        try {
                            Object objPoll = this.g.poll();
                            boolean z2 = objPoll == null;
                            if (z && z2) {
                                this.Z.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Object objApply = this.b.apply(objPoll);
                                    Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                    moy0 moy0Var = (moy0) objApply;
                                    if (this.Y != 1) {
                                        int i = this.f + 1;
                                        if (i == this.d) {
                                            this.f = 0;
                                            this.e.request(i);
                                        } else {
                                            this.f = i;
                                        }
                                    }
                                    if (moy0Var instanceof Supplier) {
                                        try {
                                            Object obj = ((Supplier) moy0Var).get();
                                            if (obj == null) {
                                                continue;
                                            } else if (!this.a.h) {
                                                this.X = true;
                                                this.a.e(new SimpleScalarSubscription(obj, this.a));
                                            } else if (!HalfSerializer.d(this.Z, obj, this, this.t)) {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.a(th);
                                            this.e.cancel();
                                            this.t.a(th);
                                            this.t.e(this.Z);
                                            return;
                                        }
                                    } else {
                                        this.X = true;
                                        moy0Var.subscribe(this.a);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.a(th2);
                                    this.e.cancel();
                                    this.t.a(th2);
                                    this.t.e(this.Z);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.a(th3);
                            this.e.cancel();
                            this.t.a(th3);
                            this.t.e(this.Z);
                            return;
                        }
                    }
                    if (this.N0.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.a.cancel();
            this.e.cancel();
            this.t.b();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        public final void d() {
            this.Z.onSubscribe(this);
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.cancel();
            AtomicThrowable atomicThrowable = this.t;
            if (atomicThrowable.a(th) && getAndIncrement() == 0) {
                atomicThrowable.e(this.Z);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            this.a.request(j);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {
        public final BaseConcatMapSubscriber i;
        public long t;

        public ConcatMapInner(BaseConcatMapSubscriber baseConcatMapSubscriber) {
            super(false);
            this.i = baseConcatMapSubscriber;
        }

        @Override // p.gnc1
        public final void onComplete() {
            long j = this.t;
            if (j != 0) {
                this.t = 0L;
                d(j);
            }
            BaseConcatMapSubscriber baseConcatMapSubscriber = this.i;
            baseConcatMapSubscriber.X = false;
            baseConcatMapSubscriber.c();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            long j = this.t;
            if (j != 0) {
                this.t = 0L;
                d(j);
            }
            this.i.a(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.t++;
            this.i.b(obj);
        }
    }

    public interface ConcatMapSupport<T> {
        void a(Throwable th);

        void b(Object obj);
    }

    public FlowableConcatMap(Flowable flowable, Function function) {
        super(flowable);
        this.c = function;
        this.d = (byte) 2;
        this.e = ErrorMode.a;
    }

    public static <T, R> gnc1 subscribe(gnc1 gnc1Var, Function<? super T, ? extends moy0> function, int i, ErrorMode errorMode) {
        int iOrdinal = errorMode.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? new ConcatMapImmediate(gnc1Var, function, i) : new ConcatMapDelayed(i, function, gnc1Var, true);
        }
        return new ConcatMapDelayed(i, function, gnc1Var, false);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Flowable flowable = this.b;
        Function function = this.c;
        if (FlowableScalarXMap.b(flowable, gnc1Var, function)) {
            return;
        }
        flowable.subscribe(subscribe(gnc1Var, function, this.d, this.e));
    }
}
