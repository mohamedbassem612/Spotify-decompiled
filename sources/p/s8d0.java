package p;

import io.reactivex.rxjava3.internal.observers.ConsumerSingleObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s8d0 extends v6 {
    public final ConsumerSingleObserver e = new ConsumerSingleObserver(new r8d0(this, (byte) 0), new r8d0(this, (byte) 1));

    public final void r() {
        this.e.dispose();
    }
}
