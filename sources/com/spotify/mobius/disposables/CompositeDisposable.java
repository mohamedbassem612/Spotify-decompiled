package com.spotify.mobius.disposables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class CompositeDisposable implements Disposable {
    public final Disposable[] a;

    public CompositeDisposable(Disposable[] disposableArr) {
        Disposable[] disposableArr2 = new Disposable[disposableArr.length];
        this.a = disposableArr2;
        System.arraycopy(disposableArr, 0, disposableArr2, 0, disposableArr.length);
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        for (Disposable disposable : this.a) {
            disposable.dispose();
        }
    }
}
