package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zca extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kda b;

    public /* synthetic */ zca(kda kdaVar, byte b) {
        this.a = b;
        this.b = kdaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kda kdaVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kdaVar.d();
                break;
            default:
                kdaVar.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = this.b.d;
                snackbarContentLayout.a.setAlpha(0.0f);
                snackbarContentLayout.a.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(0.0f);
                    snackbarContentLayout.b.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
