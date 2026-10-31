package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public pnc1 b;
    public Object c;
    public long d;

    public SinglePostCompleteSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    public final void a(Object obj) {
        long j = this.d;
        if (j != 0) {
            BackpressureHelper.e(this, j);
        }
        while (true) {
            long j2 = get();
            if ((j2 & Long.MIN_VALUE) != 0) {
                return;
            }
            if ((j2 & Long.MAX_VALUE) != 0) {
                lazySet(-9223372036854775807L);
                gnc1 gnc1Var = this.a;
                gnc1Var.onNext(obj);
                gnc1Var.onComplete();
                return;
            }
            this.c = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.c = null;
            }
        }
    }

    @Override // p.pnc1
    public void cancel() {
        this.b.cancel();
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.b, pnc1Var)) {
            this.b = pnc1Var;
            this.a.onSubscribe(this);
        }
    }

    public void onSuccess(Object obj) {
        a(obj);
    }

    @Override // p.pnc1
    public final void request(long j) {
        long j2;
        if (SubscriptionHelper.e(j)) {
            do {
                j2 = get();
                if ((j2 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj = this.c;
                        gnc1 gnc1Var = this.a;
                        gnc1Var.onNext(obj);
                        gnc1Var.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j2, BackpressureHelper.c(j2, j)));
            this.b.request(j);
        }
    }
}
