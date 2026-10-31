package p;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uik1 extends tik1 {
    @Override // p.tik1
    public final void L(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p.tik1
    public final void M(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p.tik1
    public final void N(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p.tik1
    public final void O(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    public final float x(View view) {
        return view.getTransitionAlpha();
    }

    public final void z(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
