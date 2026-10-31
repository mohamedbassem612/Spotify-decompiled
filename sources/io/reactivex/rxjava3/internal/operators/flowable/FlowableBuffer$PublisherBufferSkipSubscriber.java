package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableBuffer$PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, pnc1 {
    public final gnc1 a;
    public final Supplier b;
    public final byte c;
    public final boolean d;
    public Collection e;
    public pnc1 f;
    public boolean g;
    public int h;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowableBuffer$PublisherBufferSkipSubscriber(gnc1 gnc1Var, int i, int i2, Supplier supplier) {
        this.a = gnc1Var;
        this.c = i;
        this.d = i2;
        this.b = supplier;
    }

    public final void cancel() {
        this.f.cancel();
    }

    public final void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        Collection collection = this.e;
        this.e = null;
        gnc1 gnc1Var = this.a;
        if (collection != null) {
            gnc1Var.onNext(collection);
        }
        gnc1Var.onComplete();
    }

    public final void onError(Throwable th) {
        if (this.g) {
            RxJavaPlugins.b(th);
            return;
        }
        this.g = true;
        this.e = null;
        this.a.onError(th);
    }

    public final void onNext(Object obj) {
        if (this.g) {
            return;
        }
        Collection collection = this.e;
        int i = this.h;
        int i2 = i + 1;
        if (i == 0) {
            try {
                Object obj2 = this.b.get();
                Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                collection = (Collection) obj2;
                this.e = collection;
            } catch (Throwable th) {
                Exceptions.a(th);
                cancel();
                onError(th);
                return;
            }
        }
        if (collection != null) {
            collection.add(obj);
            if (collection.size() == this.c) {
                this.e = null;
                this.a.onNext(collection);
            }
        }
        if (i2 == this.d) {
            i2 = 0;
        }
        this.h = i2;
    }

    public final void onSubscribe(pnc1 pnc1Var) {
        if (SubscriptionHelper.f(this.f, pnc1Var)) {
            this.f = pnc1Var;
            this.a.onSubscribe(this);
        }
    }

    public final void request(long j) {
        if (SubscriptionHelper.e(j)) {
            int i = get();
            boolean z = this.d;
            if (i != 0 || !compareAndSet(0, 1)) {
                this.f.request(BackpressureHelper.d(z ? 1L : 0L, j));
                return;
            }
            byte b = this.c;
            this.f.request(BackpressureHelper.c(BackpressureHelper.d(j, b), BackpressureHelper.d((z ? 1 : 0) - b, j - 1)));
        }
    }
}
