package p;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bad1 extends Animation {
    public final /* synthetic */ int a;
    public final /* synthetic */ short b;
    public final /* synthetic */ SwipeRefreshLayout c;

    /* JADX WARN: Multi-variable type inference failed */
    public bad1(SwipeRefreshLayout swipeRefreshLayout, int i, int i2) {
        this.c = swipeRefreshLayout;
        this.a = i;
        this.b = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        rcg rcgVar = this.c.c1;
        int i = this.a;
        rcgVar.setAlpha((int) (((this.b - i) * f) + i));
    }
}
