package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ub41 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vb41 b;

    public /* synthetic */ ub41(vb41 vb41Var, byte b) {
        this.a = b;
        this.b = vb41Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vb41 vb41Var = this.b;
        switch (b) {
            case 0:
                vb41Var.n = true;
                vb41Var.a();
                break;
            default:
                wb41 wb41Var = (wb41) obj;
                int i = wb41Var.a;
                float f = wb41Var.b;
                if (i == 2) {
                    vb41Var.m = true;
                }
                if (i == 1 && vb41Var.m) {
                    vb41Var.m = false;
                    vb41Var.l = false;
                    vb41Var.a();
                }
                vb41Var.h.onNext(new xb41(i, f));
                break;
        }
    }
}
