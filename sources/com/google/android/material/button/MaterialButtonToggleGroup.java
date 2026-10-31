package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.timepicker.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p.b8k1;
import p.blo1;
import p.d4e0;
import p.fmv;
import p.iw61;
import p.j8n;
import p.k5;
import p.omz0;
import p.rbh0;
import p.rh10;
import p.u890;
import p.ubh0;
import p.vbh0;
import p.x5j1;
import p.xf;
import p.zko1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int N0 = 0;
    public final ArrayList a;
    public final ubh0 b;
    public final d4e0 c;
    public final LinkedHashSet d;
    public final rh10 e;
    public Integer[] f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int t;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(u890.J(context, attributeSet, i, 2132018798), attributeSet, i);
        this.a = new ArrayList();
        this.b = new ubh0(this);
        this.c = new d4e0(this, (byte) 9);
        this.d = new LinkedHashSet();
        this.e = new rh10(this, (byte) 1);
        this.g = false;
        TypedArray typedArrayS = blo1.s(getContext(), attributeSet, omz0.v, i, 2132018798, new int[0]);
        setSingleSelection(typedArrayS.getBoolean(2, false));
        this.t = typedArrayS.getResourceId(0, -1);
        this.i = typedArrayS.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayS.recycle();
        WeakHashMap weakHashMap = b8k1.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.t = i;
        b();
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = b8k1.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f.add(this.b);
        materialButton.setOnPressedChangeListenerInternal(this.c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton childAt = getChildAt(i);
            int iMin = Math.min(childAt.getStrokeWidth(), getChildAt(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(firstVisibleChildIndex).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.R0) {
                d(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            iw61 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.a.add(new vbh0(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
            b8k1.p(materialButton, new xf(this, (byte) 6));
        }
    }

    public final void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final boolean d(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.i && checkedButtonIds.isEmpty()) {
            MaterialButton materialButtonFindViewById = findViewById(i);
            if (materialButtonFindViewById instanceof MaterialButton) {
                this.g = true;
                materialButtonFindViewById.setChecked(true);
                this.g = false;
            }
            this.t = i;
            return false;
        }
        if (z && this.h) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                MaterialButton materialButtonFindViewById2 = findViewById(it.next().intValue());
                if (materialButtonFindViewById2 instanceof MaterialButton) {
                    this.g = true;
                    materialButtonFindViewById2.setChecked(false);
                    this.g = false;
                }
                b();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap((Comparator) this.e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(getChildAt(i), Integer.valueOf(i));
        }
        this.f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        int i;
        vbh0 vbh0Var;
        j8n j8nVar;
        j8n k5Var;
        k5 k5Var2;
        k5 k5Var3;
        MaterialButtonToggleGroup materialButtonToggleGroup = this;
        int childCount = materialButtonToggleGroup.getChildCount();
        int firstVisibleChildIndex = materialButtonToggleGroup.getFirstVisibleChildIndex();
        int lastVisibleChildIndex = materialButtonToggleGroup.getLastVisibleChildIndex();
        int i2 = 0;
        while (i2 < childCount) {
            MaterialButton childAt = materialButtonToggleGroup.getChildAt(i2);
            if (childAt.getVisibility() == 8) {
                i = childCount;
            } else {
                iw61 shapeAppearanceModel = childAt.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                zko1 zko1Var = shapeAppearanceModel.a;
                zko1 zko1Var2 = shapeAppearanceModel.b;
                zko1 zko1Var3 = shapeAppearanceModel.c;
                zko1 zko1Var4 = shapeAppearanceModel.d;
                fmv fmvVar = shapeAppearanceModel.i;
                fmv fmvVar2 = shapeAppearanceModel.j;
                fmv fmvVar3 = shapeAppearanceModel.k;
                fmv fmvVar4 = shapeAppearanceModel.l;
                vbh0 vbh0Var2 = (vbh0) materialButtonToggleGroup.a.get(i2);
                if (firstVisibleChildIndex == lastVisibleChildIndex) {
                    i = childCount;
                } else {
                    boolean z = materialButtonToggleGroup.getOrientation() == 0;
                    k5 k5Var4 = vbh0.e;
                    if (i2 != firstVisibleChildIndex) {
                        i = childCount;
                        if (i2 != lastVisibleChildIndex) {
                            vbh0Var2 = null;
                        } else if (z) {
                            WeakHashMap weakHashMap = b8k1.a;
                            vbh0Var = getLayoutDirection() == 1 ? new vbh0(vbh0Var2.a, vbh0Var2.d, k5Var4, k5Var4) : new vbh0(k5Var4, k5Var4, vbh0Var2.b, vbh0Var2.c);
                        } else {
                            vbh0Var = new vbh0(k5Var4, vbh0Var2.d, k5Var4, vbh0Var2.c);
                        }
                    } else if (z) {
                        WeakHashMap weakHashMap2 = b8k1.a;
                        i = childCount;
                        vbh0Var = getLayoutDirection() == 1 ? new vbh0(k5Var4, k5Var4, vbh0Var2.b, vbh0Var2.c) : new vbh0(vbh0Var2.a, vbh0Var2.d, k5Var4, k5Var4);
                    } else {
                        i = childCount;
                        vbh0Var = new vbh0(vbh0Var2.a, k5Var4, vbh0Var2.b, k5Var4);
                    }
                    vbh0Var2 = vbh0Var;
                }
                if (vbh0Var2 == null) {
                    j8n k5Var5 = new k5(0.0f);
                    k5Var2 = new k5(0.0f);
                    k5Var3 = new k5(0.0f);
                    k5Var = new k5(0.0f);
                    j8nVar = k5Var5;
                } else {
                    j8nVar = vbh0Var2.a;
                    k5Var = vbh0Var2.d;
                    k5Var2 = vbh0Var2.b;
                    k5Var3 = vbh0Var2.c;
                }
                iw61 iw61Var = new iw61();
                iw61Var.a = zko1Var;
                iw61Var.b = zko1Var2;
                iw61Var.c = zko1Var3;
                iw61Var.d = zko1Var4;
                iw61Var.e = j8nVar;
                iw61Var.f = k5Var2;
                iw61Var.g = k5Var3;
                iw61Var.h = k5Var;
                iw61Var.i = fmvVar;
                iw61Var.j = fmvVar2;
                iw61Var.k = fmvVar3;
                iw61Var.l = fmvVar4;
                childAt.setShapeAppearanceModel(iw61Var);
            }
            i2++;
            materialButtonToggleGroup = this;
            firstVisibleChildIndex = firstVisibleChildIndex;
            childCount = i;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.h) {
            return this.t;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton childAt = getChildAt(i);
            if (childAt.R0) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButtonFindViewById;
        super.onFinishInflate();
        int i = this.t;
        if (i == -1 || (materialButtonFindViewById = findViewById(i)) == null) {
            return;
        }
        materialButtonFindViewById.setChecked(true);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x5j1.h(1, getVisibleButtonCount(), this.h ? 1 : 2, false).b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f.remove(this.b);
            materialButton.setOnPressedChangeListenerInternal((rbh0) null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.a.remove(iIndexOfChild);
        }
        e();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.i = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.g = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton childAt = getChildAt(i);
                childAt.setChecked(false);
                childAt.getId();
                b();
            }
            this.g = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969701);
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }
}
