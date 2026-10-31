package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mcg extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ncg b;

    public /* synthetic */ mcg(ncg ncgVar, byte b) {
        this.a = b;
        this.b = ncgVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                ncg ncgVar = this.b;
                ncgVar.m();
                n95 n95Var = ncgVar.Y;
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
                ncg ncgVar = this.b;
                ncgVar.i = (ncgVar.i + 4) % ncgVar.h.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
