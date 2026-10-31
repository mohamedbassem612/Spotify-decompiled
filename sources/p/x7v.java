package p;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x7v {
    public static final znb0 a = dm5.S(3, xzu.f);

    public static final jmr0 a(Drawable drawable, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(1756822313);
        x340Var.j0(1157296644);
        boolean zG = x340Var.g(drawable);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            if (drawable == null) {
                objT = j7x.f;
            } else {
                objT = drawable instanceof ColorDrawable ? new i9h(z4p1.e(((ColorDrawable) drawable).getColor())) : new w7v(drawable.mutate());
            }
            x340Var.s0(objT);
        }
        x340Var.r(false);
        jmr0 jmr0Var = (jmr0) objT;
        x340Var.r(false);
        return jmr0Var;
    }
}
