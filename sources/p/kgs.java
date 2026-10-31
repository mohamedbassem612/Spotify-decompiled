package p;

import android.animation.ValueAnimator;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kgs implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ConstraintLayout a;
    public final /* synthetic */ ibv0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TransitionSet d;

    public kgs(tps tpsVar, ConstraintLayout constraintLayout, ibv0 ibv0Var, int i, TransitionSet transitionSet) {
        this.a = constraintLayout;
        this.b = ibv0Var;
        this.c = i;
        this.d = transitionSet;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ibv0 ibv0Var = this.b;
        int i = this.c;
        ConstraintLayout constraintLayout = this.a;
        tps.e(constraintLayout, ibv0Var, i);
        TransitionManager.beginDelayedTransition(constraintLayout, this.d);
    }
}
