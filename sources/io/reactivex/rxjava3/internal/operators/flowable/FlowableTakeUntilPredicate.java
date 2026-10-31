package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Predicate c;

    public static final class InnerSubscriber<T> implements FlowableSubscriber<T>, pnc1 {
        public final gnc1 a;
        public final Predicate b;
        public pnc1 c;
        public boolean d;

        public InnerSubscriber(gnc1 gnc1Var, Predicate predicate) {
            this.a = gnc1Var;
            this.b = predicate;
        }

        public final void cancel() {
            this.c.cancel();
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            gnc1 gnc1Var = this.a;
            gnc1Var.onNext(obj);
            try {
                if (this.b.test(obj)) {
                    this.d = true;
                    this.c.cancel();
                    gnc1Var.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c.cancel();
                onError(th);
            }
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

    public FlowableTakeUntilPredicate(Flowable flowable, Predicate predicate) {
        super(flowable);
        this.c = predicate;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new InnerSubscriber(gnc1Var, this.c));
    }
}
