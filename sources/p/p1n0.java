package p;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p1n0 implements c7r0, t2r0, b8r0, um70, gq80 {
    public final idd1 O0;
    public final idd1 P0;
    public final zhq0 T0;
    public final hun0 X;
    public final fw5 Y;
    public final djr0 Z;
    public final iac0 a;
    public final bbr0 b;
    public final Function0 c;
    public final String d;
    public final fkk1 e;
    public final cwn0 f;
    public final t6i1 g;
    public final aks0 h;
    public final rsm0 i;
    public final wl7 t;
    public final idd1 N0 = new idd1(new o1n0(this, (byte) 1));
    public final idd1 Q0 = new idd1(new u6j0(this, (byte) 2));
    public final idd1 R0 = new idd1(new o1n0(this, (byte) 0));
    public final ien S0 = new ien();

    public p1n0(qe41 qe41Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, String str, fkk1 fkk1Var, cwn0 cwn0Var, xnn0 xnn0Var, t6i1 t6i1Var, aks0 aks0Var, rsm0 rsm0Var, wl7 wl7Var, m25 m25Var, hun0 hun0Var, fw5 fw5Var, djr0 djr0Var) {
        this.a = iac0Var;
        this.b = bbr0Var;
        this.c = function0;
        this.d = str;
        this.e = fkk1Var;
        this.f = cwn0Var;
        this.g = t6i1Var;
        this.h = aks0Var;
        this.i = rsm0Var;
        this.t = wl7Var;
        this.X = hun0Var;
        this.Y = fw5Var;
        this.Z = djr0Var;
        this.O0 = new idd1(new dvg0(this, qe41Var, (byte) 28));
        this.P0 = new idd1(new dvg0(xnn0Var, this, (byte) 27));
        this.T0 = new zhq0(m25Var.a(), m25Var.b());
        djr0Var.c(iac0Var);
    }

    @Override // p.c7r0
    public final void a(upn1 upn1Var) {
        View view;
        this.T0.n(upn1Var);
        i().a(upn1Var);
        k().a(upn1Var);
        bon0 bon0Var = (bon0) this.P0.getValue();
        if (bon0Var != null) {
            bon0Var.a(upn1Var);
        }
        ssm0 ssm0Var = (ssm0) this.Q0.getValue();
        pbq pbqVar = ssm0Var.a;
        if (upn1Var instanceof g7r0) {
            pbqVar.O();
        } else if ((upn1Var instanceof k7r0) && !ssm0Var.b) {
            pbqVar.v0(f610.g(((k7r0) upn1Var).c));
        }
        xl7 xl7Var = (xl7) this.R0.getValue();
        if (upn1Var instanceof l7r0) {
            if (xl7Var.b && (view = ((l7r0) upn1Var).c) != null) {
                xl7Var.c = view;
            }
        } else if (upn1Var instanceof j7r0) {
            View view2 = xl7Var.c;
            RecyclerView recyclerViewA = view2 != null ? xl7.a(view2) : null;
            xl7Var.d = recyclerViewA != null ? recyclerViewA : xl7Var.c;
            xl7Var.g.b = null;
            View view3 = xl7Var.c;
            if (view3 != null) {
                rwq0.s(view3, new ub3(xl7Var, (byte) 18));
            }
            if (recyclerViewA != null) {
                iro1.j(xl7Var.a, recyclerViewA);
            }
        } else {
            xl7Var.getClass();
        }
        this.X.a(upn1Var);
        this.Y.a(upn1Var);
        this.Z.a(upn1Var);
        this.S0.a(upn1Var);
    }

    @Override // p.c7r0
    public final void b(Bundle bundle) {
        i().b(bundle != null ? bundle.getBundle("PERFORMANCE_SAVED_BUNDLE_KEY") : null);
        w6i1 w6i1VarK = k();
        if (bundle != null) {
            bundle.getBundle("USER_BEHAVIOR_SAVED_BUNDLE_KEY");
        }
        w6i1VarK.getClass();
        this.X.b(bundle != null ? bundle.getBundle("NAVIGATION_COMPLETION_SAVED_BUNDLE_KEY") : null);
        this.Y.b(bundle != null ? bundle.getBundle("APP_READINESS_SAVED_BUNDLE_KEY") : null);
    }

    @Override // p.t2r0
    public final void c(u2r0 u2r0Var) {
        i().c(u2r0Var);
    }

    @Override // p.c7r0
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBundle("PERFORMANCE_SAVED_BUNDLE_KEY", i().d());
        k().getClass();
        bundle.putBundle("USER_BEHAVIOR_SAVED_BUNDLE_KEY", null);
        bundle.putBundle("NAVIGATION_COMPLETION_SAVED_BUNDLE_KEY", this.X.d());
        bundle.putBundle("APP_READINESS_SAVED_BUNDLE_KEY", this.Y.d());
        return bundle;
    }

    @Override // p.c7r0
    public final void dispose() {
        this.T0.f();
        i().getClass();
        k().dispose();
        bon0 bon0Var = (bon0) this.P0.getValue();
        if (bon0Var != null) {
            bon0Var.dispose();
        }
        this.X.getClass();
        this.Z.dispose();
        this.S0.dispose();
    }

    @Override // p.c7r0
    public final void e(vir0 vir0Var) {
        k().e(vir0Var);
        bon0 bon0Var = (bon0) this.P0.getValue();
        if (bon0Var != null) {
            bon0Var.e(vir0Var);
        }
        ssm0 ssm0Var = (ssm0) this.Q0.getValue();
        ssm0Var.b = true;
        ssm0Var.a.v0(vir0Var);
        this.Z.e(vir0Var);
    }

    @Override // p.b8r0
    public final Object f(Class cls) {
        if (cls.equals(c7r0.class)) {
            return this;
        }
        boolean zEquals = cls.equals(ttm0.class);
        idd1 idd1Var = this.Q0;
        if (zEquals) {
            return ((ssm0) idd1Var.getValue()).a.L();
        }
        if (cls.equals(abu0.class)) {
            return ((ssm0) idd1Var.getValue()).a.L();
        }
        return cls.equals(tl7.class) ? ((xl7) this.R0.getValue()).a : k().f(cls);
    }

    @Override // p.c7r0
    public final void g(bbr0 bbr0Var) {
        i().g(bbr0Var);
        k().getClass();
        bon0 bon0Var = (bon0) this.P0.getValue();
        if (bon0Var != null) {
            bon0Var.g(bbr0Var);
        }
        this.X.getClass();
        this.Z.g(bbr0Var);
        this.S0.g(bbr0Var);
    }

    @Override // p.um70
    public final String h() {
        return i().h();
    }

    public final bks0 i() {
        return (bks0) this.N0.getValue();
    }

    public final void j() {
        bon0 bon0Var = (bon0) this.P0.getValue();
        if (bon0Var != null) {
            bon0Var.j();
        }
    }

    public final w6i1 k() {
        return (w6i1) this.O0.getValue();
    }
}
