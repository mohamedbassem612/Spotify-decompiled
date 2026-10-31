package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableConcatWithMaybe<T> extends AbstractObservableWithUpstream<T, T> {
    public final MaybeSource b;

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, MaybeObserver<T>, Disposable {
        public final Observer a;
        public MaybeSource b;
        public boolean c;

        public ConcatWithObserver(Observer observer, MaybeSource maybeSource) {
            this.a = observer;
            this.b = maybeSource;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            if (this.c) {
                this.a.onComplete();
                return;
            }
            this.c = true;
            DisposableHelper.c(this, (Disposable) null);
            MaybeSource maybeSource = this.b;
            this.b = null;
            maybeSource.subscribe(this);
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(Object obj) {
            this.a.onNext(obj);
        }

        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.g(this, disposable) || this.c) {
                return;
            }
            this.a.onSubscribe(this);
        }

        public final void onSuccess(Object obj) {
            Observer observer = this.a;
            observer.onNext(obj);
            observer.onComplete();
        }
    }

    public ObservableConcatWithMaybe(Observable observable, MaybeSource maybeSource) {
        super(observable);
        this.b = maybeSource;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new ConcatWithObserver(observer, this.b));
    }
}
