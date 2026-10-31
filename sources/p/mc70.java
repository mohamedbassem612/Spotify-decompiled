package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mc70 extends o470 {
    public final gw70 a;
    public final kcg b;
    public final boolean c;

    public mc70(gw70 gw70Var, kcg kcgVar, boolean z) {
        this.a = gw70Var;
        this.b = kcgVar;
        this.c = z;
    }

    @Override // p.m570
    public final l570 f(ViewGroup viewGroup, l670 l670Var) {
        return new lc70(viewGroup, l670Var, this.a, this.b, this.c);
    }
}
