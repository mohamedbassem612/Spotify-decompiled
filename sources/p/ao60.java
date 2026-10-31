package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ao60 {
    public final az20 a;
    public final View b;

    public ao60(az20 az20Var, View view) {
        this.a = az20Var;
        this.b = view;
    }

    public final boolean a(int i) {
        View view = this.b;
        View viewFocusSearch = null;
        while (view != null && viewFocusSearch == null) {
            viewFocusSearch = view.focusSearch(i);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return viewFocusSearch != null && viewFocusSearch.requestFocus();
    }
}
