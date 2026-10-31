package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ax30 implements f4h1, ihr0 {
    public final hw30 a;
    public final cir0 b;
    public final View c;

    public ax30(hw30 hw30Var, cir0 cir0Var) {
        this.a = hw30Var;
        this.b = cir0Var;
        this.c = hw30Var.X;
    }

    @Override // p.ihr0
    public final boolean b(ehr0 ehr0Var) {
        return this.a.b(ehr0Var);
    }

    @Override // p.f4h1
    public final Object getView() {
        return this.c;
    }

    @Override // p.f4h1
    public final Bundle serialize() {
        cgr0 cgr0Var = this.a.d;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : cgr0Var.U0.entrySet()) {
            bundle.putBundle((String) entry.getKey(), (Bundle) entry.getValue());
        }
        wkc1 wkc1Var = cgr0Var.V0;
        if (wkc1Var != null) {
            String str = wkc1Var.a;
            em0 em0Var = cgr0Var.S0;
            if (em0Var == null) {
                u890.C("pageSwapper");
                throw null;
            }
            bundle.putBundle(str, em0Var.e1());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ViewGroup viewGroup = cgr0Var.T0;
        if (viewGroup == null) {
            u890.C("subFeedContainer");
            throw null;
        }
        viewGroup.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("view_state", sparseArray);
        cgr0Var.W0 = bundle;
        return bundle;
    }

    @Override // p.f4h1
    public final void start() {
        Set<String> setKeySet;
        cir0 cir0Var = this.b;
        iac0 iac0VarE = cir0Var.e();
        qe41 qe41VarD = cir0Var.d();
        mr20 mr20VarF = cir0Var.f();
        hw30 hw30Var = this.a;
        cgr0 cgr0Var = hw30Var.d;
        ViewGroup viewGroup = (ViewGroup) hw30Var.Y.getValue();
        Bundle bundle = hw30Var.e;
        q7r0 q7r0Var = cgr0Var.a;
        cgr0Var.W0 = bundle;
        iac0VarE.getLifecycle().a(cgr0Var);
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                Bundle bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    cgr0Var.U0.put(str, bundle2);
                }
            }
        }
        cgr0Var.T0 = viewGroup;
        em0 em0Var = new em0(qe41VarD, viewGroup, iac0VarE, ((t2r0) q7r0Var.c.getValue()).h(), cgr0Var.c, cgr0Var.d, cgr0Var.Y, cgr0Var.e, cgr0Var.g, cgr0Var.h, cwl1.H(q7r0Var), cgr0Var.f, cgr0Var.i, cgr0Var.t, cgr0Var.X, cgr0Var.Z, cgr0Var.N0, cgr0Var.O0, mr20VarF, cgr0Var.P0, cgr0Var.Q0, cgr0Var.R0);
        cgr0Var.S0 = em0Var;
        em0Var.start();
        hw30Var.c.f(iac0VarE, new z11(hw30Var, (byte) 20));
        c921.y(cto1.q(iac0VarE), (o8n) null, 0, new xr00(mr20VarF, hw30Var, (lnm) null, (byte) 17), 3);
        iac0VarE.getLifecycle().a(new gw30(hw30Var));
    }

    @Override // p.f4h1
    public final void stop() {
    }
}
