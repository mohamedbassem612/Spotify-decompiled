package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cc70 extends ec70 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc70(Class cls, byte b) {
        super(cls);
        this.d = b;
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.d) {
            case 0:
                boolean z = l670Var.k;
                View viewInflate = LayoutInflater.from(context).inflate(2131625045, viewGroup, false);
                bh51 bh51Var = new bh51(viewInflate, z);
                viewInflate.setTag(2131429011, bh51Var);
                return bh51Var;
            default:
                boolean z2 = l670Var.k;
                View viewInflate2 = LayoutInflater.from(context).inflate(2131625047, viewGroup, false);
                bh51 bh51Var2 = new bh51(viewInflate2, z2);
                viewInflate2.setTag(2131429011, bh51Var2);
                return bh51Var2;
        }
    }
}
