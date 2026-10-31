package p;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s2u extends jch0 {
    public final /* synthetic */ uf30 d;
    public final /* synthetic */ t2u e;

    public s2u(t2u t2uVar, uf30 uf30Var) {
        this.e = t2uVar;
        this.d = uf30Var;
    }

    public final View N(int i) {
        uf30 uf30Var = this.d;
        if (uf30Var.O()) {
            return uf30Var.N(i);
        }
        Dialog dialog = this.e.Q1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    public final boolean O() {
        return this.d.O() || this.e.U1;
    }
}
