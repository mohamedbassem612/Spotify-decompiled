package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p.a9a;
import p.b110;
import p.b8k1;
import p.bb01;
import p.bhn0;
import p.c611;
import p.d440;
import p.d611;
import p.dm5;
import p.e611;
import p.eg;
import p.f3a;
import p.f611;
import p.f8k1;
import p.g54;
import p.g611;
import p.gmz0;
import p.h611;
import p.hhg1;
import p.hr80;
import p.i611;
import p.j611;
import p.k3s;
import p.k611;
import p.kl10;
import p.kw7;
import p.l1d;
import p.l611;
import p.luo1;
import p.m611;
import p.mlw0;
import p.n0v0;
import p.n611;
import p.nkx0;
import p.o611;
import p.o6o0;
import p.p0g;
import p.p611;
import p.p9p1;
import p.pif1;
import p.pn;
import p.q58;
import p.q6o0;
import p.qpj1;
import p.s611;
import p.t01;
import p.t611;
import p.u611;
import p.u7k1;
import p.v611;
import p.vqv0;
import p.w611;
import p.wic0;
import p.y511;
import p.y611;
import p.z511;
import p.zj20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class RecyclerView extends ViewGroup implements o6o0 {
    public static boolean b2 = false;
    public static boolean c2 = false;
    public static final int[] d2 = {R.attr.nestedScrollingEnabled};
    public static final float e2 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean f2 = true;
    public static final boolean g2 = true;
    public static final boolean h2 = true;
    public static final Class[] i2;
    public static final y511 j2;
    public static final t611 k2;
    public final int A1;
    public final float B1;
    public final float C1;
    public boolean D1;
    public final v611 E1;
    public d440 F1;
    public final a9a G1;
    public final s611 H1;
    public k611 I1;
    public ArrayList J1;
    public boolean K1;
    public boolean L1;
    public final bb01 M1;
    public final Rect N0;
    public boolean N1;
    public final RectF O0;
    public y611 O1;
    public z511 P0;
    public c611 P1;
    public a Q0;
    public final int[] Q1;
    public final ArrayList R0;
    public q6o0 R1;
    public final ArrayList S0;
    public final int[] S1;
    public final ArrayList T0;
    public final int[] T1;
    public j611 U0;
    public final int[] U1;
    public boolean V0;
    public final ArrayList V1;
    public boolean W0;
    public final b110 W1;
    public boolean X0;
    public boolean X1;
    public int Y0;
    public int Y1;
    public boolean Z0;
    public int Z1;
    public final float a;
    public boolean a1;
    public final mlw0 a2;
    public final pn b;
    public boolean b1;
    public final n611 c;
    public int c1;
    public p611 d;
    public boolean d1;
    public final t01 e;
    public final AccessibilityManager e1;
    public final p0g f;
    public ArrayList f1;
    public final qpj1 g;
    public boolean g1;
    public boolean h;
    public boolean h1;
    public final g54 i;
    public int i1;
    public int j1;
    public d611 k1;
    public EdgeEffect l1;
    public EdgeEffect m1;
    public EdgeEffect n1;
    public EdgeEffect o1;
    public e611 p1;
    public int q1;
    public int r1;
    public VelocityTracker s1;
    public final Rect t;
    public int t1;
    public int u1;
    public int v1;
    public int w1;
    public int x1;
    public i611 y1;
    public final int z1;

    static {
        Class cls = Integer.TYPE;
        i2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        j2 = new y511((byte) 0);
        k2 = new t611();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) throws Throwable {
        float fA;
        TypedArray typedArray;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.b = new pn(this, (byte) 3);
        this.c = new n611(this);
        this.g = new qpj1((byte) 3);
        this.i = new g54(this, (byte) 12);
        this.t = new Rect();
        this.N0 = new Rect();
        this.O0 = new RectF();
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
        this.T0 = new ArrayList();
        this.Y0 = 0;
        this.g1 = false;
        this.h1 = false;
        this.i1 = 0;
        this.j1 = 0;
        this.k1 = k2;
        this.p1 = new k3s();
        this.q1 = 0;
        this.r1 = -1;
        this.B1 = Float.MIN_VALUE;
        this.C1 = Float.MIN_VALUE;
        this.D1 = true;
        this.E1 = new v611(this);
        this.G1 = h2 ? new a9a((byte) 3) : null;
        s611 s611Var = new s611();
        s611Var.a = -1;
        s611Var.b = 0;
        s611Var.c = 0;
        s611Var.d = (byte) 1;
        s611Var.e = 0;
        s611Var.f = false;
        s611Var.g = false;
        s611Var.h = false;
        s611Var.i = false;
        s611Var.j = false;
        s611Var.k = false;
        this.H1 = s611Var;
        this.K1 = false;
        this.L1 = false;
        bb01 bb01Var = new bb01(this, (byte) 4);
        this.M1 = bb01Var;
        this.N1 = false;
        this.Q1 = new int[2];
        this.S1 = new int[2];
        this.T1 = new int[2];
        this.U1 = new int[2];
        this.V1 = new ArrayList();
        this.W1 = new b110(this, (byte) 1);
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = new mlw0(this, (byte) 17);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.x1 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = f8k1.a;
            fA = kw7.y(viewConfiguration);
        } else {
            fA = f8k1.a(viewConfiguration, context);
        }
        Throwable th = null;
        this.B1 = fA;
        this.C1 = i3 >= 26 ? kw7.z(viewConfiguration) : f8k1.a(viewConfiguration, context);
        this.z1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.p1.a = bb01Var;
        this.e = new t01(new n0v0(this, (byte) 20));
        this.f = new p0g(new vqv0(this, (byte) 17));
        WeakHashMap weakHashMap = b8k1.a;
        if ((i3 >= 26 ? u7k1.a(this) : 0) == 0 && i3 >= 26) {
            u7k1.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.e1 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new y611(this));
        int[] iArr = gmz0.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        b8k1.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                hhg1.n("Trying to set fast scroller without both required drawables.".concat(G()));
                throw null;
            }
            Resources resources = getContext().getResources();
            typedArray = typedArrayObtainStyledAttributes;
            new kl10(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131166029), resources.getDimensionPixelSize(2131166031), resources.getDimensionPixelOffset(2131166030));
        } else {
            typedArray = typedArrayObtainStyledAttributes;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                th = null;
                                nkx0.i(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw th;
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                th = null;
                                nkx0.i(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw th;
                            } catch (InstantiationException e4) {
                                e = e4;
                                th = null;
                                nkx0.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                th = null;
                                nkx0.i(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw th;
                            }
                        }
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(a.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(i2);
                            objArr = new Object[]{context, attributeSet, Integer.valueOf(i), 0};
                        } catch (NoSuchMethodException e6) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e7) {
                                e7.initCause(e6);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((a) constructor.newInstance(objArr));
                    } catch (ClassCastException e8) {
                        nkx0.i(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e8);
                        throw null;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                } catch (IllegalAccessException e10) {
                    e = e10;
                } catch (InstantiationException e11) {
                    e = e11;
                } catch (InvocationTargetException e12) {
                    e = e12;
                }
            }
        }
        int[] iArr2 = d2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        b8k1.o(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        p9p1.A(this);
    }

    public static RecyclerView M(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewM = M(viewGroup.getChildAt(i));
            if (recyclerViewM != null) {
                return recyclerViewM;
            }
        }
        return null;
    }

    public static int R(View view) {
        w611 w611VarU = U(view);
        if (w611VarU != null) {
            return w611VarU.m();
        }
        return -1;
    }

    public static int S(View view) {
        w611 w611VarU = U(view);
        if (w611VarU != null) {
            return w611VarU.o();
        }
        return -1;
    }

    public static w611 U(View view) {
        if (view == null) {
            return null;
        }
        return ((g611) view.getLayoutParams()).a;
    }

    public static void V(Rect rect, View view) {
        g611 g611Var = (g611) view.getLayoutParams();
        Rect rect2 = g611Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) g611Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) g611Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) g611Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) g611Var).bottomMargin);
    }

    private q6o0 getScrollingChildHelper() {
        q6o0 q6o0Var = this.R1;
        if (q6o0Var != null) {
            return q6o0Var;
        }
        q6o0 q6o0Var2 = new q6o0(this);
        this.R1 = q6o0Var2;
        return q6o0Var2;
    }

    public static void o(w611 w611Var) {
        WeakReference weakReference = w611Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w611Var.a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w611Var.b = null;
        }
    }

    public static int s(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i > 0 && edgeEffect != null && dm5.N(edgeEffect) != 0.0f) {
            int iRound = Math.round(dm5.W(edgeEffect, ((-i) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || dm5.N(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i3;
        int iRound2 = Math.round(dm5.W(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        b2 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        c2 = z;
    }

    public final void A(int i, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void A0(boolean z) {
        int i = this.Y0;
        if (i < 1) {
            if (b2) {
                eg.m("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(G()));
                return;
            } else {
                this.Y0 = 1;
                i = 1;
            }
        }
        if (!z && !this.a1) {
            this.Z0 = false;
        }
        if (i == 1) {
            if (z && this.Z0 && !this.a1 && this.Q0 != null && this.P0 != null) {
                w();
            }
            if (!this.a1) {
                this.Z0 = false;
            }
        }
        this.Y0--;
    }

    public final void B(int i, int i3) {
        this.j1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i3);
        g0(i, i3);
        k611 k611Var = this.I1;
        if (k611Var != null) {
            k611Var.h(this, i, i3);
        }
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k611) this.J1.get(size)).h(this, i, i3);
            }
        }
        this.j1--;
    }

    public final void B0() {
        wic0 wic0Var;
        setScrollState(0);
        v611 v611Var = this.E1;
        v611Var.g.removeCallbacks(v611Var);
        v611Var.c.abortAnimation();
        a aVar = this.Q0;
        if (aVar == null || (wic0Var = aVar.e) == null) {
            return;
        }
        wic0Var.m();
    }

    public final void C() {
        if (this.o1 != null) {
            return;
        }
        ((t611) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.o1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void D() {
        if (this.l1 != null) {
            return;
        }
        ((t611) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.l1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void E() {
        if (this.n1 != null) {
            return;
        }
        ((t611) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.n1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void F() {
        if (this.m1 != null) {
            return;
        }
        ((t611) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.m1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String G() {
        return " " + super.toString() + ", adapter:" + this.P0 + ", layout:" + this.Q0 + ", context:" + getContext();
    }

    public final void H(s611 s611Var) {
        if (getScrollState() != 2) {
            s611Var.getClass();
            return;
        }
        OverScroller overScroller = this.E1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        s611Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View I(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean K(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.T0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            j611 j611Var = (j611) arrayList.get(i);
            if (j611Var.b(this, motionEvent) && action != 3) {
                this.U0 = j611Var;
                return true;
            }
        }
        return false;
    }

    public final void L(int[] iArr) {
        p0g p0gVar = this.f;
        int iC = p0gVar.c();
        if (iC == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iC; i4++) {
            w611 w611VarU = U(p0gVar.b(i4));
            if (!w611VarU.C()) {
                int iO = w611VarU.o();
                if (iO < i) {
                    i = iO;
                }
                if (iO > i3) {
                    i3 = iO;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i3;
    }

    public final w611 N(int i) {
        w611 w611Var = null;
        if (this.g1) {
            return null;
        }
        p0g p0gVar = this.f;
        int iP = p0gVar.a.p();
        for (int i3 = 0; i3 < iP; i3++) {
            w611 w611VarU = U(p0gVar.a.o(i3));
            if (w611VarU != null && !w611VarU.v() && P(w611VarU) == i) {
                if (!p0gVar.c.contains(w611VarU.a)) {
                    return w611VarU;
                }
                w611Var = w611VarU;
            }
        }
        return w611Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3 */
    public boolean O(int i, int i3) {
        int iMax;
        int i4;
        a aVar = this.Q0;
        if (aVar != null && !this.a1) {
            int iQ = aVar.q();
            boolean zR = this.Q0.r();
            int i5 = this.z1;
            if (iQ == 0 || Math.abs(i) < i5) {
                i = 0;
            }
            if (!zR || Math.abs(i3) < i5) {
                i3 = 0;
            }
            if (i != 0 || i3 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.l1;
                    if (edgeEffect == null || dm5.N(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.n1;
                        if (edgeEffect2 == null || dm5.N(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (w0(this.n1, i, getWidth())) {
                            this.n1.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i6 = -i;
                        if (w0(this.l1, i6, getWidth())) {
                            this.l1.onAbsorb(i6);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i3 == 0) {
                    i4 = i3;
                    i3 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.m1;
                    if (edgeEffect3 == null || dm5.N(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.o1;
                        if (edgeEffect4 == null || dm5.N(edgeEffect4) == 0.0f) {
                            i4 = i3;
                            i3 = 0;
                        } else if (w0(this.o1, i3, getHeight())) {
                            this.o1.onAbsorb(i3);
                            i3 = 0;
                        }
                    } else {
                        int i7 = -i3;
                        if (w0(this.m1, i7, getHeight())) {
                            this.m1.onAbsorb(i7);
                            i3 = 0;
                        }
                    }
                    i4 = 0;
                }
                v611 v611Var = this.E1;
                int i8 = this.A1;
                if (iMax != 0 || i3 != 0) {
                    int i9 = -i8;
                    iMax = Math.max(i9, Math.min(iMax, i8));
                    i3 = Math.max(i9, Math.min(i3, i8));
                    v611Var.a(iMax, i3);
                }
                if (i != 0 || i4 != 0) {
                    float f = i;
                    float f3 = i4;
                    if (!dispatchNestedPreFling(f, f3)) {
                        boolean z = iQ != 0 || zR;
                        dispatchNestedFling(f, f3, z);
                        i611 i611Var = this.y1;
                        if (i611Var == null || !i611Var.a(i, i4)) {
                            if (z) {
                                if (zR) {
                                    iQ = (iQ == true ? 1 : 0) | 2;
                                }
                                getScrollingChildHelper().h(iQ, 1);
                                int i10 = -i8;
                                v611Var.a(Math.max(i10, Math.min(i, i8)), Math.max(i10, Math.min(i4, i8)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int P(w611 w611Var) {
        if ((w611Var.t & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_PROCESS_BLOCK_FAILED) == 0 && w611Var.s()) {
            return this.e.b(w611Var.c);
        }
        return -1;
    }

    public final long Q(w611 w611Var) {
        return this.P0.b ? w611Var.e : w611Var.c;
    }

    public final w611 T(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return U(view);
        }
        hhg1.i("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect W(View view) {
        g611 g611Var = (g611) view.getLayoutParams();
        boolean z = g611Var.c;
        Rect rect = g611Var.b;
        if (z) {
            s611 s611Var = this.H1;
            if (!s611Var.g || (!g611Var.a.y() && !g611Var.a.t())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.S0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.t;
                    rect2.set(0, 0, 0, 0);
                    ((f611) arrayList.get(i)).e(rect2, view, this, s611Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                g611Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean X() {
        return !this.X0 || this.g1 || this.e.w();
    }

    public final boolean Y() {
        return this.i1 > 0;
    }

    public final void Z(int i) {
        if (this.Q0 == null) {
            return;
        }
        setScrollState(2);
        this.Q0.H0(i);
        awakenScrollBars();
    }

    @Override // p.o6o0
    public final void a(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void a0() {
        p0g p0gVar = this.f;
        int iP = p0gVar.a.p();
        for (int i = 0; i < iP; i++) {
            ((g611) p0gVar.a.o(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            g611 g611Var = (g611) ((w611) arrayList.get(i3)).a.getLayoutParams();
            if (g611Var != null) {
                g611Var.c = true;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i3) {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.getClass();
        }
        super.addFocusables(arrayList, i, i3);
    }

    public final void b0(int i, int i3, boolean z) {
        int i4 = i + i3;
        p0g p0gVar = this.f;
        int iP = p0gVar.a.p();
        for (int i5 = 0; i5 < iP; i5++) {
            w611 w611VarU = U(p0gVar.a.o(i5));
            if (w611VarU != null && !w611VarU.C()) {
                int i6 = w611VarU.c;
                s611 s611Var = this.H1;
                if (i6 >= i4) {
                    if (c2) {
                        w611VarU.toString();
                    }
                    w611VarU.z(-i3, z);
                    s611Var.f = true;
                } else if (i6 >= i) {
                    if (c2) {
                        w611VarU.toString();
                    }
                    w611VarU.j(8);
                    w611VarU.z(-i3, z);
                    w611VarU.c = i - 1;
                    s611Var.f = true;
                }
            }
        }
        n611 n611Var = this.c;
        ArrayList arrayList = n611Var.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w611 w611Var = (w611) arrayList.get(size);
            if (w611Var != null) {
                int i7 = w611Var.c;
                if (i7 >= i4) {
                    if (c2) {
                        w611Var.toString();
                    }
                    w611Var.z(-i3, z);
                } else if (i7 >= i) {
                    w611Var.j(8);
                    n611Var.h(size);
                }
            }
        }
        requestLayout();
    }

    public final void c0() {
        this.i1++;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g611) && this.Q0.s((g611) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        a aVar = this.Q0;
        if (aVar != null && aVar.q()) {
            return this.Q0.w(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        a aVar = this.Q0;
        if (aVar != null && aVar.q()) {
            return this.Q0.x(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        a aVar = this.Q0;
        if (aVar != null && aVar.q()) {
            return this.Q0.y(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        a aVar = this.Q0;
        if (aVar != null && aVar.r()) {
            return this.Q0.z(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        a aVar = this.Q0;
        if (aVar != null && aVar.r()) {
            return this.Q0.A(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        a aVar = this.Q0;
        if (aVar != null && aVar.r()) {
            return this.Q0.B(this.H1);
        }
        return 0;
    }

    public final void d0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i3 = this.i1 - 1;
        this.i1 = i3;
        if (i3 < 1) {
            if (b2 && i3 < 0) {
                eg.m("layout or scroll counter cannot go below zero.Some calls are not matching".concat(G()));
                return;
            }
            this.i1 = 0;
            if (z) {
                int i4 = this.c1;
                this.c1 = 0;
                if (i4 != 0 && (accessibilityManager = this.e1) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    luo1.y(i4, accessibilityEventObtain);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.V1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    w611 w611Var = (w611) arrayList.get(size);
                    if (w611Var.a.getParent() == this && !w611Var.C() && (i = w611Var.Q0) != -1) {
                        View view = w611Var.a;
                        WeakHashMap weakHashMap = b8k1.a;
                        view.setImportantForAccessibility(i);
                        w611Var.Q0 = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z) {
        return getScrollingChildHelper().a(f, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return getScrollingChildHelper().b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.S0;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((f611) arrayList.get(i)).h(canvas, this, this.H1);
        }
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.l1;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.m1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.m1;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.n1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.n1;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.o1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.o1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.p1 == null || arrayList.size() <= 0 || !this.p1.i()) ? z : true) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.r1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.v1 = x;
            this.t1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.w1 = y;
            this.u1 = y;
        }
    }

    public void f0(int i) {
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x016f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x015f, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x016c, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x016f, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x017a, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0182, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g0(int i, int i3) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        a aVar = this.Q0;
        if (aVar != null) {
            return aVar.E();
        }
        eg.m("RecyclerView has no LayoutManager".concat(G()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        a aVar = this.Q0;
        if (aVar != null) {
            return aVar.F(getContext(), attributeSet);
        }
        eg.m("RecyclerView has no LayoutManager".concat(G()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public z511 getAdapter() {
        return this.P0;
    }

    @Override // android.view.View
    public int getBaseline() {
        a aVar = this.Q0;
        if (aVar == null) {
            return super.getBaseline();
        }
        aVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i3) {
        zj20 zj20Var = this.P1;
        return zj20Var == null ? super.getChildDrawingOrder(i, i3) : zj20Var.d(i, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public y611 getCompatAccessibilityDelegate() {
        return this.O1;
    }

    public d611 getEdgeEffectFactory() {
        return this.k1;
    }

    public e611 getItemAnimator() {
        return this.p1;
    }

    public int getItemDecorationCount() {
        return this.S0.size();
    }

    public a getLayoutManager() {
        return this.Q0;
    }

    public int getMaxFlingVelocity() {
        return this.A1;
    }

    public int getMinFlingVelocity() {
        return this.z1;
    }

    public long getNanoTime() {
        if (h2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public i611 getOnFlingListener() {
        return this.y1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.D1;
    }

    public m611 getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.q1;
    }

    public final void h0() {
        if (this.N1 || !this.V0) {
            return;
        }
        WeakHashMap weakHashMap = b8k1.a;
        postOnAnimation(this.W1);
        this.N1 = true;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(w611 w611Var) {
        View view = w611Var.a;
        boolean z = view.getParent() == this;
        this.c.n(T(view));
        boolean zX = w611Var.x();
        p0g p0gVar = this.f;
        if (zX) {
            p0gVar.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            vqv0 vqv0Var = p0gVar.a;
            int iP = vqv0Var.p();
            p0gVar.b.H(iP, true);
            p0gVar.c.add(view);
            vqv0Var.s(view);
            vqv0Var.d(view, iP);
            return;
        }
        int iR = p0gVar.a.r(view);
        if (iR < 0) {
            hhg1.g(view, "view is not a child, cannot hide ");
            return;
        }
        p0gVar.b.P(iR);
        p0gVar.c.add(view);
        p0gVar.a.s(view);
    }

    public final void i0() {
        boolean z;
        boolean z2 = this.g1;
        t01 t01Var = this.e;
        if (z2) {
            t01Var.D();
            if (this.h1) {
                this.Q0.o0(this);
            }
        }
        if (this.p1 != null && this.Q0.T0()) {
            t01Var.B();
        } else {
            t01Var.g();
        }
        boolean z3 = this.K1 || this.L1;
        boolean z4 = this.X0 && this.p1 != null && ((z = this.g1) || z3 || this.Q0.f) && (!z || this.P0.b);
        s611 s611Var = this.H1;
        s611Var.j = z4;
        s611Var.k = z4 && z3 && !this.g1 && this.p1 != null && this.Q0.T0();
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.V0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.a1;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(f611 f611Var) {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.n("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f611Var);
        a0();
        requestLayout();
    }

    public final void j0(boolean z) {
        this.h1 = z | this.h1;
        this.g1 = true;
        p0g p0gVar = this.f;
        int iP = p0gVar.a.p();
        for (int i = 0; i < iP; i++) {
            w611 w611VarU = U(p0gVar.a.o(i));
            if (w611VarU != null && !w611VarU.C()) {
                w611VarU.j(6);
            }
        }
        a0();
        n611 n611Var = this.c;
        ArrayList arrayList = n611Var.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            w611 w611Var = (w611) arrayList.get(i3);
            if (w611Var != null) {
                w611Var.j(6);
                w611Var.j(1024);
            }
        }
        z511 z511Var = n611Var.h.P0;
        if (z511Var == null || !z511Var.b) {
            n611Var.g();
        }
    }

    public final void k(h611 h611Var) {
        ArrayList arrayList = this.f1;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f1 = arrayList;
        }
        arrayList.add(h611Var);
    }

    public final void k0(w611 w611Var, f3a f3aVar) {
        w611Var.t &= -8193;
        boolean z = this.H1.h;
        qpj1 qpj1Var = this.g;
        if (z && w611Var.y() && !w611Var.v() && !w611Var.C()) {
            qpj1Var.h(Q(w611Var), w611Var);
        }
        qpj1Var.j(w611Var, f3aVar);
    }

    public final void l(j611 j611Var) {
        this.T0.add(j611Var);
    }

    public final int l0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.l1;
        float f3 = 0.0f;
        if (edgeEffect == null || dm5.N(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.n1;
            if (edgeEffect2 != null && dm5.N(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.n1;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fW = dm5.W(edgeEffect3, width, height);
                    if (dm5.N(this.n1) == 0.0f) {
                        this.n1.onRelease();
                    }
                    f3 = fW;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.l1;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -dm5.W(edgeEffect4, -width, 1.0f - height);
                if (dm5.N(this.l1) == 0.0f) {
                    this.l1.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final void m(k611 k611Var) {
        ArrayList arrayList = this.J1;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.J1 = arrayList;
        }
        arrayList.add(k611Var);
    }

    public final int m0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.m1;
        float f3 = 0.0f;
        if (edgeEffect == null || dm5.N(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.o1;
            if (edgeEffect2 != null && dm5.N(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.o1;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fW = dm5.W(edgeEffect3, height, 1.0f - width);
                    if (dm5.N(this.o1) == 0.0f) {
                        this.o1.onRelease();
                    }
                    f3 = fW;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.m1;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -dm5.W(edgeEffect4, -height, width);
                if (dm5.N(this.m1) == 0.0f) {
                    this.m1.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    public final void n(String str) {
        if (!Y()) {
            if (this.j1 > 0) {
                new IllegalStateException(G());
            }
        } else if (str == null) {
            eg.m("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(G()));
        } else {
            eg.m(str);
        }
    }

    public final void n0(f611 f611Var) {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.S0;
        arrayList.remove(f611Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        a0();
        requestLayout();
    }

    public final void o0(h611 h611Var) {
        ArrayList arrayList = this.f1;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(h611Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.i1 = 0;
        this.V0 = true;
        this.X0 = this.X0 && !isLayoutRequested();
        this.c.e();
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.g = true;
            aVar.g0(this);
        }
        this.N1 = false;
        if (h2) {
            ThreadLocal threadLocal = d440.e;
            d440 d440Var = (d440) threadLocal.get();
            this.F1 = d440Var;
            if (d440Var == null) {
                d440 d440Var2 = new d440();
                d440Var2.a = new ArrayList();
                d440Var2.d = new ArrayList();
                this.F1 = d440Var2;
                WeakHashMap weakHashMap = b8k1.a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                d440 d440Var3 = this.F1;
                d440Var3.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(d440Var3);
            }
            ArrayList arrayList = this.F1.a;
            if (b2 && arrayList.contains(this)) {
                eg.m("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d440 d440Var;
        super.onDetachedFromWindow();
        e611 e611Var = this.p1;
        if (e611Var != null) {
            e611Var.g();
        }
        B0();
        this.V0 = false;
        a aVar = this.Q0;
        n611 n611Var = this.c;
        if (aVar != null) {
            aVar.g = false;
            aVar.h0(this, n611Var);
        }
        this.V1.clear();
        removeCallbacks(this.W1);
        this.g.getClass();
        qpj1.z();
        ArrayList arrayList = n611Var.c;
        for (int i = 0; i < arrayList.size(); i++) {
            p9p1.s(((w611) arrayList.get(i)).a);
        }
        n611Var.f(n611Var.h.P0, false);
        p9p1.t(this);
        if (!h2 || (d440Var = this.F1) == null) {
            return;
        }
        boolean zRemove = d440Var.a.remove(this);
        if (!b2 || zRemove) {
            this.F1 = null;
        } else {
            eg.m("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.S0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((f611) arrayList.get(i)).g(canvas, this, this.H1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.Q0 != null && !this.a1 && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.Q0.r() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.Q0.q() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.Q0.r()) {
                    f = -axisValue2;
                } else if (this.Q0.q()) {
                    axisValue = axisValue2;
                    f = 0.0f;
                } else {
                    f = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f = 0.0f;
                axisValue = 0.0f;
            }
            if (f != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.B1);
                int i3 = (int) (f * this.C1);
                a aVar = this.Q0;
                if (aVar != null && !this.a1) {
                    int[] iArr = this.U1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zQ = aVar.q();
                    boolean zR = this.Q0.r();
                    int i4 = zR ? (zQ ? 1 : 0) | 2 : zQ ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iL0 = i - l0(y, i);
                    int iM0 = i3 - m0(x, i3);
                    getScrollingChildHelper().h(i4, 1);
                    if (z(zQ ? iL0 : 0, zR ? iM0 : 0, 1, this.U1, this.S1)) {
                        iL0 -= iArr[0];
                        iM0 -= iArr[1];
                    }
                    s0(zQ ? iL0 : 0, zR ? iM0 : 0, motionEvent, 1);
                    d440 d440Var = this.F1;
                    if (d440Var != null && (iL0 != 0 || iM0 != 0)) {
                        d440Var.a(this, iL0, iM0);
                    }
                    a(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.a1) {
            this.U0 = null;
            if (K(motionEvent)) {
                r0();
                setScrollState(0);
                return true;
            }
            a aVar = this.Q0;
            if (aVar != null) {
                boolean zQ = aVar.q();
                boolean zR = this.Q0.r();
                VelocityTracker velocityTrackerObtain = this.s1;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.s1 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.b1) {
                        this.b1 = false;
                    }
                    this.r1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.v1 = x;
                    this.t1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.w1 = y;
                    this.u1 = y;
                    EdgeEffect edgeEffect = this.l1;
                    if (edgeEffect == null || dm5.N(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        dm5.W(this.l1, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.n1;
                    boolean z3 = z;
                    if (edgeEffect2 != null && dm5.N(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z3 = z;
                        z3 = z;
                        dm5.W(this.n1, 0.0f, motionEvent.getY() / getHeight());
                        z3 = true;
                    }
                    z3 = z;
                    z3 = z;
                    z3 = z;
                    EdgeEffect edgeEffect3 = this.m1;
                    boolean z4 = z3;
                    if (edgeEffect3 != null && dm5.N(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z4 = z3;
                        z4 = z3;
                        dm5.W(this.m1, 0.0f, motionEvent.getX() / getWidth());
                        z4 = true;
                    }
                    z4 = z3;
                    z4 = z3;
                    z4 = z3;
                    EdgeEffect edgeEffect4 = this.o1;
                    boolean z5 = z4;
                    if (edgeEffect4 != null && dm5.N(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z5 = z4;
                        z5 = z4;
                        dm5.W(this.o1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z5 = true;
                    }
                    if (z5 || this.q1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        a(1);
                    }
                    int[] iArr = this.T1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zQ;
                    if (zR) {
                        i = (zQ ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().h(i, 0);
                } else if (actionMasked == 1) {
                    this.s1.clear();
                    a(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.r1);
                    if (iFindPointerIndex >= 0) {
                        int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        if (this.q1 != 1) {
                            int i3 = x2 - this.t1;
                            int i4 = y2 - this.u1;
                            if (!zQ || Math.abs(i3) <= this.x1) {
                                z2 = false;
                            } else {
                                this.v1 = x2;
                                z2 = true;
                            }
                            if (zR && Math.abs(i4) > this.x1) {
                                this.w1 = y2;
                                z2 = true;
                            }
                            if (z2) {
                                setScrollState(1);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    r0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.r1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.v1 = x3;
                    this.t1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.w1 = y3;
                    this.u1 = y3;
                } else if (actionMasked == 6) {
                    e0(motionEvent);
                }
                if (this.q1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int i6 = pif1.a;
        Trace.beginSection("RV OnLayout");
        w();
        Trace.endSection();
        this.X0 = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i3) {
        a aVar = this.Q0;
        if (aVar == null) {
            u(i, i3);
            return;
        }
        boolean Z = aVar.Z();
        boolean z = false;
        s611 s611Var = this.H1;
        if (Z) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.Q0.v0(i, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.X1 = z;
            if (z || this.P0 == null) {
                return;
            }
            if (s611Var.d == 1) {
                x();
            }
            this.Q0.K0(i, i3);
            s611Var.i = true;
            y();
            this.Q0.M0(i, i3);
            if (this.Q0.P0()) {
                this.Q0.K0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                s611Var.i = true;
                y();
                this.Q0.M0(i, i3);
            }
            this.Y1 = getMeasuredWidth();
            this.Z1 = getMeasuredHeight();
            return;
        }
        if (this.W0) {
            this.Q0.v0(i, i3);
            return;
        }
        if (this.d1) {
            z0();
            c0();
            i0();
            d0(true);
            if (s611Var.k) {
                s611Var.g = true;
            } else {
                this.e.g();
                s611Var.g = false;
            }
            this.d1 = false;
            A0(false);
        } else if (s611Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        z511 z511Var = this.P0;
        if (z511Var != null) {
            s611Var.e = z511Var.e();
        } else {
            s611Var.e = 0;
        }
        z0();
        this.Q0.v0(i, i3);
        A0(false);
        s611Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (Y()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p611)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p611 p611Var = (p611) parcelable;
        this.d = p611Var;
        super.onRestoreInstanceState(p611Var.a());
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p611 p611Var = new p611(super.onSaveInstanceState());
        p611 p611Var2 = this.d;
        if (p611Var2 != null) {
            p611Var.b(p611Var2);
            return p611Var;
        }
        a aVar = this.Q0;
        if (aVar != null) {
            p611Var.c = aVar.x0();
            return p611Var;
        }
        p611Var.c = null;
        return p611Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        if (i == i4 && i3 == i5) {
            return;
        }
        this.o1 = null;
        this.m1 = null;
        this.n1 = null;
        this.l1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[PHI: r1
      0x00e2: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:49:0x00cd, B:54:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zK;
        int i;
        boolean z;
        if (!this.a1 && !this.b1) {
            j611 j611Var = this.U0;
            if (j611Var == null) {
                zK = motionEvent.getAction() == 0 ? false : K(motionEvent);
            } else {
                j611Var.f(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.U0 = null;
                }
                zK = true;
            }
            if (zK) {
                r0();
                setScrollState(0);
                return true;
            }
            a aVar = this.Q0;
            if (aVar != null) {
                boolean zQ = aVar.q();
                boolean zR = this.Q0.r();
                if (this.s1 == null) {
                    this.s1 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.T1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.s1.addMovement(motionEventObtain);
                        this.s1.computeCurrentVelocity(1000, this.A1);
                        float f = zQ ? -this.s1.getXVelocity(this.r1) : 0.0f;
                        float f3 = zR ? -this.s1.getYVelocity(this.r1) : 0.0f;
                        if ((f == 0.0f && f3 == 0.0f) || !O((int) f, (int) f3)) {
                            setScrollState(0);
                        }
                        r0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.r1);
                        if (iFindPointerIndex >= 0) {
                            int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            int iMax = this.v1 - x;
                            int iMax2 = this.w1 - y;
                            if (this.q1 != 1) {
                                if (zQ) {
                                    int i3 = this.x1;
                                    iMax = iMax > 0 ? Math.max(0, iMax - i3) : Math.min(0, iMax + i3);
                                    if (iMax != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else {
                                    z = false;
                                }
                                if (zR) {
                                    int i4 = this.x1;
                                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i4) : Math.min(0, iMax2 + i4);
                                    if (iMax2 != 0) {
                                        z = true;
                                    }
                                }
                                if (z) {
                                    setScrollState(1);
                                }
                            }
                            if (this.q1 == 1) {
                                int[] iArr2 = this.U1;
                                iArr2[0] = 0;
                                iArr2[1] = 0;
                                int iL0 = iMax - l0(motionEvent.getY(), iMax);
                                int iM0 = iMax2 - m0(motionEvent.getX(), iMax2);
                                boolean z2 = z(zQ ? iL0 : 0, zR ? iM0 : 0, 0, this.U1, this.S1);
                                int[] iArr3 = this.S1;
                                if (z2) {
                                    iL0 -= iArr2[0];
                                    iM0 -= iArr2[1];
                                    iArr[0] = iArr[0] + iArr3[0];
                                    iArr[1] = iArr[1] + iArr3[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i5 = iL0;
                                int i6 = iM0;
                                this.v1 = x - iArr3[0];
                                this.w1 = y - iArr3[1];
                                if (s0(zQ ? i5 : 0, zR ? i6 : 0, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                d440 d440Var = this.F1;
                                if (d440Var != null && (i5 != 0 || i6 != 0)) {
                                    d440Var.a(this, i5, i6);
                                }
                            }
                        }
                    } else if (actionMasked == 3) {
                        r0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.r1 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.v1 = x2;
                        this.t1 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.w1 = y2;
                        this.u1 = y2;
                    } else if (actionMasked == 6) {
                        e0(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.r1 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.v1 = x3;
                this.t1 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.w1 = y3;
                this.u1 = y3;
                if (zR) {
                    i = zQ;
                    i = (zQ ? 1 : 0) | 2;
                }
                i = zQ;
                getScrollingChildHelper().h(i, 0);
                this.s1.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p0(k611 k611Var) {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            arrayList.remove(k611Var);
        }
    }

    public final void q() {
        p0g p0gVar = this.f;
        int iP = p0gVar.a.p();
        for (int i = 0; i < iP; i++) {
            w611 w611VarU = U(p0gVar.a.o(i));
            if (!w611VarU.C()) {
                w611VarU.d = -1;
                w611VarU.g = -1;
            }
        }
        n611 n611Var = this.c;
        ArrayList arrayList = n611Var.a;
        ArrayList arrayList2 = n611Var.c;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            w611 w611Var = (w611) arrayList2.get(i3);
            w611Var.d = -1;
            w611Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            w611 w611Var2 = (w611) arrayList.get(i4);
            w611Var2.d = -1;
            w611Var2.g = -1;
        }
        ArrayList arrayList3 = n611Var.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                w611 w611Var3 = (w611) n611Var.b.get(i5);
                w611Var3.d = -1;
                w611Var3.g = -1;
            }
        }
    }

    public final void q0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.t;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof g611) {
            g611 g611Var = (g611) layoutParams;
            if (!g611Var.c) {
                Rect rect2 = g611Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.Q0.E0(this, view, this.t, !this.X0, view2 == null);
    }

    public final void r(int i, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.l1.onRelease();
            zIsFinished = this.l1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.n1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.n1.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.m1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.m1.onRelease();
            zIsFinished |= this.m1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.o1.onRelease();
            zIsFinished |= this.o1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    public final void r0() {
        VelocityTracker velocityTracker = this.s1;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        a(0);
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.l1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.m1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.m1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.n1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.o1.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        w611 w611VarU = U(view);
        if (w611VarU != null) {
            if (w611VarU.x()) {
                w611VarU.t &= -257;
            } else if (!w611VarU.C()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(w611VarU);
                q58.i(G(), sb);
                return;
            }
        } else if (b2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            q58.i(G(), sb2);
            return;
        }
        view.clearAnimation();
        v(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        wic0 wic0Var = this.Q0.e;
        if ((wic0Var == null || !wic0Var.g()) && !Y() && view2 != null) {
            q0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.Q0.E0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.T0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((j611) arrayList.get(i)).d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.Y0 != 0 || this.a1) {
            this.Z0 = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[DONT_INVERT, PHI: r7
      0x00f7: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00de, B:31:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    public final boolean s0(int i, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        boolean z;
        t();
        z511 z511Var = this.P0;
        int[] iArr = this.U1;
        if (z511Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            t0(i, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.S0.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        A(i5, i6, i7, i8, this.S1, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z2 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.v1;
        int[] iArr2 = this.S1;
        int i14 = iArr2[0];
        this.v1 = i13 - i14;
        int i15 = this.w1;
        int i16 = iArr2[1];
        this.w1 = i15 - i16;
        int[] iArr3 = this.T1;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !hr80.v(motionEvent, 8194)) {
                float x = motionEvent.getX();
                float f3 = i10;
                float y = motionEvent.getY();
                float f4 = i12;
                if (f3 < 0.0f) {
                    D();
                    f = 0.0f;
                    dm5.W(this.l1, (-f3) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    f = 0.0f;
                    if (f3 > 0.0f) {
                        E();
                        dm5.W(this.n1, f3 / getWidth(), y / getHeight());
                    } else {
                        z = false;
                    }
                    if (f4 < f) {
                        F();
                        dm5.W(this.m1, (-f4) / getHeight(), x / getWidth());
                    } else if (f4 > f) {
                        C();
                        dm5.W(this.o1, f4 / getHeight(), 1.0f - (x / getWidth()));
                    } else if (z || f3 != f || f4 != f) {
                        WeakHashMap weakHashMap = b8k1.a;
                        postInvalidateOnAnimation();
                    }
                    z = true;
                    if (z) {
                        WeakHashMap weakHashMap2 = b8k1.a;
                        postInvalidateOnAnimation();
                    } else {
                        WeakHashMap weakHashMap3 = b8k1.a;
                        postInvalidateOnAnimation();
                    }
                }
                z = true;
                if (f4 < f) {
                    F();
                    dm5.W(this.m1, (-f4) / getHeight(), x / getWidth());
                } else if (f4 > f) {
                    C();
                    dm5.W(this.o1, f4 / getHeight(), 1.0f - (x / getWidth()));
                } else if (z) {
                    WeakHashMap weakHashMap4 = b8k1.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap5 = b8k1.a;
                    postInvalidateOnAnimation();
                }
                z = true;
                if (z) {
                    WeakHashMap weakHashMap6 = b8k1.a;
                    postInvalidateOnAnimation();
                } else {
                    WeakHashMap weakHashMap7 = b8k1.a;
                    postInvalidateOnAnimation();
                }
            }
            r(i, i3);
        }
        if (i5 != 0 || i6 != 0) {
            B(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i5 == 0 && i6 == 0) ? false : true;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i3) {
        a aVar = this.Q0;
        if (aVar == null || this.a1) {
            return;
        }
        boolean zQ = aVar.q();
        boolean zR = this.Q0.r();
        if (zQ || zR) {
            if (!zQ) {
                i = 0;
            }
            if (!zR) {
                i3 = 0;
            }
            s0(i, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i3) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!Y()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iQ = accessibilityEvent != null ? luo1.q(accessibilityEvent) : 0;
            this.c1 |= iQ != 0 ? iQ : 0;
        }
    }

    public void setAccessibilityDelegateCompat(y611 y611Var) {
        this.O1 = y611Var;
        b8k1.p(this, y611Var);
    }

    public void setAdapter(z511 z511Var) {
        setLayoutFrozen(false);
        v0(z511Var, false, true);
        j0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(c611 c611Var) {
        if (c611Var == this.P1) {
            return;
        }
        this.P1 = c611Var;
        setChildrenDrawingOrderEnabled(c611Var != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.o1 = null;
            this.m1 = null;
            this.n1 = null;
            this.l1 = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.X0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(d611 d611Var) {
        d611Var.getClass();
        this.k1 = d611Var;
        this.o1 = null;
        this.m1 = null;
        this.n1 = null;
        this.l1 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.W0 = z;
    }

    public void setItemAnimator(e611 e611Var) {
        e611 e611Var2 = this.p1;
        if (e611Var2 != null) {
            e611Var2.g();
            this.p1.a = null;
        }
        this.p1 = e611Var;
        if (e611Var != null) {
            e611Var.a = this.M1;
        }
    }

    public void setItemViewCacheSize(int i) {
        n611 n611Var = this.c;
        n611Var.e = i;
        n611Var.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(a aVar) {
        vqv0 vqv0Var;
        if (aVar == this.Q0) {
            return;
        }
        B0();
        a aVar2 = this.Q0;
        n611 n611Var = this.c;
        if (aVar2 != null) {
            e611 e611Var = this.p1;
            if (e611Var != null) {
                e611Var.g();
            }
            this.Q0.B0(n611Var);
            this.Q0.C0(n611Var);
            n611Var.a.clear();
            n611Var.g();
            if (this.V0) {
                a aVar3 = this.Q0;
                aVar3.g = false;
                aVar3.h0(this, n611Var);
            }
            this.Q0.N0(null);
            this.Q0 = null;
        } else {
            n611Var.a.clear();
            n611Var.g();
        }
        p0g p0gVar = this.f;
        p0gVar.b.M();
        ArrayList arrayList = p0gVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            vqv0Var = p0gVar.a;
            if (size < 0) {
                break;
            }
            vqv0Var.u((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        vqv0Var.w();
        this.Q0 = aVar;
        if (aVar != null) {
            if (aVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(aVar);
                hhg1.j(sb, " is already attached to a RecyclerView:", aVar.b.G());
                return;
            } else {
                aVar.N0(this);
                if (this.V0) {
                    a aVar4 = this.Q0;
                    aVar4.g = true;
                    aVar4.g0(this);
                }
            }
        }
        n611Var.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            hhg1.n("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(i611 i611Var) {
        this.y1 = i611Var;
    }

    @Deprecated
    public void setOnScrollListener(k611 k611Var) {
        this.I1 = k611Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.D1 = z;
    }

    public void setRecycledViewPool(m611 m611Var) {
        n611 n611Var = this.c;
        RecyclerView recyclerView = n611Var.h;
        n611Var.f(recyclerView.P0, false);
        m611 m611Var2 = n611Var.g;
        if (m611Var2 != null) {
            m611Var2.b--;
        }
        n611Var.g = m611Var;
        if (m611Var != null && recyclerView.getAdapter() != null) {
            n611Var.g.b++;
        }
        n611Var.e();
    }

    public void setScrollState(int i) {
        wic0 wic0Var;
        if (i == this.q1) {
            return;
        }
        if (c2) {
            new Exception();
        }
        this.q1 = i;
        if (i != 2) {
            v611 v611Var = this.E1;
            v611Var.g.removeCallbacks(v611Var);
            v611Var.c.abortAnimation();
            a aVar = this.Q0;
            if (aVar != null && (wic0Var = aVar.e) != null) {
                wic0Var.m();
            }
        }
        a aVar2 = this.Q0;
        if (aVar2 != null) {
            aVar2.y0(i);
        }
        f0(i);
        k611 k611Var = this.I1;
        if (k611Var != null) {
            k611Var.c(this, i);
        }
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k611) this.J1.get(size)).c(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.x1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.x1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(u611 u611Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.a1) {
            n("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.a1 = true;
                this.b1 = true;
                B0();
                return;
            }
            this.a1 = false;
            if (this.Z0 && this.Q0 != null && this.P0 != null) {
                requestLayout();
            }
            this.Z0 = false;
        }
    }

    public final void t() {
        if (!this.X0 || this.g1) {
            int i = pif1.a;
            Trace.beginSection("RV FullInvalidate");
            w();
            Trace.endSection();
            return;
        }
        t01 t01Var = this.e;
        if (t01Var.w()) {
            if (!t01Var.v(4) || t01Var.v(11)) {
                if (t01Var.w()) {
                    int i3 = pif1.a;
                    Trace.beginSection("RV FullInvalidate");
                    w();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = pif1.a;
            Trace.beginSection("RV PartialInvalidate");
            z0();
            c0();
            t01Var.B();
            if (!this.Z0) {
                p0g p0gVar = this.f;
                int iC = p0gVar.c();
                for (int i5 = 0; i5 < iC; i5++) {
                    w611 w611VarU = U(p0gVar.b(i5));
                    if (w611VarU != null && !w611VarU.C() && w611VarU.y()) {
                        w();
                    }
                }
                t01Var.e();
            }
            A0(true);
            d0(true);
            Trace.endSection();
        }
    }

    public final void t0(int i, int i3, int[] iArr) {
        w611 w611Var;
        z0();
        c0();
        int i4 = pif1.a;
        Trace.beginSection("RV Scroll");
        s611 s611Var = this.H1;
        H(s611Var);
        n611 n611Var = this.c;
        int iG0 = i != 0 ? this.Q0.G0(i, n611Var, s611Var) : 0;
        int iI0 = i3 != 0 ? this.Q0.I0(i3, n611Var, s611Var) : 0;
        Trace.endSection();
        p0g p0gVar = this.f;
        int iC = p0gVar.c();
        for (int i5 = 0; i5 < iC; i5++) {
            View viewB = p0gVar.b(i5);
            w611 w611VarT = T(viewB);
            if (w611VarT != null && (w611Var = w611VarT.i) != null) {
                View view = w611Var.a;
                int left = viewB.getLeft();
                int top = viewB.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        d0(true);
        A0(false);
        if (iArr != null) {
            iArr[0] = iG0;
            iArr[1] = iI0;
        }
    }

    public final void u(int i, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = b8k1.a;
        setMeasuredDimension(a.t(i, paddingRight, getMinimumWidth()), a.t(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void u0(int i) {
        if (this.a1) {
            return;
        }
        B0();
        a aVar = this.Q0;
        if (aVar == null) {
            return;
        }
        aVar.H0(i);
        awakenScrollBars();
    }

    public final void v(View view) {
        w611 w611VarU = U(view);
        z511 z511Var = this.P0;
        if (z511Var != null && w611VarU != null) {
            z511Var.u(w611VarU);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h611) this.f1.get(size)).a(view);
            }
        }
    }

    public final void v0(z511 z511Var, boolean z, boolean z2) {
        z511 z511Var2 = this.P0;
        pn pnVar = this.b;
        if (z511Var2 != null) {
            z511Var2.z(pnVar);
            this.P0.r(this);
        }
        n611 n611Var = this.c;
        if (!z || z2) {
            e611 e611Var = this.p1;
            if (e611Var != null) {
                e611Var.g();
            }
            a aVar = this.Q0;
            if (aVar != null) {
                aVar.B0(n611Var);
                this.Q0.C0(n611Var);
            }
            n611Var.a.clear();
            n611Var.g();
        }
        this.e.D();
        z511 z511Var3 = this.P0;
        this.P0 = z511Var;
        if (z511Var != null) {
            z511Var.w(pnVar);
            z511Var.m(this);
        }
        a aVar2 = this.Q0;
        if (aVar2 != null) {
            aVar2.f0(z511Var3, this.P0);
        }
        z511 z511Var4 = this.P0;
        n611Var.a.clear();
        n611Var.g();
        n611Var.f(z511Var3, true);
        m611 m611VarC = n611Var.c();
        if (z511Var3 != null) {
            m611VarC.b--;
        }
        if (!z && m611VarC.b == 0) {
            SparseArray sparseArray = m611VarC.a;
            for (int i = 0; i < sparseArray.size(); i++) {
                l611 l611Var = (l611) sparseArray.valueAt(i);
                Iterator it = l611Var.a.iterator();
                while (it.hasNext()) {
                    p9p1.s(((w611) it.next()).a);
                }
                l611Var.a.clear();
            }
        }
        if (z511Var4 != null) {
            m611VarC.b++;
        } else {
            m611VarC.getClass();
        }
        n611Var.e();
        this.H1.f = true;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x023b  */
    /* JADX WARN: Code duplicated, block: B:127:0x023e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0251  */
    /* JADX WARN: Code duplicated, block: B:135:0x0257  */
    /* JADX WARN: Code duplicated, block: B:138:0x025c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:144:0x026b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0275 A[LOOP:3: B:140:0x0262->B:147:0x0275, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:150:0x027f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0286  */
    /* JADX WARN: Code duplicated, block: B:156:0x0290 A[LOOP:4: B:149:0x027d->B:156:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x0295  */
    /* JADX WARN: Code duplicated, block: B:184:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0293 A[EDGE_INSN: B:188:0x0293->B:157:0x0293 BREAK  A[LOOP:4: B:149:0x027d->B:156:0x0290], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x028e A[SYNTHETIC] */
    public final void w() {
        long j;
        View view;
        w611 w611Var;
        int i;
        int iB;
        int i3;
        int iMin;
        w611 w611VarN;
        View view2;
        w611 w611VarN2;
        View view3;
        int i4;
        View viewFindViewById;
        View view4;
        boolean z;
        int i5;
        if (this.P0 == null || this.Q0 == null) {
            return;
        }
        s611 s611Var = this.H1;
        s611Var.i = false;
        boolean z2 = this.X1 && !(this.Y1 == getWidth() && this.Z1 == getHeight());
        this.Y1 = 0;
        this.Z1 = 0;
        this.X1 = false;
        if (s611Var.d == 1) {
            x();
            this.Q0.J0(this);
            y();
        } else if (this.e.x() || z2 || this.Q0.O0 != getWidth() || this.Q0.P0 != getHeight()) {
            this.Q0.J0(this);
            y();
        } else {
            this.Q0.J0(this);
        }
        s611Var.a(4);
        z0();
        c0();
        s611Var.d = (byte) 1;
        boolean z3 = s611Var.j;
        p0g p0gVar = this.f;
        n611 n611Var = this.c;
        qpj1 qpj1Var = this.g;
        if (z3) {
            for (int iC = p0gVar.c() - 1; iC >= 0; iC--) {
                w611 w611VarU = U(p0gVar.b(iC));
                if (!w611VarU.C()) {
                    long jQ = Q(w611VarU);
                    this.p1.getClass();
                    f3a f3aVar = new f3a(false);
                    f3aVar.m(w611VarU);
                    w611 w611VarQ = qpj1Var.q(jQ);
                    if (w611VarQ == null || w611VarQ.C()) {
                        qpj1Var.i(w611VarU, f3aVar);
                    } else {
                        boolean zS = qpj1Var.s(w611VarQ);
                        boolean zS2 = qpj1Var.s(w611VarU);
                        if (zS && w611VarQ == w611VarU) {
                            qpj1Var.i(w611VarU, f3aVar);
                        } else {
                            f3a f3aVarD = qpj1Var.D(w611VarQ);
                            qpj1Var.i(w611VarU, f3aVar);
                            f3a f3aVarC = qpj1Var.C(w611VarU);
                            if (f3aVarD == null) {
                                int iC2 = p0gVar.c();
                                for (int i6 = 0; i6 < iC2; i6++) {
                                    w611 w611VarU2 = U(p0gVar.b(i6));
                                    if (w611VarU2 != w611VarU && Q(w611VarU2) == jQ) {
                                        z511 z511Var = this.P0;
                                        if (z511Var == null || !z511Var.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(w611VarU2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(w611VarU);
                                            bhn0.h(G(), sb);
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(w611VarU2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(w611VarU);
                                        bhn0.h(G(), sb2);
                                        return;
                                    }
                                }
                                Objects.toString(w611VarQ);
                                Objects.toString(w611VarU);
                                G();
                            } else {
                                w611VarQ.B(false);
                                if (zS) {
                                    i(w611VarQ);
                                }
                                if (w611VarQ != w611VarU) {
                                    if (zS2) {
                                        i(w611VarU);
                                    }
                                    w611VarQ.h = w611VarU;
                                    i(w611VarQ);
                                    n611Var.n(w611VarQ);
                                    w611VarU.B(false);
                                    w611VarU.i = w611VarQ;
                                }
                                if (this.p1.a(w611VarQ, w611VarU, f3aVarD, f3aVarC)) {
                                    h0();
                                }
                            }
                        }
                    }
                }
            }
            qpj1Var.E(this.a2);
        }
        this.Q0.C0(n611Var);
        s611Var.b = s611Var.e;
        this.g1 = false;
        this.h1 = false;
        s611Var.j = false;
        s611Var.k = false;
        this.Q0.f = false;
        ArrayList arrayList = n611Var.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        a aVar = this.Q0;
        if (aVar.Y) {
            aVar.X = 0;
            aVar.Y = false;
            n611Var.o();
        }
        this.Q0.u0(s611Var);
        d0(true);
        A0(false);
        qpj1Var.k();
        int[] iArr = this.Q1;
        int i7 = iArr[0];
        int i8 = iArr[1];
        L(iArr);
        if (iArr[0] != i7 || iArr[1] != i8) {
            B(0, 0);
        }
        if (this.D1 && this.P0 != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = s611Var.m;
                view = null;
                if (j == -1) {
                    w611Var = null;
                } else {
                    w611Var = null;
                }
                if (w611Var != null) {
                    view4 = w611Var.a;
                    if (!p0gVar.c.contains(view4)) {
                        if (p0gVar.c() > 0) {
                            i = s611Var.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = s611Var.b();
                            i3 = i;
                            while (true) {
                                if (i3 < iB) {
                                    w611VarN2 = N(i3);
                                    if (w611VarN2 != null) {
                                        view3 = w611VarN2.a;
                                        if (view3.hasFocusable()) {
                                            view = view3;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    w611VarN = N(iMin);
                                    if (w611VarN == null) {
                                        break;
                                        break;
                                    }
                                    view2 = w611VarN.a;
                                    if (view2.hasFocusable()) {
                                        view = view2;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (p0gVar.c() > 0) {
                        i = s611Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = s611Var.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                w611VarN2 = N(i3);
                                if (w611VarN2 != null) {
                                    view3 = w611VarN2.a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                w611VarN = N(iMin);
                                if (w611VarN == null) {
                                    break;
                                    break;
                                }
                                view2 = w611VarN.a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (p0gVar.c() > 0) {
                    i = s611Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = s611Var.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            w611VarN2 = N(i3);
                            if (w611VarN2 != null) {
                                view3 = w611VarN2.a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            w611VarN = N(iMin);
                            if (w611VarN == null) {
                                break;
                                break;
                            }
                            view2 = w611VarN.a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i4 = s611Var.n;
                    if (i4 != -1) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            } else if (p0gVar.c.contains(getFocusedChild())) {
                j = s611Var.m;
                view = null;
                if (j == -1 && (z = this.P0.b) && z) {
                    int iP = p0gVar.a.p();
                    int i9 = 0;
                    w611Var = null;
                    while (i9 < iP) {
                        w611 w611VarU3 = U(p0gVar.a.o(i9));
                        if (w611VarU3 == null || w611VarU3.v()) {
                            i5 = iP;
                        } else {
                            i5 = iP;
                            if (w611VarU3.e != j) {
                                continue;
                            } else {
                                if (!p0gVar.c.contains(w611VarU3.a)) {
                                    w611Var = w611VarU3;
                                    break;
                                }
                                w611Var = w611VarU3;
                            }
                        }
                        i9++;
                        iP = i5;
                    }
                } else {
                    w611Var = null;
                }
                if (w611Var != null) {
                    view4 = w611Var.a;
                    if (!p0gVar.c.contains(view4) && view4.hasFocusable()) {
                        view = view4;
                    } else if (p0gVar.c() > 0) {
                        i = s611Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = s611Var.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                w611VarN2 = N(i3);
                                if (w611VarN2 != null) {
                                    view3 = w611VarN2.a;
                                    if (view3.hasFocusable()) {
                                        view = view3;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                w611VarN = N(iMin);
                                if (w611VarN == null) {
                                    break;
                                }
                                view2 = w611VarN.a;
                                if (view2.hasFocusable()) {
                                    view = view2;
                                    break;
                                }
                            }
                        }
                    }
                } else if (p0gVar.c() > 0) {
                    i = s611Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = s611Var.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            w611VarN2 = N(i3);
                            if (w611VarN2 != null) {
                                view3 = w611VarN2.a;
                                if (view3.hasFocusable()) {
                                    view = view3;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            w611VarN = N(iMin);
                            if (w611VarN == null) {
                                break;
                                break;
                            }
                            view2 = w611VarN.a;
                            if (view2.hasFocusable()) {
                                view = view2;
                                break;
                            }
                        }
                    }
                }
                if (view != null) {
                    i4 = s611Var.n;
                    if (i4 != -1 && (viewFindViewById = view.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view = viewFindViewById;
                    }
                    view.requestFocus();
                }
            }
        }
        s611Var.m = -1L;
        s611Var.l = -1;
        s611Var.n = -1;
    }

    public final boolean w0(EdgeEffect edgeEffect, int i, int i3) {
        if (i > 0) {
            return true;
        }
        float fN = dm5.N(edgeEffect) * i3;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = e2;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fN;
    }

    public final void x() {
        View viewI;
        s611 s611Var = this.H1;
        s611Var.a(1);
        H(s611Var);
        s611Var.i = false;
        z0();
        qpj1 qpj1Var = this.g;
        qpj1Var.k();
        c0();
        i0();
        w611 w611VarT = null;
        View focusedChild = (this.D1 && hasFocus() && this.P0 != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewI = I(focusedChild)) != null) {
            w611VarT = T(viewI);
        }
        if (w611VarT == null) {
            s611Var.m = -1L;
            s611Var.l = -1;
            s611Var.n = -1;
        } else {
            s611Var.m = this.P0.b ? w611VarT.e : -1L;
            s611Var.l = this.g1 ? -1 : w611VarT.v() ? w611VarT.d : w611VarT.m();
            View focusedChild2 = w611VarT.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            s611Var.n = id;
        }
        s611Var.h = s611Var.j && this.L1;
        this.L1 = false;
        this.K1 = false;
        s611Var.g = s611Var.k;
        s611Var.e = this.P0.e();
        L(this.Q1);
        boolean z = s611Var.j;
        p0g p0gVar = this.f;
        if (z) {
            int iC = p0gVar.c();
            for (int i = 0; i < iC; i++) {
                w611 w611VarU = U(p0gVar.b(i));
                if (!w611VarU.C() && (!w611VarU.t() || this.P0.b)) {
                    e611 e611Var = this.p1;
                    e611.b(w611VarU);
                    w611VarU.p();
                    e611Var.getClass();
                    f3a f3aVar = new f3a(false);
                    f3aVar.m(w611VarU);
                    qpj1Var.j(w611VarU, f3aVar);
                    if (s611Var.h && w611VarU.y() && !w611VarU.v() && !w611VarU.C() && !w611VarU.t()) {
                        qpj1Var.h(Q(w611VarU), w611VarU);
                    }
                }
            }
        }
        if (s611Var.k) {
            int iP = p0gVar.a.p();
            for (int i3 = 0; i3 < iP; i3++) {
                w611 w611VarU2 = U(p0gVar.a.o(i3));
                if (b2 && w611VarU2.c == -1 && !w611VarU2.v()) {
                    eg.m("view holder cannot have position -1 unless it is removed".concat(G()));
                    return;
                }
                if (!w611VarU2.C() && w611VarU2.d == -1) {
                    w611VarU2.d = w611VarU2.c;
                }
            }
            boolean z2 = s611Var.f;
            s611Var.f = false;
            this.Q0.t0(this.c, s611Var);
            s611Var.f = z2;
            for (int i4 = 0; i4 < p0gVar.c(); i4++) {
                w611 w611VarU3 = U(p0gVar.b(i4));
                if (!w611VarU3.C() && !qpj1Var.u(w611VarU3)) {
                    e611.b(w611VarU3);
                    boolean z3 = (w611VarU3.t & 8192) != 0;
                    e611 e611Var2 = this.p1;
                    w611VarU3.p();
                    e611Var2.getClass();
                    f3a f3aVar2 = new f3a(false);
                    f3aVar2.m(w611VarU3);
                    if (z3) {
                        k0(w611VarU3, f3aVar2);
                    } else {
                        qpj1Var.f(w611VarU3, f3aVar2);
                    }
                }
            }
            q();
        } else {
            q();
        }
        d0(true);
        A0(false);
        s611Var.d = (byte) 2;
    }

    public final void x0(int i, int i3, Interpolator interpolator, boolean z) {
        a aVar = this.Q0;
        if (aVar == null || this.a1) {
            return;
        }
        if (!aVar.q()) {
            i = 0;
        }
        if (!this.Q0.r()) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i3 != 0) {
                i4 |= 2;
            }
            getScrollingChildHelper().h(i4, 1);
        }
        this.E1.c(i, i3, Integer.MIN_VALUE, interpolator);
    }

    public final void y() {
        z0();
        c0();
        s611 s611Var = this.H1;
        s611Var.a(6);
        this.e.g();
        s611Var.e = this.P0.e();
        s611Var.c = 0;
        if (this.d != null) {
            z511 z511Var = this.P0;
            int iC = l1d.C(z511Var.c);
            if (iC == 1 ? z511Var.e() > 0 : iC != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.Q0.w0(parcelable);
                }
                this.d = null;
            }
        }
        s611Var.g = false;
        this.Q0.t0(this.c, s611Var);
        s611Var.f = false;
        s611Var.j = s611Var.j && this.p1 != null;
        s611Var.d = (byte) 4;
        d0(true);
        A0(false);
    }

    public void y0(int i) {
        a aVar;
        if (this.a1 || (aVar = this.Q0) == null) {
            return;
        }
        aVar.R0(this, this.H1, i);
    }

    public final boolean z(int i, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, i4, iArr, iArr2);
    }

    public final void z0() {
        int i = this.Y0 + 1;
        this.Y0 = i;
        if (i != 1 || this.a1) {
            return;
        }
        this.Z0 = false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a aVar = this.Q0;
        if (aVar != null) {
            return aVar.G(layoutParams);
        }
        eg.m("RecyclerView has no LayoutManager".concat(G()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(o611 o611Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970134);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
