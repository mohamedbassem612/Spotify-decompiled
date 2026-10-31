package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {
    public final Flowable a;

    public static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final MaybeObserver a;
        public pnc1 b;
        public boolean c;
        public Object d;

        public SingleElementSubscriber(MaybeObserver maybeObserver) {
            this.a = maybeObserver;
        }

        public void dispose() {
            this.b.cancel();
            this.b = SubscriptionHelper.a;
        }

        public boolean isDisposed() {
            return this.b == SubscriptionHelper.a;
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b = SubscriptionHelper.a;
            Object obj = this.d;
            this.d = null;
            MaybeObserver maybeObserver = this.a;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
                return;
            }
            this.c = true;
            this.b = SubscriptionHelper.a;
            this.a.onError(th);
        }

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

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable flowable) {
        this.a = flowable;
    }

    public final Flowable b() {
        return new FlowableSingle(this.a, false);
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new SingleElementSubscriber(maybeObserver));
    }
}
