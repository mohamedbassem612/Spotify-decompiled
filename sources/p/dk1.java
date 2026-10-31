package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dk1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ek1 b;

    public /* synthetic */ dk1(ek1 ek1Var, byte b) {
        this.a = b;
        this.b = ek1Var;
    }

    public final void run() {
        byte b = this.a;
        ek1 ek1Var = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = (kt91) ek1Var.c;
                kt91Var.b();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954726});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131954726, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91 kt91Var2 = (kt91) ek1Var.c;
                kt91Var2.b();
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954727});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131954727, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
