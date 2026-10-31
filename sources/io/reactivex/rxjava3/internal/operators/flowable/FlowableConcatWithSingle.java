package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableConcatWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    public final Single c;

    public static final class ConcatWithSubscriber<T> extends SinglePostCompleteSubscriber<T, T> implements SingleObserver<T> {
        public final AtomicReference e;
        public SingleSource f;

        public ConcatWithSubscriber(gnc1 gnc1Var, Single single) {
            super(gnc1Var);
            this.f = single;
            this.e = new AtomicReference();
        }

        public final void cancel() {
            super.cancel();
            DisposableHelper.a(this.e);
        }

        public final void onComplete() {
            ((SinglePostCompleteSubscriber) this).b = SubscriptionHelper.a;
            SingleSource singleSource = this.f;
            this.f = null;
            singleSource.subscribe(this);
        }

        public final void onError(Throwable th) {
            ((SinglePostCompleteSubscriber) this).a.onError(th);
        }

        public final void onNext(Object obj) {
            ((SinglePostCompleteSubscriber) this).d++;
            ((SinglePostCompleteSubscriber) this).a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this.e, disposable);
        }
    }

    public FlowableConcatWithSingle(Flowable flowable, Single single) {
        super(flowable);
        this.c = single;
    }

    public final void V(gnc1 gnc1Var) {
        ((AbstractFlowableWithUpstream) this).b.subscribe(new ConcatWithSubscriber(gnc1Var, this.c));
    }
}
