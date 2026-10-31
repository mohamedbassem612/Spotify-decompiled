package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    public final long b;
    public final Object c;
    public final boolean d;

    public static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        public final Observer a;
        public final long b;
        public final Object c;
        public final boolean d;
        public Disposable e;
        public long f;
        public boolean g;

        public ElementAtObserver(Observer observer, long j, Object obj, boolean z) {
            this.a = observer;
            this.b = j;
            this.c = obj;
            this.d = z;
        }

        public void dispose() {
            this.e.dispose();
        }

        public boolean isDisposed() {
            return this.e.isDisposed();
        }

        public final void onComplete() {
            if (this.g) {
                return;
            }
            this.g = true;
            Observer observer = this.a;
            Object obj = this.c;
            if (obj == null && this.d) {
                observer.onError(new NoSuchElementException());
                return;
            }
            if (obj != null) {
                observer.onNext(obj);
            }
            observer.onComplete();
        }

        public final void onError(Throwable th) {
            if (this.g) {
                RxJavaPlugins.b(th);
            } else {
                this.g = true;
                this.a.onError(th);
            }
        }

        public final void onNext(Object obj) {
            if (this.g) {
                return;
            }
            long j = this.f;
            if (j != this.b) {
                this.f = j + 1;
                return;
            }
            this.g = true;
            this.e.dispose();
            Observer observer = this.a;
            observer.onNext(obj);
            observer.onComplete();
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.e, disposable)) {
                this.e = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(Observable observable, long j, Object obj, boolean z) {
        super(observable);
        this.b = j;
        this.c = obj;
        this.d = z;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new ElementAtObserver(observer, this.b, this.c, this.d));
    }
}
