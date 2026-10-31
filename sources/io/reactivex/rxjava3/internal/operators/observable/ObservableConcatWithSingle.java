package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableConcatWithSingle<T> extends AbstractObservableWithUpstream<T, T> {
    public final SingleSource b;

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, SingleObserver<T>, Disposable {
        public final Observer a;
        public SingleSource b;
        public boolean c;

        public ConcatWithObserver(Observer observer, SingleSource singleSource) {
            this.a = observer;
            this.b = singleSource;
        }

        public void dispose() {
            DisposableHelper.a(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.b(get());
        }

        public final void onComplete() {
            this.c = true;
            DisposableHelper.c(this, (Disposable) null);
            SingleSource singleSource = this.b;
            this.b = null;
            singleSource.subscribe(this);
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

    public ObservableConcatWithSingle(Observable observable, SingleSource singleSource) {
        super(observable);
        this.b = singleSource;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new ConcatWithObserver(observer, this.b));
    }
}
