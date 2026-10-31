package io.reactivex.rxjava3.internal.fuseable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class CancellableQueueFuseable<T> extends AbstractEmptyQueueFuseable<T> {
    public volatile boolean a;

    public final void cancel() {
        this.a = true;
    }

    public void dispose() {
        this.a = true;
    }

    public boolean isDisposed() {
        return this.a;
    }
}
