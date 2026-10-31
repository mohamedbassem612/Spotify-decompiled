package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xe8 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dma1 b;
    public final /* synthetic */ ye8 c;

    public /* synthetic */ xe8(dma1 dma1Var, ye8 ye8Var, byte b) {
        this.a = b;
        this.b = dma1Var;
        this.c = ye8Var;
    }

    public final void run() {
        byte b = this.a;
        ye8 ye8Var = this.c;
        dma1 dma1Var = this.b;
        switch (b) {
            case 0:
                bma1 bma1Var = ye8.d;
                hma1 hma1VarEdit = dma1Var.edit();
                bma1 bma1Var2 = ye8.d;
                hma1VarEdit.a(i5x0.j(((u54) ye8Var.b.b).c()), true);
                hma1VarEdit.g();
                break;
            default:
                bma1 bma1Var3 = ye8.d;
                ymm0 ymm0Var = ye8Var.b;
                int iL = dma1Var.l(i5x0.k(ymm0Var.b()), 0) + 1;
                hma1 hma1VarEdit2 = dma1Var.edit();
                bma1 bma1Var4 = ye8.d;
                u54 u54Var = (u54) ymm0Var.b;
                hma1VarEdit2.b(i5x0.k(u54Var.c()), iL);
                hma1VarEdit2.g();
                long jCurrentTimeMillis = System.currentTimeMillis();
                hma1 hma1VarEdit3 = dma1Var.edit();
                hma1VarEdit3.c(i5x0.l(u54Var.c()), jCurrentTimeMillis);
                hma1VarEdit3.g();
                break;
        }
    }
}
