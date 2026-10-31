package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {
    public final Observable a;
    public final Object b;
    public final BiFunction c;

    public static final class ReduceSeedObserver<T, R> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final BiFunction b;
        public Object c;
        public Disposable d;

        public ReduceSeedObserver(SingleObserver singleObserver, BiFunction biFunction, Object obj) {
            this.a = singleObserver;
            this.c = obj;
            this.b = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            Object obj = this.c;
            if (obj != null) {
                this.c = null;
                this.a.onSuccess(obj);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.c == null) {
                RxJavaPlugins.b(th);
            } else {
                this.c = null;
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            Object obj2 = this.c;
            if (obj2 != null) {
                try {
                    Object objApply = this.b.apply(obj2, obj);
                    Objects.requireNonNull(objApply, "The reducer returned a null value");
                    this.c = objApply;
                } catch (Throwable th) {
                    Exceptions.a(th);
                    this.d.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableReduceSeedSingle(Observable observable, Object obj, BiFunction biFunction) {
        this.a = observable;
        this.b = obj;
        this.c = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new ReduceSeedObserver(singleObserver, this.c, this.b));
    }
}
