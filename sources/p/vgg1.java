package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vgg1 extends AnimatorListenerAdapter {
    public final /* synthetic */ y36 a;
    public final /* synthetic */ jhg1 b;

    public vgg1(jhg1 jhg1Var, y36 y36Var) {
        this.b = jhg1Var;
        this.a = y36Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.N0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.N0.add(animator);
    }
}
