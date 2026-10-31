package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableToList<T, U extends Collection<? super T>> extends AbstractObservableWithUpstream<T, U> {
    public final Supplier b;

    public static final class ToListObserver<T, U extends Collection<? super T>> implements Observer<T>, Disposable {
        public final Observer a;
        public Disposable b;
        public Collection c;

        public ToListObserver(Observer observer, Collection collection) {
            this.a = observer;
            this.c = collection;
        }

        public void dispose() {
            this.b.dispose();
        }

        public boolean isDisposed() {
            return this.b.isDisposed();
        }

        public final void onComplete() {
            Collection collection = this.c;
            this.c = null;
            Observer observer = this.a;
            observer.onNext(collection);
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            this.c = null;
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.c.add(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableToList(Observable observable, Supplier supplier) {
        super(observable);
        this.b = supplier;
    }

    public final void subscribeActual(Observer observer) {
        try {
            Object obj = this.b.get();
            if (obj == null) {
                throw ExceptionHelper.b("The collectionSupplier returned a null Collection.");
            }
            Throwable th = ExceptionHelper.a;
            ((AbstractObservableWithUpstream) this).a.subscribe(new ToListObserver(observer, (Collection) obj));
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.c(th2, observer);
        }
    }
}
