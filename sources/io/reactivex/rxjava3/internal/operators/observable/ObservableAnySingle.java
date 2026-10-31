package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {
    public final Observable a;
    public final Predicate b;

    public static final class AnyObserver<T> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final Predicate b;
        public Disposable c;
        public boolean d;

        public AnyObserver(SingleObserver singleObserver, Predicate predicate) {
            this.a = singleObserver;
            this.b = predicate;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            if (this.d) {
                return;
            }
            this.d = true;
            this.a.onSuccess(Boolean.FALSE);
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
            try {
                if (this.b.test(obj)) {
                    this.d = true;
                    this.c.dispose();
                    this.a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                this.c.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableAnySingle(Observable observable, Predicate predicate) {
        this.a = observable;
        this.b = predicate;
    }

    public final Observable a() {
        return new ObservableAny(this.a, this.b);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new AnyObserver(singleObserver, this.b));
    }
}
