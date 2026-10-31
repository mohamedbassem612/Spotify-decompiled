package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    public final moy0[] b;
    public final Function c;
    public final int d;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements pnc1 {
        public final gnc1 a;
        public final ZipSubscriber[] b;
        public final Function c;
        public final AtomicLong d;
        public final AtomicThrowable e;
        public volatile boolean f;
        public final Object[] g;

        public ZipCoordinator(gnc1 gnc1Var, Function function, int i, int i2) {
            this.a = gnc1Var;
            this.c = function;
            ZipSubscriber[] zipSubscriberArr = new ZipSubscriber[i];
            for (int i3 = 0; i3 < i; i3++) {
                zipSubscriberArr[i3] = new ZipSubscriber(this, i2);
            }
            this.g = new Object[i];
            this.b = zipSubscriberArr;
            this.d = new AtomicLong();
            this.e = new AtomicThrowable();
        }

        public final void a() {
            for (ZipSubscriber zipSubscriber : this.b) {
                zipSubscriber.getClass();
                SubscriptionHelper.a(zipSubscriber);
            }
        }

        public final void b() {
            int i;
            long j;
            Object objPoll;
            Object objPoll2;
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            ZipSubscriber[] zipSubscriberArr = this.b;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.g;
            int iAddAndGet = 1;
            do {
                long j2 = this.d.get();
                long j3 = 0;
                while (true) {
                    if (j2 == j3) {
                        j = 0;
                        break;
                    }
                    if (this.f) {
                        return;
                    }
                    if (this.e.get() != null) {
                        a();
                        this.e.e(gnc1Var);
                        return;
                    }
                    boolean z = false;
                    for (int i2 = 0; i2 < length; i2++) {
                        ZipSubscriber zipSubscriber = zipSubscriberArr[i2];
                        if (objArr[i2] == null) {
                            boolean z2 = zipSubscriber.f;
                            SimpleQueue simpleQueue = zipSubscriber.d;
                            if (simpleQueue != null) {
                                try {
                                    objPoll2 = simpleQueue.poll();
                                } catch (Throwable th) {
                                    Exceptions.a(th);
                                    this.e.a(th);
                                    a();
                                    this.e.e(gnc1Var);
                                    return;
                                }
                            } else {
                                objPoll2 = null;
                            }
                            boolean z3 = objPoll2 == null;
                            if (z2 && z3) {
                                a();
                                this.e.e(gnc1Var);
                                return;
                            } else if (z3) {
                                z = true;
                            } else {
                                objArr[i2] = objPoll2;
                            }
                        }
                    }
                    j = 0;
                    if (z) {
                        break;
                    }
                    try {
                        Object objApply = this.c.apply(objArr.clone());
                        Objects.requireNonNull(objApply, "The zipper returned a null value");
                        gnc1Var.onNext(objApply);
                        j3++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.a(th2);
                        a();
                        this.e.a(th2);
                        this.e.e(gnc1Var);
                        return;
                    }
                }
                if (j2 == j3) {
                    if (this.f) {
                        return;
                    }
                    if (this.e.get() != null) {
                        a();
                        this.e.e(gnc1Var);
                        return;
                    }
                    for (int i3 = 0; i3 < length; i3++) {
                        ZipSubscriber zipSubscriber2 = zipSubscriberArr[i3];
                        if (objArr[i3] == null) {
                            boolean z4 = zipSubscriber2.f;
                            SimpleQueue simpleQueue2 = zipSubscriber2.d;
                            if (simpleQueue2 != null) {
                                try {
                                    objPoll = simpleQueue2.poll();
                                } catch (Throwable th3) {
                                    Exceptions.a(th3);
                                    this.e.a(th3);
                                    a();
                                    this.e.e(gnc1Var);
                                    return;
                                }
                            } else {
                                objPoll = null;
                            }
                            boolean z5 = objPoll == null;
                            if (z4 && z5) {
                                a();
                                this.e.e(gnc1Var);
                                return;
                            } else if (!z5) {
                                objArr[i3] = objPoll;
                            }
                        }
                    }
                }
                if (j3 != j) {
                    for (ZipSubscriber zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j3);
                    }
                    if (j2 != Long.MAX_VALUE) {
                        this.d.addAndGet(-j3);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p.pnc1
        public final void cancel() {
            if (this.f) {
                return;
            }
            this.f = true;
            a();
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.d, j);
                b();
            }
        }

        public void subscribe(moy0[] moy0VarArr, int i) {
            ZipSubscriber[] zipSubscriberArr = this.b;
            for (int i2 = 0; i2 < i && !this.f && this.e.get() == null; i2++) {
                moy0VarArr[i2].subscribe(zipSubscriberArr[i2]);
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<pnc1> implements FlowableSubscriber<T>, pnc1 {
        public final ZipCoordinator a;
        public final int b;
        public final int c;
        public SimpleQueue d;
        public long e;
        public volatile boolean f;
        public int g;

        public ZipSubscriber(ZipCoordinator zipCoordinator, int i) {
            this.a = zipCoordinator;
            this.b = i;
            this.c = i - (i >> 2);
        }

        @Override // p.pnc1
        public final void cancel() {
            SubscriptionHelper.a(this);
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.f = true;
            this.a.b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            ZipCoordinator zipCoordinator = this.a;
            if (zipCoordinator.e.a(th)) {
                this.f = true;
                zipCoordinator.b();
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.g != 2) {
                this.d.offer(obj);
            }
            this.a.b();
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.g = iA;
                        this.d = queueSubscription;
                        this.f = true;
                        this.a.b();
                        return;
                    }
                    if (iA == 2) {
                        this.g = iA;
                        this.d = queueSubscription;
                        pnc1Var.request(this.b);
                        return;
                    }
                }
                this.d = new SpscArrayQueue(this.b);
                pnc1Var.request(this.b);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (this.g != 1) {
                long j2 = this.e + j;
                if (j2 < this.c) {
                    this.e = j2;
                } else {
                    this.e = 0L;
                    get().request(j2);
                }
            }
        }
    }

    public FlowableZip(moy0[] moy0VarArr, Function function, int i) {
        this.b = moy0VarArr;
        this.c = function;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        moy0[] moy0VarArr = this.b;
        moy0VarArr.getClass();
        int length = moy0VarArr.length;
        if (length == 0) {
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onComplete();
        } else {
            ZipCoordinator zipCoordinator = new ZipCoordinator(gnc1Var, this.c, length, this.d);
            gnc1Var.onSubscribe(zipCoordinator);
            zipCoordinator.subscribe(moy0VarArr, length);
        }
    }
}
