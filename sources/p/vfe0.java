package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class vfe0 {
    public static final kiv a = new kiv(wce0.O0, (byte) 0);

    public static s1q0 a(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        s1q0 s1q0Var = (s1q0) x340Var.k(a);
        Context context = null;
        if (s1q0Var == null) {
            x340Var.i0(544166745);
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            while (true) {
                if (view == null) {
                    s1q0Var = null;
                    break;
                }
                Object tag = view.getTag(2131431632);
                s1q0 s1q0Var2 = tag instanceof s1q0 ? (s1q0) tag : null;
                if (s1q0Var2 != null) {
                    s1q0Var = s1q0Var2;
                    break;
                }
                Object objP = dm5.P(view);
                view = objP instanceof View ? (View) objP : null;
            }
            x340Var.r(false);
        } else {
            x340Var.i0(544164296);
            x340Var.r(false);
        }
        if (s1q0Var != null) {
            x340Var.i0(544164377);
            x340Var.r(false);
            return s1q0Var;
        }
        x340Var.i0(544168748);
        for (Context baseContext = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof s1q0) {
                context = baseContext;
                break;
            }
        }
        s1q0 s1q0Var3 = (s1q0) context;
        x340Var.r(false);
        return s1q0Var3;
    }
}
