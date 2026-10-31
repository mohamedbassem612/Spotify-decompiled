package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, pnc1 {
    public final moy0 a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public FlowableRepeatWhen$WhenSourceSubscriber d;

    public FlowableRepeatWhen$WhenReceiver(moy0 moy0Var) {
        this.a = moy0Var;
    }

    @Override // p.pnc1
    public final void cancel() {
        SubscriptionHelper.a(this.b);
    }

    @Override // p.gnc1
    public final void onComplete() {
        this.d.cancel();
        this.d.i.onComplete();
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        this.d.cancel();
        this.d.i.onError(th);
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != SubscriptionHelper.a) {
                this.a.subscribe(this.d);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        SubscriptionHelper.c(this.b, this.c, pnc1Var);
    }

    @Override // p.pnc1
    public final void request(long j) {
        SubscriptionHelper.b(this.b, this.c, j);
    }
}
