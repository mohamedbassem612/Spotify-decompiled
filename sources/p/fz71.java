package p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fz71 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ gz71 a;

    public fz71(gz71 gz71Var) {
        this.a = gz71Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidateSelf();
    }
}
