package p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aja implements Interpolator {
    public final /* synthetic */ byte a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.a) {
            case 0:
            case 2:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            case 1:
                return f * f * f * f * f;
        }
    }
}
