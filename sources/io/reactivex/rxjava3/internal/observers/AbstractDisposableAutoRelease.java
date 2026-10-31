package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
abstract class AbstractDisposableAutoRelease extends AtomicReference<Disposable> implements Disposable, LambdaConsumerIntrospection {
    public final AtomicReference a;
    public final Consumer b;
    public final Action c;

    public AbstractDisposableAutoRelease(Action action, Consumer consumer, DisposableContainer disposableContainer) {
        this.b = consumer;
        this.c = action;
        this.a = new AtomicReference(disposableContainer);
    }

    public final void a() {
        DisposableContainer disposableContainer = (DisposableContainer) this.a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.c(this);
        }
    }

    public final void dispose() {
        DisposableHelper.a(this);
        a();
    }

    public final boolean hasCustomOnError() {
        return this.b != Functions.f;
    }

    public final boolean isDisposed() {
        return DisposableHelper.b(get());
    }

    public final void onComplete() {
        DisposableHelper disposableHelper = get();
        DisposableHelper disposableHelper2 = DisposableHelper.a;
        if (disposableHelper != disposableHelper2) {
            lazySet(disposableHelper2);
            try {
                this.c.run();
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
        a();
    }

    public final void onError(Throwable th) {
        DisposableHelper disposableHelper = get();
        DisposableHelper disposableHelper2 = DisposableHelper.a;
        if (disposableHelper != disposableHelper2) {
            lazySet(disposableHelper2);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                Exceptions.a(th2);
                RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
            }
        } else {
            RxJavaPlugins.b(th);
        }
        a();
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this, disposable);
    }
}
