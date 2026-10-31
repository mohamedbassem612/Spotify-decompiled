package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {
    public final Single a;
    public final moy0 b;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public final TakeUntilOtherSubscriber b = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public final void a(Throwable th) {
            Disposable andSet;
            Disposable disposable = get();
            Disposable disposable2 = DisposableHelper.a;
            if (disposable == disposable2 || (andSet = getAndSet(disposable2)) == disposable2) {
                RxJavaPlugins.b(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.a.onError(th);
        }

        public void dispose() {
            DisposableHelper.a(this);
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onError(Throwable th) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
            Disposable disposable = get();
            Disposable disposable2 = DisposableHelper.a;
            if (disposable == disposable2 || getAndSet(disposable2) == disposable2) {
                RxJavaPlugins.b(th);
            } else {
                this.a.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.g(this, disposable);
        }

        public final void onSuccess(Object obj) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.a(takeUntilOtherSubscriber);
            Disposable disposable = DisposableHelper.a;
            if (getAndSet(disposable) != disposable) {
                this.a.onSuccess(obj);
            }
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<pnc1> implements FlowableSubscriber<Object> {
        public final TakeUntilMainObserver a;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver takeUntilMainObserver) {
            this.a = takeUntilMainObserver;
        }

        public final void onComplete() {
            SubscriptionHelper subscriptionHelper = get();
            SubscriptionHelper subscriptionHelper2 = SubscriptionHelper.a;
            if (subscriptionHelper != subscriptionHelper2) {
                lazySet(subscriptionHelper2);
                this.a.a(new CancellationException());
            }
        }

        public final void onError(Throwable th) {
            this.a.a(th);
        }

        public final void onNext(Object obj) {
            if (SubscriptionHelper.a(this)) {
                this.a.a(new CancellationException());
            }
        }

        public final void onSubscribe(pnc1 pnc1Var) {
            if (SubscriptionHelper.d(this, pnc1Var)) {
                pnc1Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleTakeUntil(Single single, moy0 moy0Var) {
        this.a = single;
        this.b = moy0Var;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(singleObserver);
        singleObserver.onSubscribe(takeUntilMainObserver);
        this.b.subscribe(takeUntilMainObserver.b);
        this.a.subscribe(takeUntilMainObserver);
    }
}
