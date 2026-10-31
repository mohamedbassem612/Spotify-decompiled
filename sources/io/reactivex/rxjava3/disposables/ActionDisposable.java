package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class ActionDisposable extends ReferenceDisposable<Action> {
    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "ActionDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
