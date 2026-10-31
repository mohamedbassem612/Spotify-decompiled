package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v0b implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt91 b;

    public /* synthetic */ v0b(kt91 kt91Var, byte b) {
        this.a = b;
        this.b = kt91Var;
    }

    public final void run() {
        byte b = this.a;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956775});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131956775, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 1:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956775});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131956775, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956775});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131956775, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
