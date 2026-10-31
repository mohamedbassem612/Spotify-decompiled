package io.reactivex.rxjava3.internal.subscriptions;

import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    public final gnc1 a;
    public Object b;

    public DeferredScalarSubscription(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    public final int a(int i) {
        lazySet(8);
        return 2;
    }

    public final void b(Object obj) {
        int i = get();
        do {
            gnc1 gnc1Var = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                gnc1Var.onNext(null);
                if (get() != 4) {
                    gnc1Var.onComplete();
                    return;
                }
                return;
            }
            if ((i & (-3)) != 0) {
                return;
            }
            if (i == 2) {
                lazySet(3);
                gnc1Var.onNext(obj);
                if (get() != 4) {
                    gnc1Var.onComplete();
                    return;
                }
                return;
            }
            this.b = obj;
            if (compareAndSet(0, 1)) {
                return;
            } else {
                i = get();
            }
        } while (i != 4);
        this.b = null;
    }

    public void cancel() {
        set(4);
        this.b = null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        b(obj);
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // p.pnc1
    public final void request(long j) {
        Object obj;
        if (SubscriptionHelper.e(j)) {
            do {
                int i = get();
                if ((i & (-2)) != 0) {
                    return;
                }
                if (i == 1) {
                    if (!compareAndSet(1, 3) || (obj = this.b) == null) {
                        return;
                    }
                    this.b = null;
                    gnc1 gnc1Var = this.a;
                    gnc1Var.onNext(obj);
                    if (get() != 4) {
                        gnc1Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
