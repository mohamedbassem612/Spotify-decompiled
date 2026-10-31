package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o11 implements Consumer {
    public final /* synthetic */ u11 a;

    public o11(u11 u11Var) {
        this.a = u11Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ou71 ou71Var = this.a.b;
        String str = ((ia41) obj).a;
        bma1 bma1Var = ou71.c;
        hma1 hma1VarEdit = ou71Var.a.edit();
        hma1VarEdit.d(bma1Var, str);
        hma1VarEdit.g();
    }
}
