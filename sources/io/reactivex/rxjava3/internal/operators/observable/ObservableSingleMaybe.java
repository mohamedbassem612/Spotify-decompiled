package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {
    public final Observable a;

    public static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        public final MaybeObserver a;
        public Disposable b;
        public Object c;
        public boolean d;

        public SingleElementObserver(MaybeObserver maybeObserver) {
            this.a = maybeObserver;
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            Object obj = this.c;
            this.c = null;
            MaybeObserver maybeObserver = this.a;
            if (obj == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(obj);
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.b(th);
            } else {
                this.d = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.d) {
                return;
            }
            if (this.c == null) {
                this.c = obj;
                return;
            }
            this.d = true;
            this.b.dispose();
            this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleMaybe(Observable observable) {
        this.a = observable;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new SingleElementObserver(maybeObserver));
    }
}
