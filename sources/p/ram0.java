package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ram0 implements gn41 {
    public final /* synthetic */ Disposable a;

    public ram0(Disposable disposable) {
        this.a = disposable;
    }

    @Override // p.gn41
    public final void dispose() {
        this.a.dispose();
    }
}
