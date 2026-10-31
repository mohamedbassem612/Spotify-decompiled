package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xch implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disposable b;

    public /* synthetic */ xch(Disposable disposable, byte b) {
        this.a = b;
        this.b = disposable;
    }

    public final void run() {
        byte b = this.a;
        Disposable disposable = this.b;
        switch (b) {
            case 0:
                disposable.dispose();
                break;
            default:
                disposable.dispose();
                break;
        }
    }
}
