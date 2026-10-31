package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dc70 extends ec70 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc70(byte b) {
        super(ih51.class);
        this.d = b;
    }

    @Override // p.ec70, p.f770
    public final void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        ih51 ih51Var = (ih51) nx40Var;
        f(ih51Var, y570Var, l670Var, yfuVar);
        ih51Var.f.setText(((id70) y570Var.n()).a.d);
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.d) {
            case 0:
                boolean z = l670Var.k;
                View viewInflate = LayoutInflater.from(context).inflate(2131625046, viewGroup, false);
                ih51 ih51Var = new ih51(viewInflate, z);
                viewInflate.setTag(2131429011, ih51Var);
                return ih51Var;
            default:
                boolean z2 = l670Var.k;
                View viewInflate2 = LayoutInflater.from(context).inflate(2131625048, viewGroup, false);
                ih51 ih51Var2 = new ih51(viewInflate2, z2);
                viewInflate2.setTag(2131429011, ih51Var2);
                return ih51Var2;
        }
    }
}
