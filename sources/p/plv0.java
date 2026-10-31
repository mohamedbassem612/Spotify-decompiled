package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class plv0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzr0 b;

    public /* synthetic */ plv0(tzr0 tzr0Var, byte b) {
        this.a = b;
        this.b = tzr0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        tzr0 tzr0Var = this.b;
        switch (b) {
            case 0:
                ((lxg) tzr0Var.d).e("product_state_processing");
                break;
            default:
                ((lxg) tzr0Var.d).a("product_state_processing");
                break;
        }
    }
}
