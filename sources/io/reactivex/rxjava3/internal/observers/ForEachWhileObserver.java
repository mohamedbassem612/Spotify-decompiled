package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ForEachWhileObserver<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
    public final Predicate a;
    public final Consumer b;
    public final Action c;
    public boolean d;

    public ForEachWhileObserver(Predicate predicate, Consumer consumer, Action action) {
        this.a = predicate;
        this.b = consumer;
        this.c = action;
    }

    public void dispose() {
        DisposableHelper.a(this);
    }

    public boolean isDisposed() {
        return DisposableHelper.b(get());
    }

    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.c.run();
        } catch (Throwable th) {
            Exceptions.a(th);
            RxJavaPlugins.b(th);
        }
    }

    public final void onError(Throwable th) {
        if (this.d) {
            RxJavaPlugins.b(th);
            return;
        }
        this.d = true;
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            Exceptions.a(th2);
            RxJavaPlugins.b(new CompositeException(new Throwable[]{th, th2}));
        }
    }

    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        try {
            if (this.a.test(obj)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th) {
            Exceptions.a(th);
            dispose();
            onError(th);
        }
    }

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper.g(this, disposable);
    }
}
