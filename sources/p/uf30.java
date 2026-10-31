package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uf30 extends jch0 {
    public final /* synthetic */ zf30 d;

    public uf30(zf30 zf30Var) {
        this.d = zf30Var;
    }

    public final View N(int i) {
        zf30 zf30Var = this.d;
        View view = zf30Var.j1;
        if (view != null) {
            return view.findViewById(i);
        }
        eg.m(gvg.i("Fragment ", zf30Var, " does not have a view"));
        return null;
    }

    public final boolean O() {
        return this.d.j1 != null;
    }
}
