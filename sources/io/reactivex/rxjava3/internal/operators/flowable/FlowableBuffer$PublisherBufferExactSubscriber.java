package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableBuffer$PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public final Supplier b;
    public final byte c;
    public Collection d;
    public pnc1 e;
    public boolean f;
    public int g;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowableBuffer$PublisherBufferExactSubscriber(gnc1 gnc1Var, int i, Supplier supplier) {
        this.a = gnc1Var;
        this.c = i;
        this.b = supplier;
    }

    public final void cancel() {
        this.e.cancel();
    }

    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        Collection collection = this.d;
        this.d = null;
        gnc1 gnc1Var = this.a;
        if (collection != null) {
            gnc1Var.onNext(collection);
        }
        gnc1Var.onComplete();
    }

    public final void onError(Throwable th) {
        if (this.f) {
            RxJavaPlugins.b(th);
            return;
        }
        this.d = null;
        this.f = true;
        this.a.onError(th);
    }

    public final void onNext(Object obj) {
        if (this.f) {
            return;
        }
        Collection collection = this.d;
        if (collection == null) {
            try {
                Object obj2 = this.b.get();
                Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                collection = (Collection) obj2;
                this.d = collection;
            } catch (Throwable th) {
                Exceptions.a(th);
                cancel();
                onError(th);
                return;
            }
        }
        collection.add(obj);
        int i = this.g + 1;
        if (i != this.c) {
            this.g = i;
            return;
        }
        this.g = 0;
        this.d = null;
        this.a.onNext(collection);
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.e, pnc1Var)) {
            this.e = pnc1Var;
            this.a.onSubscribe(this);
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            this.e.request(BackpressureHelper.d(j, this.c));
        }
    }
}
