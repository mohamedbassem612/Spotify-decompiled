package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BiConsumerSingleObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
    public final BiConsumer a;

    public BiConsumerSingleObserver(BiConsumer biConsumer) {
        this.a = biConsumer;
    }

    public void dispose() {
        DisposableHelper.a(this);
    }

    public boolean isDisposed() {
        return get() == DisposableHelper.a;
    }

    public final void onError(Throwable th) {
        try {
            lazySet(DisposableHelper.a);
            this.a.accept((Object) null, th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this, disposable);
    }

    public final void onSuccess(Object obj) {
        try {
            lazySet(DisposableHelper.a);
            this.a.accept(obj, (Object) null);
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
    }
}
