package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableUnsubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Scheduler c;

    public static final class UnsubscribeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Scheduler b;
        public pnc1 c;

        public final class Cancellation implements Runnable {
            public Cancellation() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                UnsubscribeSubscriber.this.c.cancel();
            }
        }

        public UnsubscribeSubscriber(gnc1 gnc1Var, Scheduler scheduler) {
            this.a = gnc1Var;
            this.b = scheduler;
        }

        public final void cancel() {
            if (compareAndSet(false, true)) {
                this.b.c(new Cancellation());
            }
        }

        public final void onComplete() {
            if (get()) {
                return;
            }
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (get()) {
                RxJavaPlugins.b(th);
            } else {
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (get()) {
                return;
            }
            this.a.onNext(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.c, pnc1Var)) {
                this.c = pnc1Var;
                this.a.onSubscribe(this);
            }
        }

        public final void request(long j) {
            this.c.request(j);
        }
    }

    public FlowableUnsubscribeOn(FlowableSubscribeOn flowableSubscribeOn, Scheduler scheduler) {
        super(flowableSubscribeOn);
        this.c = scheduler;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new UnsubscribeSubscriber(gnc1Var, this.c));
    }
}
