package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function c;
    public final int d;
    public final int e;
    public final ErrorMode f;

    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1, InnerQueuedSubscriberSupport<R> {
        public volatile boolean X;
        public volatile InnerQueuedSubscriber Y;
        public final gnc1 a;
        public final Function b;
        public final int c;
        public final int d;
        public final ErrorMode e;
        public final AtomicThrowable f = new AtomicThrowable();
        public final AtomicLong g = new AtomicLong();
        public final SpscLinkedArrayQueue h;
        public pnc1 i;
        public volatile boolean t;

        public ConcatMapEagerDelayErrorSubscriber(gnc1 gnc1Var, Function function, int i, int i2, ErrorMode errorMode) {
            this.a = gnc1Var;
            this.b = function;
            this.c = i;
            this.d = i2;
            this.e = errorMode;
            this.h = new SpscLinkedArrayQueue(Math.min(i2, i));
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void a() {
            long j;
            long j2;
            boolean z;
            SimpleQueue simpleQueue;
            SimpleQueue simpleQueue2;
            ErrorMode errorMode = ErrorMode.a;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber innerQueuedSubscriber = this.Y;
            gnc1 gnc1Var = this.a;
            ErrorMode errorMode2 = this.e;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.g.get();
                if (innerQueuedSubscriber == null) {
                    if (errorMode2 != ErrorMode.c && ((Throwable) this.f.get()) != null) {
                        e();
                        this.f.e(this.a);
                        return;
                    }
                    boolean z2 = this.X;
                    InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.h.poll();
                    if (z2 && innerQueuedSubscriber2 == null) {
                        this.f.e(this.a);
                        return;
                    } else {
                        if (innerQueuedSubscriber2 != null) {
                            this.Y = innerQueuedSubscriber2;
                        }
                        innerQueuedSubscriber = innerQueuedSubscriber2;
                    }
                }
                if (innerQueuedSubscriber == null || (simpleQueue = innerQueuedSubscriber.d) == null) {
                    j = 0;
                    j2 = 0;
                    z = false;
                } else {
                    j2 = 0;
                    while (true) {
                        j = 0;
                        if (j2 == j3) {
                            simpleQueue2 = simpleQueue;
                        } else {
                            if (this.t) {
                                e();
                                return;
                            }
                            if (errorMode2 == errorMode && ((Throwable) this.f.get()) != null) {
                                this.Y = null;
                                SubscriptionHelper.a(innerQueuedSubscriber);
                                e();
                                this.f.e(this.a);
                                return;
                            }
                            boolean z3 = innerQueuedSubscriber.e;
                            try {
                                Object objPoll = simpleQueue.poll();
                                boolean z4 = objPoll == null;
                                if (z3 && z4) {
                                    this.Y = null;
                                    this.i.request(1L);
                                    innerQueuedSubscriber = null;
                                    simpleQueue2 = simpleQueue;
                                    z = true;
                                    break;
                                }
                                simpleQueue2 = simpleQueue;
                                if (!z4) {
                                    gnc1Var.onNext(objPoll);
                                    j2++;
                                    innerQueuedSubscriber.request(1L);
                                    simpleQueue = simpleQueue2;
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                this.Y = null;
                                SubscriptionHelper.a(innerQueuedSubscriber);
                                e();
                                gnc1Var.onError(th);
                                return;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (j2 == j3) {
                        if (this.t) {
                            e();
                            return;
                        }
                        if (errorMode2 == errorMode && ((Throwable) this.f.get()) != null) {
                            this.Y = null;
                            innerQueuedSubscriber.getClass();
                            SubscriptionHelper.a(innerQueuedSubscriber);
                            e();
                            this.f.e(this.a);
                            return;
                        }
                        boolean z5 = innerQueuedSubscriber.e;
                        boolean zIsEmpty = simpleQueue2.isEmpty();
                        if (z5 && zIsEmpty) {
                            this.Y = null;
                            this.i.request(1L);
                            innerQueuedSubscriber = null;
                            z = true;
                        }
                    }
                }
                if (j2 != j && j3 != Long.MAX_VALUE) {
                    this.g.addAndGet(-j2);
                }
                if (!z && (iAddAndGet = addAndGet(-iAddAndGet)) == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void b(InnerQueuedSubscriber innerQueuedSubscriber) {
            innerQueuedSubscriber.e = true;
            a();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void c(InnerQueuedSubscriber innerQueuedSubscriber, Throwable th) {
            if (this.f.a(th)) {
                innerQueuedSubscriber.e = true;
                if (this.e != ErrorMode.c) {
                    this.i.cancel();
                }
                a();
            }
        }

        public final void cancel() {
            if (this.t) {
                return;
            }
            this.t = true;
            this.i.cancel();
            this.f.b();
            if (getAndIncrement() == 0) {
                do {
                    e();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.InnerQueuedSubscriberSupport
        public final void d(InnerQueuedSubscriber innerQueuedSubscriber, Object obj) {
            if (innerQueuedSubscriber.d.offer(obj)) {
                a();
            } else {
                SubscriptionHelper.a(innerQueuedSubscriber);
                c(innerQueuedSubscriber, new MissingBackpressureException());
            }
        }

        public final void e() {
            InnerQueuedSubscriber innerQueuedSubscriber = this.Y;
            this.Y = null;
            if (innerQueuedSubscriber != null) {
                SubscriptionHelper.a(innerQueuedSubscriber);
            }
            while (true) {
                InnerQueuedSubscriber innerQueuedSubscriber2 = (InnerQueuedSubscriber) this.h.poll();
                if (innerQueuedSubscriber2 == null) {
                    return;
                } else {
                    SubscriptionHelper.a(innerQueuedSubscriber2);
                }
            }
        }

        public final void onComplete() {
            this.X = true;
            a();
        }

        public final void onError(Throwable th) {
            if (this.f.a(th)) {
                this.X = true;
                a();
            }
        }

        public final void onNext(Object obj) {
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                moy0 moy0Var = (moy0) objApply;
                InnerQueuedSubscriber innerQueuedSubscriber = new InnerQueuedSubscriber(this, this.d);
                if (this.t) {
                    return;
                }
                this.h.offer(innerQueuedSubscriber);
                moy0Var.subscribe(innerQueuedSubscriber);
                if (this.t) {
                    SubscriptionHelper.a(innerQueuedSubscriber);
                    if (getAndIncrement() == 0) {
                        do {
                            e();
                        } while (decrementAndGet() != 0);
                    }
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.i.cancel();
                onError(th);
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.i, pnc1Var)) {
                this.i = pnc1Var;
                this.a.onSubscribe(this);
                int i = this.c;
                pnc1Var.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.g, j);
                a();
            }
        }
    }

    public FlowableConcatMapEager(Flowable flowable, Function function, int i, int i2, ErrorMode errorMode) {
        super(flowable);
        this.c = function;
        this.d = i;
        this.e = i2;
        this.f = errorMode;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new ConcatMapEagerDelayErrorSubscriber(gnc1Var, this.c, this.d, this.e, this.f));
    }
}
