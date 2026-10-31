package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableScanSeed<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final BiFunction c;
    public final Supplier d;

    public static final class ScanSeedSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
        public Object X;
        public int Y;
        public final gnc1 a;
        public final BiFunction b;
        public final SpscArrayQueue c;
        public final AtomicLong d;
        public final int e;
        public final int f;
        public volatile boolean g;
        public volatile boolean h;
        public Throwable i;
        public pnc1 t;

        public ScanSeedSubscriber(gnc1 gnc1Var, BiFunction biFunction, Object obj, int i) {
            this.a = gnc1Var;
            this.b = biFunction;
            this.X = obj;
            this.e = i;
            this.f = i - (i >> 2);
            SpscArrayQueue spscArrayQueue = new SpscArrayQueue(i);
            this.c = spscArrayQueue;
            spscArrayQueue.offer(obj);
            this.d = new AtomicLong();
        }

        public final void a() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            gnc1 gnc1Var = this.a;
            SpscArrayQueue spscArrayQueue = this.c;
            int i = this.f;
            int i2 = this.Y;
            int iAddAndGet = 1;
            do {
                long j = this.d.get();
                long j2 = 0;
                while (j2 != j) {
                    if (this.g) {
                        spscArrayQueue.clear();
                        return;
                    }
                    boolean z = this.h;
                    if (z && (th = this.i) != null) {
                        spscArrayQueue.clear();
                        gnc1Var.onError(th);
                        return;
                    }
                    Object objPoll = spscArrayQueue.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        gnc1Var.onComplete();
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    gnc1Var.onNext(objPoll);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.t.request(i);
                        i2 = 0;
                    }
                }
                if (j2 == j && this.h) {
                    Throwable th2 = this.i;
                    if (th2 != null) {
                        spscArrayQueue.clear();
                        gnc1Var.onError(th2);
                        return;
                    } else if (spscArrayQueue.isEmpty()) {
                        gnc1Var.onComplete();
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.e(this.d, j2);
                }
                this.Y = i2;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p.pnc1
        public final void cancel() {
            this.g = true;
            this.t.cancel();
            if (getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            a();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.i = th;
            this.h = true;
            a();
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            try {
                Object objApply = this.b.apply(this.X, obj);
                Objects.requireNonNull(objApply, "The accumulator returned a null value");
                this.X = objApply;
                this.c.offer(objApply);
                a();
            } catch (Throwable th) {
                Exceptions.a(th);
                this.t.cancel();
                onError(th);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.t, pnc1Var)) {
                this.t = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(this.e - 1);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this.d, j);
                a();
            }
        }
    }

    public FlowableScanSeed(Flowable flowable, Supplier supplier, BiFunction biFunction) {
        super(flowable);
        this.c = biFunction;
        this.d = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        try {
            Object obj = this.d.get();
            Objects.requireNonNull(obj, "The seed supplied is null");
            this.b.subscribe((FlowableSubscriber) new ScanSeedSubscriber(gnc1Var, this.c, obj, Flowable.a));
        } catch (Throwable th) {
            Exceptions.a(th);
            gnc1Var.onSubscribe(EmptySubscription.a);
            gnc1Var.onError(th);
        }
    }
}
