package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y6c extends CoordinatorLayout {
    public final View b1;
    public final RecyclerView c1;
    public final View d1;
    public final ViewGroup e1;
    public final ComposeView f1;
    public p1d0 g1;
    public hsl1 h1;
    public ArrayList i1;
    public String j1;

    /* JADX WARN: Multi-variable type inference failed */
    public y6c(Context context) {
        super(context, (AttributeSet) null, 0);
        View viewInflate = LayoutInflater.from(context).inflate(2131624299, (ViewGroup) this, true);
        this.b1 = viewInflate;
        this.c1 = viewInflate.findViewById(2131427796);
        this.d1 = viewInflate.findViewById(2131427777);
        this.e1 = (ViewGroup) viewInflate.findViewById(2131427801);
        this.f1 = viewInflate.findViewById(2131427797);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View viewFindFocus;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 61 && keyEvent.isShiftPressed() && (viewFindFocus = findFocus()) != null) {
            while (viewFindFocus != null) {
                RecyclerView recyclerView = this.c1;
                if (viewFindFocus.equals(recyclerView)) {
                    a layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if ((linearLayoutManager != null ? linearLayoutManager.c1() : -1) != 0 || !this.f1.requestFocus()) {
                        break;
                        break;
                    }
                    return true;
                }
                Object parent = viewFindFocus.getParent();
                viewFindFocus = parent instanceof View ? (View) parent : null;
            }
        }
        return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
    }

    public final View getAppBarLayout() {
        return this.d1;
    }

    public final RecyclerView getRecyclerView() {
        return this.c1;
    }

    public final ViewGroup getToolbarContainer() {
        return this.e1;
    }
}
