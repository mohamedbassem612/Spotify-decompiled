package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObserverResourceWrapper<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public final Observer a;
    public final AtomicReference b = new AtomicReference();

    public ObserverResourceWrapper(Observer observer) {
        this.a = observer;
    }

    public void dispose() {
        DisposableHelper.a(this.b);
        DisposableHelper.a(this);
    }

    public boolean isDisposed() {
        return this.b.get() == DisposableHelper.a;
    }

    public final void onComplete() {
        dispose();
        this.a.onComplete();
    }

    public final void onError(Throwable th) {
        dispose();
        this.a.onError(th);
    }

    public final void onNext(Object obj) {
        this.a.onNext(obj);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.g(this.b, disposable)) {
            this.a.onSubscribe(this);
        }
    }
}
