package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p.av20;
import p.b8k1;
import p.blo1;
import p.omz0;
import p.u3g;
import p.u890;
import p.v3g;
import p.w3g;
import p.x3g;
import p.x5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ChipGroup extends av20 {
    public int N0;
    public boolean O0;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public final u3g i;
    public final x3g t;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        Context contextJ = u890.J(context, attributeSet, i, 2132018784);
        super(contextJ, attributeSet, i);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextJ.getTheme().obtainStyledAttributes(attributeSet, omz0.p, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.i = new u3g(this, (byte) 0);
        x3g x3gVar = new x3g(this);
        this.t = x3gVar;
        this.N0 = -1;
        this.O0 = false;
        TypedArray typedArrayS = blo1.s(getContext(), attributeSet, omz0.h, i, 2132018784, new int[0]);
        int dimensionPixelOffset = typedArrayS.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayS.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayS.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayS.getBoolean(5, false));
        setSingleSelection(typedArrayS.getBoolean(6, false));
        setSelectionRequired(typedArrayS.getBoolean(4, false));
        int resourceId = typedArrayS.getResourceId(0, -1);
        if (resourceId != -1) {
            this.N0 = resourceId;
        }
        typedArrayS.recycle();
        super.setOnHierarchyChangeListener(x3gVar);
        WeakHashMap weakHashMap = b8k1.a;
        setImportantForAccessibility(1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.N0 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            AppCompatCheckBox appCompatCheckBox = (Chip) view;
            if (appCompatCheckBox.isChecked()) {
                int i2 = this.N0;
                if (i2 != -1 && this.g) {
                    c(i2, false);
                }
                setCheckedId(appCompatCheckBox.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i) {
        int i2 = this.N0;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.g) {
            c(i2, false);
        }
        if (i != -1) {
            c(i, true);
        }
        setCheckedId(i);
    }

    public final void c(int i, boolean z) {
        Object objFindViewById = findViewById(i);
        if (objFindViewById instanceof Chip) {
            this.O0 = true;
            ((Chip) objFindViewById).setChecked(z);
            this.O0 = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof v3g);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new v3g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new v3g(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.g) {
            return this.N0;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            AppCompatCheckBox childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.g) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.e;
    }

    public int getChipSpacingVertical() {
        return this.f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.N0;
        if (i != -1) {
            c(i, true);
            setCheckedId(this.N0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x5j1.h(getRowCount(), this.c ? getChipCount() : -1, this.g ? 1 : 2, false).b);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.e != i) {
            this.e = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f != i) {
            this.f = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.t.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.h = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.O0 = true;
            for (int i = 0; i < getChildCount(); i++) {
                Object childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.O0 = false;
            setCheckedId(-1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new v3g(layoutParams);
    }

    @Override // p.av20
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setOnCheckedChangeListener(w3g w3gVar) {
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968954);
    }

    public ChipGroup(Context context) {
        this(context, null);
    }
}
