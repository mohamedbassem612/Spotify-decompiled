package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.spotify.encoreconsumermobile.elements.playindicator.PlayIndicatorView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class clt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayIndicatorView b;
    public final /* synthetic */ cdf0 c;

    public clt0(int i, PlayIndicatorView playIndicatorView, cdf0 cdf0Var) {
        this.a = i;
        this.b = playIndicatorView;
        this.c = cdf0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cdf0 pausedDrawable;
        int i = this.a;
        PlayIndicatorView playIndicatorView = this.b;
        if (i == 1) {
            playIndicatorView.getPlayingDrawable().k();
            pausedDrawable = playIndicatorView.getPlayingDrawable();
        } else {
            pausedDrawable = playIndicatorView.getPausedDrawable();
        }
        playIndicatorView.setImageDrawable(pausedDrawable);
        this.c.b.removeAllListeners();
        playIndicatorView.V0 = false;
    }
}
