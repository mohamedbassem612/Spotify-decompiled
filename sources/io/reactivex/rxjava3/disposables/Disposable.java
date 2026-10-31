package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.functions.Action;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface Disposable {
    static Disposable d(Action action) {
        return new ActionDisposable(action);
    }

    static Disposable e(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    void dispose();

    boolean isDisposed();
}
