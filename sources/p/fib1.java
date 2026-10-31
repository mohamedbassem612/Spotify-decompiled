package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fib1 extends zf30 implements lir0 {
    public final ifb1 F1;
    public bkb1 G1;
    public q881 H1;
    public mir0 I1;
    public g1f0 J1;

    public fib1(ifb1 ifb1Var) {
        this.F1 = ifb1Var;
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        N0().setTitle(2131962917);
    }

    public final void I0(View view, Bundle bundle) {
        if (!O0().getBoolean("extra_delay_ui", false)) {
            Y0();
        } else {
            O0().remove("extra_delay_ui");
            view.postDelayed(new xfz0(this, (byte) 21), 200L);
        }
    }

    public final void Y0() {
        if (g0().G("blueprint_fragment") == null) {
            bkb1 bkb1Var = this.G1;
            if (bkb1Var == null) {
                u890.C("startPresenter");
                throw null;
            }
            fib1 fib1Var = bkb1Var.a;
            th30 th30VarG0 = fib1Var.g0();
            th30VarG0.getClass();
            nu9 nu9Var = new nu9(th30VarG0);
            q881 q881Var = fib1Var.H1;
            if (q881Var == null) {
                u890.C("childFragmentProvider");
                throw null;
            }
            nu9Var.n(2131428198, q881Var.c(), "blueprint_fragment");
            nu9Var.f();
        }
        g1f0 g1f0Var = this.J1;
        if (g1f0Var == null) {
            u890.C("loginFlowRemoteProperties");
            throw null;
        }
        if (g1f0Var.r()) {
            boolean z = O0().getBoolean("credential_manager_requested", false);
            if (!z) {
                O0().putBoolean("credential_manager_requested", true);
            }
            bkb1 bkb1Var2 = this.G1;
            if (bkb1Var2 == null) {
                u890.C("startPresenter");
                throw null;
            }
            if (bkb1Var2.h.r()) {
                if (z) {
                    bkb1Var2.a();
                } else if (!bkb1Var2.T0) {
                    bkb1Var2.T0 = true;
                    q5o q5oVar = (q5o) bkb1Var2.i.get();
                    bkb1Var2.U0 = q5oVar;
                    bkb1Var2.V0 = c921.y(cto1.q(bkb1Var2.Q0), (o8n) null, 0, new sb91(q5oVar, bkb1Var2, (lnm) null, (byte) 23), 3);
                    q5oVar.getClass();
                    q5o.h(q5oVar);
                }
            }
        }
        bkb1 bkb1Var3 = this.G1;
        if (bkb1Var3 != null) {
            bkb1Var3.R0.b(bkb1Var3.X.flatMap(new ks21(bkb1Var3, (byte) 29)).observeOn(bkb1Var3.P0).subscribe(new dy40(bkb1Var3, (byte) 25), new z2a1(bkb1Var3, (byte) 5)));
        } else {
            u890.C("startPresenter");
            throw null;
        }
    }

    public final void Z0(boolean z, ny51 ny51Var) {
        View view = ((zf30) this).j1;
        if (view != null) {
            View viewFindViewById = view.findViewById(2131427514);
            View viewFindViewById2 = view.findViewById(2131427421);
            View viewFindViewById3 = view.findViewById(2131428103);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(z ? 0 : 8);
            }
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(z ? 0 : 8);
            }
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(ny51Var != null ? 0 : 8);
            }
            if (viewFindViewById3 != null) {
                viewFindViewById3.setOnClickListener(new wa21(this, ny51Var, (byte) 17));
            }
        }
    }

    @Override // p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.I1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageObservable");
        throw null;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624696, viewGroup, false);
    }

    public final void z0() {
        bkb1 bkb1Var = this.G1;
        if (bkb1Var == null) {
            u890.C("startPresenter");
            throw null;
        }
        q5o q5oVar = bkb1Var.U0;
        if (q5oVar != null) {
            q5oVar.e();
        }
        faa0 faa0Var = bkb1Var.V0;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        bkb1Var.V0 = null;
        ((zf30) this).h1 = true;
    }
}
