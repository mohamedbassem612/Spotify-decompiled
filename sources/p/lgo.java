package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lgo implements p4h1 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public lgo(lcb0 lcb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b = lcb0Var;
        View viewInflate = layoutInflater.inflate(2131625128, viewGroup, false);
        this.c = viewInflate;
        lcb0Var.y(2);
        RecyclerView recyclerViewN = b8k1.n(viewInflate, 2131430614);
        recyclerViewN.getContext();
        recyclerViewN.setLayoutManager(new LinearLayoutManager(1));
        recyclerViewN.setAdapter(lcb0Var);
        recyclerViewN.setHasFixedSize(true);
        recyclerViewN.setAccessibilityDelegate(new vwd((byte) 3));
        rwq0.s(recyclerViewN, j830.V0);
    }

    @Override // p.p4h1
    public final View a() {
        switch (this.a) {
            case 0:
                return ((w470) this.b).e();
            default:
                return (View) this.c;
        }
    }

    public lgo(w470 w470Var, ie70 ie70Var) {
        this.b = w470Var;
        this.c = ie70Var;
    }
}
