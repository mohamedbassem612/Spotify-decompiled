package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.operators.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    public final Object a;
    public final gnc1 b;

    public ScalarSubscription(Object obj, gnc1 gnc1Var) {
        this.b = gnc1Var;
        this.a = obj;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public final int a(int i) {
        return 1;
    }

    @Override // p.pnc1
    public final void cancel() {
        lazySet(2);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    @Override // p.pnc1
    public final void request(long j) {
        if (SubscriptionHelper.e(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            gnc1 gnc1Var = this.b;
            gnc1Var.onNext(obj);
            if (get() != 2) {
                gnc1Var.onComplete();
            }
        }
    }
}
