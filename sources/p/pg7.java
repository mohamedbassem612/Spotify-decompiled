package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pg7 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rg7 b;

    public /* synthetic */ pg7(rg7 rg7Var, byte b) {
        this.a = b;
        this.b = rg7Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        rg7 rg7Var = this.b;
        switch (b) {
            case 0:
                t45 t45Var = rg7Var.b;
                if (t45Var != null) {
                    t45Var.l(td6.q(2), "assisted-curation", false);
                }
                break;
            default:
                t45 t45Var2 = rg7Var.b;
                if (t45Var2 != null) {
                    rg7.b(td6.q(2), t45Var2);
                }
                break;
        }
    }
}
