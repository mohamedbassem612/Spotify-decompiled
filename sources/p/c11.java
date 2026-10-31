package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c11 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ c11(u11 u11Var, byte b) {
        this.a = b;
        this.b = u11Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        u11 u11Var = this.b;
        switch (b) {
            case 0:
                ou71 ou71Var = u11Var.b;
                bma1 bma1Var = ou71.b;
                dma1 dma1Var = ou71Var.a;
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.f(bma1Var);
                hma1VarEdit.g();
                bma1 bma1Var2 = ou71.c;
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.f(bma1Var2);
                hma1VarEdit2.g();
                return pn81.a;
            default:
                x01 x01Var = u11Var.c;
                w01 w01Var = ((ka41) obj).a;
                bk8 bk8Var = w01Var.a;
                String str = w01Var.b;
                String str2 = w01Var.c;
                x01Var.b(x01.b, bk8Var != null ? bk8Var.name() : null);
                x01Var.b(x01.c, str);
                x01Var.b(x01.d, str2);
                return umj0.a;
        }
    }
}
