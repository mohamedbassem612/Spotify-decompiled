package p;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lti0 extends y0d0 implements xsi0 {
    public static final Method c1;
    public fp8 b1;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                c1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void l(msi0 msi0Var, MenuItem menuItem) {
        fp8 fp8Var = this.b1;
        if (fp8Var != null) {
            fp8Var.l(msi0Var, menuItem);
        }
    }

    public final void p(msi0 msi0Var, ysi0 ysi0Var) {
        fp8 fp8Var = this.b1;
        if (fp8Var != null) {
            fp8Var.p(msi0Var, ysi0Var);
        }
    }

    @Override // p.y0d0
    public final m9v q(Context context, boolean z) {
        kti0 kti0Var = new kti0(context, z);
        kti0Var.setHoverListener(this);
        return kti0Var;
    }
}
