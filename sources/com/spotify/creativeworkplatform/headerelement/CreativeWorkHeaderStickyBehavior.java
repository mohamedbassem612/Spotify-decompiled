package com.spotify.creativeworkplatform.headerelement;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import p.e3n;
import p.qo9;
import p.tw20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/spotify/creativeworkplatform/headerelement/CreativeWorkHeaderStickyBehavior;", "Lp/e3n;", "Landroid/view/View;", "src_main_java_com_spotify_creativeworkplatform_headerelement-headerelement"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CreativeWorkHeaderStickyBehavior extends e3n {
    public final View a;
    public Toolbar b;
    public final int[] c = {0, 0};

    public CreativeWorkHeaderStickyBehavior(View view) {
        this.a = view;
    }

    public final boolean b(View view, View view2) {
        if (!(view2 instanceof AppBarLayout)) {
            return false;
        }
        Toolbar toolbar = this.b;
        if (toolbar == null) {
            toolbar = (Toolbar) view2.findViewById(2131431397);
            this.b = toolbar;
        }
        return toolbar != null;
    }

    public final boolean d(View view, View view2) {
        Toolbar toolbar = this.b;
        if (toolbar == null) {
            return false;
        }
        t(view, toolbar);
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View childAt;
        int i2 = 0;
        while (true) {
            if (!(i2 < coordinatorLayout.getChildCount())) {
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
        if (childAt != null) {
            Toolbar toolbar = this.b;
            if (toolbar == null) {
                toolbar = (Toolbar) childAt.findViewById(2131431397);
                this.b = toolbar;
            }
            if (toolbar != null) {
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new qo9(this, view, toolbar, (byte) 3));
                } else {
                    t(view, toolbar);
                }
            }
        }
        return false;
    }

    public final void t(View view, Toolbar toolbar) {
        View view2 = this.a;
        int[] iArr = this.c;
        view2.getLocationInWindow(iArr);
        float height = (iArr[1] + (view2.getHeight() / 2)) - (view.getHeight() / 2);
        int[] iArr2 = {0, 0};
        view.getParent().getLocationInWindow(iArr2);
        int[] iArr3 = {0, 0};
        toolbar.getLocationInWindow(iArr3);
        float height2 = (iArr3[1] - iArr2[1]) + toolbar.getHeight();
        float height3 = height2 - (view.getHeight() / 2);
        float height4 = height - iArr2[1];
        if (height4 <= height3) {
            height4 = height2 - (view.getHeight() / 2);
        }
        view.setTranslationY(height4);
    }
}
