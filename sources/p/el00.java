package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class el00 implements f4h1 {
    public final String N0;
    public final lmo O0;
    public final boolean P0;
    public final wen0 Q0;
    public final cd91 R0;
    public final w25 S0;
    public final RecyclerView T0;
    public final SwipeRefreshLayout U0;
    public hsl1 V0;
    public final p1d0 W0;
    public final lad1 X;
    public Bundle X0;
    public final i8h1 Y;
    public boolean Y0;
    public final ie11 Z;
    public urk0 Z0;
    public final View a;
    public boolean a1;
    public final Activity b;
    public String b1;
    public final tj00 c;
    public zk00 c1;
    public final iac0 d;
    public final e611 d1;
    public final ho60 e;
    public final a6n e1;
    public final bn70 f;
    public final tp60 g;
    public final yzu h;
    public final boolean i;
    public final cir0 t;

    public el00(View view, Activity activity, tj00 tj00Var, iac0 iac0Var, ho60 ho60Var, bn70 bn70Var, tp60 tp60Var, yzu yzuVar, boolean z, cir0 cir0Var, lad1 lad1Var, i8h1 i8h1Var, ie11 ie11Var, String str, lmo lmoVar, boolean z2, wen0 wen0Var, cd91 cd91Var, Bundle bundle, c711 c711Var, uk00 uk00Var, w25 w25Var) {
        this.a = view;
        this.b = activity;
        this.c = tj00Var;
        this.d = iac0Var;
        this.e = ho60Var;
        this.f = bn70Var;
        this.g = tp60Var;
        this.h = yzuVar;
        this.i = z;
        this.t = cir0Var;
        this.X = lad1Var;
        this.Y = i8h1Var;
        this.Z = ie11Var;
        this.N0 = str;
        this.O0 = lmoVar;
        this.P0 = z2;
        this.Q0 = wen0Var;
        this.R0 = cd91Var;
        this.S0 = w25Var;
        RecyclerView recyclerViewFindViewById = view.findViewById(2131430614);
        this.T0 = recyclerViewFindViewById;
        SwipeRefreshLayout swipeRefreshLayoutFindViewById = view.findViewById(2131428737);
        this.U0 = swipeRefreshLayoutFindViewById;
        iac0 iac0VarH = x9p1.h(recyclerViewFindViewById);
        p1d0 p1d0VarD = tj00Var.X.d(iac0VarH == null ? iac0Var : iac0VarH);
        this.W0 = p1d0VarD;
        this.X0 = bundle;
        m181 m181Var = new m181(new bl00(this));
        this.a1 = true;
        this.d1 = recyclerViewFindViewById.getItemAnimator();
        this.e1 = new a6n(this, (byte) 20);
        recyclerViewFindViewById.setHasFixedSize(true);
        recyclerViewFindViewById.j(new hmu(view.getResources(), z, uk00Var));
        recyclerViewFindViewById.j(c711Var);
        rwq0.s(recyclerViewFindViewById, new ec3(this, (byte) 3));
        u0p1.s(recyclerViewFindViewById, new cc00(this, (byte) 3), new yk00(this, (byte) 0));
        iac0 iac0VarH2 = x9p1.h(recyclerViewFindViewById);
        iac0 iac0Var2 = iac0VarH2 == null ? iac0Var : iac0VarH2;
        recyclerViewFindViewById.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.x1(1);
        p1d0VarD.a(recyclerViewFindViewById, iac0Var2, linearLayoutManager, z);
        if (w25Var.h()) {
            recyclerViewFindViewById.m(m181Var);
        }
        swipeRefreshLayoutFindViewById.setEnabled(w25Var.k());
        if (w25Var.k()) {
            swipeRefreshLayoutFindViewById.setColorSchemeResources(new int[]{2131103942});
            swipeRefreshLayoutFindViewById.setProgressBackgroundColorSchemeResource(2131101500);
            swipeRefreshLayoutFindViewById.setOnRefreshListener(new al00(this));
        }
    }

    public final void b(Map map) {
        z511 adapter = this.T0.getAdapter();
        zk00 zk00Var = this.c1;
        if (zk00Var != null && adapter != null) {
            adapter.z(zk00Var);
        }
        this.c1 = null;
        if (map.isEmpty() || adapter == null) {
            return;
        }
        zk00 zk00Var2 = new zk00(adapter, this, map);
        this.c1 = zk00Var2;
        adapter.w(zk00Var2);
    }

    @Override // p.f4h1
    public final Object getView() {
        return this.a;
    }

    @Override // p.f4h1
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.T0.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("view_state", sparseArray);
        bundle.putInt("viewDataHoldersSize", ((rnc0) this.c.X.b().getValue()).b.size());
        return bundle;
    }

    @Override // p.f4h1
    public final void start() {
        tj00 tj00Var = this.c;
        kdn0 kdn0Var = tj00Var.Q0;
        if (!this.P0) {
            tj00Var.h.n();
        }
        iac0 iac0Var = this.d;
        c921.y(cto1.q(iac0Var), (o8n) null, 0, new mx(this, (lnm) null, (byte) 20), 3);
        c921.y(cto1.q(iac0Var), (o8n) null, 0, new ett(this, (lnm) null, (byte) 26), 3);
        this.h.e(this.T0, this.i);
        w6d1.h(t5p1.j(tj00Var.X.b(), 3)).f(iac0Var, new xjr(this, (byte) 2));
        w6d1.h(w6d1.q(kdn0Var, new sty(this))).f(iac0Var, new z11(this, (byte) 15));
        kdn0Var.f(iac0Var, new dl00(this));
    }

    @Override // p.f4h1
    public final void stop() {
        this.h.t();
        this.c.h.a();
    }
}
