package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableConcatWithCompletable<T> extends AbstractObservableWithUpstream<T, T> {
    public final CompletableSource b;

    public static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements Observer<T>, CompletableObserver, Disposable {
        public final Observer a;
        public CompletableSource b;
        public boolean c;

        public ConcatWithObserver(Observer observer, CompletableSource completableSource) {
            this.a = observer;
            this.b = completableSource;
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
            CompletableSource completableSource = this.b;
            this.b = null;
            completableSource.subscribe(this);
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
    }

    public ObservableConcatWithCompletable(Observable observable, CompletableSource completableSource) {
        super(observable);
        this.b = completableSource;
    }

    public final void subscribeActual(Observer observer) {
        ((AbstractObservableWithUpstream) this).a.subscribe(new ConcatWithObserver(observer, this.b));
    }
}
