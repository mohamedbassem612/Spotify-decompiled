package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mpv extends dwb {
    public final thn V1;
    public qg30 W1;
    public jcp X1;
    public final idd1 Y1 = new idd1(new kpv(this, (byte) 1));
    public final idd1 Z1 = new idd1(new kpv(this, (byte) 3));
    public final idd1 a2 = new idd1(new kpv(this, (byte) 4));
    public final idd1 b2 = new idd1(new kpv(this, (byte) 2));
    public final idd1 c2 = new idd1(new kpv(this, (byte) 0));

    public mpv(thn thnVar) {
        this.V1 = thnVar;
    }

    @Override // p.t2u, p.zf30
    public final void G0() {
        super.G0();
        Dialog dialog = this.Q1;
        if (dialog != null) {
            BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(dialog.findViewById(2131428458));
            bottomSheetBehaviorZ.L(3);
            bottomSheetBehaviorZ.J(0);
            bottomSheetBehaviorZ.t(new jph(this, (byte) 2));
        }
    }

    @Override // p.zf30
    public final void I0(View view, Bundle bundle) {
        Dialog dialog = this.Q1;
        View viewFindViewById = dialog != null ? dialog.findViewById(2131428458) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(x74.G(view.getContext(), 2131233867));
        }
        Dialog dialog2 = this.Q1;
        if (dialog2 != null) {
            dialog2.setTitle(2131955190);
        }
        qg30 qg30Var = this.W1;
        if (qg30Var == null) {
            eg.m("Failed to bind EditOptionsMenuFragment");
            return;
        }
        qg30Var.c.setOnClickListener(new lpv(this, (byte) 0));
        qg30 qg30Var2 = this.W1;
        if (qg30Var2 != null) {
            qg30Var2.d.setOnClickListener(new lpv(this, (byte) 1));
        } else {
            eg.m("Failed to bind EditOptionsMenuFragment");
        }
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qg30 qg30VarB = qg30.b(layoutInflater, viewGroup);
        this.W1 = qg30VarB;
        return qg30VarB.a();
    }

    @Override // p.zf30
    public final void y0() {
        this.W1 = null;
        this.h1 = true;
    }
}
