package p;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gpn extends t2u {
    public final mtx0 V1;

    public gpn(mtx0 mtx0Var) {
        this.V1 = mtx0Var;
    }

    public final Dialog c1(Bundle bundle) {
        uh3 uh3Var = new uh3(P0());
        qh3 qh3Var = uh3Var.a;
        qh3Var.d = qh3Var.a.getText(2131955716);
        qh3Var.f = qh3Var.a.getText(2131954670);
        return uh3Var.setNegativeButton(2131953433, new fpn(this, (byte) 0)).setPositiveButton(2131963433, new fpn(this, (byte) 1)).create();
    }
}
