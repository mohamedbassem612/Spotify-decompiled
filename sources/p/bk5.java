package p;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class bk5 extends t2u {
    @Override // p.t2u
    public Dialog c1(Bundle bundle) {
        return new ak5(h0(), b1());
    }

    @Override // p.t2u
    public final void f1(Dialog dialog, int i) {
        if (!(dialog instanceof ak5)) {
            super.f1(dialog, i);
            return;
        }
        ak5 ak5Var = (ak5) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        ak5Var.d().g(1);
    }
}
