package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToObservable<U> {
    public final Observable a;
    public final Supplier b;

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public Collection b;
        public Disposable c;

        public ToListObserver(SingleObserver singleObserver, Collection collection) {
            this.a = singleObserver;
            this.b = collection;
        }

        public void dispose() {
            this.c.dispose();
        }

        public boolean isDisposed() {
            return this.c.isDisposed();
        }

        public final void onComplete() {
            Collection collection = this.b;
            this.b = null;
            this.a.onSuccess(collection);
        }

        public final void onError(Throwable th) {
            this.b = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.b.add(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableToListSingle(Observable observable, int i) {
        this.a = observable;
        this.b = Functions.c(i);
    }

    public final Observable a() {
        return new ObservableToList(this.a, this.b);
    }

    public final void subscribeActual(SingleObserver singleObserver) {
        try {
            Object obj = this.b.get();
            if (obj == null) {
                throw ExceptionHelper.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th = ExceptionHelper.a;
            this.a.subscribe(new ToListObserver(singleObserver, (Collection) obj));
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.f(th2, singleObserver);
        }
    }

    public ObservableToListSingle(Observable observable, Supplier supplier) {
        this.a = observable;
        this.b = supplier;
    }
}
