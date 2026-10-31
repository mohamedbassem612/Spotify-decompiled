package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableOnBackpressureError<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public pnc1 b;
        public boolean c;

        public BackpressureErrorSubscriber(gnc1 gnc1Var) {
            this.a = gnc1Var;
        }

        public final void cancel() {
            this.b.cancel();
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
            } else {
                this.c = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.c) {
                return;
            }
            if (get() != 0) {
                this.a.onNext(obj);
                BackpressureHelper.e(this, 1L);
            } else {
                this.b.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }

        public final void request(long j) {
            if (SubscriptionHelper.e(j)) {
                BackpressureHelper.a(this, j);
            }
        }
    }

    public FlowableOnBackpressureError(FlowableFromObservable flowableFromObservable) {
        super(flowableFromObservable);
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new BackpressureErrorSubscriber(gnc1Var));
    }
}
