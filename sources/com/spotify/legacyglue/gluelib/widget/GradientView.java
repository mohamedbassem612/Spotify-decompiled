package com.spotify.legacyglue.gluelib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p.b8k1;
import p.xnz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Deprecated
public class GradientView extends View {
    public GradientDrawable a;
    public final int[] b;
    public GradientDrawable.Orientation c;

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        if (isInEditMode()) {
            this.b = new int[]{-16777216, -1};
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xnz0.a);
            this.b = new int[]{typedArrayObtainStyledAttributes.getColor(0, -16777216), typedArrayObtainStyledAttributes.getColor(1, -1)};
            i = (int) typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        setAngle(i);
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        GradientDrawable gradientDrawable = this.a;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable(this.c, this.b);
            this.a = gradientDrawable;
        }
        gradientDrawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = this.a;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable(this.c, this.b);
            this.a = gradientDrawable;
        }
        gradientDrawable.setBounds(0, 0, i3 - i, i4 - i2);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setAngle(int i) {
        int i2 = i / 90;
        if (i2 == 0) {
            this.c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else if (i2 == 1) {
            this.c = GradientDrawable.Orientation.BOTTOM_TOP;
        } else if (i2 == 2) {
            this.c = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if (i2 != 3) {
            this.c = GradientDrawable.Orientation.LEFT_RIGHT;
        } else {
            this.c = GradientDrawable.Orientation.TOP_BOTTOM;
        }
        this.a = null;
    }

    public void setEndColor(int i) {
        this.b[1] = i;
        this.a = null;
    }

    public void setStartColor(int i) {
        this.b[0] = i;
        this.a = null;
    }

    public GradientView(Context context) {
        super(context);
        this.c = GradientDrawable.Orientation.LEFT_RIGHT;
        this.b = new int[]{-16777216, -1};
        WeakHashMap weakHashMap = b8k1.a;
        setBackground(null);
    }
}
