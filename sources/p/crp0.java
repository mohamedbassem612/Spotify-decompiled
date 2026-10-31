package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class crp0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drp0 b;

    public /* synthetic */ crp0(drp0 drp0Var, byte b) {
        this.a = b;
        this.b = drp0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        drp0 drp0Var = this.b;
        switch (b) {
            case 0:
                drp0Var.n = ((Boolean) obj).booleanValue();
                break;
            case 1:
                drp0Var.n = false;
                break;
            case 2:
                drp0Var.m = (tig0) obj;
                break;
            case 3:
                drp0Var.m = sig0.a;
                break;
            case 4:
                drp0Var.k = ((String) obj).equals("premium");
                break;
            default:
                drp0Var.l = ((String) obj).equals("1");
                break;
        }
    }
}
