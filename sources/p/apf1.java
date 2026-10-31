package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class apf1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mof1 b;
    public final /* synthetic */ tqw c;
    public final /* synthetic */ dpf1 d;

    public /* synthetic */ apf1(mof1 mof1Var, tqw tqwVar, dpf1 dpf1Var, byte b) {
        this.a = b;
        this.b = mof1Var;
        this.c = tqwVar;
        this.d = dpf1Var;
    }

    public final void run() {
        byte b = this.a;
        dpf1 dpf1Var = this.d;
        tqw tqwVar = this.c;
        mof1 mof1Var = this.b;
        switch (b) {
            case 0:
                String str = mof1Var.j;
                if (str != null && tqwVar != null) {
                    ((xrn0) dpf1Var.g.get()).a(str, n3o1.y(tqwVar));
                }
                break;
            default:
                String str2 = mof1Var.k;
                if (str2 != null && tqwVar != null) {
                    ((xrn0) dpf1Var.g.get()).a(str2, n3o1.y(tqwVar));
                }
                break;
        }
    }
}
