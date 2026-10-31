package p;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aad1 extends Animation {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ aad1(SwipeRefreshLayout swipeRefreshLayout, byte b) {
        this.a = b;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        byte b = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                swipeRefreshLayout.setAnimationProgress(1.0f - f);
                break;
            case 1:
                int iAbs = swipeRefreshLayout.a1 - Math.abs(swipeRefreshLayout.Z0);
                int i = swipeRefreshLayout.Y0;
                swipeRefreshLayout.setTargetOffsetTopAndBottom((i + ((int) ((iAbs - i) * f))) - swipeRefreshLayout.W0.getTop());
                rcg rcgVar = swipeRefreshLayout.c1;
                float f2 = 1.0f - f;
                qcg qcgVar = rcgVar.a;
                if (f2 != qcgVar.p) {
                    qcgVar.p = f2;
                }
                rcgVar.invalidateSelf();
                break;
            default:
                swipeRefreshLayout.i(f);
                break;
        }
    }
}
