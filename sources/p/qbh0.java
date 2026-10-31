package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qbh0 extends hj5 {
    public final y0d0 e;
    public final AccessibilityManager f;
    public final Rect g;

    public qbh0(Context context, AttributeSet attributeSet) {
        super(u890.J(context, attributeSet, 2130968722, 0), attributeSet, 2130968722);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayS = blo1.s(context2, attributeSet, omz0.t, 2130968722, 2132018449, new int[0]);
        if (typedArrayS.hasValue(0) && typedArrayS.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        y0d0 y0d0Var = new y0d0(context2, null, 2130969653, 0);
        this.e = y0d0Var;
        y0d0Var.X0 = true;
        ik5 ik5Var = y0d0Var.Y0;
        ik5Var.setFocusable(true);
        y0d0Var.O0 = this;
        ik5Var.setInputMethodMode(2);
        y0d0Var.k(getAdapter());
        y0d0Var.P0 = new qk5(this, (byte) 2);
        typedArrayS.recycle();
    }

    public final TextInputLayout a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void b(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutA = a();
        return (textInputLayoutA == null || !textInputLayoutA.h1) ? super.getHint() : textInputLayoutA.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutA = a();
        if (textInputLayoutA != null && textInputLayoutA.h1 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutA = a();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutA != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                y0d0 y0d0Var = this.e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !y0d0Var.Y0.isShowing() ? -1 : y0d0Var.c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutA);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = y0d0Var.Y0.getBackground();
                if (background != null) {
                    Rect rect = this.g;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutA.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.k(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.e.m();
        }
    }
}
