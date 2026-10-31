package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lx1 extends v4n {
    public final g21 b2;
    public yfx c2;
    public kxo d2;
    public ix1 e2;
    public Function0 f2 = ou1.f;
    public iu30 g2 = im1.e1;

    public lx1(g21 g21Var) {
        this.b2 = g21Var;
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        t4nVar.setOnShowListener(new kx1(this, t4nVar, (byte) 0));
    }

    @Override // p.haa
    public final void l1() {
        this.f2.invoke();
    }

    @Override // p.v4n
    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        pia1 pia1Var;
        oj80 oj80VarH = oj80.h(layoutInflater);
        RecyclerView recyclerView = (RecyclerView) oj80VarH.c;
        P0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        Bundle bundle = this.f;
        if (bundle == null || (pia1Var = (pia1) bundle.getParcelable("selected_sort_order")) == null) {
            Parcelable.Creator creator = pia1.CREATOR;
            poz0.s();
            pia1Var = pia1.a;
        }
        kxo kxoVar = this.d2;
        if (kxoVar == null) {
            u890.C("addToPlaylistSortAdapterFactory");
            throw null;
        }
        ix1 ix1VarA = kxoVar.a(pia1Var);
        this.e2 = ix1VarA;
        ix1VarA.A(this.g2);
        m5k m5kVar = new m5k(new z511[0]);
        yfx yfxVar = this.c2;
        if (yfxVar == null) {
            u890.C("sectionFactory");
            throw null;
        }
        b6s b6sVarA = yfxVar.a((l0i) null);
        b6sVarA.f(new kh51(P0().getString(2131951956), 0));
        m5kVar.A(new bml(b6sVarA.getView(), true));
        ix1 ix1Var = this.e2;
        if (ix1Var == null) {
            u890.C("addToPlaylistSortAdapter");
            throw null;
        }
        m5kVar.A(ix1Var);
        rwq0.s(oj80VarH.e(), o40.i);
        recyclerView.setAdapter(m5kVar);
        return oj80VarH.e();
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.b2.f(this);
        super.v0(context);
    }
}
