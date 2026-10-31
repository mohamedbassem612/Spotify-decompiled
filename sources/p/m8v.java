package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class m8v extends ViewGroup {
    public static final int[] f1 = {R.attr.colorPrimaryDark};
    public static final int[] g1 = {R.attr.layout_gravity};
    public static final boolean h1;
    public boolean N0;
    public boolean O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public i8v U0;
    public ArrayList V0;
    public float W0;
    public float X0;
    public Drawable Y0;
    public WindowInsets Z0;
    public float a;
    public boolean a1;
    public final int b;
    public final ArrayList b1;
    public int c;
    public Rect c1;
    public float d;
    public Matrix d1;
    public final Paint e;
    public final ogr e1;
    public final k8k1 f;
    public final k8k1 g;
    public final l8v h;
    public final l8v i;
    public int t;

    static {
        h1 = Build.VERSION.SDK_INT >= 29;
    }

    public m8v(dg30 dg30Var) {
        super(dg30Var, null, 2130969176);
        new zdc((byte) 8);
        this.c = -1728053248;
        this.e = new Paint();
        this.O0 = true;
        this.P0 = 3;
        this.Q0 = 3;
        this.R0 = 3;
        this.S0 = 3;
        this.e1 = new ogr(this, (byte) 19);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.b = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        l8v l8vVar = new l8v(this, 3);
        this.h = l8vVar;
        l8v l8vVar2 = new l8v(this, 5);
        this.i = l8vVar2;
        k8k1 k8k1Var = new k8k1(getContext(), this, l8vVar);
        k8k1Var.b = (int) (k8k1Var.b * 1.0f);
        this.f = k8k1Var;
        k8k1Var.q = (byte) 1;
        k8k1Var.n = f2;
        l8vVar.d = k8k1Var;
        k8k1 k8k1Var2 = new k8k1(getContext(), this, l8vVar2);
        k8k1Var2.b = (int) (1.0f * k8k1Var2.b);
        this.g = k8k1Var2;
        k8k1Var2.q = (byte) 2;
        k8k1Var2.n = f2;
        l8vVar2.d = k8k1Var2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = b8k1.a;
        setImportantForAccessibility(1);
        b8k1.p(this, new h8v(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new ouz0((byte) 2));
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = dg30Var.obtainStyledAttributes(f1);
            try {
                this.Y0 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = dg30Var.obtainStyledAttributes(null, ioz0.a, 2130969176, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.a = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.a = getResources().getDimension(2131165623);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.b1 = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String h(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean i(View view) {
        return ((j8v) view.getLayoutParams()).a == 0;
    }

    public static boolean j(View view) {
        if (k(view)) {
            return (((j8v) view.getLayoutParams()).d & 1) == 1;
        }
        eg.n("View ", view, " is not a drawer");
        return false;
    }

    public static boolean k(View view) {
        int i = ((j8v) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = b8k1.a;
        int iK = qpn1.k(i, view.getLayoutDirection());
        return ((iK & 3) == 0 && (iK & 5) == 0) ? false : true;
    }

    public static boolean l(View view) {
        if (k(view)) {
            return ((j8v) view.getLayoutParams()).b > 0.0f;
        }
        eg.n("View ", view, " is not a drawer");
        return false;
    }

    public final boolean a(View view, int i) {
        return (g(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.b1;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!k(childAt)) {
                arrayList2.add(childAt);
            } else if (j(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((j8v) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || k(view)) {
            WeakHashMap weakHashMap = b8k1.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = b8k1.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final void b(View view) {
        if (!k(view)) {
            eg.n("View ", view, " is not a sliding drawer");
            return;
        }
        j8v j8vVar = (j8v) view.getLayoutParams();
        if (this.O0) {
            j8vVar.b = 0.0f;
            j8vVar.d = 0;
        } else {
            j8vVar.d |= 4;
            if (a(view, 3)) {
                this.f.r(view, -view.getWidth(), view.getTop());
            } else {
                this.g.r(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void c(boolean z) {
        int childCount = getChildCount();
        boolean zR = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            j8v j8vVar = (j8v) childAt.getLayoutParams();
            if (k(childAt) && (!z || j8vVar.c)) {
                zR |= a(childAt, 3) ? this.f.r(childAt, -childAt.getWidth(), childAt.getTop()) : this.g.r(childAt, getWidth(), childAt.getTop());
                j8vVar.c = false;
            }
        }
        l8v l8vVar = this.h;
        l8vVar.f.removeCallbacks(l8vVar.e);
        l8v l8vVar2 = this.i;
        l8vVar2.f.removeCallbacks(l8vVar2.e);
        if (zR) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof j8v) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((j8v) getChildAt(i).getLayoutParams()).b);
        }
        this.d = fMax;
        boolean zG = this.f.g();
        boolean zG2 = this.g.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public final View d(int i) {
        WeakHashMap weakHashMap = b8k1.a;
        int iK = qpn1.k(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((g(childAt) & 7) == iK) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.d <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            Rect rect = this.c1;
            if (rect == null) {
                rect = new Rect();
                this.c1 = rect;
            }
            childAt.getHitRect(rect);
            if (this.c1.contains((int) x, (int) y) && !i(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        Matrix matrix2 = this.d1;
                        if (matrix2 == null) {
                            matrix2 = new Matrix();
                            this.d1 = matrix2;
                        }
                        matrix.invert(matrix2);
                        motionEventObtain.transform(this.d1);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zI = i(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zI) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && k(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.d;
        if (f > 0.0f && zI) {
            int i4 = this.c;
            Paint paint = this.e;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (k(childAt) && l(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int f(View view) {
        if (!k(view)) {
            eg.n("View ", view, " is not a drawer");
            return 0;
        }
        int i = ((j8v) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = b8k1.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.P0;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.R0 : this.S0;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.Q0;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.S0 : this.R0;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.R0;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.P0 : this.Q0;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.S0;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.Q0 : this.P0;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int g(View view) {
        int i = ((j8v) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = b8k1.a;
        return qpn1.k(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new j8v();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof j8v) {
            j8v j8vVar = (j8v) layoutParams;
            j8v j8vVar2 = new j8v(j8vVar);
            j8vVar2.a = 0;
            j8vVar2.a = j8vVar.a;
            return j8vVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            j8v j8vVar3 = new j8v((ViewGroup.MarginLayoutParams) layoutParams);
            j8vVar3.a = 0;
            return j8vVar3;
        }
        j8v j8vVar4 = new j8v(layoutParams);
        j8vVar4.a = 0;
        return j8vVar4;
    }

    public float getDrawerElevation() {
        return this.a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.Y0;
    }

    public final void m(View view, boolean z) {
        if (!k(view)) {
            eg.n("View ", view, " is not a sliding drawer");
            return;
        }
        j8v j8vVar = (j8v) view.getLayoutParams();
        if (this.O0) {
            j8vVar.b = 1.0f;
            j8vVar.d = 1;
            q(view, true);
            p(view);
        } else if (z) {
            j8vVar.d |= 2;
            if (a(view, 3)) {
                this.f.r(view, 0, view.getTop());
            } else {
                this.g.r(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            float f = ((j8v) view.getLayoutParams()).b;
            float width = view.getWidth();
            int i = ((int) (width * 1.0f)) - ((int) (f * width));
            if (!a(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            o(view, 1.0f);
            r(view, 0);
            view.setVisibility(0);
        }
        invalidate();
    }

    public final void n(int i, int i2) {
        View viewD;
        WeakHashMap weakHashMap = b8k1.a;
        int iK = qpn1.k(i2, getLayoutDirection());
        if (i2 == 3) {
            this.P0 = i;
        } else if (i2 == 5) {
            this.Q0 = i;
        } else if (i2 == 8388611) {
            this.R0 = i;
        } else if (i2 == 8388613) {
            this.S0 = i;
        }
        if (i != 0) {
            (iK == 3 ? this.f : this.g).a();
        }
        if (i != 1) {
            if (i == 2 && (viewD = d(iK)) != null) {
                m(viewD, true);
                return;
            }
            return;
        }
        View viewD2 = d(iK);
        if (viewD2 != null) {
            b(viewD2);
        }
    }

    public final void o(View view, float f) {
        j8v j8vVar = (j8v) view.getLayoutParams();
        if (f == j8vVar.b) {
            return;
        }
        j8vVar.b = f;
        ArrayList arrayList = this.V0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                fh81 fh81Var = ((i8v) this.V0.get(size)).a;
                fh81Var.x();
                fh81Var.v(f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O0 = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.a1 || this.Y0 == null) {
            return;
        }
        WindowInsets windowInsets = this.Z0;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.Y0.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.Y0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewH;
        int actionMasked = motionEvent.getActionMasked();
        k8k1 k8k1Var = this.f;
        boolean zQ = k8k1Var.q(motionEvent) | this.g.q(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                c(true);
                this.T0 = false;
            } else if (actionMasked == 2) {
                int length = k8k1Var.d.length;
                for (int i = 0; i < length; i++) {
                    if ((k8k1Var.k & (1 << i)) != 0) {
                        float f = k8k1Var.f[i] - k8k1Var.d[i];
                        float f2 = k8k1Var.g[i] - k8k1Var.e[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = k8k1Var.b;
                        if (f3 > i2 * i2) {
                            l8v l8vVar = this.h;
                            l8vVar.f.removeCallbacks(l8vVar.e);
                            l8v l8vVar2 = this.i;
                            l8vVar2.f.removeCallbacks(l8vVar2.e);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                c(true);
                this.T0 = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.W0 = x;
            this.X0 = y;
            z = this.d > 0.0f && (viewH = k8k1Var.h((int) x, (int) y)) != null && i(viewH);
            this.T0 = false;
        }
        if (!zQ && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((j8v) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.T0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || e() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewE = e();
        if (viewE != null && f(viewE) == 0) {
            c(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        float f2;
        int i5;
        boolean z2 = true;
        this.N0 = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                j8v j8vVar = (j8v) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) j8vVar).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) j8vVar).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) j8vVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        f = j8vVar.b;
                        i5 = (-measuredWidth) + ((int) (f3 * f));
                        f2 = (measuredWidth + i5) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f = j8vVar.b;
                        int i9 = i6 - ((int) (f4 * f));
                        f2 = (i6 - i9) / f4;
                        i5 = i9;
                    }
                    boolean z3 = f2 != f ? z2 : false;
                    int i10 = j8vVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) j8vVar).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) j8vVar).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin);
                    }
                    if (z3) {
                        o(childAt, f2);
                    }
                    int i18 = j8vVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (h1 && (rootWindowInsets = getRootWindowInsets()) != null) {
            nk80 nk80VarM = hsl1.g(null, rootWindowInsets).a.m();
            k8k1 k8k1Var = this.f;
            k8k1Var.o = Math.max(k8k1Var.f62p, nk80VarM.a);
            k8k1 k8k1Var2 = this.g;
            k8k1Var2.o = Math.max(k8k1Var2.f62p, nk80VarM.c);
        }
        this.N0 = false;
        this.O0 = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                hhg1.n("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.Z0 != null) {
            WeakHashMap weakHashMap = b8k1.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = b8k1.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                j8v j8vVar = (j8v) childAt.getLayoutParams();
                if (z) {
                    int iK = qpn1.k(j8vVar.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.Z0;
                    if (fitsSystemWindows) {
                        if (iK == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iK == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (iK == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iK == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) j8vVar).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) j8vVar).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) j8vVar).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (i(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) j8vVar).leftMargin) - ((ViewGroup.MarginLayoutParams) j8vVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) j8vVar).topMargin) - ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin, 1073741824));
                } else {
                    if (!k(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float elevation = childAt.getElevation();
                    float f = this.a;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int iG = g(childAt) & 7;
                    boolean z4 = iG == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        eg.h("Child drawer has absolute gravity ", h(iG), " but this DrawerLayout already has a drawer view along that edge");
                        return;
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.b + ((ViewGroup.MarginLayoutParams) j8vVar).leftMargin + ((ViewGroup.MarginLayoutParams) j8vVar).rightMargin, ((ViewGroup.MarginLayoutParams) j8vVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) j8vVar).topMargin + ((ViewGroup.MarginLayoutParams) j8vVar).bottomMargin, ((ViewGroup.MarginLayoutParams) j8vVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewD;
        if (!(parcelable instanceof k8v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k8v k8vVar = (k8v) parcelable;
        super.onRestoreInstanceState(k8vVar.a());
        int i = k8vVar.c;
        if (i != 0 && (viewD = d(i)) != null) {
            m(viewD, true);
        }
        int i2 = k8vVar.d;
        if (i2 != 3) {
            n(i2, 3);
        }
        int i3 = k8vVar.e;
        if (i3 != 3) {
            n(i3, 5);
        }
        int i4 = k8vVar.f;
        if (i4 != 3) {
            n(i4, 8388611);
        }
        int i5 = k8vVar.g;
        if (i5 != 3) {
            n(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k8v k8vVar = new k8v(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            j8v j8vVar = (j8v) getChildAt(i).getLayoutParams();
            int i2 = j8vVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                k8vVar.c = j8vVar.a;
                break;
            }
        }
        k8vVar.d = this.P0;
        k8vVar.e = this.Q0;
        k8vVar.f = this.R0;
        k8vVar.g = this.S0;
        return k8vVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        k8k1 k8k1Var = this.f;
        k8k1Var.j(motionEvent);
        this.g.j(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.W0 = x;
            this.X0 = y;
            this.T0 = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            c(true);
            this.T0 = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewH = k8k1Var.h((int) x2, (int) y2);
        if (viewH != null && i(viewH)) {
            float f = x2 - this.W0;
            float f2 = y2 - this.X0;
            int i = k8k1Var.b;
            if ((f2 * f2) + (f * f) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((j8v) childAt.getLayoutParams()).d & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || f(childAt) == 2;
            }
        }
        c(z);
        return true;
    }

    public final void p(View view) {
        fg fgVar = fg.o;
        b8k1.k(view, fgVar.a());
        if (!j(view) || f(view) == 2) {
            return;
        }
        b8k1.m(view, fgVar, null, this.e1);
    }

    public final void q(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || k(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = b8k1.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = b8k1.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void r(View view, int i) {
        int i2;
        View rootView;
        byte b = this.f.a;
        byte b2 = this.g.a;
        if (b == 1 || b2 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (b != 2 && b2 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((j8v) view.getLayoutParams()).b;
            if (f == 0.0f) {
                j8v j8vVar = (j8v) view.getLayoutParams();
                if ((j8vVar.d & 1) == 1) {
                    j8vVar.d = 0;
                    ArrayList arrayList = this.V0;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            fh81 fh81Var = ((i8v) this.V0.get(size)).a;
                            if (!fh81Var.z1) {
                                fh81Var.i1.b.e(mqn1.h());
                            }
                            fh81Var.z1 = false;
                            bpb1 bpb1Var = fh81Var.n1;
                            Boolean bool = Boolean.FALSE;
                            bpb1Var.getClass();
                            bpb1Var.m((Object) null, bool);
                        }
                    }
                    q(view, false);
                    p(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                j8v j8vVar2 = (j8v) view.getLayoutParams();
                if ((j8vVar2.d & 1) == 0) {
                    j8vVar2.d = 1;
                    ArrayList arrayList2 = this.V0;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            fh81 fh81Var2 = ((i8v) this.V0.get(size2)).a;
                            fh81.w(fh81Var2);
                            bpb1 bpb1Var2 = fh81Var2.n1;
                            Boolean bool2 = Boolean.TRUE;
                            bpb1Var2.getClass();
                            bpb1Var2.m((Object) null, bool2);
                            view.requestFocus();
                        }
                    }
                    q(view, true);
                    p(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.t) {
            this.t = i2;
            ArrayList arrayList3 = this.V0;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    fh81 fh81Var3 = ((i8v) this.V0.get(size3)).a;
                    if (i2 == 0) {
                        fh81Var3.z1 = false;
                    } else if (i2 == 1) {
                        fh81Var3.z1 = false;
                        View viewD = fh81Var3.d(8388611);
                        if (!(viewD != null ? j(viewD) : false)) {
                            ph81 ph81Var = fh81Var3.i1;
                            i8h1 i8h1Var = ph81Var.a;
                            uzl0 uzl0Var = ph81Var.c;
                            uzl0Var.getClass();
                            ph81Var.b.e(mqn1.M("spotify:activitycenter", i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7x.a), new x7h1("ui_navigate", 1, zno1.t(oqn1.n("destination", "spotify:activitycenter"))), uzl0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null)));
                        }
                    }
                    fh81.s(fh81Var3, i2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.N0) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (k(childAt)) {
                float f2 = this.a;
                WeakHashMap weakHashMap = b8k1.a;
                childAt.setElevation(f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(i8v i8vVar) {
        ArrayList arrayList;
        i8v i8vVar2 = this.U0;
        if (i8vVar2 != null && (arrayList = this.V0) != null) {
            arrayList.remove(i8vVar2);
        }
        if (i8vVar != null) {
            ArrayList arrayList2 = this.V0;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.V0 = arrayList2;
            }
            arrayList2.add(i8vVar);
        }
        this.U0 = i8vVar;
    }

    public void setDrawerLockMode(int i) {
        n(i, 3);
        n(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.Y0 = i != 0 ? x74.G(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.Y0 = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.Y0 = drawable;
        invalidate();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        j8v j8vVar = new j8v(context, attributeSet);
        j8vVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g1);
        j8vVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return j8vVar;
    }
}
