package com.spotify.nowplaying.scroll.container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.db91;
import p.fjg1;
import p.jch0;
import p.jhg1;
import p.lw11;
import p.rwq0;
import p.zq41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/spotify/nowplaying/scroll/container/ScrollCardsContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "src_main_java_com_spotify_nowplaying_scroll-scroll"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScrollCardsContainer extends LinearLayout {
    public zq41 a;

    public ScrollCardsContainer(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, 2132017814), attributeSet, i);
        setVisibility(8);
        setOrientation(1);
        setShowDividers(2);
        setDividerDrawable(context.getDrawable(2131234024));
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131167224) - jch0.U(getResources().getDisplayMetrics().density * 8.0f);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getResources().getDimensionPixelSize(2131167223));
        rwq0.s(this, new lw11(this, (byte) 25));
    }

    public final void a(boolean z) {
        if (z != (getVisibility() == 0)) {
            if (z) {
                ViewParent parent = getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    db91 db91Var = new db91();
                    db91Var.h1 = db91.p1;
                    db91Var.X(80);
                    ((jhg1) db91Var).c = 300L;
                    db91Var.b(this);
                    fjg1.a(viewGroup, db91Var);
                }
            }
            setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        a(getChildCount() > 0);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        a(getChildCount() > 0);
    }

    public ScrollCardsContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScrollCardsContainer(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScrollCardsContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
