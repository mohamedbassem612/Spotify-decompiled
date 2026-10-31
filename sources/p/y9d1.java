package p;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y9d1 implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout a;

    public y9d1(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        al00 al00Var;
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.c) {
            swipeRefreshLayout.m();
            return;
        }
        swipeRefreshLayout.c1.setAlpha(255);
        swipeRefreshLayout.c1.start();
        if (swipeRefreshLayout.h1 && (al00Var = swipeRefreshLayout.b) != null) {
            al00Var.a();
        }
        swipeRefreshLayout.Q0 = swipeRefreshLayout.W0.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
