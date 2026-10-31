package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pic0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qic0 b;

    public /* synthetic */ pic0(qic0 qic0Var, byte b) {
        this.a = b;
        this.b = qic0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                qic0 qic0Var = this.b;
                qic0Var.m();
                n95 n95Var = qic0Var.Y;
                if (n95Var != null) {
                    n95Var.a();
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                super.onAnimationRepeat(animator);
                qic0 qic0Var = this.b;
                qic0Var.i = (qic0Var.i + 1) % qic0Var.h.c.length;
                qic0Var.t = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
