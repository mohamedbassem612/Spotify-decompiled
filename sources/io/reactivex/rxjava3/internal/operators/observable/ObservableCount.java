package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCount<T> extends AbstractObservableWithUpstream<T, Long> {

    public static final class CountObserver implements Observer<Object>, Disposable {
        public final Observer a;
        public Disposable b;
        public long c;

        public CountObserver(Observer observer) {
            this.a = observer;
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            Long lValueOf = Long.valueOf(this.c);
            Observer observer = this.a;
            observer.onNext(lValueOf);
            observer.onComplete();
        }

        public final void onError(Throwable th) {
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

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new CountObserver(observer));
    }
}
