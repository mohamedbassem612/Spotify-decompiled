package p;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ryd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ryd(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                qhl qhlVar = (qhl) view.getLayoutParams();
                ((ViewGroup.MarginLayoutParams) qhlVar).height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(qhlVar);
                view.requestLayout();
                break;
            default:
                view.getBackground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
