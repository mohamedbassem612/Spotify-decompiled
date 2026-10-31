package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qcb0 extends zf30 implements o6r0, ug30, jik1 {
    public final bf70 F1;
    public lcb0 G1;
    public hdb0 H1;
    public pbb0 I1;
    public xfx J1;
    public o3n0 K1;
    public final bck1 L1;
    public ver M1;
    public sp00 N1;
    public final idd1 O1;
    public final idd1 P1;

    public qcb0(bf70 bf70Var) {
        this.F1 = bf70Var;
        mcb0 mcb0Var = new mcb0(this, (byte) 2);
        znb0 znb0VarS = dm5.S(3, new x5u(new x5u(this, (byte) 28), (byte) 29));
        this.L1 = ebp1.j(this, rc11.a.b(gdb0.class), new g22(znb0VarS, (byte) 8), new g22(znb0VarS, (byte) 9), mcb0Var);
        this.O1 = new idd1(new mcb0(this, (byte) 1));
        this.P1 = new idd1(new mcb0(this, (byte) 0));
    }

    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131958998);
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        ((gdb0) this.L1.getValue()).W();
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.w;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.o(yon1.d5(), nik1.Q0.a());
    }

    @Override // p.o6r0
    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.d5();
    }

    @Override // p.jik1
    public final lik1 getViewUri() {
        return nik1.Q0;
    }

    @Override // p.ug30
    public final String s() {
        return "settings-languages-music";
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        bck1 bck1Var = this.L1;
        ((gdb0) bck1Var.getValue()).U().f(this, new ncb0(this, (byte) 0));
        ((gdb0) bck1Var.getValue()).T().f(this, new ncb0(this, (byte) 1));
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        sp00 sp00VarS = sp00.s(layoutInflater, viewGroup);
        this.N1 = sp00VarS;
        RecyclerView recyclerView = (RecyclerView) sp00VarS.d;
        P0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        lcb0 lcb0Var = this.G1;
        if (lcb0Var == null) {
            u890.C("languageSelectionAdaptor");
            throw null;
        }
        recyclerView.setAdapter(lcb0Var);
        k3s itemAnimator = recyclerView.getItemAnimator();
        k3s k3sVar = itemAnimator instanceof k3s ? itemAnimator : null;
        if (k3sVar != null) {
            ((zw81) k3sVar).g = false;
        }
        rwq0.s(recyclerView, j830.T0);
        xfx xfxVar = this.J1;
        if (xfxVar == null) {
            u890.C("encoreConsumerEntryPoint");
            throw null;
        }
        ver verVarA = nko1.z(xfxVar.f).a((l0i) null);
        this.M1 = verVarA;
        verVarA.n(new ocb0(this, (byte) 1));
        sp00 sp00Var = this.N1;
        if (sp00Var == null) {
            u890.C("viewBinding");
            throw null;
        }
        FrameLayout frameLayout = (FrameLayout) sp00Var.c;
        ver verVar = this.M1;
        if (verVar == null) {
            u890.C("emptyState");
            throw null;
        }
        frameLayout.addView(verVar.getView());
        lcb0 lcb0Var2 = this.G1;
        if (lcb0Var2 == null) {
            u890.C("languageSelectionAdaptor");
            throw null;
        }
        lcb0Var2.D(new ocb0(this, (byte) 2));
        int i = kgr0.T0;
        sp00 sp00Var2 = this.N1;
        if (sp00Var2 != null) {
            return xyn1.z(sp00Var2.p());
        }
        u890.C("viewBinding");
        throw null;
    }
}
