package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jl10 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ kl10 b;

    public jl10(kl10 kl10Var) {
        this.b = kl10Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        kl10 kl10Var = this.b;
        if (((Float) kl10Var.Z0.getAnimatedValue()).floatValue() == 0.0f) {
            kl10Var.a1 = (byte) 0;
            kl10Var.l(0);
        } else {
            kl10Var.a1 = (byte) 2;
            kl10Var.S0.invalidate();
        }
    }
}
