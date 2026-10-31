package com.spotify.mainlayout.ui.view.gradient;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.a32;
import p.a42;
import p.e3n;
import p.eyh0;
import p.i1o1;
import p.mt41;
import p.w5o0;
import p.xyf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\f"}, d2 = {"Lcom/spotify/mainlayout/ui/view/gradient/AdjustBottomGradientBasedOnScrollPositionBehavior;", "Lp/e3n;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p/eyh0", "p/a32", "src_main_java_com_spotify_mainlayout_ui_view-view"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class AdjustBottomGradientBasedOnScrollPositionBehavior extends e3n {
    public mt41 a;

    public AdjustBottomGradientBasedOnScrollPositionBehavior() {
    }

    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        xyf0 bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view;
        if ((i & 2) != 2) {
            return false;
        }
        mt41 mt41Var = this.a;
        if (mt41Var == null) {
            Object parent = coordinatorLayout.getParent();
            MainLayout mainLayout = parent instanceof MainLayout ? (MainLayout) parent : null;
            if (mainLayout == null || (bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view = mainLayout.getBottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view()) == null) {
                mt41Var = null;
            } else {
                mt41 mt41Var2 = new mt41(new eyh0(coordinatorLayout), new a42(bottomGradientManager$src_main_java_com_spotify_mainlayout_ui_view_view, (byte) 8));
                this.a = mt41Var2;
                mt41Var = mt41Var2;
            }
        }
        if (mt41Var == null) {
            return false;
        }
        int i3 = w5o0.f1;
        mt41Var.f.c(mt41.h[1], mt41Var, new a32(i1o1.s(view3)));
        return false;
    }

    public AdjustBottomGradientBasedOnScrollPositionBehavior(Context context, AttributeSet attributeSet) {
    }
}
