package p;

import android.animation.Animator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bvq0 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ cvq0 c;

    public bvq0(boolean z, int i, cvq0 cvq0Var) {
        this.a = z;
        this.b = i;
        this.c = cvq0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        boolean z = this.a;
        cvq0 cvq0Var = this.c;
        if (z && (i = this.b) == 0) {
            cvq0Var.b.setBackgroundColor(i);
        }
        c1g0 c1g0Var = cvq0Var.i;
        if (c1g0Var != null) {
            c1g0Var.invoke();
        }
        cvq0Var.i = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
