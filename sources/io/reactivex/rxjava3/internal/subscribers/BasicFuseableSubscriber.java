package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.operators.QueueSubscription;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    public final gnc1 a;
    public pnc1 b;
    public QueueSubscription c;
    public boolean d;
    public int e;

    public BasicFuseableSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public int a(int i) {
        QueueSubscription queueSubscription = this.c;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int iA = queueSubscription.a(i);
        if (iA == 0) {
            return iA;
        }
        this.e = iA;
        return iA;
    }

    public final void b(Throwable th) {
        Exceptions.a(th);
        this.b.cancel();
        onError(th);
    }

    @Override // p.pnc1
    public final void cancel() {
        this.b.cancel();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        this.c.clear();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p.gnc1
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // p.gnc1
    public void onError(Throwable th) {
        if (this.d) {
            RxJavaPlugins.b(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.b, pnc1Var)) {
            this.b = pnc1Var;
            if (pnc1Var instanceof QueueSubscription) {
                this.c = (QueueSubscription) pnc1Var;
            }
            this.a.onSubscribe(this);
        }
    }

    @Override // p.pnc1
    public final void request(long j) {
        this.b.request(j);
    }
}
