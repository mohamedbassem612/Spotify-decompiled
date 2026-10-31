package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableLastSingle<T> extends Single<T> {
    public final Observable a;
    public final Object b;

    public static final class LastObserver<T> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final Object b;
        public Disposable c;
        public Object d;

        public LastObserver(SingleObserver singleObserver, Object obj) {
            this.a = singleObserver;
            this.b = obj;
        }

        public void dispose() {
            this.c.dispose();
            this.c = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.c == DisposableHelper.a;
        }

        public final void onComplete() {
            this.c = DisposableHelper.a;
            Object obj = this.d;
            SingleObserver singleObserver = this.a;
            if (obj != null) {
                this.d = null;
                singleObserver.onSuccess(obj);
                return;
            }
            Object obj2 = this.b;
            if (obj2 != null) {
                singleObserver.onSuccess(obj2);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        public final void onError(Throwable th) {
            this.c = DisposableHelper.a;
            this.d = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.d = obj;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableLastSingle(Observable observable, Object obj) {
        this.a = observable;
        this.b = obj;
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new LastObserver(singleObserver, this.b));
    }
}
