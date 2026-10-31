package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {
    public final Observable a;

    public static final class CountObserver implements Observer<Object>, Disposable {
        public final SingleObserver a;
        public Disposable b;
        public long c;

        public CountObserver(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public void dispose() {
            this.b.dispose();
            this.b = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            this.b = DisposableHelper.a;
            this.a.onSuccess(Long.valueOf(this.c));
        }

        public final void onError(Throwable th) {
            this.b = DisposableHelper.a;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.c++;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableCountSingle(Observable observable) {
        this.a = observable;
    }

    public final Observable a() {
        return new ObservableCount(this.a);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new CountObserver(singleObserver));
    }
}
