package p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class k6f0 implements Interpolator {
    public final float[] a;
    public final float b;

    public k6f0(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.b;
        float fE = ktd.e(iMin, f2, f, f2);
        float f3 = fArr[iMin];
        return l1d.e(fArr[iMin + 1], f3, fE, f3);
    }
}
