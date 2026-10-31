package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class BlockingLastObserver<T> extends BlockingBaseObserver<T> {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onError(Throwable th) {
        ((BlockingBaseObserver) this).a = null;
        ((BlockingBaseObserver) this).b = th;
        countDown();
    }

    public final void onNext(Object obj) {
        ((BlockingBaseObserver) this).a = obj;
    }
}
