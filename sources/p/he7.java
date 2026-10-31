package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class he7 implements Connectable {
    public Object X;
    public final /* synthetic */ byte a = 0;
    public final View b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final View g;
    public final View h;
    public final Object i;
    public final Object t;

    public he7(LayoutInflater layoutInflater, ViewGroup viewGroup, th30 th30Var, c4c1 c4c1Var) {
        this.c = th30Var;
        this.d = c4c1Var;
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626207, viewGroup, false);
        this.e = constraintLayoutInflate;
        this.b = b8k1.n(constraintLayoutInflate, 2131429818);
        View viewN = b8k1.n(constraintLayoutInflate, 2131430683);
        this.f = viewN;
        View view = c4c1Var.f;
        this.g = view;
        ConstraintLayout constraintLayout = c4c1Var.e;
        this.h = constraintLayout;
        this.i = c4c1Var.b;
        this.t = r4u.c(new r4u[]{r4u.d(new z1w(mbc1.b, (byte) 3), r4u.a(new o2b1(this, (byte) 5))), r4u.d(new z1w(nbc1.b, (byte) 3), r4u.a(new vr51(this, (byte) 22))), r4u.d(new z1w(obc1.b, (byte) 3), r4u.a(new dn81(this, (byte) 13))), r4u.d(new z1w(pbc1.b, (byte) 3), r4u.a(new q881(this, (byte) 14)))});
        this.X = new ex30(ex30.b(l9x0.R0, s8p1.p(viewN)), ex30.b(m9x0.R0, new ex30((gka1) new c681(this, (byte) 17))));
        kil kilVar = new kil();
        kilVar.f(constraintLayoutInflate);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        view.setLayoutParams(new qhl(0, 0));
        constraintLayoutInflate.addView(view, 0);
        b(view, kilVar);
        a(view, kilVar);
        kilVar.v(view.getId(), 8);
        if (constraintLayout.getId() == -1) {
            constraintLayout.setId(View.generateViewId());
        }
        constraintLayout.setLayoutParams(new qhl(0, 0));
        constraintLayoutInflate.addView(constraintLayout);
        b(constraintLayout, kilVar);
        a(constraintLayout, kilVar);
        kilVar.v(constraintLayout.getId(), 8);
        View viewN2 = b8k1.n(constraintLayoutInflate, 2131431098);
        viewN2.getClass();
        a(viewN2, kilVar);
        kilVar.b(constraintLayoutInflate);
    }

    public static void b(View view, kil kilVar) {
        kilVar.g(view.getId(), 6, 0, 6);
        kilVar.g(view.getId(), 7, 0, 7);
        kilVar.g(view.getId(), 3, 0, 3);
        kilVar.g(view.getId(), 4, 0, 4);
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                this.h.n(new m42(consumer, (byte) 4));
                ((lcb0) this.e).g = new pp5(this, consumer, (byte) 16);
                return new rp(this, (byte) 8);
            default:
                return new pee0(this, ((ex30) this.X).a(new y281(consumer, (byte) 15)), (byte) 11);
        }
    }

    public void a(View view, kil kilVar) {
        tbc1 tbc1Var = (tbc1) this.i;
        if (tbc1Var instanceof rbc1) {
            return;
        }
        if (tbc1Var instanceof sbc1) {
            kilVar.l(view.getId()).e.z = "9.0:16.0";
        } else {
            eg.o();
        }
    }

    public he7(Context context, nd51 nd51Var, em3 em3Var, lcb0 lcb0Var, String str, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = context;
        this.d = em3Var;
        this.e = lcb0Var;
        this.f = str;
        this.X = bundle != null ? bundle.getParcelable("RECYCLER_VIEW_SAVED_STATE") : null;
        z87 z87Var = new z87(context, f46.S0(new Integer[]{4, 6}));
        View viewInflate = layoutInflater.inflate(2131625352, viewGroup, false);
        this.b = viewInflate;
        this.g = viewInflate.findViewById(2131430815);
        this.h = viewInflate.findViewById(2131427670);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(2131430814);
        this.t = viewGroup2;
        rwq0.s(viewGroup2, new ub3(this, (byte) 17));
        RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131430614);
        this.i = recyclerViewFindViewById;
        layoutInflater.getContext();
        recyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewFindViewById.setAdapter(lcb0Var);
        rwq0.s(recyclerViewFindViewById, o40.X0);
        recyclerViewFindViewById.m(new hqc0(nd51Var, lcb0Var, (byte) 1));
        recyclerViewFindViewById.j(z87Var);
    }
}
