package p;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class dwb extends bk5 {
    @Override // p.t2u
    public final void Y0() {
        Dialog dialogA1 = a1();
        if (dialogA1 instanceof cwb) {
            ((cwb) dialogA1).g().getClass();
        }
        super.Y0();
    }

    @Override // p.bk5, p.t2u
    public Dialog c1(Bundle bundle) {
        return new cwb(h0(), b1());
    }

    @Override // p.t2u
    public final void dismiss() {
        Dialog dialogA1 = a1();
        if (dialogA1 instanceof cwb) {
            ((cwb) dialogA1).g().getClass();
        }
        Z0(false, false);
    }
}
