package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.observers.SerializedObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableSkipUntil<T, U> extends AbstractObservableWithUpstream<T, T> {
    public final ObservableSource b;

    public final class SkipUntil implements Observer<U> {
        public final ArrayCompositeDisposable a;
        public final SkipUntilObserver b;
        public final SerializedObserver c;
        public Disposable d;

        public SkipUntil(ArrayCompositeDisposable arrayCompositeDisposable, SkipUntilObserver skipUntilObserver, SerializedObserver serializedObserver) {
            this.a = arrayCompositeDisposable;
            this.b = skipUntilObserver;
            this.c = serializedObserver;
        }

        public final void onComplete() {
            this.b.d = true;
        }

        public final void onError(Throwable th) {
            this.a.dispose();
            this.c.onError(th);
        }

        public final void onNext(Object obj) {
            this.d.dispose();
            this.b.d = true;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.d, disposable)) {
                this.d = disposable;
                this.a.a(1, disposable);
            }
        }
    }

    public static final class SkipUntilObserver<T> implements Observer<T> {
        public final SerializedObserver a;
        public final ArrayCompositeDisposable b;
        public Disposable c;
        public volatile boolean d;
        public boolean e;

        public SkipUntilObserver(SerializedObserver serializedObserver, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.a = serializedObserver;
            this.b = arrayCompositeDisposable;
        }

        public final void onComplete() {
            this.b.dispose();
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.b.dispose();
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            if (this.e) {
                this.a.onNext(obj);
            } else if (this.d) {
                this.e = true;
                this.a.onNext(obj);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.h(this.c, disposable)) {
                this.c = disposable;
                this.b.a(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(Observable observable, ObservableSource observableSource) {
        super(observable);
        this.b = observableSource;
    }

    public final void subscribeActual(Observer observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        SkipUntilObserver skipUntilObserver = new SkipUntilObserver(serializedObserver, arrayCompositeDisposable);
        this.b.subscribe(new SkipUntil(arrayCompositeDisposable, skipUntilObserver, serializedObserver));
        ((AbstractObservableWithUpstream) this).a.subscribe(skipUntilObserver);
    }
}
