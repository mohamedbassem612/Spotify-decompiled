package p;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rk5 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ x22 a;
    public final /* synthetic */ sk5 b;

    public rk5(sk5 sk5Var, x22 x22Var) {
        this.b = sk5Var;
        this.a = x22Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.f1.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
