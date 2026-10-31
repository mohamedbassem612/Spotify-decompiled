package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    public final boolean a(int i, Disposable disposable) {
        DisposableHelper disposableHelper;
        do {
            disposableHelper = (Disposable) get(i);
            if (disposableHelper == DisposableHelper.a) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposableHelper, disposable));
        if (disposableHelper == null) {
            return true;
        }
        disposableHelper.dispose();
        return true;
    }

    public void dispose() {
        Disposable andSet;
        Disposable disposable = get(0);
        Disposable disposable2 = DisposableHelper.a;
        if (disposable != disposable2) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (get(i) != disposable2 && (andSet = getAndSet(i, disposable2)) != disposable2 && andSet != null) {
                    andSet.dispose();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == DisposableHelper.a;
    }
}
