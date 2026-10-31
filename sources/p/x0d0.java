package p;

import android.widget.AbsListView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x0d0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ y0d0 a;

    public x0d0(y0d0 y0d0Var) {
        this.a = y0d0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        y0d0 y0d0Var = this.a;
        w0d0 w0d0Var = y0d0Var.Q0;
        ik5 ik5Var = y0d0Var.Y0;
        if (i != 1 || ik5Var.getInputMethodMode() == 2 || ik5Var.getContentView() == null) {
            return;
        }
        y0d0Var.U0.removeCallbacks(w0d0Var);
        w0d0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
