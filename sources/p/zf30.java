package p;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class zf30 implements ComponentCallbacks, View.OnCreateContextMenuListener, iac0, sck1, ot50, qe41, ch0 {
    public static final Object E1 = new Object();
    public final AtomicInteger A1;
    public final ArrayList B1;
    public final rf30 C1;
    public final tf30 D1;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public th30 U0;
    public tg30 V0;
    public ai30 W0;
    public boolean X;
    public zf30 X0;
    public boolean Y;
    public int Y0;
    public boolean Z;
    public int Z0;
    public int a;
    public String a1;
    public Bundle b;
    public boolean b1;
    public SparseArray c;
    public boolean c1;
    public Bundle d;
    public boolean d1;
    public String e;
    public boolean e1;
    public Bundle f;
    public boolean f1;
    public zf30 g;
    public final boolean g1;
    public String h;
    public boolean h1;
    public int i;
    public ViewGroup i1;
    public View j1;
    public boolean k1;
    public boolean l1;
    public vf30 m1;
    public boolean n1;
    public LayoutInflater o1;
    public boolean p1;
    public String q1;
    public w8c0 r1;
    public tac0 s1;
    public Boolean t;
    public final dbm t1;
    public lj30 u1;
    public final kdn0 v1;
    public we41 w1;
    public nt21 x1;
    public final int y1;
    public final j3v z1;

    public zf30() {
        this.a = -1;
        this.e = UUID.randomUUID().toString();
        this.h = null;
        this.t = null;
        this.W0 = new ai30();
        this.g1 = true;
        this.l1 = true;
        new a6n(this, (byte) 23);
        this.r1 = w8c0.e;
        this.t1 = new dbm((byte) 0);
        this.v1 = new kdn0();
        this.z1 = new j3v(this, (byte) 22);
        this.A1 = new AtomicInteger();
        this.B1 = new ArrayList();
        this.C1 = new rf30(this);
        this.D1 = new tf30(this);
        o0();
    }

    public void A0() {
        this.h1 = true;
    }

    public LayoutInflater B0(Bundle bundle) {
        tg30 tg30Var = this.V0;
        if (tg30Var == null) {
            eg.m("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterN0 = tg30Var.n0();
        tho1.t(layoutInflaterN0, this.W0.f);
        return layoutInflaterN0;
    }

    public void C0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.h1 = true;
        tg30 tg30Var = this.V0;
        if ((tg30Var == null ? null : tg30Var.d) != null) {
            this.h1 = true;
        }
    }

    public void D0() {
        this.h1 = true;
    }

    public void E0() {
        this.h1 = true;
    }

    public void G0() {
        this.h1 = true;
    }

    public Activity H() {
        return f0();
    }

    public void H0() {
        this.h1 = true;
    }

    public void J0(Bundle bundle) {
        this.h1 = true;
    }

    public void K0(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.W0.W();
        this.S0 = true;
        this.u1 = new lj30(this, o(), new n6(this, (byte) 7));
        this.z1.f(new Runnable() { // from class: p.sf30
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup2 = viewGroup;
                Bundle bundle2 = bundle;
                zf30 zf30Var = this.a;
                zf30Var.j1 = zf30Var.x0(layoutInflater, viewGroup2, bundle2);
            }
        }, "Fragment#onCreateView");
        View view = this.j1;
        lj30 lj30Var = this.u1;
        if (view == null) {
            if (lj30Var.e == null) {
                this.u1 = null;
                return;
            } else {
                eg.m("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        lj30Var.b();
        if (th30.P(3)) {
            Objects.toString(this.j1);
            toString();
        }
        x9p1.p(this.j1, this.u1);
        lap1.o(this.j1, this.u1);
        hm5.J(this.j1, this.u1);
        this.v1.m(this.u1);
    }

    public final void L0() {
        Bundle bundle = this.b;
        this.z1.f(new qf30(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, (byte) 0), "Fragment#onViewCreated");
        this.W0.v(2);
    }

    public final pf30 M0(o1p1 o1p1Var, hv30 hv30Var, bh0 bh0Var) {
        if (this.a > 1) {
            eg.m(gvg.i("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        of30 of30Var = new of30(this, hv30Var, atomicReference, o1p1Var, bh0Var);
        if (this.a >= 0) {
            of30Var.a();
        } else {
            this.B1.add(of30Var);
        }
        return new pf30(atomicReference, (byte) 0);
    }

    @Override // p.ot50
    public final eck1 N() {
        Application application = null;
        if (this.U0 == null) {
            eg.m("Can't access ViewModels from detached fragment");
            return null;
        }
        we41 we41Var = this.w1;
        if (we41Var != null) {
            return we41Var;
        }
        for (Context applicationContext = P0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && th30.P(3)) {
            Objects.toString(P0().getApplicationContext());
        }
        we41 we41Var2 = new we41(application, this, this.f);
        this.w1 = we41Var2;
        return we41Var2;
    }

    public final dg30 N0() {
        dg30 dg30VarF0 = f0();
        if (dg30VarF0 != null) {
            return dg30VarF0;
        }
        eg.m(gvg.i("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @Override // p.ot50
    public final wcn0 O() {
        Application application;
        Context applicationContext = P0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && th30.P(3)) {
            Objects.toString(P0().getApplicationContext());
        }
        wcn0 wcn0Var = new wcn0(0);
        if (application != null) {
            wcn0Var.a(dck1.d, application);
        }
        wcn0Var.a(a6o1.a, this);
        wcn0Var.a(a6o1.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            wcn0Var.a(a6o1.c, bundle);
        }
        return wcn0Var;
    }

    public final Bundle O0() {
        Bundle bundle = this.f;
        if (bundle != null) {
            return bundle;
        }
        eg.m(gvg.i("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context P0() {
        Context contextH0 = h0();
        if (contextH0 != null) {
            return contextH0;
        }
        eg.m(gvg.i("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View Q0() {
        View view = this.j1;
        if (view != null) {
            return view;
        }
        eg.m(gvg.i("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void R0() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.W0.d0(bundle);
        ai30 ai30Var = this.W0;
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(1);
    }

    public final void S0(int i, int i2, int i3, int i4) {
        if (this.m1 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        e0().b = i;
        e0().c = i2;
        e0().d = i3;
        e0().e = i4;
    }

    public final void T0(Bundle bundle) {
        th30 th30Var = this.U0;
        if (th30Var != null) {
            if (th30Var == null ? false : th30Var.U()) {
                eg.m("Fragment already added and state has been saved");
                return;
            }
        }
        this.f = bundle;
    }

    public final void U0() {
        if (!this.f1) {
            this.f1 = true;
            if (!q0() || r0()) {
                return;
            }
            this.V0.o0();
        }
    }

    public final void V0(yf30 yf30Var) {
        Bundle bundle;
        if (this.U0 != null) {
            eg.m("Fragment already added");
            return;
        }
        if (yf30Var == null || (bundle = yf30Var.a) == null) {
            bundle = null;
        }
        this.b = bundle;
    }

    public final void W0() {
        vi30.g(this);
        this.d1 = true;
        th30 th30Var = this.U0;
        if (th30Var != null) {
            th30Var.Q.T(this);
        } else {
            this.e1 = true;
        }
    }

    public final void X0(Intent intent) {
        tg30 tg30Var = this.V0;
        if (tg30Var != null) {
            x74.r0(tg30Var.e, intent);
        } else {
            eg.m(gvg.i("Fragment ", this, " not attached to Activity"));
        }
    }

    @Override // p.ch0
    public final kh0 a0(bh0 bh0Var, o1p1 o1p1Var) {
        return M0(o1p1Var, new laz(this, (byte) 10), bh0Var);
    }

    public jch0 c0() {
        return new uf30(this);
    }

    public void d0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.Y0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.Z0));
        printWriter.print(" mTag=");
        printWriter.println(this.a1);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.T0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.X);
        printWriter.print(" mRemoving=");
        printWriter.print(this.Y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.O0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.P0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.b1);
        printWriter.print(" mDetached=");
        printWriter.print(this.c1);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.g1);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.d1);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.l1);
        if (this.U0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.U0);
        }
        if (this.V0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.V0);
        }
        if (this.X0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.X0);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        zf30 zf30VarM0 = m0(false);
        if (zf30VarM0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(zf30VarM0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.i);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        vf30 vf30Var = this.m1;
        printWriter.println(vf30Var == null ? false : vf30Var.a);
        vf30 vf30Var2 = this.m1;
        if ((vf30Var2 == null ? 0 : vf30Var2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            vf30 vf30Var3 = this.m1;
            printWriter.println(vf30Var3 == null ? 0 : vf30Var3.b);
        }
        vf30 vf30Var4 = this.m1;
        if ((vf30Var4 == null ? 0 : vf30Var4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            vf30 vf30Var5 = this.m1;
            printWriter.println(vf30Var5 == null ? 0 : vf30Var5.c);
        }
        vf30 vf30Var6 = this.m1;
        if ((vf30Var6 == null ? 0 : vf30Var6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            vf30 vf30Var7 = this.m1;
            printWriter.println(vf30Var7 == null ? 0 : vf30Var7.d);
        }
        vf30 vf30Var8 = this.m1;
        if ((vf30Var8 == null ? 0 : vf30Var8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            vf30 vf30Var9 = this.m1;
            printWriter.println(vf30Var9 != null ? vf30Var9.e : 0);
        }
        if (this.i1 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.i1);
        }
        if (this.j1 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.j1);
        }
        if (h0() != null) {
            fad0.g(this).d(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.W0 + ":");
        this.W0.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final vf30 e0() {
        vf30 vf30Var = this.m1;
        if (vf30Var != null) {
            return vf30Var;
        }
        vf30 vf30Var2 = new vf30();
        vf30Var2.i = null;
        Object obj = E1;
        vf30Var2.j = obj;
        vf30Var2.k = null;
        vf30Var2.l = obj;
        vf30Var2.m = null;
        vf30Var2.n = obj;
        vf30Var2.o = 1.0f;
        vf30Var2.f125p = null;
        this.m1 = vf30Var2;
        return vf30Var2;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final dg30 f0() {
        tg30 tg30Var = this.V0;
        if (tg30Var == null) {
            return null;
        }
        return (dg30) tg30Var.d;
    }

    public final th30 g0() {
        if (this.V0 != null) {
            return this.W0;
        }
        eg.m(gvg.i("Fragment ", this, " has not been attached yet."));
        return null;
    }

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.s1;
    }

    public final Context h0() {
        tg30 tg30Var = this.V0;
        if (tg30Var == null) {
            return null;
        }
        return tg30Var.e;
    }

    public final int i0() {
        w8c0 w8c0Var = this.r1;
        return (w8c0Var == w8c0.b || this.X0 == null) ? w8c0Var.ordinal() : Math.min(w8c0Var.ordinal(), this.X0.i0());
    }

    public final th30 j0() {
        th30 th30Var = this.U0;
        if (th30Var != null) {
            return th30Var;
        }
        eg.m(gvg.i("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources k0() {
        return P0().getResources();
    }

    public final String l0(int i) {
        return k0().getString(i);
    }

    public final zf30 m0(boolean z) {
        String str;
        if (z) {
            vi30.f(this);
        }
        zf30 zf30Var = this.g;
        if (zf30Var != null) {
            return zf30Var;
        }
        th30 th30Var = this.U0;
        if (th30Var == null || (str = this.h) == null) {
            return null;
        }
        return th30Var.c.m(str);
    }

    public final iac0 n0() {
        lj30 lj30Var = this.u1;
        if (lj30Var != null) {
            return lj30Var;
        }
        eg.m(gvg.i("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    @Override // p.sck1
    public final rck1 o() {
        if (this.U0 == null) {
            eg.m("Can't access ViewModels from detached fragment");
            return null;
        }
        if (i0() == 1) {
            eg.m("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.U0.Q.d;
        rck1 rck1Var = (rck1) map.get(this.e);
        if (rck1Var != null) {
            return rck1Var;
        }
        rck1 rck1Var2 = new rck1();
        map.put(this.e, rck1Var2);
        return rck1Var2;
    }

    public final void o0() {
        this.s1 = new tac0(this, true);
        this.x1 = nt21.h(this);
        this.w1 = null;
        ArrayList arrayList = this.B1;
        rf30 rf30Var = this.C1;
        if (!arrayList.contains(rf30Var)) {
            if (this.a >= 0) {
                rf30Var.a();
            } else {
                arrayList.add(rf30Var);
            }
        }
        tf30 tf30Var = this.D1;
        if (arrayList.contains(tf30Var)) {
            return;
        }
        if (this.a >= 0) {
            tf30Var.a();
        } else {
            arrayList.add(tf30Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.h1 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        N0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.h1 = true;
    }

    @Override // p.qe41
    public final oe41 p() {
        return this.x1.j();
    }

    public final void p0() {
        o0();
        this.q1 = this.e;
        this.e = UUID.randomUUID().toString();
        this.X = false;
        this.Y = false;
        this.O0 = false;
        this.P0 = false;
        this.R0 = false;
        this.T0 = 0;
        this.U0 = null;
        this.W0 = new ai30();
        this.V0 = null;
        this.Y0 = 0;
        this.Z0 = 0;
        this.a1 = null;
        this.b1 = false;
        this.c1 = false;
    }

    public final boolean q0() {
        return this.V0 != null && this.X;
    }

    public final boolean r0() {
        if (this.b1) {
            return true;
        }
        th30 th30Var = this.U0;
        if (th30Var != null) {
            zf30 zf30Var = this.X0;
            th30Var.getClass();
            if (zf30Var == null ? false : zf30Var.r0()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s0() {
        return this.T0 > 0;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.V0 == null) {
            eg.m(gvg.i("Fragment ", this, " not attached to Activity"));
            return;
        }
        th30 th30VarJ0 = j0();
        if (th30VarJ0.E != null) {
            th30VarJ0.H.addLast(new mh30(this.e, i));
            th30VarJ0.E.a(intent);
        } else {
            tg30 tg30Var = th30VarJ0.x;
            if (i == -1) {
                x74.r0(tg30Var.e, intent);
            } else {
                tg30Var.getClass();
                eg.m("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
    }

    public void t0() {
        this.h1 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.Y0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.Y0));
        }
        if (this.a1 != null) {
            sb.append(" tag=");
            sb.append(this.a1);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u0(int i, int i2, Intent intent) {
        if (th30.P(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void v0(Context context) {
        this.h1 = true;
        tg30 tg30Var = this.V0;
        if ((tg30Var == null ? null : tg30Var.d) != null) {
            this.h1 = true;
        }
    }

    public void w0(Bundle bundle) {
        this.h1 = true;
        R0();
        ai30 ai30Var = this.W0;
        if (ai30Var.w >= 1) {
            return;
        }
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(1);
    }

    public View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.y1;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void y0() {
        this.h1 = true;
    }

    public void z0() {
        this.h1 = true;
    }

    public void F0(Bundle bundle) {
    }

    public void I0(View view, Bundle bundle) {
    }

    public zf30(int i) {
        this();
        this.y1 = i;
    }
}
