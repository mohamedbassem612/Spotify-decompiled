package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l1c0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m1c0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ l1c0(m1c0 m1c0Var, String str, byte b) {
        this.a = b;
        this.b = m1c0Var;
        this.c = str;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        m1c0 m1c0Var = this.b;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = m1c0Var.d.edit();
                xxy0.a.getClass();
                hma1VarEdit.d(wxy0.b, str);
                hma1VarEdit.g();
                break;
            default:
                hma1 hma1VarEdit2 = m1c0Var.d.edit();
                xxy0.a.getClass();
                hma1VarEdit2.d(wxy0.b, str);
                hma1VarEdit2.g();
                break;
        }
    }
}
