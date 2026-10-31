package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {
    public final FlowableOnBackpressureDrop c;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Consumer b;
        public pnc1 c;
        public boolean d;

        public BackpressureDropSubscriber(gnc1 gnc1Var, FlowableOnBackpressureDrop flowableOnBackpressureDrop) {
            this.a = gnc1Var;
            this.b = flowableOnBackpressureDrop;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.cancel();
        }

        @Override // p.gnc1
        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            if (get() != 0) {
                this.a.onNext(obj);
                BackpressureHelper.e(this, 1L);
                return;
            }
            try {
                this.b.accept(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                cancel();
                onError(th);
            }
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this, j);
            }
        }
    }

    public FlowableOnBackpressureDrop(Flowable flowable) {
        super(flowable);
        this.c = this;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe((FlowableSubscriber) new BackpressureDropSubscriber(gnc1Var, this.c));
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
    }
}
