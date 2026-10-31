package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableIgnoreElementsCompletable<T> extends Completable implements FuseToFlowable<T> {
    public final Flowable a;

    public static final class IgnoreElementsSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final CompletableObserver a;
        public pnc1 b;

        public IgnoreElementsSubscriber(CompletableObserver completableObserver) {
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
            this.b = SubscriptionHelper.a;
            this.a.onComplete();
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.b = SubscriptionHelper.a;
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

    public FlowableIgnoreElementsCompletable(Flowable flowable) {
        this.a = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public final Flowable b() {
        return new FlowableIgnoreElements(this.a);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void r(CompletableObserver completableObserver) {
        this.a.subscribe((FlowableSubscriber) new IgnoreElementsSubscriber(completableObserver));
    }
}
