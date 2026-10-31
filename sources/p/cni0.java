package p;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cni0 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ScrollView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cni0(ScrollView scrollView, Object obj, int i, byte b) {
        this.a = b;
        this.b = scrollView;
        this.d = obj;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        byte b = this.a;
        int i = this.c;
        ScrollView scrollView = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                h72 h72Var = (h72) ((gwa0) obj).f;
                float scrollY = scrollView.getScrollY();
                if (scrollY > 0.0f) {
                    float f = i;
                    if (scrollY >= f) {
                        ((View) h72Var.X).setAlpha(1.0f);
                    } else {
                        ((View) h72Var.X).setAlpha(scrollY / f);
                    }
                } else {
                    ((View) h72Var.X).setAlpha(0.0f);
                }
                break;
            default:
                View view = (View) obj;
                float scrollY2 = scrollView.getScrollY();
                if (scrollY2 > 0.0f) {
                    float f2 = i;
                    if (scrollY2 >= f2) {
                        view.setAlpha(1.0f);
                    } else {
                        view.setAlpha(scrollY2 / f2);
                    }
                } else {
                    view.setAlpha(0.0f);
                }
                break;
        }
    }
}
