package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import p.gnc1;
import p.pnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableFromObservable<T> extends Flowable<T> {
    public final Observable b;

    public static final class SubscriberObserver<T> implements Observer<T>, pnc1 {
        public final gnc1 a;
        public Disposable b;

        public SubscriberObserver(gnc1 gnc1Var) {
            this.a = gnc1Var;
        }

        @Override // p.pnc1
        public final void cancel() {
            this.b.dispose();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }

        @Override // p.pnc1
        public final void request(long j) {
        }
    }

    public FlowableFromObservable(Observable observable) {
        this.b = observable;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void V(gnc1 gnc1Var) {
        this.b.subscribe(new SubscriberObserver(gnc1Var));
    }
}
