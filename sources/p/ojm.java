package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojm implements mjm {
    public final /* synthetic */ lzn0 a;

    public ojm(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final void a(String str, tv80 tv80Var, Bundle bundle) {
        lzn0 lzn0Var = this.a;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, bundle);
        } else if (bundle != null) {
            lzn0Var.g(bundle, str);
        } else {
            lzn0Var.h(str);
        }
    }
}
