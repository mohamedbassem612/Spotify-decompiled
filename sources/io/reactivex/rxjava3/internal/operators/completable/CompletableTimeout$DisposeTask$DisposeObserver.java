package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CompletableTimeout$DisposeTask$DisposeObserver implements CompletableObserver {
    public final /* synthetic */ CompletableTimeout.DisposeTask a;

    public CompletableTimeout$DisposeTask$DisposeObserver(CompletableTimeout.DisposeTask disposeTask) {
        this.a = disposeTask;
    }

    public final void onComplete() {
        CompletableTimeout.DisposeTask disposeTask = this.a;
        disposeTask.b.dispose();
        disposeTask.c.onComplete();
    }

    public final void onError(Throwable th) {
        CompletableTimeout.DisposeTask disposeTask = this.a;
        disposeTask.b.dispose();
        disposeTask.c.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        this.a.b.b(disposable);
    }
}
