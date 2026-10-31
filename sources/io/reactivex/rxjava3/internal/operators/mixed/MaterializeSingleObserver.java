package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {
    public final SingleObserver a;
    public Disposable b;

    public MaterializeSingleObserver(SingleObserver singleObserver) {
        this.a = singleObserver;
    }

    public void dispose() {
        this.b.dispose();
    }

    public boolean isDisposed() {
        return this.b.isDisposed();
    }

    public final void onComplete() {
        this.a.onSuccess(Notification.b);
    }

    public final void onError(Throwable th) {
        this.a.onSuccess(Notification.a(th));
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.h(this.b, disposable)) {
            this.b = disposable;
            this.a.onSubscribe(this);
        }
    }

    public final void onSuccess(Object obj) {
        this.a.onSuccess(Notification.b(obj));
    }
}
