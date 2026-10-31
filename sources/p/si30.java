package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.comscore.android.HostApplicationState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class si30 {
    public final dh30 a;
    public final zsc b;
    public final zf30 c;
    public boolean d = false;
    public int e = -1;

    public si30(dh30 dh30Var, zsc zscVar, ClassLoader classLoader, rg30 rg30Var, Bundle bundle) {
        this.a = dh30Var;
        this.b = zscVar;
        zf30 zf30VarA = bundle.getParcelable("state").a(rg30Var, classLoader);
        this.c = zf30VarA;
        zf30VarA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        zf30VarA.T0(bundle2);
        if (th30.P(2)) {
            Objects.toString(zf30VarA);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void a() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        Bundle bundle = zf30Var.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        zf30Var.W0.W();
        zf30Var.a = 3;
        zf30Var.h1 = false;
        j3v j3vVar = zf30Var.z1;
        j3vVar.f(new nf30(zf30Var, bundle2), "Fragment#onActivityCreated");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onActivityCreated()"));
        }
        if (th30.P(3)) {
            zf30Var.toString();
        }
        if (zf30Var.j1 != null) {
            Bundle bundle3 = zf30Var.b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = zf30Var.c;
            if (sparseArray != null) {
                zf30Var.j1.restoreHierarchyState(sparseArray);
                zf30Var.c = null;
            }
            zf30Var.h1 = false;
            j3vVar.f(new qf30(zf30Var, bundle4, (byte) 3), "Fragment#onViewStateRestored");
            if (!zf30Var.h1) {
                throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onViewStateRestored()"));
            }
            if (zf30Var.j1 != null) {
                j3vVar.f(new nf30(zf30Var, (byte) 20), "FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)");
            }
        }
        zf30Var.b = null;
        ai30 ai30Var = zf30Var.W0;
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(4);
        this.a.u(zf30Var, false);
    }

    public final void b() {
        View view;
        View view2;
        zf30 zf30Var = this.c;
        zf30 zf30VarI = th30.I(zf30Var.i1);
        zf30 zf30Var2 = zf30Var.X0;
        if (zf30VarI != null && zf30VarI != zf30Var2) {
            vi30.i(zf30Var, zf30VarI, zf30Var.Z0);
        }
        ArrayList arrayList = (ArrayList) this.b.b;
        ViewGroup viewGroup = zf30Var.i1;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(zf30Var);
            for (int i = iIndexOf - 1; i >= 0; i--) {
                zf30 zf30Var3 = (zf30) arrayList.get(i);
                if (zf30Var3.i1 == viewGroup && (view2 = zf30Var3.j1) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                zf30 zf30Var4 = (zf30) arrayList.get(iIndexOf);
                if (zf30Var4.i1 == viewGroup && (view = zf30Var4.j1) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        zf30Var.i1.addView(zf30Var.j1, iIndexOfChild);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void c() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        zf30 zf30Var2 = zf30Var.g;
        si30 si30Var = null;
        zsc zscVar = this.b;
        if (zf30Var2 != null) {
            si30 si30Var2 = (si30) ((HashMap) zscVar.c).get(zf30Var2.e);
            if (si30Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(zf30Var);
                zf30 zf30Var3 = zf30Var.g;
                sb.append(" declared target fragment ");
                sb.append(zf30Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            zf30Var.h = zf30Var.g.e;
            zf30Var.g = null;
            si30Var = si30Var2;
        } else {
            String str = zf30Var.h;
            if (str != null && (si30Var = (si30) ((HashMap) zscVar.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(zf30Var);
                sb2.append(" declared target fragment ");
                eg.m(l1d.n(zf30Var.h, " that does not belong to this FragmentManager!", sb2));
                return;
            }
        }
        if (si30Var != null) {
            si30Var.k();
        }
        th30 th30Var = zf30Var.U0;
        zf30Var.V0 = th30Var.x;
        zf30Var.X0 = th30Var.z;
        dh30 dh30Var = this.a;
        dh30Var.A(zf30Var, false);
        ArrayList arrayList = zf30Var.B1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xf30) it.next()).a();
        }
        arrayList.clear();
        zf30Var.W0.b(zf30Var.V0, zf30Var.c0(), zf30Var);
        zf30Var.a = 0;
        zf30Var.h1 = false;
        zf30Var.z1.f(new nf30(zf30Var, (byte) 7), "Fragment#onAttach");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onAttach()"));
        }
        Iterator it2 = zf30Var.U0.q.iterator();
        while (it2.hasNext()) {
            ((li30) it2.next()).a(zf30Var);
        }
        ai30 ai30Var = zf30Var.W0;
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(0);
        dh30Var.v(zf30Var, false);
    }

    public final int d() {
        zf30 zf30Var = this.c;
        if (zf30Var.U0 == null) {
            return zf30Var.a;
        }
        int iMin = this.e;
        int iOrdinal = zf30Var.r1.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (zf30Var.O0) {
            boolean z = zf30Var.P0;
            int i2 = this.e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = zf30Var.j1;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, zf30Var.a) : Math.min(iMin, 1);
            }
        }
        if (zf30Var.Q0 && zf30Var.i1 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!zf30Var.X) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = zf30Var.i1;
        if (viewGroup != null) {
            kss kssVarA = sgc1.A(viewGroup, zf30Var.j0());
            foa1 foa1VarG = kssVarA.g(zf30Var);
            int i3 = foa1VarG != null ? foa1VarG.b : 0;
            foa1 foa1VarH = kssVarA.h(zf30Var);
            i = foa1VarH != null ? foa1VarH.b : 0;
            int i4 = i3 == 0 ? -1 : goa1.a[l1d.C(i3)];
            if (i4 != -1 && i4 != 1) {
                i = i3;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (zf30Var.Y) {
            iMin = zf30Var.s0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (zf30Var.k1 && zf30Var.a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (zf30Var.Z) {
            iMin = Math.max(iMin, 3);
        }
        if (th30.P(2)) {
            Objects.toString(zf30Var);
        }
        return iMin;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void e() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        Bundle bundle = zf30Var.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        byte b = 1;
        if (zf30Var.p1) {
            zf30Var.a = 1;
            zf30Var.R0();
            return;
        }
        dh30 dh30Var = this.a;
        dh30Var.B(zf30Var, false);
        zf30Var.W0.W();
        zf30Var.a = 1;
        zf30Var.h1 = false;
        zf30Var.s1.a(new d411(zf30Var, b));
        j3v j3vVar = zf30Var.z1;
        j3vVar.f(new qf30(zf30Var, bundle2, (byte) 2), "Fragment#onCreate");
        zf30Var.p1 = true;
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onCreate()"));
        }
        j3vVar.f(new nf30(zf30Var, (byte) 19), "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)");
        dh30Var.w(zf30Var, false);
    }

    public final void f() {
        String resourceName;
        zf30 zf30Var = this.c;
        if (zf30Var.O0) {
            return;
        }
        if (th30.P(3)) {
            Objects.toString(zf30Var);
        }
        Bundle bundle = zf30Var.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterB0 = zf30Var.B0(bundle2);
        zf30Var.o1 = layoutInflaterB0;
        ViewGroup viewGroup2 = zf30Var.i1;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = zf30Var.Z0;
            if (i != 0) {
                if (i == -1) {
                    hhg1.n(gvg.i("Cannot create fragment ", zf30Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) zf30Var.U0.y.N(i);
                if (viewGroup == null) {
                    if (!zf30Var.R0 && !zf30Var.Q0) {
                        try {
                            resourceName = zf30Var.k0().getResourceName(zf30Var.Z0);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        k220.o("No view found for id 0x", Integer.toHexString(zf30Var.Z0), " (", resourceName, ") for fragment ", zf30Var);
                        return;
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    vi30.h(zf30Var, viewGroup);
                }
            }
        }
        zf30Var.i1 = viewGroup;
        zf30Var.K0(layoutInflaterB0, viewGroup, bundle2);
        if (zf30Var.j1 != null) {
            if (th30.P(3)) {
                Objects.toString(zf30Var);
            }
            zf30Var.j1.setSaveFromParentEnabled(false);
            zf30Var.j1.setTag(2131428955, zf30Var);
            if (viewGroup != null) {
                b();
            }
            if (zf30Var.b1) {
                zf30Var.j1.setVisibility(8);
            }
            boolean zIsAttachedToWindow = zf30Var.j1.isAttachedToWindow();
            View view = zf30Var.j1;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = b8k1.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new ri30(view, (byte) 0));
            }
            zf30Var.L0();
            this.a.G(zf30Var, zf30Var.j1, false);
            int visibility = zf30Var.j1.getVisibility();
            zf30Var.e0().o = zf30Var.j1.getAlpha();
            if (zf30Var.i1 != null && visibility == 0) {
                View viewFindFocus = zf30Var.j1.findFocus();
                if (viewFindFocus != null) {
                    zf30Var.e0().f125p = viewFindFocus;
                    if (th30.P(2)) {
                        viewFindFocus.toString();
                        Objects.toString(zf30Var);
                    }
                }
                zf30Var.j1.setAlpha(0.0f);
            }
        }
        zf30Var.a = 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void g() throws h0d1 {
        zf30 zf30VarM;
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = zf30Var.Y && !zf30Var.s0();
        zsc zscVar = this.b;
        if (z && !zf30Var.N0) {
            zscVar.H(null, zf30Var.e);
        }
        if (!z) {
            di30 di30Var = (di30) zscVar.e;
            if (!((di30Var.b.containsKey(zf30Var.e) && di30Var.e) ? di30Var.f : true)) {
                String str = zf30Var.h;
                if (str != null && (zf30VarM = zscVar.m(str)) != null && zf30VarM.d1) {
                    zf30Var.g = zf30VarM;
                }
                zf30Var.a = 0;
                return;
            }
        }
        tg30 tg30Var = zf30Var.V0;
        if (tg30Var instanceof sck1) {
            zIsChangingConfigurations = ((di30) zscVar.e).f;
        } else {
            Context context = tg30Var.e;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z && !zf30Var.N0) || zIsChangingConfigurations) {
            di30 di30Var2 = (di30) zscVar.e;
            di30Var2.getClass();
            if (th30.P(3)) {
                Objects.toString(zf30Var);
            }
            di30Var2.V(zf30Var.e, false);
        }
        zf30Var.W0.m();
        j3v j3vVar = zf30Var.z1;
        j3vVar.f(new nf30(zf30Var, (byte) 11), "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)");
        zf30Var.a = 0;
        zf30Var.h1 = false;
        zf30Var.p1 = false;
        j3vVar.f(new nf30(zf30Var, (byte) 12), "Fragment#onDestroy");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onDestroy()"));
        }
        this.a.x(zf30Var, false);
        for (si30 si30Var : zscVar.o()) {
            if (si30Var != null) {
                zf30 zf30Var2 = si30Var.c;
                if (zf30Var.e.equals(zf30Var2.h)) {
                    zf30Var2.g = zf30Var;
                    zf30Var2.h = null;
                }
            }
        }
        String str2 = zf30Var.h;
        if (str2 != null) {
            zf30Var.g = zscVar.m(str2);
        }
        zscVar.A(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void h() throws h0d1 {
        View view;
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        ViewGroup viewGroup = zf30Var.i1;
        if (viewGroup != null && (view = zf30Var.j1) != null) {
            viewGroup.removeView(view);
        }
        j3v j3vVar = zf30Var.z1;
        zf30Var.W0.v(1);
        if (zf30Var.j1 != null) {
            lj30 lj30Var = zf30Var.u1;
            lj30Var.b();
            if (lj30Var.e.i.a(w8c0.c)) {
                j3vVar.f(new nf30(zf30Var, (byte) 17), "FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)");
            }
        }
        zf30Var.a = 1;
        zf30Var.h1 = false;
        j3vVar.f(new nf30(zf30Var, (byte) 18), "Fragment#onDestroyView");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onDestroyView()"));
        }
        fad0.g(zf30Var).k();
        zf30Var.S0 = false;
        this.a.H(zf30Var, false);
        zf30Var.i1 = null;
        zf30Var.j1 = null;
        zf30Var.u1 = null;
        zf30Var.v1.m(null);
        zf30Var.P0 = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void i() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        zf30Var.a = -1;
        zf30Var.h1 = false;
        zf30Var.z1.f(new nf30(zf30Var, (byte) 13), "Fragment#onDetach");
        zf30Var.o1 = null;
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onDetach()"));
        }
        ai30 ai30Var = zf30Var.W0;
        if (!ai30Var.L) {
            ai30Var.m();
            zf30Var.W0 = new ai30();
        }
        this.a.y(zf30Var, false);
        zf30Var.a = -1;
        zf30Var.V0 = null;
        zf30Var.t1.d();
        zf30Var.X0 = null;
        zf30Var.U0 = null;
        if (!zf30Var.Y || zf30Var.s0()) {
            di30 di30Var = (di30) this.b.e;
            if (!((di30Var.b.containsKey(zf30Var.e) && di30Var.e) ? di30Var.f : true)) {
                return;
            }
        }
        if (th30.P(3)) {
            Objects.toString(zf30Var);
        }
        zf30Var.p0();
    }

    public final void j() {
        zf30 zf30Var = this.c;
        if (zf30Var.O0 && zf30Var.P0 && !zf30Var.S0) {
            if (th30.P(3)) {
                Objects.toString(zf30Var);
            }
            Bundle bundle = zf30Var.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterB0 = zf30Var.B0(bundle2);
            zf30Var.o1 = layoutInflaterB0;
            zf30Var.K0(layoutInflaterB0, null, bundle2);
            View view = zf30Var.j1;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                zf30Var.j1.setTag(2131428955, zf30Var);
                if (zf30Var.b1) {
                    zf30Var.j1.setVisibility(8);
                }
                zf30Var.L0();
                this.a.G(zf30Var, zf30Var.j1, false);
                zf30Var.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        zf30 zf30Var = this.c;
        if (z) {
            if (th30.P(2)) {
                Objects.toString(zf30Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = zf30Var.a;
                zsc zscVar = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && zf30Var.Y && !zf30Var.s0() && !zf30Var.N0) {
                        if (th30.P(3)) {
                            Objects.toString(zf30Var);
                        }
                        di30 di30Var = (di30) zscVar.e;
                        di30Var.getClass();
                        if (th30.P(3)) {
                            Objects.toString(zf30Var);
                        }
                        di30Var.V(zf30Var.e, true);
                        zscVar.A(this);
                        if (th30.P(3)) {
                            Objects.toString(zf30Var);
                        }
                        zf30Var.p0();
                    }
                    if (zf30Var.n1) {
                        if (zf30Var.j1 != null && (viewGroup = zf30Var.i1) != null) {
                            kss kssVarA = sgc1.A(viewGroup, zf30Var.j0());
                            if (zf30Var.b1) {
                                if (th30.P(2)) {
                                    Objects.toString(zf30Var);
                                }
                                kssVarA.d(3, 1, this);
                            } else {
                                if (th30.P(2)) {
                                    Objects.toString(zf30Var);
                                }
                                kssVarA.d(2, 1, this);
                            }
                        }
                        th30 th30Var = zf30Var.U0;
                        if (th30Var != null && zf30Var.X && th30.Q(zf30Var)) {
                            th30Var.I = true;
                        }
                        zf30Var.n1 = false;
                        zf30Var.W0.p();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case HostApplicationState.UNKNOWN /* -1 */:
                            i();
                            break;
                        case 0:
                            if (zf30Var.N0) {
                                if (((Bundle) ((HashMap) zscVar.d).get(zf30Var.e)) == null) {
                                    zscVar.H(o(), zf30Var.e);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            zf30Var.a = 1;
                            break;
                        case 2:
                            zf30Var.P0 = false;
                            zf30Var.a = 2;
                            break;
                        case 3:
                            if (th30.P(3)) {
                                Objects.toString(zf30Var);
                            }
                            if (zf30Var.N0) {
                                zscVar.H(o(), zf30Var.e);
                            } else if (zf30Var.j1 != null && zf30Var.c == null) {
                                p();
                            }
                            if (zf30Var.j1 != null && (viewGroup2 = zf30Var.i1) != null) {
                                kss kssVarA2 = sgc1.A(viewGroup2, zf30Var.j0());
                                if (th30.P(2)) {
                                    Objects.toString(zf30Var);
                                }
                                kssVarA2.d(1, 3, this);
                            }
                            zf30Var.a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            zf30Var.a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (zf30Var.j1 != null && (viewGroup3 = zf30Var.i1) != null) {
                                kss kssVarA3 = sgc1.A(viewGroup3, zf30Var.j0());
                                int iJ = w6d1.j(zf30Var.j1.getVisibility());
                                if (th30.P(2)) {
                                    Objects.toString(zf30Var);
                                }
                                kssVarA3.d(iJ, 2, this);
                            }
                            zf30Var.a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            zf30Var.a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void l() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        j3v j3vVar = zf30Var.z1;
        ai30 ai30Var = zf30Var.W0;
        if (ai30Var.h != null) {
            ai30Var.d();
        }
        ai30Var.v(5);
        if (zf30Var.j1 != null) {
            j3vVar.f(new nf30(zf30Var, (byte) 8), "FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)");
        }
        j3vVar.f(new nf30(zf30Var, (byte) 9), "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)");
        zf30Var.a = 6;
        zf30Var.h1 = false;
        j3vVar.f(new nf30(zf30Var, (byte) 10), "Fragment#onPause");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onPause()"));
        }
        this.a.z(zf30Var, false);
    }

    public final void m(ClassLoader classLoader) {
        zf30 zf30Var = this.c;
        Bundle bundle = zf30Var.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (zf30Var.b.getBundle("savedInstanceState") == null) {
            zf30Var.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            zf30Var.c = zf30Var.b.getSparseParcelableArray("viewState");
            zf30Var.d = zf30Var.b.getBundle("viewRegistryState");
            qi30 parcelable = zf30Var.b.getParcelable("state");
            if (parcelable != null) {
                zf30Var.h = parcelable.Z;
                zf30Var.i = parcelable.N0;
                zf30Var.l1 = parcelable.O0;
            }
            if (zf30Var.l1) {
                return;
            }
            zf30Var.k1 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + zf30Var, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    public final void n() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        vf30 vf30Var = zf30Var.m1;
        View view = vf30Var == null ? null : vf30Var.f125p;
        if (view != null) {
            if (view == zf30Var.j1) {
                view.requestFocus();
                if (th30.P(2)) {
                    view.toString();
                    Objects.toString(zf30Var);
                    Objects.toString(zf30Var.j1.findFocus());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == zf30Var.j1) {
                            view.requestFocus();
                            if (th30.P(2)) {
                                view.toString();
                                Objects.toString(zf30Var);
                                Objects.toString(zf30Var.j1.findFocus());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        zf30Var.e0().f125p = null;
        zf30Var.W0.W();
        zf30Var.W0.A(true);
        zf30Var.a = 7;
        zf30Var.h1 = false;
        j3v j3vVar = zf30Var.z1;
        j3vVar.f(new nf30(zf30Var, (byte) 14), "Fragment#onResume");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onResume()"));
        }
        j3vVar.f(new nf30(zf30Var, (byte) 15), "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)");
        if (zf30Var.j1 != null) {
            j3vVar.f(new nf30(zf30Var, (byte) 16), "FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)");
        }
        ai30 ai30Var = zf30Var.W0;
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(7);
        this.a.C(zf30Var, false);
        this.b.H(null, zf30Var.e);
        zf30Var.b = null;
        zf30Var.c = null;
        zf30Var.d = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        zf30 zf30Var = this.c;
        if (zf30Var.a == -1 && (bundle = zf30Var.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new qi30(zf30Var));
        if (zf30Var.a > 0) {
            Bundle bundle3 = new Bundle();
            zf30Var.z1.f(new qf30(zf30Var, bundle3, (byte) 1), "Fragment#onSaveInstanceState");
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.D(zf30Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            zf30Var.x1.o(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleE0 = zf30Var.W0.e0();
            if (!bundleE0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleE0);
            }
            if (zf30Var.j1 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = zf30Var.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = zf30Var.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = zf30Var.f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        zf30 zf30Var = this.c;
        if (zf30Var.j1 == null) {
            return;
        }
        if (th30.P(2)) {
            Objects.toString(zf30Var);
            Objects.toString(zf30Var.j1);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        zf30Var.j1.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            zf30Var.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        zf30Var.u1.f.o(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        zf30Var.d = bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void q() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        zf30Var.W0.W();
        zf30Var.W0.A(true);
        zf30Var.a = 5;
        zf30Var.h1 = false;
        j3v j3vVar = zf30Var.z1;
        j3vVar.f(new nf30(zf30Var, (byte) 4), "Fragment#onStart");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onStart()"));
        }
        j3vVar.f(new nf30(zf30Var, (byte) 5), "FragmentLifecycle#handleLifecycleEvent(ON_START)");
        if (zf30Var.j1 != null) {
            j3vVar.f(new nf30(zf30Var, (byte) 6), "FragmentViewLifecycle#handleLifecycleEvent(ON_START)");
        }
        ai30 ai30Var = zf30Var.W0;
        ai30Var.J = false;
        ai30Var.K = false;
        ai30Var.Q.g = false;
        ai30Var.v(5);
        this.a.E(zf30Var, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.h0d1 */
    public final void r() throws h0d1 {
        boolean zP = th30.P(3);
        zf30 zf30Var = this.c;
        if (zP) {
            Objects.toString(zf30Var);
        }
        j3v j3vVar = zf30Var.z1;
        ai30 ai30Var = zf30Var.W0;
        ai30Var.K = true;
        ai30Var.Q.g = true;
        ai30Var.v(4);
        if (zf30Var.j1 != null) {
            j3vVar.f(new nf30(zf30Var, (byte) 0), "FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)");
        }
        j3vVar.f(new nf30(zf30Var, (byte) 1), "FragmentLifecycle#handleLifecycleEvent(ON_STOP)");
        zf30Var.a = 4;
        zf30Var.h1 = false;
        j3vVar.f(new nf30(zf30Var, (byte) 2), "Fragment#onStop");
        if (!zf30Var.h1) {
            throw new h0d1(gvg.i("Fragment ", zf30Var, " did not call through to super.onStop()"));
        }
        this.a.F(zf30Var, false);
    }

    public si30(dh30 dh30Var, zsc zscVar, zf30 zf30Var) {
        this.a = dh30Var;
        this.b = zscVar;
        this.c = zf30Var;
    }

    public si30(dh30 dh30Var, zsc zscVar, zf30 zf30Var, Bundle bundle) {
        this.a = dh30Var;
        this.b = zscVar;
        this.c = zf30Var;
        zf30Var.c = null;
        zf30Var.d = null;
        zf30Var.T0 = 0;
        zf30Var.P0 = false;
        zf30Var.X = false;
        zf30 zf30Var2 = zf30Var.g;
        zf30Var.h = zf30Var2 != null ? zf30Var2.e : null;
        zf30Var.g = null;
        zf30Var.b = bundle;
        zf30Var.f = bundle.getBundle("arguments");
    }
}
