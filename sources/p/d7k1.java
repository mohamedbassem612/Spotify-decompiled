package p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7k1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ View e;
    public final /* synthetic */ boolean f;

    public d7k1(int i, int i2, float f, float f2, View view, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = view;
        this.f = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = this.b;
        int i2 = this.a;
        int i3 = i2 + ((int) ((i - i2) * fFloatValue));
        float f = this.c;
        float fE = l1d.e(this.d, f, fFloatValue, f);
        View view = this.e;
        view.setAlpha(fE);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f) {
            layoutParams.width = i3;
        } else {
            layoutParams.height = i3;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
