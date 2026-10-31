package p;

import android.view.animation.Animation;
import com.spotify.appendix.contentviewstate.view.LoadingView;
import java.util.LinkedList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yd5 extends td5 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;

    public yd5(LoadingView loadingView) {
        this.b = loadingView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj;
                LinkedList linkedList = (LinkedList) l7m0Var.b;
                linkedList.remove();
                if (linkedList.size() >= 1) {
                    l7m0Var.i();
                }
                break;
            default:
                LoadingView loadingView = (LoadingView) obj;
                if (animation != loadingView.i) {
                    if (animation == loadingView.t) {
                        loadingView.N0 = 6;
                        loadingView.setVisibility(8);
                    }
                } else if (loadingView.N0 == 3) {
                    loadingView.N0 = 4;
                }
                break;
        }
    }

    public yd5(l7m0 l7m0Var, zd5 zd5Var) {
        this.b = l7m0Var;
    }
}
