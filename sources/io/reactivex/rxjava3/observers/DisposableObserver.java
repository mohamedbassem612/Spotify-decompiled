package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class DisposableObserver<T> implements Observer<T>, Disposable {
    public final AtomicReference a = new AtomicReference();

    public final void dispose() {
        DisposableHelper.a(this.a);
    }

    public final boolean isDisposed() {
        return this.a.get() == DisposableHelper.a;
    }

    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        do {
            atomicReference = this.a;
            if (atomicReference.compareAndSet(null, disposable)) {
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
        if (atomicReference.get() != DisposableHelper.a) {
            EndConsumerHelper.a(cls);
        }
    }
}
