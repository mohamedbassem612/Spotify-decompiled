package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ixc implements Disposable {
    public final dxc a;
    public volatile boolean b;

    public ixc(dxc dxcVar) {
        this.a = dxcVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.b = true;
        this.a.cancel();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.b;
    }
}
