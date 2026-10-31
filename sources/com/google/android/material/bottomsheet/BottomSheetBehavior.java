package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p.b8k1;
import p.cc9;
import p.dgo1;
import p.e3n;
import p.fg;
import p.gch0;
import p.h3n;
import p.hhg1;
import p.iw61;
import p.k8k1;
import p.kb5;
import p.lls0;
import p.nvb;
import p.omz0;
import p.ovb;
import p.pvb;
import p.qpj1;
import p.qvb;
import p.r7k1;
import p.sw9;
import p.wr3;
import p.yxg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class BottomSheetBehavior<V extends View> extends e3n {
    public float A;
    public int B;
    public final float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public k8k1 H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference O;
    public WeakReference P;
    public final ArrayList Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public HashMap V;
    public int W;
    public final nvb X;
    public final int a;
    public boolean b;
    public final float c;
    public int d;
    public boolean e;
    public int f;
    public final int g;
    public final boolean h;
    public gch0 i;
    public int j;
    public final int k;
    public int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f0p;
    public final boolean q;
    public int r;
    public int s;
    public iw61 t;
    public boolean u;
    public qvb v;
    public final ValueAnimator w;
    public final int x;
    public int y;
    public int z;

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new nvb(this);
        this.g = context.getResources().getDimensionPixelSize(2131166664);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, omz0.e);
        this.h = typedArrayObtainStyledAttributes.hasValue(17);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        if (zHasValue) {
            w(context, attributeSet, zHasValue, dgo1.i(context, typedArrayObtainStyledAttributes, 3));
        } else {
            w(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.w.addUpdateListener(new kb5(this, (byte) 1));
        this.C = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue == null || (i = typedValuePeekValue.data) != -1) {
            J(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            J(i);
        }
        H(typedArrayObtainStyledAttributes.getBoolean(8, false));
        this.m = typedArrayObtainStyledAttributes.getBoolean(12, false);
        F(typedArrayObtainStyledAttributes.getBoolean(6, true));
        this.E = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.a = typedArrayObtainStyledAttributes.getInt(10, 0);
        G(typedArrayObtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                hhg1.n("offset must be greater than or equal to 0");
                throw null;
            }
            this.x = dimensionPixelOffset;
        } else {
            int i2 = typedValuePeekValue2.data;
            if (i2 < 0) {
                hhg1.n("offset must be greater than or equal to 0");
                throw null;
            }
            this.x = i2;
        }
        this.n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.o = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f0p = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(16, true);
        typedArrayObtainStyledAttributes.recycle();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static int A(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View y(View view) {
        WeakHashMap weakHashMap = b8k1.a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewY = y(viewGroup.getChildAt(i));
            if (viewY != null) {
                return viewY;
            }
        }
        return null;
    }

    public static BottomSheetBehavior z(View view) {
        h3n layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof h3n)) {
            hhg1.n("The view is not a child of CoordinatorLayout");
            return null;
        }
        e3n e3nVar = layoutParams.a;
        if (e3nVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) e3nVar;
        }
        hhg1.n("The view is not associated with BottomSheetBehavior");
        return null;
    }

    public final int B() {
        if (this.b) {
            return this.y;
        }
        return Math.max(this.x, this.q ? 0 : this.s);
    }

    public final int C() {
        return this.G;
    }

    public final void D(ovb ovbVar) {
        this.Q.remove(ovbVar);
    }

    public final void E(boolean z) {
        this.F = z;
    }

    public final void F(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.O != null) {
            u();
        }
        M((this.b && this.G == 6) ? 3 : this.G);
        Q();
    }

    public final void G(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            hhg1.n("ratio must be a float value between 0 and 1");
            return;
        }
        this.A = f;
        if (this.O != null) {
            this.z = (int) ((1.0f - f) * this.N);
        }
    }

    public final void H(boolean z) {
        if (this.D != z) {
            this.D = z;
            if (!z && this.G == 5) {
                L(4);
            }
            Q();
        }
    }

    public final void I(int i) {
        this.j = i;
    }

    public final void J(int i) {
        boolean z = this.e;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.e = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.e = false;
            this.d = Math.max(0, i);
        }
        T();
    }

    public final void K(boolean z) {
        this.E = z;
    }

    public final void L(int i) {
        if (i == this.G) {
            return;
        }
        if (this.O == null) {
            if (i == 4 || i == 3 || i == 6 || (this.D && i == 5)) {
                this.G = i;
                return;
            }
            return;
        }
        View view = (View) this.O.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = b8k1.a;
            if (view.isAttachedToWindow()) {
                view.post(new wr3(this, view, i, (byte) 2, false));
                return;
            }
        }
        N(view, i);
    }

    public final void M(int i) {
        View view;
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.D;
        }
        WeakReference weakReference = this.O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = 0;
        if (i == 3) {
            S(true);
        } else if (i == 6 || i == 5 || i == 4) {
            S(false);
        }
        R(i);
        while (true) {
            ArrayList arrayList = this.Q;
            if (i2 >= arrayList.size()) {
                Q();
                return;
            } else {
                ((ovb) arrayList.get(i2)).b(view, i);
                i2++;
            }
        }
    }

    public final void N(View view, int i) {
        int iB;
        int i2;
        if (i == 4) {
            iB = this.B;
        } else if (i == 6) {
            iB = this.z;
            if (this.b && iB <= (i2 = this.y)) {
                i = 3;
                iB = i2;
            }
        } else if (i == 3) {
            iB = B();
        } else if (!this.D || i != 5) {
            return;
        } else {
            iB = this.N;
        }
        P(view, i, iB, false);
    }

    public final boolean O(View view, float f) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) v()) > 0.5f;
    }

    public final void P(View view, int i, int i2, boolean z) {
        k8k1 k8k1Var = this.H;
        if (k8k1Var == null || (!z ? k8k1Var.r(view, view.getLeft(), i2) : k8k1Var.p(view.getLeft(), i2))) {
            M(i);
            return;
        }
        M(2);
        R(i);
        qvb qvbVar = this.v;
        if (qvbVar == null) {
            qvbVar = new qvb(this, view, i);
            this.v = qvbVar;
        }
        if (qvbVar.b) {
            qvbVar.c = i;
            return;
        }
        qvbVar.c = i;
        WeakHashMap weakHashMap = b8k1.a;
        view.postOnAnimation(qvbVar);
        this.v.b = true;
    }

    public final void Q() {
        View view;
        WeakReference weakReference = this.O;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        b8k1.l(view, 524288);
        b8k1.h(view, 0);
        b8k1.l(view, 262144);
        b8k1.h(view, 0);
        b8k1.l(view, 1048576);
        b8k1.h(view, 0);
        int i = this.W;
        if (i != -1) {
            b8k1.l(view, i);
            b8k1.h(view, 0);
        }
        if (!this.b && this.G != 6) {
            this.W = b8k1.a(view, view.getResources().getString(2131953007), new sw9(this, 6, (byte) 2));
        }
        if (this.D && this.G != 5) {
            b8k1.m(view, fg.o, (CharSequence) null, new sw9(this, 5, (byte) 2));
        }
        int i2 = this.G;
        if (i2 == 3) {
            b8k1.m(view, fg.n, (CharSequence) null, new sw9(this, this.b ? 4 : 6, (byte) 2));
            return;
        }
        if (i2 == 4) {
            b8k1.m(view, fg.m, (CharSequence) null, new sw9(this, this.b ? 3 : 6, (byte) 2));
        } else {
            if (i2 != 6) {
                return;
            }
            b8k1.m(view, fg.n, (CharSequence) null, new sw9(this, 4, (byte) 2));
            b8k1.m(view, fg.m, (CharSequence) null, new sw9(this, 3, (byte) 2));
        }
    }

    public final void R(int i) {
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z = i == 3;
        if (this.u != z) {
            this.u = z;
            if (this.i == null || (valueAnimator = this.w) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f = z ? 0.0f : 1.0f;
            valueAnimator.setFloatValues(1.0f - f, f);
            valueAnimator.start();
        }
    }

    public final void S(boolean z) {
        WeakReference weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        CoordinatorLayout parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.V != null) {
                    return;
                } else {
                    this.V = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.O.get() && z) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.V = null;
        }
    }

    public final void T() {
        View view;
        if (this.O != null) {
            u();
            if (this.G != 4 || (view = (View) this.O.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final void c(h3n h3nVar) {
        this.O = null;
        this.H = null;
    }

    public final void f() {
        this.O = null;
        this.H = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        k8k1 k8k1Var;
        if (!view.isShown() || !this.F) {
            this.I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.R;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.R = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.T = (int) motionEvent.getY();
            if (this.G != 2) {
                WeakReference weakReference = this.P;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x, this.T)) {
                    this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.U = true;
                }
            }
            this.I = this.S == -1 && !coordinatorLayout.p(view, x, this.T);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.U = false;
            this.S = -1;
            if (this.I) {
                this.I = false;
                return false;
            }
        }
        if (this.I || (k8k1Var = this.H) == null || !k8k1Var.q(motionEvent)) {
            WeakReference weakReference2 = this.P;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.I || this.G == 1 || coordinatorLayout.p(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.H == null || Math.abs(this.T - motionEvent.getY()) <= this.H.b) {
                return false;
            }
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        gch0 gch0Var;
        WeakHashMap weakHashMap = b8k1.a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.f = coordinatorLayout.getResources().getDimensionPixelSize(2131165647);
            boolean z = (Build.VERSION.SDK_INT < 29 || this.m || this.e) ? false : true;
            if (this.n || this.o || this.f0p || z) {
                lls0 lls0Var = new lls0(this, z, (byte) 8);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                cc9 cc9Var = new cc9();
                cc9Var.a = paddingStart;
                cc9Var.b = paddingEnd;
                cc9Var.c = paddingBottom;
                r7k1.c(view, new qpj1(lls0Var, cc9Var, (byte) 4));
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new yxg0((byte) 2));
                }
            }
            this.O = new WeakReference(view);
            if (this.h && (gch0Var = this.i) != null) {
                view.setBackground(gch0Var);
            }
            gch0 gch0Var2 = this.i;
            if (gch0Var2 != null) {
                float elevation = this.C;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                gch0Var2.l(elevation);
                boolean z2 = this.G == 3;
                this.u = z2;
                this.i.n(z2 ? 0.0f : 1.0f);
            }
            Q();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.H == null) {
            this.H = new k8k1(coordinatorLayout.getContext(), coordinatorLayout, this.X);
        }
        int top = view.getTop();
        coordinatorLayout.r(view, i);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.L = height;
        int i2 = this.N;
        int i3 = i2 - height;
        int i4 = this.s;
        if (i3 < i4) {
            if (this.q) {
                this.L = i2;
                height = i2;
            } else {
                height = i2 - i4;
                this.L = height;
            }
        }
        this.y = Math.max(0, i2 - height);
        this.z = (int) ((1.0f - this.A) * this.N);
        u();
        int i5 = this.G;
        if (i5 == 3) {
            view.offsetTopAndBottom(B());
        } else if (i5 == 6) {
            view.offsetTopAndBottom(this.z);
        } else if (this.D && i5 == 5) {
            view.offsetTopAndBottom(this.N);
        } else if (i5 == 4) {
            view.offsetTopAndBottom(this.B);
        } else if (i5 == 1 || i5 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.P = new WeakReference(y(view));
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(A(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.j, marginLayoutParams.width), A(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.k, marginLayoutParams.height));
        return true;
    }

    public final boolean j(CoordinatorLayout coordinatorLayout, View view, float f, float f2) {
        WeakReference weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.P;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < B()) {
                int iB = top - B();
                iArr[1] = iB;
                int i5 = -iB;
                WeakHashMap weakHashMap = b8k1.a;
                view.offsetTopAndBottom(i5);
                M(3);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = b8k1.a;
                view.offsetTopAndBottom(-i2);
                M(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i6 = this.B;
            if (i4 > i6 && !this.D) {
                int i7 = top - i6;
                iArr[1] = i7;
                int i8 = -i7;
                WeakHashMap weakHashMap3 = b8k1.a;
                view.offsetTopAndBottom(i8);
                M(4);
            } else {
                if (!this.F) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap4 = b8k1.a;
                view.offsetTopAndBottom(-i2);
                M(1);
            }
        }
        x(view.getTop());
        this.J = i2;
        this.K = true;
    }

    public final void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(View view, Parcelable parcelable) {
        pvb pvbVar = (pvb) parcelable;
        int i = this.a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = pvbVar.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.b = pvbVar.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.D = pvbVar.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.E = pvbVar.g;
            }
        }
        int i2 = pvbVar.c;
        if (i2 == 1 || i2 == 2) {
            this.G = 4;
        } else {
            this.G = i2;
        }
    }

    public final Parcelable p(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new pvb(this);
    }

    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        this.J = 0;
        this.K = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    public final void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        int top;
        int iB;
        int top2;
        int i2;
        float yVelocity;
        int i3 = 3;
        if (view.getTop() == B()) {
            M(3);
            return;
        }
        WeakReference weakReference = this.P;
        if (weakReference != null && view2 == weakReference.get() && this.K) {
            if (this.J > 0) {
                if (this.b) {
                    iB = this.y;
                } else {
                    int top3 = view.getTop();
                    int i4 = this.z;
                    if (top3 > i4) {
                        i3 = 6;
                        iB = i4;
                    } else {
                        iB = B();
                    }
                }
            } else if (this.D) {
                VelocityTracker velocityTracker = this.R;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.c);
                    yVelocity = this.R.getYVelocity(this.S);
                }
                if (O(view, yVelocity)) {
                    iB = this.N;
                    i3 = 5;
                } else if (this.J == 0) {
                    top2 = view.getTop();
                    if (this.b) {
                        i2 = this.z;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - this.B)) {
                                iB = B();
                            } else {
                                iB = this.z;
                            }
                        } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.B)) {
                            iB = this.z;
                        } else {
                            iB = this.B;
                            i3 = 4;
                        }
                        i3 = 6;
                    } else if (Math.abs(top2 - this.y) < Math.abs(top2 - this.B)) {
                        iB = this.y;
                    } else {
                        iB = this.B;
                        i3 = 4;
                    }
                } else {
                    if (this.b) {
                        iB = this.B;
                    } else {
                        top = view.getTop();
                        if (Math.abs(top - this.z) < Math.abs(top - this.B)) {
                            iB = this.z;
                            i3 = 6;
                        } else {
                            iB = this.B;
                        }
                    }
                    i3 = 4;
                }
            } else if (this.J == 0) {
                top2 = view.getTop();
                if (this.b) {
                    i2 = this.z;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - this.B)) {
                            iB = B();
                        } else {
                            iB = this.z;
                        }
                    } else if (Math.abs(top2 - i2) < Math.abs(top2 - this.B)) {
                        iB = this.z;
                    } else {
                        iB = this.B;
                        i3 = 4;
                    }
                    i3 = 6;
                } else if (Math.abs(top2 - this.y) < Math.abs(top2 - this.B)) {
                    iB = this.y;
                } else {
                    iB = this.B;
                    i3 = 4;
                }
            } else {
                if (this.b) {
                    iB = this.B;
                } else {
                    top = view.getTop();
                    if (Math.abs(top - this.z) < Math.abs(top - this.B)) {
                        iB = this.z;
                        i3 = 6;
                    } else {
                        iB = this.B;
                    }
                }
                i3 = 4;
            }
            P(view, i3, iB, false);
            this.K = false;
        }
    }

    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.G;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        k8k1 k8k1Var = this.H;
        if (k8k1Var != null && (this.F || i == 1)) {
            k8k1Var.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.S = -1;
            VelocityTracker velocityTracker = this.R;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.R = null;
            }
        }
        VelocityTracker velocityTrackerObtain = this.R;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.R = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (this.H != null && ((this.F || this.G == 1) && actionMasked == 2 && !this.I)) {
            float fAbs = Math.abs(this.T - motionEvent.getY());
            k8k1 k8k1Var2 = this.H;
            if (fAbs > k8k1Var2.b) {
                k8k1Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.I;
    }

    public final void t(ovb ovbVar) {
        ArrayList arrayList = this.Q;
        if (arrayList.contains(ovbVar)) {
            return;
        }
        arrayList.add(ovbVar);
    }

    public final void u() {
        int iV = v();
        boolean z = this.b;
        int i = this.N;
        if (z) {
            this.B = Math.max(i - iV, this.y);
        } else {
            this.B = i - iV;
        }
    }

    public final int v() {
        int iMin;
        int i;
        int i2;
        if (this.e) {
            iMin = Math.min(Math.max(this.f, this.N - ((this.M * 9) / 16)), this.L);
            i = this.r;
        } else {
            if (!this.m && !this.n && (i2 = this.l) > 0) {
                return Math.max(this.d, i2 + this.g);
            }
            iMin = this.d;
            i = this.r;
        }
        return iMin + i;
    }

    public final void w(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.h) {
            this.t = iw61.b(context, attributeSet, 2130968815, 2132018536).d();
            gch0 gch0Var = new gch0(this.t);
            this.i = gch0Var;
            gch0Var.j(context);
            if (z && colorStateList != null) {
                this.i.m(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.i.setTint(typedValue.data);
        }
    }

    public final void x(int i) {
        float f;
        float fB;
        View view = (View) this.O.get();
        if (view != null) {
            ArrayList arrayList = this.Q;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.B;
            if (i > i2 || i2 == B()) {
                int i3 = this.B;
                f = i3 - i;
                fB = this.N - i3;
            } else {
                int i4 = this.B;
                f = i4 - i;
                fB = i4 - B();
            }
            float f2 = f / fB;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((ovb) arrayList.get(i5)).a(view, f2);
            }
        }
    }

    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.j = -1;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList();
        this.W = -1;
        this.X = new nvb(this);
    }
}
