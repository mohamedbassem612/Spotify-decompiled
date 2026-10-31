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
public final class FlowableElementAtMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {
    public final Flowable a;

    public static final class ElementAtSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final MaybeObserver a;
        public pnc1 b;
        public long c;
        public boolean d;

        public ElementAtSubscriber(MaybeObserver maybeObserver) {
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
            this.b = SubscriptionHelper.a;
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
                return;
            }
            this.d = true;
            this.b = SubscriptionHelper.a;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            long j = this.c;
            if (j != 0) {
                this.c = j + 1;
                return;
            }
            this.d = true;
            this.b.cancel();
            this.b = SubscriptionHelper.a;
            this.a.onSuccess(obj);
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.b, pnc1Var)) {
                this.b = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(1L);
            }
        }
    }

    public FlowableElementAtMaybe(Flowable flowable) {
        this.a = flowable;
    }

    public final Flowable b() {
        return new FlowableElementAt(this.a, null, false);
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new ElementAtSubscriber(maybeObserver));
    }
}
