package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableZipIterable<T, U, V> extends Observable<V> {
    public final Observable a;
    public final Iterable b;
    public final BiFunction c;

    public static final class ZipIterableObserver<T, U, V> implements Observer<T>, Disposable {
        public final Observer a;
        public final Iterator b;
        public final BiFunction c;
        public Disposable d;
        public boolean e;

        public ZipIterableObserver(Observer observer, Iterator it, BiFunction biFunction) {
            this.a = observer;
            this.b = it;
            this.c = biFunction;
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
            this.a.onComplete();
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
            Observer observer = this.a;
            Iterator it = this.b;
            if (this.e) {
                return;
            }
            try {
                Object next = it.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    Object objApply = this.c.apply(obj, next);
                    Objects.requireNonNull(objApply, "The zipper function returned a null value");
                    observer.onNext(objApply);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.e = true;
                        this.d.dispose();
                        observer.onComplete();
                    } catch (Throwable th) {
                        Exceptions.a(th);
                        this.e = true;
                        this.d.dispose();
                        observer.onError(th);
                    }
                } catch (Throwable th2) {
                    Exceptions.a(th2);
                    this.e = true;
                    this.d.dispose();
                    observer.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.a(th3);
                this.e = true;
                this.d.dispose();
                observer.onError(th3);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableZipIterable(Observable observable, Iterable iterable, BiFunction biFunction) {
        this.a = observable;
        this.b = iterable;
        this.c = biFunction;
    }

    public final void subscribeActual(Observer observer) {
        try {
            Iterator<T> it = this.b.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.b(observer);
                } else {
                    this.a.subscribe(new ZipIterableObserver(observer, it, this.c));
                }
            } catch (Throwable th) {
                Exceptions.a(th);
                EmptyDisposable.c(th, observer);
            }
        } catch (Throwable th2) {
            Exceptions.a(th2);
            EmptyDisposable.c(th2, observer);
        }
    }
}
