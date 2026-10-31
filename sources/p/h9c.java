package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h9c {
    public final View a;

    public h9c(View view) {
        this.a = view;
    }

    public final boolean a(int i) {
        View view = this.a;
        View view2 = view;
        View viewFocusSearch = null;
        for (int i2 = 0; view2 != null && viewFocusSearch == null && i2 < 20; i2++) {
            viewFocusSearch = view2.focusSearch(i);
            if (u890.j(viewFocusSearch, view2) || u890.j(viewFocusSearch, view)) {
                viewFocusSearch = null;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return viewFocusSearch != null && viewFocusSearch.requestFocus();
    }
}
