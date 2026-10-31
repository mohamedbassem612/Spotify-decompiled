package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t1n0 extends hcr0 implements ug30, gq80 {
    public final fkk1 W1;
    public final o7r0 X1;
    public final kly0 Y1;
    public final sg30 Z1;
    public final lnn0 a2;
    public knn0 b2;
    public tv80 c2;
    public final s1n0 d2;
    public final idd1 e2;
    public final idd1 f2;
    public final in8 g2;

    public t1n0(Map map, wbr0 wbr0Var, vbr0 vbr0Var, sbr0 sbr0Var, rbr0 rbr0Var, n431 n431Var, fkk1 fkk1Var, o7r0 o7r0Var, kly0 kly0Var, sg30 sg30Var, lzn0 lzn0Var, lnn0 lnn0Var, boolean z) {
        super(map, wbr0Var, vbr0Var, sbr0Var, rbr0Var, n431Var, z);
        this.W1 = fkk1Var;
        this.X1 = o7r0Var;
        this.Y1 = kly0Var;
        this.Z1 = sg30Var;
        this.a2 = lnn0Var;
        this.d2 = new s1n0(this);
        this.e2 = new idd1(new zem0(this, (byte) 9));
        this.f2 = new idd1(new u6j0(this, (byte) 3));
        this.g2 = ozn1.t(lzn0Var);
    }

    @Override // p.ug30
    public final String A(Context context) {
        return "";
    }

    @Override // p.hcr0
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        bundle.putParcelable("music-page-opening-interaction", this.c2);
    }

    public final void I0(View view, Bundle bundle) {
        e1().a().b0(bt21.class).d(new jp5(view, this, (byte) 8));
    }

    @Override // p.fn10
    public final gn10 Q() {
        gn10 gn10Var;
        j0c0 j0c0Var = (j0c0) e1().a().b0(j0c0.class).a();
        return (j0c0Var == null || (gn10Var = j0c0Var.a) == null) ? mno1.q0 : gn10Var;
    }

    @Override // p.m6r0
    public final p1r0 Y0() {
        return (n1n0) this.Y1.get();
    }

    @Override // p.m6r0
    public final c7r0 Z0(iac0 iac0Var, bbr0 bbr0Var, Function0 function0) {
        tv80 tv80Var = this.c2;
        return qon1.o(this.X1, this, iac0Var, bbr0Var, function0, this.W1, tv80Var != null ? new bwn0(tv80Var) : null, this.d2);
    }

    @Override // p.m6r0
    public final ezc a1() {
        return yoi1.g((Observable) this.f2.getValue());
    }

    @Override // p.m6r0
    public final mr20 b1() {
        return yoi1.g((Observable) this.e2.getValue());
    }

    @Override // p.lir0
    /* JADX INFO: renamed from: c */
    public final mir0 getU1() {
        h0r0 h0r0VarE1 = e1();
        dcr0 dcr0Var = this.O1;
        return new nir0(h0r0VarE1, dcr0Var != null ? dcr0Var.b() : null, (Observable) this.f2.getValue()).getU1();
    }

    @Override // p.m6r0
    public final String c1() {
        return wwo1.D(this).a.getName();
    }

    @Override // p.m6r0
    public final in8 d1() {
        return this.g2;
    }

    public final void j() {
        View view = ((zf30) this).j1;
        this.b2 = view != null ? jon1.o(view) : null;
        dcr0 dcr0Var = this.O1;
        c7r0 c7r0VarB = dcr0Var != null ? dcr0Var.b() : null;
        gq80 gq80Var = c7r0VarB instanceof gq80 ? (gq80) c7r0VarB : null;
        if (gq80Var != null) {
            gq80Var.j();
        }
    }

    @Override // p.ug30
    public final String s() {
        qod1 qod1Var = (qod1) e1().a().b0(qod1.class).a();
        if (qod1Var != null) {
            return qod1Var.a;
        }
        return null;
    }

    @Override // p.hcr0
    public final void w0(Bundle bundle) {
        tv80 tv80VarL;
        Intent intent;
        if (bundle != null) {
            tv80VarL = (tv80) jhc1.t(bundle, "music-page-opening-interaction", tv80.class);
        } else {
            Bundle bundle2 = ((zf30) this).f;
            if (bundle2 == null || (tv80VarL = (tv80) jhc1.t(bundle2, "extra_interaction_logging_result", tv80.class)) == null) {
                dg30 dg30VarF0 = f0();
                tv80VarL = (dg30VarF0 == null || (intent = dg30VarF0.getIntent()) == null) ? null : gg.l(intent);
            }
        }
        this.c2 = tv80VarL;
        super.w0(bundle);
        e1().a().b0(ktl1.class).d(new qpj0(this, (byte) 2));
    }

    @Override // p.hcr0
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b2 = jo31.s(e1().a(), viewGroup, this.a2);
        View viewX0 = super.x0(layoutInflater, viewGroup, bundle);
        if (viewX0 == null) {
            return null;
        }
        wm5.G(viewX0, apo.j(-895268449, new mbj0(this, (byte) 23), true));
        return viewX0;
    }

    @Override // p.hcr0
    public final void z0() {
        super.z0();
        this.b2 = null;
    }
}
