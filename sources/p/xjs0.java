package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xjs0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e5l0 b;

    public /* synthetic */ xjs0(e5l0 e5l0Var, byte b) {
        this.a = b;
        this.b = e5l0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        e5l0 e5l0Var = this.b;
        switch (b) {
            case 0:
                e5l0Var.k(1);
                break;
            case 1:
                e5l0Var.k(2);
                break;
            default:
                e5l0Var.k(3);
                break;
        }
    }
}
