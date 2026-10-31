package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ges extends ConstraintLayout {
    public final a680 T0;
    public final j6t0 U0;
    public final dzp0 V0;
    public final qkn0 W0;
    public final ix7 X0;
    public final boolean Y0;
    public o5e0 Z0;
    public final kdn0 a1;
    public l5r0 b1;
    public boolean c1;
    public boolean d1;
    public View e1;
    public l6s f1;
    public final ViewGroup g1;
    public final q1d h1;
    public final lvc1 i1;
    public uk4 j1;
    public final uk4 k1;
    public final uk4 l1;
    public final boolean m1;
    public final wu30 n1;
    public boolean o1;
    public k241 p1;
    public final bes q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ges(Context context, a680 a680Var, qkn0 qkn0Var, ix7 ix7Var, an90 an90Var, lyg lygVar, boolean z, aye1 aye1Var, aye1 aye1Var2, boolean z2, u5b u5bVar) {
        super(context);
        context.getClass();
        dj20.p();
        k5e0 k5e0Var = k5e0.a;
        this.Z0 = k5e0Var;
        this.a1 = new kdn0(k5e0Var);
        this.h1 = new q1d(this, (byte) 1);
        this.q1 = new bes(this);
        this.W0 = qkn0Var;
        if (qkn0Var != null) {
            qkn0Var.p();
        }
        LayoutInflater.from(context).inflate(2131625356, (ViewGroup) this);
        setId(2131430274);
        this.g1 = (ViewGroup) findViewById(2131428203);
        this.i1 = v9c.d(findViewById(2131431392), new hx4(this, (byte) 24));
        if (qkn0Var != null) {
            qkn0Var.o();
        }
        this.T0 = a680Var;
        if (((u6e0) a680Var.c) == null) {
            ((wu30) a680Var.b).getClass();
        }
        ((qsw0) a680Var.a).getClass();
        this.U0 = (j6t0) ((qsw0) a680Var.a).get();
        this.V0 = new dzp0(getResources(), aye1Var, aye1Var2, (byte) 2);
        this.X0 = ix7Var;
        this.Y0 = z;
        this.m1 = z2;
        this.n1 = u5bVar;
        this.k1 = new uk4(this, an90Var, (byte) 18);
        this.l1 = new uk4(this, lygVar, (byte) 19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void setState(o5e0 o5e0Var) {
        o5e0 o5e0VarQ;
        l5r0 l5r0VarC;
        i5w0 i5w0Var;
        j6t0 j6t0Var = this.U0;
        o5e0Var.getClass();
        if (o5e0Var.getClass() == this.Z0.getClass()) {
            return;
        }
        o5e0 o5e0Var2 = this.Z0;
        qkn0 qkn0Var = this.W0;
        if (qkn0Var != null) {
            if (o5e0Var.b()) {
                qkn0Var.l();
            } else {
                if ((o5e0Var.h() || o5e0Var.a() || o5e0Var.e() || o5e0Var.d() || o5e0Var.g()) && (o5e0Var2 == null || !o5e0Var2.b())) {
                    qkn0Var.l();
                }
                if (o5e0Var.h()) {
                    qkn0Var.k();
                } else if (o5e0Var.a() || o5e0Var.e() || o5e0Var.d() || o5e0Var.g()) {
                    qkn0Var.j();
                }
                aiq0.a(this, new sjj1(new j6(this, (byte) 18), this, (byte) 2));
            }
        }
        try {
            l5r0VarC = C(o5e0Var);
            o5e0VarQ = o5e0Var;
        } catch (Exception e) {
            o5e0VarQ = dj20.q(e);
            l5r0VarC = j6t0Var;
        }
        if (qkn0Var != null && ((o5e0VarQ instanceof f5e0) || (o5e0VarQ instanceof m5e0))) {
            qkn0Var.i();
        }
        boolean zH = o5e0VarQ.h();
        ViewGroup viewGroup = this.g1;
        if (zH || o5e0VarQ.a() || o5e0VarQ.g()) {
            zpn1.o(viewGroup);
        } else if (!this.Y0 || this.b1 != null) {
            zpn1.p(viewGroup);
        }
        l5r0 l5r0Var = this.b1;
        if (l5r0VarC == l5r0Var) {
            this.Z0 = o5e0VarQ;
        } else {
            if (l5r0Var != null) {
                B();
                if (this.c1) {
                    viewGroup.removeView(this.e1);
                    this.e1 = null;
                    this.c1 = false;
                }
                this.b1 = null;
            }
            this.Z0 = o5e0VarQ;
            this.b1 = l5r0VarC;
            if (!this.c1) {
                Context context = getContext();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                l6s l6sVar = this.f1;
                l5r0VarC.e(context, l6sVar != null ? (Bundle) l6sVar.b : null, layoutInflaterFrom, viewGroup);
                l5r0 l5r0Var2 = this.b1;
                View view = l5r0Var2.getView();
                ViewParent parent = view.getParent();
                if (parent != null) {
                    Class<?> cls = parent.getClass();
                    Class<?> cls2 = l5r0Var2.getClass();
                    IllegalStateException illegalStateException = new IllegalStateException("PageElement's view already has a parent.");
                    StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 4];
                    System.arraycopy(stackTrace, 0, stackTraceElementArr, 4, stackTrace.length);
                    stackTraceElementArr[0] = new StackTraceElement(cls.getName(), "", "", 0);
                    stackTraceElementArr[1] = new StackTraceElement("[[ The view is attached to a parent of type ↑↑ ]]", "", "", 0);
                    stackTraceElementArr[2] = new StackTraceElement(cls2.getName(), "", "", 0);
                    stackTraceElementArr[3] = new StackTraceElement("[[ The concrete PageElement implementation ↑↑ ]]", "", "", 0);
                    illegalStateException.setStackTrace(stackTraceElementArr);
                    throw illegalStateException;
                }
                viewGroup.addView(view);
                this.e1 = view;
                this.c1 = true;
            }
            A();
        }
        if (this.b1 == j6t0Var) {
            j6t0Var.a(o5e0VarQ.b());
        } else if (o5e0VarQ.h() || o5e0VarQ.a() || o5e0VarQ.g()) {
            j6t0Var.a(false);
        }
        dzp0 dzp0Var = this.V0;
        Resources resources = (Resources) dzp0Var.b;
        k5e0 k5e0Var = k5e0.a;
        boolean zEquals = o5e0VarQ.equals(k5e0Var);
        j5e0 j5e0Var = j5e0.a;
        h5e0 h5e0Var = h5e0.a;
        i5w0 i5w0VarD = j5.a;
        if (zEquals || o5e0VarQ.equals(h5e0Var) || (o5e0VarQ instanceof f5e0) || o5e0VarQ.equals(j5e0Var) || (o5e0VarQ instanceof c5e0) || (o5e0VarQ instanceof l5e0)) {
            i5w0Var = i5w0VarD;
        } else if (o5e0VarQ instanceof i5e0) {
            g7o0 g7o0Var = ((i5e0) o5e0VarQ).b;
            aye1 aye1Var = (aye1) dzp0Var.c;
            if (aye1Var == null) {
                int iOrdinal = g7o0Var.ordinal();
                if (iOrdinal == 0) {
                    aye1Var = new aye1(resources.getString(2131959528), resources.getString(2131959527));
                } else if (iOrdinal == 1) {
                    aye1Var = new aye1(resources.getString(2131959523), resources.getString(2131959522));
                } else if (iOrdinal == 2) {
                    aye1Var = new aye1(resources.getString(2131959530), resources.getString(2131959529));
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    aye1Var = new aye1(resources.getString(2131959532), resources.getString(2131959531));
                }
            }
            i5w0Var = new i5w0(aye1Var);
        } else {
            if (!(o5e0VarQ instanceof m5e0)) {
                eg.o();
                return;
            }
            aye1 aye1Var2 = (aye1) dzp0Var.d;
            if (aye1Var2 == null) {
                aye1Var2 = new aye1(resources.getString(2131959535), resources.getString(2131959534));
            }
            i5w0Var = new i5w0(aye1Var2);
        }
        Resources resources2 = (Resources) dzp0Var.b;
        if (!o5e0VarQ.equals(k5e0Var) && !o5e0VarQ.equals(h5e0Var) && !(o5e0VarQ instanceof f5e0) && !o5e0VarQ.equals(j5e0Var) && !(o5e0VarQ instanceof c5e0) && !(o5e0VarQ instanceof l5e0)) {
            if (o5e0VarQ instanceof i5e0) {
                int iOrdinal2 = ((i5e0) o5e0VarQ).b.ordinal();
                if (iOrdinal2 == 0) {
                    i5w0VarD = spq0.d(resources2.getString(2131959526));
                } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                    i5w0VarD = spq0.a(Build.VERSION.SDK_INT >= 29 ? resources2.getString(2131959525) : null);
                } else {
                    if (iOrdinal2 != 3) {
                        eg.o();
                        return;
                    }
                    i5w0VarD = spq0.d(resources2.getString(2131959524));
                }
            } else {
                if (!(o5e0VarQ instanceof m5e0)) {
                    eg.o();
                    return;
                }
                i5w0VarD = spq0.d(resources2.getString(2131959533));
            }
        }
        String str = (String) i5w0VarD.h();
        boolean zC = i5w0Var.c();
        lvc1 lvc1Var = this.i1;
        if (zC) {
            lvc1Var.M((aye1) i5w0Var.b(), str);
            if (this.X0 != null) {
                o5e0VarQ.i(new aes((byte) 0), new aes((byte) 1), new aes((byte) 2), new aes((byte) 3), new aes((byte) 4), new ces(this, (byte) 0), new aes((byte) 5), new ces(this, (byte) 1));
            }
        } else {
            lvc1Var.A();
        }
        if (qkn0Var != null && ((o5e0VarQ instanceof f5e0) || (o5e0VarQ instanceof m5e0))) {
            qkn0Var.h();
        }
        this.a1.m(o5e0VarQ);
    }

    public static void z(o5e0 o5e0Var, Object obj) {
        if (obj != null) {
            return;
        }
        eg.m(f4i1.f("factory for ", String.valueOf(o5e0Var), " is not specified"));
    }

    public final void A() {
        Bundle bundle;
        if (!this.o1 || this.d1) {
            return;
        }
        if (this.f1 != null && this.Z0.h()) {
            ViewGroup viewGroup = this.g1;
            if (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                try {
                    childAt.restoreHierarchyState((SparseArray) this.f1.a);
                } catch (Exception e) {
                    t8p1.i(childAt);
                    bhn0.o("Failed to restore, but also failed to find the conflicting ids", e);
                    return;
                }
            }
            l5r0 l5r0Var = this.b1;
            if ((l5r0Var instanceof lqb1) && (bundle = (Bundle) this.f1.b) != null) {
                ((lqb1) l5r0Var).d(bundle);
            }
            this.f1 = null;
        }
        this.b1.start();
        this.d1 = true;
    }

    public final void B() {
        if (this.d1) {
            D();
            this.b1.stop();
            this.d1 = false;
        }
    }

    public final l5r0 C(o5e0 o5e0Var) {
        return (l5r0) o5e0Var.f(new zds(this, (byte) 5), new zds(this, (byte) 6), new zds(this, (byte) 7), new zds(this, (byte) 0), new zds(this, (byte) 1), new zds(this, (byte) 2), new zds(this, (byte) 3), new zds(this, (byte) 4));
    }

    public final void D() {
        if (this.Z0.h()) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ViewGroup viewGroup = this.g1;
            if (viewGroup.getChildCount() > 0) {
                viewGroup.getChildAt(0).saveHierarchyState(sparseArray);
            }
            l5r0 l5r0Var = this.b1;
            Bundle bundleF = l5r0Var instanceof lqb1 ? ((lqb1) l5r0Var).f() : null;
            wu30 wu30Var = this.n1;
            this.f1 = new l6s(sparseArray, bundleF, wu30Var != null ? (Bundle) wu30Var.apply(rih1.a) : null);
        }
    }

    public final void E(iac0 iac0Var, k241 k241Var) {
        k241Var.getClass();
        k241 k241Var2 = this.p1;
        q1d q1dVar = this.h1;
        if (k241Var2 != null) {
            k241Var2.b.k(q1dVar);
        }
        this.p1 = k241Var;
        this.j1 = new uk4(this, k241Var, (byte) 17);
        if (this.Y0) {
            dj20.l();
            setState(h5e0.a);
        }
        k241Var.b.g(q1dVar);
        iac0Var.getLifecycle().a(this.q1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public l5r0 getCurrentPageElement() {
        return this.b1;
    }

    public ymd0 getRenderedState() {
        return this.a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        qkn0 qkn0Var = this.W0;
        if (qkn0Var != null) {
            qkn0Var.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        if (this.b1 != null) {
            B();
            if (this.c1) {
                this.g1.removeView(this.e1);
                this.e1 = null;
                this.c1 = false;
            }
        }
        qkn0 qkn0Var = this.W0;
        if (qkn0Var != null) {
            qkn0Var.q();
        }
        k241 k241Var = this.p1;
        if (k241Var != null) {
            k241Var.b.k(this.h1);
            this.p1 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle;
        fes fesVar = (fes) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(fesVar.getSuperState());
        qkn0 qkn0Var = this.W0;
        if (qkn0Var != null && (bundle = fesVar.b) != null) {
            qkn0Var.m(bundle);
        }
        this.f1 = fesVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Parcelable onSaveInstanceState() {
        fes fesVar = new fes(super/*android.view.View*/.onSaveInstanceState());
        D();
        fesVar.a = this.f1;
        qkn0 qkn0Var = this.W0;
        if (qkn0Var != null) {
            fesVar.b = qkn0Var.n();
        }
        return fesVar;
    }
}
