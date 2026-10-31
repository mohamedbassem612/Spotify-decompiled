package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDetach<T> extends Single<T> {
    public final Single a;

    public static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {
        public SingleObserver a;
        public Disposable b;

        public void dispose() {
            this.a = null;
            this.b.dispose();
            this.b = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onError(Throwable th) {
            this.b = DisposableHelper.a;
            SingleObserver singleObserver = this.a;
            if (singleObserver != null) {
                this.a = null;
                singleObserver.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void onSuccess(Object obj) {
            this.b = DisposableHelper.a;
            SingleObserver singleObserver = this.a;
            if (singleObserver != null) {
                this.a = null;
                singleObserver.onSuccess(obj);
            }
        }
    }

    public SingleDetach(Single single) {
        this.a = single;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        DetachSingleObserver detachSingleObserver = new DetachSingleObserver();
        detachSingleObserver.a = singleObserver;
        this.a.subscribe(detachSingleObserver);
    }
}
