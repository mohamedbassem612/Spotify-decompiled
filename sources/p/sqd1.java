package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sqd1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqd1 b;

    public /* synthetic */ sqd1(vqd1 vqd1Var, byte b) {
        this.a = b;
        this.b = vqd1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vqd1 vqd1Var = this.b;
        switch (b) {
            case 0:
                t45 t45Var = vqd1Var.i;
                if (t45Var != null) {
                    t45.m(t45Var, "check_user_logged_in", 4);
                }
                break;
            case 1:
                t45 t45Var2 = vqd1Var.i;
                if (t45Var2 != null) {
                    t45Var2.g("handle_tap_action");
                }
                t45 t45Var3 = vqd1Var.i;
                if (t45Var3 != null) {
                    vqd1Var.d.b(t45Var3.e());
                }
                vqd1Var.i = null;
                break;
            case 2:
                t45 t45Var4 = vqd1Var.i;
                if (t45Var4 != null) {
                    t45.m(t45Var4, "fetch_something_to_play", 4);
                    t45Var4.a("fetch_mode", "playSomethingWithQuickstartPivot");
                }
                break;
            case 3:
                t45 t45Var5 = vqd1Var.i;
                if (t45Var5 != null) {
                    t45Var5.g("fetch_something_to_play");
                }
                break;
            default:
                t45 t45Var6 = vqd1Var.j;
                if (t45Var6 != null) {
                    t45.m(t45Var6, "connect", 4);
                }
                break;
        }
    }
}
