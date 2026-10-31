package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import p.arg;
import p.b8k1;
import p.dgo1;
import p.omz0;
import p.roz0;
import p.x5j1;
import p.x74;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
class ClockFaceView extends roz0 implements arg {
    public final ClockHandView W0;
    public final Rect X0;
    public final RectF Y0;
    public final SparseArray Z0;
    public final c a1;
    public final int[] b1;
    public final float[] c1;
    public final int d1;
    public final int e1;
    public final int f1;
    public final int g1;
    public final String[] h1;
    public float i1;
    public final ColorStateList j1;

    /* JADX WARN: Multi-variable type inference failed */
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.X0 = new Rect();
        this.Y0 = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.Z0 = sparseArray;
        this.c1 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.j, i, 2132018857);
        Resources resources = getResources();
        ColorStateList colorStateListI = dgo1.i(context, typedArrayObtainStyledAttributes, 1);
        this.j1 = colorStateListI;
        LayoutInflater.from(context).inflate(2131625191, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(2131429914);
        this.W0 = clockHandView;
        this.d1 = resources.getDimensionPixelSize(2131166418);
        int colorForState = colorStateListI.getColorForState(new int[]{R.attr.state_selected}, colorStateListI.getDefaultColor());
        this.b1 = new int[]{colorForState, colorForState, colorStateListI.getDefaultColor()};
        clockHandView.a.add(this);
        int defaultColor = x74.E(context, 2131102202).getDefaultColor();
        ColorStateList colorStateListI2 = dgo1.i(context, typedArrayObtainStyledAttributes, 0);
        setBackgroundColor(colorStateListI2 != null ? colorStateListI2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.a1 = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.h1 = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.h1.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.h1.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(2131625190, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.h1[i2]);
                textView.setTag(2131429930, Integer.valueOf(i2));
                b8k1.p(textView, this.a1);
                textView.setTextColor(this.j1);
            }
        }
        this.e1 = resources.getDimensionPixelSize(2131166448);
        this.f1 = resources.getDimensionPixelSize(2131166449);
        this.g1 = resources.getDimensionPixelSize(2131166424);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super/*android.view.View*/.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x5j1.h(1, this.h1.length, 1, false).b);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.g1 / Math.max(Math.max(this.e1 / displayMetrics.heightPixels, this.f1 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z() {
        RadialGradient radialGradient;
        RectF rectF = this.W0.e;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.Z0;
            if (i >= sparseArray.size()) {
                return;
            }
            TextView textView = (TextView) sparseArray.get(i);
            if (textView != null) {
                Rect rect = this.X0;
                textView.getDrawingRect(rect);
                rect.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, rect);
                RectF rectF2 = this.Y0;
                rectF2.set(rect);
                if (RectF.intersects(rectF, rectF2)) {
                    radialGradient = new RadialGradient(rectF.centerX() - rectF2.left, rectF.centerY() - rectF2.top, 0.5f * rectF.width(), this.b1, this.c1, Shader.TileMode.CLAMP);
                } else {
                    radialGradient = null;
                }
                textView.getPaint().setShader(radialGradient);
                textView.invalidate();
            }
            i++;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969722);
    }

    public ClockFaceView(Context context) {
        this(context, null);
    }
}
