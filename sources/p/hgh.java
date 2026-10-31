package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class hgh extends w611 {
    public final View U0;
    public final tka0 V0;

    public hgh(View view, tka0 tka0Var) {
        super(view);
        this.U0 = view;
        this.V0 = tka0Var;
    }

    public final void E(pkh pkhVar, int i, boolean z, String str, qka qkaVar) {
        this.U0.setTag(2131428138, pkhVar.a);
        cwl1.l(this.V0, pkhVar);
        G(pkhVar, i, z, str);
        F(pkhVar, i, qkaVar);
    }

    public abstract void F(pkh pkhVar, int i, qka qkaVar);

    public abstract void G(pkh pkhVar, int i, boolean z, String str);
}
