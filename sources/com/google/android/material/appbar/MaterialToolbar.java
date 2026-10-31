package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import p.b8k1;
import p.blo1;
import p.gch0;
import p.ggo1;
import p.lyg;
import p.omz0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class MaterialToolbar extends Toolbar {
    public Integer x1;
    public boolean y1;
    public boolean z1;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018865), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.E, i, 2132018865, new int[0]);
        if (typedArrayS.hasValue(0)) {
            setNavigationIconTint(typedArrayS.getColor(0, -1));
        }
        this.y1 = typedArrayS.getBoolean(2, false);
        this.z1 = typedArrayS.getBoolean(1, false);
        typedArrayS.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            gch0 gch0Var = new gch0();
            gch0Var.m(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gch0Var.j(context2);
            WeakHashMap weakHashMap = b8k1.a;
            gch0Var.l(getElevation());
            setBackground(gch0Var);
        }
    }

    public Integer getNavigationIconTint() {
        return this.x1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ggo1.O(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y1 || this.z1) {
            TextView textViewV = lyg.v(this, getTitle());
            TextView textViewV2 = lyg.v(this, getSubtitle());
            if (textViewV == null && textViewV2 == null) {
                return;
            }
            int measuredWidth = getMeasuredWidth();
            int i5 = measuredWidth / 2;
            int paddingLeft = getPaddingLeft();
            int paddingRight = measuredWidth - getPaddingRight();
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && childAt != textViewV && childAt != textViewV2) {
                    if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                        paddingLeft = childAt.getRight();
                    }
                    if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                        paddingRight = childAt.getLeft();
                    }
                }
            }
            Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
            if (this.y1 && textViewV != null) {
                v(textViewV, pair);
            }
            if (!this.z1 || textViewV2 == null) {
                return;
            }
            v(textViewV2, pair);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setElevation(float f) {
        super/*android.view.View*/.setElevation(f);
        ggo1.M(this, f);
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.x1 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.x1.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.x1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSubtitleCentered(boolean z) {
        if (this.z1 != z) {
            this.z1 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTitleCentered(boolean z) {
        if (this.y1 != z) {
            this.y1 = z;
            requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970489);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
