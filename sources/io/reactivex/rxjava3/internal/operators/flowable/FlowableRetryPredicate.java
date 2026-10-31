package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Predicate c;
    public final long d;

    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SubscriptionArbiter b;
        public final moy0 c;
        public final Predicate d;
        public long e;
        public long f;

        public RetrySubscriber(gnc1 gnc1Var, long j, Predicate predicate, SubscriptionArbiter subscriptionArbiter, moy0 moy0Var) {
            this.a = gnc1Var;
            this.b = subscriptionArbiter;
            this.c = moy0Var;
            this.d = predicate;
            this.e = j;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.b.g) {
                    long j = this.f;
                    if (j != 0) {
                        this.f = 0L;
                        this.b.d(j);
                    }
                    this.c.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            long j = this.e;
            if (j != Long.MAX_VALUE) {
                this.e = j - 1;
            }
            gnc1 gnc1Var = this.a;
            if (j == 0) {
                gnc1Var.onError(th);
                return;
            }
            try {
                if (this.d.test(th)) {
                    a();
                } else {
                    gnc1Var.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                gnc1Var.onError(new CompositeException(th, th2));
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.f++;
            this.a.onNext(obj);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            this.b.e(pnc1Var);
        }
    }

    public FlowableRetryPredicate(Flowable flowable, long j, Predicate predicate) {
        super(flowable);
        this.c = predicate;
        this.d = j;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        gnc1Var.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(gnc1Var, this.d, this.c, subscriptionArbiter, this.b).a();
    }
}
