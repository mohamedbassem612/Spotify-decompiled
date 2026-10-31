package com.spotify.encoreconsumermobile.layout.headers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import p.e3n;
import p.qo9;
import p.tw20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/encoreconsumermobile/layout/headers/ComposePlayButtonBehavior;", "Lp/e3n;", "Landroidx/compose/ui/platform/ComposeView;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "src_main_java_com_spotify_encoreconsumermobile_layout_headers-headers"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ComposePlayButtonBehavior extends e3n {
    public Toolbar a;

    public ComposePlayButtonBehavior() {
    }

    public static void t(ComposeView composeView, View view, Toolbar toolbar) {
        float height = toolbar.getHeight();
        float y = view.getY() + view.getHeight();
        int height2 = composeView.getHeight();
        float f = height2 / 2;
        float dimensionPixelSize = composeView.getResources().getDimensionPixelSize(2131166135);
        composeView.setTranslationY(y <= (height + f) - dimensionPixelSize ? height - f : (y - height2) + dimensionPixelSize);
    }

    public final boolean b(View view, View view2) {
        if (!(view2 instanceof AppBarLayout)) {
            return false;
        }
        Toolbar toolbar = this.a;
        if (toolbar == null) {
            toolbar = (Toolbar) view2.findViewById(2131431397);
            this.a = toolbar;
        }
        return toolbar != null;
    }

    public final boolean d(View view, View view2) {
        ComposeView composeView = (ComposeView) view;
        Toolbar toolbar = this.a;
        if (toolbar == null) {
            return false;
        }
        t(composeView, view2, toolbar);
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View childAt;
        ComposeView composeView = (ComposeView) view;
        int i2 = 0;
        while (true) {
            if (i2 >= coordinatorLayout.getChildCount()) {
                childAt = null;
                break;
            }
            int i3 = i2 + 1;
            childAt = coordinatorLayout.getChildAt(i2);
            if (childAt == null) {
                tw20.p();
                return false;
            }
            if (childAt instanceof AppBarLayout) {
                break;
            }
            i2 = i3;
        }
        View view2 = childAt;
        if (view2 != null) {
            Toolbar toolbar = this.a;
            if (toolbar == null) {
                toolbar = (Toolbar) view2.findViewById(2131431397);
                this.a = toolbar;
            }
            Toolbar toolbar2 = toolbar;
            if (toolbar2 != null) {
                if (composeView.isLaidOut() && !composeView.isLayoutRequested()) {
                    t(composeView, view2, toolbar2);
                    return false;
                }
                composeView.addOnLayoutChangeListener(new qo9(this, composeView, view2, toolbar2, (byte) 2));
            }
        }
        return false;
    }

    public ComposePlayButtonBehavior(Context context, AttributeSet attributeSet) {
    }
}
