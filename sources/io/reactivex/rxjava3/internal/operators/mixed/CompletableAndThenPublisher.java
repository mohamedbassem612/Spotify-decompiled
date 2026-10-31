package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    public final Completable b;
    public final FlowableObserveOn c;

    public CompletableAndThenPublisher(Completable completable, FlowableObserveOn flowableObserveOn) {
        this.b = completable;
        this.c = flowableObserveOn;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new AndThenPublisherSubscriber(gnc1Var, this.c));
    }

    public static final class AndThenPublisherSubscriber<R> extends AtomicReference<pnc1> implements FlowableSubscriber<R>, CompletableObserver, pnc1 {
        public final gnc1 a;
        public moy0 b;
        public Disposable c;
        public final AtomicLong d = new AtomicLong();

        public AndThenPublisherSubscriber(gnc1 gnc1Var, FlowableObserveOn flowableObserveOn) {
            this.a = gnc1Var;
            this.b = flowableObserveOn;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.c.dispose();
            SubscriptionHelper.a(this);
        }

        @Override // p.gnc1
        public final void onComplete() {
            moy0 moy0Var = this.b;
            if (moy0Var == null) {
                this.a.onComplete();
            } else {
                this.b = null;
                moy0Var.subscribe(this);
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        @Override // p.pnc1
        public final void request(long j) {
            SubscriptionHelper.b(this, this.d, j);
        }

        @Override // p.gnc1
        public final void onSubscribe(pnc1 pnc1Var) {
            SubscriptionHelper.c(this, this.d, pnc1Var);
        }
    }
}
