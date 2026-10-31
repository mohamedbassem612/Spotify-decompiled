package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {
    public final Observable a;
    public final BiFunction b;

    public static final class ReduceObserver<T> implements Observer<T>, Disposable {
        public final MaybeObserver a;
        public final BiFunction b;
        public boolean c;
        public Object d;
        public Disposable e;

        public ReduceObserver(MaybeObserver maybeObserver, BiFunction biFunction) {
            this.a = maybeObserver;
            this.b = biFunction;
        }

        public void dispose() {
            this.e.dispose();
        }

        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        public final void onComplete() {
            if (this.c) {
                return;
            }
            this.c = true;
            Object obj = this.d;
            this.d = null;
            MaybeObserver maybeObserver = this.a;
            if (obj != null) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.b(th);
                return;
            }
            this.c = true;
            this.d = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.c) {
                return;
            }
            Object obj2 = this.d;
            if (obj2 == null) {
                this.d = obj;
                return;
            }
            try {
                Object objApply = this.b.apply(obj2, obj);
                Objects.requireNonNull(objApply, "The reducer returned a null value");
                this.d = objApply;
            } catch (Throwable th) {
                Exceptions.a(th);
                this.e.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableReduceMaybe(Observable observable, BiFunction biFunction) {
        this.a = observable;
        this.b = biFunction;
    }

    public final void i(MaybeObserver maybeObserver) {
        this.a.subscribe(new ReduceObserver(maybeObserver, this.b));
    }
}
