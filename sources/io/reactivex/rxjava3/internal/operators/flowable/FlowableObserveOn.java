package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableObserveOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler c;
    public final int d;

    public static abstract class BaseObserveOnSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T>, Runnable {
        public long X;
        public boolean Y;
        public final Scheduler.Worker a;
        public final int b;
        public final int c;
        public final AtomicLong d = new AtomicLong();
        public pnc1 e;
        public SimpleQueue f;
        public volatile boolean g;
        public volatile boolean h;
        public Throwable i;
        public byte t;

        public BaseObserveOnSubscriber(Scheduler.Worker worker, int i) {
            this.a = worker;
            this.b = i;
            this.c = i - (i >> 2);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        public final int a(int i) {
            this.Y = true;
            return 2;
        }

        public final boolean b(boolean z, boolean z2, gnc1 gnc1Var) {
            if (this.g) {
                clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.i;
            if (th != null) {
                this.g = true;
                clear();
                gnc1Var.onError(th);
                this.a.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.g = true;
            gnc1Var.onComplete();
            this.a.dispose();
            return true;
        }

        public abstract void c();

        @Override // p.pnc1
        public final void cancel() {
            if (this.g) {
                return;
            }
            this.g = true;
            this.e.cancel();
            this.a.dispose();
            if (this.Y || getAndIncrement() != 0) {
                return;
            }
            this.f.clear();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f.clear();
        }

        public abstract void d();

        public abstract void e();

        public final void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.a.a(this);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            g();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = th;
            this.h = true;
            g();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            if (this.t == 2) {
                g();
                return;
            }
            if (!this.f.offer(obj)) {
                this.e.cancel();
                this.i = new MissingBackpressureException("Queue is full?!");
                this.h = true;
            }
            g();
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.d, j);
                g();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.Y) {
                d();
            } else if (this.t == 1) {
                e();
            } else {
                c();
            }
        }
    }

    public static final class ObserveOnConditionalSubscriber<T> extends BaseObserveOnSubscriber<T> {
        public long N0;
        public final ConditionalSubscriber Z;

        public ObserveOnConditionalSubscriber(ConditionalSubscriber conditionalSubscriber, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.Z = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void c() {
            ConditionalSubscriber conditionalSubscriber = this.Z;
            SimpleQueue simpleQueue = this.f;
            long j = this.X;
            long j2 = this.N0;
            int iAddAndGet = 1;
            do {
                long j3 = this.d.get();
                while (j != j3) {
                    boolean z = this.h;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, conditionalSubscriber)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        if (conditionalSubscriber.f(objPoll)) {
                            j++;
                        }
                        j2++;
                        if (j2 == this.c) {
                            this.e.request(j2);
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.g = true;
                        this.e.cancel();
                        simpleQueue.clear();
                        conditionalSubscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == j3 && b(this.h, simpleQueue.isEmpty(), conditionalSubscriber)) {
                    return;
                }
                this.X = j;
                this.N0 = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void d() {
            int iAddAndGet = 1;
            while (!this.g) {
                boolean z = this.h;
                this.Z.onNext(null);
                if (z) {
                    this.g = true;
                    Throwable th = this.i;
                    ConditionalSubscriber conditionalSubscriber = this.Z;
                    if (th != null) {
                        conditionalSubscriber.onError(th);
                    } else {
                        conditionalSubscriber.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void e() {
            ConditionalSubscriber conditionalSubscriber = this.Z;
            SimpleQueue simpleQueue = this.f;
            long j = this.X;
            int iAddAndGet = 1;
            do {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.g) {
                            return;
                        }
                        if (objPoll == null) {
                            this.g = true;
                            conditionalSubscriber.onComplete();
                            this.a.dispose();
                            return;
                        } else if (conditionalSubscriber.f(objPoll)) {
                            j++;
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.g = true;
                        this.e.cancel();
                        conditionalSubscriber.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.g) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.g = true;
                    conditionalSubscriber.onComplete();
                    this.a.dispose();
                    return;
                }
                this.X = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.t = (byte) 1;
                        this.f = queueSubscription;
                        this.h = true;
                        this.Z.onSubscribe(this);
                        return;
                    }
                    if (iA == 2) {
                        this.t = (byte) 2;
                        this.f = queueSubscription;
                        this.Z.onSubscribe(this);
                        pnc1Var.request(this.b);
                        return;
                    }
                }
                this.f = new SpscArrayQueue(this.b);
                this.Z.onSubscribe(this);
                pnc1Var.request(this.b);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll != null && this.t != 1) {
                long j = this.N0 + 1;
                if (j == this.c) {
                    this.N0 = 0L;
                    this.e.request(j);
                    return objPoll;
                }
                this.N0 = j;
            }
            return objPoll;
        }
    }

    public static final class ObserveOnSubscriber<T> extends BaseObserveOnSubscriber<T> implements FlowableSubscriber<T> {
        public final gnc1 Z;

        public ObserveOnSubscriber(gnc1 gnc1Var, Scheduler.Worker worker, int i) {
            super(worker, i);
            this.Z = gnc1Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void c() {
            gnc1 gnc1Var = this.Z;
            SimpleQueue simpleQueue = this.f;
            long j = this.X;
            int iAddAndGet = 1;
            while (true) {
                long jAddAndGet = this.d.get();
                while (j != jAddAndGet) {
                    boolean z = this.h;
                    try {
                        Object objPoll = simpleQueue.poll();
                        boolean z2 = objPoll == null;
                        if (b(z, z2, gnc1Var)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        gnc1Var.onNext(objPoll);
                        j++;
                        if (j == this.c) {
                            if (jAddAndGet != Long.MAX_VALUE) {
                                jAddAndGet = this.d.addAndGet(-j);
                            }
                            this.e.request(j);
                            j = 0;
                        }
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.g = true;
                        this.e.cancel();
                        simpleQueue.clear();
                        gnc1Var.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (j == jAddAndGet && b(this.h, simpleQueue.isEmpty(), gnc1Var)) {
                    return;
                }
                int i = get();
                if (iAddAndGet == i) {
                    this.X = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void d() {
            int iAddAndGet = 1;
            while (!this.g) {
                boolean z = this.h;
                this.Z.onNext(null);
                if (z) {
                    this.g = true;
                    Throwable th = this.i;
                    gnc1 gnc1Var = this.Z;
                    if (th != null) {
                        gnc1Var.onError(th);
                    } else {
                        gnc1Var.onComplete();
                    }
                    this.a.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn.BaseObserveOnSubscriber
        public final void e() {
            gnc1 gnc1Var = this.Z;
            SimpleQueue simpleQueue = this.f;
            long j = this.X;
            int iAddAndGet = 1;
            do {
                long j2 = this.d.get();
                while (j != j2) {
                    try {
                        Object objPoll = simpleQueue.poll();
                        if (this.g) {
                            return;
                        }
                        if (objPoll == null) {
                            this.g = true;
                            gnc1Var.onComplete();
                            this.a.dispose();
                            return;
                        }
                        gnc1Var.onNext(objPoll);
                        j++;
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.g = true;
                        this.e.cancel();
                        gnc1Var.onError(th);
                        this.a.dispose();
                        return;
                    }
                }
                if (this.g) {
                    return;
                }
                if (simpleQueue.isEmpty()) {
                    this.g = true;
                    gnc1Var.onComplete();
                    this.a.dispose();
                    return;
                }
                this.X = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.e, pnc1Var)) {
                this.e = pnc1Var;
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.t = (byte) 1;
                        this.f = queueSubscription;
                        this.h = true;
                        this.Z.onSubscribe(this);
                        return;
                    }
                    if (iA == 2) {
                        this.t = (byte) 2;
                        this.f = queueSubscription;
                        this.Z.onSubscribe(this);
                        pnc1Var.request(this.b);
                        return;
                    }
                }
                this.f = new SpscArrayQueue(this.b);
                this.Z.onSubscribe(this);
                pnc1Var.request(this.b);
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Object objPoll = this.f.poll();
            if (objPoll != null && this.t != 1) {
                long j = this.X + 1;
                if (j == this.c) {
                    this.X = 0L;
                    this.e.request(j);
                    return objPoll;
                }
                this.X = j;
            }
            return objPoll;
        }
    }

    public FlowableObserveOn(Flowable flowable, Scheduler scheduler, int i) {
        super(flowable);
        this.c = scheduler;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Scheduler.Worker workerB = this.c.b();
        boolean z = gnc1Var instanceof ConditionalSubscriber;
        int i = this.d;
        Flowable flowable = this.b;
        if (z) {
            flowable.subscribe((FlowableSubscriber) new ObserveOnConditionalSubscriber((ConditionalSubscriber) gnc1Var, workerB, i));
        } else {
            flowable.subscribe((FlowableSubscriber) new ObserveOnSubscriber(gnc1Var, workerB, i));
        }
    }
}
