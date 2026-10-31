package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import p.moy0;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableFromPublisher<T> extends Observable<T> {
    public final moy0 a;

    public static final class PublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        public final Observer a;
        public pnc1 b;

        public PublisherSubscriber(Observer observer) {
            this.a = observer;
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
            this.a.onNext(obj);
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

    public ObservableFromPublisher(moy0 moy0Var) {
        this.a = moy0Var;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        this.a.subscribe(new PublisherSubscriber(observer));
    }
}
