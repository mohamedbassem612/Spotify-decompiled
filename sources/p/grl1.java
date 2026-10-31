package p;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class grl1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ mrl1 a;
    public final /* synthetic */ hsl1 b;
    public final /* synthetic */ hsl1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    public grl1(mrl1 mrl1Var, hsl1 hsl1Var, hsl1 hsl1Var2, int i, View view) {
        this.a = mrl1Var;
        this.b = hsl1Var;
        this.c = hsl1Var2;
        this.d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        vrl1 prl1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        mrl1 mrl1Var = this.a;
        mrl1Var.f(animatedFraction);
        float fC = mrl1Var.a.c();
        PathInterpolator pathInterpolator = irl1.e;
        int i = Build.VERSION.SDK_INT;
        hsl1 hsl1Var = this.b;
        if (i >= 36) {
            prl1Var = new url1(hsl1Var);
        } else if (i >= 35) {
            prl1Var = new trl1(hsl1Var);
        } else if (i >= 34) {
            prl1Var = new srl1(hsl1Var);
        } else if (i >= 31) {
            prl1Var = new rrl1(hsl1Var);
        } else if (i >= 30) {
            prl1Var = new qrl1(hsl1Var);
        } else {
            prl1Var = i >= 29 ? new prl1(hsl1Var) : new nrl1(hsl1Var);
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            esl1 esl1Var = hsl1Var.a;
            if (i3 == 0) {
                prl1Var.d(i2, esl1Var.i(i2));
            } else {
                nk80 nk80VarI = esl1Var.i(i2);
                nk80 nk80VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                prl1Var.d(i2, hsl1.e(nk80VarI, (int) (((double) ((nk80VarI.a - nk80VarI2.a) * f)) + 0.5d), (int) (((double) ((nk80VarI.b - nk80VarI2.b) * f)) + 0.5d), (int) (((double) ((nk80VarI.c - nk80VarI2.c) * f)) + 0.5d), (int) (((double) ((nk80VarI.d - nk80VarI2.d) * f)) + 0.5d)));
            }
        }
        irl1.h(this.e, prl1Var.b(), Collections.singletonList(mrl1Var));
    }
}
