package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.ResumeSingleObserver;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDelayWithPublisher<T, U> extends Single<T> {
    public final Single a;
    public final moy0 b;

    public static final class OtherSubscriber<T, U> extends AtomicReference<Disposable> implements FlowableSubscriber<U>, Disposable {
        public final SingleObserver a;
        public final SingleSource b;
        public boolean c;
        public pnc1 d;

        public OtherSubscriber(Single single, SingleObserver singleObserver) {
            this.a = singleObserver;
            this.b = single;
        }

        public void dispose() {
            this.d.cancel();
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            this.b.subscribe(new ResumeSingleObserver(this.a, this));
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
            this.d.cancel();
            onComplete();
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.f(this.d, pnc1Var)) {
                this.d = pnc1Var;
                this.a.onSubscribe(this);
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleDelayWithPublisher(Single single, moy0 moy0Var) {
        this.a = single;
        this.b = moy0Var;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.b.subscribe(new OtherSubscriber(this.a, singleObserver));
    }
}
