package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long c;

    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        public final gnc1 a;
        public final SubscriptionArbiter b;
        public final moy0 c;
        public long d;
        public long e;

        public RepeatSubscriber(gnc1 gnc1Var, long j, SubscriptionArbiter subscriptionArbiter, moy0 moy0Var) {
            this.a = gnc1Var;
            this.b = subscriptionArbiter;
            this.c = moy0Var;
            this.d = j;
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
            long j = this.d;
            if (j != Long.MAX_VALUE) {
                this.d = j - 1;
            }
            if (j != 0) {
                a();
            } else {
                this.a.onComplete();
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

    public FlowableRepeat(Flowable flowable, long j) {
        super(flowable);
        this.c = j;
    }

    public final void V(gnc1 gnc1Var) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        gnc1Var.onSubscribe(subscriptionArbiter);
        long j = this.c;
        new RepeatSubscriber(gnc1Var, j != Long.MAX_VALUE ? j - 1 : Long.MAX_VALUE, subscriptionArbiter, ((AbstractFlowableWithUpstream) this).b).a();
    }
}
