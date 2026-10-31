package p;

import android.content.res.Resources;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class uck1 extends e3n {
    public wck1 a;
    public int b;
    public View c;

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.c = view;
        try {
            coordinatorLayout.r(view, i);
            t(view);
            return true;
        } catch (ArrayIndexOutOfBoundsException e) {
            Resources resources = view.getContext().getResources();
            Logger.k("child id is %1$s and parent id is %2$s", new Object[]{view.getId() == -1 ? "no_id" : resources.getResourceEntryName(view.getId()), coordinatorLayout.getId() != -1 ? resources.getResourceEntryName(coordinatorLayout.getId()) : "no_id"});
            throw e;
        }
    }

    public final void t(View view) {
        wck1 wck1Var = this.a;
        if (wck1Var == null) {
            wck1Var = new wck1(view);
            this.a = wck1Var;
        }
        View view2 = wck1Var.a;
        wck1Var.b = view2.getTop();
        wck1Var.c = view2.getLeft();
        wck1Var.a();
        int i = this.b;
        if (i != 0) {
            wck1 wck1Var2 = this.a;
            if (wck1Var2.d != i) {
                wck1Var2.d = i;
                wck1Var2.a();
            }
            this.b = 0;
        }
    }

    public final int u() {
        wck1 wck1Var = this.a;
        if (wck1Var != null) {
            return wck1Var.d;
        }
        return 0;
    }

    public final boolean v(int i) {
        wck1 wck1Var = this.a;
        if (wck1Var == null) {
            this.b = i;
            return false;
        }
        if (wck1Var.d == i) {
            return false;
        }
        wck1Var.d = i;
        wck1Var.a();
        return true;
    }
}
