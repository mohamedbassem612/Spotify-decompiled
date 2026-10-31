package p;

import android.R;
import android.view.animation.AlphaAnimation;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.appendix.contentviewstate.view.LoadingView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lce0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LoadingView b;

    public /* synthetic */ lce0(LoadingView loadingView, byte b) {
        this.a = b;
        this.b = loadingView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        LoadingView loadingView = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i = loadingView.N0;
                if (i == 3 || i == 4) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(loadingView.d);
                    loadingView.a.startAnimation(alphaAnimation);
                    loadingView.a.setVisibility(0);
                }
                break;
            default:
                int iC = l1d.C(loadingView.N0);
                if (iC == 0 || iC == 1) {
                    if (loadingView.N0 == 2) {
                        loadingView.removeCallbacks(loadingView.O0);
                    }
                    loadingView.N0 = 6;
                    loadingView.a();
                    loadingView.b.a();
                    loadingView.setVisibility(8);
                } else if (iC == 2 || iC == 3) {
                    if (loadingView.N0 == 3) {
                        loadingView.a();
                    }
                    loadingView.removeCallbacks(loadingView.P0);
                    loadingView.N0 = 5;
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(loadingView.g / 255.0f, 0.0f);
                    loadingView.t = alphaAnimation2;
                    alphaAnimation2.setFillAfter(true);
                    loadingView.t.setFillEnabled(true);
                    loadingView.t.setDuration(loadingView.e);
                    loadingView.i.setInterpolator(loadingView.getContext(), R.interpolator.decelerate_quad);
                    loadingView.t.setAnimationListener(loadingView.R0);
                    loadingView.startAnimation(loadingView.t);
                    loadingView.b.a();
                }
                break;
        }
    }
}
