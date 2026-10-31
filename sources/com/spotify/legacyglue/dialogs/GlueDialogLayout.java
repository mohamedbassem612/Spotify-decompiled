package com.spotify.legacyglue.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import p.a8o;
import p.vnz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class GlueDialogLayout extends LinearLayout {
    public Button N0;
    public boolean O0;
    public final Paint P0;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public ScrollView i;
    public Button t;

    public GlueDialogLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.P0 = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vnz0.a, i, 0);
        try {
            this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, a8o.y(312.0f, getResources()));
            this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, a8o.y(520.0f, getResources()));
            this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, a8o.y(24.0f, getResources()));
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, a8o.y(24.0f, getResources()));
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, a8o.y(48.0f, getResources()));
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, a8o.y(48.0f, getResources()));
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, a8o.y(32.0f, getResources()));
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, a8o.y(40.0f, getResources()));
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 0, typedArrayObtainStyledAttributes.getColor(2, -1), Shader.TileMode.CLAMP));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int a(View view) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return measuredHeight;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + measuredHeight;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.O0 || view != this.i) {
            return super.drawChild(canvas, view, j);
        }
        super.drawChild(canvas, view, j);
        canvas.save();
        float left = view.getLeft();
        int bottom = view.getBottom();
        int i = this.e;
        canvas.translate(left, bottom - i);
        canvas.scale(1.0f, i);
        canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), 1.0f, this.P0);
        canvas.restore();
        return true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.i = (ScrollView) findViewById(2131428203);
        this.t = (Button) findViewById(2131427862);
        this.N0 = (Button) findViewById(2131427858);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = Math.min(getResources().getDisplayMetrics().widthPixels - (this.c * 2), this.a);
        ScrollView scrollView = this.i;
        if (scrollView == null || scrollView.getChildAt(0) == null) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
            return;
        }
        int iMin2 = Math.min(getResources().getDisplayMetrics().heightPixels - (this.d * 2), this.b);
        View childAt = this.i.getChildAt(0);
        childAt.measure(View.MeasureSpec.makeMeasureSpec((iMin - this.i.getPaddingLeft()) - this.i.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = childAt.getMeasuredHeight();
        Button button = this.t;
        boolean z = button.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
        int i3 = this.g;
        if (z) {
            ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = i3;
        }
        measureChildWithMargins(this.t, i, 0, i2, 0);
        measureChildWithMargins(this.N0, i, 0, i2, 0);
        int iA = a(this.N0);
        int iA2 = a(this.t) + measuredHeight + iA;
        if (iA2 <= iMin2) {
            this.O0 = false;
            this.i.getLayoutParams().height = measuredHeight;
        } else {
            this.O0 = true;
            Button button2 = this.t;
            boolean z2 = button2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams;
            int i4 = this.h;
            if (z2) {
                ((ViewGroup.MarginLayoutParams) button2.getLayoutParams()).topMargin = i4;
            }
            int i5 = iA2 - iMin2;
            int i6 = i3 - i4;
            this.i.getLayoutParams().height = (iMin2 - a(this.t)) - iA;
            if (i5 <= i6) {
                this.i.getLayoutParams().height -= i6;
            }
            ScrollView scrollView2 = this.i;
            scrollView2.setPadding(scrollView2.getPaddingLeft(), 0, this.i.getPaddingRight(), this.f);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
    }

    public GlueDialogLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueDialogLayout(Context context) {
        this(context, null);
    }
}
