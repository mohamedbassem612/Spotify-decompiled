package com.spotify.legacyglue.textview;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.textview.MaterialTextView;
import p.fa30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Deprecated
public class CheckableTextView extends MaterialTextView implements Checkable {
    public static final int[] t = {R.attr.state_checked};
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fa30.a(this, context);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super/*android.view.View*/.onCreateDrawableState(i + 1);
        if (this.i) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, t);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.i = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }

    public CheckableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckableTextView(Context context) {
        this(context, null);
    }
}
