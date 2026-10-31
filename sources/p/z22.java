package p;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z22 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ggx0) obj).invoke();
                break;
            case 1:
                ((dt71) obj).a(rih1.a);
                break;
            case 2:
                ((ytg) obj).invoke();
                break;
            case 3:
                n830 n830Var = (n830) obj;
                ConstraintLayout constraintLayout = (ConstraintLayout) n830Var.f;
                int height = constraintLayout.getHeight();
                constraintLayout.getBackground().mutate().setAlpha((int) (height != 0 ? 255.0f - ((Math.max(0, height - ((NestedScrollView) n830Var.g).getScrollY()) * 255.0f) / height) : 255.0f));
                break;
            default:
                ((vik1) obj).a();
                break;
        }
    }
}
