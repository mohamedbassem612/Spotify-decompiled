package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {
    public final Observable a;

    public static final class LastObserver<T> implements Observer<T>, Disposable {
        public final MaybeObserver a;
        public Disposable b;
        public Object c;

        public LastObserver(MaybeObserver maybeObserver) {
            this.a = maybeObserver;
        }

        public void dispose() {
            this.b.dispose();
            this.b = DisposableHelper.a;
        }

        public boolean isDisposed() {
            return this.b == DisposableHelper.a;
        }

        public final void onComplete() {
            this.b = DisposableHelper.a;
            Object obj = this.c;
            MaybeObserver maybeObserver = this.a;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                this.c = null;
                maybeObserver.onSuccess(obj);
            }
        }

        public final void onError(Throwable th) {
            this.b = DisposableHelper.a;
            this.c = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.c = obj;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableLastMaybe(Observable observable) {
        this.a = observable;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new LastObserver(maybeObserver));
    }
}
