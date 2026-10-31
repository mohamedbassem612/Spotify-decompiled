package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0r0 implements o5s {
    public final /* synthetic */ p410 a;

    public y0r0(p410 p410Var) {
        this.a = p410Var;
    }

    public final void onCreate(iac0 iac0Var) {
        p410 p410Var = this.a;
        Bundle bundleA = p410.h(p410Var).a("nav_system_state");
        if (bundleA != null) {
            p410.k(p410Var, bundleA);
        }
    }
}
