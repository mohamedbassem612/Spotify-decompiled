package p;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ter implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ixg b;

    public /* synthetic */ ter(ixg ixgVar, byte b) {
        this.a = b;
        this.b = ixgVar;
    }

    public final void cancel() {
        byte b = this.a;
        ixg ixgVar = this.b;
        switch (b) {
            case 0:
                ixgVar.b();
                break;
            default:
                ixgVar.b();
                break;
        }
    }
}
