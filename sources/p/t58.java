package p;

import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t58 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u58 b;

    public /* synthetic */ t58(u58 u58Var, byte b) {
        this.a = b;
        this.b = u58Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u58 u58Var = this.b;
        switch (b) {
            case 0:
                AppCompatTextView appCompatTextView = u58Var.b;
                ViewPropertyAnimator viewPropertyAnimator = u58Var.e;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                float f = u58Var.getLayoutParams().width;
                appCompatTextView.setVisibility(0);
                Drawable drawable = u58Var.d;
                if (drawable != null) {
                    drawable.setTintList(u58Var.h);
                }
                appCompatTextView.setAlpha(0.0f);
                appCompatTextView.setTranslationX(f);
                TransitionManager.beginDelayedTransition((ViewGroup) u58Var.getParent());
                u58Var.e = appCompatTextView.animate().setInterpolator(new hl10()).setDuration(600L).translationX(0.0f).alpha(1.0f).withEndAction(new t58(u58Var, (byte) 1));
                u58Var.f = null;
                break;
            default:
                Drawable drawable2 = u58Var.d;
                if (drawable2 != null) {
                    drawable2.setTintList(u58Var.g);
                }
                u58Var.e = null;
                break;
        }
    }
}
