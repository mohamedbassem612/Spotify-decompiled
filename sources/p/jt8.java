package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jt8 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dma1 b;

    public /* synthetic */ jt8(dma1 dma1Var, byte b) {
        this.a = b;
        this.b = dma1Var;
    }

    public final void run() {
        byte b = this.a;
        dma1 dma1Var = this.b;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(kt8.f, true);
                hma1VarEdit.h();
                break;
            case 1:
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.a(dk20.b, true);
                hma1VarEdit2.h();
                break;
            default:
                hma1 hma1VarEdit3 = dma1Var.edit();
                hma1VarEdit3.a(dk20.a, true);
                hma1VarEdit3.h();
                break;
        }
    }
}
