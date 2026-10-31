package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ia2 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disposable b;

    public /* synthetic */ ia2(Disposable disposable, byte b) {
        this.a = b;
        this.b = disposable;
    }

    public final void dispose() {
        byte b = this.a;
        Disposable disposable = this.b;
        switch (b) {
            case 0:
                disposable.dispose();
                break;
            case 1:
                disposable.dispose();
                break;
            default:
                disposable.dispose();
                break;
        }
    }
}
