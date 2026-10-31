package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dfr implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wj3 b;

    public /* synthetic */ dfr(wj3 wj3Var, byte b) {
        this.a = b;
        this.b = wj3Var;
    }

    public final void run() {
        byte b = this.a;
        wj3 wj3Var = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = ((a78) wj3Var.N0).a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952626});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131952626, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91 kt91Var2 = ((a78) wj3Var.N0).a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131952625});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131952625, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
