package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ycz implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uny b;

    public /* synthetic */ ycz(uny unyVar, byte b) {
        this.a = b;
        this.b = unyVar;
    }

    public final void run() {
        byte b = this.a;
        uny unyVar = this.b;
        switch (b) {
            case 0:
                unyVar.G(2131963263);
                break;
            default:
                unyVar.G(2131963278);
                break;
        }
    }
}
