package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class li50 extends zf30 implements ug30, jik1, o6r0 {
    public final nay F1;
    public q1n0 G1;
    public ees H1;
    public ni50 I1;
    public k241 J1;
    public ges K1;
    public final gn10 L1 = mno1.L;
    public final lik1 M1 = nik1.H2;

    static {
        new q3c();
    }

    public li50(nay nayVar) {
        this.F1 = nayVar;
    }

    @Override // p.ug30
    public final String A(Context context) {
        Bundle bundle;
        String string;
        Bundle bundle2 = ((zf30) this).f;
        bi90 bi90Var = bundle2 != null ? (bi90) bundle2.getParcelable("SELECTED_GROUP_ITEM") : null;
        if (bi90Var instanceof mh90) {
            return ((mh90) bi90Var).c;
        }
        Bundle bundle3 = ((zf30) this).f;
        return (bundle3 == null || !bundle3.containsKey("SELECTED_GROUP_ITEM_KEY") || (bundle = ((zf30) this).f) == null || (string = bundle.getString("SELECTED_GROUP_ITEM_KEY")) == null) ? "" : string;
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
        return nhc.q(yon1.e5());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.e5();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return this.M1;
    }

    @Override // p.ug30
    public final String s() {
        return "internal:preferences:notification_settings_group_categories";
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
        ni50 ni50Var = this.I1;
        if (ni50Var == null) {
            u890.C("loadableFactory");
            throw null;
        }
        this.J1 = q1n0Var.a(ni50Var.a());
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
