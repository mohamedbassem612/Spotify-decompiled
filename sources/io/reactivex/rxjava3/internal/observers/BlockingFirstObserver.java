package io.reactivex.rxjava3.internal.observers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class BlockingFirstObserver<T> extends BlockingBaseObserver<T> {
    @Override // io.reactivex.rxjava3.core.Observer
    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.dispose();
            countDown();
        }
    }
}
