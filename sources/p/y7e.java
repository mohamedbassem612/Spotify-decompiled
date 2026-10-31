package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y7e extends zf30 implements ug30, jik1, o6r0 {
    public final lpd F1;
    public q1n0 G1;
    public ees H1;
    public d8e I1;
    public k241 J1;
    public ges K1;
    public final gn10 L1 = mno1.L;
    public final lik1 M1 = nik1.I2;

    static {
        new sjb((byte) 1);
    }

    public y7e(lpd lpdVar) {
        this.F1 = lpdVar;
    }

    @Override // p.ug30
    public final String A(Context context) {
        Bundle bundle = ((zf30) this).f;
        bi90 bi90Var = bundle != null ? (bi90) bundle.getParcelable("SELECTED_ITEM") : null;
        Bundle bundle2 = ((zf30) this).f;
        String string = bundle2 != null ? bundle2.getString("SELECTED_ITEM_KEY") : null;
        if (bi90Var == null) {
            Bundle bundle3 = ((zf30) this).f;
            return (bundle3 == null || !bundle3.containsKey("SELECTED_ITEM_KEY") || string == null) ? "" : string;
        }
        if (bi90Var instanceof rh90) {
            return ((rh90) bi90Var).c;
        }
        if (bi90Var instanceof mh90) {
            return ((mh90) bi90Var).c;
        }
        eg.o();
        return null;
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        k241 k241Var = this.J1;
        if (k241Var != null) {
            k241Var.a();
        } else {
            u890.C("pageLoader");
            throw null;
        }
    }

    public final void H0() {
        k241 k241Var = this.J1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        k241Var.b();
        ((zf30) this).h1 = true;
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.L1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.f5());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.f5();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return this.M1;
    }

    @Override // p.ug30
    public final String s() {
        return "internal:preferences:notification_settings_category_details";
    }

    public final void v0(Context context) {
        super.v0(context);
        this.F1.f(this);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q1n0 q1n0Var = this.G1;
        if (q1n0Var == null) {
            u890.C("pageLoaderFactory");
            throw null;
        }
        d8e d8eVar = this.I1;
        if (d8eVar == null) {
            u890.C("loadableFactory");
            throw null;
        }
        this.J1 = q1n0Var.a(d8eVar.a());
        ees eesVar = this.H1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ges gesVarA = eesVar.a(P0());
        this.K1 = gesVarA;
        k241 k241Var = this.J1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        gesVarA.E(this, k241Var);
        ConstraintLayout constraintLayout = this.K1;
        if (constraintLayout == null) {
            u890.C("pageLoaderView");
            throw null;
        }
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = kgr0.T0;
        return xyn1.z(constraintLayout);
    }
}
