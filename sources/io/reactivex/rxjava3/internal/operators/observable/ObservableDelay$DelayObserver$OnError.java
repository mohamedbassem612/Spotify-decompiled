package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ObservableDelay$DelayObserver$OnError implements Runnable {
    public final Throwable a;
    public final /* synthetic */ ObservableDelay.DelayObserver b;

    public ObservableDelay$DelayObserver$OnError(ObservableDelay.DelayObserver delayObserver, Throwable th) {
        this.b = delayObserver;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ObservableDelay.DelayObserver delayObserver = this.b;
        Scheduler.Worker worker = delayObserver.d;
        try {
            delayObserver.a.onError(this.a);
        } finally {
            worker.dispose();
        }
    }
}
