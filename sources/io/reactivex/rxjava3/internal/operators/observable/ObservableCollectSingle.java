package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {
    public final Observable a;
    public final Supplier b;
    public final BiConsumer c;

    public static final class CollectObserver<T, U> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final BiConsumer b;
        public final Object c;
        public Disposable d;
        public boolean e;

        public CollectObserver(SingleObserver singleObserver, Object obj, BiConsumer biConsumer) {
            this.a = singleObserver;
            this.b = biConsumer;
            this.c = obj;
        }

        public void dispose() {
            this.d.dispose();
        }

        public boolean isDisposed() {
            return this.d.isDisposed();
        }

        public final void onComplete() {
            if (this.e) {
                return;
            }
            this.e = true;
            this.a.onSuccess(this.c);
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.b(th);
            } else {
                this.e = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.e) {
                return;
            }
            try {
                this.b.accept(this.c, obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                this.d.dispose();
                onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableCollectSingle(Observable observable, Supplier supplier, BiConsumer biConsumer) {
        this.a = observable;
        this.b = supplier;
        this.c = biConsumer;
    }

    public final Observable a() {
        return new ObservableCollect(this.a, this.b, this.c);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.b.get();
            Objects.requireNonNull(obj, "The initialSupplier returned a null value");
            this.a.subscribe(new CollectObserver(singleObserver, obj, this.c));
        } catch (Throwable th) {
            Exceptions.a(th);
            EmptyDisposable.f(th, singleObserver);
        }
    }
}
