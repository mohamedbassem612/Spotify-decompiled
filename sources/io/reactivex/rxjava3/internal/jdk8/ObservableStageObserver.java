package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
abstract class ObservableStageObserver<T> extends CompletableFuture<T> implements Observer<T> {
    public final AtomicReference a = new AtomicReference();
    public Object b;

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        DisposableHelper.a(this.a);
        return super.cancel(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(Object obj) {
        DisposableHelper.a(this.a);
        return super.complete(obj);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th) {
        DisposableHelper.a(this.a);
        return super.completeExceptionally(th);
    }

    public final void onError(Throwable th) {
        this.b = null;
        this.a.lazySet(DisposableHelper.a);
        if (completeExceptionally(th)) {
            return;
        }
        RxJavaPlugins.b(th);
    }

    public void onNext(Object obj) {
        complete(obj);
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this.a, disposable);
    }
}
