package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hnm implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rku b;

    public /* synthetic */ hnm(rku rkuVar, byte b) {
        this.a = b;
        this.b = rkuVar;
    }

    public final void run() {
        byte b = this.a;
        rku rkuVar = this.b;
        switch (b) {
            case 0:
                rkuVar.a();
                break;
            default:
                rkuVar.a();
                break;
        }
    }
}
