package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class go91 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io91 b;
    public final /* synthetic */ String c;

    public /* synthetic */ go91(io91 io91Var, String str, byte b) {
        this.a = b;
        this.b = io91Var;
        this.c = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        io91 io91Var = this.b;
        switch (b) {
            case 0:
                xn91 xn91Var = io91Var.b;
                dma1 dma1VarB = xn91Var.b.b(xn91Var.a, str);
                hma1 hma1VarEdit = dma1VarB.edit();
                bma1 bma1Var = xn91.c;
                hma1VarEdit.b(bma1Var, dma1VarB.l(bma1Var, 0) + 1);
                hma1VarEdit.h();
                break;
            case 1:
                wl91 wl91Var = io91Var.d;
                dma1 dma1VarB2 = wl91Var.b.b(wl91Var.a, str);
                hma1 hma1VarEdit2 = dma1VarB2.edit();
                bma1 bma1Var2 = wl91.c;
                hma1VarEdit2.b(bma1Var2, dma1VarB2.l(bma1Var2, 0) + 1);
                hma1VarEdit2.h();
                break;
            default:
                po91 po91Var = io91Var.e;
                hma1 hma1VarEdit3 = po91Var.b.b(po91Var.a, str).edit();
                hma1VarEdit3.a(po91.c, true);
                hma1VarEdit3.h();
                break;
        }
    }
}
