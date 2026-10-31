package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.gvg;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableInterval$IntervalSubscriber extends AtomicLong implements pnc1, Runnable {
    public final gnc1 a;
    public long b;
    public final AtomicReference c = new AtomicReference();

    public FlowableInterval$IntervalSubscriber(gnc1 gnc1Var) {
        this.a = gnc1Var;
    }

    public final void a(Disposable disposable) {
        DisposableHelper.g(this.c, disposable);
    }

    public final void cancel() {
        DisposableHelper.a(this.c);
    }

    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            BackpressureHelper.a(this, j);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.c;
        if (atomicReference.get() != DisposableHelper.a) {
            long j = get();
            long j2 = this.b;
            gnc1 gnc1Var = this.a;
            if (j == 0) {
                gnc1Var.onError(new MissingBackpressureException(gvg.f(j2, "Can't deliver value ", " due to lack of requests")));
                DisposableHelper.a(atomicReference);
            } else {
                this.b = j2 + 1;
                gnc1Var.onNext(Long.valueOf(j2));
                BackpressureHelper.e(this, 1L);
            }
        }
    }
}
