package p;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nsg {
    public final ConstraintLayout a;

    public nsg(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public nsg(ComposeView composeView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.a = constraintLayout;
    }

    public nsg(ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.a = constraintLayout;
    }
}
