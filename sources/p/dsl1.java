package p;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dsl1 extends csl1 {
    public dsl1(hsl1 hsl1Var, WindowInsets windowInsets) {
        super(hsl1Var, windowInsets);
    }

    public List<Rect> f(int i) {
        return ((wrl1) this).c.getBoundingRects(gsl1.a(i));
    }

    public List<Rect> g(int i) {
        return ((wrl1) this).c.getBoundingRectsIgnoringVisibility(gsl1.a(i));
    }

    public dsl1(hsl1 hsl1Var, dsl1 dsl1Var) {
        super(hsl1Var, dsl1Var);
    }

    public void q() {
    }
}
