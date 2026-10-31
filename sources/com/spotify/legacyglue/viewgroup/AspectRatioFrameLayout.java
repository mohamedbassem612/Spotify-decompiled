package com.spotify.legacyglue.viewgroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import p.boz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Deprecated
public class AspectRatioFrameLayout extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public int f;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, boz0.a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
            } else if (index == 1) {
                this.b = typedArrayObtainStyledAttributes.getBoolean(index, this.b);
            } else if (index == 0) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 5) {
                this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
            } else if (index == 4) {
                this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e);
            } else if (index == 3) {
                this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        if (defaultSize == 0 && defaultSize2 == 0) {
            Logger.k("With both width and height set to zero, it is impossible to calculate and enforce aspect ratio.", new Object[0]);
            super.onMeasure(i, i2);
            return;
        }
        if (defaultSize == 0) {
            defaultSize = Math.round(defaultSize2 * this.a) + this.e;
        } else {
            float f = this.a;
            if (defaultSize2 == 0) {
                defaultSize2 = Math.round(defaultSize / f) + this.f;
            } else {
                float f2 = defaultSize / defaultSize2;
                boolean z = this.d;
                if (f > f2) {
                    if (!z || View.MeasureSpec.getMode(i2) != 1073741824 || !this.c) {
                        defaultSize2 = Math.round((defaultSize - this.e) / this.a);
                    }
                } else if (!z || View.MeasureSpec.getMode(i) != 1073741824 || !this.b) {
                    defaultSize = Math.round((defaultSize2 - this.f) * this.a);
                }
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    public void setAspectRatio(float f) {
        this.a = f;
    }

    public void setExtraHeight(int i) {
        this.f = i;
    }

    public void setExtraWidth(int i) {
        this.e = i;
    }

    public void setRespectExactMeasures(boolean z) {
        this.d = z;
    }

    public AspectRatioFrameLayout(Context context) {
        super(context);
        this.a = 1.0f;
    }
}
