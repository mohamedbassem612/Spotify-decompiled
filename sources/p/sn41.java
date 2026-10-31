package p;

import io.reactivex.rxjava3.disposables.SerialDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sn41 implements gn41 {
    public final /* synthetic */ SerialDisposable a;
    public final /* synthetic */ ram0 b;

    public sn41(SerialDisposable serialDisposable, ram0 ram0Var) {
        this.a = serialDisposable;
        this.b = ram0Var;
    }

    public final void dispose() {
        this.a.dispose();
        this.b.dispose();
    }
}
