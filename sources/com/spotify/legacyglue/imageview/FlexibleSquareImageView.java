package com.spotify.legacyglue.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import p.dm5;
import p.ynz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Deprecated
public class FlexibleSquareImageView extends AppCompatImageView {
    public final float d;

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ynz0.a, i, 0);
        dm5.m(typedArrayObtainStyledAttributes.hasValue(0));
        this.d = typedArrayObtainStyledAttributes.getFraction(0, 1, 1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        int iMax = (int) Math.max(View.MeasureSpec.getSize(i) * this.d, getSuggestedMinimumWidth());
        setMeasuredDimension(iMax, iMax);
    }

    public FlexibleSquareImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexibleSquareImageView(Context context) {
        this(context, null);
    }
}
