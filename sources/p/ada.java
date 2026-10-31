package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ada extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ada(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((kda) obj).c(i);
                break;
            case 1:
                ((kda) obj).c(i);
                break;
            default:
                ((chd1) obj).b = i;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                SnackbarContentLayout snackbarContentLayout = ((kda) obj).d;
                snackbarContentLayout.a.setAlpha(1.0f);
                snackbarContentLayout.a.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(1.0f);
                    snackbarContentLayout.b.animate().alpha(0.0f).setDuration(180L).setStartDelay(0L).start();
                }
                break;
            case 2:
                ((chd1) obj).b = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
