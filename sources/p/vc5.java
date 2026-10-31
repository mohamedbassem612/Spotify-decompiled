package p;

import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vc5 {
    public final float a = 1.0f;
    public final PathInterpolator b;
    public final float c;
    public final float d;

    public vc5(float f, float f2, PathInterpolator pathInterpolator) {
        this.c = f;
        this.d = f2;
        this.b = pathInterpolator;
    }

    public final float a(float f) {
        dm5.n(f >= 0.0f, Boolean.valueOf(f <= 1.0f));
        float f2 = this.a;
        float f3 = f2 - 0.0f;
        if (f3 == 0.0f) {
            f3 = 1.0f / f2;
        }
        float interpolation = this.b.getInterpolation(o0c.t(0.0f, 1.0f, (f - 0.0f) / f3));
        return (this.d * interpolation) + ((1.0f - interpolation) * this.c);
    }
}
