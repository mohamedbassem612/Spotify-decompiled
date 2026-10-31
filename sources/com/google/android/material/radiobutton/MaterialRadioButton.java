package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.ago1;
import p.blo1;
import p.dgo1;
import p.kk5;
import p.omz0;
import p.u890;
import p.xfo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class MaterialRadioButton extends kk5 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018791), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.A, i, 2132018791, new int[0]);
        if (typedArrayS.hasValue(0)) {
            setButtonTintList(dgo1.i(context2, typedArrayS, 0));
        }
        this.f = typedArrayS.getBoolean(1, false);
        typedArrayS.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ColorStateList getMaterialThemeColorsTintList() {
        ColorStateList colorStateList = this.e;
        if (colorStateList != null) {
            return colorStateList;
        }
        int iR = xfo1.r(this, 2130969010);
        int iR2 = xfo1.r(this, 2130969024);
        int iR3 = xfo1.r(this, 2130969040);
        ColorStateList colorStateList2 = new ColorStateList(g, new int[]{ago1.s(iR3, iR, 1.0f), ago1.s(iR3, iR2, 0.54f), ago1.s(iR3, iR2, 0.38f), ago1.s(iR3, iR2, 0.38f)});
        this.e = colorStateList2;
        return colorStateList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970120);
    }

    public MaterialRadioButton(Context context) {
        this(context, null);
    }
}
