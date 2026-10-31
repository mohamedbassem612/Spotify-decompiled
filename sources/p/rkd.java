package p;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rkd implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rkd(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vkd) obj).O();
                break;
            case 1:
                ((CoordinatorLayout) obj).q(0);
                break;
            default:
                ((jkk1) obj).f();
                break;
        }
        return true;
    }
}
