package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {
    public final Observable a;
    public final long b;
    public final Object c;

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        public final SingleObserver a;
        public final long b;
        public final Object c;
        public Disposable d;
        public long e;
        public boolean f;

        public ElementAtObserver(SingleObserver singleObserver, long j, Object obj) {
            this.a = singleObserver;
            this.b = j;
            this.c = obj;
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
            if (this.f) {
                return;
            }
            this.f = true;
            Object obj = this.c;
            SingleObserver singleObserver = this.a;
            if (obj != null) {
                singleObserver.onSuccess(obj);
            } else {
                singleObserver.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.b(th);
            } else {
                this.f = true;
                this.a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            if (this.f) {
                return;
            }
            long j = this.e;
            if (j != this.b) {
                this.e = j + 1;
                return;
            }
            this.f = true;
            this.d.dispose();
            this.a.onSuccess(obj);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(Observable observable, long j, Object obj) {
        this.a = observable;
        this.b = j;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public final Observable a() {
        return new ObservableElementAt(this.a, this.b, this.c, true);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        this.a.subscribe(new ElementAtObserver(singleObserver, this.b, this.c));
    }
}
