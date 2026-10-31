package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BooleanSupplier c;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SubscriptionArbiter b;
        public final moy0 c;
        public final BooleanSupplier d;
        public long e;

        public RepeatSubscriber(gnc1 gnc1Var, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, moy0 moy0Var) {
            this.a = gnc1Var;
            this.b = subscriptionArbiter;
            this.c = moy0Var;
            this.d = booleanSupplier;
        }

        public final void a() {
            if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                while (!this.b.g) {
                    long j = this.e;
                    if (j != 0) {
                        this.e = 0L;
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
            try {
                if (this.d.t) {
                    this.a.onComplete();
                } else {
                    a();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.a.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.e++;
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            this.b.e(pnc1Var);
        }
    }

    public FlowableRepeatUntil(Flowable flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.c = booleanSupplier;
    }

    public final void V(gnc1 gnc1Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        gnc1Var.onSubscribe(subscriptionArbiter);
        new RepeatSubscriber(gnc1Var, this.c, subscriptionArbiter, ((AbstractFlowableWithUpstream) this).b).a();
    }
}
