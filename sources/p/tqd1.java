package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tqd1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqd1 b;

    public /* synthetic */ tqd1(vqd1 vqd1Var, byte b) {
        this.a = b;
        this.b = vqd1Var;
    }

    public final void run() {
        byte b = this.a;
        vqd1 vqd1Var = this.b;
        switch (b) {
            case 0:
                t45 t45Var = vqd1Var.i;
                if (t45Var != null) {
                    t45Var.g("check_user_logged_in");
                }
                break;
            default:
                vqd1Var.g = null;
                break;
        }
    }
}
