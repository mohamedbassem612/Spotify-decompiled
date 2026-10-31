package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p.b8k1;
import p.d3n;
import p.e3n;
import p.eg;
import p.f3a;
import p.f3n;
import p.g3n;
import p.h3n;
import p.hbk1;
import p.hsl1;
import p.i3n;
import p.mxr;
import p.ndv0;
import p.p0d;
import p.qpn1;
import p.r6o0;
import p.r7k1;
import p.rkd;
import p.s6o0;
import p.tnz0;
import p.x74;
import p.y1a1;
import p.zwa;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class CoordinatorLayout extends ViewGroup implements r6o0, s6o0 {
    public static final String W0;
    public static final Class[] X0;
    public static final ThreadLocal Y0;
    public static final p0d Z0;
    public static final ndv0 a1;
    public View N0;
    public rkd O0;
    public boolean P0;
    public hsl1 Q0;
    public boolean R0;
    public Drawable S0;
    public ViewGroup.OnHierarchyChangeListener T0;
    public zwa U0;
    public final f3a V0;
    public final ArrayList a;
    public final mxr b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View t;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        W0 = r0 != null ? r0.getName() : null;
        Z0 = new p0d((byte) 18);
        X0 = new Class[]{Context.class, AttributeSet.class};
        Y0 = new ThreadLocal();
        a1 = new ndv0(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.a = new ArrayList();
        this.b = new mxr();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new int[2];
        this.f = new int[2];
        this.V0 = new f3a(false);
        int[] iArr = tnz0.a;
        TypedArray typedArrayObtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, 2132018917) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 2132018917);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = coordinatorLayout.i;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        coordinatorLayout.S0 = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        coordinatorLayout.y();
        super.setOnHierarchyChangeListener(new g3n(coordinatorLayout));
        WeakHashMap weakHashMap = b8k1.a;
        if (coordinatorLayout.getImportantForAccessibility() == 0) {
            coordinatorLayout.setImportantForAccessibility(1);
        }
    }

    public static Rect b() {
        Rect rect = (Rect) a1.a();
        return rect == null ? new Rect() : rect;
    }

    public static h3n h(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof h3n) {
            return new h3n((h3n) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new h3n((ViewGroup.MarginLayoutParams) layoutParams) : new h3n(layoutParams);
    }

    public static void n(int i, Rect rect, Rect rect2, h3n h3nVar, int i2, int i3) {
        int iWidth;
        int iHeight;
        int i4 = h3nVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int iK = qpn1.k(i4, i);
        int i5 = h3nVar.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int iK2 = qpn1.k(i5, i);
        int i6 = iK & 7;
        int i7 = iK & 112;
        int i8 = iK2 & 7;
        int i9 = iK2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h3n o(View view) {
        h3n h3nVar = (h3n) view.getLayoutParams();
        if (!h3nVar.b) {
            if (view instanceof d3n) {
                h3nVar.b(((d3n) view).getBehavior());
                h3nVar.b = true;
                return h3nVar;
            }
            f3n f3nVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                f3nVar = (f3n) superclass.getAnnotation(f3n.class);
                if (f3nVar != null) {
                    break;
                }
            }
            if (f3nVar != null) {
                try {
                    h3nVar.b((e3n) f3nVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    f3nVar.value().getClass();
                }
            }
            h3nVar.b = true;
        }
        return h3nVar;
    }

    public static void w(View view, int i) {
        h3n h3nVar = (h3n) view.getLayoutParams();
        int i2 = h3nVar.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = b8k1.a;
            view.offsetLeftAndRight(i - i2);
            h3nVar.i = i;
        }
    }

    public static void x(View view, int i) {
        h3n h3nVar = (h3n) view.getLayoutParams();
        int i2 = h3nVar.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = b8k1.a;
            view.offsetTopAndBottom(i - i2);
            h3nVar.j = i;
        }
    }

    public final void c(h3n h3nVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof h3n) && super.checkLayoutParams(layoutParams);
    }

    @Override // p.r6o0
    public final void d(View view, View view2, int i, int i2) {
        this.V0.j(i, i2);
        this.N0 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((h3n) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        e3n e3nVar = ((h3n) view.getLayoutParams()).a;
        if (e3nVar != null) {
            e3nVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.S0;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // p.r6o0
    public final void e(View view, int i) {
        this.V0.l(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            h3n h3nVar = (h3n) childAt.getLayoutParams();
            if (h3nVar.a(i)) {
                e3n e3nVar = h3nVar.a;
                if (e3nVar != null) {
                    e3nVar.r(this, childAt, view, i);
                }
                if (i == 0) {
                    h3nVar.m = false;
                } else if (i == 1) {
                    h3nVar.n = false;
                }
                h3nVar.o = false;
            }
        }
        this.N0 = null;
    }

    public final void f(View view) {
        List listO = this.b.o(view);
        if (listO == null || listO.isEmpty()) {
            return;
        }
        for (int i = 0; i < listO.size(); i++) {
            View view2 = (View) listO.get(i);
            e3n e3nVar = ((h3n) view2.getLayoutParams()).a;
            if (e3nVar != null) {
                e3nVar.d(view2, view);
            }
        }
    }

    @Override // p.r6o0
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        e3n e3nVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                h3n h3nVar = (h3n) childAt.getLayoutParams();
                if (h3nVar.a(i3) && (e3nVar = h3nVar.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e3nVar.k(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new h3n(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new h3n(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.a);
    }

    public final hsl1 getLastWindowInsets() {
        return this.Q0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.V0.d();
    }

    public Drawable getStatusBarBackground() {
        return this.S0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void i(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            hbk1.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // p.s6o0
    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e3n e3nVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                h3n h3nVar = (h3n) childAt.getLayoutParams();
                if (h3nVar.a(i5) && (e3nVar = h3nVar.a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e3nVar.m(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            q(1);
        }
    }

    @Override // p.r6o0
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        j(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // p.r6o0
    public final boolean l(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                h3n h3nVar = (h3n) childAt.getLayoutParams();
                e3n e3nVar = h3nVar.a;
                if (e3nVar != null) {
                    boolean zQ = e3nVar.q(this, childAt, view, view2, i, i2);
                    z |= zQ;
                    if (i2 == 0) {
                        h3nVar.m = zQ;
                    } else if (i2 == 1) {
                        h3nVar.n = zQ;
                    }
                } else if (i2 == 0) {
                    h3nVar.m = false;
                } else if (i2 == 1) {
                    h3nVar.n = false;
                }
            }
        }
        return z;
    }

    public final ArrayList m(View view) {
        ArrayList arrayListP = this.b.p(view);
        ArrayList arrayList = this.d;
        arrayList.clear();
        if (arrayListP != null) {
            arrayList.addAll(arrayListP);
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.P0) {
            if (this.O0 == null) {
                this.O0 = new rkd(this, (byte) 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.O0);
        }
        if (this.Q0 == null) {
            WeakHashMap weakHashMap = b8k1.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.P0 && this.O0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.O0);
        }
        View view = this.N0;
        if (view != null) {
            e(view, 0);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.R0 || this.S0 == null) {
            return;
        }
        hsl1 hsl1Var = this.Q0;
        int iD = hsl1Var != null ? hsl1Var.d() : 0;
        if (iD > 0) {
            this.S0.setBounds(0, 0, getWidth(), iD);
            this.S0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean zT = t(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zT;
        }
        v(true);
        return zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        e3n e3nVar;
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((e3nVar = ((h3n) view.getLayoutParams()).a) == null || !e3nVar.h(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x0129  */
    /* JADX WARN: Code duplicated, block: B:77:0x0159  */
    /* JADX WARN: Code duplicated, block: B:80:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x018b  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        ArrayList arrayList;
        int iMax;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        e3n e3nVar;
        int i4;
        View view;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean zI;
        int i11;
        int i12;
        int iK;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.u();
        int childCount = coordinatorLayout.getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            if (coordinatorLayout.b.s(coordinatorLayout.getChildAt(i13))) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != coordinatorLayout.P0) {
            boolean z3 = coordinatorLayout.h;
            if (z) {
                if (z3) {
                    if (coordinatorLayout.O0 == null) {
                        coordinatorLayout.O0 = new rkd(coordinatorLayout, (byte) 1);
                    }
                    coordinatorLayout.getViewTreeObserver().addOnPreDrawListener(coordinatorLayout.O0);
                }
                coordinatorLayout.P0 = true;
            } else {
                if (z3 && coordinatorLayout.O0 != null) {
                    coordinatorLayout.getViewTreeObserver().removeOnPreDrawListener(coordinatorLayout.O0);
                }
                coordinatorLayout.P0 = false;
            }
        }
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = coordinatorLayout.getLayoutDirection();
        boolean z4 = layoutDirection == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i14 = paddingLeft + paddingRight;
        int i15 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z5 = coordinatorLayout.Q0 != null && coordinatorLayout.getFitsSystemWindows();
        ArrayList arrayList2 = coordinatorLayout.a;
        int size3 = arrayList2.size();
        int i16 = 0;
        int iCombineMeasuredStates = 0;
        while (i16 < size3) {
            View view2 = (View) arrayList2.get(i16);
            int i17 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                arrayList = arrayList2;
                i5 = size3;
                i10 = i16;
                i8 = paddingRight;
                suggestedMinimumWidth = i17;
                z2 = false;
                i6 = paddingLeft;
            } else {
                h3n h3nVar = (h3n) view2.getLayoutParams();
                int i18 = h3nVar.e;
                if (i18 < 0 || mode == 0) {
                    i3 = suggestedMinimumHeight;
                    arrayList = arrayList2;
                } else {
                    i3 = suggestedMinimumHeight;
                    int[] iArr = coordinatorLayout.i;
                    if (iArr == null) {
                        coordinatorLayout.toString();
                        arrayList = arrayList2;
                    } else {
                        arrayList = arrayList2;
                        if (i18 < 0 || i18 >= iArr.length) {
                            coordinatorLayout.toString();
                        } else {
                            i11 = iArr[i18];
                        }
                        i12 = h3nVar.c;
                        if (i12 == 0) {
                            i12 = 8388661;
                        }
                        iK = qpn1.k(i12, layoutDirection) & 7;
                        if ((iK != 3 && !z4) || (iK == 5 && z4)) {
                            iMax = Math.max(0, (size - paddingRight) - i11);
                        } else if ((iK != 5 && !z4) || (iK == 3 && z4)) {
                            iMax = Math.max(0, i11 - paddingLeft);
                        }
                        if (z5 || view2.getFitsSystemWindows()) {
                            iMakeMeasureSpec = i;
                            iMakeMeasureSpec2 = i2;
                        } else {
                            int iC = coordinatorLayout.Q0.c() + coordinatorLayout.Q0.b();
                            int iA = coordinatorLayout.Q0.a() + coordinatorLayout.Q0.d();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iC, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iA, mode2);
                        }
                        e3nVar = h3nVar.a;
                        if (e3nVar != null) {
                            int i19 = iMax;
                            int i20 = iMakeMeasureSpec;
                            i5 = size3;
                            i6 = paddingLeft;
                            i7 = i17;
                            int i21 = i3;
                            i8 = paddingRight;
                            i9 = i21;
                            z2 = false;
                            i10 = i16;
                            int i22 = iMakeMeasureSpec2;
                            zI = e3nVar.i(this, view2, i20, i19, i22);
                            view = view2;
                            iMakeMeasureSpec = i20;
                            iMax = i19;
                            i4 = i22;
                            if (zI) {
                                coordinatorLayout = this;
                            }
                            int iMax2 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                            int iMax3 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                            suggestedMinimumWidth = iMax2;
                            suggestedMinimumHeight = iMax3;
                        } else {
                            int i23 = size3;
                            i4 = iMakeMeasureSpec2;
                            view = view2;
                            i5 = i23;
                            i6 = paddingLeft;
                            i7 = i17;
                            int i24 = i3;
                            i8 = paddingRight;
                            i9 = i24;
                            i10 = i16;
                            z2 = false;
                        }
                        coordinatorLayout = this;
                        coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                        int iMax4 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                        int iMax5 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax4;
                        suggestedMinimumHeight = iMax5;
                    }
                    i11 = 0;
                    i12 = h3nVar.c;
                    if (i12 == 0) {
                        i12 = 8388661;
                    }
                    iK = qpn1.k(i12, layoutDirection) & 7;
                    if (iK != 3) {
                        if (iK != 5) {
                        }
                    } else if (iK != 5) {
                    }
                    if (z5) {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    } else {
                        iMakeMeasureSpec = i;
                        iMakeMeasureSpec2 = i2;
                    }
                    e3nVar = h3nVar.a;
                    if (e3nVar != null) {
                        int i110 = iMax;
                        int i25 = iMakeMeasureSpec;
                        i5 = size3;
                        i6 = paddingLeft;
                        i7 = i17;
                        int i26 = i3;
                        i8 = paddingRight;
                        i9 = i26;
                        z2 = false;
                        i10 = i16;
                        int i27 = iMakeMeasureSpec2;
                        zI = e3nVar.i(this, view2, i25, i110, i27);
                        view = view2;
                        iMakeMeasureSpec = i25;
                        iMax = i110;
                        i4 = i27;
                        if (zI) {
                            coordinatorLayout = this;
                        }
                        int iMax6 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                        int iMax7 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        suggestedMinimumWidth = iMax6;
                        suggestedMinimumHeight = iMax7;
                    } else {
                        int i28 = size3;
                        i4 = iMakeMeasureSpec2;
                        view = view2;
                        i5 = i28;
                        i6 = paddingLeft;
                        i7 = i17;
                        int i29 = i3;
                        i8 = paddingRight;
                        i9 = i29;
                        i10 = i16;
                        z2 = false;
                    }
                    coordinatorLayout = this;
                    coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                    int iMax8 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                    int iMax9 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax8;
                    suggestedMinimumHeight = iMax9;
                }
                iMax = 0;
                if (z5) {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                } else {
                    iMakeMeasureSpec = i;
                    iMakeMeasureSpec2 = i2;
                }
                e3nVar = h3nVar.a;
                if (e3nVar != null) {
                    int i111 = iMax;
                    int i210 = iMakeMeasureSpec;
                    i5 = size3;
                    i6 = paddingLeft;
                    i7 = i17;
                    int i211 = i3;
                    i8 = paddingRight;
                    i9 = i211;
                    z2 = false;
                    i10 = i16;
                    int i212 = iMakeMeasureSpec2;
                    zI = e3nVar.i(this, view2, i210, i111, i212);
                    view = view2;
                    iMakeMeasureSpec = i210;
                    iMax = i111;
                    i4 = i212;
                    if (zI) {
                        coordinatorLayout = this;
                    }
                    int iMax10 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                    int iMax11 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    suggestedMinimumWidth = iMax10;
                    suggestedMinimumHeight = iMax11;
                } else {
                    int i213 = size3;
                    i4 = iMakeMeasureSpec2;
                    view = view2;
                    i5 = i213;
                    i6 = paddingLeft;
                    i7 = i17;
                    int i214 = i3;
                    i8 = paddingRight;
                    i9 = i214;
                    i10 = i16;
                    z2 = false;
                }
                coordinatorLayout = this;
                coordinatorLayout.measureChildWithMargins(view, iMakeMeasureSpec, iMax, i4, 0);
                int iMax12 = Math.max(i7, view.getMeasuredWidth() + i14 + ((ViewGroup.MarginLayoutParams) h3nVar).leftMargin + ((ViewGroup.MarginLayoutParams) h3nVar).rightMargin);
                int iMax13 = Math.max(i9, view.getMeasuredHeight() + i15 + ((ViewGroup.MarginLayoutParams) h3nVar).topMargin + ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                suggestedMinimumWidth = iMax12;
                suggestedMinimumHeight = iMax13;
            }
            i16 = i10 + 1;
            size3 = i5;
            paddingLeft = i6;
            paddingRight = i8;
            arrayList2 = arrayList;
        }
        int i30 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i, (-16777216) & i30), View.resolveSizeAndState(suggestedMinimumHeight, i2, i30 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                h3n h3nVar = (h3n) childAt.getLayoutParams();
                if (h3nVar.a(0)) {
                    e3n e3nVar = h3nVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        e3n e3nVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                h3n h3nVar = (h3n) childAt.getLayoutParams();
                if (h3nVar.a(0) && (e3nVar = h3nVar.a) != null) {
                    zJ |= e3nVar.j(this, view, f, f2);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        g(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        k(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof i3n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i3n i3nVar = (i3n) parcelable;
        super.onRestoreInstanceState(i3nVar.a());
        SparseArray sparseArray = i3nVar.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            e3n e3nVar = o(childAt).a;
            if (id != -1 && e3nVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e3nVar.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableP;
        i3n i3nVar = new i3n(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            e3n e3nVar = ((h3n) childAt.getLayoutParams()).a;
            if (id != -1 && e3nVar != null && (parcelableP = e3nVar.p(childAt)) != null) {
                sparseArray.append(id, parcelableP);
            }
        }
        i3nVar.c = sparseArray;
        return i3nVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return l(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        boolean zS;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.t == null) {
            zT = t(motionEvent, 1);
            if (!zT) {
                zS = false;
            }
            motionEventObtain = null;
            if (this.t == null) {
                zS |= super.onTouchEvent(motionEvent);
            } else if (zT) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zS;
            }
            v(false);
            return zS;
        }
        zT = false;
        e3n e3nVar = ((h3n) this.t.getLayoutParams()).a;
        if (e3nVar != null) {
            zS = e3nVar.s(this, this.t, motionEvent);
        } else {
            zS = false;
        }
        motionEventObtain = null;
        if (this.t == null) {
            zS |= super.onTouchEvent(motionEvent);
        } else if (zT) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        v(false);
        return zS;
    }

    public final boolean p(View view, int i, int i2) {
        ndv0 ndv0Var = a1;
        Rect rectB = b();
        hbk1.a(this, view, rectB);
        try {
            return rectB.contains(i, i2);
        } finally {
            rectB.setEmpty();
            ndv0Var.i(rectB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    public final void q(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean zD;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        h3n h3nVar;
        int i10;
        View view;
        e3n e3nVar;
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        Rect rectB = b();
        Rect rectB2 = b();
        Rect rectB3 = b();
        int i11 = 0;
        while (true) {
            ndv0 ndv0Var = a1;
            if (i11 >= size) {
                Rect rect2 = rectB3;
                rectB.setEmpty();
                ndv0Var.i(rectB);
                rectB2.setEmpty();
                ndv0Var.i(rectB2);
                rect2.setEmpty();
                ndv0Var.i(rect2);
                return;
            }
            View view2 = (View) arrayList2.get(i11);
            h3n h3nVar2 = (h3n) view2.getLayoutParams();
            if (i != 0 || view2.getVisibility() != 8) {
                int i12 = 0;
                while (i12 < i11) {
                    if (h3nVar2.l == ((View) arrayList2.get(i12))) {
                        h3n h3nVar3 = (h3n) view2.getLayoutParams();
                        if (h3nVar3.k != null) {
                            Rect rectB4 = b();
                            Rect rectB5 = b();
                            h3n h3nVar4 = h3nVar2;
                            Rect rectB6 = b();
                            hbk1.a(this, h3nVar3.k, rectB4);
                            i(view2, rectB5, false);
                            int measuredWidth = view2.getMeasuredWidth();
                            View view3 = view2;
                            int measuredHeight = view3.getMeasuredHeight();
                            h3nVar = h3nVar4;
                            i10 = i12;
                            layoutDirection = layoutDirection;
                            view = view3;
                            n(layoutDirection, rectB4, rectB6, h3nVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectB6.left == rectB5.left && rectB6.top == rectB5.top) ? false : true;
                            c(h3nVar3, rectB6, measuredWidth, measuredHeight);
                            int i13 = rectB6.left - rectB5.left;
                            int i14 = rectB6.top - rectB5.top;
                            if (i13 != 0) {
                                WeakHashMap weakHashMap2 = b8k1.a;
                                view.offsetLeftAndRight(i13);
                            }
                            if (i14 != 0) {
                                WeakHashMap weakHashMap3 = b8k1.a;
                                view.offsetTopAndBottom(i14);
                            }
                            if (z3 && (e3nVar = h3nVar3.a) != null) {
                                e3nVar.d(view, h3nVar3.k);
                            }
                            rectB4.setEmpty();
                            ndv0Var.i(rectB4);
                            rectB5.setEmpty();
                            ndv0Var.i(rectB5);
                            rectB6.setEmpty();
                            ndv0Var.i(rectB6);
                        } else {
                            h3nVar = h3nVar2;
                            i10 = i12;
                            view = view2;
                        }
                    } else {
                        h3nVar = h3nVar2;
                        i10 = i12;
                        view = view2;
                    }
                    i12 = i10 + 1;
                    h3nVar2 = h3nVar;
                    view2 = view;
                    arrayList2 = arrayList2;
                    size = size;
                    i11 = i11;
                    rectB3 = rectB3;
                }
                ArrayList arrayList3 = arrayList2;
                h3n h3nVar5 = h3nVar2;
                int i15 = size;
                Rect rect3 = rectB3;
                i2 = i11;
                View view4 = view2;
                i(view4, rectB2, true);
                if (h3nVar5.g != 0 && !rectB2.isEmpty()) {
                    int iK = qpn1.k(h3nVar5.g, layoutDirection);
                    int i16 = iK & 112;
                    if (i16 == 48) {
                        rectB.top = Math.max(rectB.top, rectB2.bottom);
                    } else if (i16 == 80) {
                        rectB.bottom = Math.max(rectB.bottom, getHeight() - rectB2.top);
                    }
                    int i17 = iK & 7;
                    if (i17 == 3) {
                        rectB.left = Math.max(rectB.left, rectB2.right);
                    } else if (i17 == 5) {
                        rectB.right = Math.max(rectB.right, getWidth() - rectB2.left);
                    }
                }
                if (h3nVar5.h != 0 && view4.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = b8k1.a;
                    if (view4.isLaidOut() && view4.getWidth() > 0 && view4.getHeight() > 0) {
                        h3n h3nVar6 = (h3n) view4.getLayoutParams();
                        e3n e3nVar2 = h3nVar6.a;
                        Rect rectB7 = b();
                        Rect rectB8 = b();
                        rectB8.set(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom());
                        if (e3nVar2 == null || !e3nVar2.a(view4)) {
                            rectB7.set(rectB8);
                        } else if (!rectB8.contains(rectB7)) {
                            eg.i("Rect should be within the child's bounds. Rect:", rectB7.toShortString(), " | Bounds:", rectB8.toShortString());
                            return;
                        }
                        rectB8.setEmpty();
                        ndv0Var.i(rectB8);
                        if (rectB7.isEmpty()) {
                            rectB7.setEmpty();
                            ndv0Var.i(rectB7);
                        } else {
                            int iK2 = qpn1.k(h3nVar6.h, layoutDirection);
                            if ((iK2 & 48) != 48 || (i8 = (rectB7.top - ((ViewGroup.MarginLayoutParams) h3nVar6).topMargin) - h3nVar6.j) >= (i9 = rectB.top)) {
                                z = false;
                            } else {
                                x(view4, i9 - i8);
                                z = true;
                            }
                            if ((iK2 & 80) == 80 && (height = ((getHeight() - rectB7.bottom) - ((ViewGroup.MarginLayoutParams) h3nVar6).bottomMargin) + h3nVar6.j) < (i7 = rectB.bottom)) {
                                x(view4, height - i7);
                                z = true;
                            }
                            if (!z) {
                                x(view4, 0);
                            }
                            if ((iK2 & 3) != 3 || (i5 = (rectB7.left - ((ViewGroup.MarginLayoutParams) h3nVar6).leftMargin) - h3nVar6.i) >= (i6 = rectB.left)) {
                                z2 = false;
                            } else {
                                w(view4, i6 - i5);
                                z2 = true;
                            }
                            if ((iK2 & 5) == 5 && (width = ((getWidth() - rectB7.right) - ((ViewGroup.MarginLayoutParams) h3nVar6).rightMargin) + h3nVar6.i) < (i4 = rectB.right)) {
                                w(view4, width - i4);
                                z2 = true;
                            }
                            if (!z2) {
                                w(view4, 0);
                            }
                            rectB7.setEmpty();
                            ndv0Var.i(rectB7);
                        }
                    }
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((h3n) view4.getLayoutParams()).f45p);
                    if (rect.equals(rectB2)) {
                        arrayList = arrayList3;
                        i3 = i15;
                    } else {
                        ((h3n) view4.getLayoutParams()).f45p.set(rectB2);
                    }
                } else {
                    rect = rect3;
                }
                int i18 = i2 + 1;
                i3 = i15;
                while (true) {
                    arrayList = arrayList3;
                    if (i18 >= i3) {
                        break;
                    }
                    View view5 = (View) arrayList.get(i18);
                    h3n h3nVar7 = (h3n) view5.getLayoutParams();
                    e3n e3nVar3 = h3nVar7.a;
                    if (e3nVar3 != null && e3nVar3.b(view5, view4)) {
                        if (i == 0 && h3nVar7.o) {
                            h3nVar7.o = false;
                        } else {
                            if (i != 2) {
                                zD = e3nVar3.d(view5, view4);
                            } else {
                                e3nVar3.e(this, view4);
                                zD = true;
                            }
                            if (i == 1) {
                                h3nVar7.o = zD;
                            }
                        }
                    }
                    i18++;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                rect = rectB3;
                i2 = i11;
            }
            i11 = i2 + 1;
            rectB3 = rect;
            size = i3;
            arrayList2 = arrayList;
        }
    }

    public final void r(View view, int i) {
        int i2;
        h3n h3nVar = (h3n) view.getLayoutParams();
        View view2 = h3nVar.k;
        if (view2 == null && h3nVar.f != -1) {
            eg.m("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            return;
        }
        ndv0 ndv0Var = a1;
        if (view2 != null) {
            Rect rectB = b();
            Rect rectB2 = b();
            try {
                hbk1.a(this, view2, rectB);
                h3n h3nVar2 = (h3n) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                n(i, rectB, rectB2, h3nVar2, measuredWidth, measuredHeight);
                c(h3nVar2, rectB2, measuredWidth, measuredHeight);
                view.layout(rectB2.left, rectB2.top, rectB2.right, rectB2.bottom);
                return;
            } finally {
                rectB.setEmpty();
                ndv0Var.i(rectB);
                rectB2.setEmpty();
                ndv0Var.i(rectB2);
            }
        }
        int i3 = h3nVar.e;
        if (i3 < 0) {
            h3n h3nVar3 = (h3n) view.getLayoutParams();
            Rect rectB3 = b();
            rectB3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h3nVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3nVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) h3nVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) h3nVar3).bottomMargin);
            if (this.Q0 != null) {
                WeakHashMap weakHashMap = b8k1.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectB3.left = this.Q0.b() + rectB3.left;
                    rectB3.top = this.Q0.d() + rectB3.top;
                    rectB3.right -= this.Q0.c();
                    rectB3.bottom -= this.Q0.a();
                }
            }
            Rect rectB4 = b();
            int i4 = h3nVar3.c;
            if ((i4 & 7) == 0) {
                i4 |= 8388611;
            }
            if ((i4 & 112) == 0) {
                i4 |= 48;
            }
            qpn1.g(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rectB3, rectB4, i);
            view.layout(rectB4.left, rectB4.top, rectB4.right, rectB4.bottom);
            rectB3.setEmpty();
            ndv0Var.i(rectB3);
            rectB4.setEmpty();
            ndv0Var.i(rectB4);
            return;
        }
        h3n h3nVar4 = (h3n) view.getLayoutParams();
        int i5 = h3nVar4.c;
        if (i5 == 0) {
            i5 = 8388661;
        }
        int iK = qpn1.k(i5, i);
        int i6 = iK & 7;
        int i7 = iK & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i3 = width - i3;
        }
        int i8 = 0;
        int[] iArr = this.i;
        if (iArr != null && i3 >= 0 && i3 < iArr.length) {
            i2 = iArr[i3];
        } else {
            toString();
            i2 = 0;
        }
        int i9 = i2 - measuredWidth2;
        if (i6 == 1) {
            i9 += measuredWidth2 / 2;
        } else if (i6 == 5) {
            i9 += measuredWidth2;
        }
        if (i7 == 16) {
            i8 = measuredHeight2 / 2;
        } else if (i7 == 80) {
            i8 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) h3nVar4).leftMargin, Math.min(i9, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) h3nVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) h3nVar4).topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) h3nVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        e3n e3nVar = ((h3n) view.getLayoutParams()).a;
        if (e3nVar == null || !e3nVar.n(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.g) {
            return;
        }
        v(false);
        this.g = true;
    }

    public final void s(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.T0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.S0;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.S0 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.S0.setState(getDrawableState());
                }
                Drawable drawable3 = this.S0;
                WeakHashMap weakHashMap = b8k1.a;
                y1a1.R(drawable3, getLayoutDirection());
                this.S0.setVisible(getVisibility() == 0, false);
                this.S0.setCallback(this);
            }
            WeakHashMap weakHashMap2 = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? x74.G(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.S0;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.S0.setVisible(z, false);
    }

    public final boolean t(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        p0d p0dVar = Z0;
        if (p0dVar != null) {
            Collections.sort(arrayList, p0dVar);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zG = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            e3n e3nVar = ((h3n) view.getLayoutParams()).a;
            if (zG && actionMasked != 0) {
                if (e3nVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        e3nVar.g(this, view, motionEventObtain);
                    } else if (i == 1) {
                        e3nVar.s(this, view, motionEventObtain);
                    }
                }
            } else if (!zG && e3nVar != null) {
                if (i == 0) {
                    zG = e3nVar.g(this, view, motionEvent);
                } else if (i == 1) {
                    zG = e3nVar.s(this, view, motionEvent);
                }
                if (zG) {
                    this.t = view;
                }
            }
        }
        arrayList.clear();
        return zG;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:32:0x0075
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void u() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            e3n e3nVar = ((h3n) childAt.getLayoutParams()).a;
            if (e3nVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    e3nVar.g(this, childAt, motionEventObtain);
                } else {
                    e3nVar.s(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((h3n) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.t = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.S0;
    }

    public final void y() {
        WeakHashMap weakHashMap = b8k1.a;
        if (!getFitsSystemWindows()) {
            r7k1.c(this, null);
            return;
        }
        zwa zwaVar = this.U0;
        if (zwaVar == null) {
            zwaVar = new zwa(this, (byte) 19);
            this.U0 = zwaVar;
        }
        r7k1.c(this, zwaVar);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969091);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
