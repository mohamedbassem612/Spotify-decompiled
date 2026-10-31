package io.reactivex.rxjava3.internal.operators.single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class SingleDelay$Delay$OnError implements Runnable {
    public final Throwable a;
    public final /* synthetic */ SingleDelay.Delay b;

    public SingleDelay$Delay$OnError(SingleDelay.Delay delay, Throwable th) {
        this.b = delay;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.onError(this.a);
    }
}
