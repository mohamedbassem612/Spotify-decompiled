package p;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a3u extends jme {
    public final /* synthetic */ c3u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3u(c3u c3uVar) {
        super(1);
        this.c = c3uVar;
    }

    public final hsl1 t0(hsl1 hsl1Var, List list) {
        c3u c3uVar = this.c;
        if (!c3u.y(c3uVar)) {
            View childAt = c3uVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, c3uVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, c3uVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return hsl1Var.a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return hsl1Var;
    }

    public final frl1 u0(mrl1 mrl1Var, frl1 frl1Var) {
        c3u c3uVar = this.c;
        if (!c3u.y(c3uVar)) {
            View childAt = c3uVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, c3uVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, c3uVar.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return frl1Var.c(nk80.c(iMax, iMax2, iMax3, iMax4));
            }
        }
        return frl1Var;
    }
}
