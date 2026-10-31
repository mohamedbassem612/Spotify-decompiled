package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableFromPublisher<T> extends Completable {
    public final FlowableRetryPredicate a;

    public static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver a;
        public pnc1 b;

        public FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.a = completableObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.b.cancel();
            this.b = SubscriptionHelper.a;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.b == SubscriptionHelper.a;
        }

        @Override // p.gnc1
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public CompletableFromPublisher(FlowableRetryPredicate flowableRetryPredicate) {
        this.a = flowableRetryPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe((gnc1) new FromPublisherSubscriber(completableObserver));
    }
}
