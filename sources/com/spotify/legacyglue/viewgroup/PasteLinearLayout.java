package com.spotify.legacyglue.viewgroup;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p.kfd;
import p.tf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Deprecated
public class PasteLinearLayout extends LinearLayout implements tf0, kfd {
    public static final int[] c = {R.attr.state_active};
    public static final int[] d = {-16842910};
    public boolean a;
    public boolean b;

    public PasteLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        if (this.b) {
            for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
                if (iArrOnCreateDrawableState[i2] == 16842910) {
                    iArrOnCreateDrawableState[i2] = -16842910;
                }
            }
            View.mergeDrawableStates(iArrOnCreateDrawableState, d);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p.tf0
    public void setActive(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // p.kfd
    public void setAppearsDisabled(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PasteLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
