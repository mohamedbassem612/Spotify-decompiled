package p;

import android.animation.ValueAnimator;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5f1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6f1 b;

    public /* synthetic */ y5f1(a6f1 a6f1Var, byte b) {
        this.a = b;
        this.b = a6f1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        a6f1 a6f1Var = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6f1Var.a(fFloatValue);
                float f = a6f1Var.h * fFloatValue;
                RectF rectF = a6f1Var.T0;
                float f2 = -f;
                rectF.left = f2;
                rectF.top = f2;
                rectF.right = f;
                rectF.bottom = f;
                a6f1Var.invalidate();
                break;
            default:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6f1Var.a(fFloatValue2);
                float f3 = a6f1Var.h * fFloatValue2;
                RectF rectF2 = a6f1Var.T0;
                float f4 = -f3;
                rectF2.left = f4;
                rectF2.top = f4;
                rectF2.right = f3;
                rectF2.bottom = f3;
                a6f1Var.invalidate();
                break;
        }
    }
}
