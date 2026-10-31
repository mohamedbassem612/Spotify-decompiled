package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class DefaultObserver<T> implements Observer<T> {
    public Disposable a;

    public final void onSubscribe(Disposable disposable) {
        DisposableHelper disposableHelper = this.a;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        if (disposableHelper == null) {
            this.a = disposable;
            return;
        }
        disposable.dispose();
        if (disposableHelper != DisposableHelper.a) {
            EndConsumerHelper.a(cls);
        }
    }
}
