package io.reactivex.rxjava3.disposables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public final void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
    }
}
