package p;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class o6 extends ViewGroup {
    public static final /* synthetic */ int t = 0;
    public WeakReference a;
    public IBinder b;
    public m8m1 c;
    public v3k d;
    public qzj e;
    public Function0 f;
    public boolean g;
    public boolean h;
    public boolean i;

    public o6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.f = i5x0.V0.c(this);
    }

    private final void setParentContext(v3k v3kVar) {
        if (this.d != v3kVar) {
            this.d = v3kVar;
            if (v3kVar != null) {
                this.a = null;
            }
            m8m1 m8m1Var = this.c;
            if (m8m1Var != null) {
                m8m1Var.dispose();
                this.c = null;
                if (isAttachedToWindow()) {
                    r();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.b != iBinder) {
            this.b = iBinder;
            this.a = null;
        }
    }

    public abstract void a(b0k b0kVar, int i);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        e();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void b() {
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.e == null) {
                ha4 ha4Var = null;
                if (getChildCount() != 0) {
                    View childAt = getChildAt(0);
                    if (childAt instanceof ha4) {
                        ha4Var = (ha4) childAt;
                    }
                }
                if (ha4Var != null) {
                    ha4Var.setComposeViewContext(w(c97.g(this), ha4Var.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                r();
            }
        }
    }

    public final void e() {
        if (this.h) {
            return;
        }
        hhg1.h(f4i1.f("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m33getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(2131427650);
        zr8 zr8Var = tag instanceof zr8 ? (zr8) tag : null;
        if (zr8Var != null) {
            return zr8Var.b();
        }
        return 1;
    }

    public final qzj getComposeViewContext$ui() {
        return this.e;
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.i || super.isTransitionGroup();
    }

    public final void k() {
        qzj qzjVar;
        if (this.d != null || isAttachedToWindow() || ((qzjVar = this.e) != null && qzjVar.a.isAttachedToWindow())) {
            r();
        } else {
            eg.m("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void l() {
        View childAt = getChildAt(0);
        ha4 ha4Var = childAt instanceof ha4 ? (ha4) childAt : null;
        if (ha4Var != null && ha4Var.d2) {
            ha4Var.getComposeViewContext().b();
            ha4Var.d2 = false;
        }
        m8m1 m8m1Var = this.c;
        if (m8m1Var != null) {
            m8m1Var.dispose();
        }
        this.c = null;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        nen0 nen0Var = gtl1.a;
        Object objP = dm5.P(this);
        View view = this;
        while (objP instanceof View) {
            View view2 = (View) objP;
            if (view2.getId() == 16908290) {
                break;
            }
            view = view2;
            objP = view2.getParent();
        }
        if (view.getParent() == null) {
            getHandler().postAtFrontOfQueue(new n6(this, (byte) 0));
        } else {
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        s(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        r();
        t(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void r() {
        if (this.c == null) {
            byte b = 0;
            try {
                this.h = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    qzj qzjVarU = this.e;
                    if (qzjVarU == null) {
                        qzjVarU = u();
                    }
                    this.c = ljm1.a(this, qzjVarU, apo.j(1003123809, new m6(this, b), true));
                    Trace.endSection();
                    this.h = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.h = false;
                throw th2;
            }
        }
    }

    public void s(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m34setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(2131427650, zr8.a(i));
    }

    public final void setComposeViewContext$ui(qzj qzjVar) {
        if (this.e != qzjVar) {
            if (qzjVar == null) {
                l();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                ha4 ha4Var = childAt instanceof ha4 ? (ha4) childAt : null;
                if (ha4Var != null) {
                    if (ha4Var.getCoroutineContext() != qzjVar.c().k()) {
                        l();
                    }
                    ha4Var.setComposeViewContext(qzjVar);
                }
            }
            this.e = qzjVar;
        }
    }

    public final void setParentCompositionContext(v3k v3kVar) {
        setParentContext(v3kVar);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.g = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ha4) ((oxq0) childAt)).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.i = true;
    }

    public final void setViewCompositionStrategy(d8k1 d8k1Var) {
        Function0 function0 = this.f;
        if (function0 != null) {
            function0.invoke();
        }
        this.f = d8k1Var.c(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final qzj u() {
        qzj composeViewContext;
        sck1 sck1Var;
        sck1 sck1Var2 = null;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            ha4 ha4Var = childAt instanceof ha4 ? (ha4) childAt : null;
            if (ha4Var != null) {
                composeViewContext = ha4Var.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewG = c97.g(this);
        qzj qzjVarQ = c97.q(viewG);
        if (qzjVarQ != null) {
            return w(viewG, qzjVarQ);
        }
        v3k v3kVarV = v();
        iac0 iac0VarH = x9p1.h(viewG);
        if (iac0VarH == null) {
            iac0VarH = composeViewContext != null ? composeViewContext.d() : null;
            if (iac0VarH == null) {
                eg.m("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        iac0 iac0Var = iac0VarH;
        qe41 qe41VarW = hm5.w(viewG);
        if (qe41VarW == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                qe41VarW = composeViewContext.e;
                qe41VarW.getClass();
            } else {
                qe41VarW = null;
            }
            if (qe41VarW == null) {
                eg.m("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        qe41 qe41Var = qe41VarW;
        sck1 sck1VarK = lap1.k(viewG);
        if (sck1VarK == null) {
            if (composeViewContext != null) {
                composeViewContext.g();
                sck1Var2 = composeViewContext.f;
            }
            sck1Var = sck1Var2;
        } else {
            sck1Var = sck1VarK;
        }
        qzj qzjVar = new qzj(c97.o(viewG), viewG, v3kVarV, iac0Var, qe41Var, sck1Var);
        c97.u(viewG, qzjVar);
        return qzjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p.v3k] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.v3k] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.v3k] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [p.p311] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    public final v3k v() {
        v3k v3kVar;
        ?? A = this.d;
        if (A == 0) {
            A = gtl1.a(this);
            if (A == 0) {
                Object parent = getParent();
                while (true) {
                    if (A != 0 || !(parent instanceof View)) {
                        A = A;
                        break;
                    }
                    A = A;
                    View view = (View) parent;
                    v3k v3kVarA = gtl1.a(view);
                    parent = dm5.P(view);
                    A = v3kVarA;
                }
            }
            l311 l311Var = l311.b;
            if (A != 0) {
                ?? r3 = (!(A instanceof p311) || ((l311) ((p311) A).v.getValue()).compareTo(l311Var) > 0) ? A : 0;
                if (r3 != 0) {
                    this.a = new WeakReference(r3);
                }
            } else {
                A = 0;
            }
            if (A == 0) {
                WeakReference weakReference = this.a;
                if (weakReference == null || (v3kVar = (v3k) weakReference.get()) == null || ((v3kVar instanceof p311) && ((l311) ((p311) v3kVar).v.getValue()).compareTo(l311Var) <= 0)) {
                    A = v3kVar;
                    A = v3kVar;
                    A = 0;
                }
                if (A == 0) {
                    A = gtl1.b(this);
                    ?? r2 = ((l311) A.v.getValue()).compareTo(l311Var) > 0 ? A : 0;
                    if (r2 != 0) {
                        this.a = new WeakReference(r2);
                    }
                }
            }
        }
        return A;
    }

    public final qzj w(View view, qzj qzjVar) {
        v3k v3kVarV = v();
        iac0 iac0VarH = x9p1.h(view);
        sck1 sck1VarK = lap1.k(view);
        qe41 qe41VarW = hm5.w(view);
        if (v3kVarV == qzjVar.c() && iac0VarH == qzjVar.d()) {
            qzjVar.g();
            if (sck1VarK == qzjVar.f) {
                qzjVar.g();
                qe41 qe41Var = qzjVar.e;
                qe41Var.getClass();
                if (qe41VarW == qe41Var) {
                    return qzjVar;
                }
            }
        }
        if (v3kVarV.k() != qzjVar.c().k()) {
            l();
        }
        if (iac0VarH == null) {
            iac0VarH = qzjVar.d();
        }
        iac0 iac0Var = iac0VarH;
        if (qe41VarW == null) {
            qzjVar.g();
            qe41VarW = qzjVar.e;
            qe41VarW.getClass();
        }
        qzj qzjVar2 = new qzj(qzjVar, view, v3kVarV, iac0Var, qe41VarW, sck1VarK);
        c97.u(view, qzjVar2);
        return qzjVar2;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        e();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        e();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        e();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        e();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public /* synthetic */ o6(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
