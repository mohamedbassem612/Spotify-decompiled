package p;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class vck1 extends e3n {
    public xck1 a;
    public int b = 0;

    public vck1() {
    }

    @Override // p.e3n
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        u(coordinatorLayout, view, i);
        xck1 xck1Var = this.a;
        if (xck1Var == null) {
            xck1Var = new xck1(view);
            this.a = xck1Var;
        }
        View view2 = xck1Var.a;
        xck1Var.b = view2.getTop();
        xck1Var.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int t() {
        xck1 xck1Var = this.a;
        if (xck1Var != null) {
            return xck1Var.d;
        }
        return 0;
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.r(view, i);
    }

    public final boolean v(int i) {
        xck1 xck1Var = this.a;
        if (xck1Var != null) {
            return xck1Var.b(i);
        }
        this.b = i;
        return false;
    }

    public vck1(int i) {
    }
}
