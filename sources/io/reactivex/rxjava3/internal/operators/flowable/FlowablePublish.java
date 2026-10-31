package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.dv20;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowablePublish<T> extends ConnectableFlowable<T> {
    public final Flowable b;
    public final int c;
    public final AtomicReference d = new AtomicReference();

    public static final class InnerSubscription<T> extends AtomicLong implements pnc1 {
        public final gnc1 a;
        public final PublishConnection b;
        public long c;

        public InnerSubscription(gnc1 gnc1Var, PublishConnection publishConnection) {
            this.a = gnc1Var;
            this.b = publishConnection;
        }

        public final boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // p.pnc1
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                PublishConnection publishConnection = this.b;
                publishConnection.c(this);
                publishConnection.b();
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.b(this, j);
                this.b.b();
            }
        }
    }

    public static final class PublishConnection<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {
        public static final InnerSubscription[] X = new InnerSubscription[0];
        public static final InnerSubscription[] Y = new InnerSubscription[0];
        public final AtomicReference a;
        public final AtomicReference b = new AtomicReference();
        public final AtomicBoolean c = new AtomicBoolean();
        public final AtomicReference d = new AtomicReference(X);
        public final int e;
        public volatile SimpleQueue f;
        public int g;
        public volatile boolean h;
        public Throwable i;
        public int t;

        public PublishConnection(AtomicReference atomicReference, int i) {
            this.a = atomicReference;
            this.e = i;
        }

        public final boolean a(boolean z, boolean z2) {
            if (!z || !z2) {
                return false;
            }
            Throwable th = this.i;
            if (th != null) {
                g(th);
                return true;
            }
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.d.getAndSet(Y)) {
                if (!innerSubscription.a()) {
                    innerSubscription.a.onComplete();
                }
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            if (getAndIncrement() != 0) {
                return;
            }
            SimpleQueue simpleQueue = this.f;
            int i = this.t;
            int i2 = this.e;
            int i3 = i2 - (i2 >> 2);
            boolean z = this.g != 1;
            SimpleQueue simpleQueue2 = simpleQueue;
            int i4 = i;
            int iAddAndGet = 1;
            while (true) {
                if (simpleQueue2 != null) {
                    InnerSubscription[] innerSubscriptionArr = (InnerSubscription[]) this.d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z2 = false;
                    for (InnerSubscription innerSubscription : innerSubscriptionArr) {
                        long j = innerSubscription.get();
                        if (j != Long.MIN_VALUE) {
                            jMin = Math.min(j - innerSubscription.c, jMin);
                            z2 = true;
                        }
                    }
                    long j2 = 0;
                    if (!z2) {
                        jMin = 0;
                    }
                    while (true) {
                        if (jMin != j2) {
                            boolean z3 = this.h;
                            try {
                                Object objPoll = simpleQueue2.poll();
                                boolean z4 = objPoll == null;
                                if (a(z3, z4)) {
                                    return;
                                }
                                if (!z4) {
                                    for (InnerSubscription innerSubscription2 : innerSubscriptionArr) {
                                        if (!innerSubscription2.a()) {
                                            innerSubscription2.a.onNext(objPoll);
                                            innerSubscription2.c++;
                                        }
                                    }
                                    if (z && (i4 = i4 + 1) == i3) {
                                        ((pnc1) this.b.get()).request(i3);
                                        i4 = 0;
                                    }
                                    jMin--;
                                    if (innerSubscriptionArr == this.d.get()) {
                                        j2 = 0;
                                    }
                                }
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                ((pnc1) this.b.get()).cancel();
                                simpleQueue2.clear();
                                this.h = true;
                                g(th);
                                return;
                            }
                        }
                        if (a(this.h, simpleQueue2.isEmpty())) {
                            return;
                        }
                    }
                }
                this.t = i4;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (simpleQueue2 == null) {
                    simpleQueue2 = this.f;
                }
            }
        }

        public final void c(InnerSubscription innerSubscription) {
            AtomicReference atomicReference;
            InnerSubscription[] innerSubscriptionArr;
            InnerSubscription[] innerSubscriptionArr2;
            do {
                atomicReference = this.d;
                innerSubscriptionArr = (InnerSubscription[]) atomicReference.get();
                int length = innerSubscriptionArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerSubscriptionArr[i] == innerSubscription) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerSubscriptionArr2 = X;
                } else {
                    InnerSubscription[] innerSubscriptionArr3 = new InnerSubscription[length - 1];
                    System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr3, 0, i);
                    System.arraycopy(innerSubscriptionArr, i + 1, innerSubscriptionArr3, i, (length - i) - 1);
                    innerSubscriptionArr2 = innerSubscriptionArr3;
                }
            } while (!dv20.o(atomicReference, innerSubscriptionArr, innerSubscriptionArr2));
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.d.getAndSet(Y);
            dv20.m(this.a, this);
            SubscriptionHelper.a(this.b);
        }

        public final void g(Throwable th) {
            for (InnerSubscription innerSubscription : (InnerSubscription[]) this.d.getAndSet(Y)) {
                if (!innerSubscription.a()) {
                    innerSubscription.a.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.get() == Y;
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.h = true;
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = th;
            this.h = true;
            b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.g != 0 || this.f.offer(obj)) {
                b();
            } else {
                onError(new MissingBackpressureException("Prefetch queue is full?!"));
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this.b, pnc1Var)) {
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.g = iA;
                        this.f = queueSubscription;
                        this.h = true;
                        b();
                        return;
                    }
                    if (iA == 2) {
                        this.g = iA;
                        this.f = queueSubscription;
                        pnc1Var.request(this.e);
                        return;
                    }
                }
                this.f = new SpscArrayQueue(this.e);
                pnc1Var.request(this.e);
            }
        }
    }

    public FlowablePublish(Flowable flowable, int i) {
        this.b = flowable;
        this.c = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        PublishConnection publishConnection;
        InnerSubscription[] innerSubscriptionArr;
        InnerSubscription[] innerSubscriptionArr2;
        loop0: while (true) {
            AtomicReference atomicReference = this.d;
            publishConnection = (PublishConnection) atomicReference.get();
            if (publishConnection != null) {
                break;
            }
            PublishConnection publishConnection2 = new PublishConnection(atomicReference, this.c);
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        InnerSubscription innerSubscription = new InnerSubscription(gnc1Var, publishConnection);
        gnc1Var.onSubscribe(innerSubscription);
        AtomicReference atomicReference2 = publishConnection.d;
        do {
            innerSubscriptionArr = (InnerSubscription[]) atomicReference2.get();
            if (innerSubscriptionArr == PublishConnection.Y) {
                Throwable th = publishConnection.i;
                gnc1 gnc1Var2 = innerSubscription.a;
                if (th != null) {
                    gnc1Var2.onError(th);
                    return;
                } else {
                    gnc1Var2.onComplete();
                    return;
                }
            }
            int length = innerSubscriptionArr.length;
            innerSubscriptionArr2 = new InnerSubscription[length + 1];
            System.arraycopy(innerSubscriptionArr, 0, innerSubscriptionArr2, 0, length);
            innerSubscriptionArr2[length] = innerSubscription;
        } while (!dv20.o(atomicReference2, innerSubscriptionArr, innerSubscriptionArr2));
        if (innerSubscription.a()) {
            publishConnection.c(innerSubscription);
        } else {
            publishConnection.b();
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public final void d0(Consumer consumer) {
        PublishConnection publishConnection;
        loop0: while (true) {
            AtomicReference atomicReference = this.d;
            publishConnection = (PublishConnection) atomicReference.get();
            if (publishConnection != null && !publishConnection.isDisposed()) {
                break;
            }
            PublishConnection publishConnection2 = new PublishConnection(atomicReference, this.c);
            do {
                if (atomicReference.compareAndSet(publishConnection, publishConnection2)) {
                    publishConnection = publishConnection2;
                    break loop0;
                }
            } while (atomicReference.get() == publishConnection);
        }
        AtomicBoolean atomicBoolean = publishConnection.c;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            consumer.accept(publishConnection);
            if (z) {
                this.b.subscribe((gnc1) publishConnection);
            }
        } catch (Throwable th) {
            Exceptions.a(th);
            throw ExceptionHelper.f(th);
        }
    }

    @Override // io.reactivex.rxjava3.flowables.ConnectableFlowable
    public final void e0() {
        AtomicReference atomicReference = this.d;
        PublishConnection publishConnection = (PublishConnection) atomicReference.get();
        if (publishConnection == null || !publishConnection.isDisposed()) {
            return;
        }
        dv20.m(atomicReference, publishConnection);
    }
}
