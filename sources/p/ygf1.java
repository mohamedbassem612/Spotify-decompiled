package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ygf1 implements p4h1 {
    public final pgf1 a;
    public final LinearLayout b;

    public ygf1(LayoutInflater layoutInflater, ViewGroup viewGroup, pgf1 pgf1Var) {
        this.a = pgf1Var;
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131626271, viewGroup, false);
        RecyclerView recyclerViewT = m5n1.t(coordinatorLayoutInflate, 2131430617);
        if (recyclerViewT == null) {
            bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(2131430617)));
            throw null;
        }
        int i = kgr0.T0;
        this.b = xyn1.z(coordinatorLayoutInflate);
        rwq0.s(recyclerViewT, rre1.f);
        recyclerViewT.setAdapter(pgf1Var);
        recyclerViewT.getContext();
        recyclerViewT.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewT.j(new fyd((byte) 3));
    }

    @Override // p.p4h1
    public final View a() {
        return this.b;
    }
}
