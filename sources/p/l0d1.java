package p;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l0d1 extends dwb implements jik1, o6r0, k0d1 {
    public final ifb1 V1;
    public xfx W1;
    public mts X1;
    public final vku Y1 = new vku();
    public vkg Z1;
    public e821 a2;
    public nts b2;
    public lcb0 c2;

    public l0d1(ifb1 ifb1Var) {
        this.V1 = ifb1Var;
    }

    @Override // p.t2u, p.zf30
    public final void A0() {
        super.A0();
        this.Z1 = null;
    }

    @Override // p.t2u, p.zf30
    public final void G0() {
        super.G0();
        nts ntsVar = this.b2;
        if (ntsVar == null) {
            u890.C("headerComponent");
            throw null;
        }
        ntsVar.f(i1().a());
        lcb0 lcb0Var = this.c2;
        if (lcb0Var != null) {
            lcb0Var.C(i1().b());
        } else {
            u890.C("supplementaryAdapter");
            throw null;
        }
    }

    @Override // p.t2u, p.zf30
    public final void H0() {
        super.H0();
        this.Y1.c();
    }

    @Override // p.zf30
    public final void I0(View view, Bundle bundle) {
        vkg vkgVar = this.Z1;
        if (vkgVar != null) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            vkgVar.U(yon1.X(), nik1.S2.a());
        }
        xfx xfxVar = this.W1;
        if (xfxVar == null) {
            u890.C("encoreEntryPoint");
            throw null;
        }
        nts ntsVarA = wpo1.v(xfxVar.g).a((l0i) null);
        this.b2 = ntsVarA;
        e821 e821Var = this.a2;
        if (e821Var == null) {
            u890.C("binding");
            throw null;
        }
        ((FrameLayout) e821Var.a).addView(ntsVarA.getView());
        xfx xfxVar2 = this.W1;
        if (xfxVar2 == null) {
            u890.C("encoreEntryPoint");
            throw null;
        }
        this.c2 = new lcb0(aqo1.u(xfxVar2.g), this);
        e821 e821Var2 = this.a2;
        if (e821Var2 == null) {
            u890.C("binding");
            throw null;
        }
        RecyclerView recyclerView = (RecyclerView) e821Var2.e;
        ((ConstraintLayout) e821Var2.d).getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        lcb0 lcb0Var = this.c2;
        if (lcb0Var == null) {
            u890.C("supplementaryAdapter");
            throw null;
        }
        recyclerView.setAdapter(lcb0Var);
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            r6p1.q(view2);
        }
    }

    @Override // p.t2u
    public final int b1() {
        return 2132017878;
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.X();
    }

    public final lik1 getViewUri() {
        return nik1.S2;
    }

    public final n0d1 i1() {
        Object parcelable = Build.VERSION.SDK_INT >= 33 ? O0().getParcelable("supplementary_content_sheet_model", n0d1.class) : O0().getParcelable("supplementary_content_sheet_model");
        if (parcelable != null) {
            return (n0d1) parcelable;
        }
        bhn0.f(f4i1.f("Missing required argument 'supplementary_content_sheet_model'. Did you remember to create the fragment using ", l0d1.class.getSimpleName(), ".create(...)?"));
        return null;
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        this.Z1 = context instanceof vkg ? (vkg) context : null;
        super.v0(context);
    }

    @Override // p.t2u, p.zf30
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            dismiss();
        }
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        e821 e821VarN = e821.n(layoutInflater, viewGroup);
        this.a2 = e821VarN;
        return (ConstraintLayout) e821VarN.d;
    }
}
