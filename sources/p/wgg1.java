package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wgg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ jhg1 a;

    public wgg1(jhg1 jhg1Var) {
        this.a = jhg1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.r();
        animator.removeListener(this);
    }
}
