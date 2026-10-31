package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CallbackCompletableObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Action b;

    public CallbackCompletableObserver(Consumer consumer, Action action) {
        this.a = consumer;
        this.b = action;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.a != Functions.f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.a;
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onComplete() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
        lazySet(DisposableHelper.a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onError(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(th2);
        }
        lazySet(DisposableHelper.a);
    }

    @Override // io.reactivex.rxjava3.core.CompletableObserver, io.reactivex.rxjava3.core.MaybeObserver
    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this, disposable);
    }
}
