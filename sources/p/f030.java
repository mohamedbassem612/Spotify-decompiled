package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f030 extends pim0 implements iz20 {
    @Override // p.iz20
    public final void T0(ez20 ez20Var) {
        View viewO = y7y0.o(this);
        ez20Var.c(this.a.N0 && y7y0.o(this).hasFocusable());
        View viewFindFocus = viewO.findFocus();
        if (viewFindFocus != null) {
            ez20Var.a(uy20.a(viewFindFocus, viewO));
        }
    }
}
