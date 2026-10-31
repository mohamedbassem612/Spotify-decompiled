package p;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syd {
    public final View a;
    public boolean b;
    public nwq0 c = nwq0.c;
    public final int d;
    public final int e;

    public syd(View view, ComposeView composeView) {
        this.a = composeView;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167110);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(2131167108);
        int i = dimensionPixelSize + dimensionPixelSize2;
        this.d = (b8k1.n(view, 2131427918).getTop() - b8k1.n(view, 2131427919).getBottom()) - i;
        View viewN = b8k1.n(view, 2131427919);
        View viewN2 = b8k1.n(view, 2131430421);
        this.e = ((viewN2.getBottom() - viewN.getBottom()) - b8k1.n(view, 2131431490).getBottom()) - i;
    }

    public final AnimatorSet a(View view, int i, int i2, long j, long j2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ryd(view, (byte) 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.setStartDelay(j2);
        animatorSet.setInterpolator(hlv.c);
        animatorSet.play(valueAnimatorOfInt);
        animatorSet.addListener(new d20(this, (byte) 2));
        return animatorSet;
    }
}
