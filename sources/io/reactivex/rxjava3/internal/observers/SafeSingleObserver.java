package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SafeSingleObserver<T> implements SingleObserver<T> {
    public final SingleObserver a;
    public boolean b;

    public SafeSingleObserver(SingleObserver singleObserver) {
        this.a = singleObserver;
    }

    public final void onError(Throwable th) {
        if (this.b) {
            RxJavaPlugins.b(th);
            return;
        }
        try {
            this.a.onError(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
        }
    }

    public final void onSubscribe(Disposable disposable) {
        try {
            this.a.onSubscribe(disposable);
        } catch (Throwable th) {
            Exceptions.a(th);
            this.b = true;
            disposable.dispose();
            RxJavaPlugins.b(th);
        }
    }

    public final void onSuccess(Object obj) {
        if (this.b) {
            return;
        }
        try {
            this.a.onSuccess(obj);
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
    }
}
