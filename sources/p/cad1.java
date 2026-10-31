package p;

import android.view.View;
import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cad1 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ cad1(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        SwipeRefreshLayout swipeRefreshLayout = this.b;
        switch (b) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout2 = swipeRefreshLayout;
                aad1 aad1Var = new aad1(swipeRefreshLayout2, (byte) 0);
                swipeRefreshLayout2.e1 = aad1Var;
                aad1Var.setDuration(150L);
                ccg ccgVar = swipeRefreshLayout2.W0;
                ccgVar.a = null;
                ccgVar.clearAnimation();
                swipeRefreshLayout2.W0.startAnimation(swipeRefreshLayout2.e1);
                break;
            default:
                swipeRefreshLayout.setVisibility(8);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        byte b = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
