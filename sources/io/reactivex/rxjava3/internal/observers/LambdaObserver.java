package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class LambdaObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, LambdaConsumerIntrospection {
    public final Consumer a;
    public final Consumer b;
    public final Action c;
    public final Consumer d;

    public LambdaObserver(Consumer consumer, Consumer consumer2, Action action, Consumer consumer3) {
        this.a = consumer;
        this.b = consumer2;
        this.c = action;
        this.d = consumer3;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        DisposableHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.b != Functions.f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == DisposableHelper.a;
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(DisposableHelper.a);
        try {
            this.c.run();
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (isDisposed()) {
            RxJavaPlugins.b(th);
            return;
        }
        lazySet(DisposableHelper.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(th, th2));
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            Exceptions.a(th);
            get().dispose();
            onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.g(this, disposable)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                Exceptions.a(th);
                disposable.dispose();
                onError(th);
            }
        }
    }
}
