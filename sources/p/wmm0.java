package p;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wmm0 extends vmm0 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c;
    public final /* synthetic */ MotionLayout d;

    public wmm0(MotionLayout motionLayout) {
        this.d = motionLayout;
    }

    @Override // p.vmm0
    public final float a() {
        return this.d.W0;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = this.a;
        float f3 = this.c;
        MotionLayout motionLayout = this.d;
        if (f2 > 0.0f) {
            float f4 = f2 / f3;
            if (f4 < f) {
                f = f4;
            }
            float f5 = f3 * f;
            motionLayout.W0 = f2 - f5;
            return ((f2 * f) - ((f5 * f) / 2.0f)) + this.b;
        }
        float f6 = (-f2) / f3;
        if (f6 < f) {
            f = f6;
        }
        float f7 = f3 * f;
        motionLayout.W0 = f7 + f2;
        return ((f7 * f) / 2.0f) + (f2 * f) + this.b;
    }
}
