package p;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uh {
    public iu30 a = h3.U0;
    public final boolean b;
    public final dtw c;

    public uh(Context context, ViewGroup viewGroup, vtw vtwVar) {
        boolean z = vtwVar.b == null;
        this.b = z;
        xh xhVarI = uwo1.i(vtwVar.a, new wf(vtwVar, this, (byte) 1));
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = mhc.d(context, viewGroup, xhVarI, null, 24);
        View view = dtwVarD.w;
        if (z) {
            view.setImportantForAccessibility(1);
            view.setFocusable(true);
        } else {
            view.setImportantForAccessibility(4);
        }
        this.c = dtwVarD;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(Object obj) throws NoWhenBranchMatchedException {
        dtw dtwVar = this.c;
        if (u890.j(obj, dtwVar.f)) {
            return;
        }
        dtwVar.k(obj, ioa0.a, null);
        View view = dtwVar.w;
        if (!this.b) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
            view.setFocusable(true);
        }
    }
}
