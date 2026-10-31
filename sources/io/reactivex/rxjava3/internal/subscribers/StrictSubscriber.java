package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.l1d;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public final AtomicThrowable b = new AtomicThrowable();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference d = new AtomicReference();
    public final AtomicBoolean e = new AtomicBoolean();
    public volatile boolean f;

    public StrictSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    @Override // p.pnc1
    public final void cancel() {
        if (this.f) {
            return;
        }
        SubscriptionHelper.a(this.d);
    }

    @Override // p.gnc1
    public final void onComplete() {
        this.f = true;
        gnc1 gnc1Var = this.a;
        AtomicThrowable atomicThrowable = this.b;
        if (getAndIncrement() == 0) {
            atomicThrowable.e(gnc1Var);
        }
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        this.f = true;
        gnc1 gnc1Var = this.a;
        AtomicThrowable atomicThrowable = this.b;
        if (atomicThrowable.a(th) && getAndIncrement() == 0) {
            atomicThrowable.e(gnc1Var);
        }
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        HalfSerializer.d(this.a, obj, this, this.b);
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        if (this.e.compareAndSet(false, true)) {
            this.a.onSubscribe(this);
            SubscriptionHelper.c(this.d, this.c, pnc1Var);
        } else {
            pnc1Var.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p.pnc1
    public final void request(long j) {
        if (j > 0) {
            SubscriptionHelper.b(this.d, this.c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(l1d.l(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }
}
