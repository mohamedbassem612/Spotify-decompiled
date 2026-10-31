package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import java.util.WeakHashMap;
import p.aad1;
import p.b8k1;
import p.bad1;
import p.c13;
import p.cad1;
import p.ccg;
import p.dad1;
import p.ead1;
import p.f3a;
import p.fad1;
import p.hmz0;
import p.o6o0;
import p.p6o0;
import p.q6o0;
import p.qcg;
import p.r6o0;
import p.rcg;
import p.s6o0;
import p.t6o0;
import p.tyo1;
import p.x74;
import p.y9d1;
import p.z9d1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements s6o0, r6o0, o6o0, t6o0, p6o0 {
    public static final int[] n1 = {R.attr.enabled};
    public final int[] N0;
    public boolean O0;
    public final int P0;
    public int Q0;
    public float R0;
    public float S0;
    public boolean T0;
    public int U0;
    public final DecelerateInterpolator V0;
    public final ccg W0;
    public int X0;
    public int Y0;
    public final int Z0;
    public View a;
    public final int a1;
    public ead1 b;
    public int b1;
    public boolean c;
    public final rcg c1;
    public final int d;
    public z9d1 d1;
    public float e;
    public aad1 e1;
    public float f;
    public bad1 f1;
    public final f3a g;
    public bad1 g1;
    public final q6o0 h;
    public boolean h1;
    public final int[] i;
    public int i1;
    public boolean j1;
    public final y9d1 k1;
    public final aad1 l1;
    public final aad1 m1;
    public final int[] t;

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.e = -1.0f;
        this.i = new int[2];
        this.t = new int[2];
        this.N0 = new int[2];
        this.U0 = -1;
        this.X0 = -1;
        this.k1 = new y9d1(this);
        this.l1 = new aad1(this, (byte) 1);
        this.m1 = new aad1(this, (byte) 2);
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.P0 = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.V0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.i1 = (int) (displayMetrics.density * 40.0f);
        ccg ccgVar = new ccg(getContext());
        float f = ccgVar.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = ccgVar.getContext().obtainStyledAttributes(hmz0.a);
        ccgVar.b = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = b8k1.a;
        ccgVar.setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(ccgVar.b);
        ccgVar.setBackground(shapeDrawable);
        this.W0 = ccgVar;
        rcg rcgVar = new rcg(getContext());
        this.c1 = rcgVar;
        rcgVar.c(1);
        this.W0.setImageDrawable(this.c1);
        this.W0.setVisibility(8);
        addView(this.W0);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.a1 = i;
        this.e = i;
        this.g = new f3a(false);
        this.h = new q6o0(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.i1;
        this.Q0 = i2;
        this.Z0 = i2;
        i(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n1);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.W0.getBackground().setAlpha(i);
        this.c1.setAlpha(i);
    }

    @Override // p.o6o0
    public final void a(int i) {
    }

    public final boolean b() {
        View view = this.a;
        return view instanceof ListView ? tyo1.e((ListView) view) : view.canScrollVertically(-1);
    }

    public final void c() {
        if (this.a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.W0)) {
                    this.a = childAt;
                    return;
                }
            }
        }
    }

    @Override // p.r6o0
    public final void d(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.h.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.h.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // p.r6o0
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public final void f(float f) {
        if (f > this.e) {
            n(true, true);
            return;
        }
        this.c = false;
        rcg rcgVar = this.c1;
        qcg qcgVar = rcgVar.a;
        qcgVar.e = 0.0f;
        qcgVar.f = 0.0f;
        rcgVar.invalidateSelf();
        cad1 cad1Var = new cad1(this, (byte) 0);
        this.Y0 = this.Q0;
        Animation animation = this.m1;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.V0);
        ccg ccgVar = this.W0;
        ccgVar.a = cad1Var;
        ccgVar.clearAnimation();
        ccgVar.startAnimation(animation);
        qcg qcgVar2 = rcgVar.a;
        if (qcgVar2.n) {
            qcgVar2.n = false;
        }
        rcgVar.invalidateSelf();
    }

    @Override // p.r6o0
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.X0;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.g.d();
    }

    public int getProgressCircleDiameter() {
        return this.i1;
    }

    public int getProgressViewEndOffset() {
        return this.a1;
    }

    public int getProgressViewStartOffset() {
        return this.Z0;
    }

    public final void h(float f) {
        bad1 bad1Var;
        bad1 bad1Var2;
        rcg rcgVar = this.c1;
        qcg qcgVar = rcgVar.a;
        if (!qcgVar.n) {
            qcgVar.n = true;
        }
        rcgVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.e;
        int i = this.b1;
        if (i <= 0) {
            i = this.a1;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 * 2.0f) / f2) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.Z0 + ((int) ((f2 * fMin) + (f2 * fPow * 2.0f)));
        ccg ccgVar = this.W0;
        if (ccgVar.getVisibility() != 0) {
            ccgVar.setVisibility(0);
        }
        ccgVar.setScaleX(1.0f);
        ccgVar.setScaleY(1.0f);
        if (f < this.e) {
            if (rcgVar.a.t > 76 && ((bad1Var2 = this.f1) == null || !bad1Var2.hasStarted() || bad1Var2.hasEnded())) {
                bad1 bad1Var3 = new bad1(this, rcgVar.a.t, 76);
                bad1Var3.setDuration(300L);
                ccgVar.a = null;
                ccgVar.clearAnimation();
                ccgVar.startAnimation(bad1Var3);
                this.f1 = bad1Var3;
            }
        } else if (rcgVar.a.t < 255 && ((bad1Var = this.g1) == null || !bad1Var.hasStarted() || bad1Var.hasEnded())) {
            bad1 bad1Var4 = new bad1(this, rcgVar.a.t, 255);
            bad1Var4.setDuration(300L);
            ccgVar.a = null;
            ccgVar.clearAnimation();
            ccgVar.startAnimation(bad1Var4);
            this.g1 = bad1Var4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        qcg qcgVar2 = rcgVar.a;
        qcgVar2.e = 0.0f;
        qcgVar2.f = fMin2;
        rcgVar.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        qcg qcgVar3 = rcgVar.a;
        if (fMin3 != qcgVar3.f99p) {
            qcgVar3.f99p = fMin3;
        }
        rcgVar.invalidateSelf();
        rcgVar.a.g = c13.p(fPow, 2.0f, (fMax * 0.4f) - 0.25f, 0.5f);
        rcgVar.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.Q0);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.h.f(0);
    }

    public final void i(float f) {
        int i = this.Y0;
        setTargetOffsetTopAndBottom((i + ((int) ((this.Z0 - i) * f))) - this.W0.getTop());
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.h.d;
    }

    @Override // p.s6o0
    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 != 0) {
            return;
        }
        int i6 = iArr[1];
        if (i5 == 0) {
            this.h.d(i, i2, i3, i4, this.t, i5, iArr);
        }
        int i7 = i4 - (iArr[1] - i6);
        int i8 = i7 == 0 ? this.t[1] + i4 : i7;
        if (i8 >= 0 || b()) {
            return;
        }
        float fAbs = this.f + Math.abs(i8);
        this.f = fAbs;
        h(fAbs);
        iArr[1] = iArr[1] + i7;
    }

    @Override // p.r6o0
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        j(view, i, i2, i3, i4, i5, this.N0);
    }

    @Override // p.r6o0
    public final boolean l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public final void m() {
        this.W0.clearAnimation();
        this.c1.stop();
        this.W0.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.Z0 - this.Q0);
        this.Q0 = this.W0.getTop();
    }

    public final void n(boolean z, boolean z2) {
        if (this.c != z) {
            this.h1 = z2;
            c();
            this.c = z;
            ccg ccgVar = this.W0;
            y9d1 y9d1Var = this.k1;
            if (!z) {
                aad1 aad1Var = new aad1(this, (byte) 0);
                this.e1 = aad1Var;
                aad1Var.setDuration(150L);
                ccgVar.a = y9d1Var;
                ccgVar.clearAnimation();
                ccgVar.startAnimation(this.e1);
                return;
            }
            this.Y0 = this.Q0;
            aad1 aad1Var2 = this.l1;
            aad1Var2.reset();
            aad1Var2.setDuration(200L);
            aad1Var2.setInterpolator(this.V0);
            if (y9d1Var != null) {
                ccgVar.a = y9d1Var;
            }
            ccgVar.clearAnimation();
            ccgVar.startAnimation(aad1Var2);
        }
    }

    public final void o(float f) {
        float f2 = this.S0;
        float f3 = f - f2;
        float f4 = this.d;
        if (f3 <= f4 || this.T0) {
            return;
        }
        this.R0 = f2 + f4;
        this.T0 = true;
        this.c1.setAlpha(76);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        c();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !b() && !this.c && !this.O0) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.T0 = false;
                    this.U0 = -1;
                } else if (actionMasked == 2) {
                    int i = this.U0;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        o(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.T0 = false;
                    this.U0 = -1;
                } else if (actionMasked == 6) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex) == this.U0) {
                        this.U0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                    }
                }
                return this.T0;
            }
            setTargetOffsetTopAndBottom(this.Z0 - this.W0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.U0 = pointerId;
            this.T0 = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.S0 = motionEvent.getY(iFindPointerIndex2);
                return this.T0;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.a == null) {
            c();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.W0.getMeasuredWidth();
        int measuredHeight2 = this.W0.getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int i6 = measuredWidth2 / 2;
        int i7 = this.Q0;
        this.W0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == null) {
            c();
        }
        View view = this.a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.W0.measure(View.MeasureSpec.makeMeasureSpec(this.i1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.i1, 1073741824));
        this.X0 = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.W0) {
                this.X0 = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.h.a(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.h.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.f = 0.0f;
                } else {
                    f2 = f - f3;
                    this.f = f2;
                    iArr[1] = i2;
                }
                h(f2);
            }
        }
        int i3 = i - iArr[0];
        int i4 = i2 - iArr[1];
        int[] iArr2 = this.i;
        if (dispatchNestedPreScroll(i3, i4, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        j(view, i, i2, i3, i4, 0, this.N0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.g.i(i);
        startNestedScroll(i & 2);
        this.f = 0.0f;
        this.O0 = true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        fad1 fad1Var = (fad1) parcelable;
        super.onRestoreInstanceState(fad1Var.getSuperState());
        setRefreshing(fad1Var.a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new fad1(super.onSaveInstanceState(), this.c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.c || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.g.k();
        this.O0 = false;
        float f = this.f;
        if (f > 0.0f) {
            f(f);
            this.f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !b() && !this.c && !this.O0) {
            if (actionMasked == 0) {
                this.U0 = motionEvent.getPointerId(0);
                this.T0 = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.U0);
                if (iFindPointerIndex >= 0) {
                    if (this.T0) {
                        float y = (motionEvent.getY(iFindPointerIndex) - this.R0) * 0.5f;
                        this.T0 = false;
                        f(y);
                    }
                    this.U0 = -1;
                    return false;
                }
            } else if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.U0);
                if (iFindPointerIndex2 >= 0) {
                    float y2 = motionEvent.getY(iFindPointerIndex2);
                    o(y2);
                    if (this.T0) {
                        float f = (y2 - this.R0) * 0.5f;
                        if (f > 0.0f) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            h(f);
                        }
                    }
                    return true;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.U0) {
                            this.U0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 >= 0) {
                    this.U0 = motionEvent.getPointerId(actionIndex2);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.a;
        if (view != null) {
            WeakHashMap weakHashMap = b8k1.a;
            if (!view.isNestedScrollingEnabled()) {
                if (this.j1 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setAnimationProgress(float f) {
        this.W0.setScaleX(f);
        this.W0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        c();
        rcg rcgVar = this.c1;
        qcg qcgVar = rcgVar.a;
        qcgVar.i = iArr;
        qcgVar.a(0);
        qcgVar.a(0);
        rcgVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = x74.D(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.e = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        m();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.j1 = z;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.h.g(z);
    }

    public void setOnRefreshListener(ead1 ead1Var) {
        this.b = ead1Var;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.W0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(x74.D(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.c == z) {
            n(z, false);
            return;
        }
        this.c = z;
        setTargetOffsetTopAndBottom((this.a1 + this.Z0) - this.Q0);
        this.h1 = false;
        ccg ccgVar = this.W0;
        ccgVar.setVisibility(0);
        this.c1.setAlpha(255);
        z9d1 z9d1Var = new z9d1(this);
        this.d1 = z9d1Var;
        z9d1Var.setDuration(this.P0);
        y9d1 y9d1Var = this.k1;
        if (y9d1Var != null) {
            ccgVar.a = y9d1Var;
        }
        ccgVar.clearAnimation();
        ccgVar.startAnimation(this.d1);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.i1 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.i1 = (int) (displayMetrics.density * 40.0f);
            }
            this.W0.setImageDrawable(null);
            this.c1.c(i);
            this.W0.setImageDrawable(this.c1);
        }
    }

    public void setSlingshotDistance(int i) {
        this.b1 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        ccg ccgVar = this.W0;
        ccgVar.bringToFront();
        WeakHashMap weakHashMap = b8k1.a;
        ccgVar.offsetTopAndBottom(i);
        this.Q0 = ccgVar.getTop();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.h.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.h.i(0);
    }

    public void setOnChildScrollUpCallback(dad1 dad1Var) {
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }
}
