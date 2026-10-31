package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import app.p000rive.semantics.SemanticState;
import java.util.WeakHashMap;
import p.b8k1;
import p.dd30;
import p.e9k;
import p.qx21;
import p.ric0;
import p.rti0;
import p.xf;
import p.ysi0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class NavigationMenuItemView extends dd30 implements rti0 {
    public static final int[] i1 = {R.attr.state_checked};
    public int Y0;
    public boolean Z0;
    public boolean a1;
    public final CheckedTextView b1;
    public FrameLayout c1;
    public ysi0 d1;
    public ColorStateList e1;
    public boolean f1;
    public Drawable g1;
    public final xf h1;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xf xfVar = new xf(this, (byte) 7);
        this.h1 = xfVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(2131624540, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(2131165657));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(2131428461);
        this.b1 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        b8k1.p(checkedTextView, xfVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            FrameLayout frameLayout = this.c1;
            if (frameLayout == null) {
                frameLayout = (FrameLayout) ((ViewStub) findViewById(2131428460)).inflate();
                this.c1 = frameLayout;
            }
            frameLayout.removeAllViews();
            this.c1.addView(view);
        }
    }

    @Override // p.rti0
    public final void d(ysi0 ysi0Var) {
        StateListDrawable stateListDrawable;
        this.d1 = ysi0Var;
        int i = ysi0Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(ysi0Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(2130969011, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(i1, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = b8k1.a;
            setBackground(stateListDrawable);
        }
        setCheckable(ysi0Var.isCheckable());
        setChecked(ysi0Var.isChecked());
        setEnabled(ysi0Var.isEnabled());
        setTitle(ysi0Var.e);
        setIcon(ysi0Var.getIcon());
        setActionView(ysi0Var.getActionView());
        setContentDescription(ysi0Var.q);
        e9k.z(this, ysi0Var.r);
        ysi0 ysi0Var2 = this.d1;
        CharSequence charSequence = ysi0Var2.e;
        CheckedTextView checkedTextView = this.b1;
        if (charSequence == null && ysi0Var2.getIcon() == null && this.d1.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.c1;
            if (frameLayout != null) {
                ric0 ric0Var = (ric0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) ric0Var).width = -1;
                this.c1.setLayoutParams(ric0Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.c1;
        if (frameLayout2 != null) {
            ric0 ric0Var2 = (ric0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) ric0Var2).width = -2;
            this.c1.setLayoutParams(ric0Var2);
        }
    }

    @Override // p.rti0
    public ysi0 getItemData() {
        return this.d1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        ysi0 ysi0Var = this.d1;
        if (ysi0Var != null && ysi0Var.isCheckable() && this.d1.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, i1);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.a1 != z) {
            this.a1 = z;
            this.h1.sendAccessibilityEvent(this.b1, SemanticState.Modal);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.b1.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.e1);
            }
            int i = this.Y0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.Z0) {
            if (this.g1 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = qx21.a;
                Drawable drawable2 = resources.getDrawable(2131233702, theme);
                this.g1 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.Y0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.g1;
        }
        this.b1.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.b1.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.Y0 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.e1 = colorStateList;
        this.f1 = colorStateList != null;
        ysi0 ysi0Var = this.d1;
        if (ysi0Var != null) {
            setIcon(ysi0Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.b1.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.Z0 = z;
    }

    public void setTextAppearance(int i) {
        this.b1.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.b1.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.b1.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
