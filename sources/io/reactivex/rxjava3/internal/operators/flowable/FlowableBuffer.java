package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BooleanSupplier;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ArrayListSupplier;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    public final byte c;
    public final boolean d;
    public final Supplier e;

    public static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, pnc1, BooleanSupplier {
        public long X;
        public final gnc1 a;
        public final Supplier b;
        public final byte c;
        public final boolean d;
        public pnc1 g;
        public boolean h;
        public int i;
        public volatile boolean t;
        public final AtomicBoolean f = new AtomicBoolean();
        public final ArrayDeque e = new ArrayDeque();

        /* JADX WARN: Multi-variable type inference failed */
        public PublisherBufferOverlappingSubscriber(gnc1 gnc1Var, int i, int i2, Supplier supplier) {
            this.a = gnc1Var;
            this.c = i;
            this.d = i2;
            this.b = supplier;
        }

        @Override // io.reactivex.rxjava3.functions.BooleanSupplier
        public final boolean a() {
            return this.t;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.t = true;
            this.g.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            long j = this.X;
            if (j != 0) {
                BackpressureHelper.e(this, j);
            }
            QueueDrainHelper.d(this.a, this.e, this, this);
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.h) {
                RxJavaPlugins.b(th);
                return;
            }
            this.h = true;
            this.e.clear();
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.h) {
                return;
            }
            int i = this.i;
            int i2 = i + 1;
            ArrayDeque arrayDeque = this.e;
            if (i == 0) {
                try {
                    Object obj2 = this.b.get();
                    Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
                    arrayDeque.offer((Collection) obj2);
                } catch (Throwable th) {
                    Exceptions.a(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection.size() + 1 == this.c) {
                arrayDeque.poll();
                collection.add(obj);
                this.X++;
                this.a.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(obj);
            }
            if (i2 == this.d) {
                i2 = 0;
            }
            this.i = i2;
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.g, pnc1Var)) {
                this.g = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (!SubscriptionHelper.e(j) || QueueDrainHelper.f(j, this.a, this.e, this, this)) {
                return;
            }
            AtomicBoolean atomicBoolean = this.f;
            boolean z = atomicBoolean.get();
            boolean z2 = this.d;
            if (z || !atomicBoolean.compareAndSet(false, true)) {
                this.g.request(BackpressureHelper.d(z2 ? 1L : 0L, j));
            } else {
                this.g.request(BackpressureHelper.c(this.c, BackpressureHelper.d(z2 ? 1L : 0L, j - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable flowable) {
        super(flowable);
        this.c = (byte) 2;
        this.d = true;
        this.e = ArrayListSupplier.a;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        Flowable flowable = this.b;
        Supplier supplier = this.e;
        byte b = this.c;
        ?? r4 = this.d;
        if (b == r4) {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(gnc1Var, b, supplier));
        } else if (r4 > b) {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(gnc1Var, b, r4 == true ? 1 : 0, supplier));
        } else {
            flowable.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(gnc1Var, b, r4 == true ? 1 : 0, supplier));
        }
    }
}
