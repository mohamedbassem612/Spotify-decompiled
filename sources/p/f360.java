package p;

import android.animation.ValueAnimator;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f360 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ h72 a;

    public f360(h72 h72Var) {
        this.a = h72Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        h72 h72Var = this.a;
        ((BehaviorRetainingAppBarLayout) h72Var.b).getBehavior().v(((Integer) valueAnimator.getAnimatedValue()).intValue());
        ((BehaviorRetainingAppBarLayout) h72Var.b).requestLayout();
    }
}
