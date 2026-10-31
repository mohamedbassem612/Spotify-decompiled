package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.concurrent.atomic.AtomicReference;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<pnc1> implements FlowableSubscriber<T>, pnc1 {
    public final InnerQueuedSubscriberSupport a;
    public final int b;
    public final int c;
    public volatile SimpleQueue d;
    public volatile boolean e;
    public long f;
    public int g;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport innerQueuedSubscriberSupport, int i) {
        this.a = innerQueuedSubscriberSupport;
        this.b = i;
        this.c = i - (i >> 2);
    }

    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    public final void onComplete() {
        this.a.b(this);
    }

    public final void onError(Throwable th) {
        this.a.c(this, th);
    }

    public final void onNext(Object obj) {
        int i = this.g;
        InnerQueuedSubscriberSupport innerQueuedSubscriberSupport = this.a;
        if (i == 0) {
            innerQueuedSubscriberSupport.d(this, obj);
        } else {
            innerQueuedSubscriberSupport.a();
        }
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.d(this, pnc1Var)) {
            if (pnc1Var instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) pnc1Var;
                int iA = queueSubscription.a(3);
                if (iA == 1) {
                    this.g = iA;
                    this.d = queueSubscription;
                    this.e = true;
                    this.a.b(this);
                    return;
                }
                if (iA == 2) {
                    this.g = iA;
                    this.d = queueSubscription;
                    int i = this.b;
                    pnc1Var.request(i >= 0 ? i : Long.MAX_VALUE);
                    return;
                }
            }
            this.d = QueueDrainHelper.b(this.b);
            int i2 = this.b;
            pnc1Var.request(i2 >= 0 ? i2 : Long.MAX_VALUE);
        }
    }

    public final void request(long j) {
        if (this.g != 1) {
            long j2 = this.f + j;
            if (j2 < this.c) {
                this.f = j2;
            } else {
                this.f = 0L;
                get().request(j2);
            }
        }
    }
}
