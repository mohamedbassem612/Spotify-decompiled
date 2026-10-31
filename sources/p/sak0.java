package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sak0 {
    public final Activity a;
    public final f1n0 b;
    public final b1r0 c;

    public sak0(Activity activity, f1n0 f1n0Var, b1r0 b1r0Var) {
        this.a = activity;
        this.b = f1n0Var;
        this.c = b1r0Var;
    }

    public final Object a(bt31 bt31Var, bt31 bt31Var2, String str, tv80 tv80Var, boolean z, onm onmVar) {
        dwn0 dwn0Var = new dwn0(t2p1.B(str), "", false, false, 0, 0, false, null, null, new bwn0(tv80Var));
        Bundle bundle = new Bundle();
        bundle.putParcelable("intent_argument_to_row", bt31Var);
        bundle.putParcelable("intent_argument_from_row", bt31Var2);
        bundle.putBoolean("intent_argument_opened_from_edit_playlist", z);
        f1n0 f1n0Var = this.b;
        boolean zJ = f1n0Var.a.j(this.a);
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (zJ) {
            Object objC = f1n0Var.c(dwn0Var, bundle, onmVar);
            if (objC == d9nVar) {
                return objC;
            }
        } else {
            b1r0 b1r0Var = this.c;
            Object objY = fn31.Y(b1r0Var.b, new rwm0(b1r0Var, dwn0Var, bundle, (lnm) null, (byte) 14), onmVar);
            if (objY != d9nVar) {
                objY = rih1Var;
            }
            if (objY == d9nVar) {
                return objY;
            }
        }
        return rih1Var;
    }
}
