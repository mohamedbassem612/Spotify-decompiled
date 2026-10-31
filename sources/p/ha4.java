package p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.text.intl.LocaleList;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ha4 extends ViewGroup implements oxq0, sn31, lch0, o5s, lrq0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, wy20 {
    public static Class j2;
    public static Method k2;
    public static Method l2;
    public static final wdn0 m2;
    public static k n2;
    public static Method o2;
    public static Method p2;
    public long A1;
    public boolean B1;
    public long C1;
    public iu30 D1;
    public b9e1 E1;
    public z8e1 F1;
    public final AtomicReference G1;
    public b6t H1;
    public final ven0 I1;
    public final hrr0 J1;
    public sj80 K1;
    public final rim0 L1;
    public p45 M1;
    public final hrr0 N0;
    public MotionEvent N1;
    public final View O0;
    public long O1;
    public final dz20 P0;
    public final ilh1 P1;
    public o8n Q0;
    public final wdn0 Q1;
    public final xd4 R0;
    public float R1;
    public final hrr0 S0;
    public float S1;
    public final mdt T0;
    public float T1;
    public final qk80 U0;
    public float U1;
    public final hmb0 V0;
    public final s10 V1;
    public final fdn0 W0;
    public final v94 W1;
    public final q511 X0;
    public boolean X1;
    public final y161 Y0;
    public vu30 Y1;
    public final pa4 Z0;
    public final b2c Z1;
    public final hrr0 a;
    public ob4 a1;
    public final s94 a2;
    public long b;
    public final ok4 b1;
    public final s94 b2;
    public final boolean c;
    public final h69 c1;
    public boolean c2;
    public na80 d;
    public final wdn0 d1;
    public boolean d2;
    public vac0 e;
    public wdn0 e1;
    public boolean e2;
    public wac0 f;
    public boolean f1;
    public final rcl f2;
    public sku g;
    public boolean g1;
    public View g2;
    public i931 h;
    public final tmm0 h1;
    public final ea4 h2;
    public final n36 i;
    public final fdc i1;
    public int i2;
    public final hrr0 j1;
    public final mdt k1;
    public final l74 l1;
    public final m74 m1;
    public boolean n1;
    public final uxq0 o1;
    public boolean p1;
    public q75 q1;
    public hjl r1;
    public boolean s1;
    public final v94 t;
    public final q420 t1;
    public long u1;
    public final int[] v1;
    public final float[] w1;
    public final Matrix x1;
    public final float[] y1;
    public final float[] z1;

    static {
        new l9x0((byte) 28);
        m2 = new wdn0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public ha4(Context context, qzj qzjVar) throws KotlinNothingValueException {
        ha4 ha4Var;
        m74 m74Var;
        flb0 flb0Var;
        super(context);
        this.a = xto.t(qzjVar);
        this.b = 9205357640488583168L;
        this.c = true;
        this.h = y580.d1;
        this.i = new n36();
        this.t = new v94(this, (byte) 0);
        this.N0 = xto.s(z1a1.b(context), c4x0.f);
        this.P0 = new dz20(this, this);
        this.Q0 = qzjVar.c().k();
        this.R0 = new xd4();
        this.S0 = xto.t(Boolean.FALSE);
        this.T0 = xto.l(new s94(this, (byte) 1));
        this.U0 = new qk80();
        byte b = 3;
        hmb0 hmb0Var = new hmb0(3);
        hmb0Var.d0(vn31.c);
        hmb0Var.a0(getDensity());
        hmb0Var.f0(getViewConfiguration());
        hmb0Var.e0(new fa4(this).then(((dz20) getFocusOwner()).e).then(getDragAndDropManager().c));
        this.V0 = hmb0Var;
        fdn0 fdn0Var = pr80.a;
        this.W0 = new fdn0();
        this.X0 = new q511(m31getLayoutNodes(), this);
        this.Y0 = new y161(getRoot(), new u7x(), m31getLayoutNodes());
        pa4 pa4Var = new pa4(this);
        this.Z0 = pa4Var;
        this.a1 = new ob4(this, new q01(this));
        this.b1 = sgc1.f(this);
        this.c1 = new h69();
        this.d1 = new wdn0();
        this.h1 = new tmm0();
        this.i1 = new fdc(getRoot());
        this.j1 = xto.t(new Configuration(context.getResources().getConfiguration()));
        this.k1 = xto.l(new s94(this, (byte) 2));
        this.l1 = c() ? new l74(this, getAutofillTree()) : null;
        if (c()) {
            ha4Var = this;
            m74Var = new m74(new pct0(context), getSemanticsOwner(), ha4Var, getRectManager(), context.getPackageName());
        } else {
            ha4Var = this;
            m74Var = null;
        }
        ha4Var.m1 = m74Var;
        ha4Var.o1 = new uxq0(new w94(ha4Var, (byte) 0));
        ha4Var.t1 = new q420(ha4Var.getRoot());
        ha4Var.u1 = 9223372034707292159L;
        ha4Var.v1 = new int[]{0, 0};
        ha4Var.w1 = kch0.a();
        ha4Var.x1 = new Matrix();
        ha4Var.y1 = kch0.a();
        ha4Var.z1 = kch0.a();
        ha4Var.A1 = -1L;
        ha4Var.C1 = 9187343241974906880L;
        ha4Var.G1 = wpo1.k();
        ha4Var.I1 = qzjVar.f104p;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = uy20.a;
        flb0 flb0Var2 = flb0.a;
        if (layoutDirection != 0) {
            flb0Var = layoutDirection != 1 ? null : flb0.b;
        } else {
            flb0Var = flb0Var2;
        }
        ha4Var.J1 = xto.t(flb0Var != null ? flb0Var : flb0Var2);
        ha4Var.L1 = new rim0(ha4Var);
        ha4Var.P1 = new ilh1();
        ha4Var.Q1 = new wdn0();
        ha4Var.R1 = Float.NaN;
        ha4Var.S1 = Float.NaN;
        ha4Var.T1 = Float.NaN;
        ha4Var.U1 = Float.NaN;
        ha4Var.V1 = new s10(ha4Var, (byte) 4);
        ha4Var.W1 = new v94(ha4Var, (byte) 1);
        ha4Var.Y1 = new x94(ha4Var, (byte) 0);
        ha4Var.Z1 = new b2c(context, new w94(ha4Var, (byte) 1));
        ha4Var.a2 = new s94(ha4Var, b);
        ha4Var.b2 = new s94(ha4Var, (byte) 4);
        ha4Var.addOnAttachStateChangeListener(ha4Var.a1);
        ha4Var.setWillNotDraw(false);
        ha4Var.setFocusable(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            wa4.a.a(ha4Var, 1, false);
        }
        ha4Var.setFocusableInTouchMode(true);
        ha4Var.setClipChildren(false);
        b8k1.p(ha4Var, pa4Var);
        ha4Var.setOnDragListener(ha4Var.getDragAndDropManager());
        if (i >= 29) {
            ra4.a.a(ha4Var);
        }
        if (m()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(2131429119, Boolean.TRUE);
            ha4Var.O0 = view;
            ha4Var.addView(view, -1);
        }
        ha4Var.f2 = i >= 31 ? new rcl((byte) 4) : null;
        ha4Var.h2 = new ea4(ha4Var);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void d(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ha4) {
                ((ha4) childAt).w();
            } else if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt);
            }
        }
    }

    public static long e(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        bhn0.w();
        return 0L;
    }

    public static final boolean g(ha4 ha4Var, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private final ljd getCanvasHolder() {
        return getComposeViewContext().u;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    private final b9e1 getLegacyTextInputServiceAndroid() {
        b9e1 b9e1Var = this.E1;
        if (b9e1Var != null) {
            return b9e1Var;
        }
        b9e1 b9e1Var2 = new b9e1(getView(), this, new r94(this));
        this.E1 = b9e1Var2;
        return b9e1Var2;
    }

    private final qzj get_composeViewContext() {
        return (qzj) this.a.getValue();
    }

    public static final boolean j(MotionEvent motionEvent, ha4 ha4Var) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public static void k(hmb0 hmb0Var) {
        hmb0Var.E();
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            k((hmb0) objArr[i2]);
        }
    }

    public static boolean m() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static boolean n(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !umm0.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.S0.setValue(Boolean.valueOf(z));
    }

    private void setDensity(wat watVar) {
        this.N0.setValue(watVar);
    }

    private void setLayoutDirection(flb0 flb0Var) {
        this.J1.setValue(flb0Var);
    }

    private final void set_composeViewContext(qzj qzjVar) {
        this.a.setValue(qzjVar);
    }

    public final void A() {
        pa4 pa4Var = this.Z0;
        pa4Var.U0 = true;
        Handler handler = pa4Var.a.getHandler();
        if (pa4Var.m() && !pa4Var.f1 && handler != null) {
            pa4Var.f1 = true;
            handler.post(pa4Var.h1);
        }
        ob4 ob4Var = this.a1;
        ob4Var.f = true;
        Handler handler2 = ob4Var.a.getHandler();
        if (!ob4Var.d() || ob4Var.Y || handler2 == null) {
            return;
        }
        ob4Var.Y = true;
        handler2.post(ob4Var.Z);
    }

    public final void B(ViewStructure viewStructure) {
        m74 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            hmb0 hmb0Var = autofillManager.b.a;
            AutofillId autofillId = autofillManager.g;
            String str = autofillManager.e;
            q511 q511Var = autofillManager.d;
            fap1.m(viewStructure, hmb0Var, autofillId, str, q511Var);
            Object[] objArr = lfp0.a;
            wdn0 wdn0Var = new wdn0(2);
            wdn0Var.b(hmb0Var);
            wdn0Var.b(viewStructure);
            while (wdn0Var.j()) {
                ViewStructure viewStructure2 = (ViewStructure) wdn0Var.l(wdn0Var.b - 1);
                afn0 afn0VarO = ((hmb0) wdn0Var.l(wdn0Var.b - 1)).o();
                int size = afn0VarO.size();
                for (int i = 0; i < size; i++) {
                    hmb0 hmb0Var2 = (hmb0) afn0VarO.get(i);
                    if (!hmb0Var2.p1 && hmb0Var2.I() && hmb0Var2.J()) {
                        o161 o161VarX = hmb0Var2.x();
                        if (o161VarX == null || !i541.l(o161VarX)) {
                            wdn0Var.b(hmb0Var2);
                            wdn0Var.b(viewStructure2);
                        } else {
                            ViewStructure viewStructureB = no80.B(viewStructure2, no80.k(viewStructure2));
                            fap1.m(viewStructureB, hmb0Var2, autofillManager.g, str, q511Var);
                            wdn0Var.b(hmb0Var2);
                            wdn0Var.b(viewStructureB);
                        }
                    }
                }
            }
        }
        l74 l74VarM27getAutofill = m27getAutofill();
        if (l74VarM27getAutofill != null) {
            kw7.D(l74VarM27getAutofill, viewStructure);
        }
    }

    public final void C() {
        if (this.B1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.A1) {
            this.A1 = jCurrentAnimationTimeMillis;
            E();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.v1;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.C1 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    public final void D(MotionEvent motionEvent) {
        this.A1 = AnimationUtils.currentAnimationTimeMillis();
        E();
        float x = motionEvent.getX();
        long jB = kch0.b((((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (Float.floatToRawIntBits(x) << 32), this.y1);
        this.C1 = (((long) Float.floatToRawIntBits(motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32)))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L);
    }

    public final void E() {
        int i = Build.VERSION.SDK_INT;
        float[] fArr = this.y1;
        int[] iArr = this.v1;
        if (i >= 29) {
            rwc.a.a(this, fArr, this.x1, iArr);
        } else {
            jon1.g(this, fArr, this.w1, iArr);
        }
        apo.o(fArr, this.z1);
    }

    public final boolean F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void G(Function0 function0) {
        n36 n36Var = this.i;
        boolean zIsEmpty = n36Var.isEmpty();
        n36Var.addLast(function0);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.t);
            } else {
                hhg1.n("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    public final void H(hmb0 hmb0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (hmb0Var != null) {
            while (hmb0Var != null && hmb0Var.s() == 1) {
                if (!this.s1) {
                    hmb0 hmb0VarV = hmb0Var.v();
                    if (hmb0VarV == null) {
                        break;
                    }
                    long j = ((sh80) hmb0VarV.e1.d).d;
                    if (hjl.g(j) && hjl.f(j)) {
                        break;
                    }
                }
                hmb0Var = hmb0Var.v();
            }
            if (hmb0Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long I(long j) {
        C();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.C1 >> 32));
        return kch0.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.C1 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.z1);
    }

    public final int J(MotionEvent motionEvent) {
        Object obj;
        if (this.c2) {
            this.c2 = false;
            uvb0 uvb0Var = getComposeViewContext().t;
            int metaState = motionEvent.getMetaState();
            hrr0 hrr0Var = drl1.a;
            bwp0.k().setValue(qav0.a(metaState));
        }
        tmm0 tmm0Var = this.h1;
        yqu0 yqu0VarC = tmm0Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        fdc fdcVar = this.i1;
        if (yqu0VarC == null) {
            fdcVar.f0();
            return x8p1.i(false, false, false);
        }
        List listF = yqu0VarC.f();
        int size = listF.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = ((ArrayList) listF).get(size);
            if (((jav0) obj).a() && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        jav0 jav0Var = (jav0) obj;
        if (jav0Var != null) {
            this.b = jav0Var.b();
        }
        int iE0 = fdcVar.e0(yqu0VarC, this, o(motionEvent));
        yqu0VarC.l();
        if ((actionMasked != 0 && actionMasked != 5) || (iE0 & 1) != 0) {
            return iE0;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        tmm0Var.c.delete(pointerId);
        tmm0Var.b.delete(pointerId);
        return iE0;
    }

    public final void K(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || actionIndex > i4) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jS = s((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jS >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jS & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        yqu0 yqu0VarC = this.h1.c(motionEventObtain, this);
        yqu0VarC.getClass();
        this.i1.e0(yqu0VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void L(vu30 vu30Var, onm onmVar) throws KotlinNothingValueException {
        ga4 ga4Var;
        if (onmVar instanceof ga4) {
            ga4Var = (ga4) onmVar;
            int i = ga4Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ga4Var.c = i - Integer.MIN_VALUE;
            } else {
                ga4Var = new ga4(this, onmVar);
            }
        } else {
            ga4Var = new ga4(this, onmVar);
        }
        Object obj = ga4Var.a;
        int i2 = ga4Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            u94 u94Var = new u94(this, (byte) 0);
            ga4Var.c = 1;
            if (wpo1.z(this.G1, u94Var, vu30Var, ga4Var) == d9n.a) {
                return;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    public final void M(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (u890.j(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(z1a1.b(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public final void N() {
        boolean z;
        int[] iArr = this.v1;
        getLocationOnScreen(iArr);
        long j = this.u1;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        int i3 = iArr[0];
        if (i == i3 && i2 == iArr[1] && this.A1 >= 0) {
            z = false;
        } else {
            this.u1 = (4294967295L & ((long) iArr[1])) | (((long) i3) << 32);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                z = false;
            } else {
                bfn0 bfn0VarA = getRoot().A();
                Object[] objArr = bfn0VarA.a;
                int i4 = bfn0VarA.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((hmb0) objArr[i5]).f1.f68p.A0();
                }
                z = true;
            }
        }
        C();
        View rootView = this.g2;
        if (rootView == null) {
            rootView = getRootView();
            this.g2 = rootView;
        }
        q511 rectManager = getRectManager();
        long j3 = this.u1;
        long jC0 = dm5.c0(this.C1);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.y1;
        int iN = m0p1.n(fArr);
        che1 che1Var = rectManager.d;
        if ((iN & 2) != 0) {
            fArr = null;
        }
        rectManager.g = che1Var.c(j3, jC0, fArr, width, height) || rectManager.g;
        this.t1.b(z);
        getRectManager().a();
    }

    public final void O(float f) {
        if (m()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.R1) || f > this.R1) {
                    this.R1 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.S1) || f < this.S1) {
                    this.S1 = f;
                }
            }
        }
    }

    @Override // p.wy20
    public final void a(d030 d030Var, d030 d030Var2) {
        jdo0 jdo0Var;
        boolean z;
        jdo0 jdo0Var2;
        boolean z2;
        if (d030Var != null) {
            d030 d030Var3 = d030Var;
            if (!d030Var3.a.N0) {
                qf80.c("visitAncestors called on an unattached node");
            }
            pim0 pim0Var = d030Var3.a;
            hmb0 hmb0VarB = oap1.B(d030Var);
            oen0 oen0Var = null;
            ArrayList arrayList = null;
            while (hmb0VarB != null) {
                if ((((pim0) hmb0VarB.e1.g).d & 2097152) != 0) {
                    while (pim0Var != null) {
                        if ((pim0Var.c & 2097152) != 0) {
                            pim0 pim0VarE = pim0Var;
                            bfn0 bfn0Var = null;
                            while (pim0VarE != null) {
                                if (pim0VarE instanceof va80) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(pim0VarE);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (pim0VarE.c & 2097152) != 0 && (pim0VarE instanceof l5t)) {
                                    int i = 0;
                                    for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                        if ((pim0Var2.c & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                pim0VarE = pim0Var2;
                                            } else {
                                                if (bfn0Var == null) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarE != null) {
                                                    bfn0Var.b(pim0VarE);
                                                    pim0VarE = null;
                                                }
                                                bfn0Var.b(pim0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                pim0VarE = oap1.e(bfn0Var);
                            }
                        }
                        pim0Var = pim0Var.e;
                    }
                }
                hmb0VarB = hmb0VarB.v();
                pim0Var = (hmb0VarB == null || (jdo0Var2 = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (d030Var2 != null) {
                if (!d030Var2.a.N0) {
                    qf80.c("visitAncestors called on an unattached node");
                }
                pim0 pim0Var3 = d030Var2.a;
                hmb0 hmb0VarB2 = oap1.B(d030Var2);
                oen0 oen0Var2 = null;
                while (hmb0VarB2 != null) {
                    if ((((pim0) hmb0VarB2.e1.g).d & 2097152) != 0) {
                        while (pim0Var3 != null) {
                            if ((pim0Var3.c & 2097152) != 0) {
                                pim0 pim0VarE2 = pim0Var3;
                                bfn0 bfn0Var2 = null;
                                while (pim0VarE2 != null) {
                                    if (pim0VarE2 instanceof va80) {
                                        if (oen0Var2 == null) {
                                            oen0 oen0Var3 = ij41.a;
                                            oen0Var2 = new oen0();
                                        }
                                        oen0Var2.a(pim0VarE2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (pim0VarE2.c & 2097152) != 0 && (pim0VarE2 instanceof l5t)) {
                                        int i2 = 0;
                                        for (pim0 pim0Var4 = ((l5t) pim0VarE2).P0; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
                                            if ((pim0Var4.c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    pim0VarE2 = pim0Var4;
                                                } else {
                                                    if (bfn0Var2 == null) {
                                                        bfn0Var2 = new bfn0(0, new pim0[16]);
                                                    }
                                                    if (pim0VarE2 != null) {
                                                        bfn0Var2.b(pim0VarE2);
                                                        pim0VarE2 = null;
                                                    }
                                                    bfn0Var2.b(pim0Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    pim0VarE2 = oap1.e(bfn0Var2);
                                }
                            }
                            pim0Var3 = pim0Var3.e;
                        }
                    }
                    hmb0VarB2 = hmb0VarB2.v();
                    pim0Var3 = (hmb0VarB2 == null || (jdo0Var = hmb0VarB2.e1) == null) ? null : (gpd1) jdo0Var.f;
                }
                oen0Var = oen0Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                va80 va80Var = (va80) arrayList.get(i3);
                if (!(oen0Var != null ? oen0Var.c(va80Var) : false)) {
                    va80Var.Z0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        d030 d030Var = ((dz20) getFocusOwner()).c;
        if (!d030Var.N0) {
            return;
        }
        if (!d030Var.a.N0) {
            qf80.c("visitSubtreeIf called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var = d030Var.a;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 == null) {
            oap1.d(bfn0Var, pim0Var);
        } else {
            bfn0Var.b(pim0Var2);
        }
        while (true) {
            int i3 = bfn0Var.c;
            if (i3 == 0) {
                return;
            }
            pim0 pim0Var3 = (pim0) bfn0Var.l(i3 - 1);
            if ((pim0Var3.d & 1024) != 0) {
                for (pim0 pim0Var4 = pim0Var3; pim0Var4 != null && pim0Var4.N0; pim0Var4 = pim0Var4.f) {
                    if ((pim0Var4.c & 1024) != 0) {
                        pim0 pim0VarE = pim0Var4;
                        bfn0 bfn0Var2 = null;
                        while (pim0VarE != null) {
                            if (pim0VarE instanceof d030) {
                                d030 d030Var2 = (d030) pim0VarE;
                                if (d030Var2.N0 && d030Var2.J1().e()) {
                                    super.addFocusables(arrayList, i, i2);
                                    d030 d030Var3 = ((dz20) getFocusOwner()).c;
                                    if (d030Var3.N0) {
                                        if (!d030Var3.a.N0) {
                                            qf80.c("visitSubtreeIf called on an unattached node");
                                        }
                                        bfn0 bfn0Var3 = new bfn0(0, new pim0[16]);
                                        pim0 pim0Var5 = d030Var3.a;
                                        pim0 pim0Var6 = pim0Var5.f;
                                        if (pim0Var6 == null) {
                                            oap1.d(bfn0Var3, pim0Var5);
                                        } else {
                                            bfn0Var3.b(pim0Var6);
                                        }
                                        while (true) {
                                            int i4 = bfn0Var3.c;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            pim0 pim0Var7 = (pim0) bfn0Var3.l(i4 - 1);
                                            if ((pim0Var7.d & 1024) != 0) {
                                                for (pim0 pim0Var8 = pim0Var7; pim0Var8 != null && pim0Var8.N0; pim0Var8 = pim0Var8.f) {
                                                    if ((pim0Var8.c & 1024) != 0) {
                                                        pim0 pim0VarE2 = pim0Var8;
                                                        bfn0 bfn0Var4 = null;
                                                        while (pim0VarE2 != null) {
                                                            if (pim0VarE2 instanceof d030) {
                                                                d030 d030Var4 = (d030) pim0VarE2;
                                                                if (d030Var4.N0) {
                                                                    gz20 gz20VarJ1 = d030Var4.J1();
                                                                    if (d030Var4.N0 && !d030Var4.O0 && gz20VarJ1.e()) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((pim0VarE2.c & 1024) != 0 && (pim0VarE2 instanceof l5t)) {
                                                                int i5 = 0;
                                                                for (pim0 pim0Var9 = ((l5t) pim0VarE2).P0; pim0Var9 != null; pim0Var9 = pim0Var9.f) {
                                                                    if ((pim0Var9.c & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            pim0VarE2 = pim0Var9;
                                                                        } else {
                                                                            if (bfn0Var4 == null) {
                                                                                bfn0Var4 = new bfn0(0, new pim0[16]);
                                                                            }
                                                                            if (pim0VarE2 != null) {
                                                                                bfn0Var4.b(pim0VarE2);
                                                                                pim0VarE2 = null;
                                                                            }
                                                                            bfn0Var4.b(pim0Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            pim0VarE2 = oap1.e(bfn0Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            oap1.d(bfn0Var3, pim0Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((pim0VarE.c & 1024) != 0 && (pim0VarE instanceof l5t)) {
                                int i6 = 0;
                                for (pim0 pim0Var10 = ((l5t) pim0VarE).P0; pim0Var10 != null; pim0Var10 = pim0Var10.f) {
                                    if ((pim0Var10.c & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            pim0VarE = pim0Var10;
                                        } else {
                                            if (bfn0Var2 == null) {
                                                bfn0Var2 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarE != null) {
                                                bfn0Var2.b(pim0VarE);
                                                pim0VarE = null;
                                            }
                                            bfn0Var2.b(pim0Var10);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            pim0VarE = oap1.e(bfn0Var2);
                        }
                    }
                }
            }
            oap1.d(bfn0Var, pim0Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (c()) {
            m74 autofillManager = getAutofillManager();
            if (autofillManager != null) {
                autofillManager.b(sparseArray);
            }
            l74 l74VarM27getAutofill = m27getAutofill();
            if (l74VarM27getAutofill != null) {
                kw7.C(l74VarM27getAutofill, sparseArray);
            }
        }
    }

    public final void b(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        pa4 pa4Var = this.Z0;
        if (u890.j(str, pa4Var.a1)) {
            int iD2 = pa4Var.Y0.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!u890.j(str, pa4Var.b1) || (iD = pa4Var.Z0.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.Z0.d(this.b, false, i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.Z0.d(this.b, true, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        wdn0 wdn0Var = this.d1;
        if (!isAttachedToWindow()) {
            k(getRoot());
        }
        t(true);
        ekb.v();
        this.f1 = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            ljd canvasHolder = getCanvasHolder();
            u84 u84Var = canvasHolder.a;
            Canvas canvas2 = u84Var.a;
            u84Var.a = canvas;
            getRoot().j(u84Var, null);
            canvasHolder.a.a = canvas2;
            if (wdn0Var.j()) {
                int i = wdn0Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((ge50) ((mxq0) wdn0Var.g(i2))).g();
                }
            }
            int i3 = rbk1.a;
            b9p1.p();
            wdn0Var.e();
            this.f1 = false;
            Trace.endSection();
            wdn0 wdn0Var2 = this.e1;
            if (wdn0Var2 != null) {
                wdn0Var.d(wdn0Var2);
                wdn0Var2.e();
            }
            if (m()) {
                if (Float.compare(this.R1, this.T1) != 0) {
                    float f = this.R1;
                    this.T1 = f;
                    ci5.a(this, f);
                }
                View view = this.O0;
                if (view != null) {
                    if (Float.compare(this.S1, this.U1) != 0) {
                        float f2 = this.S1;
                        this.U1 = f2;
                        ci5.a(view, f2);
                    }
                    if (!Float.isNaN(this.S1)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.R1 = Float.NaN;
                this.S1 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v49 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v49 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v51 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v38 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v6 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v8 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r38) {
        /*
            Method dump skipped, instruction units count: 1733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ha4.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0154, code lost:
    
        if (p(r24) == false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ha4.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((dz20) getFocusOwner()).f(keyEvent, new og(this, keyEvent, (byte) 1));
        }
        uvb0 uvb0Var = getComposeViewContext().t;
        int metaState = keyEvent.getMetaState();
        hrr0 hrr0Var = drl1.a;
        bwp0.k().setValue(qav0.a(metaState));
        return ((dz20) getFocusOwner()).f(keyEvent, new xh3((byte) 27)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        jdo0 jdo0Var;
        if (isFocused()) {
            dz20 dz20Var = (dz20) getFocusOwner();
            if (dz20Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                d030 d030VarK = dm5.K(dz20Var.c);
                if (d030VarK != null) {
                    if (!d030VarK.a.N0) {
                        qf80.c("visitAncestors called on an unattached node");
                    }
                    pim0 pim0Var = d030VarK.a;
                    hmb0 hmb0VarB = oap1.B(d030VarK);
                    while (hmb0VarB != null) {
                        if ((((pim0) hmb0VarB.e1.g).d & 131072) != 0) {
                            while (pim0Var != null) {
                                if ((pim0Var.c & 131072) != 0) {
                                    pim0 pim0VarE = pim0Var;
                                    bfn0 bfn0Var = null;
                                    while (pim0VarE != null) {
                                        if ((pim0VarE.c & 131072) != 0 && (pim0VarE instanceof l5t)) {
                                            int i = 0;
                                            for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                                if ((pim0Var2.c & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        pim0VarE = pim0Var2;
                                                    } else {
                                                        if (bfn0Var == null) {
                                                            bfn0Var = new bfn0(0, new pim0[16]);
                                                        }
                                                        if (pim0VarE != null) {
                                                            bfn0Var.b(pim0VarE);
                                                            pim0VarE = null;
                                                        }
                                                        bfn0Var.b(pim0Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        pim0VarE = oap1.e(bfn0Var);
                                    }
                                }
                                pim0Var = pim0Var.e;
                            }
                        }
                        hmb0VarB = hmb0VarB.v();
                        pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (c()) {
            this.e2 = true;
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                this.e2 = false;
                B(viewStructure);
            } catch (Throwable th) {
                this.e2 = false;
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            qa4.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object objA;
        d030 d030VarH;
        if (this.X1) {
            v94 v94Var = this.W1;
            removeCallbacks(v94Var);
            MotionEvent motionEvent2 = this.N1;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.X1 = false;
            } else {
                v94Var.run();
            }
        }
        if (!n(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || p(motionEvent))) {
            int i = i(motionEvent);
            if ((i & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (objA = view.getTag(2131427650)) == null) {
                    objA = zr8.a(1);
                }
                if (objA.equals(zr8.a(1)) && (d030VarH = ((dz20) getFocusOwner()).h()) != null) {
                    if (!nho1.m(oap1.z(d030VarH)).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((dz20) getFocusOwner()).b(false);
                    }
                }
            }
            if ((i & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final mxq0 f(vu30 vu30Var, g24 g24Var, be50 be50Var) throws KotlinNothingValueException {
        if (be50Var != null) {
            return new ge50(be50Var, null, this, vu30Var, g24Var);
        }
        mxq0 mxq0Var = (mxq0) this.P1.l();
        if (mxq0Var == null) {
            return new ge50(getGraphicsContext().b(), getGraphicsContext(), this, vu30Var, g24Var);
        }
        ge50 ge50Var = (ge50) mxq0Var;
        yd50 yd50Var = ge50Var.b;
        if (yd50Var == null) {
            throw l1d.w("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!ge50Var.a.s) {
            qf80.a("layer should have been released before reuse");
        }
        ge50Var.a = yd50Var.b();
        ge50Var.g = false;
        ge50Var.d = vu30Var;
        ge50Var.e = g24Var;
        ge50Var.Q0 = false;
        ge50Var.R0 = false;
        ge50Var.S0 = true;
        kch0.e(ge50Var.h);
        float[] fArr = ge50Var.i;
        if (fArr != null) {
            kch0.e(fArr);
        }
        int i = ofg1.c;
        ge50Var.O0 = wpb1.v();
        ge50Var.T0 = false;
        ge50Var.f = 9223372034707292159L;
        ge50Var.P0 = null;
        ge50Var.N0 = 0;
        return mxq0Var;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        return l9x0.f(i, this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        n511 n511VarA;
        if (view == null || this.t1.b) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (viewFindNextFocus == null || !xa4.j(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            d030 d030VarK = dm5.K(((dz20) getFocusOwner()).c);
            n511VarA = d030VarK != null ? dm5.L(d030VarK) : null;
            if (n511VarA == null) {
                n511VarA = uy20.a(view, this);
            }
        } else {
            n511VarA = uy20.a(view, this);
        }
        yx20 yx20VarD = uy20.d(i);
        int iD = yx20VarD != null ? yx20VarD.d() : 6;
        p811 p811Var = new p811();
        if (((dz20) getFocusOwner()).g(iD, n511VarA, new q94(p811Var, (byte) 0)) == null) {
            return view;
        }
        if (p811Var.a == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || g6p1.o(iD) || irn1.Z(dm5.L((d030) p811Var.a), uy20.a(viewFindNextFocus, this), n511VarA, iD)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public cg getAccessibilityManager() {
        return getComposeViewContext().k;
    }

    public final q75 getAndroidViewsHandler$ui() {
        if (this.q1 == null) {
            q75 q75Var = new q75(getContext());
            this.q1 = q75Var;
            addView(q75Var, -1);
            requestLayout();
        }
        q75 q75Var2 = this.q1;
        q75Var2.getClass();
        return q75Var2;
    }

    public h69 getAutofillTree() {
        return this.c1;
    }

    public ung getClipboard() {
        return getComposeViewContext().n;
    }

    public vng getClipboardManager() {
        return getComposeViewContext().m;
    }

    public final qzj getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.d2;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.j1.getValue();
    }

    public final ob4 getContentCaptureManager$ui() {
        return this.a1;
    }

    public o8n getCoroutineContext() {
        return this.Q0;
    }

    public wat getDensity() {
        return (wat) this.N0.getValue();
    }

    public n511 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            d030 d030VarK = dm5.K(((dz20) getFocusOwner()).c);
            if (d030VarK != null) {
                return dm5.L(d030VarK);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return uy20.a(viewFindFocus, this);
        }
        return null;
    }

    public az20 getFocusOwner() {
        return this.P0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        n511 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (u890.j(((dz20) getFocusOwner()).g(6, null, new z9((byte) 8)), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public f930 getFontFamilyResolver() {
        return (f930) this.I1.getValue();
    }

    public y830 getFontLoader() {
        return getComposeViewContext().o;
    }

    public final vac0 getFrameEndScheduler$ui() {
        return this.e;
    }

    public yd50 getGraphicsContext() {
        return this.b1;
    }

    public ss50 getHapticFeedBack() {
        return getComposeViewContext().q;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return ((l6s) this.t1.e).n() || !this.i.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public sj80 getInputModeManager() {
        sj80 sj80Var = this.K1;
        if (sj80Var == null) {
            sj80Var = new sj80(isInTouchMode() ? 1 : 2);
            this.K1 = sj80Var;
        }
        return sj80Var;
    }

    public final qk80 getInsetsListener() {
        return this.U0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.A1;
    }

    @Override // android.view.View, android.view.ViewParent
    public flb0 getLayoutDirection() {
        return (flb0) this.J1.getValue();
    }

    public LocaleList getLocaleList() {
        return (LocaleList) this.k1.getValue();
    }

    public long getMeasureIteration() {
        if (this.t1.b) {
            return 1L;
        }
        qf80.a("measureIteration should be only used during the measure/layout pass");
        return 1L;
    }

    public rim0 getModifierLocalManager() {
        return this.L1;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ha4 m32getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public p5t0 getPlacementScope() {
        ia4 ia4Var = r5t0.a;
        return new ftq0(this);
    }

    public final vu30 getPlayNavigationSoundEffect$ui() {
        return this.Y1;
    }

    public gav0 getPointerIconService() {
        return this.h2;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final na80 m25getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.d;
    }

    public q511 getRectManager() {
        return this.X0;
    }

    public i931 getRetainedValuesStore() {
        return this.h;
    }

    public hmb0 getRoot() {
        return this.V0;
    }

    public final sku getSavedStateRegistry() {
        sku skuVar = this.g;
        if (skuVar != null) {
            return skuVar;
        }
        qzj composeViewContext = getComposeViewContext();
        composeViewContext.g();
        qe41 qe41Var = composeViewContext.e;
        qe41Var.getClass();
        sku skuVarD = t890.d(this, qe41Var);
        this.g = skuVarD;
        return skuVarD;
    }

    public final boolean getScrollCaptureInProgress() {
        rcl rclVar;
        if (Build.VERSION.SDK_INT >= 31 && (rclVar = this.f2) != null && rclVar.g()) {
            return true;
        }
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ha4) {
                return ((ha4) parent).getScrollCaptureInProgress();
            }
        }
        return false;
    }

    public y161 getSemanticsOwner() {
        return this.Y0;
    }

    public jmb0 getSharedDrawScope() {
        return getComposeViewContext().s;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? th5.a.a(this) : this.p1;
    }

    public uxq0 getSnapshotObserver() {
        return this.o1;
    }

    public k6a1 getSoftwareKeyboardController() {
        b6t b6tVar = this.H1;
        if (b6tVar != null) {
            return b6tVar;
        }
        b6t b6tVar2 = new b6t(getTextInputService());
        this.H1 = b6tVar2;
        return b6tVar2;
    }

    public z8e1 getTextInputService() {
        z8e1 z8e1Var = this.F1;
        if (z8e1Var != null) {
            return z8e1Var;
        }
        z8e1 z8e1Var2 = new z8e1((vdt0) xa4.a.invoke(getLegacyTextInputServiceAndroid()));
        this.F1 = z8e1Var2;
        return z8e1Var2;
    }

    public pee1 getTextToolbar() {
        p45 p45Var = this.M1;
        if (p45Var != null) {
            return p45Var;
        }
        p45 p45Var2 = new p45();
        new t2b(new hx4(p45Var2, (byte) 3), (byte) 27);
        this.M1 = p45Var2;
        return p45Var2;
    }

    public final rn31 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public e8k1 getViewConfiguration() {
        return getComposeViewContext().r;
    }

    public crl1 getWindowInfo() {
        return getComposeViewContext().t;
    }

    public final void h(hmb0 hmb0Var, boolean z) {
        this.t1.g(hmb0Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0130 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0140  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0147 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x015c A[Catch: all -> 0x0076, TRY_ENTER, TryCatch #0 {all -> 0x0076, blocks: (B:14:0x0034, B:16:0x003e, B:22:0x004e, B:38:0x007d, B:39:0x0080, B:48:0x0093, B:50:0x0099, B:115:0x015c, B:116:0x0168, B:25:0x0056, B:31:0x0062, B:34:0x006a), top: B:135:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c7 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x010b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:4:0x0018, B:6:0x0021, B:52:0x00a3, B:54:0x00a9, B:62:0x00ba, B:67:0x00c7, B:68:0x00ca, B:70:0x00ce, B:72:0x00d4, B:74:0x00d8, B:76:0x00de, B:79:0x00e6, B:82:0x00ee, B:83:0x00f9, B:85:0x00ff, B:87:0x0105, B:89:0x010b, B:91:0x0111, B:93:0x0115, B:94:0x0119, B:100:0x012c, B:102:0x0130, B:104:0x0137, B:111:0x0147, B:112:0x0151, B:113:0x0154), top: B:138:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    public final int i(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        boolean z;
        ha4 ha4Var;
        boolean z2;
        boolean z3;
        MotionEvent motionEvent2;
        int iJ;
        ha4 ha4Var2;
        MotionEvent motionEvent3;
        int pointerId;
        int action;
        tmm0 tmm0Var;
        MotionEvent motionEvent4;
        float x;
        float x2;
        boolean z4;
        MotionEvent motionEvent5;
        long eventTime;
        ha4 ha4Var3 = this;
        ha4Var3.removeCallbacks(ha4Var3.V1);
        try {
            D(motionEvent);
            boolean z5 = true;
            ha4Var3.B1 = true;
            ha4Var3.t(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent6 = ha4Var3.N1;
                boolean z6 = motionEvent6 != null && motionEvent6.getToolType(0) == 3;
                fdc fdcVar = ha4Var3.i1;
                if (motionEvent6 == null) {
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6) {
                        ha4Var = this;
                    } else {
                        ha4Var = this;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (motionEvent6 != 0) {
                        motionEvent6.recycle();
                    }
                    motionEvent2 = ha4Var.N1;
                    if (motionEvent2 != null) {
                        motionEvent3 = ha4Var.N1;
                        if (motionEvent3 != null) {
                            pointerId = motionEvent3.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        tmm0Var = ha4Var.h1;
                        if (action == 9) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent4 = ha4Var.N1;
                                if (motionEvent4 != null) {
                                    x = motionEvent4.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent7 = ha4Var.N1;
                                if (motionEvent7 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                motionEvent5 = ha4Var.N1;
                                if (motionEvent5 != null) {
                                    eventTime = motionEvent5.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime == motionEvent.getEventTime()) {
                                    z5 = false;
                                }
                                if (z4) {
                                    if (pointerId >= 0) {
                                        tmm0Var.c.delete(pointerId);
                                        tmm0Var.b.delete(pointerId);
                                    }
                                    fdcVar.J();
                                } else {
                                    if (pointerId >= 0) {
                                        tmm0Var.c.delete(pointerId);
                                        tmm0Var.b.delete(pointerId);
                                    }
                                    fdcVar.J();
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent4 = ha4Var.N1;
                            if (motionEvent4 != null) {
                                x = motionEvent4.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent8 = ha4Var.N1;
                            if (motionEvent8 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            motionEvent5 = ha4Var.N1;
                            if (motionEvent5 != null) {
                                eventTime = motionEvent5.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime == motionEvent.getEventTime()) {
                                z5 = false;
                            }
                            if (z4) {
                                if (pointerId >= 0) {
                                    tmm0Var.c.delete(pointerId);
                                    tmm0Var.b.delete(pointerId);
                                }
                                fdcVar.J();
                            } else {
                                if (pointerId >= 0) {
                                    tmm0Var.c.delete(pointerId);
                                    tmm0Var.b.delete(pointerId);
                                }
                                fdcVar.J();
                            }
                        }
                    }
                    ha4Var.N1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        ha4Var.K(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iJ = J(motionEvent);
                    Trace.endSection();
                    if ((iJ & 4) != 0) {
                        ha4Var2 = this;
                    } else {
                        fdcVar.J();
                        ha4Var2 = this;
                        ha4Var2.K(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    ha4Var2.B1 = false;
                    return iJ;
                }
                try {
                    if ((motionEvent6.getSource() == motionEvent.getSource() && motionEvent6.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent6.getButtonState() != 0 || (actionMasked = motionEvent6.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            fdcVar.f0();
                        } else if (motionEvent6.getActionMasked() != 10 && z6) {
                            ha4Var3.K(motionEvent6, 10, motionEvent6.getEventTime(), true);
                        }
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z6 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !o(motionEvent)) {
                        ha4Var = this;
                    } else {
                        ha4Var = this;
                        ha4Var.K(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 || z2 || motionEvent6 == 0 || motionEvent6.isFromSource(4098)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (motionEvent6 != 0) {
                        motionEvent6.recycle();
                    }
                    motionEvent2 = ha4Var.N1;
                    if (motionEvent2 != null && motionEvent2.getAction() == 10) {
                        motionEvent3 = ha4Var.N1;
                        if (motionEvent3 != null) {
                            pointerId = motionEvent3.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        tmm0Var = ha4Var.h1;
                        if (action == 9 || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent4 = ha4Var.N1;
                                if (motionEvent4 != null) {
                                    x = motionEvent4.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent9 = ha4Var.N1;
                                float y3 = motionEvent9 != null ? motionEvent9.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                motionEvent5 = ha4Var.N1;
                                if (motionEvent5 != null) {
                                    eventTime = motionEvent5.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime == motionEvent.getEventTime()) {
                                    z5 = false;
                                }
                                if (z4 || z5) {
                                    if (pointerId >= 0) {
                                        tmm0Var.c.delete(pointerId);
                                        tmm0Var.b.delete(pointerId);
                                    }
                                    fdcVar.J();
                                }
                            }
                        } else if (pointerId >= 0) {
                            tmm0Var.c.delete(pointerId);
                            tmm0Var.b.delete(pointerId);
                        }
                    }
                    ha4Var.N1 = MotionEvent.obtainNoHistory(motionEvent);
                    if (z3) {
                        ha4Var.K(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iJ = J(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iJ & 4) != 0 && z3) {
                            fdcVar.J();
                            ha4Var2 = this;
                            ha4Var2.K(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            ha4Var2 = this;
                        }
                        ha4Var2.B1 = false;
                        return iJ;
                    } catch (Throwable th) {
                        th = th;
                        ha4Var3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        ha4Var3.B1 = false;
        throw th;
    }

    public final void l(hmb0 hmb0Var) {
        this.t1.s(hmb0Var, false);
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            l((hmb0) objArr[i2]);
        }
    }

    public final boolean o(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws KotlinNothingValueException {
        dg90 dg90Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().I()) {
            getRoot().e(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l9x0.c());
        }
        this.U0.onViewAttachedToWindow(this);
        if (!this.d2) {
            getComposeViewContext().e();
        }
        int i = 0;
        Object[] objArr = 0;
        this.d2 = false;
        l(getRoot());
        k(getRoot());
        getSnapshotObserver().a.e();
        ha4 ha4VarM32getOutOfFrameExecutor = m32getOutOfFrameExecutor();
        if (ha4VarM32getOutOfFrameExecutor == null) {
            eg.m("Expected the view to be attached to window.");
            return;
        }
        ha4VarM32getOutOfFrameExecutor.G(new s94(this, objArr == true ? 1 : 0));
        getComposeViewContext().d();
        qzj composeViewContext = getComposeViewContext();
        composeViewContext.g();
        sck1 sck1Var = composeViewContext.f;
        vac0 vac0Var = this.e;
        if (sck1Var == null || vac0Var == null) {
            dg90Var = null;
        } else {
            xac0 xac0Var = (xac0) t2b.f(sck1Var.o(), new fck1()).b(rc11.a.b(xac0.class));
            int id = ((View) getParent()).getId();
            fdn0 fdn0Var = xac0Var.b;
            Object objB = fdn0Var.b(id);
            if (objB == null) {
                objB = new wdn0(1);
                fdn0Var.i(id, objB);
            }
            wdn0 wdn0Var = (wdn0) objB;
            Object[] objArr2 = wdn0Var.a;
            int i2 = wdn0Var.b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr2[i];
                if (!((wac0) obj).c) {
                    break;
                } else {
                    i++;
                }
            }
            wac0 wac0Var = (wac0) obj;
            if (wac0Var == null) {
                wac0Var = new wac0();
                wdn0Var.b(wac0Var);
            }
            wac0Var.c = true;
            this.f = wac0Var;
            dg90Var = wac0Var.b;
        }
        if (dg90Var == null) {
            dg90Var = y580.d1;
        }
        this.h = dg90Var;
        iu30 iu30Var = this.D1;
        if (iu30Var != null) {
            iu30Var.invoke(getComposeViewContext());
            this.D1 = null;
        }
        x8c0 lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.a1);
        getInputModeManager().a.setValue(new qj80(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ua4.a.b(this);
        }
        m74 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            ((dz20) getFocusOwner()).g.b(autofillManager);
            getSemanticsOwner().d.b(autofillManager);
        }
        ((dz20) getFocusOwner()).g.b(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        jx4 jx4Var = (jx4) wpo1.n(this.G1);
        if (jx4Var == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        pj80 pj80Var = (pj80) wpo1.n(jx4Var.d);
        return pj80Var != null && pj80Var.b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        M(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        jx4 jx4Var = (jx4) wpo1.n(this.G1);
        if (jx4Var != null) {
            pj80 pj80Var = (pj80) wpo1.n(jx4Var.d);
            if (pj80Var != null) {
                return pj80Var.a(editorInfo);
            }
            return null;
        }
        b9e1 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.d) {
            return null;
        }
        l4p1.z(editorInfo, legacyTextInputServiceAndroid.h, legacyTextInputServiceAndroid.g);
        l4p1.o(editorInfo);
        w311 w311Var = new w311(legacyTextInputServiceAndroid.g, new nl51(legacyTextInputServiceAndroid, (byte) 27), legacyTextInputServiceAndroid.h.c);
        legacyTextInputServiceAndroid.i.add(new WeakReference(w311Var));
        return w311Var;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ob4 ob4Var = this.a1;
        ob4Var.getClass();
        mb4.z(ob4Var, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view;
        super.onDetachedFromWindow();
        setAttached(false);
        this.U0.onViewDetachedFromWindow(this);
        if (m() && (view = this.O0) != null) {
            removeView(view);
        }
        l9x0.d(this);
        getComposeViewContext().b();
        gw91 gw91Var = getSnapshotObserver().a;
        gw91Var.f();
        gw91Var.a();
        x8c0 lifecycle = getComposeViewContext().d().getLifecycle();
        lifecycle.d(this.a1);
        lifecycle.d(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        wac0 wac0Var = this.f;
        if (wac0Var != null) {
            wac0Var.c = false;
        }
        this.f = null;
        if (Build.VERSION.SDK_INT >= 31) {
            ua4.a.a(this);
        }
        m74 autofillManager = getAutofillManager();
        if (autofillManager != null) {
            getSemanticsOwner().d.k(autofillManager);
            ((dz20) getFocusOwner()).g.k(autofillManager);
        }
        q511 rectManager = getRectManager();
        rectManager.g = rectManager.d.c(0L, 0L, null, 0, 0);
        getRectManager().a();
        q511 rectManager2 = getRectManager();
        Runnable runnable = rectManager2.i;
        if (runnable != null) {
            rectManager2.b.removeCallbacks(runnable);
            rectManager2.i = null;
        }
        ((dz20) getFocusOwner()).g.k(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        dz20 dz20Var = (dz20) getFocusOwner();
        m6p1.z(dz20Var.c, true);
        if (dz20Var.h() != null) {
            d030 d030VarH = dz20Var.h();
            dz20Var.k(null);
            if (d030VarH != null) {
                d030VarH.I1(wz20.a, wz20.c);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.A1 = 0L;
        N();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        M(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.A1 = 0L;
            this.t1.l(this.a2);
            this.r1 = null;
            N();
            if (this.q1 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        q420 q420Var = this.t1;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!getRoot().I()) {
                getRoot().e(this);
            }
            if (!isAttachedToWindow()) {
                l(getRoot());
            }
            long jE = e(i);
            long jE2 = e(i2);
            long jU = m5n1.u((int) (jE >>> 32), (int) (jE & 4294967295L), (int) (jE2 >>> 32), (int) (4294967295L & jE2));
            hjl hjlVar = this.r1;
            if (hjlVar == null) {
                this.r1 = new hjl(jU);
                this.s1 = false;
            } else if (!hjl.c(hjlVar.a, jU)) {
                this.s1 = true;
            }
            q420Var.t(jU);
            q420Var.n();
            setMeasuredDimension(getRoot().f1.f68p.a, getRoot().f1.f68p.b);
            if (this.q1 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f1.f68p.a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f1.f68p.b, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!c() || viewStructure == null || this.e2) {
            return;
        }
        B(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        fav0 fav0Var;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (fav0Var = ((ea4) getPointerIconService()).a) == null) ? super.onResolvePointerIcon(motionEvent, i) : va4.b(getContext(), fav0Var);
    }

    @Override // p.o5s
    public final void onResume(iac0 iac0Var) {
        uhd uhdVarW;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(l9x0.c());
        }
        wac0 wac0Var = this.f;
        if (wac0Var != null) {
            vac0 vac0Var = this.e;
            vac0Var.getClass();
            dg90 dg90Var = wac0Var.a;
            if (dg90Var.l()) {
                try {
                    uhdVarW = ((kjm1) vac0Var).a.w(new g030(wac0Var, (byte) 16));
                } catch (CancellationException unused) {
                    dg90Var.c();
                    uhdVarW = null;
                }
                uhd uhdVar = wac0Var.d;
                if (uhdVar != null) {
                    uhdVar.cancel();
                }
                wac0Var.d = uhdVarW;
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        flb0 flb0Var;
        if (this.c) {
            int[] iArr = uy20.a;
            flb0 flb0Var2 = flb0.a;
            if (i != 0) {
                flb0Var = i != 1 ? null : flb0.b;
            } else {
                flb0Var = flb0Var2;
            }
            if (flb0Var != null) {
                flb0Var2 = flb0Var;
            }
            setLayoutDirection(flb0Var2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        rcl rclVar;
        if (Build.VERSION.SDK_INT < 31 || (rclVar = this.f2) == null) {
            return;
        }
        rclVar.h(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        N();
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        wac0 wac0Var = this.f;
        if (wac0Var != null) {
            dg90 dg90Var = wac0Var.a;
            if (!dg90Var.l()) {
                dg90Var.q();
                return;
            }
            uhd uhdVar = wac0Var.d;
            if (uhdVar != null) {
                uhdVar.cancel();
            }
            wac0Var.d = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        getInputModeManager().a.setValue(new qj80(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ob4 ob4Var = this.a1;
        ob4Var.getClass();
        mb4.B(ob4Var, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zC;
        this.c2 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zC = l9x0.c())) {
            return;
        }
        setShowLayoutBounds(zC);
        k(getRoot());
    }

    public final boolean p(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.N1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void r(float[] fArr) {
        C();
        kch0.j(fArr, this.y1);
        xa4.k(fArr, Float.intBitsToFloat((int) (this.C1 >> 32)), Float.intBitsToFloat((int) (this.C1 & 4294967295L)), this.w1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) throws NoWhenBranchMatchedException {
        if (!isFocused()) {
            yx20 yx20VarD = uy20.d(i);
            int iD = yx20VarD != null ? yx20VarD.d() : 7;
            Boolean boolG = ((dz20) getFocusOwner()).g(iD, rect != null ? l0p1.w(rect) : null, new p94(iD, (byte) 0));
            Boolean bool = Boolean.TRUE;
            if (!u890.j(boolG, bool)) {
                if (!u890.j(((dz20) getFocusOwner()).g(iD, null, new p94(iD, (byte) 1)), bool)) {
                    if (hasFocus() && g6p1.o(iD)) {
                        return ((dz20) getFocusOwner()).j(iD);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final long s(long j) {
        C();
        long jB = kch0.b(j, this.y1);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.C1 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.C1 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.Z0.e = j;
    }

    public final void setComposeViewContext(qzj qzjVar) {
        if (getCoroutineContext() != qzjVar.c().k() && !getRoot().o().isEmpty()) {
            qf80.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            qzj qzjVar2 = get_composeViewContext();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            if (qzjVar != qzjVar2) {
                if (isAttachedToWindow()) {
                    qzjVar2.b();
                    qzjVar.e();
                }
                set_composeViewContext(qzjVar);
                setCoroutineContext(qzjVar.c().k());
            }
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.d2 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.j1.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ob4 ob4Var) {
        this.a1 = ob4Var;
    }

    public void setCoroutineContext(o8n o8nVar) {
        this.Q0 = o8nVar;
    }

    public final void setFrameEndScheduler$ui(vac0 vac0Var) {
        this.e = vac0Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.A1 = j;
    }

    public final void setOnReadyForComposition(iu30 iu30Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.d2) {
            iu30Var.invoke(getComposeViewContext());
        } else {
            this.D1 = iu30Var;
        }
    }

    public final void setPlayNavigationSoundEffect$ui(vu30 vu30Var) {
        this.Y1 = vu30Var;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m26setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(na80 na80Var) {
        this.d = na80Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.p1 = z;
    }

    public void setUncaughtExceptionHandler(rn31 rn31Var) {
        this.t1.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(boolean z) {
        q420 q420Var = this.t1;
        if (((l6s) q420Var.e).n() || ((rok0) q420Var.f).k()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (q420Var.l(z ? this.a2 : this.b2)) {
                    requestLayout();
                }
                q420Var.b(false);
                getRectManager().a();
                if (this.g1) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.g1 = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void u(hmb0 hmb0Var, long j) {
        q420 q420Var = this.t1;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            q420Var.m(hmb0Var, j);
            if (!((l6s) q420Var.e).n()) {
                q420Var.b(false);
                getRectManager().a();
                this.b2.invoke();
                if (this.g1) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.g1 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final boolean v(int i) throws KotlinNothingValueException {
        if (!yx20.b(i, 7) && !yx20.b(i, 8)) {
            Integer numC = uy20.c(i);
            if (numC == null) {
                throw l1d.w("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            d030 d030VarH = ((dz20) getFocusOwner()).h();
            if (d030VarH == null) {
                eg.m("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = uy20.c(i);
            if (numC2 == null) {
                throw l1d.w("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            k75 k75Var = oap1.B(d030VarH).P0;
            View interopView = k75Var != null ? k75Var.getInteropView() : null;
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !xa4.j(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return uy20.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    public final void w() {
        wdn0 wdn0Var;
        m74 autofillManager;
        Object[] objArr;
        if (this.n1) {
            gw91 gw91Var = getSnapshotObserver().a;
            g6f0 g6f0Var = new g6f0((byte) 16);
            synchronized (gw91Var.g) {
                try {
                    bfn0 bfn0Var = gw91Var.f;
                    int i = bfn0Var.c;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = bfn0Var.a;
                        if (i2 >= i) {
                            break;
                        }
                        fw91 fw91Var = (fw91) objArr[i2];
                        fw91Var.d(g6f0Var);
                        if (!fw91Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = bfn0Var.a;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    f46.e0(objArr, (te70) null, i4, i);
                    bfn0Var.c = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.n1 = false;
        }
        q75 q75Var = this.q1;
        if (q75Var != null) {
            d(q75Var);
        }
        if (c() && (autofillManager = getAutofillManager()) != null) {
            gdn0 gdn0Var = autofillManager.h;
            if (gdn0Var.d == 0 && autofillManager.i) {
                autofillManager.a.a();
                autofillManager.i = false;
            }
            if (gdn0Var.d != 0) {
                autofillManager.i = true;
            }
        }
        while (this.Q1.j() && this.Q1.g(0) != null) {
            int i5 = this.Q1.b;
            int i6 = 0;
            while (true) {
                wdn0Var = this.Q1;
                if (i6 < i5) {
                    Function0 function0 = (Function0) wdn0Var.g(i6);
                    this.Q1.o(i6, null);
                    if (function0 != null) {
                        function0.invoke();
                    }
                    i6++;
                }
            }
            wdn0Var.m(0, i5);
        }
    }

    public final void x(hmb0 hmb0Var) {
        pa4 pa4Var = this.Z0;
        pa4Var.U0 = true;
        if (pa4Var.m()) {
            pa4Var.n(hmb0Var);
        }
        ob4 ob4Var = this.a1;
        ob4Var.f = true;
        if (ob4Var.d()) {
            ob4Var.g.l(rih1.a);
        }
    }

    public final void y(hmb0 hmb0Var, boolean z, boolean z2, boolean z3) {
        hmb0 hmb0VarV;
        hmb0 hmb0VarV2;
        q420 q420Var = this.t1;
        if (!z) {
            if (q420Var.s(hmb0Var, z2) && z3) {
                H(hmb0Var);
                return;
            }
            return;
        }
        l6s l6sVar = (l6s) q420Var.e;
        hmb0 hmb0Var2 = hmb0Var.i;
        lmb0 lmb0Var = hmb0Var.f1;
        if (hmb0Var2 == null) {
            qf80.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iC = l1d.C(lmb0Var.d);
        if (iC != 0) {
            if (iC == 1) {
                return;
            }
            if (iC != 2 && iC != 3) {
                if (iC != 4) {
                    eg.o();
                    return;
                }
                if (!lmb0Var.e || z2) {
                    lmb0Var.e = true;
                    lmb0Var.f68p.U0 = true;
                    if (hmb0Var.p1) {
                        return;
                    }
                    if ((u890.j(hmb0Var.K(), Boolean.TRUE) || q420.i(hmb0Var)) && ((hmb0VarV = hmb0Var.v()) == null || !hmb0VarV.f1.e)) {
                        l6sVar.h(1, hmb0Var);
                    } else if ((hmb0Var.J() || q420.j(hmb0Var)) && ((hmb0VarV2 = hmb0Var.v()) == null || !hmb0VarV2.r())) {
                        l6sVar.h(3, hmb0Var);
                    }
                    if (q420Var.c || !z3) {
                        return;
                    }
                    H(hmb0Var);
                    return;
                }
                return;
            }
        }
        ((bfn0) q420Var.h).b(new bfh0(hmb0Var, true, z2));
    }

    public final void z(hmb0 hmb0Var, boolean z, boolean z2) {
        lmb0 lmb0Var = hmb0Var.f1;
        q420 q420Var = this.t1;
        if (!z) {
            q420Var.getClass();
            int iC = l1d.C(lmb0Var.d);
            if (iC == 0 || iC == 1 || iC == 2 || iC == 3) {
                return;
            }
            if (iC != 4) {
                eg.o();
                return;
            }
            hmb0 hmb0VarV = hmb0Var.v();
            boolean z3 = hmb0VarV == null || hmb0VarV.J();
            if (!z2) {
                if (hmb0Var.r()) {
                    return;
                }
                if (hmb0Var.q() && hmb0Var.J() == z3 && hmb0Var.J() == lmb0Var.f68p.T0) {
                    return;
                }
            }
            ffh0 ffh0Var = lmb0Var.f68p;
            ffh0Var.V0 = true;
            ffh0Var.W0 = true;
            if (!hmb0Var.p1 && ffh0Var.T0 && z3) {
                if ((hmb0VarV == null || !hmb0VarV.q()) && (hmb0VarV == null || !hmb0VarV.r())) {
                    ((l6s) q420Var.e).h(4, hmb0Var);
                }
                if (q420Var.c) {
                    return;
                }
                H(null);
                return;
            }
            return;
        }
        l6s l6sVar = (l6s) q420Var.e;
        int iC2 = l1d.C(lmb0Var.d);
        if (iC2 != 0) {
            if (iC2 == 1) {
                return;
            }
            if (iC2 != 2) {
                if (iC2 == 3) {
                    return;
                }
                if (iC2 != 4) {
                    eg.o();
                    return;
                }
            }
        }
        if ((lmb0Var.e || lmb0Var.f) && !z2) {
            return;
        }
        lmb0Var.f = true;
        lmb0Var.g = true;
        ffh0 ffh0Var2 = lmb0Var.f68p;
        ffh0Var2.V0 = true;
        ffh0Var2.W0 = true;
        if (hmb0Var.p1) {
            return;
        }
        hmb0 hmb0VarV2 = hmb0Var.v();
        if (u890.j(hmb0Var.K(), Boolean.TRUE) && ((hmb0VarV2 == null || !hmb0VarV2.f1.e) && (hmb0VarV2 == null || !hmb0VarV2.f1.f))) {
            l6sVar.h(2, hmb0Var);
        } else if (hmb0Var.J() && ((hmb0VarV2 == null || !hmb0VarV2.q()) && (hmb0VarV2 == null || !hmb0VarV2.r()))) {
            l6sVar.h(4, hmb0Var);
        }
        if (q420Var.c) {
            return;
        }
        H(null);
    }

    /* JADX INFO: renamed from: getAutofill, reason: merged with bridge method [inline-methods] */
    public l74 m27getAutofill() {
        return this.l1;
    }

    public m74 getAutofillManager() {
        return this.m1;
    }

    public xd4 getDragAndDropManager() {
        return this.R0;
    }

    /* JADX INFO: renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public fdn0 m31getLayoutNodes() {
        return this.W0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @adt
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    public static /* synthetic */ void getPlayNavigationSoundEffect$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m24getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    @adt
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public sn31 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(rn31 rn31Var) {
    }
}
