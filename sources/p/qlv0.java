package p;

import io.reactivex.rxjava3.functions.Cancellable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qlv0 implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ram0 b;

    public /* synthetic */ qlv0(ram0 ram0Var, byte b) {
        this.a = b;
        this.b = ram0Var;
    }

    public final void cancel() {
        byte b = this.a;
        ram0 ram0Var = this.b;
        switch (b) {
            case 0:
                ram0Var.dispose();
                break;
            default:
                ram0Var.dispose();
                break;
        }
    }
}
