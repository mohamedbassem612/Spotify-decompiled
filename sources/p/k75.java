package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class k75 extends ViewGroup implements s6o0, wvj, txq0, k1q0 {
    public static final z9 d1 = new z9((byte) 19);
    public iu30 N0;
    public iac0 O0;
    public qe41 P0;
    public final int[] Q0;
    public long R0;
    public hsl1 S0;
    public iu30 T0;
    public final h75 U0;
    public final h75 V0;
    public iu30 W0;
    public final int[] X0;
    public int Y0;
    public int Z0;
    public final g6o0 a;
    public final f3a a1;
    public final View b;
    public boolean b1;
    public final oxq0 c;
    public final hmb0 c1;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public qim0 h;
    public iu30 i;
    public wat t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public k75(Context context, v340 v340Var, int i, g6o0 g6o0Var, View view, oxq0 oxq0Var) throws KotlinNothingValueException {
        super(context);
        this.a = g6o0Var;
        this.b = view;
        this.c = oxq0Var;
        nen0 nen0Var = gtl1.a;
        setTag(2131427576, v340Var);
        setSaveFromParentEnabled(false);
        addView(view);
        g75 g75Var = new g75(this);
        WeakHashMap weakHashMap = b8k1.a;
        mrl1.e(this, g75Var);
        r7k1.c(this, this);
        this.d = new xh3((byte) 4);
        this.f = new xh3((byte) 5);
        this.g = new xh3((byte) 6);
        nim0 nim0Var = nim0.a;
        this.h = nim0Var;
        this.t = j2h1.c(1.0f);
        this.Q0 = new int[2];
        this.R0 = 0L;
        this.U0 = new h75(this, (byte) 0);
        this.V0 = new h75(this, (byte) 1);
        this.X0 = new int[2];
        this.Y0 = Integer.MIN_VALUE;
        this.Z0 = Integer.MIN_VALUE;
        this.a1 = new f3a(false);
        hmb0 hmb0Var = new hmb0(3);
        hmb0Var.P0 = this;
        qim0 qim0VarThen = ern1.x(exd0.q(b9p1.r(s161.b(bmq0.L(nim0Var, m87.a, g6o0Var), true, new z9((byte) 18)), this), new pg(this, hmb0Var, this, (byte) 2)), new e75(this, hmb0Var, (byte) 0)).then(new e5c(new f75(this, (byte) 0)));
        hmb0Var.e0(this.h.then(qim0VarThen));
        this.i = new b6(hmb0Var, qim0VarThen, (byte) 5);
        hmb0Var.a0(this.t);
        this.N0 = new j6(hmb0Var, (byte) 9);
        hmb0Var.l1 = new e75(this, hmb0Var, (byte) 1);
        hmb0Var.m1 = new f75(this, (byte) 1);
        hmb0Var.d0(new i75(this, hmb0Var));
        this.c1 = hmb0Var;
    }

    public static nk80 f(nk80 nk80Var, int i, int i2, int i3, int i4) {
        int i5 = nk80Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = nk80Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = nk80Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = nk80Var.d - i4;
        return nk80.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    private final uxq0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            qf80.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ha4) this.c).getSnapshotObserver();
    }

    public static int i(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(yoi1.p(i3, i, i2), 1073741824);
        }
        if (i3 != -2 || i2 == Integer.MAX_VALUE) {
            return (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static final void m(k75 k75Var) {
        if (k75Var.e && k75Var.isAttachedToWindow() && k75Var.b.getParent() == k75Var) {
            uxq0 snapshotObserver = k75Var.getSnapshotObserver();
            snapshotObserver.a.d(k75Var, d1, k75Var.d);
        }
    }

    @Override // p.txq0
    public final boolean B0() {
        return isAttachedToWindow();
    }

    @Override // p.wvj
    public final void a() {
        this.g.invoke();
    }

    @Override // p.wvj
    public final void b() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // p.wvj
    public final void c() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // p.r6o0
    public final void d(View view, View view2, int i, int i2) {
        this.a1.j(i, i2);
    }

    @Override // p.r6o0
    public final void e(View view, int i) {
        this.a1.l(i);
    }

    @Override // p.r6o0
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            float fM = m87.m(i);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(m87.m(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM)) << 32);
            int iO = m87.o(i3);
            l6o0 l6o0Var = this.a.a;
            l6o0 l6o0Var2 = null;
            if (l6o0Var != null && l6o0Var.N0) {
                l6o0Var2 = (l6o0) don1.r(l6o0Var);
            }
            long jM = l6o0Var2 != null ? l6o0Var2.M(iO, jFloatToRawIntBits) : 0L;
            iArr[0] = k1o1.e(Float.intBitsToFloat((int) (jM >> 32)));
            iArr[1] = k1o1.e(Float.intBitsToFloat((int) (jM & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.X0;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final wat getDensity() {
        return this.t;
    }

    public final View getInteropView() {
        return this.b;
    }

    public final hmb0 getLayoutNode() {
        return this.c1;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final iac0 getLifecycleOwner() {
        return this.O0;
    }

    public final qim0 getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.a1.d();
    }

    public final iu30 getOnDensityChanged$ui() {
        return this.N0;
    }

    public final iu30 getOnModifierChanged$ui() {
        return this.i;
    }

    public final iu30 getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.W0;
    }

    public final Function0 getRelease() {
        return this.g;
    }

    public final Function0 getReset() {
        return this.f;
    }

    public final qe41 getSavedStateRegistryOwner() {
        return this.P0;
    }

    public final Function0 getUpdate() {
        return this.d;
    }

    public final View getView() {
        return this.b;
    }

    public final hsl1 h(hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        nk80 nk80VarI = esl1Var.i(-1);
        nk80 nk80Var = nk80.e;
        if (!nk80VarI.equals(nk80Var) || !esl1Var.j(-9).equals(nk80Var) || esl1Var.h() != null) {
            sh80 sh80Var = (sh80) this.c1.e1.d;
            if (sh80Var.E1.N0) {
                long jC0 = dm5.c0(nho1.B(sh80Var));
                int i = (int) (jC0 >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (jC0 & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long jB = nho1.v(sh80Var).b();
                int i3 = (int) (jB >> 32);
                int i4 = (int) (jB & 4294967295L);
                long j = sh80Var.c;
                long jC1 = dm5.c0(sh80Var.O((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i5 = i3 - ((int) (jC1 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & jC1));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return hsl1Var.a.r(i, i2, i5, i7);
                }
            }
        }
        return hsl1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) throws KotlinNothingValueException {
        super.invalidateChildInParent(iArr, rect);
        if (!this.b1) {
            this.c1.D();
            return null;
        }
        this.b.postOnAnimation(new t94(this.V0, (byte) 3));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    @Override // p.s6o0
    public final void j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            float fM = m87.m(i);
            float fM2 = m87.m(i2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM2)) & 4294967295L);
            float fM3 = m87.m(i3);
            float fM4 = m87.m(i4);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM3)) << 32) | (((long) Float.floatToRawIntBits(fM4)) & 4294967295L);
            long jB = this.a.b(m87.o(i5), jFloatToRawIntBits, jFloatToRawIntBits2);
            iArr[0] = k1o1.e(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = k1o1.e(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // p.r6o0
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            float fM = m87.m(i);
            float fM2 = m87.m(i2);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM2)) & 4294967295L);
            float fM3 = m87.m(i3);
            float fM4 = m87.m(i4);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM3)) << 32) | (((long) Float.floatToRawIntBits(fM4)) & 4294967295L);
            this.a.b(m87.o(i5), jFloatToRawIntBits, jFloatToRawIntBits2);
        }
    }

    @Override // p.r6o0
    public final boolean l(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U0.invoke();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) throws KotlinNothingValueException {
        super.onDescendantInvalidated(view, view2);
        if (!this.b1) {
            this.c1.D();
        } else {
            this.b.postOnAnimation(new t94(this.V0, (byte) 3));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.Y0 = i;
        this.Z0 = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        c921.y(this.a.d(), (o8n) null, 0, new j75(z, this, j2h1.g(m87.n(f), m87.n(f2)), (lnm) null, (byte) 0), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        c921.y(this.a.d(), (o8n) null, 0, new kv2(this, j2h1.g(m87.n(f), m87.n(f2)), (lnm) null, (byte) 1), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        iu30 iu30Var = this.T0;
        if (iu30Var == null) {
            return true;
        }
        iu30Var.invoke(rect != null ? l0p1.w(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        iu30 iu30Var = this.W0;
        if (iu30Var != null) {
            iu30Var.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(wat watVar) {
        if (watVar != this.t) {
            this.t = watVar;
            iu30 iu30Var = this.N0;
            if (iu30Var != null) {
                iu30Var.invoke(watVar);
            }
        }
    }

    public final void setLifecycleOwner(iac0 iac0Var) {
        if (iac0Var != this.O0) {
            this.O0 = iac0Var;
            x9p1.p(this, iac0Var);
        }
    }

    public final void setModifier(qim0 qim0Var) {
        if (qim0Var != this.h) {
            this.h = qim0Var;
            iu30 iu30Var = this.i;
            if (iu30Var != null) {
                iu30Var.invoke(qim0Var);
            }
        }
    }

    public final void setOnDensityChanged$ui(iu30 iu30Var) {
        this.N0 = iu30Var;
    }

    public final void setOnModifierChanged$ui(iu30 iu30Var) {
        this.i = iu30Var;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(iu30 iu30Var) {
        this.W0 = iu30Var;
    }

    public final void setRelease(Function0 function0) {
        this.g = function0;
    }

    public final void setReset(Function0 function0) {
        this.f = function0;
    }

    public final void setSavedStateRegistryOwner(qe41 qe41Var) {
        if (qe41Var != this.P0) {
            this.P0 = qe41Var;
            hm5.J(this, qe41Var);
        }
    }

    public final void setUpdate(Function0 function0) {
        this.d = function0;
        this.e = true;
        this.U0.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // p.k1q0
    public final hsl1 x(View view, hsl1 hsl1Var) {
        this.S0 = new hsl1(hsl1Var);
        return h(hsl1Var);
    }
}
