package p;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class je5 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final hl10 b = new hl10();
    public static final gl10 c = new gl10((byte) 0);
    public static final gl10 d = new gl10((byte) 1);
    public static final DecelerateInterpolator e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f3) {
        return l1d.e(f2, f, f3, f);
    }
}
