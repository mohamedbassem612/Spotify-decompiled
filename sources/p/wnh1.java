package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class wnh1 extends uba implements b2r0 {
    public final n6r0 P0;
    public boolean Q0;

    public wnh1(n6r0 n6r0Var, qir0 qir0Var, nar0 nar0Var, z6r0 z6r0Var, k8h1 k8h1Var, n6h1 n6h1Var, yqg yqgVar, r6r0 r6r0Var, Set set, tar0 tar0Var, g6h1 g6h1Var, boolean z, u8h1 u8h1Var) {
        super(n6r0Var, qir0Var, nar0Var, z6r0Var, k8h1Var, n6h1Var, yqgVar, r6r0Var, set, tar0Var, g6h1Var, z, u8h1Var);
        this.P0 = n6r0Var;
    }

    public static void H(wnh1 wnh1Var) {
        wnh1Var.Q0 = false;
        wnh1Var.v(false);
    }

    public final void F() {
        this.Q0 = false;
        int i = this.t;
        if (i == 3) {
            return;
        }
        if (i == 4 && !this.Y.c.equals(this.N0)) {
            tba tbaVar = this.Y;
            C(tbaVar.a, tbaVar.b, tbaVar.d);
        }
        t();
        this.t = 3;
    }

    public final void G() {
        this.Q0 = false;
        u();
    }

    public Bundle I() {
        if (!this.Q0) {
            return null;
        }
        this.Q0 = false;
        return z();
    }
}
