package com.spotify.encoreconsumermobile.layout.headers;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import p.e3n;
import p.qq41;
import p.rq41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/spotify/encoreconsumermobile/layout/headers/BehaviorRetainingAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lp/e3n;", "getBehavior", "()Lp/e3n;", "", "getReachedBottomOfScrollRange", "()Z", "reachedBottomOfScrollRange", "src_main_java_com_spotify_encoreconsumermobile_layout_headers-headers"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BehaviorRetainingAppBarLayout extends AppBarLayout {
    public rq41 V0;

    public BehaviorRetainingAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final boolean getReachedBottomOfScrollRange() {
        rq41 rq41Var = this.V0;
        return rq41Var != null && (-rq41Var.t()) == getTotalScrollRange();
    }

    public e3n getBehavior() {
        rq41 rq41Var = this.V0;
        if (rq41Var != null) {
            return rq41Var;
        }
        rq41 rq41Var2 = new rq41();
        ((AppBarLayout.BaseBehavior) rq41Var2).o = new qq41();
        this.V0 = rq41Var2;
        return rq41Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int measuredHeight = getMeasuredHeight();
        boolean z = measuredHeight > 0 && getReachedBottomOfScrollRange();
        super.onMeasure(i, i2);
        if (this.V0 == null) {
            this.V0 = getLayoutParams().a;
        }
        if (!z || getMeasuredHeight() <= measuredHeight) {
            return;
        }
        e(false, false, true);
    }
}
