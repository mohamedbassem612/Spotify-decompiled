package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    public final boolean c;

    public static final class TakeSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public long b;
        public pnc1 c;

        public TakeSubscriber(gnc1 gnc1Var, long j) {
            this.a = gnc1Var;
            this.b = j;
            lazySet(j);
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.b > 0) {
                this.b = 0L;
                this.a.onComplete();
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.b <= 0) {
                RxJavaPlugins.b(th);
            } else {
                this.b = 0L;
                this.a.onError(th);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            long j = this.b;
            if (j > 0) {
                long j2 = j - 1;
                this.b = j2;
                gnc1 gnc1Var = this.a;
                gnc1Var.onNext(obj);
                if (j2 == 0) {
                    this.c.cancel();
                    gnc1Var.onComplete();
                }
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                long j = this.b;
                gnc1 gnc1Var = this.a;
                if (j == 0) {
                    pnc1Var.cancel();
                    EmptySubscription.b(gnc1Var);
                } else {
                    this.c = pnc1Var;
                    gnc1Var.onSubscribe(this);
                }
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            long j2;
            long jMin;
            if (SubscriptionHelper.e(j)) {
                do {
                    j2 = get();
                    if (j2 == 0) {
                        return;
                    } else {
                        jMin = Math.min(j2, j);
                    }
                } while (!compareAndSet(j2, j2 - jMin));
                this.c.request(jMin);
            }
        }
    }

    public FlowableTake(Flowable flowable) {
        super(flowable);
        this.c = true;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new TakeSubscriber(gnc1Var, this.c ? 1L : 0L));
    }
}
