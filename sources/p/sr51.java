package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sr51 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zr51 b;

    public /* synthetic */ sr51(zr51 zr51Var, byte b) {
        this.a = b;
        this.b = zr51Var;
    }

    public final void run() {
        byte b = this.a;
        zr51 zr51Var = this.b;
        switch (b) {
            case 0:
                lgv.b(zr51Var.c);
                break;
            case 1:
                zr51Var.b.accept(gu41.a);
                break;
            default:
                zr51Var.b.accept(iu41.a);
                break;
        }
    }
}
