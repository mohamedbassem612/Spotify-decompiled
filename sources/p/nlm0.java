package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nlm0 extends dwb {
    public final m6k0 V1;
    public qg30 W1;
    public dtp X1;
    public zwz0 Y1;
    public Scheduler Z1;
    public final idd1 a2 = new idd1(new llm0(this, (byte) 2));
    public final idd1 b2 = new idd1(new llm0(this, (byte) 0));
    public final idd1 c2 = new idd1(new llm0(this, (byte) 4));
    public final idd1 d2 = new idd1(new llm0(this, (byte) 3));
    public final idd1 e2 = new idd1(new llm0(this, (byte) 1));
    public final vku f2 = new vku();

    public nlm0(m6k0 m6k0Var) {
        this.V1 = m6k0Var;
    }

    @Override // p.t2u, p.zf30
    public final void G0() {
        super.G0();
        Dialog dialog = this.Q1;
        if (dialog != null) {
            BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(dialog.findViewById(2131428458));
            bottomSheetBehaviorZ.L(3);
            bottomSheetBehaviorZ.J(0);
            bottomSheetBehaviorZ.t(new jph(this, (byte) 3));
        }
    }

    @Override // p.zf30
    public final void I0(View view, Bundle bundle) {
        Dialog dialog = this.Q1;
        View viewFindViewById = dialog != null ? dialog.findViewById(2131428458) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(x74.G(view.getContext(), 2131233867));
        }
        zwz0 zwz0Var = this.Y1;
        if (zwz0Var == null) {
            u890.C("reachabilityMonitor");
            throw null;
        }
        Observable observableI = yoi1.i(zwz0Var.c(), o6x.a);
        Scheduler scheduler = this.Z1;
        if (scheduler == null) {
            u890.C("mainThreadScheduler");
            throw null;
        }
        this.f2.a(observableI.observeOn(scheduler).subscribe(new lrj0(this, (byte) 7)));
        Dialog dialog2 = this.Q1;
        if (dialog2 != null) {
            dialog2.setTitle(2131958902);
        }
        if (((Boolean) this.b2.getValue()).booleanValue()) {
            i1().c.setText(2131954395);
            i1().c.setCompoundDrawablesWithIntrinsicBounds(2131232826, 0, 0, 0);
        } else {
            i1().c.setText(2131954394);
            i1().c.setCompoundDrawablesWithIntrinsicBounds(2131231690, 0, 0, 0);
        }
        i1().c.setOnClickListener(new mlm0(this, (byte) 0));
        i1().d.setOnClickListener(new mlm0(this, (byte) 1));
    }

    public final qg30 i1() {
        qg30 qg30Var = this.W1;
        if (qg30Var != null) {
            return qg30Var;
        }
        eg.m("Failed to bind MoreOptionsMenuFragment");
        return null;
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.W1 = qg30.c(layoutInflater, viewGroup);
        return i1().a();
    }

    @Override // p.t2u, p.zf30
    public final void z0() {
        this.f2.c();
        this.W1 = null;
        super.z0();
    }
}
