package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class duw0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lxg b;

    public /* synthetic */ duw0(lxg lxgVar, byte b) {
        this.a = b;
        this.b = lxgVar;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e("product_state_processing");
                break;
            default:
                this.b.a("product_state_processing");
                break;
        }
    }
}
