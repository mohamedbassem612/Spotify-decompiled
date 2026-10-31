package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ox11 implements f4h1 {
    public final LinearLayout a;
    public final iac0 b;
    public final vw11 c;
    public final RecyclerView d;
    public final p1d0 e;
    public final Parcelable f;
    public boolean g;
    public boolean h;
    public final idd1 i;
    public final idd1 t;

    public ox11(LinearLayout linearLayout, iac0 iac0Var, vw11 vw11Var, Bundle bundle, znq znqVar, hoc hocVar, khc khcVar) {
        this.a = linearLayout;
        this.b = iac0Var;
        this.c = vw11Var;
        RecyclerView recyclerViewFindViewById = linearLayout.findViewById(2131430614);
        this.d = recyclerViewFindViewById;
        this.g = true;
        this.i = new idd1(new zkz0(znqVar, this, (byte) 25));
        this.t = new idd1(new vwz0(this, (byte) 21));
        hocVar.b(linearLayout);
        recyclerViewFindViewById.setHasFixedSize(true);
        rwq0.s(recyclerViewFindViewById, new lw11(this, (byte) 2));
        recyclerViewFindViewById.setClipToPadding(false);
        LinkedHashMap linkedHashMap = vw11Var.T0;
        if (linkedHashMap == null) {
            u890.C("elementFactories");
            throw null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (laa) ((vu30) entry.getValue()).invoke(this.c.k().getMetadata(), this.b));
        }
        p1d0 p1d0VarF = khc.f(khcVar, linkedHashMap2, (Map) null, new v6a(1, this.c, vw11.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 8), 14);
        this.e = p1d0VarF;
        RecyclerView recyclerView = this.d;
        iac0 iac0Var2 = this.b;
        recyclerView.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.x1(1);
        p1d0VarF.a(recyclerView, iac0Var2, linearLayoutManager, false);
        this.f = bundle != null ? bundle.getParcelable("view_state") : null;
    }

    public final Object getView() {
        return this.a;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        a layoutManager = this.d.getLayoutManager();
        bundle.putParcelable("view_state", layoutManager != null ? layoutManager.x0() : null);
        return bundle;
    }

    public final void start() {
        vw11 vw11Var = this.c;
        y8n y8nVarJ = t5p1.j(vw11Var.k().b(), 3);
        nx11 nx11Var = new nx11(this, (byte) 0);
        iac0 iac0Var = this.b;
        y8nVarJ.f(iac0Var, nx11Var);
        vw11Var.X.f(iac0Var, new nx11(this, (byte) 1));
    }

    public final void stop() {
    }
}
