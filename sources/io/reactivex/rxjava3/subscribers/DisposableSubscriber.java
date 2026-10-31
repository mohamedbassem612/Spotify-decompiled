package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    public final AtomicReference a = new AtomicReference();

    public final void dispose() {
        SubscriptionHelper.a(this.a);
    }

    public final boolean isDisposed() {
        return this.a.get() == SubscriptionHelper.a;
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        Objects.requireNonNull(pnc1Var, "next is null");
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(null, pnc1Var)) {
                ((pnc1) atomicReference.get()).request(Long.MAX_VALUE);
                return;
            }
        } while (atomicReference.get() == null);
        pnc1Var.cancel();
        if (atomicReference.get() != SubscriptionHelper.a) {
            EndConsumerHelper.a(cls);
        }
    }
}
