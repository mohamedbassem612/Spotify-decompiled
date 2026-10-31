package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleHide<T> extends Single<T> {
    public final Single a;

    public static final class HideSingleObserver<T> implements SingleObserver<T>, Disposable {
        public final SingleObserver a;
        public Disposable b;

        public HideSingleObserver(SingleObserver singleObserver) {
            this.a = singleObserver;
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.a.onSuccess(obj);
        }
    }

    public SingleHide(Single single) {
        this.a = single;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new HideSingleObserver(singleObserver));
    }
}
