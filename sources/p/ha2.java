package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ha2 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ ha2(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue((th61) obj);
                break;
            case 1:
                ven0Var.setValue((th61) obj);
                break;
            default:
                ven0Var.setValue((th61) obj);
                break;
        }
    }
}
