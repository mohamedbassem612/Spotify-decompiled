package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ieh0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l811 b;

    public /* synthetic */ ieh0(l811 l811Var, byte b) {
        this.a = b;
        this.b = l811Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                l811Var.a = true;
                break;
            default:
                l811Var.a = false;
                break;
        }
    }
}
