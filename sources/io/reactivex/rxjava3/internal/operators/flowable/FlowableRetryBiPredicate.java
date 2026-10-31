package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiPredicate c;

    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SubscriptionArbiter b;
        public final moy0 c;
        public final BiPredicate d;
        public int e;
        public long f;

        public RetryBiSubscriber(gnc1 gnc1Var, BiPredicate biPredicate, SubscriptionArbiter subscriptionArbiter, moy0 moy0Var) {
            this.a = gnc1Var;
            this.b = subscriptionArbiter;
            this.c = moy0Var;
            this.d = biPredicate;
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

        public final void onComplete() {
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            gnc1 gnc1Var = this.a;
            try {
                BiPredicate biPredicate = this.d;
                int i = this.e + 1;
                this.e = i;
                if (biPredicate.test(Integer.valueOf(i), th)) {
                    a();
                } else {
                    gnc1Var.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.a(th2);
                gnc1Var.onError(new CompositeException(new Throwable[]{th, th2}));
            }
        }

        public final void onNext(Object obj) {
            this.f++;
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            this.b.e(pnc1Var);
        }
    }

    public FlowableRetryBiPredicate(Flowable flowable, BiPredicate biPredicate) {
        super(flowable);
        this.c = biPredicate;
    }

    public final void V(gnc1 gnc1Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        gnc1Var.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(gnc1Var, this.c, subscriptionArbiter, ((AbstractFlowableWithUpstream) this).b).a();
    }
}
