package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n211 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr6 b;

    public /* synthetic */ n211(cr6 cr6Var, byte b) {
        this.a = b;
        this.b = cr6Var;
    }

    public final void run() {
        byte b = this.a;
        cr6 cr6Var = this.b;
        switch (b) {
            case 0:
                xwm1 xwm1Var = (xwm1) cr6Var.b;
                xwm1Var.a.b();
                kt91 kt91Var = xwm1Var.a;
                if (kt91Var.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963279});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131963279, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
            default:
                xwm1 xwm1Var2 = (xwm1) cr6Var.b;
                xwm1Var2.a.b();
                kt91 kt91Var2 = xwm1Var2.a;
                if (kt91Var2.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963264});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var2.k(new er91((fs91) null, "", 2131963264, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                break;
        }
    }
}
