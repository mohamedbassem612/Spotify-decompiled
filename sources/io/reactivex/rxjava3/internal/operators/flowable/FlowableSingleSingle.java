package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {
    public final Flowable a;

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final SingleObserver a;
        public pnc1 b;
        public boolean c;
        public Object d;

        public SingleElementSubscriber(SingleObserver singleObserver) {
            this.a = singleObserver;
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
            if (this.c) {
                return;
            }
            this.c = true;
            this.b = SubscriptionHelper.a;
            Object obj = this.d;
            this.d = null;
            if (obj == null) {
                obj = null;
            }
            SingleObserver singleObserver = this.a;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // p.gnc1
        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
                return;
            }
            this.c = true;
            this.b = SubscriptionHelper.a;
            this.a.onError(th);
        }

        @Override // p.gnc1
        public final void onNext(Object obj) {
            if (this.c) {
                return;
            }
            if (this.d == null) {
                this.d = obj;
                return;
            }
            this.c = true;
            this.b.cancel();
            this.b = SubscriptionHelper.a;
            this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
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

    public FlowableSingleSingle(Flowable flowable) {
        this.a = flowable;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public final Flowable b() {
        return new FlowableSingle(this.a, true);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe((FlowableSubscriber) new SingleElementSubscriber(singleObserver));
    }
}
