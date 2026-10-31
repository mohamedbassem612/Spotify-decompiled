package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qvo0 extends zf30 implements ug30, jik1, o6r0 {
    public final m6k0 F1;
    public k241 G1;
    public ees H1;
    public ges I1;
    public final gn10 J1 = mno1.T;
    public final lik1 K1 = nik1.W2;

    public qvo0(m6k0 m6k0Var) {
        this.F1 = m6k0Var;
    }

    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131959202);
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        k241 k241Var = this.G1;
        if (k241Var != null) {
            k241Var.a();
        } else {
            u890.C("pageLoader");
            throw null;
        }
    }

    public final void H0() {
        k241 k241Var = this.G1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        k241Var.b();
        ((zf30) this).h1 = true;
    }

    @Override // p.fn10
    public final gn10 Q() {
        return this.J1;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.q(yon1.P3());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.P3();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return this.K1;
    }

    @Override // p.ug30
    public final String s() {
        return nik1.W2.a;
    }

    public final void v0(Context context) {
        super.v0(context);
        this.F1.f(this);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ees eesVar = this.H1;
        if (eesVar == null) {
            u890.C("pageLoaderViewBuilder");
            throw null;
        }
        ges gesVarA = eesVar.a(P0());
        this.I1 = gesVarA;
        k241 k241Var = this.G1;
        if (k241Var == null) {
            u890.C("pageLoader");
            throw null;
        }
        gesVarA.E(this, k241Var);
        ConstraintLayout constraintLayout = this.I1;
        if (constraintLayout == null) {
            u890.C("pageLoaderView");
            throw null;
        }
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int i = kgr0.T0;
        return xyn1.z(constraintLayout);
    }
}
