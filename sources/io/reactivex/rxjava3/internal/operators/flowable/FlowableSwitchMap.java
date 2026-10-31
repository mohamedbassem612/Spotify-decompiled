package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSwitchMap<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final Function c;
    public final int d;

    public static final class SwitchMapInnerSubscriber<T, R> extends AtomicReference<pnc1> implements FlowableSubscriber<R> {
        public final SwitchMapSubscriber a;
        public final long b;
        public final int c;
        public volatile SimpleQueue d;
        public volatile boolean e;
        public int f;

        public SwitchMapInnerSubscriber(SwitchMapSubscriber switchMapSubscriber, long j, int i) {
            this.a = switchMapSubscriber;
            this.b = j;
            this.c = i;
        }

        @Override // p.gnc1
        public final void onComplete() {
            SwitchMapSubscriber switchMapSubscriber = this.a;
            if (this.b == switchMapSubscriber.t) {
                this.e = true;
                switchMapSubscriber.b();
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            SwitchMapSubscriber switchMapSubscriber = this.a;
            if (this.b != switchMapSubscriber.t || !ExceptionHelper.a(switchMapSubscriber.e, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            switchMapSubscriber.g.cancel();
            switchMapSubscriber.d = true;
            this.e = true;
            switchMapSubscriber.b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            SwitchMapSubscriber switchMapSubscriber = this.a;
            if (this.b == switchMapSubscriber.t) {
                if (this.f != 0 || this.d.offer(obj)) {
                    switchMapSubscriber.b();
                } else {
                    onError(new MissingBackpressureException("Queue full?!"));
                }
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                if (pnc1Var instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                    int iA = queueSubscription.a(7);
                    if (iA == 1) {
                        this.f = iA;
                        this.d = queueSubscription;
                        this.e = true;
                        this.a.b();
                        return;
                    }
                    if (iA == 2) {
                        this.f = iA;
                        this.d = queueSubscription;
                        pnc1Var.request(this.c);
                        return;
                    }
                }
                this.d = new SpscArrayQueue(this.c);
                pnc1Var.request(this.c);
            }
        }
    }

    public static final class SwitchMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public static final SwitchMapInnerSubscriber X;
        public final gnc1 a;
        public final Function b;
        public final int c;
        public volatile boolean d;
        public volatile boolean f;
        public pnc1 g;
        public volatile long t;
        public final AtomicReference h = new AtomicReference();
        public final AtomicLong i = new AtomicLong();
        public final AtomicThrowable e = new AtomicThrowable();

        static {
            SwitchMapInnerSubscriber switchMapInnerSubscriber = new SwitchMapInnerSubscriber(null, -1L, 1);
            X = switchMapInnerSubscriber;
            SubscriptionHelper.a(switchMapInnerSubscriber);
        }

        public SwitchMapSubscriber(gnc1 gnc1Var, Function function, int i) {
            this.a = gnc1Var;
            this.b = function;
            this.c = i;
        }

        public final void a() {
            AtomicReference atomicReference = this.h;
            SwitchMapInnerSubscriber switchMapInnerSubscriber = X;
            SwitchMapInnerSubscriber switchMapInnerSubscriber2 = (SwitchMapInnerSubscriber) atomicReference.getAndSet(switchMapInnerSubscriber);
            if (switchMapInnerSubscriber2 == switchMapInnerSubscriber || switchMapInnerSubscriber2 == null) {
                return;
            }
            SubscriptionHelper.a(switchMapInnerSubscriber2);
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0110 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x000e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:81:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:84:0x0103  */
        public final void b() {
            long j;
            boolean z;
            Object objPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            int iAddAndGet = 1;
            while (!this.f) {
                if (this.d) {
                    if (this.e.get() != null) {
                        a();
                        this.e.e(gnc1Var);
                        return;
                    } else if (this.h.get() == null) {
                        gnc1Var.onComplete();
                        return;
                    }
                }
                SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.h.get();
                SimpleQueue simpleQueue = switchMapInnerSubscriber != null ? switchMapInnerSubscriber.d : null;
                if (simpleQueue != null) {
                    long j2 = this.i.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j = 0;
                        } else {
                            if (this.f) {
                                return;
                            }
                            boolean z2 = switchMapInnerSubscriber.e;
                            try {
                                objPoll = simpleQueue.poll();
                                j = 0;
                            } catch (Throwable th) {
                                Exceptions.a(th);
                                SubscriptionHelper.a(switchMapInnerSubscriber);
                                j = 0;
                                this.e.a(th);
                                z2 = true;
                                objPoll = null;
                            }
                            boolean z3 = objPoll == null;
                            if (switchMapInnerSubscriber == this.h.get()) {
                                if (z2) {
                                    if (this.e.get() != null) {
                                        this.e.e(gnc1Var);
                                        return;
                                    } else if (z3) {
                                        AtomicReference atomicReference = this.h;
                                        while (!atomicReference.compareAndSet(switchMapInnerSubscriber, null) && atomicReference.get() == switchMapInnerSubscriber) {
                                        }
                                    }
                                }
                                if (!z3) {
                                    gnc1Var.onNext(objPoll);
                                    j3++;
                                }
                            }
                            z = true;
                            if (j3 != j2 && switchMapInnerSubscriber.e) {
                                if (this.e.get() != null) {
                                    a();
                                    this.e.e(gnc1Var);
                                    return;
                                } else if (simpleQueue.isEmpty()) {
                                    AtomicReference atomicReference2 = this.h;
                                    while (!atomicReference2.compareAndSet(switchMapInnerSubscriber, null) && atomicReference2.get() == switchMapInnerSubscriber) {
                                    }
                                }
                            }
                            if (j3 != j && !this.f) {
                                if (j2 != Long.MAX_VALUE) {
                                    this.i.addAndGet(-j3);
                                }
                                if (switchMapInnerSubscriber.f != 1) {
                                    switchMapInnerSubscriber.get().request(j3);
                                }
                            }
                            if (z) {
                                continue;
                            }
                        }
                        z = false;
                        if (j3 != j2) {
                        }
                        if (j3 != j) {
                            if (j2 != Long.MAX_VALUE) {
                                this.i.addAndGet(-j3);
                            }
                            if (switchMapInnerSubscriber.f != 1) {
                                switchMapInnerSubscriber.get().request(j3);
                            }
                        }
                        if (z) {
                            continue;
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p.pnc1
        public final void cancel() {
            if (this.f) {
                return;
            }
            this.f = true;
            this.g.cancel();
            a();
            this.e.b();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            b();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.d || !ExceptionHelper.a(this.e, th)) {
                RxJavaPlugins.b(th);
                return;
            }
            a();
            this.d = true;
            b();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            long j = this.t + 1;
            this.t = j;
            SwitchMapInnerSubscriber switchMapInnerSubscriber = (SwitchMapInnerSubscriber) this.h.get();
            if (switchMapInnerSubscriber != null) {
                SubscriptionHelper.a(switchMapInnerSubscriber);
            }
            try {
                Object objApply = this.b.apply(obj);
                Objects.requireNonNull(objApply, "The publisher returned is null");
                moy0 moy0Var = (moy0) objApply;
                SwitchMapInnerSubscriber switchMapInnerSubscriber2 = new SwitchMapInnerSubscriber(this, j, this.c);
                while (true) {
                    SwitchMapInnerSubscriber switchMapInnerSubscriber3 = (SwitchMapInnerSubscriber) this.h.get();
                    if (switchMapInnerSubscriber3 == X) {
                        return;
                    }
                    AtomicReference atomicReference = this.h;
                    do {
                        if (atomicReference.compareAndSet(switchMapInnerSubscriber3, switchMapInnerSubscriber2)) {
                            moy0Var.subscribe(switchMapInnerSubscriber2);
                            return;
                        }
                    } while (atomicReference.get() == switchMapInnerSubscriber3);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.g.cancel();
                onError(th);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.g, pnc1Var)) {
                this.g = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.i, j);
                if (this.t == 0) {
                    this.g.request(Long.MAX_VALUE);
                } else {
                    b();
                }
            }
        }
    }

    public FlowableSwitchMap(Flowable flowable, Function function, int i) {
        super(flowable);
        this.c = function;
        this.d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Flowable flowable = this.b;
        Function function = this.c;
        if (FlowableScalarXMap.b(flowable, gnc1Var, function)) {
            return;
        }
        flowable.subscribe((FlowableSubscriber) new SwitchMapSubscriber(gnc1Var, function, this.d));
    }
}
