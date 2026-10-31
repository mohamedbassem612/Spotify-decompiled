package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class DisposableAutoReleaseMultiObserver<T> extends AbstractDisposableAutoRelease implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver {
    public final Consumer d;

    public DisposableAutoReleaseMultiObserver(Consumer consumer, Consumer consumer2, Action action, DisposableContainer disposableContainer) {
        super(action, consumer2, disposableContainer);
        this.d = consumer;
    }

    public final void onSuccess(Object obj) {
        DisposableHelper disposableHelper = get();
        DisposableHelper disposableHelper2 = DisposableHelper.a;
        if (disposableHelper != disposableHelper2) {
            lazySet(disposableHelper2);
            try {
                this.d.accept(obj);
            } catch (Throwable th) {
                Exceptions.a(th);
                RxJavaPlugins.b(th);
            }
        }
        a();
    }
}
