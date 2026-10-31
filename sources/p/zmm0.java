package p;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zmm0 {
    public float a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ MotionLayout e;

    public zmm0(MotionLayout motionLayout) {
        this.e = motionLayout;
    }

    public final void a() {
        int i = this.c;
        MotionLayout motionLayout = this.e;
        if (i != -1 || this.d != -1) {
            int i2 = this.d;
            if (i == -1) {
                motionLayout.M(i2);
            } else if (i2 == -1) {
                motionLayout.I(i);
            } else {
                motionLayout.J(i, i2);
            }
            motionLayout.setState(bnm0.b);
        }
        boolean zIsNaN = Float.isNaN(this.b);
        float f = this.a;
        if (zIsNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            motionLayout.setProgress(this.a);
        } else {
            motionLayout.H(f, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
    }
}
